package com.myPackage.persistence.RepositoryDAO;

import com.myPackage.persistence.Entity.PadroneENTITY;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by thebous on 29/06/17.
 */
public interface PadronDAO extends PagingAndSortingRepository<PadroneENTITY, Integer> {
}
