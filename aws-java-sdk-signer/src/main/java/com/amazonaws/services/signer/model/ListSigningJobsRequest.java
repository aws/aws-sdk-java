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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSigningJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A status value with which to filter your results.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ID of microcontroller platform that you specified for the distribution of your code image.
     * </p>
     */
    private String platformId;
    /**
     * <p>
     * The IAM principal that requested the signing job.
     * </p>
     */
    private String requestedBy;
    /**
     * <p>
     * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If
     * additional items exist beyond the number you specify, the <code>nextToken</code> element is set in the response.
     * Use the <code>nextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * String for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Filters results to return only signing jobs with revoked signatures.
     * </p>
     */
    private Boolean isRevoked;
    /**
     * <p>
     * Filters results to return only signing jobs with signatures expiring before a specified timestamp.
     * </p>
     */
    private java.util.Date signatureExpiresBefore;
    /**
     * <p>
     * Filters results to return only signing jobs with signatures expiring after a specified timestamp.
     * </p>
     */
    private java.util.Date signatureExpiresAfter;
    /**
     * <p>
     * Filters results to return only signing jobs initiated by a specified IAM entity.
     * </p>
     */
    private String jobInvoker;

    /**
     * <p>
     * A status value with which to filter your results.
     * </p>
     * 
     * @param status
     *        A status value with which to filter your results.
     * @see SigningStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status value with which to filter your results.
     * </p>
     * 
     * @return A status value with which to filter your results.
     * @see SigningStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A status value with which to filter your results.
     * </p>
     * 
     * @param status
     *        A status value with which to filter your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningStatus
     */

    public ListSigningJobsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A status value with which to filter your results.
     * </p>
     * 
     * @param status
     *        A status value with which to filter your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningStatus
     */

    public ListSigningJobsRequest withStatus(SigningStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ID of microcontroller platform that you specified for the distribution of your code image.
     * </p>
     * 
     * @param platformId
     *        The ID of microcontroller platform that you specified for the distribution of your code image.
     */

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    /**
     * <p>
     * The ID of microcontroller platform that you specified for the distribution of your code image.
     * </p>
     * 
     * @return The ID of microcontroller platform that you specified for the distribution of your code image.
     */

    public String getPlatformId() {
        return this.platformId;
    }

    /**
     * <p>
     * The ID of microcontroller platform that you specified for the distribution of your code image.
     * </p>
     * 
     * @param platformId
     *        The ID of microcontroller platform that you specified for the distribution of your code image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsRequest withPlatformId(String platformId) {
        setPlatformId(platformId);
        return this;
    }

    /**
     * <p>
     * The IAM principal that requested the signing job.
     * </p>
     * 
     * @param requestedBy
     *        The IAM principal that requested the signing job.
     */

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    /**
     * <p>
     * The IAM principal that requested the signing job.
     * </p>
     * 
     * @return The IAM principal that requested the signing job.
     */

    public String getRequestedBy() {
        return this.requestedBy;
    }

    /**
     * <p>
     * The IAM principal that requested the signing job.
     * </p>
     * 
     * @param requestedBy
     *        The IAM principal that requested the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsRequest withRequestedBy(String requestedBy) {
        setRequestedBy(requestedBy);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If
     * additional items exist beyond the number you specify, the <code>nextToken</code> element is set in the response.
     * Use the <code>nextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of items to return in the response. Use this parameter when paginating
     *        results. If additional items exist beyond the number you specify, the <code>nextToken</code> element is
     *        set in the response. Use the <code>nextToken</code> value in a subsequent request to retrieve additional
     *        items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If
     * additional items exist beyond the number you specify, the <code>nextToken</code> element is set in the response.
     * Use the <code>nextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @return Specifies the maximum number of items to return in the response. Use this parameter when paginating
     *         results. If additional items exist beyond the number you specify, the <code>nextToken</code> element is
     *         set in the response. Use the <code>nextToken</code> value in a subsequent request to retrieve additional
     *         items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of items to return in the response. Use this parameter when paginating results. If
     * additional items exist beyond the number you specify, the <code>nextToken</code> element is set in the response.
     * Use the <code>nextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of items to return in the response. Use this parameter when paginating
     *        results. If additional items exist beyond the number you specify, the <code>nextToken</code> element is
     *        set in the response. Use the <code>nextToken</code> value in a subsequent request to retrieve additional
     *        items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @param nextToken
     *        String for specifying the next set of paginated results to return. After you receive a response with
     *        truncated results, use this parameter in a subsequent request. Set it to the value of
     *        <code>nextToken</code> from the response that you just received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @return String for specifying the next set of paginated results to return. After you receive a response with
     *         truncated results, use this parameter in a subsequent request. Set it to the value of
     *         <code>nextToken</code> from the response that you just received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * String for specifying the next set of paginated results to return. After you receive a response with truncated
     * results, use this parameter in a subsequent request. Set it to the value of <code>nextToken</code> from the
     * response that you just received.
     * </p>
     * 
     * @param nextToken
     *        String for specifying the next set of paginated results to return. After you receive a response with
     *        truncated results, use this parameter in a subsequent request. Set it to the value of
     *        <code>nextToken</code> from the response that you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with revoked signatures.
     * </p>
     * 
     * @param isRevoked
     *        Filters results to return only signing jobs with revoked signatures.
     */

    public void setIsRevoked(Boolean isRevoked) {
        this.isRevoked = isRevoked;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with revoked signatures.
     * </p>
     * 
     * @return Filters results to return only signing jobs with revoked signatures.
     */

    public Boolean getIsRevoked() {
        return this.isRevoked;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with revoked signatures.
     * </p>
     * 
     * @param isRevoked
     *        Filters results to return only signing jobs with revoked signatures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsRequest withIsRevoked(Boolean isRevoked) {
        setIsRevoked(isRevoked);
        return this;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with revoked signatures.
     * </p>
     * 
     * @return Filters results to return only signing jobs with revoked signatures.
     */

    public Boolean isRevoked() {
        return this.isRevoked;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with signatures expiring before a specified timestamp.
     * </p>
     * 
     * @param signatureExpiresBefore
     *        Filters results to return only signing jobs with signatures expiring before a specified timestamp.
     */

    public void setSignatureExpiresBefore(java.util.Date signatureExpiresBefore) {
        this.signatureExpiresBefore = signatureExpiresBefore;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with signatures expiring before a specified timestamp.
     * </p>
     * 
     * @return Filters results to return only signing jobs with signatures expiring before a specified timestamp.
     */

    public java.util.Date getSignatureExpiresBefore() {
        return this.signatureExpiresBefore;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with signatures expiring before a specified timestamp.
     * </p>
     * 
     * @param signatureExpiresBefore
     *        Filters results to return only signing jobs with signatures expiring before a specified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsRequest withSignatureExpiresBefore(java.util.Date signatureExpiresBefore) {
        setSignatureExpiresBefore(signatureExpiresBefore);
        return this;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with signatures expiring after a specified timestamp.
     * </p>
     * 
     * @param signatureExpiresAfter
     *        Filters results to return only signing jobs with signatures expiring after a specified timestamp.
     */

    public void setSignatureExpiresAfter(java.util.Date signatureExpiresAfter) {
        this.signatureExpiresAfter = signatureExpiresAfter;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with signatures expiring after a specified timestamp.
     * </p>
     * 
     * @return Filters results to return only signing jobs with signatures expiring after a specified timestamp.
     */

    public java.util.Date getSignatureExpiresAfter() {
        return this.signatureExpiresAfter;
    }

    /**
     * <p>
     * Filters results to return only signing jobs with signatures expiring after a specified timestamp.
     * </p>
     * 
     * @param signatureExpiresAfter
     *        Filters results to return only signing jobs with signatures expiring after a specified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsRequest withSignatureExpiresAfter(java.util.Date signatureExpiresAfter) {
        setSignatureExpiresAfter(signatureExpiresAfter);
        return this;
    }

    /**
     * <p>
     * Filters results to return only signing jobs initiated by a specified IAM entity.
     * </p>
     * 
     * @param jobInvoker
     *        Filters results to return only signing jobs initiated by a specified IAM entity.
     */

    public void setJobInvoker(String jobInvoker) {
        this.jobInvoker = jobInvoker;
    }

    /**
     * <p>
     * Filters results to return only signing jobs initiated by a specified IAM entity.
     * </p>
     * 
     * @return Filters results to return only signing jobs initiated by a specified IAM entity.
     */

    public String getJobInvoker() {
        return this.jobInvoker;
    }

    /**
     * <p>
     * Filters results to return only signing jobs initiated by a specified IAM entity.
     * </p>
     * 
     * @param jobInvoker
     *        Filters results to return only signing jobs initiated by a specified IAM entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningJobsRequest withJobInvoker(String jobInvoker) {
        setJobInvoker(jobInvoker);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPlatformId() != null)
            sb.append("PlatformId: ").append(getPlatformId()).append(",");
        if (getRequestedBy() != null)
            sb.append("RequestedBy: ").append(getRequestedBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getIsRevoked() != null)
            sb.append("IsRevoked: ").append(getIsRevoked()).append(",");
        if (getSignatureExpiresBefore() != null)
            sb.append("SignatureExpiresBefore: ").append(getSignatureExpiresBefore()).append(",");
        if (getSignatureExpiresAfter() != null)
            sb.append("SignatureExpiresAfter: ").append(getSignatureExpiresAfter()).append(",");
        if (getJobInvoker() != null)
            sb.append("JobInvoker: ").append(getJobInvoker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSigningJobsRequest == false)
            return false;
        ListSigningJobsRequest other = (ListSigningJobsRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPlatformId() == null ^ this.getPlatformId() == null)
            return false;
        if (other.getPlatformId() != null && other.getPlatformId().equals(this.getPlatformId()) == false)
            return false;
        if (other.getRequestedBy() == null ^ this.getRequestedBy() == null)
            return false;
        if (other.getRequestedBy() != null && other.getRequestedBy().equals(this.getRequestedBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getIsRevoked() == null ^ this.getIsRevoked() == null)
            return false;
        if (other.getIsRevoked() != null && other.getIsRevoked().equals(this.getIsRevoked()) == false)
            return false;
        if (other.getSignatureExpiresBefore() == null ^ this.getSignatureExpiresBefore() == null)
            return false;
        if (other.getSignatureExpiresBefore() != null && other.getSignatureExpiresBefore().equals(this.getSignatureExpiresBefore()) == false)
            return false;
        if (other.getSignatureExpiresAfter() == null ^ this.getSignatureExpiresAfter() == null)
            return false;
        if (other.getSignatureExpiresAfter() != null && other.getSignatureExpiresAfter().equals(this.getSignatureExpiresAfter()) == false)
            return false;
        if (other.getJobInvoker() == null ^ this.getJobInvoker() == null)
            return false;
        if (other.getJobInvoker() != null && other.getJobInvoker().equals(this.getJobInvoker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPlatformId() == null) ? 0 : getPlatformId().hashCode());
        hashCode = prime * hashCode + ((getRequestedBy() == null) ? 0 : getRequestedBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIsRevoked() == null) ? 0 : getIsRevoked().hashCode());
        hashCode = prime * hashCode + ((getSignatureExpiresBefore() == null) ? 0 : getSignatureExpiresBefore().hashCode());
        hashCode = prime * hashCode + ((getSignatureExpiresAfter() == null) ? 0 : getSignatureExpiresAfter().hashCode());
        hashCode = prime * hashCode + ((getJobInvoker() == null) ? 0 : getJobInvoker().hashCode());
        return hashCode;
    }

    @Override
    public ListSigningJobsRequest clone() {
        return (ListSigningJobsRequest) super.clone();
    }

}
