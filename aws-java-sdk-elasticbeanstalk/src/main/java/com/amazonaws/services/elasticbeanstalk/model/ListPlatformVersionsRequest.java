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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ListPlatformVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPlatformVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List only the platforms where the platform member value relates to one of the supplied values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlatformFilter> filters;
    /**
     * <p>
     * The maximum number of platform values returned in one call.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The starting index into the remaining list of platforms. Use the <code>NextToken</code> value from a previous
     * <code>ListPlatformVersion</code> call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List only the platforms where the platform member value relates to one of the supplied values.
     * </p>
     * 
     * @return List only the platforms where the platform member value relates to one of the supplied values.
     */

    public java.util.List<PlatformFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<PlatformFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * List only the platforms where the platform member value relates to one of the supplied values.
     * </p>
     * 
     * @param filters
     *        List only the platforms where the platform member value relates to one of the supplied values.
     */

    public void setFilters(java.util.Collection<PlatformFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<PlatformFilter>(filters);
    }

    /**
     * <p>
     * List only the platforms where the platform member value relates to one of the supplied values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        List only the platforms where the platform member value relates to one of the supplied values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformVersionsRequest withFilters(PlatformFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<PlatformFilter>(filters.length));
        }
        for (PlatformFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List only the platforms where the platform member value relates to one of the supplied values.
     * </p>
     * 
     * @param filters
     *        List only the platforms where the platform member value relates to one of the supplied values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformVersionsRequest withFilters(java.util.Collection<PlatformFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of platform values returned in one call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of platform values returned in one call.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of platform values returned in one call.
     * </p>
     * 
     * @return The maximum number of platform values returned in one call.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of platform values returned in one call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of platform values returned in one call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformVersionsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The starting index into the remaining list of platforms. Use the <code>NextToken</code> value from a previous
     * <code>ListPlatformVersion</code> call.
     * </p>
     * 
     * @param nextToken
     *        The starting index into the remaining list of platforms. Use the <code>NextToken</code> value from a
     *        previous <code>ListPlatformVersion</code> call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The starting index into the remaining list of platforms. Use the <code>NextToken</code> value from a previous
     * <code>ListPlatformVersion</code> call.
     * </p>
     * 
     * @return The starting index into the remaining list of platforms. Use the <code>NextToken</code> value from a
     *         previous <code>ListPlatformVersion</code> call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The starting index into the remaining list of platforms. Use the <code>NextToken</code> value from a previous
     * <code>ListPlatformVersion</code> call.
     * </p>
     * 
     * @param nextToken
     *        The starting index into the remaining list of platforms. Use the <code>NextToken</code> value from a
     *        previous <code>ListPlatformVersion</code> call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPlatformVersionsRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
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

        if (obj instanceof ListPlatformVersionsRequest == false)
            return false;
        ListPlatformVersionsRequest other = (ListPlatformVersionsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPlatformVersionsRequest clone() {
        return (ListPlatformVersionsRequest) super.clone();
    }

}
