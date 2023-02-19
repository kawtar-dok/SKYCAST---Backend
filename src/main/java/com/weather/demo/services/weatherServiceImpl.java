package com.weather.demo.services;

import com.weather.demo.dao.WeatherRepository;
import com.weather.demo.models.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class weatherServiceImpl implements weatherServiceTrue {

    private final WeatherRepository WeatherRepo;

    @Autowired
    public weatherServiceImpl(WeatherRepository weatherRepo) {
        WeatherRepo = weatherRepo;
    }

    /**
     * Permet de récupérer tous les patients
     *
     * @return List<Patient>
     */
   /* @Override
    public List<Weather> getAll() {
        return WeatherRepo.findAll();
    }*/

    @Override
    public List<Weather> getAll() {
        return WeatherRepo.findAll();
    }

    /**
     * Permet de sauvegarder un patient et aussi modifier
     * @param weather
     * @return weather
     */
    @Override
    public Weather save(Weather weather) {
        return WeatherRepo.save(weather);
    }

    /**
     * Permet de récupérer un patient par son id
     * @param id
     * @return Patient
     */
    @Override
    public Weather getById(Long id) {
        return WeatherRepo.findById(id).get();
    }

    /**
     * Permet de supprimer un patient par son id
     * @param id
     * @return void
     */
    @Override
    public void delete(Long id) {
        WeatherRepo.deleteById(id);
    }

    @Override
    public Weather getLastWeather() {
        return WeatherRepo.findTopByOrderByDateTimeDesc();
    }

}
