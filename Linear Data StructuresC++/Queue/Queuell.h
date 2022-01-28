template <typename T>
class Node{
    public :
    T data;
    Node<T> *next;

    Node(T data){
        this -> data = data;
        next = NULL;
    }
};

template <typename T>
class Queuell {
    Node<T> *head;
    Node<T> *tail;
    int size;

    public :
    Queuell(){
        head = NULL;
        tail = NULL;
        size = 0;
    }

    int getSize(){
        return size;
    }

    bool isEmpty(){
        return size == 0;
    }

    void enqueue(T userdata){
        Node<T> *newnode = new Node<T>(userdata);

        if(head == NULL){
            head = newnode;
            tail = newnode;
        }
        else{
            tail -> next = newnode;
            tail = newnode;
        }
        size++;
    }

    T front(){
        if(head == NULL){
            return 0;
        }
        return head -> data;
    }

    T dequeue(){
        if(head == NULL){
            return 0;
        }
        T ans = head -> data;
        Node<T> *temp = head;
        head = head -> next;
        delete temp;
        size--;
        return ans;
    }
};
