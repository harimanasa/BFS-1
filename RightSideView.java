Link: https://leetcode.com/problems/binary-tree-right-side-view
Run on LeetCode: Yes
No issues found.

1) Using DFS (Node-> Right-> Left)
Time complexity: O(N)
Space complexity: O(H)


class Solution {
    List<Integer> result;
    public List<Integer> rightSideView(TreeNode root) {
        result = new ArrayList<>();
        //validation
        if(root==null) return result;
        //logic
        dfs(root, 0);
        return result;
    }
    void dfs(TreeNode root, int level){
        if(level==result.size()){
            result.add(root.val);
        }
        if(root.right!=null){
            dfs(root.right, level+1);
        } if(root.left!=null){
            dfs(root.left, level+1);
        }
    }
}

2) Using DFS (Node-> Left-> Right)
Time complexity: O(N)
Space complexity: O(H)

class Solution {
    List<Integer> result;
    public List<Integer> rightSideView(TreeNode root) {
        result = new ArrayList<>();
        //validation
        if(root==null) return result;
        //logic
        dfs(root, 0);
        return result;
    }
    void dfs(TreeNode root, int level){
        if(level==result.size()){
            result.add(root.val);
        }else{
            result.set(level, root.val);
        }
        if(root.left!=null){
            dfs(root.left, level+1);
        } if(root.right!=null){
            dfs(root.right, level+1);
        }
    }
}
