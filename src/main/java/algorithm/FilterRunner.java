package algorithm;

import model.Criteria;
import model.FilterClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static algorithm.Constants.EXTENSION;
import static algorithm.Constants.SIZE;

public class FilterRunner {
    public static void main(String[] args) {
        List<FilterClass> filterClassList = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put(SIZE,70);
        map.put(EXTENSION,"jpeg");
        filterClassList.add(new FilterClass(90,"jpeg"));
        filterClassList.add(new FilterClass(80,"jpeg"));
        filterClassList.add(new FilterClass(70,"jpeg"));
        filterClassList.add(new FilterClass(60,"jpeg"));
        filterClassList.add(new FilterClass(50,"jpeg"));
        filterClassList.add(new FilterClass(40,"jpeg"));
        filterClassList.add(new FilterClass(30,"png"));
        filterClassList.add(new FilterClass(20,"png"));
        filterClassList.add(new FilterClass(10,"png"));
        FilterFiles filterFilesSize = new FilterBySize();
        FilterFiles filterFilesExtension = new FilterByExtension();
        filterClassList = filterFilesSize.filterFilesLessThan(filterClassList,new Criteria(map));
        filterClassList = filterFilesExtension.filterFilesEqual(filterClassList,new Criteria(map));
        System.out.println(filterClassList);
    }
}
