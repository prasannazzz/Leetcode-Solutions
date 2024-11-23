class Solution {
    public double largestTriangleArea(int[][] points) {
     double area=0;
      for(var i: points){
        for(var j: points){
            for(var k: points){
                area= Math.max(area, 0.5*Math.abs(i[0]*j[1] + j[0]*k[1] + k[0]*i[1]
                                        -i[1]*j[0] - j[1]*k[0] - k[1]*i[0]));
            }
        }
      }
      return area;
    }//remember shoelace formula of jee
}//https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.mathlobby.com%2Fpost%2Fhow-to-find-the-area-of-rectilinear-figures-polygons&psig=AOvVaw2dbQswq3AY_FB14rk_4K7B&ust=1732446929289000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCKiij_Kp8okDFQAAAAAdAAAAABAJ
// unsure of the type as double could be present, so int avoided
//don't forget abs as area cant be negative