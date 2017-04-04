/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.zetosoftware.jeeuwm.business.pub.rest;

import pl.zetosoftware.jeeuwm.business.pub.repo.PowiatRepository;
import pl.zetosoftware.jeeuwm.dto.TestDTOResult;
import pl.zetosoftware.jeeuwm.model.uwm.Powiat;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * JAX-RS Example
 * <p/>
 * This class produces a RESTful service to read/write the contents of the members table.
 */
@Path("/powiatService")
public class PowiatRESTService {
    @Inject
    private Logger log;
    @Inject
    private PowiatRepository powiatRepository;

 
 
    @GET
    @Path("/powiat/{nazwa}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Powiat> wyszukajListePowiatow(@PathParam("nazwa") String nazwa) {
      return  powiatRepository.findNazwa(nazwa);
    }

    @GET
    @Path("/powiatLike/{nazwa}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Powiat> wyszukajListePowiatowLike(@PathParam("nazwa") String nazwa) {
        return  powiatRepository.findLikeNazwa(nazwa);
    }

    @GET
    @Path("/powiatAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Powiat> powiatAll() {
        log.log(Level.ALL, "podaj wartosc test");
        return powiatRepository.findAllOrderedByNazwa();
    }

    @GET
    @Path("/powiatWgWoj/{nazwaWoj}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findPowiatLikeNazwaWoj(@PathParam("nazwaWoj") String nazwaWoj) {
        return  powiatRepository.findPowiatLikeNazwaWoj(nazwaWoj);
    }

    @GET
    @Path("/powiatDTOWgWoj/{nazwaWoj}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find2PowiatLikeNazwaWoj(@PathParam("nazwaWoj") String nazwaWoj) {
        List<Powiat> lista = powiatRepository.find2PowiatLikeNazwaWoj(nazwisko);
        List<PowiatDTO> listaDTO = new Arraylist<>();
        for(Powiat powiat: lista){
            PowiatDTO dto = new PowiatDTO(powiat.getId(), powiat.getWojewodztwo().getId(), powiat.getWojewodztwo().getKodTeryt(), powiat.getNazwa());
            listaDTO.add(dto);
        }

        Response wynik = Response.ok(listaDTO).build();
        return  powiatRepository.findPowiatLikeNazwaWoj(nazwaWoj);
    }

}
