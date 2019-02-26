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
package com.amazonaws.services.pricing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetAttributeValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttributeValuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     * <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code> <code>volumeType</code>.
     * </p>
     */
    private java.util.List<AttributeValue> attributeValues;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     * <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code> <code>volumeType</code>.
     * </p>
     * 
     * @return The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     *         <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code>
     *         <code>volumeType</code>.
     */

    public java.util.List<AttributeValue> getAttributeValues() {
        return attributeValues;
    }

    /**
     * <p>
     * The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     * <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code> <code>volumeType</code>.
     * </p>
     * 
     * @param attributeValues
     *        The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     *        <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code>
     *        <code>volumeType</code>.
     */

    public void setAttributeValues(java.util.Collection<AttributeValue> attributeValues) {
        if (attributeValues == null) {
            this.attributeValues = null;
            return;
        }

        this.attributeValues = new java.util.ArrayList<AttributeValue>(attributeValues);
    }

    /**
     * <p>
     * The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     * <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code> <code>volumeType</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeValues(java.util.Collection)} or {@link #withAttributeValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeValues
     *        The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     *        <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code>
     *        <code>volumeType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeValuesResult withAttributeValues(AttributeValue... attributeValues) {
        if (this.attributeValues == null) {
            setAttributeValues(new java.util.ArrayList<AttributeValue>(attributeValues.length));
        }
        for (AttributeValue ele : attributeValues) {
            this.attributeValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     * <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code> <code>volumeType</code>.
     * </p>
     * 
     * @param attributeValues
     *        The list of values for an attribute. For example, <code>Throughput Optimized HDD</code> and
     *        <code>Provisioned IOPS</code> are two available values for the <code>AmazonEC2</code>
     *        <code>volumeType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeValuesResult withAttributeValues(java.util.Collection<AttributeValue> attributeValues) {
        setAttributeValues(attributeValues);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttributeValuesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAttributeValues() != null)
            sb.append("AttributeValues: ").append(getAttributeValues()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttributeValuesResult == false)
            return false;
        GetAttributeValuesResult other = (GetAttributeValuesResult) obj;
        if (other.getAttributeValues() == null ^ this.getAttributeValues() == null)
            return false;
        if (other.getAttributeValues() != null && other.getAttributeValues().equals(this.getAttributeValues()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeValues() == null) ? 0 : getAttributeValues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAttributeValuesResult clone() {
        try {
            return (GetAttributeValuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
