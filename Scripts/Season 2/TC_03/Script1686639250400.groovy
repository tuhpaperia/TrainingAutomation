// Câu 3
//def tc3 = []
//int a
//for (int i=1; i<=100; i++) {
//	if (i%7 == 0) {
//		tc3.add(i)
//		a = a+1
//	}
//}
//println "Tổng có " +a+ " chia hết cho 7"


def tc3 = []
int a= 0
for (int i=1; i<=100; i++) {
	a = 7*i
	if (a < 100) {
		tc3.add(a)
	}
	else {
		break
	}
}
println "Tổng có " + tc3.size() + " chia hết cho 7"