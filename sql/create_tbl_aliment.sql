-- Table: public.tbl_aliment

-- DROP TABLE IF EXISTS public.tbl_aliment;

CREATE TABLE IF NOT EXISTS public.tbl_aliment
(
    id numeric NOT NULL,
    shortname character varying COLLATE pg_catalog."default",
    name character varying COLLATE pg_catalog."default",
    marque character varying COLLATE pg_catalog."default",
    type character varying COLLATE pg_catalog."default",
    nutriscore character varying COLLATE pg_catalog."default",
    reference_id numeric,
    CONSTRAINT tbl_aliment_pkey PRIMARY KEY (id),
    CONSTRAINT reference_id FOREIGN KEY (reference_id)
    REFERENCES public.tbl_reference (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tbl_aliment
    OWNER to postgres;
