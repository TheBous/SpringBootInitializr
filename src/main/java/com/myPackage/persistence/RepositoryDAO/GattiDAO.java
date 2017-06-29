package com.myPackage.persistence.RepositoryDAO;

import com.myPackage.persistence.Entity.GattiENTITY;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by thebous on 29/06/17.
 */
public interface GattiDAO extends PagingAndSortingRepository<GattiENTITY, Integer> {
}
