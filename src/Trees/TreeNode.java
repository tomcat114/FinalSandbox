package Trees;

import java.util.LinkedList;

/**
 * Created by rickx058 on 12/17/15.
 */
public class TreeNode {

    public String name = "";
    public LinkedList<TreeNode> children = new LinkedList<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }

    public LinkedList<TreeNode> getChildren(){
        return children;
    }

    public void addChild(TreeNode newNode){
        children.add(newNode);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}
