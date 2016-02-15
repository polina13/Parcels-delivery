import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ParcelsTest {

  @Test
  public void newParcel_instantiatesParcel() {
    Parcels testParcel = new Parcels(2,3,4,5,6);
    assertEquals(true, testParcel instanceof Parcels);
  }

  @Test
  public void getVolume_willCalculateVolume() {
    Parcels testParcel = new Parcels(2,3,4,5,6);
    assertEquals(24,testParcel.getVolume());
  }

  @Test
  public void getCost_willCalculateCost() {
    Parcels testParcel = new Parcels(1,1,1,10,150);
    assertEquals(7,testParcel.getCost());
  }
}
