class Basic {

   //Find node in the tree

   public TreeNode findNodeOfVal(TreeNode root, int x){
       
       if(root==null) return null;

       if(root.val == x) return root;

       TreeNode ls = findNodeOfVal(root.left, int x);
       if(ls != null)
        return ls;
      
       return findNodeOfVal(root.right,int x);

   }

   //Find level of x  
   //using dfs, this can solved via bfs too, just keep adding to qu, when u encouter 
   //1.by dfs
   int lev = 0;

   public int findLevelOfVal(TreeNode root, int x, int lev){

    if(root==null) return -1;

    if(root.val == x) return lev;

    int ls = findLevelOfVal(root.left, x, lev+1);
    if(ls!=-1)
     return ls;

   return findLevelOfVal(root.right,x,lev+1);

   }

   //2.by bfs

   public int findLevelOfValByBFS(TreeNode root, int x){
    if(root==null) return -1;

    Queue<TreeNode> qu = new LinkedList<>();

    qu.add(root);
    int lev =-1;

    while(!qu.isEmpty()){

       int len = qu.size();
       lev++;
       for(int i=0;i<len;i++){
        TreeNode nd = qu.remove();
        if(nd.val==x) return lev;

        if(nd.left!=null) qu.add(nd.left);
        if(nd.right!=null) qu.add(nd.right);
       }
         
    }

    return -1;
   }








}