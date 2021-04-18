package pl.pjatk.julcho;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController
{
    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld(@RequestParam(required = false) String reqParam)
    {
        return ResponseEntity.ok(reqParam != null ? reqParam : "Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCarModel()
    {
        return ResponseEntity.ok(new Car());
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> getPathVariable(@PathVariable String someValue)
    {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello/test")
    public ResponseEntity<List<String>> getHelloWorld(@RequestParam(required = false) List<String> reqParam)
    {
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car)
    {
        return ResponseEntity.ok(car);
    }
}
