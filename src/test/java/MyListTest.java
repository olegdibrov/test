import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.mockito.*;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;


//@RunWith(MockitoJUnitRunner.class)
public class MyListTest {

    List list = new LinkedList();
    List spy = spy(list);

    @Test
    void testMethod() {
        //you can create partial mock with spy() method:
        List list = spy(new LinkedList());

//you can enable partial mock capabilities selectively on mocks:
        MyList mock = mock(MyList.class);
//Be sure the real implementation is 'safe'.
//If real implementation throws exceptions or depends on specific state of the object then you're in trouble.
        when(mock.add("aa")).thenCallRealMethod();

        mock.add("aa");


    }
}
