import java.util.ArrayList;

class Topic {
    private ArrayList<Pass> prioritySeats;
    private ArrayList<Pass> normalSeats;

    // Iniciar a topic solicitando a lotação máxima e a quantidade de cadeiras
    // preferenciais.
    // prioritySeats = qtdPriority;
    // normalSeats = capacity - qtdPriority;
    public Topic(int capacity, int qtdPriority) {
        this.prioritySeats = new ArrayList<Pass>(); // prioritySeats = qtdPriority;
        this.normalSeats = new ArrayList<Pass>(); // normalSeats = capacity - qtdPriority;
        for (int i = 0; i < qtdPriority; i++) {
            this.prioritySeats.add(null);
        }
        for (int i = 0; i < capacity - qtdPriority; i++) {
            this.normalSeats.add(null);
        }
    }

    // return the first free pos or -1
    // [@davi:17 @pedro:10]
    // [@davi:17 @]
    // 5 0
    private int findFirstFreePos(ArrayList<Pass> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                return i;
            }            
        }
        return -1;
    }

    // search in list using name and return position or return -1
    private int findByName(String name, ArrayList<Pass> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    // use the findFirstFreePos to search a free position
    // if exists, insert the pass and return true
    // else return false
    private boolean insertOnList(Pass pass, ArrayList<Pass> list) {
        if (findFirstFreePos(list) != -1) {
            list.set(findFirstFreePos(list), pass);
            return true;
        } else {
            return false;
        }
    }

    // use the findByName method to locate pos in list, if found, remove the person
    // setting the pos location to null
    private boolean removeFromList(String name, ArrayList<Pass> list) {
        if (findByName(name, list) != -1) {
            list.set(findByName(name, list), null);
            return true;
        } else {
            return false;
        }
    }

    // use findByName to test if the pass is already in the topic
    // use the insertOnList method to insert in the right list based in
    // the pass.isPriority result
    public boolean insert(Pass pass) {
        if (findByName(pass.getName(), this.prioritySeats) != -1
                || findByName(pass.getName(), this.normalSeats) != -1) {
            System.out.println("fail: pass ja esta na topic");
            return false;
        } else {
            if (pass.isPriority()) {
                if (findFirstFreePos(this.prioritySeats) == -1
                        && findFirstFreePos(this.normalSeats) != -1) {
                    insertOnList(pass, this.normalSeats);
                } else if (findFirstFreePos(this.prioritySeats) == -1
                        && findFirstFreePos(this.normalSeats) == -1) {
                    System.out.println("fail: topic lotada");
                    return false;
                } else {
                    insertOnList(pass, this.prioritySeats);
                }
            } else {
                if (findFirstFreePos(this.normalSeats) == -1
                        && findFirstFreePos(this.prioritySeats) != -1) {
                    insertOnList(pass, this.prioritySeats);
                } else if (findFirstFreePos(this.prioritySeats) == -1
                        && findFirstFreePos(this.normalSeats) == -1) {
                    System.out.println("fail: topic lotada");
                    return false;
                } else {
                    insertOnList(pass, this.normalSeats);
                }
            }
            return true;
        }
    }

    // use the removeFromList method to try to remove from both lists
    public boolean remove(String name) {
        if (findByName(name, this.prioritySeats) == -1
                && findByName(name, this.normalSeats) == -1) {
            System.out.println("fail: pass nao esta na topic");
            return false;
        } else {
            removeFromList(name, this.prioritySeats);
            removeFromList(name, this.normalSeats);
            return true;
        }
    }

    // capacity = 5; qtdPriority = 5
    // prioritySeats = 5; normalSeats = 0;
    // [@ @ @ @ @ = = =]
    // [prioritySeats e normalSeats]

    @Override
    public String toString() {
        String resultado = "[";
        for (int i = 0; i < this.prioritySeats.size(); i++) {
            if (this.prioritySeats.get(i) == null && i != this.prioritySeats.size() - 1) {
                resultado += "@ ";
            } else if (i != this.prioritySeats.size() - 1) {
                resultado += "@" + this.prioritySeats.get(i) + " ";
            } else {
                if (this.prioritySeats.get(i) == null) {
                    if (this.normalSeats.size() == 0)
                        resultado += "@";
                    else
                        resultado += "@ ";
                } else {
                    if (this.normalSeats.size() == 0)
                        resultado += "@" + this.prioritySeats.get(i);
                    else
                        resultado += "@" + this.prioritySeats.get(i) + " ";
                }
            }
        }
        for (int i = 0; i < this.normalSeats.size(); i++) {
            if (this.normalSeats.get(i) == null && i != this.normalSeats.size() - 1) {
                resultado += "= ";
            } else if (i != this.normalSeats.size() - 1) {
                resultado += "=" + this.normalSeats.get(i) + " ";
            } else {
                if (this.normalSeats.get(i) == null) {
                    resultado += "=";
                } else {
                    resultado += "=" + this.normalSeats.get(i);
                }
            }
        }
        resultado += "]";
        return resultado;
    }
}