import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {

    @Test
    void testAverage() {
        GradeService gs = new GradeService();

        assertEquals(90,
                gs.calculateAverage(70,80,90));
    }
}
