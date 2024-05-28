/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRegistrationVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * An array of registration version numbers.
     * </p>
     */
    private java.util.List<Long> versionNumbers;
    /**
     * <p>
     * An array of RegistrationVersionFilter objects to filter the results.
     * </p>
     */
    private java.util.List<RegistrationVersionFilter> filters;
    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @return The unique identifier for the registration.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationVersionsRequest withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
        return this;
    }

    /**
     * <p>
     * An array of registration version numbers.
     * </p>
     * 
     * @return An array of registration version numbers.
     */

    public java.util.List<Long> getVersionNumbers() {
        return versionNumbers;
    }

    /**
     * <p>
     * An array of registration version numbers.
     * </p>
     * 
     * @param versionNumbers
     *        An array of registration version numbers.
     */

    public void setVersionNumbers(java.util.Collection<Long> versionNumbers) {
        if (versionNumbers == null) {
            this.versionNumbers = null;
            return;
        }

        this.versionNumbers = new java.util.ArrayList<Long>(versionNumbers);
    }

    /**
     * <p>
     * An array of registration version numbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionNumbers(java.util.Collection)} or {@link #withVersionNumbers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param versionNumbers
     *        An array of registration version numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationVersionsRequest withVersionNumbers(Long... versionNumbers) {
        if (this.versionNumbers == null) {
            setVersionNumbers(new java.util.ArrayList<Long>(versionNumbers.length));
        }
        for (Long ele : versionNumbers) {
            this.versionNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of registration version numbers.
     * </p>
     * 
     * @param versionNumbers
     *        An array of registration version numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationVersionsRequest withVersionNumbers(java.util.Collection<Long> versionNumbers) {
        setVersionNumbers(versionNumbers);
        return this;
    }

    /**
     * <p>
     * An array of RegistrationVersionFilter objects to filter the results.
     * </p>
     * 
     * @return An array of RegistrationVersionFilter objects to filter the results.
     */

    public java.util.List<RegistrationVersionFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of RegistrationVersionFilter objects to filter the results.
     * </p>
     * 
     * @param filters
     *        An array of RegistrationVersionFilter objects to filter the results.
     */

    public void setFilters(java.util.Collection<RegistrationVersionFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<RegistrationVersionFilter>(filters);
    }

    /**
     * <p>
     * An array of RegistrationVersionFilter objects to filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of RegistrationVersionFilter objects to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationVersionsRequest withFilters(RegistrationVersionFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<RegistrationVersionFilter>(filters.length));
        }
        for (RegistrationVersionFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of RegistrationVersionFilter objects to filter the results.
     * </p>
     * 
     * @param filters
     *        An array of RegistrationVersionFilter objects to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationVersionsRequest withFilters(java.util.Collection<RegistrationVersionFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. You don't need to supply a value for this
     *         field in the initial request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per each request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @return The maximum number of results to return per each request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per each request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
        if (getVersionNumbers() != null)
            sb.append("VersionNumbers: ").append(getVersionNumbers()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRegistrationVersionsRequest == false)
            return false;
        DescribeRegistrationVersionsRequest other = (DescribeRegistrationVersionsRequest) obj;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
            return false;
        if (other.getVersionNumbers() == null ^ this.getVersionNumbers() == null)
            return false;
        if (other.getVersionNumbers() != null && other.getVersionNumbers().equals(this.getVersionNumbers()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumbers() == null) ? 0 : getVersionNumbers().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRegistrationVersionsRequest clone() {
        return (DescribeRegistrationVersionsRequest) super.clone();
    }

}
