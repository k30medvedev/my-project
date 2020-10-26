package by.kirill.sportsman.app.service;

import by.kirill.sportsman.app.model.RunEntity;
import by.kirill.sportsman.app.repository.RunRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

@Validated
@Service
public class RunService {


    private final RunRepository runRepository;

    public RunService(RunRepository runRepository) {

        this.runRepository = runRepository;
    }

    public RunEntity findById(Long id) {
        return runRepository.getOne(id);
    }

    public List<RunEntity> findAllRuns() {
        return runRepository.findAll();
    }

    public RunEntity saveRun(@Valid RunEntity run) {
        return runRepository.save(run);
    }

    public void deleteById(Long id) {
        runRepository.deleteById(id);
    }

    public boolean ifExist(Long id) {
        return runRepository.existsById(id);
    }
//  updateRun (RunUpdateRequest RunUpdateRequest) {
//  findById( )}
}
