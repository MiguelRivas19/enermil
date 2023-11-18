-- Table: public.tbl_reference

-- DROP TABLE IF EXISTS public.tbl_reference;

CREATE TABLE IF NOT EXISTS public.tbl_reference
(
    id numeric NOT NULL,
    quantite numeric,
    energie numeric,
    matieres_grasse numeric,
    glucides numeric,
    fibres_alimentaires double precision,
    proteines double precision,
    sel double precision,
    CONSTRAINT tbl_reference_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_reference
    OWNER to postgres;
