package com.example.phongo.controller;

import com.example.phongo.model.CuDan;
import com.example.phongo.model.DichVu;
import com.example.phongo.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/dich-vu")
public class DichVuController {

    @Autowired
    private DichVuService dichVuService;

    @GetMapping("/id")
    public ResponseEntity<DichVu> findByDichVuId(@RequestParam Long id)
    {

        Optional<DichVu> cuDan = dichVuService.findDichVuById(id);
        if(!cuDan.isPresent())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(cuDan.get(),HttpStatus.OK);
    }

    /**
     * lấy ra tất cả các cư dân
     * @return
     */
    @GetMapping("/all")
    public ResponseEntity<Iterable<DichVu>> findAllCuDan()
    {

        Iterable<DichVu> cuDan = dichVuService.findAllDichVu();
        if(cuDan==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(cuDan,HttpStatus.OK);
    }

    /**
     * chỉnh sửa hoặc insert thêm dịch vụ
     * @param dichVu
     * @return
     */
    @PostMapping("/insert-update")
    public ResponseEntity save(@RequestBody DichVu dichVu)
    {
        dichVuService.save(dichVu);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * xóa dịch vụ
     * @param dichVu
     * @return
     */
    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestBody DichVu dichVu)
    {
        dichVuService.delete(dichVu);
        return new ResponseEntity(HttpStatus.OK);
    }
}
