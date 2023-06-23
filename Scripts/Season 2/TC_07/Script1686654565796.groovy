// Câu 7
List tc7 = ["Java", "C#", "C++", "Python", "Golang", "Swift", "Scartch"]
String search = "pyton"
int a = -1
for(int i=0; i<=tc7.size(); i++) {
	String value = tc7[i]
	if(search.equalsIgnoreCase(value)) {
		a = i
		println "Vị trí (index) của từ được tìm thấy là: "+ a
		break
	}
}
if(a == -1) {
	println "không tìm thấy"
}