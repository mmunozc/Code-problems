package labs;

public class KeyBoard{
    public void brokenKeyBoard(Node head, Node finalNode, char a[]){
        Node flag = head; 
        for(int i = 0; i<a.length; i++){

            if(a[i] == '['){
                flag = head;
                continue;
            }else if(a[i] == ']'){
                flag = finalNode;
                continue;
            }

            if(flag.next == null){
                flag.next = new Node(a[i]);
                flag = flag.next;
                finalNode = flag;
            }else{
                Node auxNode = new Node(a[i]);
                flag.next = auxNode;
                flag = auxNode;
            }
        }
    }
}