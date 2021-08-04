public class TestProject{
	public static void main(String [] args){
		Project p = new Project("project 1",
		 "nice project 1",2000.00);
		Project p1 = new Project("project 2",
		 "nice project 2",4000.00);
		// System.out.println(p.elevatorPitch());

		Portfolio portfolio1 = new Portfolio();
		Portfolio portfolio2 = new Portfolio();
		portfolio1.setProjects(p);
		portfolio1.setProjects(p1);
		portfolio2.setProjects(p);
		portfolio1.showPortfolio();
	}
}