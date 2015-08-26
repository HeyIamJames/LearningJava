//recursive solution 

public void recursiveReverse(Node currentNode )
{  
 if(currentNode == NULL)
    return;
if(currentNode.next == NULL) 
{ 
head = currentNode; 
return;
}

recursiveReverse(currentNode.next);
currentNode.next.next = currentNode;
currentNode.next = null;
}

//another solution
Node reversedPart = null;
Node current = head;
while (current != null) {
    Node next = current.next;
    current.next = reversedPart;
    reversedPart = current;
    current = next;
}
head = reversedPart;
