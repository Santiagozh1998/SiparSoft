--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.15
-- Dumped by pg_dump version 9.5.15

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente (
    cedula integer NOT NULL,
    nombre character varying(20) NOT NULL,
    apellido character varying(20) NOT NULL,
    celular integer,
    direccion character varying(20)
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- Name: compra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.compra (
    nrofactura integer,
    codigo integer,
    lote integer,
    descripcion character varying(20),
    cantidad integer
);


ALTER TABLE public.compra OWNER TO postgres;

--
-- Name: empleado; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.empleado (
    cedula integer NOT NULL,
    nombre character varying(20) NOT NULL,
    apellido character varying(20) NOT NULL,
    tipoemp character varying(10) NOT NULL,
    celular integer NOT NULL,
    correo character varying(20),
    CONSTRAINT empleado_celular_check CHECK (((celular > 1000000) AND (celular < '9999999999'::bigint)))
);


ALTER TABLE public.empleado OWNER TO postgres;

--
-- Name: entrada; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.entrada (
    lote integer NOT NULL,
    descripcion character varying(250) NOT NULL,
    cantidad integer NOT NULL,
    preciolote integer NOT NULL,
    fecha date NOT NULL
);


ALTER TABLE public.entrada OWNER TO postgres;

--
-- Name: factura; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.factura (
    nrofactura integer NOT NULL,
    client integer,
    fecha date NOT NULL,
    valortotal integer NOT NULL
);


ALTER TABLE public.factura OWNER TO postgres;

--
-- Name: login; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.login (
    codusuario integer NOT NULL,
    contrasenia character varying(10) NOT NULL
);


ALTER TABLE public.login OWNER TO postgres;

--
-- Name: producto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.producto (
    codigo integer NOT NULL,
    lote integer NOT NULL,
    nombre character varying(20) NOT NULL,
    tipo character varying(10) NOT NULL,
    color character varying(20),
    cantidad integer NOT NULL,
    preciouni integer NOT NULL
);


ALTER TABLE public.producto OWNER TO postgres;

--
-- Name: provedor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.provedor (
    nit integer NOT NULL,
    nombre character varying(20) NOT NULL,
    telefono integer,
    direccion character varying(10)
);


ALTER TABLE public.provedor OWNER TO postgres;

--
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cliente (cedula, nombre, apellido, celular, direccion) FROM stdin;
\.


--
-- Data for Name: compra; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.compra (nrofactura, codigo, lote, descripcion, cantidad) FROM stdin;
\.


--
-- Data for Name: empleado; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.empleado (cedula, nombre, apellido, tipoemp, celular, correo) FROM stdin;
1234	juan carlos	ballesteros	almacen	1234567	juan@gmail
6753	maria paula	mosquera	admin	1863577	paula@gmail
\.


--
-- Data for Name: entrada; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.entrada (lote, descripcion, cantidad, preciolote, fecha) FROM stdin;
\.


--
-- Data for Name: factura; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.factura (nrofactura, client, fecha, valortotal) FROM stdin;
\.


--
-- Data for Name: login; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.login (codusuario, contrasenia) FROM stdin;
1234	1234
6753	6753
\.


--
-- Data for Name: producto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.producto (codigo, lote, nombre, tipo, color, cantidad, preciouni) FROM stdin;
\.


--
-- Data for Name: provedor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.provedor (nit, nombre, telefono, direccion) FROM stdin;
\.


--
-- Name: cliente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (cedula);


--
-- Name: empleado_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (cedula);


--
-- Name: entrada_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.entrada
    ADD CONSTRAINT entrada_pkey PRIMARY KEY (lote);


--
-- Name: factura_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.factura
    ADD CONSTRAINT factura_pkey PRIMARY KEY (nrofactura);


--
-- Name: login_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_pkey PRIMARY KEY (codusuario);


--
-- Name: producto_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pkey PRIMARY KEY (codigo, lote);


--
-- Name: provedor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.provedor
    ADD CONSTRAINT provedor_pkey PRIMARY KEY (nit);


--
-- Name: compra_codigo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compra
    ADD CONSTRAINT compra_codigo_fkey FOREIGN KEY (codigo, lote) REFERENCES public.producto(codigo, lote);


--
-- Name: compra_nrofactura_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.compra
    ADD CONSTRAINT compra_nrofactura_fkey FOREIGN KEY (nrofactura) REFERENCES public.factura(nrofactura);


--
-- Name: factura_client_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.factura
    ADD CONSTRAINT factura_client_fkey FOREIGN KEY (client) REFERENCES public.cliente(cedula);


--
-- Name: login_codusuario_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_codusuario_fkey FOREIGN KEY (codusuario) REFERENCES public.empleado(cedula);


--
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

