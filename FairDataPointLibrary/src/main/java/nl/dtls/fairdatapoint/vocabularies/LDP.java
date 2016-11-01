/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nl.dtls.fairdatapoint.vocabularies;


import org.openrdf.model.URI;
import org.openrdf.model.impl.URIImpl;

/**
 *
 * @author Rajaram Kaliyaperumal
 * @since 2016-08-24
 * @version 0.1
 */
public class LDP {
    public static final String uri = "<http://www.w3.org/ns/ldp#>";
    public static final String BASE_URI = "http://www.w3.org/ns/ldp#";   
    public static final URI CONTAINER = new URIImpl(BASE_URI + "Container" );
    public static final URI CONTAINS = new URIImpl(BASE_URI + "contains" );
}
