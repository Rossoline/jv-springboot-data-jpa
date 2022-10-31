package mate.academy.springboot.datajpa.repository.specification;

import org.springframework.data.jpa.domain.Specification;

public interface SpecificationProvider<T> {
    Specification<T> getSpecification(String[] name);

    String getFilterKey();
}
