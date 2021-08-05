package edu.onlineSchool.eSchool;

import edu.onlineSchool.eSchool.model.Pupils;
import edu.onlineSchool.eSchool.repo.PupilsMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping("/pupils")
    public class PupilResource {
        private PupilsMapper pupilsMapper;
        public PupilResource(PupilsMapper pupilMapper){
            this.pupilsMapper=pupilMapper;
        }

        @GetMapping("/all")
        public List<Pupils> findAll(){
            return pupilsMapper.getAll();
        }

        @PostMapping("/add")
        public List<Pupils> addPupil(@RequestBody Pupils pupil){
            pupilsMapper.addPupil(pupil);
            return pupilsMapper.getAll();
        }

        @DeleteMapping("/delete/{id}")
        public List<Pupils> deletePupil(@PathVariable("id") Integer id) {
            pupilsMapper.deletePupil(id);
            return pupilsMapper.getAll();
        }
}
