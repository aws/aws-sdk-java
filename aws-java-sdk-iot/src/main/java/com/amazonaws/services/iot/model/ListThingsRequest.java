/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the ListThings operation.
 * </p>
 */
public class ListThingsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The token for the next value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The attribute name.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The attribute value.
     * </p>
     */
    private String attributeValue;

    /**
     * <p>
     * The token for the next value.
     * </p>
     * 
     * @param nextToken
     *        The token for the next value.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next value.
     * </p>
     * 
     * @return The token for the next value.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next value.
     * </p>
     * 
     * @param nextToken
     *        The token for the next value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @return The maximum number of results.
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The attribute name.
     * </p>
     * 
     * @param attributeName
     *        The attribute name.
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name.
     * </p>
     * 
     * @return The attribute name.
     */
    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The attribute name.
     * </p>
     * 
     * @param attributeName
     *        The attribute name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The attribute value.
     * </p>
     * 
     * @param attributeValue
     *        The attribute value.
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The attribute value.
     * </p>
     * 
     * @return The attribute value.
     */
    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The attribute value.
     * </p>
     * 
     * @param attributeValue
     *        The attribute value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListThingsRequest withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: " + getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingsRequest == false)
            return false;
        ListThingsRequest other = (ListThingsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null
                ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null
                && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime
                * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAttributeValue() == null) ? 0 : getAttributeValue()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ListThingsRequest clone() {
        return (ListThingsRequest) super.clone();
    }
}