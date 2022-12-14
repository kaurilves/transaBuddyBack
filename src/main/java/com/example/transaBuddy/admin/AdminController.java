package com.example.transaBuddy.admin;

import com.example.transaBuddy.domain.shipment.shipmentprice.ShipmentPrice;
import com.example.transaBuddy.transabuddy.contact.ContactInfo;
import com.example.transaBuddy.transabuddy.shipment.ShipmentPriceInfo;
import com.example.transaBuddy.transabuddy.order.OrderInfo;
import com.example.transaBuddy.transabuddy.shipment.ShipmentPriceRequest;
import com.example.transaBuddy.transabuddy.shipment.ShipmentPriceResponse;
import com.example.transaBuddy.transabuddy.user.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @PatchMapping("/user/status")
    @Operation(summary = "Kliendi või kulleri konto  isActive staatuse muutmine")
    public void updateUserIsActiveStatus(@RequestBody UserResponse userResponse) {
        adminService.updateUserIsActiveStatus(userResponse);
    }

    @GetMapping("/users")
    @Operation(summary = "Kõikide kasutajate leidmine")
    public List<ContactInfo> getAllContacts() {
        return adminService.getAllContacts();

    }

    @GetMapping("/find")
    @Operation(summary = "Kasutajate leidmine erinevate parameetrite alusel")
    public List<ContactInfo> findContacts(String firstName, String lastName, String personalCode) {
        return adminService.findContacts(firstName, lastName, personalCode);
    }

    @GetMapping("/prices")
    @Operation(summary = "Get all shipment prices")
    public List<ShipmentPriceInfo> getAllPrices() {
        return adminService.getAllPrices();
    }

    @GetMapping("/orders")
    @Operation(summary = "Leiab kõik tellimused")
    public List<OrderInfo> getAllOrders() {
        return adminService.getAllOrders();
    }

    @PostMapping("/prices")
    @Operation(summary = "Add new price category")
    public ShipmentPriceResponse addPriceCategory(@RequestBody ShipmentPriceRequest request) {
        return adminService.addPriceCategory(request);
    }

    @PatchMapping("/prices")
    @Operation(summary = "Update existing prices by PriceID")
    public void updatePrice(@RequestBody ShipmentPriceInfo shipmentPriceInfo) {
        adminService.updatePrice(shipmentPriceInfo);
    }


}
