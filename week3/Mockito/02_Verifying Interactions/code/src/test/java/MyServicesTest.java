import org.example.ExternalAPI;
import org.example.MyServices;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServicesTest {

    @Test
    public void testExternalApi() {
        ExternalAPI mockAPI = Mockito.mock(ExternalAPI.class);

        when(mockAPI.getData()).thenReturn("Hello");

        MyServices service = new MyServices(mockAPI);

        assertEquals("Hello", service.fetchData());
    }

    @Test
    public void testVerifyInteraction() {
        ExternalAPI mockAPI = Mockito.mock(ExternalAPI.class);

        MyServices service = new MyServices(mockAPI);

        service.fetchData();

        verify(mockAPI).getData();
    }
}