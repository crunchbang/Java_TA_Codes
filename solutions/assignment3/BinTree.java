/**
 *
 * @author singhShubh
 */
 
public class BinTree {
    int value;
    BinTree left;
    BinTree right;
    
    public BinTree(int value){
        this.value = value;
        left = null;
        right = null;
    }
    public void setLeftTree(BinTree left){
        this.left = left;
    }
    public void setRightTree(BinTree right){
        this.right = right;
    }
    public boolean search(int num){
        if(value == num)
            return true;
        else{
            boolean leftResult = false,rightResult = false;
            if(left!=null)
                leftResult = left.search(num);
            if(this.right!=null)
                rightResult = this.right.search(num);
            return leftResult | rightResult;
        }
    }
    // Driver function to check your code.
    public static void main(String ...s){
        BinTree tree= new BinTree(5);
        tree.setLeftTree(new BinTree(10));
        tree.setRightTree(new BinTree(12));
        tree.left.setLeftTree(new BinTree(18));
        tree.left.setRightTree(new BinTree(15));
        tree.left.left.setLeftTree(new BinTree(16));
        tree.left.right.setRightTree(new BinTree(22));
        tree.right.setLeftTree(new BinTree(40));
        
        System.out.println(tree.search(35));
        System.out.println(tree.search(40));
        System.out.println(tree.search(15));
    }
}
