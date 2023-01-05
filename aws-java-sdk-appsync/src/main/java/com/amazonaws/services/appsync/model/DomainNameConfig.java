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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a configuration for a custom domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DomainNameConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainNameConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain name.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A description of the <code>DomainName</code> configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or an
     * Identity and Access Management (IAM) server certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The domain name that AppSync provides.
     * </p>
     */
    private String appsyncDomainName;
    /**
     * <p>
     * The ID of your Amazon Route 53 hosted zone.
     * </p>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @return The domain name.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name.
     * </p>
     * 
     * @param domainName
     *        The domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfig withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A description of the <code>DomainName</code> configuration.
     * </p>
     * 
     * @param description
     *        A description of the <code>DomainName</code> configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the <code>DomainName</code> configuration.
     * </p>
     * 
     * @return A description of the <code>DomainName</code> configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the <code>DomainName</code> configuration.
     * </p>
     * 
     * @param description
     *        A description of the <code>DomainName</code> configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfig withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or an
     * Identity and Access Management (IAM) server certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or
     *        an Identity and Access Management (IAM) server certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or an
     * Identity and Access Management (IAM) server certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate
     *         or an Identity and Access Management (IAM) server certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or an
     * Identity and Access Management (IAM) server certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or
     *        an Identity and Access Management (IAM) server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfig withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The domain name that AppSync provides.
     * </p>
     * 
     * @param appsyncDomainName
     *        The domain name that AppSync provides.
     */

    public void setAppsyncDomainName(String appsyncDomainName) {
        this.appsyncDomainName = appsyncDomainName;
    }

    /**
     * <p>
     * The domain name that AppSync provides.
     * </p>
     * 
     * @return The domain name that AppSync provides.
     */

    public String getAppsyncDomainName() {
        return this.appsyncDomainName;
    }

    /**
     * <p>
     * The domain name that AppSync provides.
     * </p>
     * 
     * @param appsyncDomainName
     *        The domain name that AppSync provides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfig withAppsyncDomainName(String appsyncDomainName) {
        setAppsyncDomainName(appsyncDomainName);
        return this;
    }

    /**
     * <p>
     * The ID of your Amazon Route 53 hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of your Amazon Route 53 hosted zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of your Amazon Route 53 hosted zone.
     * </p>
     * 
     * @return The ID of your Amazon Route 53 hosted zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of your Amazon Route 53 hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of your Amazon Route 53 hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainNameConfig withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getAppsyncDomainName() != null)
            sb.append("AppsyncDomainName: ").append(getAppsyncDomainName()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainNameConfig == false)
            return false;
        DomainNameConfig other = (DomainNameConfig) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getAppsyncDomainName() == null ^ this.getAppsyncDomainName() == null)
            return false;
        if (other.getAppsyncDomainName() != null && other.getAppsyncDomainName().equals(this.getAppsyncDomainName()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getAppsyncDomainName() == null) ? 0 : getAppsyncDomainName().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        return hashCode;
    }

    @Override
    public DomainNameConfig clone() {
        try {
            return (DomainNameConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.DomainNameConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
