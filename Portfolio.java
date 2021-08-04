import java.util.ArrayList;

class Portfolio{
	private ArrayList<Project> projects;


	public Portfolio(){
		this.projects = new ArrayList<Project>();
	}

	public ArrayList<Project> getProjects(){
		return this.projects;
	}

	public void setProjects(Project project){
		projects.add(project);
	}

	public double getPortfolioCost(){
		double sum=0;
		for(Project project: projects){
			sum += project.getInitialCost();
		}
		return sum;
	}

	public void showPortfolio(){
		for(Project project: projects){
			System.out.println(project.elevatorPitch());
		}

			System.out.println(this.getPortfolioCost());
	}
}