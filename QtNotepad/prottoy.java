class Student {
private:
	String ID;
	String name;
	String dept;
public:
	Student(String ID, String name, String dept) {
		this.ID = ID;
		this.name = name;
		this.dept = dept;
	}
}
String getID() {
	return ID;
}
String getName() {
	return name;
}
String getDept() {
	return dept;
}
void setID(String ID) {
	this.ID = ID;
{
void setName(String name) {
	this.name = name;
}
void setDept(String dept) {
	this.dept = dept;
}