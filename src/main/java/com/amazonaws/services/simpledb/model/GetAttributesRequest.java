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
 * Get Attributes Request
 */
public class GetAttributesRequest extends AmazonWebServiceRequest {

    /**
     * The name of the domain in which to perform the operation.
     */
    private String domainName;

    /**
     * The name of the item.
     */
    private String itemName;

    /**
     * The names of the attributes.
     */
    private java.util.List<String> attributeNames;

    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     */
    private Boolean consistentRead;

    /**
     * Default constructor for a new GetAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetAttributesRequest() {}
    
    /**
     * Constructs a new GetAttributesRequest object and initializes the specified
     * object members.  Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain in which to perform the
     * operation.
     * @param itemName The name of the item.
     */
    public GetAttributesRequest(String domainName, String itemName) {
        this.domainName = domainName;
        this.itemName = itemName;
    }
    
    /**
     * The name of the domain in which to perform the operation.
     *
     * @return The name of the domain in which to perform the operation.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain in which to perform the operation.
     *
     * @param domainName The name of the domain in which to perform the operation.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain in which to perform the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain in which to perform the operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetAttributesRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    
    
    /**
     * The name of the item.
     *
     * @return The name of the item.
     */
    public String getItemName() {
        return itemName;
    }
    
    /**
     * The name of the item.
     *
     * @param itemName The name of the item.
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    /**
     * The name of the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemName The name of the item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetAttributesRequest withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    
    
    /**
     * The names of the attributes.
     *
     * @return The names of the attributes.
     */
    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new java.util.ArrayList<String>();
        }
        return attributeNames;
    }
    
    /**
     * The names of the attributes.
     *
     * @param attributeNames The names of the attributes.
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        java.util.List<String> attributeNamesCopy = new java.util.ArrayList<String>();
        if (attributeNames != null) {
            attributeNamesCopy.addAll(attributeNames);
        }
        this.attributeNames = attributeNamesCopy;
    }
    
    /**
     * The names of the attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames The names of the attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetAttributesRequest withAttributeNames(String... attributeNames) {
        for (String value : attributeNames) {
            getAttributeNames().add(value);
        }
        return this;
    }
    
    /**
     * The names of the attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames The names of the attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetAttributesRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        java.util.List<String> attributeNamesCopy = new java.util.ArrayList<String>();
        if (attributeNames != null) {
            attributeNamesCopy.addAll(attributeNames);
        }
        this.attributeNames = attributeNamesCopy;

        return this;
    }
    
    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     *
     * @return Determines whether or not strong consistency should be enforced when
     *         data is read from SimpleDB. If <code>true</code>, any data previously
     *         written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was
     *         written immediately before your read.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     *
     * @param consistentRead Determines whether or not strong consistency should be enforced when
     *         data is read from SimpleDB. If <code>true</code>, any data previously
     *         written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was
     *         written immediately before your read.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead Determines whether or not strong consistency should be enforced when
     *         data is read from SimpleDB. If <code>true</code>, any data previously
     *         written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was
     *         written immediately before your read.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetAttributesRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }
    
    
    /**
     * Determines whether or not strong consistency should be enforced when
     * data is read from SimpleDB. If <code>true</code>, any data previously
     * written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was
     * written immediately before your read.
     *
     * @return Determines whether or not strong consistency should be enforced when
     *         data is read from SimpleDB. If <code>true</code>, any data previously
     *         written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was
     *         written immediately before your read.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("DomainName: " + domainName + ", ");
        sb.append("ItemName: " + itemName + ", ");
        sb.append("AttributeNames: " + attributeNames + ", ");
        sb.append("ConsistentRead: " + consistentRead + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    