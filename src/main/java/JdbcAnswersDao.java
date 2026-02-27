// package ?

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//import com.techelevator.exception.DaoException;
//import com.techelevator.model.RegisterUserDto;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

//import com.techelevator.model.User;

@Component
public class JdbcAnswersDao {

    // Unsure what needs to go here
}

@Override
public Answer getAnswerById(int category) {
    Answer answer = null;
    String sql = "SELECT * FROM magic8Ball WHERE category = ?"; //for user to choose category by number NO
    //No need to return one random answer from the answer column with a category of 2, not the entire HashMap
}
