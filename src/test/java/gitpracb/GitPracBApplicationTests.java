package gitpracb;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Slf4j
class GitPracBApplicationTests {

    @Test
    void contextLoads() {
        log.info("TESRT passed.,.,., ");
        assertEquals(true,true);
    }

}
