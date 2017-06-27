package com.myPackage.persistence.RepositoryDAO;

import com.myPackage.persistence.Entity.AmiciENTITY;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by thebous on 26/06/17.
 */
@Repository
@Transactional
public interface AmiciDAO extends PagingAndSortingRepository<AmiciENTITY, Integer>{

}
