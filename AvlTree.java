class Node{
    int data;
    int height;
    Node left,right;
    Node(int data){
        this.data=data;
        this.height=1;
    }

}
class AvlTree{
    Node root;
    int height(Node n){
        if(n==null){
            return 0;
        }
        return n.height;
    }
    int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
    int getBalance(Node n){
        if(n==null){
            return 0;
        }
        return height(n.left)-height(n.right);
    }
    Node rightRotate(Node y){
        
        Node x=y.left;
        Node T2=x.right;
        x.right=y;
        y.left=T2;
        y.height=max(height(y.left),height(y.right))+1;
        x.height=max(height(x.left),height(x.right))+1;
        return x;
    }
    Node leftRotate(Node x){
        Node y=x.right;
        Node T2=y.left;
        y.left=x;
        x.right=T2;
        y.height=max(height(y.left),height(y.right))+1;
        x.height=max(height(x.left),height(x.right))+1;
        return y;

    }
    Node insert(Node node,int key){
        if(node==null){
            return new Node(key);
        }
        if(key<node.data){
            node.left=insert(node.left,key);

            
        }
        else if(key>node.data){
            node.right=insert(node.right,key);
        }
        else{
            return node;
        }
        node.height=max(height(node.left),height(node.right));
        int balance=getBalance(node);
        if(balance>1&&key<node.left.data){
            System.out.println("left left case");
            return rightRotate(node);
        }
        if(balance>1&&key>node.right.data){
            System.out.println("Left right case");
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }
        if(balance<-1&&key>node.right.data){
            System.out.println("Right right case");
            return leftRotate(node);
        }
        if(balance<-1&&key<node.left.data){
            System.out.println("Right left case");
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }
        return node;

    }
    Node minValueNode(Node node){
        Node current=node;
        while(current.left!=null){
            current=current.left;
        }
        return current;
    }
    Node deleteNode(Node root, int key){
        if (root == null)
        return root;
        if (key < root.data)
	            root.left = deleteNode(root.left, key);
        else if (key > root.data)
	            root.right = deleteNode(root.right, key);
        else{
            if ((root.left == null) || (root.right == null))
            {
                Node temp = null;
                if (temp == root.left)
                temp = root.right;
                else
                temp = root.left;
                if (temp == null)
                {
                temp = root;
                root = null;
                }
                else 
                root = temp;
            } 
            else
            {
            Node temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
            }
           
        }
        if (root == null)
        return root;
        root.height = max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);
        if (balance > 1 && getBalance(root.left) >= 0)
	            return rightRotate(root);
                if (balance > 1 && getBalance(root.left) < 0)
                {
                    root.left = leftRotate(root.left);
                    return rightRotate(root);
                }
                if (balance < -1 && getBalance(root.right) <= 0)
	            return leftRotate(root);
                if (balance < -1 && getBalance(root.right) > 0)
	        {
	            root.right = rightRotate(root.right);
	            return leftRotate(root);
	        }
	        
	        return root;
        }
        void preOrder(Node node) {
	        if (node != null) {
	            System.out.print(node.data + " ");
	            preOrder(node.left);
	            preOrder(node.right);
	        }
	    }
        public static void main(String[] args) {
	        AvlTree tree = new AvlTree();
	 
	        
	        tree.root = tree.insert(tree.root, 10);
	        tree.root = tree.insert(tree.root, 20);
	        tree.root = tree.insert(tree.root, 30);
	        tree.root = tree.insert(tree.root, 40);
	        tree.root = tree.insert(tree.root, 50);
	        System.out.println("Root "+tree.root.data);
	        tree.root = tree.insert(tree.root, 25);
	        
	        System.out.println("Preorder traversal" +
	                        " of constructed tree is : ");
	        tree.preOrder(tree.root);
	    }

        


    }



	    


