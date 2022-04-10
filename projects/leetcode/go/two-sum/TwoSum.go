import "fmt"

func main() {
	nums := []int{2, 7, 11, 15, 18, 22}
	fmt.Println((twoSum(nums, 37)))
}

func twoSum(nums []int, target int) []int {

	index := make(map[int]int, len(nums))

	for i, b := range nums {

		if j, ok := index[target-b]; ok {
			return []int{j, i}
		}

		index[b] = i
	}

	return nil
}
