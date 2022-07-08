package by.btslogistics.beltamozhservisproject.service;

import by.btslogistics.beltamozhservisproject.model.Check;
import by.btslogistics.beltamozhservisproject.repository.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckService {
    @Autowired
    private CheckRepository checkRepository;

    public void deleteCheckById(Long checkId) {
        checkRepository.deleteById(checkId);
    }

    public Check getCheckById (Long checkId) {
        return checkRepository.getById(checkId);
    }

    public void saveCheck(Check check) {
        checkRepository.save(check);
    }

    public void updateCheck(Check check) {
        checkRepository.save(check);
    }

    public List<Check> getAllChecks() {
        return checkRepository.findAll();
    }
}
