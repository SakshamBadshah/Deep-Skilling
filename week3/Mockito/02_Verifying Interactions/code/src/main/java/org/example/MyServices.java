package org.example;

public class MyServices {
    private ExternalAPI externalAPI;

    public MyServices(ExternalAPI externalAPI) {
        this.externalAPI = externalAPI;
    }

    public String fetchData(){
        return externalAPI.getData();
    }
}