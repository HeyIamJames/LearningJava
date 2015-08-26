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
