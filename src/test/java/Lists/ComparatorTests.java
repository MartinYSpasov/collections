package Lists;


import Lists.Dto.ComparatorListDto;
import org.junit.*;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComparatorTests {

    private List<ComparatorListDto> dtos;

    @Before
    public void setUp(){
        dtos = new ArrayList<ComparatorListDto>();
        dtos.addAll(Arrays.asList(new ComparatorListDto("c" , new ComparatorListDto.CoparatorSubListDto(true)),
                                new ComparatorListDto("a",new ComparatorListDto.CoparatorSubListDto(false)),
                                new ComparatorListDto("b",new ComparatorListDto.CoparatorSubListDto(true))));
    }

    @Test
    public void testAscCollection() {
//        Collections.sort(dtos, ComparatorListDto.isAsc(true));
//        assertEquals(dtos.get(0).getSubListDto().isUp(),Boolean.TRUE);
//        assertEquals(dtos.get(0).getName(),"b");
    }

//    @Test
//    public void testDescCollection() {
//        Collections.sort(dtos, ComparatorListDto.isAsc(false));
//        assertEquals(dtos.get(0).getName(),"c");
//    }
}
