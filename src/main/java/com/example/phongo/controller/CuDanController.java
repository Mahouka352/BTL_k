package com.example.phongo.controller;

import com.example.phongo.model.CanHo;
import com.example.phongo.model.CuDan;
import com.example.phongo.service.CuDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/cu-dan")
public class CuDanController {
    @Autowired
    private CuDanService cuDanService;

    /**
     * lấy ra Cư dân theo id
     * @param id
     * @return
     */
    @GetMapping("/id")
    public ResponseEntity<CuDan> findByCuDanId(@RequestParam Long id)
    {

        Optional<CuDan> cuDan = cuDanService.findByIdCuDan(id);
        if(!cuDan.isPresent())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(cuDan.get(),HttpStatus.OK);
    }

    /**
     * lấy ra tất cả các cư dân
     * @return
     */
    @GetMapping("/all")
    public ResponseEntity<Iterable<CuDan>> findAllCuDan()
    {

        Iterable<CuDan> cuDan = cuDanService.findAllCuDan();
        if(cuDan==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(cuDan,HttpStatus.OK);
    }

    /**
     * thêm hoặc chỉnh sửa thông tin cư dân
     * @param cuDan
     * @return
     */
    @PostMapping("/insert-update")
    public ResponseEntity save(@RequestBody CuDan cuDan)
    {
        cuDanService.save(cuDan);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * delete cư dân
     * @param cuDan
     * @return
     */
    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestBody CuDan cuDan)
    {
        cuDanService.delete(cuDan);
        return new ResponseEntity(HttpStatus.OK);
    }
}
