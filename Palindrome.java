class Palindrome
{ public static void main(String args[])
{ int num=Integer.parseInt(args[0]);
   int temp,d,a=0;
 temp=num;
while(num!=0)
{ d=num%10;
  a=(a*10)+d;
  num=num/10;
}
if(a==temp)
{ System.out.println(temp+" is palindrome");
}
else
{ System.out.println(temp+" is not palindrome");
}
}
}
  