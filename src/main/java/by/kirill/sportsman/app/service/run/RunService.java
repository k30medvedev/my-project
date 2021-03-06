package by.kirill.sportsman.app.service.run;

import by.kirill.sportsman.app.model.RunEntity;
import by.kirill.sportsman.app.repository.RunRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunService {

    private final RunRepository runRepository;
    private final RunSearchService runSearchService;
    private final RunUpdateService runUpdateService;
    private final RunCreateRunService runCreateRunService;

    public RunService(RunRepository runRepository,
                      RunSearchService runSearchService,
                      RunUpdateService runUpdateService,
                      RunCreateRunService runCreateRunService
    ) {
        this.runRepository = runRepository;
        this.runSearchService = runSearchService;
        this.runUpdateService = runUpdateService;
        this.runCreateRunService = runCreateRunService;

    }

    public RunEntity findById(Long id) {
        return runSearchService.findById(id);
    }

    public List<RunEntity> findAllRuns() {
        return runSearchService.findAllRuns();
    }

    public RunEntity createRun(RunEntity run) throws StarGreatThanFinisException, DistanceNotZeroException {
        return runCreateRunService.createRun(run);
    }

    public void deleteById(Long id) {
        runRepository.deleteById(id);
    }

    public RunEntity updateRun(Long id, RunEntity runEntity) {

        return runUpdateService.updateRun(id, runEntity);
    }
}
