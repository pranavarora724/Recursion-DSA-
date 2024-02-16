//package GFG_Medium_And_Hard;
//
//class Solution {
//    public List<List<Integer>> combinationSum2(int[] candidates, int target)
//    {
//        List<List<Integer>> ans
//                = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//
//        Arrays.sort(candidates);
//        combination(0,target,candidates,list,ans);
//        return ans;
//
//    }
//
//    void combination(int i , int target , int[]candidates ,List<Integer> list , List<List<Integer>> ans )
//    {
//        if(target==0)
//        {
//            ans.add(new ArrayList<>(list));
//            return;
//        }
//        if(i==candidates.length)
//            return;
//
//        if(target>0)
//        {
//            for(int j=i;j<candidates.length;j++)
//            {
//                if(j>i && (candidates[j]==candidates[j-1]))
//                {
//                    continue;
//                }
//
//                list.add(candidates[j]);
//                combination(j+1 , target-candidates[j] , candidates ,list , ans);
////                IMP BACKTRACKING
//                list.remove(list.size()-1);
//            }
//        }
//    }
//}