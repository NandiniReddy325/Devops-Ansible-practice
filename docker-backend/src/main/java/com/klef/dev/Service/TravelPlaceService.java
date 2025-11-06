package com.klef.dev.Service;

import java.util.List;
import com.klef.dev.Entity.TravelPlace;

public interface TravelPlaceService {
    TravelPlace addPlace(TravelPlace place);
    List<TravelPlace> getAllPlaces();
    TravelPlace getPlaceById(int id);
    TravelPlace updatePlace(TravelPlace place);
    void deletePlaceById(int id);
}
