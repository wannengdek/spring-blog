package dk.coding.blog;

import dk.coding.blog.repository.es.EsBlogRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Autowired
    private EsBlogRepository esBlogRepository;

    @Before
    public void initData() {
        // 清空所有
        esBlogRepository.deleteAll();


    }

    @Test
    public void findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining() {

        String title = "思";
        String summary = "相思";
        String content = "相思";

    }


}
