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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventorySchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInventorySchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of inventory item to return.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Returns inventory schemas that support aggregation. For example, this call returns the
     * <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     * </p>
     */
    private Boolean aggregator;
    /**
     * <p>
     * Returns the sub-type schema for a specified inventory type.
     * </p>
     */
    private Boolean subType;

    /**
     * <p>
     * The type of inventory item to return.
     * </p>
     * 
     * @param typeName
     *        The type of inventory item to return.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The type of inventory item to return.
     * </p>
     * 
     * @return The type of inventory item to return.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The type of inventory item to return.
     * </p>
     * 
     * @param typeName
     *        The type of inventory item to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventorySchemaRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventorySchemaRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventorySchemaRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Returns inventory schemas that support aggregation. For example, this call returns the
     * <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     * </p>
     * 
     * @param aggregator
     *        Returns inventory schemas that support aggregation. For example, this call returns the
     *        <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the
     *        <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     */

    public void setAggregator(Boolean aggregator) {
        this.aggregator = aggregator;
    }

    /**
     * <p>
     * Returns inventory schemas that support aggregation. For example, this call returns the
     * <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     * </p>
     * 
     * @return Returns inventory schemas that support aggregation. For example, this call returns the
     *         <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the
     *         <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     */

    public Boolean getAggregator() {
        return this.aggregator;
    }

    /**
     * <p>
     * Returns inventory schemas that support aggregation. For example, this call returns the
     * <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     * </p>
     * 
     * @param aggregator
     *        Returns inventory schemas that support aggregation. For example, this call returns the
     *        <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the
     *        <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventorySchemaRequest withAggregator(Boolean aggregator) {
        setAggregator(aggregator);
        return this;
    }

    /**
     * <p>
     * Returns inventory schemas that support aggregation. For example, this call returns the
     * <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     * </p>
     * 
     * @return Returns inventory schemas that support aggregation. For example, this call returns the
     *         <code>AWS:InstanceInformation</code> type, because it supports aggregation based on the
     *         <code>PlatformName</code>, <code>PlatformType</code>, and <code>PlatformVersion</code> attributes.
     */

    public Boolean isAggregator() {
        return this.aggregator;
    }

    /**
     * <p>
     * Returns the sub-type schema for a specified inventory type.
     * </p>
     * 
     * @param subType
     *        Returns the sub-type schema for a specified inventory type.
     */

    public void setSubType(Boolean subType) {
        this.subType = subType;
    }

    /**
     * <p>
     * Returns the sub-type schema for a specified inventory type.
     * </p>
     * 
     * @return Returns the sub-type schema for a specified inventory type.
     */

    public Boolean getSubType() {
        return this.subType;
    }

    /**
     * <p>
     * Returns the sub-type schema for a specified inventory type.
     * </p>
     * 
     * @param subType
     *        Returns the sub-type schema for a specified inventory type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventorySchemaRequest withSubType(Boolean subType) {
        setSubType(subType);
        return this;
    }

    /**
     * <p>
     * Returns the sub-type schema for a specified inventory type.
     * </p>
     * 
     * @return Returns the sub-type schema for a specified inventory type.
     */

    public Boolean isSubType() {
        return this.subType;
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getAggregator() != null)
            sb.append("Aggregator: ").append(getAggregator()).append(",");
        if (getSubType() != null)
            sb.append("SubType: ").append(getSubType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInventorySchemaRequest == false)
            return false;
        GetInventorySchemaRequest other = (GetInventorySchemaRequest) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAggregator() == null ^ this.getAggregator() == null)
            return false;
        if (other.getAggregator() != null && other.getAggregator().equals(this.getAggregator()) == false)
            return false;
        if (other.getSubType() == null ^ this.getSubType() == null)
            return false;
        if (other.getSubType() != null && other.getSubType().equals(this.getSubType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAggregator() == null) ? 0 : getAggregator().hashCode());
        hashCode = prime * hashCode + ((getSubType() == null) ? 0 : getSubType().hashCode());
        return hashCode;
    }

    @Override
    public GetInventorySchemaRequest clone() {
        return (GetInventorySchemaRequest) super.clone();
    }

}
