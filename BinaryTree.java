import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;


    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data){
            this.data =data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(8);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);



        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;
    }
     //preorder traversal
  /*  public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

   */

    public void preOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }

    }
/*    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

 */
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null){
            if(temp != null){
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
                
            }
        }
    }
   /* public void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    */

      public void postOrder(){
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();

        while (current != null || !stack.isEmpty()){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else {
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data +" ");
                    while (!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data +" ");
                    }
                }else {
                    current = temp;
                }
            }
        }
      }
      public  void levelOrder(){
          if(root == null){
              return;
          }
          Queue<TreeNode> queue = new LinkedList<>();
          queue.offer(root);
          while (!queue.isEmpty()) {
              TreeNode temp = queue.poll();
              System.out.print(temp.data +" ");
              if (temp.left != null){
                  queue.offer(temp.left);
              }
              if (temp.right != null){
                  queue.offer(temp.right);
              }
          }
      }
      public int findMax(){
          return findMax(root);
      }
     public  int findMax(TreeNode root){
          if (root == null){
              return Integer.MAX_VALUE;
          }
          int result = root.data;
          int left = findMax(root.left);
          int right = findMax(root.right);
          if (left > result){
              result = left;
          }
          if (right > result) {
              result = right;
          }
          return result;
     }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
       // binaryTree.createBinaryTree();
       // binaryTree.preOrder();

        // binaryTree.createBinaryTree();
       // binaryTree.inOrder(binaryTree.root);
       // binaryTree.createBinaryTree();
       // binaryTree.inOrder(binaryTree.root);
       // binaryTree.createBinaryTree();
      //  binaryTree.postOrder(binaryTree.root);
       // binaryTree.postOrder();
      //  binaryTree.createBinaryTree();
      //  binaryTree.levelOrder();
        binaryTree.createBinaryTree();
        System.out.println(binaryTree.findMax());




    }
}

