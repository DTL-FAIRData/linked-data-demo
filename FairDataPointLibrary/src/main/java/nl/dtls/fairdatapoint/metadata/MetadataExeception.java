/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dtls.fairdatapoint.metadata;

/**
 *
 * @author Rajaram Kaliyaperumal
 * @since 2016-08-24
 * @version 0.1
 */
public class MetadataExeception extends Exception {

    /**
     * Creates a new instance of <code>CatalogMetadataExeception</code> without
     * detail message.
     */
    public MetadataExeception() {
    }

    /**
     * Constructs an instance of <code>CatalogMetadataExeception</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MetadataExeception(String msg) {
        super(msg);
    }
}
