package org.liliyamammadova.jpastarter.service;

import org.liliyamammadova.jpastarter.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BaseService<T extends BaseEntity> {
    T save(T entity);

    Optional<T> getById(Integer id);

    Page<T> getAllPaginatedAndSorted(Pageable pageable);

    void delete(Integer id);
}
