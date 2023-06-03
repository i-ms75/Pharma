package com.example.Pharma.repository;

import com.example.Pharma.model.POS;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Repository
public class DAO
{
    private final JdbcTemplate jdbcTemplate;

    public List<POS> findNameAndId()
    {
        String query="SELECT * from medicine";
        return jdbcTemplate.query(query,(rs,rowNum)->
        {
            POS pos=new POS();
            pos.setName(rs.getString("Name"));
            pos.setQuantity(String.valueOf(rs.getInt("Quantity")));
            pos.setRetail_Rate_Strip(String.valueOf(rs.getInt("Retail_Rate_Strip")));
            return pos;
        });
    }
}
