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
package pl.zetosoftware.jeeuwm.business.pub.repo;

import pl.zetosoftware.jeeuwm.model.Member;
import pl.zetosoftware.jeeuwm.model.Member_;
import pl.zetosoftware.jeeuwm.model.uwm.Powiat;
import pl.zetosoftware.jeeuwm.model.uwm.Powiat_;
import pl.zetosoftware.jeeuwm.model.uwm.Wojewodztwo;
import pl.zetosoftware.jeeuwm.model.uwm.Wojewodztwo_;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class PowiatRepository {

    @Inject
    private EntityManager em;

    public Powiat findById(Long id) {
        return em.find(Powiat.class, id);
    }


    public List<Powiat> findAllOrderedByNazwa() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Powiat> criteria = cb.createQuery(Powiat.class);
        Root<Powiat> powiatRoot = criteria.from(Powiat.class);
        criteria.select(powiatRoot).orderBy(cb.asc(powiatRoot.get(Powiat_.nazwa)));
        return em.createQuery(criteria).getResultList();
    }

    public List<Powiat> findNazwa(String nazwa) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Powiat> criteria = cb.createQuery(Powiat.class);
        Root<Powiat> powiatRoot = criteria.from(Powiat.class);
        criteria.select(powiatRoot).where(cb.equal(powiatRoot.get(Powiat_.nazwa),nazwa))
                .orderBy(cb.asc(powiatRoot.get(Powiat_.nazwa)));
        return em.createQuery(criteria).getResultList();
    }

    public List<Powiat> findLikeNazwa(String nazwa) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Powiat> criteria = cb.createQuery(Powiat.class);
        Root<Powiat> powiatRoot = criteria.from(Powiat.class);

        criteria.select(powiatRoot).where(cb.like(powiatRoot.get(Powiat_.nazwa),nazwa+"%"))
                .orderBy(cb.asc(powiatRoot.get(Powiat_.nazwa)));

        return em.createQuery(criteria).getResultList();
    }

    public Response findPowiatLikeNazwaWoj(String nazwaWoj) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Powiat> criteria = cb.createQuery(Powiat.class);
        Root<Powiat> powiatRoot = criteria.from(Powiat.class);

        criteria.select(powiatRoot)
                .where(cb.or(cb.like(powiatRoot.get(Powiat_.wojewodztwo).get(Wojewodztwo_.nazwa),nazwaWoj.toUpperCase()+"%"),
                        cb.like(powiatRoot.get(Powiat_.wojewodztwo).get(Wojewodztwo_.nazwa),nazwaWoj.toLowerCase()+"%")))
                .orderBy( cb.asc(powiatRoot.get(Powiat_.wojewodztwo).get(Wojewodztwo_.nazwa)),cb.desc(powiatRoot.get(Powiat_.nazwa)));

        List<Powiat> wynik =em.createQuery(criteria).getResultList();
        return Response.ok(wynik).build();
    }


}
