// Câu 2
List tc1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
def sochan = []
def sole = []
for (int i=0; i< tc1.size(); i++) {
	if (tc1[i] %2 == 0) {
		sochan.add(tc1[i])
	}
	else {
		sole.add(tc1[i])
	}
}
tc1.removeAll(sochan)
println "danh sach sau khi remove: " + tc1