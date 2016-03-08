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

package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListCertificatesRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Identifies the statuses of the ACM Certificates for which you want to
     * retrieve the ARNs. This can be one or more of the following values:
     * <ul>
     * <li><code>PENDING_VALIDATION</code></li>
     * <li><code>ISSUED</code></li>
     * <li><code>INACTIVE</code></li>
     * <li><code>EXPIRED</code></li>
     * <li><code>VALIDATION_TIMED_OUT</code></li>
     * <li><code>REVOKED</code></li>
     * <li><code>FAILED</code></li>
     * </ul>
     * </p>
     */
    private java.util.List<String> certificateStatuses;
    /**
     * <p>
     * String that contains an opaque marker of the next ACM Certificate ARN to
     * be displayed. Use this parameter when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * have been truncated. Set it to an empty string the first time you call
     * this action, and set it to the value of the <code>NextToken</code>
     * element you receive in the response object for subsequent calls.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specify this parameter when paginating results to indicate the maximum
     * number of ACM Certificates that you want to display for each response. If
     * there are additional certificates beyond the maximum you specify, use the
     * <code>NextToken</code> value in your next call to the
     * <code>ListCertificates</code> action.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * Identifies the statuses of the ACM Certificates for which you want to
     * retrieve the ARNs. This can be one or more of the following values:
     * <ul>
     * <li><code>PENDING_VALIDATION</code></li>
     * <li><code>ISSUED</code></li>
     * <li><code>INACTIVE</code></li>
     * <li><code>EXPIRED</code></li>
     * <li><code>VALIDATION_TIMED_OUT</code></li>
     * <li><code>REVOKED</code></li>
     * <li><code>FAILED</code></li>
     * </ul>
     * </p>
     * 
     * @return Identifies the statuses of the ACM Certificates for which you
     *         want to retrieve the ARNs. This can be one or more of the
     *         following values:
     *         <ul>
     *         <li><code>PENDING_VALIDATION</code></li>
     *         <li><code>ISSUED</code></li>
     *         <li><code>INACTIVE</code></li>
     *         <li><code>EXPIRED</code></li>
     *         <li><code>VALIDATION_TIMED_OUT</code></li>
     *         <li><code>REVOKED</code></li>
     *         <li><code>FAILED</code></li>
     *         </ul>
     * @see CertificateStatus
     */

    public java.util.List<String> getCertificateStatuses() {
        return certificateStatuses;
    }

    /**
     * <p>
     * Identifies the statuses of the ACM Certificates for which you want to
     * retrieve the ARNs. This can be one or more of the following values:
     * <ul>
     * <li><code>PENDING_VALIDATION</code></li>
     * <li><code>ISSUED</code></li>
     * <li><code>INACTIVE</code></li>
     * <li><code>EXPIRED</code></li>
     * <li><code>VALIDATION_TIMED_OUT</code></li>
     * <li><code>REVOKED</code></li>
     * <li><code>FAILED</code></li>
     * </ul>
     * </p>
     * 
     * @param certificateStatuses
     *        Identifies the statuses of the ACM Certificates for which you want
     *        to retrieve the ARNs. This can be one or more of the following
     *        values:
     *        <ul>
     *        <li><code>PENDING_VALIDATION</code></li>
     *        <li><code>ISSUED</code></li>
     *        <li><code>INACTIVE</code></li>
     *        <li><code>EXPIRED</code></li>
     *        <li><code>VALIDATION_TIMED_OUT</code></li>
     *        <li><code>REVOKED</code></li>
     *        <li><code>FAILED</code></li>
     *        </ul>
     * @see CertificateStatus
     */

    public void setCertificateStatuses(
            java.util.Collection<String> certificateStatuses) {
        if (certificateStatuses == null) {
            this.certificateStatuses = null;
            return;
        }

        this.certificateStatuses = new java.util.ArrayList<String>(
                certificateStatuses);
    }

    /**
     * <p>
     * Identifies the statuses of the ACM Certificates for which you want to
     * retrieve the ARNs. This can be one or more of the following values:
     * <ul>
     * <li><code>PENDING_VALIDATION</code></li>
     * <li><code>ISSUED</code></li>
     * <li><code>INACTIVE</code></li>
     * <li><code>EXPIRED</code></li>
     * <li><code>VALIDATION_TIMED_OUT</code></li>
     * <li><code>REVOKED</code></li>
     * <li><code>FAILED</code></li>
     * </ul>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCertificateStatuses(java.util.Collection)} or
     * {@link #withCertificateStatuses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param certificateStatuses
     *        Identifies the statuses of the ACM Certificates for which you want
     *        to retrieve the ARNs. This can be one or more of the following
     *        values:
     *        <ul>
     *        <li><code>PENDING_VALIDATION</code></li>
     *        <li><code>ISSUED</code></li>
     *        <li><code>INACTIVE</code></li>
     *        <li><code>EXPIRED</code></li>
     *        <li><code>VALIDATION_TIMED_OUT</code></li>
     *        <li><code>REVOKED</code></li>
     *        <li><code>FAILED</code></li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */

    public ListCertificatesRequest withCertificateStatuses(
            String... certificateStatuses) {
        if (this.certificateStatuses == null) {
            setCertificateStatuses(new java.util.ArrayList<String>(
                    certificateStatuses.length));
        }
        for (String ele : certificateStatuses) {
            this.certificateStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies the statuses of the ACM Certificates for which you want to
     * retrieve the ARNs. This can be one or more of the following values:
     * <ul>
     * <li><code>PENDING_VALIDATION</code></li>
     * <li><code>ISSUED</code></li>
     * <li><code>INACTIVE</code></li>
     * <li><code>EXPIRED</code></li>
     * <li><code>VALIDATION_TIMED_OUT</code></li>
     * <li><code>REVOKED</code></li>
     * <li><code>FAILED</code></li>
     * </ul>
     * </p>
     * 
     * @param certificateStatuses
     *        Identifies the statuses of the ACM Certificates for which you want
     *        to retrieve the ARNs. This can be one or more of the following
     *        values:
     *        <ul>
     *        <li><code>PENDING_VALIDATION</code></li>
     *        <li><code>ISSUED</code></li>
     *        <li><code>INACTIVE</code></li>
     *        <li><code>EXPIRED</code></li>
     *        <li><code>VALIDATION_TIMED_OUT</code></li>
     *        <li><code>REVOKED</code></li>
     *        <li><code>FAILED</code></li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */

    public ListCertificatesRequest withCertificateStatuses(
            java.util.Collection<String> certificateStatuses) {
        setCertificateStatuses(certificateStatuses);
        return this;
    }

    /**
     * <p>
     * Identifies the statuses of the ACM Certificates for which you want to
     * retrieve the ARNs. This can be one or more of the following values:
     * <ul>
     * <li><code>PENDING_VALIDATION</code></li>
     * <li><code>ISSUED</code></li>
     * <li><code>INACTIVE</code></li>
     * <li><code>EXPIRED</code></li>
     * <li><code>VALIDATION_TIMED_OUT</code></li>
     * <li><code>REVOKED</code></li>
     * <li><code>FAILED</code></li>
     * </ul>
     * </p>
     * 
     * @param certificateStatuses
     *        Identifies the statuses of the ACM Certificates for which you want
     *        to retrieve the ARNs. This can be one or more of the following
     *        values:
     *        <ul>
     *        <li><code>PENDING_VALIDATION</code></li>
     *        <li><code>ISSUED</code></li>
     *        <li><code>INACTIVE</code></li>
     *        <li><code>EXPIRED</code></li>
     *        <li><code>VALIDATION_TIMED_OUT</code></li>
     *        <li><code>REVOKED</code></li>
     *        <li><code>FAILED</code></li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */

    public ListCertificatesRequest withCertificateStatuses(
            CertificateStatus... certificateStatuses) {
        java.util.ArrayList<String> certificateStatusesCopy = new java.util.ArrayList<String>(
                certificateStatuses.length);
        for (CertificateStatus value : certificateStatuses) {
            certificateStatusesCopy.add(value.toString());
        }
        if (getCertificateStatuses() == null) {
            setCertificateStatuses(certificateStatusesCopy);
        } else {
            getCertificateStatuses().addAll(certificateStatusesCopy);
        }
        return this;
    }

    /**
     * <p>
     * String that contains an opaque marker of the next ACM Certificate ARN to
     * be displayed. Use this parameter when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * have been truncated. Set it to an empty string the first time you call
     * this action, and set it to the value of the <code>NextToken</code>
     * element you receive in the response object for subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        String that contains an opaque marker of the next ACM Certificate
     *        ARN to be displayed. Use this parameter when paginating results,
     *        and only in a subsequent request after you've received a response
     *        where the results have been truncated. Set it to an empty string
     *        the first time you call this action, and set it to the value of
     *        the <code>NextToken</code> element you receive in the response
     *        object for subsequent calls.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * String that contains an opaque marker of the next ACM Certificate ARN to
     * be displayed. Use this parameter when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * have been truncated. Set it to an empty string the first time you call
     * this action, and set it to the value of the <code>NextToken</code>
     * element you receive in the response object for subsequent calls.
     * </p>
     * 
     * @return String that contains an opaque marker of the next ACM Certificate
     *         ARN to be displayed. Use this parameter when paginating results,
     *         and only in a subsequent request after you've received a response
     *         where the results have been truncated. Set it to an empty string
     *         the first time you call this action, and set it to the value of
     *         the <code>NextToken</code> element you receive in the response
     *         object for subsequent calls.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * String that contains an opaque marker of the next ACM Certificate ARN to
     * be displayed. Use this parameter when paginating results, and only in a
     * subsequent request after you've received a response where the results
     * have been truncated. Set it to an empty string the first time you call
     * this action, and set it to the value of the <code>NextToken</code>
     * element you receive in the response object for subsequent calls.
     * </p>
     * 
     * @param nextToken
     *        String that contains an opaque marker of the next ACM Certificate
     *        ARN to be displayed. Use this parameter when paginating results,
     *        and only in a subsequent request after you've received a response
     *        where the results have been truncated. Set it to an empty string
     *        the first time you call this action, and set it to the value of
     *        the <code>NextToken</code> element you receive in the response
     *        object for subsequent calls.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCertificatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specify this parameter when paginating results to indicate the maximum
     * number of ACM Certificates that you want to display for each response. If
     * there are additional certificates beyond the maximum you specify, use the
     * <code>NextToken</code> value in your next call to the
     * <code>ListCertificates</code> action.
     * </p>
     * 
     * @param maxItems
     *        Specify this parameter when paginating results to indicate the
     *        maximum number of ACM Certificates that you want to display for
     *        each response. If there are additional certificates beyond the
     *        maximum you specify, use the <code>NextToken</code> value in your
     *        next call to the <code>ListCertificates</code> action.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Specify this parameter when paginating results to indicate the maximum
     * number of ACM Certificates that you want to display for each response. If
     * there are additional certificates beyond the maximum you specify, use the
     * <code>NextToken</code> value in your next call to the
     * <code>ListCertificates</code> action.
     * </p>
     * 
     * @return Specify this parameter when paginating results to indicate the
     *         maximum number of ACM Certificates that you want to display for
     *         each response. If there are additional certificates beyond the
     *         maximum you specify, use the <code>NextToken</code> value in your
     *         next call to the <code>ListCertificates</code> action.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Specify this parameter when paginating results to indicate the maximum
     * number of ACM Certificates that you want to display for each response. If
     * there are additional certificates beyond the maximum you specify, use the
     * <code>NextToken</code> value in your next call to the
     * <code>ListCertificates</code> action.
     * </p>
     * 
     * @param maxItems
     *        Specify this parameter when paginating results to indicate the
     *        maximum number of ACM Certificates that you want to display for
     *        each response. If there are additional certificates beyond the
     *        maximum you specify, use the <code>NextToken</code> value in your
     *        next call to the <code>ListCertificates</code> action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListCertificatesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getCertificateStatuses() != null)
            sb.append("CertificateStatuses: " + getCertificateStatuses() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCertificatesRequest == false)
            return false;
        ListCertificatesRequest other = (ListCertificatesRequest) obj;
        if (other.getCertificateStatuses() == null
                ^ this.getCertificateStatuses() == null)
            return false;
        if (other.getCertificateStatuses() != null
                && other.getCertificateStatuses().equals(
                        this.getCertificateStatuses()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateStatuses() == null) ? 0
                        : getCertificateStatuses().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListCertificatesRequest clone() {
        return (ListCertificatesRequest) super.clone();
    }
}