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
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#putAttributes(PutAttributesRequest) PutAttributes operation}.
 * <p>
 * The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes using a combination of the
 * <code>Attribute.X.Name</code> and <code>Attribute.X.Value</code> parameters. The client specifies the first attribute by the parameters
 * <code>Attribute.0.Name</code> and <code>Attribute.0.Value</code> ,
 * the second attribute by the parameters <code>Attribute.1.Name</code> and <code>Attribute.1.Value</code> , and so on.
 * </p>
 * <p>
 * Attributes are uniquely identified in an item by their name/value combination. For example, a single item can have the attributes <code>{
 * "first_name", "first_value" }</code> and <code>{ "first_name", second_value" }</code> . However, it cannot have two attribute instances where both the
 * <code>Attribute.X.Name</code> and <code>Attribute.X.Value</code> are the same.
 * </p>
 * <p>
 * Optionally, the requestor can supply the <code>Replace</code> parameter for each individual attribute. Setting this value to <code>true</code> causes
 * the new attribute value to replace the existing attribute value(s). For example, if an item has the attributes <code>{ 'a', '1' }</code> ,
 * 
 * <code>{ 'b', '2'}</code> and <code>{ 'b', '3' }</code> and the requestor calls <code>PutAttributes</code> using the attributes
 * <code>{ 'b', '4' }</code> with the <code>Replace</code> parameter set to true, the final attributes of the item are changed to <code>{ 'a', '1'
 * }</code> and <code>{ 'b', '4' }</code> , which replaces the previous values of the 'b' attribute with the new value.
 * </p>
 * <p>
 * <b>NOTE:</b> Using PutAttributes to replace attribute values that do not exist will not result in an error response.
 * </p>
 * <p>
 * You cannot specify an empty string as an attribute name.
 * </p>
 * <p>
 * Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an immediate GetAttributes or Select
 * operation (read) immediately after a PutAttributes or DeleteAttributes operation (write) might not return the updated data.
 * </p>
 * <p>
 * The following limitations are enforced for this operation:
 * <ul>
 * <li>256 total attribute name-value pairs per item</li>
 * <li>One billion attributes per domain</li>
 * <li>10 GB of total user data storage per domain</li>
 * 
 * </ul>
 * 
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#putAttributes(PutAttributesRequest)
 */
public class PutAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain in which to perform the operation.
     */
    private String domainName;

    /**
     * The name of the item.
     */
    private String itemName;

    /**
     * The list of attributes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute> attributes;

    /**
     * The update condition which, if specified, determines whether the
     * specified attributes will be updated or not. The update condition must
     * be satisfied in order for this request to be processed and the
     * attributes to be updated.
     */
    private UpdateCondition expected;

    /**
     * Default constructor for a new PutAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PutAttributesRequest() {}
    
    /**
     * Constructs a new PutAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain in which to perform the
     * operation.
     * @param itemName The name of the item.
     * @param attributes The list of attributes.
     */
    public PutAttributesRequest(String domainName, String itemName, java.util.List<ReplaceableAttribute> attributes) {
        setDomainName(domainName);
        setItemName(itemName);
        setAttributes(attributes);
    }

    /**
     * Constructs a new PutAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param domainName The name of the domain in which to perform the
     * operation.
     * @param itemName The name of the item.
     * @param attributes The list of attributes.
     * @param expected The update condition which, if specified, determines
     * whether the specified attributes will be updated or not. The update
     * condition must be satisfied in order for this request to be processed
     * and the attributes to be updated.
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
    public PutAttributesRequest withDomainName(String domainName) {
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
    public PutAttributesRequest withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    /**
     * The list of attributes.
     *
     * @return The list of attributes.
     */
    public java.util.List<ReplaceableAttribute> getAttributes() {
        if (attributes == null) {
              attributes = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute>();
              attributes.setAutoConstruct(true);
        }
        return attributes;
    }
    
    /**
     * The list of attributes.
     *
     * @param attributes The list of attributes.
     */
    public void setAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute>(attributes.size());
        attributesCopy.addAll(attributes);
        this.attributes = attributesCopy;
    }
    
    /**
     * The list of attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The list of attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutAttributesRequest withAttributes(ReplaceableAttribute... attributes) {
        if (getAttributes() == null) setAttributes(new java.util.ArrayList<ReplaceableAttribute>(attributes.length));
        for (ReplaceableAttribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * The list of attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The list of attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutAttributesRequest withAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReplaceableAttribute>(attributes.size());
            attributesCopy.addAll(attributes);
            this.attributes = attributesCopy;
        }

        return this;
    }

    /**
     * The update condition which, if specified, determines whether the
     * specified attributes will be updated or not. The update condition must
     * be satisfied in order for this request to be processed and the
     * attributes to be updated.
     *
     * @return The update condition which, if specified, determines whether the
     *         specified attributes will be updated or not. The update condition must
     *         be satisfied in order for this request to be processed and the
     *         attributes to be updated.
     */
    public UpdateCondition getExpected() {
        return expected;
    }
    
    /**
     * The update condition which, if specified, determines whether the
     * specified attributes will be updated or not. The update condition must
     * be satisfied in order for this request to be processed and the
     * attributes to be updated.
     *
     * @param expected The update condition which, if specified, determines whether the
     *         specified attributes will be updated or not. The update condition must
     *         be satisfied in order for this request to be processed and the
     *         attributes to be updated.
     */
    public void setExpected(UpdateCondition expected) {
        this.expected = expected;
    }
    
    /**
     * The update condition which, if specified, determines whether the
     * specified attributes will be updated or not. The update condition must
     * be satisfied in order for this request to be processed and the
     * attributes to be updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expected The update condition which, if specified, determines whether the
     *         specified attributes will be updated or not. The update condition must
     *         be satisfied in order for this request to be processed and the
     *         attributes to be updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutAttributesRequest withExpected(UpdateCondition expected) {
        this.expected = expected;
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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getItemName() != null) sb.append("ItemName: " + getItemName() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getExpected() != null) sb.append("Expected: " + getExpected() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutAttributesRequest == false) return false;
        PutAttributesRequest other = (PutAttributesRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getItemName() == null ^ this.getItemName() == null) return false;
        if (other.getItemName() != null && other.getItemName().equals(this.getItemName()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getExpected() == null ^ this.getExpected() == null) return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false) return false; 
        return true;
    }
    
}
    