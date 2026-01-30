package loose;

public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyuser(String msg){
         notificationService.send(msg);
    }
}
