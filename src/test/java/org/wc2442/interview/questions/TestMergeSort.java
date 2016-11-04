package org.wc2442.interview.questions;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestMergeSort {

	@Test
	public void test() {
		Integer[] unsorted = {-1, 1, 1, 4, 1, 5, 2, 6, 9};
		MergeSort sort = new MergeSort(Arrays.asList(unsorted));
		Assert.assertEquals(Arrays.asList(-1, 1, 1, 1, 2, 4, 5, 6, 9), sort.result());
	}

}
