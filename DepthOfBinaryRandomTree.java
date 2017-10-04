/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 *
 * @author prahata
 */
public class DepthOfBinaryRandomTree {
    static TreeNode root; 
    static List<DepthNode>resultnodes = new ArrayList<>();
    
   // static Map<Integer,List<DepthNode>>resultmap = new HashMap<>();
    
    
    static class TreeNode {
                 
          int item;    
          TreeNode left;    
          TreeNode right;   
          TreeNode(int x) {
             item = x;
          }
      } 
     
     
     static class DepthNode{
        int depth;
       
        public TreeNode node;
         
        public DepthNode(int depth, TreeNode node) {
            this.depth = depth;
            this.node = node;
        }
       
      }
     
     
     
    
    static void addNode(int val){
        
        if ( root == null ) {
                
             root = new TreeNode( val );
             return;
          }
        
          TreeNode node; 
          node = root;   
          while (true) {
             if (val < node.item ) {
                   
                if ( node.left == null ) {
                   node.left = new TreeNode( val );
                   return; 
                }
                else
                   node = node.left;
             }
             else {
                     
                if ( node.right == null ) {
                   node.right = new TreeNode( val );
                   return;  
                }
                else
                   node = node.right;
              }
          } 
    }
    static Map populateNodeDepth(List<DepthNode>resultnodes){
      Map<Integer,String>resultmap = new HashMap<>();
        
        for (int j=0;j<resultnodes.size();j++){
          if (resultnodes.get(j).node!=null){  
            if(resultmap.get(resultnodes.get(j).depth)!=null){
                
                String hasil =resultmap.get(resultnodes.get(j).depth)+","+resultnodes.get(j).node.item;
                resultmap.put(resultnodes.get(j).depth, hasil);
            }else {
                resultmap.put(resultnodes.get(j).depth, resultnodes.get(j).node.item+"");
            }
            
          }  
            
        }
        
        return resultmap;
    }
    
    static int setListNodeDepth( TreeNode node, int depth ) {
             
          if ( node == null ) {
                   
             return 0;
             
          }
          
          
          else if ( node.left == null && node.right == null) {
              
              
             return depth;
          }
          else {
             
             
             int leftdepth = setListNodeDepth(node.left, depth + 1);
             int rightdepth =  setListNodeDepth(node.right, depth + 1);
             int depthmax = leftdepth > rightdepth ?leftdepth :rightdepth;
             
             
             int depth_val =depth;
             
             
             DepthNode nodedepthleft= new DepthNode(depth_val+1,node.left);
             
             
             resultnodes.add(nodedepthleft); 
         
              DepthNode nodedepthright= new DepthNode(depth_val+1,node.right);
                
             resultnodes.add(nodedepthright); 
                
             return depthmax;
          }
      } 
    
    
      
      public static void main(String[] args) {
            
            
           root = null;  
           int datarandom []={47,24,36,19,21,29,46,92,100,83,71,17,14,10,49};
         
           for (int i = 0; i < datarandom.length; i++){
              addNode(datarandom [i]);
              
           }
         setListNodeDepth( root, 0 );
        
         Map MapSameDepthNode= populateNodeDepth(resultnodes);
         
         Iterator<Integer> itr2 = MapSameDepthNode.keySet().iterator();
            while (itr2.hasNext()) {
                Integer key = itr2.next();

                System.out.println("depth "+ key + " nodes :" + MapSameDepthNode.get(key));
            }
    
         
      } 
      
      
      
}
