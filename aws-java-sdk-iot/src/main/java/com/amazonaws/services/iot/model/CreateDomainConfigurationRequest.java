/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class CreateDomainConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a region.
     * </p>
     */
    private String domainConfigurationName;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can
     * specify only one certificate ARN. This value is not required for AWS-managed domains.
     * </p>
     */
    private java.util.List<String> serverCertificateArns;
    /**
     * <p>
     * The certificate used to validate the server certificate and prove domain name ownership. This certificate must be
     * signed by a public certificate authority. This value is not required for AWS-managed domains.
     * </p>
     */
    private String validationCertificateArn;
    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     */
    private AuthorizerConfig authorizerConfig;
    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     */
    private String serviceType;

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a region.
     * </p>
     * 
     * @param domainConfigurationName
     *        The name of the domain configuration. This value must be unique to a region.
     */

    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a region.
     * </p>
     * 
     * @return The name of the domain configuration. This value must be unique to a region.
     */

    public String getDomainConfigurationName() {
        return this.domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration. This value must be unique to a region.
     * </p>
     * 
     * @param domainConfigurationName
     *        The name of the domain configuration. This value must be unique to a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainConfigurationRequest withDomainConfigurationName(String domainConfigurationName) {
        setDomainConfigurationName(domainConfigurationName);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainConfigurationRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can
     * specify only one certificate ARN. This value is not required for AWS-managed domains.
     * </p>
     * 
     * @return The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you
     *         can specify only one certificate ARN. This value is not required for AWS-managed domains.
     */

    public java.util.List<String> getServerCertificateArns() {
        return serverCertificateArns;
    }

    /**
     * <p>
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can
     * specify only one certificate ARN. This value is not required for AWS-managed domains.
     * </p>
     * 
     * @param serverCertificateArns
     *        The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can
     *        specify only one certificate ARN. This value is not required for AWS-managed domains.
     */

    public void setServerCertificateArns(java.util.Collection<String> serverCertificateArns) {
        if (serverCertificateArns == null) {
            this.serverCertificateArns = null;
            return;
        }

        this.serverCertificateArns = new java.util.ArrayList<String>(serverCertificateArns);
    }

    /**
     * <p>
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can
     * specify only one certificate ARN. This value is not required for AWS-managed domains.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerCertificateArns(java.util.Collection)} or
     * {@link #withServerCertificateArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serverCertificateArns
     *        The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can
     *        specify only one certificate ARN. This value is not required for AWS-managed domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainConfigurationRequest withServerCertificateArns(String... serverCertificateArns) {
        if (this.serverCertificateArns == null) {
            setServerCertificateArns(new java.util.ArrayList<String>(serverCertificateArns.length));
        }
        for (String ele : serverCertificateArns) {
            this.serverCertificateArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can
     * specify only one certificate ARN. This value is not required for AWS-managed domains.
     * </p>
     * 
     * @param serverCertificateArns
     *        The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can
     *        specify only one certificate ARN. This value is not required for AWS-managed domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainConfigurationRequest withServerCertificateArns(java.util.Collection<String> serverCertificateArns) {
        setServerCertificateArns(serverCertificateArns);
        return this;
    }

    /**
     * <p>
     * The certificate used to validate the server certificate and prove domain name ownership. This certificate must be
     * signed by a public certificate authority. This value is not required for AWS-managed domains.
     * </p>
     * 
     * @param validationCertificateArn
     *        The certificate used to validate the server certificate and prove domain name ownership. This certificate
     *        must be signed by a public certificate authority. This value is not required for AWS-managed domains.
     */

    public void setValidationCertificateArn(String validationCertificateArn) {
        this.validationCertificateArn = validationCertificateArn;
    }

    /**
     * <p>
     * The certificate used to validate the server certificate and prove domain name ownership. This certificate must be
     * signed by a public certificate authority. This value is not required for AWS-managed domains.
     * </p>
     * 
     * @return The certificate used to validate the server certificate and prove domain name ownership. This certificate
     *         must be signed by a public certificate authority. This value is not required for AWS-managed domains.
     */

    public String getValidationCertificateArn() {
        return this.validationCertificateArn;
    }

    /**
     * <p>
     * The certificate used to validate the server certificate and prove domain name ownership. This certificate must be
     * signed by a public certificate authority. This value is not required for AWS-managed domains.
     * </p>
     * 
     * @param validationCertificateArn
     *        The certificate used to validate the server certificate and prove domain name ownership. This certificate
     *        must be signed by a public certificate authority. This value is not required for AWS-managed domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainConfigurationRequest withValidationCertificateArn(String validationCertificateArn) {
        setValidationCertificateArn(validationCertificateArn);
        return this;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     * 
     * @param authorizerConfig
     *        An object that specifies the authorization service for a domain.
     */

    public void setAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        this.authorizerConfig = authorizerConfig;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     * 
     * @return An object that specifies the authorization service for a domain.
     */

    public AuthorizerConfig getAuthorizerConfig() {
        return this.authorizerConfig;
    }

    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     * 
     * @param authorizerConfig
     *        An object that specifies the authorization service for a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainConfigurationRequest withAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        setAuthorizerConfig(authorizerConfig);
        return this;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * 
     * @param serviceType
     *        The type of service delivered by the endpoint.
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * 
     * @return The type of service delivered by the endpoint.
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * 
     * @param serviceType
     *        The type of service delivered by the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public CreateDomainConfigurationRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     * 
     * @param serviceType
     *        The type of service delivered by the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public CreateDomainConfigurationRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
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
        if (getDomainConfigurationName() != null)
            sb.append("DomainConfigurationName: ").append(getDomainConfigurationName()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getServerCertificateArns() != null)
            sb.append("ServerCertificateArns: ").append(getServerCertificateArns()).append(",");
        if (getValidationCertificateArn() != null)
            sb.append("ValidationCertificateArn: ").append(getValidationCertificateArn()).append(",");
        if (getAuthorizerConfig() != null)
            sb.append("AuthorizerConfig: ").append(getAuthorizerConfig()).append(",");
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainConfigurationRequest == false)
            return false;
        CreateDomainConfigurationRequest other = (CreateDomainConfigurationRequest) obj;
        if (other.getDomainConfigurationName() == null ^ this.getDomainConfigurationName() == null)
            return false;
        if (other.getDomainConfigurationName() != null && other.getDomainConfigurationName().equals(this.getDomainConfigurationName()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getServerCertificateArns() == null ^ this.getServerCertificateArns() == null)
            return false;
        if (other.getServerCertificateArns() != null && other.getServerCertificateArns().equals(this.getServerCertificateArns()) == false)
            return false;
        if (other.getValidationCertificateArn() == null ^ this.getValidationCertificateArn() == null)
            return false;
        if (other.getValidationCertificateArn() != null && other.getValidationCertificateArn().equals(this.getValidationCertificateArn()) == false)
            return false;
        if (other.getAuthorizerConfig() == null ^ this.getAuthorizerConfig() == null)
            return false;
        if (other.getAuthorizerConfig() != null && other.getAuthorizerConfig().equals(this.getAuthorizerConfig()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainConfigurationName() == null) ? 0 : getDomainConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateArns() == null) ? 0 : getServerCertificateArns().hashCode());
        hashCode = prime * hashCode + ((getValidationCertificateArn() == null) ? 0 : getValidationCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerConfig() == null) ? 0 : getAuthorizerConfig().hashCode());
        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainConfigurationRequest clone() {
        return (CreateDomainConfigurationRequest) super.clone();
    }

}
