package Service;

import DAO.mapperI.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestService {
    @Autowired
    public TestDao testDao;
      public List queryAll() throws Exception{
          try {
              return testDao.selectTransactiona();
          } catch (Exception e) {
              e.printStackTrace();
              throw e;
          }
      }
}
