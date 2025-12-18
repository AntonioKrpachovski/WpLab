package mk.ukim.finki.wp.lab.service;

import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class FieldFilterSpecification {

    // Text search with LIKE '%value%'
    public static <T> Specification<T> filterContainsText(Class<T> clazz, String field, String value) {
        if (value == null || value.isEmpty()) {
            return null;  // Skip if empty
        }

        return (root, query, criteriaBuilder) -> criteriaBuilder.like(
                criteriaBuilder.lower(root.get(field)),
                "%" + value.toLowerCase() + "%"
        );
    }

    public static <T> Specification<T> filterAverageRatingGreaterThanEqual(Class<T> clazz, String field, Double rating) {
        if (rating == null) {
            return null;  // Skip if empty
        }

        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThanOrEqualTo(root.get("averageRating"), rating);
    }


}

