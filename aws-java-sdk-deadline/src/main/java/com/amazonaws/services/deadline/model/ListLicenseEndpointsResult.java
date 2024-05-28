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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ListLicenseEndpoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLicenseEndpointsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The license endpoints.
     * </p>
     */
    private java.util.List<LicenseEndpointSummary> licenseEndpoints;
    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The license endpoints.
     * </p>
     * 
     * @return The license endpoints.
     */

    public java.util.List<LicenseEndpointSummary> getLicenseEndpoints() {
        return licenseEndpoints;
    }

    /**
     * <p>
     * The license endpoints.
     * </p>
     * 
     * @param licenseEndpoints
     *        The license endpoints.
     */

    public void setLicenseEndpoints(java.util.Collection<LicenseEndpointSummary> licenseEndpoints) {
        if (licenseEndpoints == null) {
            this.licenseEndpoints = null;
            return;
        }

        this.licenseEndpoints = new java.util.ArrayList<LicenseEndpointSummary>(licenseEndpoints);
    }

    /**
     * <p>
     * The license endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseEndpoints(java.util.Collection)} or {@link #withLicenseEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param licenseEndpoints
     *        The license endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseEndpointsResult withLicenseEndpoints(LicenseEndpointSummary... licenseEndpoints) {
        if (this.licenseEndpoints == null) {
            setLicenseEndpoints(new java.util.ArrayList<LicenseEndpointSummary>(licenseEndpoints.length));
        }
        for (LicenseEndpointSummary ele : licenseEndpoints) {
            this.licenseEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The license endpoints.
     * </p>
     * 
     * @param licenseEndpoints
     *        The license endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseEndpointsResult withLicenseEndpoints(java.util.Collection<LicenseEndpointSummary> licenseEndpoints) {
        setLicenseEndpoints(licenseEndpoints);
        return this;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @return If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *         operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *         <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *         provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     * <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the operation
     * again using the returned token. Keep all other arguments unchanged. If no results remain, then
     * <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you provide
     * a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * </p>
     * 
     * @param nextToken
     *        If Deadline Cloud returns <code>nextToken</code>, then there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. To retrieve the next page, call the
     *        operation again using the returned token. Keep all other arguments unchanged. If no results remain, then
     *        <code>nextToken</code> is set to <code>null</code>. Each pagination token expires after 24 hours. If you
     *        provide a token that isn't valid, then you receive an HTTP 400 <code>ValidationException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseEndpointsResult withNextToken(String nextToken) {
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
        if (getLicenseEndpoints() != null)
            sb.append("LicenseEndpoints: ").append(getLicenseEndpoints()).append(",");
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

        if (obj instanceof ListLicenseEndpointsResult == false)
            return false;
        ListLicenseEndpointsResult other = (ListLicenseEndpointsResult) obj;
        if (other.getLicenseEndpoints() == null ^ this.getLicenseEndpoints() == null)
            return false;
        if (other.getLicenseEndpoints() != null && other.getLicenseEndpoints().equals(this.getLicenseEndpoints()) == false)
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

        hashCode = prime * hashCode + ((getLicenseEndpoints() == null) ? 0 : getLicenseEndpoints().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLicenseEndpointsResult clone() {
        try {
            return (ListLicenseEndpointsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
