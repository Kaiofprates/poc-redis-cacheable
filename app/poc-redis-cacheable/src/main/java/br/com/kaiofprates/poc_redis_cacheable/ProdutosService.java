package br.com.kaiofprates.poc_redis_cacheable;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProdutosService {

    @Cacheable(value = "produtos", key = "#id", cacheManager = "cacheManager")
    public Produto buscarProduto(String id) {
        simulateDemora(); // Simula chamada lenta
        return new Produto(id);
    }

    private void simulateDemora() {
        try {
            Thread.sleep(1000); // 2 segundos de delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
