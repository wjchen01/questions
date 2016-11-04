package org.wc2442.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	private List<Integer> nums;
	
	public MergeSort(List<Integer> nums) {
		this.nums = nums;
	}
	
	public List<Integer> result() {
		this.sort();
		
		return this.nums;
	}
	
	private void sort() {
		int sort_size = nums.size();
		if(sort_size > 1) {
			List<Integer> left = new ArrayList<Integer>(nums.subList(0, sort_size / 2));
			List<Integer> right = new ArrayList<Integer>(nums.subList(sort_size / 2, sort_size));
			MergeSort leftSort = new MergeSort(left);
			MergeSort rightSort = new MergeSort(right);
			merge(leftSort.result(), rightSort.result());
		}
	}
	
	private void merge(final List<Integer> left, final List<Integer> right) {
		int idx_left = 0;
		int idx_right = 0;
		int idx_nums = 0;
		while(idx_nums < nums.size()) {
			if(idx_left >= left.size()) {
				nums.set(idx_nums, right.get(idx_right));
				idx_right++;								
			}
			else if(idx_right >= right.size()) {
				nums.set(idx_nums, left.get(idx_left));
				idx_left++;							
			}
			else if(left.get(idx_left) < right.get(idx_right)) {
				nums.set(idx_nums, left.get(idx_left));
				idx_left++;
			}
			else {
				nums.set(idx_nums, right.get(idx_right));
				idx_right++;				
			}
			idx_nums++;
		}
	}
	
}
