def BMI = ["Tên":"TuPhan", "Chiều Cao":171]
BMI.put("Cân Nặng",55)
float cv = BMI.get("Chiều Cao")/100
float KQ = BMI.get("Cân Nặng") / (cv * cv)
if(KQ < 16) {
	println "Thể trạng của bạn là: Gầy độ III"
	BMI.put("Thể Trạng", "Gầy độ III")
}
if(16 <= KQ && KQ < 17) {
	println "Thể trạng của bạn là: Gầy độ II"
	BMI.put("Thể Trạng", "Gầy độ II")
}
if(17 <= KQ && KQ < 18.5) {
	println "Thể trạng của bạn là: Gầy độ I"
	BMI.put("Thể Trạng", "Gầy độ I")
}
if(18.5 <= KQ && KQ < 25) {
	println "Thể trạng của bạn là: Bình thương"
	BMI.put("Thể Trạng", "Bình thường")
}
if(25 <= KQ && KQ < 30) {
	println "Thể trạng của bạn là: Thừa cân"
	BMI.put("Thể Trạng", "Thừa cân")
}
if(30 <= KQ && KQ < 35) {
	println "Thể trạng của bạn là: Béo phì độ I"
	BMI.put("Thể Trạng", "Béo phì độ I")
}
if(35 <= KQ && KQ <= 40) {
	println "Thể trạng của bạn là: Béo phì độ II"
	BMI.put("Thể Trạng", "Béo phì độ II")
}
if(40 < KQ) {
	println "Thể trạng của bạn là: Béo phì độ III"
	BMI.put("Thể Trạng", "Béo phì độ III")
}
println KQ
println BMI