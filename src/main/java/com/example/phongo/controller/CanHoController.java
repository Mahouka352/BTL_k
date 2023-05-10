package com.example.phongo.controller;

import com.example.phongo.model.CanHo;
import com.example.phongo.service.CanHoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/can-ho")
public class CanHoController {

    @Autowired
    private CanHoService canHoService;

    /**
     * tìm kiếm căn hộ theo id
     * @param id
     * @return
     */
    @GetMapping("/id")
    public ResponseEntity<CanHo> findByCanHoId(@RequestParam Long id)
    {

        Optional<CanHo> canHo = canHoService.getCanHoById(id);
        if(!canHo.isPresent())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(canHo.get(),HttpStatus.OK);
    }

    /**
     * tìm kiếm tất cả các căn hộ
     * @return
     */
    @GetMapping("/all")
    public ResponseEntity<Iterable<CanHo>> findAllCanHo()
    {

        Iterable<CanHo> canHo = canHoService.getAllCanHo();
        if(canHo==null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(canHo,HttpStatus.OK);
    }

    /**
     * chỉnh sửa và thêm căn hộ
     * @param canHo
     * @return
     */

    @PostMapping("/insert-update")
    public ResponseEntity save(@RequestBody CanHo canHo)
    {
        canHoService.insert(canHo);
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * xóa đi 1 căn hộ
     * @param canHo
     * @return
     */
    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestBody CanHo canHo)
    {
        canHoService.delete(canHo);
        return new ResponseEntity(HttpStatus.OK);
    }
}
