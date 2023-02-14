import java.util.Random;
import java.util.concurrent.TimeUnit;


class T1 extends Thread { 
public static int t = 0 ;//xx
T1(){  Random no1 = new Random ();
       a=no1.nextInt(100);
       b=no1.nextInt(100);        
    } 
public static Integer a ;
public static Integer b ;
public static boolean button = true;

public void run (){
                jj: if(button){System.out.println(a+"+"+b);
               try{T1.sleep (10000);}catch (InterruptedException e){break jj;} 
              if (T2.flag==false){ System.out.println("Time's up\n\n"); T2.mist++;}
               T1.t = 10 ;  }//E O W
                  }
              
			}

class T2 extends Thread { 
public Integer ans = 0 ; 
static int score = 0 ;
static int mist = 0 ;
 public static boolean flag = false;
public void run (){
System.out.println("Enter your answer");
ans = Integer.parseInt(System.console().readLine());

 if (ans.equals(T1.a + T1.b) ) { 
System.out.println("correct answer\n\n"); 
score++; flag=true; T1.t = 10 ;T1.button=false;
				}
else if (!ans.equals(T1.a + T1.b) ) { 
				System.out.println("wrong answer"); System.out.print("answer was "+(T1.a + T1.b+"\n\n"));  
				score--;
				T2.mist++;flag=true; T1.t = 10 ;T1.button=false;
				}
		   }
			}

class M extends T1{
public static void main(String args[]){
System.out.println("\n\nThe game of addition is about to start ,you just have 3 lives .Game starts in "+"\n\n\n");
System.out.println("3\n");
try{TimeUnit.SECONDS.sleep(1);}catch (Exception i){}
System.out.println("2\n");
try{TimeUnit.SECONDS.sleep(1);}catch (Exception i){}
System.out.println("1\n");
try{TimeUnit.SECONDS.sleep(1);}catch (Exception i){}

while( T2.mist<3){
 T1 Q =new T1();
T2 A = new T2();


             Q.start();
         while ( T1.t==0) {
                       try{A.start();}catch (Exception e ){}
		          }//end of while
                    
                T1.t=0;T1.button = true;T2.flag= false;Q.interrupt();
                
                  }//E O w
System.out.println("GAME OVER :( ");
 System.out.println("your total score = " +T2.score);
 System.out.println("your total mistakes = " +T2.mist+"\n");
System.exit(0);
                }}  

