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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeAccountAttributesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeAccountAttributes(DescribeAccountAttributesRequest) DescribeAccountAttributes operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeAccountAttributes(DescribeAccountAttributesRequest)
 */
public class DescribeAccountAttributesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeAccountAttributesRequest> {

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributeNames;

    /**
     * Returns the value of the AttributeNames property for this object.
     *
     * @return The value of the AttributeNames property for this object.
     */
    public java.util.List<String> getAttributeNames() {
        if (attributeNames == null) {
              attributeNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              attributeNames.setAutoConstruct(true);
        }
        return attributeNames;
    }
    
    /**
     * Sets the value of the AttributeNames property for this object.
     *
     * @param attributeNames The new value for the AttributeNames property for this object.
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
     * Sets the value of the AttributeNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames The new value for the AttributeNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAccountAttributesRequest withAttributeNames(String... attributeNames) {
        if (getAttributeNames() == null) setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
        for (String value : attributeNames) {
            getAttributeNames().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AttributeNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames The new value for the AttributeNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAccountAttributesRequest withAttributeNames(java.util.Collection<String> attributeNames) {
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
     * Sets the value of the AttributeNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeNames The new value for the AttributeNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeAccountAttributesRequest withAttributeNames(AccountAttributeName... attributeNames) {
        java.util.ArrayList<String> attributeNamesCopy = new java.util.ArrayList<String>(attributeNames.length);
        for (AccountAttributeName member : attributeNames) {
            attributeNamesCopy.add(member.toString());
        }
        if (getAttributeNames() == null) {
            setAttributeNames(attributeNamesCopy);
        } else {
            getAttributeNames().addAll(attributeNamesCopy);
        }
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeAccountAttributesRequest> getDryRunRequest() {
        Request<DescribeAccountAttributesRequest> request = new DescribeAccountAttributesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getAttributeNames() != null) sb.append("AttributeNames: " + getAttributeNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAccountAttributesRequest == false) return false;
        DescribeAccountAttributesRequest other = (DescribeAccountAttributesRequest)obj;
        
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null) return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false) return false; 
        return true;
    }
    
}
    