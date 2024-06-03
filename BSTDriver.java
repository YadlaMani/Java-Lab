//
import java.util.*;
class BST<T extends Comparable<T>>{
    T data;
    BST left;
    BST right;
    BST(T data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    
}
class BSTImp<T extends Comparable<T>>{
    BST root;
    BSTImp(){
        root=null;
    }
    void insert(T data){
        root = Insert(root, data);
    }

    private BST Insert(BST root, T data){
        if(root == null){
            return new BST(data);
        }
        else if((root.data).compareTo(data) >= 0){
            root.left = Insert(root.left, data);
        }
        else{
            root.right = Insert(root.right, data);
        }
        return root; // Add this line to fix the issue of missing return statement
    }
    void delete(T data){
        root=Delete(root,data);
    }
    private BST Delete(BST root,T data){
        if(root==null){
            return null;

        }
        if(root.data.compareTo(data)<0){
            root.right=Delete(root.right,data);
        }
        else if(root.data.compareTo(data)>0){
            root.left=Delete(root.left,data);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            root.data=minValue(root.right);
            root.right=Delete(root.right, (T) root.data);

        }
        return root;

        
    }
    
    T minValue(BST root){
        if(root.left==null){
            return (T) root.data;
        }
        else{
            return minValue(root.left);
        }
    }
    void inorder(BST root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    void postorder(BST root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+" ");
    }
    void preorder(BST root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void search(T data){
        BST temp=root;
        while(temp!=null){
            if(root.data.compareTo(temp.data)==0){
                System.out.println("Found");
                return;
            }
            else{
                if(root.data.compareTo(temp.data)<0){
                    temp=temp.left;
                }
                else{
                    temp=temp.right;
                }
            }
        }
        System.out.println("Not found");
        return;
    }
    

}
public class BSTDriver {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BSTImp<Integer> bst=new BSTImp<>();
        System.out.println("1.Insert 3.Delete 2.Inorder 3.Preorder 4.Postorder");
        while(true){
            System.out.println("Enter choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter the element to insert:");
                        bst.insert(sc.nextInt());break;
                case 2: System.out.println("Enter the element to delete:");
                        bst.delete(sc.nextInt());break;
                case 3:System.out.println("Inorder:");
                bst.inorder(bst.root);break;
                case 4: System.out.println("Preorder:");
                        bst.preorder(bst.root);break;
                case 5: System.out.println("Postorder:");
                        bst.postorder(bst.root);break;
                case 6:System.out.println("Enter the element to search:");
                bst.search(sc.nextInt());break;
                default:System.exit(0);
            }
        }
    }
}
