package org.liliyamammadova.jpastarter.service;

import org.liliyamammadova.jpastarter.entity.BaseEntity;
import org.liliyamammadova.jpastarter.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T>{
    protected final BaseRepository<T> baseRepository;
    public BaseServiceImpl(BaseRepository<T> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public T save(T entity) {
        return baseRepository.save(entity);
    }

    @Override
    public Optional<T> getById(Integer id) {
        return baseRepository.findById(id);
    }

    @Override
    public Page<T> getAllPaginatedAndSorted(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    @Override
    public void delete(Integer id) {
        baseRepository.deleteById(id);
    }
}
