/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#createDomain(CreateDomainRequest) CreateDomain operation}.
 * <p>
 * The <code>CreateDomain</code> operation creates a new domain. The domain name should be unique among the domains associated with the Access Key ID
 * provided in the request. The <code>CreateDomain</code> operation may take 10 or more seconds to complete.
 * </p>
 * <p>
 * <b>NOTE:</b> CreateDomain is an idempotent operation; running it multiple times using the same domain name will not result in an error response.
 * </p>
 * <p>
 * The client can create up to 100 domains per account.
 * </p>
 * <p>
 * If the client requires additional domains, go to <a href="http://aws.amazon.com/contact-us/simpledb-limit-request/">
 * http://aws.amazon.com/contact-us/simpledb-limit-request/ </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#createDomain(CreateDomainRequest)
 */
public class CreateDomainRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain to create. The name can range between 3 and 255
     * characters and can contain the following characters: a-z, A-Z, 0-9,
     * '_', '-', and '.'.
     */
    private String domainName;

    /**
     * Default constructor for a new CreateDomainRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDomainRequest() {}
    
    /**
     * Constructs a new CreateDomainRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain to create. The name can range
     * between 3 and 255 characters and can contain the following characters:
     * a-z, A-Z, 0-9, '_', '-', and '.'.
     */
    public CreateDomainRequest(String domainName) {
        setDomainName(domainName);
    }

    /**
     * The name of the domain to create. The name can range between 3 and 255
     * characters and can contain the following characters: a-z, A-Z, 0-9,
     * '_', '-', and '.'.
     *
     * @return The name of the domain to create. The name can range between 3 and 255
     *         characters and can contain the following characters: a-z, A-Z, 0-9,
     *         '_', '-', and '.'.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain to create. The name can range between 3 and 255
     * characters and can contain the following characters: a-z, A-Z, 0-9,
     * '_', '-', and '.'.
     *
     * @param domainName The name of the domain to create. The name can range between 3 and 255
     *         characters and can contain the following characters: a-z, A-Z, 0-9,
     *         '_', '-', and '.'.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain to create. The name can range between 3 and 255
     * characters and can contain the following characters: a-z, A-Z, 0-9,
     * '_', '-', and '.'.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain to create. The name can range between 3 and 255
     *         characters and can contain the following characters: a-z, A-Z, 0-9,
     *         '_', '-', and '.'.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDomainRequest == false) return false;
        CreateDomainRequest other = (CreateDomainRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        return true;
    }
    
}
    