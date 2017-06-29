package com.myPackage.persistence.RepositoryDAO;

import com.myPackage.persistence.Entity.CaneENTITY;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by thebous on 29/06/17.
 */
public interface CaneDAO extends PagingAndSortingRepository<CaneENTITY, CaneENTITY.CaneENTITYPrimaryKey> {



}
