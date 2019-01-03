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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ListCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the list is truncated, this value is present and contains the value to use for the <code>NextToken</code>
     * parameter in a subsequent pagination request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of ACM certificates.
     * </p>
     */
    private java.util.List<CertificateSummary> certificateSummaryList;

    /**
     * <p>
     * When the list is truncated, this value is present and contains the value to use for the <code>NextToken</code>
     * parameter in a subsequent pagination request.
     * </p>
     * 
     * @param nextToken
     *        When the list is truncated, this value is present and contains the value to use for the
     *        <code>NextToken</code> parameter in a subsequent pagination request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the list is truncated, this value is present and contains the value to use for the <code>NextToken</code>
     * parameter in a subsequent pagination request.
     * </p>
     * 
     * @return When the list is truncated, this value is present and contains the value to use for the
     *         <code>NextToken</code> parameter in a subsequent pagination request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the list is truncated, this value is present and contains the value to use for the <code>NextToken</code>
     * parameter in a subsequent pagination request.
     * </p>
     * 
     * @param nextToken
     *        When the list is truncated, this value is present and contains the value to use for the
     *        <code>NextToken</code> parameter in a subsequent pagination request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of ACM certificates.
     * </p>
     * 
     * @return A list of ACM certificates.
     */

    public java.util.List<CertificateSummary> getCertificateSummaryList() {
        return certificateSummaryList;
    }

    /**
     * <p>
     * A list of ACM certificates.
     * </p>
     * 
     * @param certificateSummaryList
     *        A list of ACM certificates.
     */

    public void setCertificateSummaryList(java.util.Collection<CertificateSummary> certificateSummaryList) {
        if (certificateSummaryList == null) {
            this.certificateSummaryList = null;
            return;
        }

        this.certificateSummaryList = new java.util.ArrayList<CertificateSummary>(certificateSummaryList);
    }

    /**
     * <p>
     * A list of ACM certificates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateSummaryList(java.util.Collection)} or
     * {@link #withCertificateSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateSummaryList
     *        A list of ACM certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withCertificateSummaryList(CertificateSummary... certificateSummaryList) {
        if (this.certificateSummaryList == null) {
            setCertificateSummaryList(new java.util.ArrayList<CertificateSummary>(certificateSummaryList.length));
        }
        for (CertificateSummary ele : certificateSummaryList) {
            this.certificateSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ACM certificates.
     * </p>
     * 
     * @param certificateSummaryList
     *        A list of ACM certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withCertificateSummaryList(java.util.Collection<CertificateSummary> certificateSummaryList) {
        setCertificateSummaryList(certificateSummaryList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCertificateSummaryList() != null)
            sb.append("CertificateSummaryList: ").append(getCertificateSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCertificatesResult == false)
            return false;
        ListCertificatesResult other = (ListCertificatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCertificateSummaryList() == null ^ this.getCertificateSummaryList() == null)
            return false;
        if (other.getCertificateSummaryList() != null && other.getCertificateSummaryList().equals(this.getCertificateSummaryList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCertificateSummaryList() == null) ? 0 : getCertificateSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public ListCertificatesResult clone() {
        try {
            return (ListCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
