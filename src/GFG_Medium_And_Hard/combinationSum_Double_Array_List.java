//package GFG_Medium_And_Hard;
//
//
//import java.util.ArrayList;
//
//class Soluti {
//    public List<List<Integer>> combinationSum(int[] candidates, int target)
//    {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        return combination(0 , candidates , list , target);
//    }
//    List<List<Integer>> combination(int i , int[]candidates , ArrayList<Integer> list ,int target)
//    {
//
//        List<List<Integer>> ans
//                = new ArrayList<>();
//        if(target==0)
//        {
//            ans.add(new ArrayList<>(list));
//            return ans;
//        }
//        if(i==candidates.length)
//            return ans;
//
//        if(target>0 )
//        {
//            list.add(candidates[i]);
//            ans.addAll(combination(i,candidates ,list,target-candidates[i]));
//
//            list.remove(list.size()-1);
//            ans.addAll(combination(i+1 , candidates , list ,target));
//
//        }
//
//        return ans;
//    }
//}
