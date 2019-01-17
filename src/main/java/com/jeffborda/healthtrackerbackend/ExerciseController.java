package com.jeffborda.healthtrackerbackend;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExerciseController {
    @Autowired
    private ExerciseRepository exerciseRepo;

    @PostMapping("/exercise")
    public void createExercise(@RequestParam String title, @RequestParam String quantity, @RequestParam String description) {

        Exercise exercise = new Exercise(title, quantity, description);
        exerciseRepo.save(exercise);
    }

    @GetMapping("/exercise")
    public String getExercises() {

        Gson gson = new Gson();
        String testReturnJson =  gson.toJson(exerciseRepo.findAll());

        return testReturnJson;
    }


}
