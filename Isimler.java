/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isimler;

/**
 *
 * @author at
 */
 class Isimler {
 static int d=0;
 static boolean bul = false;
 static String kelime= "TARIK";
 static char[][] mat= new char[][]{
     /* {'F','S','M'},
     {'Q','S','M'},
     {'F','W','M'}*/
  
     {'M','M','G','E','N','M','M','G','O','N'},
     {'M','M','F','T','C','M','M','G','O','N'},
     {'G','O','W','C','A','M','M','G','O','N'},
     {'M','M','F','T','D','M','M','W','O','N'},
     {'M','M','F','T','C','M','M','N','O','N'},
     {'M','M','F','T','C','M','M','C','O','N'},
     {'M','M','F','T','A','R','I','K','O','N'},
     {'M','M','F','T','C','M','M','G','O','N'},
     {'M','M','F','T','C','M','M','G','O','N'},
     {'M','M','F','T','C','M','M','G','O','N'},
 /*
     {'M','F','W','T'},
     {'W','S','S','F'},
     {'W','M','S','F'},
     {'M','M','M','T'},*/
                  };   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             kelimeBul();
             
      if(d==0 || d==1){
       for(int a=0; a< soldanSaga(mat,kelime).length;a++) {
                          System.out.print(soldanSaga(mat,kelime)[a][0]); 
                              
                }System.out.println("");
                for(int a=0; a< soldanSaga(mat,kelime).length;a++) {
                           System.out.print(soldanSaga(mat,kelime)[a][1]);    
                              
                }   
    }else     if(d==2 ){
       for(int a=0; a< sagdanSola(mat,kelime).length;a++) {
                           System.out.print( sagdanSola(mat,kelime)[a][0]);    
                              
                } System.out.println("");
                for(int a=0; a< sagdanSola(mat,kelime).length;a++) {
                           System.out.print( sagdanSola(mat,kelime)[a][1]);    
                              
                }   
    }else     if(d==3){
       for(int a=0; a< yukaridanAsagiya(mat,kelime).length;a++) {
                           System.out.print(yukaridanAsagiya(mat,kelime)[a][0]);    
                              
                } System.out.println("");
                for(int a=0; a< yukaridanAsagiya(mat,kelime).length;a++) {
                            System.out.print(yukaridanAsagiya(mat,kelime)[a][1]);    
                              
                }   
    }else     if(d==4){
       for(int a=0; a< asagidanYukariya(mat,kelime).length;a++) {
                           System.out.print( asagidanYukariya(mat,kelime)[a][0]);    
                              
                } System.out.println("");
                for(int a=0; a< asagidanYukariya(mat,kelime).length;a++) {
                             System.out.print(   asagidanYukariya(mat,kelime)[a][1]);    
                              
                }   
    }
            /*for(int a=0; a< soldanSaga(mat,kelime).length;a++) {
                          System.out.print(soldanSaga(mat,kelime)[a][0]); 
                              
                }System.out.println("");
                for(int a=0; a< soldanSaga(mat,kelime).length;a++) {
                           System.out.print(soldanSaga(mat,kelime)[a][1]);    
                              
                }   
*/
             
             System.out.println("d"+ d);
        }
           
    
    
    
    public static void kelimeBul() {
        int c=0;
        while(!bul) {
    if(d==0 || d==1){
       for(int a=0; a< soldanSaga(mat,kelime).length;a++) {
                          c =soldanSaga(mat,kelime)[a][0];    
                              
                }
                for(int a=0; a< soldanSaga(mat,kelime).length;a++) {
                        //    c =  soldanSaga(mat,kelime)[a][1];    
                              
                }   
    }else     if(d==2 ){
       for(int a=0; a< sagdanSola(mat,kelime).length;a++) {
                           c =   sagdanSola(mat,kelime)[a][0];    
                              
                } 
                for(int a=0; a< sagdanSola(mat,kelime).length;a++) {
                        //   c =    sagdanSola(mat,kelime)[a][1];    
                              
                }   
    }else     if(d==3){
       for(int a=0; a< yukaridanAsagiya(mat,kelime).length;a++) {
                           c =    yukaridanAsagiya(mat,kelime)[a][0];    
                              
                } 
                for(int a=0; a< yukaridanAsagiya(mat,kelime).length;a++) {
                         //  c =  yukaridanAsagiya(mat,kelime)[a][1];    
                              
                }   
    }else     if(d==4){
       for(int a=0; a< asagidanYukariya(mat,kelime).length;a++) {
                          c =  asagidanYukariya(mat,kelime)[a][0];    
                              
                } 
                for(int a=0; a< asagidanYukariya(mat,kelime).length;a++) {
                       //     c =   asagidanYukariya(mat,kelime)[a][1];    
                            
                }   
    }
    
        }
    }
    
    
    
    public static int[][]  soldanSaga(char[][] puzzle, String w) {
        int[][] x= new int[w.length()][2];
     int counter = 0;
    boolean match = true;
    for (int row = 0; row < puzzle.length; row++) {
        counter = 0;
        match = false;
      for(int a=0; a<x.length;a++) {
                            x[a][0] = -1;
                            x[a][1]=-1;
                    }
       
        for (int col = 0; col < puzzle[row].length; col++) {
            if (counter < w.length()) {
                char word = puzzle[row][col];

                if (w.charAt(counter) == word) {
                    match = true; 
                    x[counter][0]=row;
                    x[counter][1] =col;
                    counter++;  
                } else {
                    match = false;
                    counter = 0;
                    for(int a=0; a<x.length;a++) {
                            x[a][0] = 0;
                            x[a][1]=0;
                    }
                }

                if ((counter == w.length()) && (match == true)) {
                     d=1; //eğer 1 se soldan sağa 
                     bul=true;
                    return x;
                    
                } 
            }
        }
    }
    d=2;
    return x;
}
        public static int[][]  sagdanSola(char[][] puzzle, String w) {
        int[][] x= new int[w.length()][2];
  int counter = w.length()-1;
    boolean match = true;
    for (int row = 0; row < puzzle.length; row++) {
        counter = w.length()-1;
        match = false;
      for(int a=0; a<x.length;a++) {
                            x[a][0] = -1;
                            x[a][1]=-1;
                    }
       
        for (int col =0; col<puzzle[row].length ; col++) {
            if (counter >=0) {
                char word = puzzle[row][col];

                if (w.charAt(counter) == word) {
                    match = true; 
                    x[counter][0]=row;
                    x[counter][1] =col;
                  counter--;  
                } else {
                    match = false;
                   counter =  w.length()-1;
                    for(int a=0; a<x.length;a++) {
                            x[a][0] = -1;
                            x[a][1]=-1;
                    }
                }

                if ((counter <0) && (match == true)) {
                      d=2; //eğer 1 se soldan sağa  
                    bul=true;
                    return x;
                    
                } 
            }
        }
    }
    d=3;
    return x;
}
    
    
    
    
        public static int[][]  yukaridanAsagiya(char[][] puzzle, String w) {
        int[][] x= new int[w.length()][2];
     int counter = 0;
    boolean match = true;
    for (int row = 0; row < puzzle.length; row++) {
        counter = 0;
        match = false;
        for(int a=0; a<x.length;a++) {
                            x[a][0] = 0;
                            x[a][1]=0;
                   }
        
        for (int col = 0; col < puzzle[row].length; col++) {
            if (counter < w.length()) {
                char word = puzzle[col][row];

                if (w.charAt(counter) == word) {
                    match = true; 
                    x[counter][1]=row;
                    x[counter][0] =col;
                    counter++;  
                } else {
                    match = false;
                    counter = 0;
                    for(int a=0; a<x.length;a++) {
                            x[a][0] = 0;
                            x[a][1]=0;
                    }
                }

                if ((counter == w.length()) && (match == true)) {
                    d=3;///   eğer 2 se yukarıdan aşağıya
                    bul=true;
                    return x;
                } 
            }
        }
    }
      d=4;
    return x;
}
        public static int[][]  asagidanYukariya(char[][] puzzle, String w) {
        int[][] x= new int[w.length()][2];
     int counter = w.length()-1;
    boolean match = true;
          for(int a=0; a<x.length;a++) {
                            x[a][0] = 0;
                            x[a][1]=0;
                   }
             for (int row = 0; row < puzzle.length; row++) {
   
        counter = w.length()-1;
        match = false;
  
      for (int col=0;col<puzzle[row].length; col++) {
            if (counter >= 0) {
                char word = puzzle[col][row];
                        
                if (w.charAt(counter) == word) {
                    match = true; 
                    x[counter][1]=row;
                    x[counter][0] =col;
                    counter--;  
                } else {
                    match = false;
                    counter = w.length()-1;
                    for(int a=0; a<x.length;a++) {
                            x[a][0] = 0;
                            x[a][1]=0;
                    }
                }

                if ((counter <0) && (match == true)) {
                    d=4;///   eğer 2 se yukarıdan aşağıya
                    bul=true;
                    return x;
                } 
            }
        }
    }
      d=-1;
    return x;
}
    
}
