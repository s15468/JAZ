package pl.pjatk.julcho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homework")
public class HomeworkController
{
    @GetMapping("/{pathVar}")
    public ResponseEntity<String> getPathVariable(@PathVariable String pathVar)
    {
        return ResponseEntity.ok(pathVar);
    }

    @GetMapping("/reqparam")
    public ResponseEntity<List<String>> getRequestParam(@RequestParam(required = false) List<String> reqParam)
    {
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping("/postcar")
    public ResponseEntity<Car> postCar(@RequestBody Car car)
    {
        return ResponseEntity.ok(car);
    }

    @PutMapping("/put/{pathVar}")
    public ResponseEntity<String> putPathVariable(@PathVariable String pathVar)
    {
        return ResponseEntity.ok(pathVar);
    }

    @PutMapping("/putcar")
    public ResponseEntity<Car> putCar(@RequestBody Car car)
    {
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("/delete/{pathVar}")
    public ResponseEntity deleteString(@PathVariable String pathVar)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

}
