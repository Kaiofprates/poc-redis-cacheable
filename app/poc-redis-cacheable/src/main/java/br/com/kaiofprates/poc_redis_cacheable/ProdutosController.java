package br.com.kaiofprates.poc_redis_cacheable;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutosController {

    private final ProdutosService produtosService;

    @GetMapping("/{id}")
    @ResponseBody
    public Produto buscarProduto(@PathVariable("id") String id) {
        return produtosService.buscarProduto(id);
    }
}
