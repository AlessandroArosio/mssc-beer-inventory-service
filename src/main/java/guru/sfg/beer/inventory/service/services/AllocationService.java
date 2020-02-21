package guru.sfg.beer.inventory.service.services;

import guru.common.BeerOrderDto;

/**
 * @author Alessandro Arosio - 21/02/2020 20:59
 */
public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
