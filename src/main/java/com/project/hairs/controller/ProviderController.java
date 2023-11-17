package com.project.hairs.controller;

import com.project.hairs.domain.pojo.ProviderPojo;
import com.project.hairs.domain.service.IProviderService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controlador rest de proveedor
 */
@RestController
@RequestMapping(path = "/proveedores")
@RequiredArgsConstructor
public class ProviderController {

    /**
     * Servicio de proveedor
     */
    private final IProviderService iProviderService;

    @GetMapping()
    public ResponseEntity<List<ProviderPojo>> getAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(iProviderService.getAll());
        //return new ResponseEntity<>(iProviderService.getAll(), HttpStatus.OK); ALTERNATIVA PARA CREAR RESPONSE_ENTITY
    }

    @GetMapping(path = "/{nit}")
    public ResponseEntity<ProviderPojo> getProvider(@PathVariable String nit) {
        return ResponseEntity.of(iProviderService.getProvider(nit));
    }

    @PostMapping
    public ResponseEntity<ProviderPojo> save(@RequestBody ProviderPojo newProviderPojo) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iProviderService.save(newProviderPojo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
