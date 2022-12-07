package com.trendyol.fleetmanagement.request;

import com.trendyol.fleetmanagement.request.subrequests.SubDeliveryPointRequest;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Set;

public record DeliveryPointToVehicleRequest(

        @ApiModelProperty(name = "Vehicle Plate")
        @NotBlank(message = "Vehicle Plate cannot be blank.")
        @Length(min = 7, max = 8, message = "Vehicle Plate must be between 7 and 8 characters.")
        String vehiclePlate,

        Set<SubDeliveryPointRequest> deliveryPointCodes
) {
}
