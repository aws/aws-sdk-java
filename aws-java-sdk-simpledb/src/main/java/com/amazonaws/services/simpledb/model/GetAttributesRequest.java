/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The name of the domain in which to perform the operation. */
    private String domainName;
    /** The name of the item. */
    private String itemName;
    /** The names of the attributes. */
    private com.amazonaws.internal.SdkInternalList<String> attributeNames;
    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     */
    private Boolean consistentRead;

    /**
     * Default constructor for GetAttributesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public GetAttributesRequest() {
    }

    /**
     * Constructs a new GetAttributesRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName
     *        The name of the domain in which to perform the operation.
     * @param itemName
     *        The name of the item.
     */
    public GetAttributesRequest(String domainName, String itemName) {
        setDomainName(domainName);
        setItemName(itemName);
    }

    /**
     * The name of the domain in which to perform the operation.
     * 
     * @param domainName
     *        The name of the domain in which to perform the operation.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The name of the domain in which to perform the operation.
     * 
     * @return The name of the domain in which to perform the operation.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The name of the domain in which to perform the operation.
     * 
     * @param domainName
     *        The name of the domain in which to perform the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributesRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * The name of the item.
     * 
     * @param itemName
     *        The name of the item.
     */

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * The name of the item.
     * 
     * @return The name of the item.
     */

    public String getItemName() {
        return this.itemName;
    }

    /**
     * The name of the item.
     * 
     * @param itemName
     *        The name of the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributesRequest withItemName(String itemName) {
        setItemName(itemName);
        return this;
    }

    /**
     * The names of the attributes.
     * 
     * @return The names of the attributes.
     */

    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
            attributeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return attributeNames;
    }

    /**
     * The names of the attributes.
     * 
     * @param attributeNames
     *        The names of the attributes.
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new com.amazonaws.internal.SdkInternalList<String>(attributeNames);
    }

    /**
     * The names of the attributes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        The names of the attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributesRequest withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new com.amazonaws.internal.SdkInternalList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * The names of the attributes.
     * 
     * @param attributeNames
     *        The names of the attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributesRequest withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     * 
     * @param consistentRead
     *        Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *        <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *        consistent eventually, and the client may not see data that was written immediately before your read.
     */

    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     * 
     * @return Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *         <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was written immediately before your read.
     */

    public Boolean getConsistentRead() {
        return this.consistentRead;
    }

    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     * 
     * @param consistentRead
     *        Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *        <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *        consistent eventually, and the client may not see data that was written immediately before your read.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributesRequest withConsistentRead(Boolean consistentRead) {
        setConsistentRead(consistentRead);
        return this;
    }

    /**
     * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     * <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     * consistent eventually, and the client may not see data that was written immediately before your read.
     * 
     * @return Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If
     *         <code>true</code>, any data previously written to SimpleDB will be returned. Otherwise, results will be
     *         consistent eventually, and the client may not see data that was written immediately before your read.
     */

    public Boolean isConsistentRead() {
        return this.consistentRead;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getItemName() != null)
            sb.append("ItemName: ").append(getItemName()).append(",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames()).append(",");
        if (getConsistentRead() != null)
            sb.append("ConsistentRead: ").append(getConsistentRead());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttributesRequest == false)
            return false;
        GetAttributesRequest other = (GetAttributesRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getItemName() == null ^ this.getItemName() == null)
            return false;
        if (other.getItemName() != null && other.getItemName().equals(this.getItemName()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        if (other.getConsistentRead() == null ^ this.getConsistentRead() == null)
            return false;
        if (other.getConsistentRead() != null && other.getConsistentRead().equals(this.getConsistentRead()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getItemName() == null) ? 0 : getItemName().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getConsistentRead() == null) ? 0 : getConsistentRead().hashCode());
        return hashCode;
    }

    @Override
    public GetAttributesRequest clone() {
        return (GetAttributesRequest) super.clone();
    }

}
