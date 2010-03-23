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
 * Delete Domain Request
 */
public class DeleteDomainRequest extends AmazonWebServiceRequest {
        
    /**
     * The name of the domain to delete.
     */
    private String domainName;

    /**
     * The name of the domain to delete.
     *
     * @return The name of the domain to delete.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain to delete.
     *
     * @param domainName The name of the domain to delete.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    
    
}
    