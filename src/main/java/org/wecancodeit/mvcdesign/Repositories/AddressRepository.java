package org.wecancodeit.mvcdesign.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.mvcdesign.Models.AddressModel;

public interface AddressRepository  extends CrudRepository<AddressModel, Long> {
    
}
