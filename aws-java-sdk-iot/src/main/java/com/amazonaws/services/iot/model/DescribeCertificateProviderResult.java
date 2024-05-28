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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     */
    private String certificateProviderName;
    /**
     * <p>
     * The ARN of the certificate provider.
     * </p>
     */
    private String certificateProviderArn;
    /**
     * <p>
     * The Lambda function ARN that's associated with the certificate provider.
     * </p>
     */
    private String lambdaFunctionArn;
    /**
     * <p>
     * A list of the operations that the certificate provider will use to generate certificates. Valid value:
     * <code>CreateCertificateFromCsr</code>.
     * </p>
     */
    private java.util.List<String> accountDefaultForOperations;
    /**
     * <p>
     * The date-time string that indicates when the certificate provider was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date-time string that indicates when the certificate provider was last updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * 
     * @param certificateProviderName
     *        The name of the certificate provider.
     */

    public void setCertificateProviderName(String certificateProviderName) {
        this.certificateProviderName = certificateProviderName;
    }

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * 
     * @return The name of the certificate provider.
     */

    public String getCertificateProviderName() {
        return this.certificateProviderName;
    }

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * 
     * @param certificateProviderName
     *        The name of the certificate provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateProviderResult withCertificateProviderName(String certificateProviderName) {
        setCertificateProviderName(certificateProviderName);
        return this;
    }

    /**
     * <p>
     * The ARN of the certificate provider.
     * </p>
     * 
     * @param certificateProviderArn
     *        The ARN of the certificate provider.
     */

    public void setCertificateProviderArn(String certificateProviderArn) {
        this.certificateProviderArn = certificateProviderArn;
    }

    /**
     * <p>
     * The ARN of the certificate provider.
     * </p>
     * 
     * @return The ARN of the certificate provider.
     */

    public String getCertificateProviderArn() {
        return this.certificateProviderArn;
    }

    /**
     * <p>
     * The ARN of the certificate provider.
     * </p>
     * 
     * @param certificateProviderArn
     *        The ARN of the certificate provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateProviderResult withCertificateProviderArn(String certificateProviderArn) {
        setCertificateProviderArn(certificateProviderArn);
        return this;
    }

    /**
     * <p>
     * The Lambda function ARN that's associated with the certificate provider.
     * </p>
     * 
     * @param lambdaFunctionArn
     *        The Lambda function ARN that's associated with the certificate provider.
     */

    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * <p>
     * The Lambda function ARN that's associated with the certificate provider.
     * </p>
     * 
     * @return The Lambda function ARN that's associated with the certificate provider.
     */

    public String getLambdaFunctionArn() {
        return this.lambdaFunctionArn;
    }

    /**
     * <p>
     * The Lambda function ARN that's associated with the certificate provider.
     * </p>
     * 
     * @param lambdaFunctionArn
     *        The Lambda function ARN that's associated with the certificate provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateProviderResult withLambdaFunctionArn(String lambdaFunctionArn) {
        setLambdaFunctionArn(lambdaFunctionArn);
        return this;
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to generate certificates. Valid value:
     * <code>CreateCertificateFromCsr</code>.
     * </p>
     * 
     * @return A list of the operations that the certificate provider will use to generate certificates. Valid value:
     *         <code>CreateCertificateFromCsr</code>.
     * @see CertificateProviderOperation
     */

    public java.util.List<String> getAccountDefaultForOperations() {
        return accountDefaultForOperations;
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to generate certificates. Valid value:
     * <code>CreateCertificateFromCsr</code>.
     * </p>
     * 
     * @param accountDefaultForOperations
     *        A list of the operations that the certificate provider will use to generate certificates. Valid value:
     *        <code>CreateCertificateFromCsr</code>.
     * @see CertificateProviderOperation
     */

    public void setAccountDefaultForOperations(java.util.Collection<String> accountDefaultForOperations) {
        if (accountDefaultForOperations == null) {
            this.accountDefaultForOperations = null;
            return;
        }

        this.accountDefaultForOperations = new java.util.ArrayList<String>(accountDefaultForOperations);
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to generate certificates. Valid value:
     * <code>CreateCertificateFromCsr</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountDefaultForOperations(java.util.Collection)} or
     * {@link #withAccountDefaultForOperations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accountDefaultForOperations
     *        A list of the operations that the certificate provider will use to generate certificates. Valid value:
     *        <code>CreateCertificateFromCsr</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateProviderOperation
     */

    public DescribeCertificateProviderResult withAccountDefaultForOperations(String... accountDefaultForOperations) {
        if (this.accountDefaultForOperations == null) {
            setAccountDefaultForOperations(new java.util.ArrayList<String>(accountDefaultForOperations.length));
        }
        for (String ele : accountDefaultForOperations) {
            this.accountDefaultForOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to generate certificates. Valid value:
     * <code>CreateCertificateFromCsr</code>.
     * </p>
     * 
     * @param accountDefaultForOperations
     *        A list of the operations that the certificate provider will use to generate certificates. Valid value:
     *        <code>CreateCertificateFromCsr</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateProviderOperation
     */

    public DescribeCertificateProviderResult withAccountDefaultForOperations(java.util.Collection<String> accountDefaultForOperations) {
        setAccountDefaultForOperations(accountDefaultForOperations);
        return this;
    }

    /**
     * <p>
     * A list of the operations that the certificate provider will use to generate certificates. Valid value:
     * <code>CreateCertificateFromCsr</code>.
     * </p>
     * 
     * @param accountDefaultForOperations
     *        A list of the operations that the certificate provider will use to generate certificates. Valid value:
     *        <code>CreateCertificateFromCsr</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateProviderOperation
     */

    public DescribeCertificateProviderResult withAccountDefaultForOperations(CertificateProviderOperation... accountDefaultForOperations) {
        java.util.ArrayList<String> accountDefaultForOperationsCopy = new java.util.ArrayList<String>(accountDefaultForOperations.length);
        for (CertificateProviderOperation value : accountDefaultForOperations) {
            accountDefaultForOperationsCopy.add(value.toString());
        }
        if (getAccountDefaultForOperations() == null) {
            setAccountDefaultForOperations(accountDefaultForOperationsCopy);
        } else {
            getAccountDefaultForOperations().addAll(accountDefaultForOperationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The date-time string that indicates when the certificate provider was created.
     * </p>
     * 
     * @param creationDate
     *        The date-time string that indicates when the certificate provider was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date-time string that indicates when the certificate provider was created.
     * </p>
     * 
     * @return The date-time string that indicates when the certificate provider was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date-time string that indicates when the certificate provider was created.
     * </p>
     * 
     * @param creationDate
     *        The date-time string that indicates when the certificate provider was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateProviderResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date-time string that indicates when the certificate provider was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date-time string that indicates when the certificate provider was last updated.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date-time string that indicates when the certificate provider was last updated.
     * </p>
     * 
     * @return The date-time string that indicates when the certificate provider was last updated.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date-time string that indicates when the certificate provider was last updated.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date-time string that indicates when the certificate provider was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateProviderResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getCertificateProviderName() != null)
            sb.append("CertificateProviderName: ").append(getCertificateProviderName()).append(",");
        if (getCertificateProviderArn() != null)
            sb.append("CertificateProviderArn: ").append(getCertificateProviderArn()).append(",");
        if (getLambdaFunctionArn() != null)
            sb.append("LambdaFunctionArn: ").append(getLambdaFunctionArn()).append(",");
        if (getAccountDefaultForOperations() != null)
            sb.append("AccountDefaultForOperations: ").append(getAccountDefaultForOperations()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateProviderResult == false)
            return false;
        DescribeCertificateProviderResult other = (DescribeCertificateProviderResult) obj;
        if (other.getCertificateProviderName() == null ^ this.getCertificateProviderName() == null)
            return false;
        if (other.getCertificateProviderName() != null && other.getCertificateProviderName().equals(this.getCertificateProviderName()) == false)
            return false;
        if (other.getCertificateProviderArn() == null ^ this.getCertificateProviderArn() == null)
            return false;
        if (other.getCertificateProviderArn() != null && other.getCertificateProviderArn().equals(this.getCertificateProviderArn()) == false)
            return false;
        if (other.getLambdaFunctionArn() == null ^ this.getLambdaFunctionArn() == null)
            return false;
        if (other.getLambdaFunctionArn() != null && other.getLambdaFunctionArn().equals(this.getLambdaFunctionArn()) == false)
            return false;
        if (other.getAccountDefaultForOperations() == null ^ this.getAccountDefaultForOperations() == null)
            return false;
        if (other.getAccountDefaultForOperations() != null && other.getAccountDefaultForOperations().equals(this.getAccountDefaultForOperations()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateProviderName() == null) ? 0 : getCertificateProviderName().hashCode());
        hashCode = prime * hashCode + ((getCertificateProviderArn() == null) ? 0 : getCertificateProviderArn().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionArn() == null) ? 0 : getLambdaFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getAccountDefaultForOperations() == null) ? 0 : getAccountDefaultForOperations().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateProviderResult clone() {
        try {
            return (DescribeCertificateProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
