/*
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.partitions.model;

import com.amazonaws.Protocol;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

/**
 * Endpoint configuration.
 */
public class Endpoint {

    /**
     * endpoint string.
     */
    private String hostName;

    /**
     * credential scope for the endpoint.
     */
    private CredentialScope credentialScope;

    /**
     * supported schemes for the endpoint.
     */
    private Set<String> protocols;

    /**
     * supported signature versions of the endpoint.
     */
    private Set<String> signatureVersions;

    /**
     * ssl common name for the endpoint.
     */
    private String sslCommonName;

    /**
     * Merges the given endpoints and returns the merged one.
     */
    public static Endpoint merge(Endpoint defaults, Endpoint override) {

        if (defaults == null) {
            defaults = new Endpoint();
        }

        if (override == null) {
            override = new Endpoint();
        }

        final Endpoint merged = new Endpoint();

        merged.setCredentialScope(override.getCredentialScope() != null
                ? override.getCredentialScope()
                : defaults.getCredentialScope());

        merged.setHostName(override.getHostName() != null
                ? override.getHostName()
                : defaults.getHostName());

        merged.setSslCommonName(override.getSslCommonName() != null
                ? override.getSslCommonName()
                : defaults.getSslCommonName());

        merged.setProtocols(override.getProtocols() != null
                ? override.getProtocols()
                : defaults.getProtocols());

        merged.setSignatureVersions(override.getSignatureVersions() != null
                ? override.getSignatureVersions()
                : defaults.getSignatureVersions()
        );

        return merged;

    }

    /**
     * returns the endpoint string.
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * sets the endpoint string.
     */
    @JsonProperty(value = "hostname")
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * returns credential scope for the endpoint.
     */
    public CredentialScope getCredentialScope() {
        return credentialScope;
    }

    /**
     * sets the credential scope for the endpoint.
     */
    @JsonProperty(value = "credentialScope")
    public void setCredentialScope(CredentialScope credentialScope) {
        this.credentialScope = credentialScope;
    }

    /**
     * returns the supported schemes for the endpoint.
     */
    public Set<String> getProtocols() {
        return protocols;
    }

    /**
     * sets the supported schemes for the endpoint.
     */
    @JsonProperty(value = "protocols")
    public void setProtocols(Set<String> protocols) {
        this.protocols = protocols;
    }

    /**
     * returns the supported signature versions of the endpoint.
     */
    public Set<String> getSignatureVersions() {
        return signatureVersions;
    }

    /**
     * returns the supported signature versions of the endpoint.
     */
    @JsonProperty(value = "signatureVersions")
    public void setSignatureVersions(Set<String> signatureVersions) {
        this.signatureVersions = signatureVersions;
    }

    /**
     * returns the ssl common name for the endpoint.
     */
    public String getSslCommonName() {
        return sslCommonName;
    }

    /**
     * sets the ssl common name for the endpoint.
     */
    @JsonProperty(value = "sslCommonName")
    public void setSslCommonName(String sslCommonName) {
        this.sslCommonName = sslCommonName;
    }

    /**
     * A convienient methods that returns true if the endpoint support HTTPS
     * scheme. Returns false otherwise.
     */
    public boolean hasHttpsSupport() {
        return isProtocolSupported(Protocol.HTTPS);
    }

    /**
     * A convienient methods that returns true if the endpoint support HTTP
     * scheme. Returns false otherwise.
     */
    public boolean hasHttpSupport() {
        return isProtocolSupported(Protocol.HTTP);
    }

    private boolean isProtocolSupported(Protocol protocol) {
        return protocols != null && protocols.contains(protocol.toString());
    }

}
