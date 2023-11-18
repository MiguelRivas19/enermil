-- Table: public.tbl_repas

-- DROP TABLE IF EXISTS public.tbl_repas;

CREATE TABLE IF NOT EXISTS public.tbl_repas
(
    id numeric NOT NULL,
    name character varying COLLATE pg_catalog."default",
    CONSTRAINT tbl_repas_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_repas
    OWNER to postgres;
