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
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#getAttributes(GetAttributesRequest) GetAttributes operation}.
 * <p>
 * Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be limited to one or more attributes by
 * specifying an attribute name parameter.
 * </p>
 * <p>
 * If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The system does not return an error as it
 * cannot guarantee the item does not exist on other replicas.
 * </p>
 * <p>
 * <b>NOTE:</b> If GetAttributes is called without being passed any attribute names, all the attributes for the item are returned.
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#getAttributes(GetAttributesRequest)
 */
public class GetAttributesRequest extends AmazonWebServiceRequest implements Serializable {

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
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributeNames;

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
     * Constructs a new GetAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain in which to perform the
     * operation.
     * @param itemName The name of the item.
     */
    public GetAttributesRequest(String domainName, String itemName) {
        setDomainName(domainName);
        setItemName(itemName);
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
              attributeNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              attributeNames.setAutoConstruct(true);
        }
        return attributeNames;
    }
    
    /**
     * The names of the attributes.
     *
     * @param attributeNames The names of the attributes.
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> attributeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributeNames.size());
        attributeNamesCopy.addAll(attributeNames);
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
        if (getAttributeNames() == null) setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
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
        if (attributeNames == null) {
            this.attributeNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributeNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributeNames.size());
            attributeNamesCopy.addAll(attributeNames);
            this.attributeNames = attributeNamesCopy;
        }

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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getItemName() != null) sb.append("ItemName: " + getItemName() + ",");
        if (getAttributeNames() != null) sb.append("AttributeNames: " + getAttributeNames() + ",");
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getItemName() == null) ? 0 : getItemName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAttributesRequest == false) return false;
        GetAttributesRequest other = (GetAttributesRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getItemName() == null ^ this.getItemName() == null) return false;
        if (other.getItemName() != null && other.getItemName().equals(this.getItemName()) == false) return false; 
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null) return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        return true;
    }
    
}
    