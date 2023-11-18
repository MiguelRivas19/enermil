-- Table: public.alim_repas

-- DROP TABLE IF EXISTS public.alim_repas;

CREATE TABLE IF NOT EXISTS public.alim_repas
(
    alim_id numeric NOT NULL,
    repas_id numeric NOT NULL,
    CONSTRAINT ali_repas_pkey PRIMARY KEY (alim_id, repas_id),
    CONSTRAINT aliment_id FOREIGN KEY (alim_id)
    REFERENCES public.tbl_aliment (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    CONSTRAINT repas_id FOREIGN KEY (repas_id)
    REFERENCES public.tbl_repas (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.alim_repas
    OWNER to postgres;
