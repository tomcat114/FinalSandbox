package Trees;

/**
 * Created by rickx058 on 12/17/15.
 */
public class Main {
    
    public static void main(String args[]){
        //Used for Testing
        //LEVEL ROOT
        TreeNode root = new TreeNode("Programming Languages");
        //LEVEL 1
        TreeNode l1a = new TreeNode("Low-level programming languages");
        TreeNode l1b = new TreeNode("Functional Languages");
        TreeNode l1c = new TreeNode("Object-based programming languages");
        //LEVEL 2
        TreeNode l2a = new TreeNode("C (programming language)");
        TreeNode l2b = new TreeNode("TMG (language)");
        TreeNode l2c = new TreeNode("Haskell programming language family");
        TreeNode l2d = new TreeNode("Object-oriented programming languages");
        //LEVEL 3
        TreeNode l3a = new TreeNode("Agda (programming language)");
        TreeNode l3b = new TreeNode("Haskell software");
        TreeNode l3c = new TreeNode("Python");
        TreeNode l3d = new TreeNode("C++");
        TreeNode l3e = new TreeNode("Java");
        TreeNode l3f = new TreeNode("FORTRAN");
        //Level 4
        TreeNode l4a = new TreeNode("SQream DB");
        TreeNode l4b = new TreeNode("Snap (web framework)");
        //Level 1
        root.addChild(l1a);
        root.addChild(l1b);
        root.addChild(l1c);
        //Level 2
        l1a.addChild(l2a);
        l1a.addChild(l2b);
        l1b.addChild(l2c);
        l1c.addChild(l2d);
        //Level 3
        l2c.addChild(l3a);
        l2c.addChild(l3b);
        l2d.addChild(l3c);
        l2d.addChild(l3d);
        l2d.addChild(l3e);
        l2d.addChild(l3f);
        //Level 4
        l3b.addChild(l4a);
        l3b.addChild(l4b);

        TreeExample tree = new TreeExample(root);
        tree.traverseDFS();
        System.out.print("\n\n\n\n");
        tree.traverseBFS(root);


    }
}
