class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        dfs(root, 0);
        return result;
    }
    private void dfs(TreeNode node, int level) {
        if (node == null) 
        return;

        if (result.size() == level) {
            result.add(new LinkedList<>());
        }
        LinkedList<Integer> levelList = (LinkedList<Integer>) result.get(level);

        if (level % 2 == 0) {
            levelList.addLast(node.val);   
        } 
        else {
            levelList.addFirst(node.val);  
        }
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}
