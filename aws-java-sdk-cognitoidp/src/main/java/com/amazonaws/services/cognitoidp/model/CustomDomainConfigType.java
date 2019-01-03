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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CustomDomainConfigType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomDomainConfigType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for the
     * subdomain of your custom domain.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for the
     * subdomain of your custom domain.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for
     *        the subdomain of your custom domain.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for the
     * subdomain of your custom domain.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate
     *         for the subdomain of your custom domain.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for the
     * subdomain of your custom domain.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for
     *        the subdomain of your custom domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDomainConfigType withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDomainConfigType == false)
            return false;
        CustomDomainConfigType other = (CustomDomainConfigType) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public CustomDomainConfigType clone() {
        try {
            return (CustomDomainConfigType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.CustomDomainConfigTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
