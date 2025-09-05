package algorithm;

import java.util.List;

import model.Criteria;
import model.FilterClass;

public interface FilterFiles {
  List<FilterClass> filterFilesEqual(List<FilterClass> filesList, Criteria criteria);
  List<FilterClass> filterFilesLessThan(List<FilterClass> filesList, Criteria criteria);
  List<FilterClass> filterFilesMoreThan(List<FilterClass> filesList, Criteria criteria);
}
