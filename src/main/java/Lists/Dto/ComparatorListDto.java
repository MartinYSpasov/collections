package Lists.Dto;

import java.util.Comparator;

public class ComparatorListDto {

    private String name;
    private CoparatorSubListDto subListDto;

    public ComparatorListDto(String name, CoparatorSubListDto subListDto) {
        this.name = name;
        this.subListDto = subListDto;
    }

    private static Comparator SORT_ASC = new Comparator<ComparatorListDto>() {
        @Override
        public int compare(ComparatorListDto o1, ComparatorListDto o2) {
            return o2.getSubListDto().isUp().compareTo(o1.getSubListDto().isUp());

//            if (compare == -1 || ) {
//                return o1.getName().compareTo(o2.getName());
//            }
//            if (compare == -1) {
//                return o1.getName().compareTo(o2.getName());
//            }
//
//            return o2.getName().compareTo(o1.getName());
        }
    };


    private static Comparator SORT_DESC = new Comparator<ComparatorListDto>() {
        @Override
        public int compare(ComparatorListDto o1, ComparatorListDto o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    public static Comparator isAsc(Boolean isAscending) {
        if (isAscending) {
            return SORT_ASC;
        }
        return SORT_DESC;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoparatorSubListDto getSubListDto() {
        return subListDto;
    }

    public void setSubListDto(CoparatorSubListDto subListDto) {
        this.subListDto = subListDto;
    }

    /**
     * Created by Martin on 12/22/2015.
     */
    public static class CoparatorSubListDto {

        private Boolean isUp;

        public Boolean isUp() {
            return isUp;
        }

        public CoparatorSubListDto(Boolean isUp) {
            this.isUp = isUp;
        }
    }
}
