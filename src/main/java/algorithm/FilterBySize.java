package algorithm;

import java.util.List;
import java.util.stream.Collectors;

import model.Criteria;
import model.FilterClass;

import static algorithm.Constants.SIZE;

public class FilterBySize implements FilterFiles {
  
  @Override
  public List<FilterClass> filterFilesEqual(List<FilterClass> filesList, Criteria criteria) {
    int size = (int) criteria.getCriteria().get(SIZE);
    return filesList.stream().filter(filterClass -> {
      return filterClass.getSize() == size;
    }).collect(Collectors.toList());
  }

  @Override
  public List<FilterClass> filterFilesLessThan(List<FilterClass> filesList, Criteria criteria) {
    int size = (int) criteria.getCriteria().get(SIZE);
    return filesList.stream().filter(filterClass -> {
      return filterClass.getSize() < size;
    }).collect(Collectors.toList());
  }

  @Override
  public List<FilterClass> filterFilesMoreThan(List<FilterClass> filesList, Criteria criteria) {
    int size = (int) criteria.getCriteria().get(SIZE);
    return filesList.stream().filter(filterClass -> {
      return filterClass.getSize() > size;
    }).collect(Collectors.toList());
  }
}
