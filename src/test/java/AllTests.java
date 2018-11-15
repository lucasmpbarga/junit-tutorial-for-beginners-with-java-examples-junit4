import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {       ArraysCompareTest.class,
                StringHelperTestAreFirstAndLastTwoCharactersTheSame.class,
                StringHelperTestTruncateAInFirst2Positions.class,
                StringHelperTestTruncateParameterized.class
        }
)
public class AllTests {

}
