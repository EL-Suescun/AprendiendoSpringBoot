package com.yoandoride.persona.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.yoandoride.persona.model.Estado;
import com.yoandoride.persona.repository.EstadoRepository;

@Service
public class EstadoService implements EstadoRepository {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public void flush() {    
        return;    
    }

    @Override
    public <S extends Estado> S saveAndFlush(S entity) {
        return estadoRepository.saveAndFlush(null);
    }

    @Override
    public <S extends Estado> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Estado> entities) {
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
    }

    @Override
    public void deleteAllInBatch() {
    }

    @Override
    public Estado getOne(Integer id) {
        return null; 
    }

    @Override
    public Estado getById(Integer id) {
        return null;
        
    }

    @Override
    public Estado getReferenceById(Integer id) {
        return null;
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example) {
        return null;        
    }

    @Override
    public <S extends Estado> List<S> findAll(Example<S> example, Sort sort) {
        return null;        
    }

    @Override
    public <S extends Estado> List<S> saveAll(Iterable<S> entities) {
        return null;        
    }

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    @Override
    public List<Estado> findAllById(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public <S extends Estado> S save(S entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Estado> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean existsById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
    }

    @Override
    public void delete(Estado entity) {
        estadoRepository.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        // TODO Auto-generated method stub
    }

    @Override
    public void deleteAll(Iterable<? extends Estado> entities) {
        estadoRepository.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        estadoRepository.deleteAll();
    }

    

    @Override
    public <S extends Estado> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends Estado> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Estado> long count(Example<S> example) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends Estado> boolean exists(Example<S> example) {
        return (Boolean) null;
    }

    @Override
    public <S extends Estado, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public List<Estado> findAll(Sort sort) {
        return estadoRepository.findAll(sort);
    }

    @Override
    public Page<Estado> findAll(Pageable pageable) {
        return estadoRepository.findAll(pageable);
    }
}
