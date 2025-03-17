class BFS {
    //main logic is level wise add itm then loop quSize, to pop and add there child....so in this way we will add level wise
    //and remove level wise(means in same go)
  
  //102. Binary Tree Level Order Traversal
  public List<List<Integer>> levelOrder(TreeNode root) {
        //main logic is level wise add itm then loop quSize, to pop and add there child....so in this way we will add level wise
        //and remove level wise(means in same go)
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null)
         return ans;

        qu.add(root);

        while(!qu.isEmpty()){
            int quSize = qu.size();
            List<Integer> currList = new ArrayList<>();
           for(int i=0;i<quSize;i++){              //for loop for adding elements
            TreeNode nd = qu.remove();
            if(nd.left!=null) qu.add(nd.left);
            if(nd.right!=null) qu.add(nd.right);
                
            currList.add(nd.val);
           }

           ans.add(currList);

        }
      return ans;

        
    }


  //----------------------------------------------------------------------------------------------------
  // 637. Average of Levels in Binary Tree
  public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        Queue<TreeNode> qu = new LinkedList<>();

        qu.add(root);

        while(!qu.isEmpty()){

            int levelSize = qu.size();
            double avg = 0;

            for(int i=0;i<levelSize;i++){
                TreeNode nd = qu.remove();
                avg+=nd.val;

                if(nd.left!=null) qu.add(nd.left);
                if(nd.right!=null) qu.add(nd.right);


            }
            avg = avg/levelSize;
            ans.add(avg);
        }

        return ans;
        
    }

  //-----------------------------------------------------------------------------------------------
  //Level Order Successor : Get next element on adding level order

  //logic : add element in Q, at the end, once u find key (to search), break and top element of Q is answer
  // no need for loop, we level size doesn't matter

  public TreeNode levelOrderSucessor(TreeNode root,int key) {

        if(root == null)
         return null;

        Queue<TreeNode> qu = new LinkedList<>();

        qu.add(root);

        while(!qu.isEmpty()){
         
            TreeNode nd = qu.remove();
            if(nd.left!=null) qu.add(nd.left);
            if(nd.right!=null) qu.add(nd.right);
                
            if(nd.val==key)
              break;

        }
      return qu.peek();

 }

 //---------------------------------------------------------------------------------------------
 // 103. Binary Tree Zigzag Level Order Traversal
 //logic : level 1: add --->, level 2 : add <------, level 3 : add ------>
 //1: approach normal traversal, just add in reverse list, but inc time complexity for reverse o(n)
 //2: u can use Deque(mormal) remove from front, add in back; (reverse) : remove from back, add in front
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null)
         return ans;

        qu.add(root);
        boolean orderFlag = true;
        while(!qu.isEmpty()){
            int quSize = qu.size();
            List<Integer> currList = new ArrayList<>();
           for(int i=0;i<quSize;i++){              //for loop for adding elements
            TreeNode nd = qu.remove();
            if(nd.left!=null) qu.add(nd.left);
            if(nd.right!=null) qu.add(nd.right);
            currList.add(nd.val);
           }

           if(!orderFlag)
             Collections.reverse(currList);

          orderFlag = !orderFlag;
          ans.add(currList);   

        }
      return ans;
    }


//---------------------------------------------------------------------------
// 107. Binary Tree Level Order Traversal II
// return bottom up leevel
//logic : do bfs, just add the last
         level order with 
         ans.add(0,currList);

//-------------------------------------------------------------------------












}