/**
 * Created by josep on 3/3/2017.
 */
public class Project {

    private String projectName;
    private int percentComplete;
    private int ScheduleStatus;
    private String projectDescription;
    private String projectDashboardURL;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(int percentComplete) {
        this.percentComplete = percentComplete;
    }

    public int getScheduleStatus() {
        return ScheduleStatus;
    }

    public void setScheduleStatus(int scheduleStatus) {
        ScheduleStatus = scheduleStatus;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectDashboardURL() {
        return projectDashboardURL;
    }

    public void setProjectDashboardURL(String projectDashboardURL) {
        this.projectDashboardURL = projectDashboardURL;
    }
}
