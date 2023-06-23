// Câu 6
//def tc6 = []
//int n = 20
//for(int i=1; tc6.size()<n; i++) {
//	if(i % n == 0) {
//		tc6.add(i)
//	}
//}
//println "Các số chia hết cho " + n + " là " + tc6



def tc6 = []
int n = 20
for (int i=1; tc6.size()<n; i++) {
	int a = n*i
	tc6.add(a)
}
println "Các số chia hết cho " + n + " là " + tc6