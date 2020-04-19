/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.msscbeerservice.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author arvisdev
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto
{
    private UUID id;
    private Integer version;
    
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedData;
    
    private String beerName;
    private BeerStyleEnum beerStyleEnum;
    
    private Long upc;
    private BigDecimal price;
    
    private Integer quantityOnHand;
    
}
