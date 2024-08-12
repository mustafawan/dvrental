package com.wan.service;


import com.wan.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralService implements BaseService {

    private final ActorRepository actorRepository;
    private final AddressRepository addressRepository;
    private final CategoryRepository categoryRepository;
    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;
    private final CustomerRepository customerRepository;
    private final FilmRepository filmRepository;
    private final Film_ActorRepository filmActorRepository;
    private final Film_CategoryRepository filmCategoryRepository;
    private final InventoryRepository inventoryRepository;
    private final LanguageRepository languageRepository;
    private final PaymentRepository paymentRepository;
    private final RentalRepository rentalRepository;
    private final StaffRepository staffRepository;
    private final StoreRepository storeRepository;

    @Autowired
    public GeneralService(ActorRepository actorRepository, AddressRepository addressRepository, CategoryRepository categoryRepository, CityRepository cityRepository, CountryRepository countryRepository, CustomerRepository customerRepository, FilmRepository filmRepository, Film_ActorRepository filmActorRepository, Film_CategoryRepository filmCategoryRepository, InventoryRepository inventoryRepository, LanguageRepository languageRepository, PaymentRepository paymentRepository, RentalRepository rentalRepository, StaffRepository staffRepository, StoreRepository storeRepository) {
        this.actorRepository = actorRepository;
        this.addressRepository = addressRepository;
        this.categoryRepository = categoryRepository;
        this.cityRepository = cityRepository;
        this.countryRepository = countryRepository;
        this.customerRepository = customerRepository;
        this.filmRepository = filmRepository;
        this.filmActorRepository = filmActorRepository;
        this.filmCategoryRepository = filmCategoryRepository;
        this.inventoryRepository = inventoryRepository;
        this.languageRepository = languageRepository;
        this.paymentRepository = paymentRepository;
        this.rentalRepository = rentalRepository;
        this.staffRepository = staffRepository;
        this.storeRepository = storeRepository;
    }

    // Example method for testing
    public void test() {
        // Example usage of repositories
    }
}
