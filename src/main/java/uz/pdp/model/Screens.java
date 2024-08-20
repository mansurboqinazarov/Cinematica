package uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Screens {
    private int id;
    private String name;
    private int roomId;
    private int capacity;
}
