/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeDestinationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Will only return destinations that match the provided destinationNamePrefix. If you don't specify a value, no
     * prefix is applied.
     * </p>
     */
    private String destinationNamePrefix;

    private String nextToken;

    private Integer limit;

    /**
     * <p>
     * Will only return destinations that match the provided destinationNamePrefix. If you don't specify a value, no
     * prefix is applied.
     * </p>
     * 
     * @param destinationNamePrefix
     *        Will only return destinations that match the provided destinationNamePrefix. If you don't specify a value,
     *        no prefix is applied.
     */

    public void setDestinationNamePrefix(String destinationNamePrefix) {
        this.destinationNamePrefix = destinationNamePrefix;
    }

    /**
     * <p>
     * Will only return destinations that match the provided destinationNamePrefix. If you don't specify a value, no
     * prefix is applied.
     * </p>
     * 
     * @return Will only return destinations that match the provided destinationNamePrefix. If you don't specify a
     *         value, no prefix is applied.
     */

    public String getDestinationNamePrefix() {
        return this.destinationNamePrefix;
    }

    /**
     * <p>
     * Will only return destinations that match the provided destinationNamePrefix. If you don't specify a value, no
     * prefix is applied.
     * </p>
     * 
     * @param destinationNamePrefix
     *        Will only return destinations that match the provided destinationNamePrefix. If you don't specify a value,
     *        no prefix is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDestinationsRequest withDestinationNamePrefix(String destinationNamePrefix) {
        setDestinationNamePrefix(destinationNamePrefix);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDestinationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param limit
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDestinationsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDestinationNamePrefix() != null)
            sb.append("DestinationNamePrefix: " + getDestinationNamePrefix() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDestinationsRequest == false)
            return false;
        DescribeDestinationsRequest other = (DescribeDestinationsRequest) obj;
        if (other.getDestinationNamePrefix() == null ^ this.getDestinationNamePrefix() == null)
            return false;
        if (other.getDestinationNamePrefix() != null && other.getDestinationNamePrefix().equals(this.getDestinationNamePrefix()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationNamePrefix() == null) ? 0 : getDestinationNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDestinationsRequest clone() {
        return (DescribeDestinationsRequest) super.clone();
    }
}
