package guru.common.events;

import guru.common.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alessandro Arosio - 22/02/2020 10:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocateOrderResult {
    private BeerOrderDto beerOrderDto;
    private Boolean allocationError = false;
    private Boolean pendingInventory = false;
}
