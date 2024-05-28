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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCertificateProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     */
    private String certificateProviderName;
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

    public UpdateCertificateProviderRequest withCertificateProviderName(String certificateProviderName) {
        setCertificateProviderName(certificateProviderName);
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

    public UpdateCertificateProviderRequest withLambdaFunctionArn(String lambdaFunctionArn) {
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

    public UpdateCertificateProviderRequest withAccountDefaultForOperations(String... accountDefaultForOperations) {
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

    public UpdateCertificateProviderRequest withAccountDefaultForOperations(java.util.Collection<String> accountDefaultForOperations) {
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

    public UpdateCertificateProviderRequest withAccountDefaultForOperations(CertificateProviderOperation... accountDefaultForOperations) {
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
        if (getLambdaFunctionArn() != null)
            sb.append("LambdaFunctionArn: ").append(getLambdaFunctionArn()).append(",");
        if (getAccountDefaultForOperations() != null)
            sb.append("AccountDefaultForOperations: ").append(getAccountDefaultForOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCertificateProviderRequest == false)
            return false;
        UpdateCertificateProviderRequest other = (UpdateCertificateProviderRequest) obj;
        if (other.getCertificateProviderName() == null ^ this.getCertificateProviderName() == null)
            return false;
        if (other.getCertificateProviderName() != null && other.getCertificateProviderName().equals(this.getCertificateProviderName()) == false)
            return false;
        if (other.getLambdaFunctionArn() == null ^ this.getLambdaFunctionArn() == null)
            return false;
        if (other.getLambdaFunctionArn() != null && other.getLambdaFunctionArn().equals(this.getLambdaFunctionArn()) == false)
            return false;
        if (other.getAccountDefaultForOperations() == null ^ this.getAccountDefaultForOperations() == null)
            return false;
        if (other.getAccountDefaultForOperations() != null && other.getAccountDefaultForOperations().equals(this.getAccountDefaultForOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateProviderName() == null) ? 0 : getCertificateProviderName().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionArn() == null) ? 0 : getLambdaFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getAccountDefaultForOperations() == null) ? 0 : getAccountDefaultForOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCertificateProviderRequest clone() {
        return (UpdateCertificateProviderRequest) super.clone();
    }

}
