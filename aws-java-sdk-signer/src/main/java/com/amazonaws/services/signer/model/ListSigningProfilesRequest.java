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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningProfiles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSigningProfilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Designates whether to include profiles with the status of <code>CANCELED</code>.
     * </p>
     */
    private Boolean includeCanceled;
    /**
     * <p>
     * The maximum number of profiles to be returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Value for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Designates whether to include profiles with the status of <code>CANCELED</code>.
     * </p>
     * 
     * @param includeCanceled
     *        Designates whether to include profiles with the status of <code>CANCELED</code>.
     */

    public void setIncludeCanceled(Boolean includeCanceled) {
        this.includeCanceled = includeCanceled;
    }

    /**
     * <p>
     * Designates whether to include profiles with the status of <code>CANCELED</code>.
     * </p>
     * 
     * @return Designates whether to include profiles with the status of <code>CANCELED</code>.
     */

    public Boolean getIncludeCanceled() {
        return this.includeCanceled;
    }

    /**
     * <p>
     * Designates whether to include profiles with the status of <code>CANCELED</code>.
     * </p>
     * 
     * @param includeCanceled
     *        Designates whether to include profiles with the status of <code>CANCELED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningProfilesRequest withIncludeCanceled(Boolean includeCanceled) {
        setIncludeCanceled(includeCanceled);
        return this;
    }

    /**
     * <p>
     * Designates whether to include profiles with the status of <code>CANCELED</code>.
     * </p>
     * 
     * @return Designates whether to include profiles with the status of <code>CANCELED</code>.
     */

    public Boolean isIncludeCanceled() {
        return this.includeCanceled;
    }

    /**
     * <p>
     * The maximum number of profiles to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of profiles to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of profiles to be returned.
     * </p>
     * 
     * @return The maximum number of profiles to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of profiles to be returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of profiles to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningProfilesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @param nextToken
     *        Value for specifying the next set of paginated results to return. After you receive a response with
     *        truncated results, use this parameter in a subsequent request. Set it to the value of
     *        <code>nextToken</code> from the response that you just received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @return Value for specifying the next set of paginated results to return. After you receive a response with
     *         truncated results, use this parameter in a subsequent request. Set it to the value of
     *         <code>nextToken</code> from the response that you just received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @param nextToken
     *        Value for specifying the next set of paginated results to return. After you receive a response with
     *        truncated results, use this parameter in a subsequent request. Set it to the value of
     *        <code>nextToken</code> from the response that you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningProfilesRequest withNextToken(String nextToken) {
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
        if (getIncludeCanceled() != null)
            sb.append("IncludeCanceled: ").append(getIncludeCanceled()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListSigningProfilesRequest == false)
            return false;
        ListSigningProfilesRequest other = (ListSigningProfilesRequest) obj;
        if (other.getIncludeCanceled() == null ^ this.getIncludeCanceled() == null)
            return false;
        if (other.getIncludeCanceled() != null && other.getIncludeCanceled().equals(this.getIncludeCanceled()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getIncludeCanceled() == null) ? 0 : getIncludeCanceled().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSigningProfilesRequest clone() {
        return (ListSigningProfilesRequest) super.clone();
    }

}
