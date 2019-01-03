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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListCertificateAuthorities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCertificateAuthoritiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about each certificate authority you have created.
     * </p>
     */
    private java.util.List<CertificateAuthority> certificateAuthorities;
    /**
     * <p>
     * When the list is truncated, this value is present and should be used for the <code>NextToken</code> parameter in
     * a subsequent pagination request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about each certificate authority you have created.
     * </p>
     * 
     * @return Summary information about each certificate authority you have created.
     */

    public java.util.List<CertificateAuthority> getCertificateAuthorities() {
        return certificateAuthorities;
    }

    /**
     * <p>
     * Summary information about each certificate authority you have created.
     * </p>
     * 
     * @param certificateAuthorities
     *        Summary information about each certificate authority you have created.
     */

    public void setCertificateAuthorities(java.util.Collection<CertificateAuthority> certificateAuthorities) {
        if (certificateAuthorities == null) {
            this.certificateAuthorities = null;
            return;
        }

        this.certificateAuthorities = new java.util.ArrayList<CertificateAuthority>(certificateAuthorities);
    }

    /**
     * <p>
     * Summary information about each certificate authority you have created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateAuthorities(java.util.Collection)} or
     * {@link #withCertificateAuthorities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateAuthorities
     *        Summary information about each certificate authority you have created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificateAuthoritiesResult withCertificateAuthorities(CertificateAuthority... certificateAuthorities) {
        if (this.certificateAuthorities == null) {
            setCertificateAuthorities(new java.util.ArrayList<CertificateAuthority>(certificateAuthorities.length));
        }
        for (CertificateAuthority ele : certificateAuthorities) {
            this.certificateAuthorities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about each certificate authority you have created.
     * </p>
     * 
     * @param certificateAuthorities
     *        Summary information about each certificate authority you have created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificateAuthoritiesResult withCertificateAuthorities(java.util.Collection<CertificateAuthority> certificateAuthorities) {
        setCertificateAuthorities(certificateAuthorities);
        return this;
    }

    /**
     * <p>
     * When the list is truncated, this value is present and should be used for the <code>NextToken</code> parameter in
     * a subsequent pagination request.
     * </p>
     * 
     * @param nextToken
     *        When the list is truncated, this value is present and should be used for the <code>NextToken</code>
     *        parameter in a subsequent pagination request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the list is truncated, this value is present and should be used for the <code>NextToken</code> parameter in
     * a subsequent pagination request.
     * </p>
     * 
     * @return When the list is truncated, this value is present and should be used for the <code>NextToken</code>
     *         parameter in a subsequent pagination request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the list is truncated, this value is present and should be used for the <code>NextToken</code> parameter in
     * a subsequent pagination request.
     * </p>
     * 
     * @param nextToken
     *        When the list is truncated, this value is present and should be used for the <code>NextToken</code>
     *        parameter in a subsequent pagination request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificateAuthoritiesResult withNextToken(String nextToken) {
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
        if (getCertificateAuthorities() != null)
            sb.append("CertificateAuthorities: ").append(getCertificateAuthorities()).append(",");
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

        if (obj instanceof ListCertificateAuthoritiesResult == false)
            return false;
        ListCertificateAuthoritiesResult other = (ListCertificateAuthoritiesResult) obj;
        if (other.getCertificateAuthorities() == null ^ this.getCertificateAuthorities() == null)
            return false;
        if (other.getCertificateAuthorities() != null && other.getCertificateAuthorities().equals(this.getCertificateAuthorities()) == false)
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

        hashCode = prime * hashCode + ((getCertificateAuthorities() == null) ? 0 : getCertificateAuthorities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCertificateAuthoritiesResult clone() {
        try {
            return (ListCertificateAuthoritiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
