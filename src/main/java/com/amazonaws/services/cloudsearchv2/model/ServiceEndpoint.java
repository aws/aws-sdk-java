/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The endpoint to which service requests can be submitted, including the
 * actual URL prefix for sending requests and the Amazon Resource Name
 * (ARN) so the endpoint can be referenced in other API calls such as
 * UpdateServiceAccessPolicies.
 * </p>
 */
public class ServiceEndpoint implements Serializable {

    /**
     * The URL to which service requests can be submitted. Includes the API
     * version and path prefix. For example,
     * <code>search-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/search</code>
     * or
     * <code>doc-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/documents/batch</code>.
     */
    private String endpoint;

    /**
     * The URL to which service requests can be submitted. Includes the API
     * version and path prefix. For example,
     * <code>search-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/search</code>
     * or
     * <code>doc-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/documents/batch</code>.
     *
     * @return The URL to which service requests can be submitted. Includes the API
     *         version and path prefix. For example,
     *         <code>search-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/search</code>
     *         or
     *         <code>doc-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/documents/batch</code>.
     */
    public String getEndpoint() {
        return endpoint;
    }
    
    /**
     * The URL to which service requests can be submitted. Includes the API
     * version and path prefix. For example,
     * <code>search-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/search</code>
     * or
     * <code>doc-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/documents/batch</code>.
     *
     * @param endpoint The URL to which service requests can be submitted. Includes the API
     *         version and path prefix. For example,
     *         <code>search-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/search</code>
     *         or
     *         <code>doc-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/documents/batch</code>.
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * The URL to which service requests can be submitted. Includes the API
     * version and path prefix. For example,
     * <code>search-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/search</code>
     * or
     * <code>doc-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/documents/batch</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoint The URL to which service requests can be submitted. Includes the API
     *         version and path prefix. For example,
     *         <code>search-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/search</code>
     *         or
     *         <code>doc-imdb-movies-oopcnjfn6ugofer3zx5iadxxca.eu-west-1.cloudsearch.amazonaws.com/2013-01-01/documents/batch</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ServiceEndpoint withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpoint() != null) sb.append("Endpoint: " + getEndpoint() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ServiceEndpoint == false) return false;
        ServiceEndpoint other = (ServiceEndpoint)obj;
        
        if (other.getEndpoint() == null ^ this.getEndpoint() == null) return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false) return false; 
        return true;
    }
    
}
    