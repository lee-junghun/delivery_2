package delivery.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "shop", url = "${api.url.shop}")
public interface StoreOrderService {
    @RequestMapping(method= RequestMethod.POST, path="/storeOrders")
    public void orderCancel(@RequestBody StoreOrder storeOrder);
}

