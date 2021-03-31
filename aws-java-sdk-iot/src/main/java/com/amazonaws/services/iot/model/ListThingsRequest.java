/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the ListThings operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The attribute name used to search for things.
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The attribute value used to search for things.
     * </p>
     */
    private String attributeValue;
    /**
     * <p>
     * The name of the thing type used to search for things.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * When <code>true</code>, the action returns the thing resources with attribute values that start with the
     * <code>attributeValue</code> provided.
     * </p>
     * <p>
     * When <code>false</code>, or not present, the action returns only the thing resources with attribute values that
     * match the entire <code>attributeValue</code> provided.
     * </p>
     */
    private Boolean usePrefixAttributeValue;

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @return To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *         <b>null</b> to receive the first set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     * <b>null</b> to receive the first set of results.
     * </p>
     * 
     * @param nextToken
     *        To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise
     *        <b>null</b> to receive the first set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this operation.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @return The maximum number of results to return in this operation.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in this operation.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The attribute name used to search for things.
     * </p>
     * 
     * @param attributeName
     *        The attribute name used to search for things.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The attribute name used to search for things.
     * </p>
     * 
     * @return The attribute name used to search for things.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The attribute name used to search for things.
     * </p>
     * 
     * @param attributeName
     *        The attribute name used to search for things.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The attribute value used to search for things.
     * </p>
     * 
     * @param attributeValue
     *        The attribute value used to search for things.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The attribute value used to search for things.
     * </p>
     * 
     * @return The attribute value used to search for things.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The attribute value used to search for things.
     * </p>
     * 
     * @param attributeValue
     *        The attribute value used to search for things.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsRequest withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
        return this;
    }

    /**
     * <p>
     * The name of the thing type used to search for things.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type used to search for things.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type used to search for things.
     * </p>
     * 
     * @return The name of the thing type used to search for things.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type used to search for things.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type used to search for things.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsRequest withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the action returns the thing resources with attribute values that start with the
     * <code>attributeValue</code> provided.
     * </p>
     * <p>
     * When <code>false</code>, or not present, the action returns only the thing resources with attribute values that
     * match the entire <code>attributeValue</code> provided.
     * </p>
     * 
     * @param usePrefixAttributeValue
     *        When <code>true</code>, the action returns the thing resources with attribute values that start with the
     *        <code>attributeValue</code> provided.</p>
     *        <p>
     *        When <code>false</code>, or not present, the action returns only the thing resources with attribute values
     *        that match the entire <code>attributeValue</code> provided.
     */

    public void setUsePrefixAttributeValue(Boolean usePrefixAttributeValue) {
        this.usePrefixAttributeValue = usePrefixAttributeValue;
    }

    /**
     * <p>
     * When <code>true</code>, the action returns the thing resources with attribute values that start with the
     * <code>attributeValue</code> provided.
     * </p>
     * <p>
     * When <code>false</code>, or not present, the action returns only the thing resources with attribute values that
     * match the entire <code>attributeValue</code> provided.
     * </p>
     * 
     * @return When <code>true</code>, the action returns the thing resources with attribute values that start with the
     *         <code>attributeValue</code> provided.</p>
     *         <p>
     *         When <code>false</code>, or not present, the action returns only the thing resources with attribute
     *         values that match the entire <code>attributeValue</code> provided.
     */

    public Boolean getUsePrefixAttributeValue() {
        return this.usePrefixAttributeValue;
    }

    /**
     * <p>
     * When <code>true</code>, the action returns the thing resources with attribute values that start with the
     * <code>attributeValue</code> provided.
     * </p>
     * <p>
     * When <code>false</code>, or not present, the action returns only the thing resources with attribute values that
     * match the entire <code>attributeValue</code> provided.
     * </p>
     * 
     * @param usePrefixAttributeValue
     *        When <code>true</code>, the action returns the thing resources with attribute values that start with the
     *        <code>attributeValue</code> provided.</p>
     *        <p>
     *        When <code>false</code>, or not present, the action returns only the thing resources with attribute values
     *        that match the entire <code>attributeValue</code> provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThingsRequest withUsePrefixAttributeValue(Boolean usePrefixAttributeValue) {
        setUsePrefixAttributeValue(usePrefixAttributeValue);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, the action returns the thing resources with attribute values that start with the
     * <code>attributeValue</code> provided.
     * </p>
     * <p>
     * When <code>false</code>, or not present, the action returns only the thing resources with attribute values that
     * match the entire <code>attributeValue</code> provided.
     * </p>
     * 
     * @return When <code>true</code>, the action returns the thing resources with attribute values that start with the
     *         <code>attributeValue</code> provided.</p>
     *         <p>
     *         When <code>false</code>, or not present, the action returns only the thing resources with attribute
     *         values that match the entire <code>attributeValue</code> provided.
     */

    public Boolean isUsePrefixAttributeValue() {
        return this.usePrefixAttributeValue;
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue()).append(",");
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getUsePrefixAttributeValue() != null)
            sb.append("UsePrefixAttributeValue: ").append(getUsePrefixAttributeValue());
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
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getUsePrefixAttributeValue() == null ^ this.getUsePrefixAttributeValue() == null)
            return false;
        if (other.getUsePrefixAttributeValue() != null && other.getUsePrefixAttributeValue().equals(this.getUsePrefixAttributeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getUsePrefixAttributeValue() == null) ? 0 : getUsePrefixAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public ListThingsRequest clone() {
        return (ListThingsRequest) super.clone();
    }

}
