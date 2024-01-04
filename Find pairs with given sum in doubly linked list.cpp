/**
 * Definition of doubly linked list:
 * class Node {
 * public:
 *      int data;
 *      Node *prev;
 *      Node *next;
 *      Node() {
 *          this->data = 0;
 *          this->prev = NULL;
 *          this->next = NULL;
 *      }
 *      Node(int data) {
 *          this->data = data;
 *          this->prev = NULL;
 *          this->next = NULL;
 *      }
 *      Node (int data, Node *next, Node *prev) {
 *          this -> data = data;
 *          this -> prev = prev;
 *          this -> next = next;
 *      }
 * };
 *
 *************************************************************************/

vector<pair<int, int>> findPairs(Node* head, int k)
{
      vector<pair<int,int>>ans;

    Node* first = head;

    while(head->next)

    {

        head = head->next;

    }

    Node *last = head;

    head = first;

    while(first->data< last->data)

    {

        if(first->data+last->data > k)

        {

            last = last -> prev;

        }

        else if(first->data + last->data < k)

        {

            first = first -> next;

        }

        else{

            ans.push_back({first->data,last->data});

            last = last -> prev;

            first = first -> next;

        }

    }

    return ans;

}
