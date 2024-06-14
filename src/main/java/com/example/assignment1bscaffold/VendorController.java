package com.example.assignment1bscaffold;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// information expert
//  controller for MVC pattern
@Controller
public class VendorController {

    @GetMapping("/vendors")
    public String listVendors(Model model) {

        VendorList vendorList = new VendorList();

        vendorList.addVendor(new Vendor("Caterings co.", "catering", "1234567890", " full service "));

        vendorList.addVendor(new Vendor("Floral co.", "Decor", "88934567890", "Decor"));

        vendorList.addVendor(new Vendor("Fancy Photos", "photography", "6664567890", "weeding photography"));

        // iterator demo
        List<Vendor> vendors = new ArrayList<>();

        Iterator<Vendor> iterator = vendorList.iterator();

        while (iterator.hasNext()) {
            Vendor vendor = iterator.next();
            vendors.add(vendor);

        }

        model.addAttribute("vendors", vendors);

        return "vendors";
    }

}
