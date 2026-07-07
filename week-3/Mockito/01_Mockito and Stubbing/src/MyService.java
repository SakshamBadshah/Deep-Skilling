import java.util.List;

public class MyService<ExternalAPI> {

    @SuppressWarnings("FieldMayBeFinal")
    private ExternalAPI externalAPI;

    public MyService(ExternalAPI externalAPI){
        this.externalAPI = externalAPI;
    }

    public String fetchData(){
        return externalAPI.toString();
    }

}