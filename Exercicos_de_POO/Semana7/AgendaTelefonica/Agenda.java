import java.util.ArrayList;
import java.util.List;
 
//nao deu tempo de terminar tudo atilio

class Agenda {
    private List<Contact> contacts;

    public Agenda(){
        this.contacts = new ArrayList<Contact>();
    }

    //retorna a posição do contato com esse nome no vetor ou -1 se não existir.
    private int findPosByName(String name){
        for(int i = 0 ; i < contacts.size() ; i++){
            if((name).equals(this.contacts.get(i).getName())){
                return i;
            }            
        }
        return (-1);
    }

    //retorna o objeto contato com esse nome ou null se não existir
    //utilize o método findPosByName
    public Contact findContact(String name){
        if(findPosByName(name) != -1){
            return this.contacts.get(findPosByName(name));
        }
        else{
            return null;
        }
    }
    //se nenhum contato existir com esse nome, adicione
    //se ja existir, faça o merge adicionando os telefones
    //por fim, ordene a lista para ficar em ordem alfabética
    public void addContact(Contact contact) {
        // O código para a ordenação da lista já está feito logo abaixo
        // esta é a última linha de código da função
        if(findContact(contact.getName()) == null){
            contacts.add(contact);
        }
        else{
            Contact found = null;
            for(int i = 0 ; i < this.contacts.size(); i++){
                if(this.contacts.get(i).getName().equals(contact.getName())){
                    found = this.contacts.get(i);
                }
            }
                if(found != null){
                    for(int i = 0 ;i < contact.getFones().size(); i++){
                        found.addFone(contact.getFones().get(i));
                    }
                }

            }

        
        this.contacts.sort((Contact c1, Contact c2) -> (c1.getName().compareTo(c2.getName())));
    }

    //Utilize o método findPosByName
    public void rmContact(String name){
        if(findContact(name) != null){
            this.contacts.remove(this.contacts.get(findPosByName(name)));
        }
    }

    //Monte uma lista auxiliar procurando no .toString() de cada contato
    //se ele possui a substring procurada.
    //dica: reveja os métodos da classe String e procure algum que ajude aqui
    public List<Contact> search(String pattern){

        List<Contact> aux = new ArrayList<Contact>();
        
        for(Contact contact : this.contacts)
            if(contact.getName().contains(pattern))            
            aux.add(contact);

        else{
        for(Fone aux2 : contact.getFones())
            if(aux2.getNumber().contains(pattern) || (aux2.getId().contains(pattern)))
            aux.add(contact);    
        }
        return aux;
    }

    public List<Contact> getContacts(){
        return this.contacts;
    }

    public String toString(){
        String name = "";
        for(int i = 0 ; i < contacts.size() ; i++){
            if(i == contacts.size() - 1){
                name += this.contacts.get(i);
            }
            else{
                name += this.contacts.get(i) + "\n";  
            }          
        }
        return(name);
    }
}



 