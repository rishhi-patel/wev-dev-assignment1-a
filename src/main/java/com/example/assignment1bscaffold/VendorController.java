package com.example.assignment1bscaffold;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VendorController {

    @GetMapping("/vendors")
    public String listVendors(Model model) {
        VendorList vendorList = new VendorList();
        vendorList.addVendor(new Vendor("Catering Co.", "Catering", "123-456-7890", "Full service"));
        vendorList.addVendor(new Vendor("Floral Wonders", "Florist", "123-456-7891", "Decor and bouquets"));
        vendorList.addVendor(new Vendor("Classic Photography", "Photography", "123-456-7892", "Wedding photography"));

        List<Vendor> vendors = new ArrayList<>();
        Iterator<Vendor> iterator = vendorList.iterator();
        while (iterator.hasNext()) {
            Vendor vendor = iterator.next();
            vendors.add(vendor); // Using the iterator to add each vendor to the model
        }

        model.addAttribute("vendors", vendors);
        return "vendors";
    }
}
