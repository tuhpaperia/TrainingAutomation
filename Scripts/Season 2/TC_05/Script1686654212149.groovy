//Câu 5
import org.apache.commons.lang3.RandomStringUtils

int n = 0
def map5 = [:]
for (int i=0; i<n; i++) {
	map5.put(RandomStringUtils.randomAlphabetic(6), RandomStringUtils.randomNumeric(3))
}
println "Giá trị của hashmap là " + map5