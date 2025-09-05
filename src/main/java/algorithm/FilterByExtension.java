package algorithm;

import java.util.List;
import java.util.stream.Collectors;

import model.Criteria;
import model.FilterClass;

import static algorithm.Constants.EXTENSION;

public class FilterByExtension implements FilterFiles {

  @Override
  public List<FilterClass> filterFilesEqual(List<FilterClass> filesList, Criteria criteria) {
    String extension = (String) criteria.getCriteria().get(EXTENSION);
    return filesList.stream().filter(filterClass -> {
      return filterClass.getExtension().equals(extension);
    }).collect(Collectors.toList());
  }

  @Override
  public List<FilterClass> filterFilesLessThan(List<FilterClass> filesList, Criteria criteria) {
    String extension = (String) criteria.getCriteria().get(EXTENSION);
    return filesList.stream().filter(filterClass -> {
      return filterClass.getExtension().compareTo(extension) < 0;
    }).collect(Collectors.toList());
  }

  @Override
  public List<FilterClass> filterFilesMoreThan(List<FilterClass> filesList, Criteria criteria) {
    String extension = (String) criteria.getCriteria().get(EXTENSION);
    return filesList.stream().filter(filterClass -> {
      return filterClass.getExtension().compareTo(extension) > 0;
    }).collect(Collectors.toList());
  }
}
