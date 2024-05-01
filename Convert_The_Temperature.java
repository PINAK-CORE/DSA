class Solution 
{
    public double[] convertTemperature(double celsius) {
        
        // Q : https://leetcode.com/problems/convert-the-temperature/
        //solution : https://leetcode.com/problems/convert-the-temperature/solutions/5086097/convert-the-temperature-simple-solution-java-eazy-understandable

        double k = celsius + 273.15;
        double f = celsius * 1.80 + 32.00;
        
        return new double[]{k, f};
    }
}