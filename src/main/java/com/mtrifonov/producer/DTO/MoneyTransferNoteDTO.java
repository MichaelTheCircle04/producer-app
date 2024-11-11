package com.mtrifonov.producer.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @Mikhail Trifonov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferNoteDTO {
    
    private int senderId;
    private int recipientId;
    private int amount;
    private String message;  
}
