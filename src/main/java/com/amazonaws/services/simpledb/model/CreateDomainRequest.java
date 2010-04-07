/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Create Domain Request
 */
public class CreateDomainRequest extends AmazonWebServiceRequest {

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
     * Constructs a new CreateDomainRequest object and initializes the specified
     * object members.  Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain to create. The name can range
     * between 3 and 255 characters and can contain the following characters:
     * a-z, A-Z, 0-9, '_', '-', and '.'.
     */
    public CreateDomainRequest(String domainName) {
        this.domainName = domainName;
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
    
    
}
    