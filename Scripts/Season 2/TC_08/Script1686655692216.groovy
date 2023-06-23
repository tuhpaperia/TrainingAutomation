// Câu 8
List tc8 = ["Java", "C#", "C++", "Python", "Golang", "Swift", "Scartch"]
int a = 7
if(a < 0 || a > tc8.size()-1) {
	println "Không tìm thấy"
}
else {
	println "Từ ở vị trí (index)" + a + " là: " + tc8[a]
}