import org.example.Solution3;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


/**
 * @description:
 * Solution3Test 测试类用于验证 Solution3 类的 largestDivisibleSubset 方法。
 * 每个测试方法都包含测试目的和所用的测试用例。
 */
public class L2022211938_3_Test {

    /**
     * 测试目的：验证输入为空数组时，是否能正确返回空列表。
     * 测试用例：输入 []，期望返回 []。
     */
    @Test
    public void testEmptyArray() {
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(new int[]{});
        assertEquals(Collections.emptyList(), result);
    }

    /**
     * 测试目的：验证当数组中只有一个元素时，是否返回该元素作为子集。
     * 测试用例：输入 [5]，期望返回 [5]。
     */
    @Test
    public void testSingleElement() {
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(new int[]{5});
        assertEquals(List.of(5), result);
    }

    /**
     * 测试目的：验证当输入的元素互不整除时，能否返回正确的子集。
     * 测试用例：输入 [3, 5, 7]，期望返回 [3]、[5] 或 [7] 中的任意一个。
     */
    @Test
    public void testNoDivisibleRelation() {
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(new int[]{3, 5, 7});
        Collections.sort(result); // 对结果进行排序以保证顺序一致
        assertEquals(1, result.size());
    }

    /**
     * 测试目的：验证输入的元素具有倍数关系时，是否能找到完整的整除子集。
     * 测试用例：输入 [1, 2, 4, 8]，期望返回 [1, 2, 4, 8]。
     */
    @Test
    public void testAllDivisibleElements() {
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(new int[]{1, 2, 4, 8});
        Collections.sort(result); // 对结果进行排序以保证顺序一致
        assertEquals(Arrays.asList(1, 2, 4, 8), result);
    }

}
