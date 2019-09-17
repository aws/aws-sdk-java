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
public class PutAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The name of the domain in which to perform the operation. */
    private String domainName;
    /** The name of the item. */
    private String itemName;
    /** The list of attributes. */
    private com.amazonaws.internal.SdkInternalList<ReplaceableAttribute> attributes;
    /**
     * The update condition which, if specified, determines whether the specified attributes will be updated or not. The
     * update condition must be satisfied in order for this request to be processed and the attributes to be updated.
     */
    private UpdateCondition expected;

    /**
     * Default constructor for PutAttributesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public PutAttributesRequest() {
    }

    /**
     * Constructs a new PutAttributesRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName
     *        The name of the domain in which to perform the operation.
     * @param itemName
     *        The name of the item.
     * @param attributes
     *        The list of attributes.
     */
    public PutAttributesRequest(String domainName, String itemName, java.util.List<ReplaceableAttribute> attributes) {
        setDomainName(domainName);
        setItemName(itemName);
        setAttributes(attributes);
    }

    /**
     * Constructs a new PutAttributesRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName
     *        The name of the domain in which to perform the operation.
     * @param itemName
     *        The name of the item.
     * @param attributes
     *        The list of attributes.
     * @param expected
     *        The update condition which, if specified, determines whether the specified attributes will be updated or
     *        not. The update condition must be satisfied in order for this request to be processed and the attributes
     *        to be updated.
     */
    public PutAttributesRequest(String domainName, String itemName, java.util.List<ReplaceableAttribute> attributes, UpdateCondition expected) {
        setDomainName(domainName);
        setItemName(itemName);
        setAttributes(attributes);
        setExpected(expected);
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

    public PutAttributesRequest withDomainName(String domainName) {
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

    public PutAttributesRequest withItemName(String itemName) {
        setItemName(itemName);
        return this;
    }

    /**
     * The list of attributes.
     * 
     * @return The list of attributes.
     */

    public java.util.List<ReplaceableAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<ReplaceableAttribute>();
        }
        return attributes;
    }

    /**
     * The list of attributes.
     * 
     * @param attributes
     *        The list of attributes.
     */

    public void setAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<ReplaceableAttribute>(attributes);
    }

    /**
     * The list of attributes.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The list of attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAttributesRequest withAttributes(ReplaceableAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<ReplaceableAttribute>(attributes.length));
        }
        for (ReplaceableAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * The list of attributes.
     * 
     * @param attributes
     *        The list of attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAttributesRequest withAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * The update condition which, if specified, determines whether the specified attributes will be updated or not. The
     * update condition must be satisfied in order for this request to be processed and the attributes to be updated.
     * 
     * @param expected
     *        The update condition which, if specified, determines whether the specified attributes will be updated or
     *        not. The update condition must be satisfied in order for this request to be processed and the attributes
     *        to be updated.
     */

    public void setExpected(UpdateCondition expected) {
        this.expected = expected;
    }

    /**
     * The update condition which, if specified, determines whether the specified attributes will be updated or not. The
     * update condition must be satisfied in order for this request to be processed and the attributes to be updated.
     * 
     * @return The update condition which, if specified, determines whether the specified attributes will be updated or
     *         not. The update condition must be satisfied in order for this request to be processed and the attributes
     *         to be updated.
     */

    public UpdateCondition getExpected() {
        return this.expected;
    }

    /**
     * The update condition which, if specified, determines whether the specified attributes will be updated or not. The
     * update condition must be satisfied in order for this request to be processed and the attributes to be updated.
     * 
     * @param expected
     *        The update condition which, if specified, determines whether the specified attributes will be updated or
     *        not. The update condition must be satisfied in order for this request to be processed and the attributes
     *        to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAttributesRequest withExpected(UpdateCondition expected) {
        setExpected(expected);
        return this;
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getExpected() != null)
            sb.append("Expected: ").append(getExpected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAttributesRequest == false)
            return false;
        PutAttributesRequest other = (PutAttributesRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getItemName() == null ^ this.getItemName() == null)
            return false;
        if (other.getItemName() != null && other.getItemName().equals(this.getItemName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getExpected() == null ^ this.getExpected() == null)
            return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getItemName() == null) ? 0 : getItemName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode());
        return hashCode;
    }

    @Override
    public PutAttributesRequest clone() {
        return (PutAttributesRequest) super.clone();
    }

}
