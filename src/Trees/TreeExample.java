package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rickx058 on 12/17/15.
 */
public class TreeExample {

    public TreeNode root = null;

    public TreeExample(TreeNode root){
        this.root = root;
    }

    public void traverseDFS(){
        traverseDFSRecursive(root,0);
    }

    private void traverseDFSRecursive(TreeNode cur, int level){
        if(cur!=null){
            String tabs = "";
            for(int i=0; i<level; i++){
                tabs+="\t";
            }
            System.out.println(tabs+cur.getName());
            for(TreeNode node: cur.getChildren()){
                traverseDFSRecursive(node,level+1);
            }
        }
    }

    public void traverseBFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.println(root.getName());
        while(queue.size()!=0){
            TreeNode pulled = queue.poll();
            for (TreeNode n : pulled.getChildren()){
                System.out.println(n.getName());
                queue.add(n);
            }


        }

    }
}
