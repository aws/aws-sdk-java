/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListTrustStoreCertificates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrustStoreCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The certificate list.
     * </p>
     */
    private java.util.List<CertificateSummary> certificateList;
    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.&gt;
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     */
    private String trustStoreArn;

    /**
     * <p>
     * The certificate list.
     * </p>
     * 
     * @return The certificate list.
     */

    public java.util.List<CertificateSummary> getCertificateList() {
        return certificateList;
    }

    /**
     * <p>
     * The certificate list.
     * </p>
     * 
     * @param certificateList
     *        The certificate list.
     */

    public void setCertificateList(java.util.Collection<CertificateSummary> certificateList) {
        if (certificateList == null) {
            this.certificateList = null;
            return;
        }

        this.certificateList = new java.util.ArrayList<CertificateSummary>(certificateList);
    }

    /**
     * <p>
     * The certificate list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateList(java.util.Collection)} or {@link #withCertificateList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param certificateList
     *        The certificate list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustStoreCertificatesResult withCertificateList(CertificateSummary... certificateList) {
        if (this.certificateList == null) {
            setCertificateList(new java.util.ArrayList<CertificateSummary>(certificateList.length));
        }
        for (CertificateSummary ele : certificateList) {
            this.certificateList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The certificate list.
     * </p>
     * 
     * @param certificateList
     *        The certificate list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustStoreCertificatesResult withCertificateList(java.util.Collection<CertificateSummary> certificateList) {
        setCertificateList(certificateList);
        return this;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.&gt;
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.&gt;
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.&gt;
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.&gt;
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.&gt;
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustStoreCertificatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The ARN of the trust store.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @return The ARN of the trust store.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The ARN of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The ARN of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustStoreCertificatesResult withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
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
        if (getCertificateList() != null)
            sb.append("CertificateList: ").append(getCertificateList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrustStoreCertificatesResult == false)
            return false;
        ListTrustStoreCertificatesResult other = (ListTrustStoreCertificatesResult) obj;
        if (other.getCertificateList() == null ^ this.getCertificateList() == null)
            return false;
        if (other.getCertificateList() != null && other.getCertificateList().equals(this.getCertificateList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateList() == null) ? 0 : getCertificateList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        return hashCode;
    }

    @Override
    public ListTrustStoreCertificatesResult clone() {
        try {
            return (ListTrustStoreCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
