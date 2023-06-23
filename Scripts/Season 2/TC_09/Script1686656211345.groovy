import java.time.LocalDate

// Câu 9
def INFO = ["Tên":"TuPhan", "Năm sinh":1989, "Chiều Cao":171]
LocalDate d1= LocalDate.now()
int year = d1.getYear()
int age = year- INFO.get("Năm sinh")
INFO.put("Tuổi", age)
println INFO