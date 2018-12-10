abstract class Person               //定义一抽象类Person
{
	String name;
	int age;
	String occupation; 
	public Person(String name, int age, String occupation)       //定义构造函数
	{
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	public abstract String talk();          //声明一个抽象方法
}
class Student extends Person                //声明抽象类的子类
{
	public Student(String name, int age, String occupation)
	{
		super(name, age, occupation);
	}
	public String talk()                    //实现talk()方法
	{
		return "学生-姓名：" + name + "，年龄：" + age + ",职业：" + occupation;
	}
}
class Practice
{
	public static void main(String[] args)
	{
		Student s = new Student ("张三",18,"学生");         //创建对象s
		System.out.println(s.talk());                     //调用实现的方法
	} 
}

















