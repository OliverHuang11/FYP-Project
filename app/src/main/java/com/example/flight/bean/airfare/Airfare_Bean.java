package com.example.flight.bean.airfare;

import com.google.gson.annotations.SerializedName;

public class Airfare_Bean {

    @SerializedName("context")
    private Context context;

    @SerializedName("itineraries")
    private Itinerary itineraries;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Itinerary getItineraries() {
        return itineraries;
    }

    public void setItineraries(Itinerary itineraries) {
        this.itineraries = itineraries;
    }

    @Override
    public String toString() {
        return "Airfare_Bean{" +
                "context=" + context +
                ", itineraries=" + itineraries +
                '}';
    }
}
