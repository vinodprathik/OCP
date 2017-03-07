package com.enumExample;

public class DaysinWeek {
		private Days days;
		
		public static void main(String[] args) {
			DaysinWeek dy = new DaysinWeek();
			dy.setDays(Days.SUNDAY);
			
			for (Days d : Days.values()) {
				System.out.println(d);
			}
		}

		public Days getDays() {
			return days;
		}

		public void setDays(Days days) {
			this.days = days;
		}

}
