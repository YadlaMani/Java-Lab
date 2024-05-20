import java.util.*;
class BST{
    int val;
    BST left;
    BST right;
    BST(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
class BSTImp{
    BST root;
    BSTImp(){
        root=null;
    }
    void insert(int val){
        this.root=insertRec(this.root,val);
    }
    private BST insertRec(BST root,int val){
        if(root==null){
            return new BST(val);
        }
        if(root.val>val){
            root.left=insertRec(root.left,val);
        }
        else{
            root.right=insertRec(root.right,val);
        }
        return root;
    }
    public void inorder(BST root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }
    public void preorder(BST root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(BST root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
}
public class BSTDriver {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BSTImp bst=new BSTImp();
        System.out.println("1.Insert 2.Inorder 3.Preorder 4.Postorder");
        while(true){
            System.out.println("Enter choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter the element to insert:");
                        bst.insert(sc.nextInt());break;
                case 2: System.out.println("Inorder:");
                        bst.inorder(bst.root);break;
                case 3: System.out.println("Preorder:");
                        bst.preorder(bst.root);break;
                case 4: System.out.println("Postorder:");
                        bst.postorder(bst.root);break;
            }
        }
    }
}
