package com.trv.kicker.model;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Player {

    /**
     */
    @NotNull
    @Column(unique = true)
    private String trvEmail;

    /**
     */
    @NotNull
    @Size(min = 4)
    private String nickName;
}
