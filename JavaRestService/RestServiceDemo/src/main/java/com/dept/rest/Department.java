package com.dept.rest;

public class Department {
	
		
		private int depId;
		private String depName;
		
		public Department() {
			// TODO Auto-generated constructor stub
		}

		public Department(int depId, String depName) {
			super();
			this.depId = depId;
			this.depName = depName;
		}

		public int getDepId() {
			return depId;
		}

		public void setDepId(int depId) {
			this.depId = depId;
		}

		public String getDepName() {
			return depName;
		}

		public void setDepName(String depName) {
			this.depName = depName;
		}

		@Override
		public String toString() {
			return "Department [depId=" + depId + ", depName=" + depName + "]";
		}


}
