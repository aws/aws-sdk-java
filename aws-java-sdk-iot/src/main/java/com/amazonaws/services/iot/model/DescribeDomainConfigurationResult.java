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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain configuration.
     * </p>
     */
    private String domainConfigurationName;
    /**
     * <p>
     * The ARN of the domain configuration.
     * </p>
     */
    private String domainConfigurationArn;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A list containing summary information about the server certificate included in the domain configuration.
     * </p>
     */
    private java.util.List<ServerCertificateSummary> serverCertificates;
    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     */
    private AuthorizerConfig authorizerConfig;
    /**
     * <p>
     * A Boolean value that specifies the current state of the domain configuration.
     * </p>
     */
    private String domainConfigurationStatus;
    /**
     * <p>
     * The type of service delivered by the endpoint.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * The type of the domain.
     * </p>
     */
    private String domainType;

    /**
     * <p>
     * The name of the domain configuration.
     * </p>
     * 
     * @param domainConfigurationName
     *        The name of the domain configuration.
     */

    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration.
     * </p>
     * 
     * @return The name of the domain configuration.
     */

    public String getDomainConfigurationName() {
        return this.domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration.
     * </p>
     * 
     * @param domainConfigurationName
     *        The name of the domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainConfigurationResult withDomainConfigurationName(String domainConfigurationName) {
        setDomainConfigurationName(domainConfigurationName);
        return this;
    }

    /**
     * <p>
     * The ARN of the domain configuration.
     * </p>
     * 
     * @param domainConfigurationArn
     *        The ARN of the domain configuration.
     */

    public void setDomainConfigurationArn(String domainConfigurationArn) {
        this.domainConfigurationArn = domainConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the domain configuration.
     * </p>
     * 
     * @return The ARN of the domain configuration.
     */

    public String getDomainConfigurationArn() {
        return this.domainConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the domain configuration.
     * </p>
     * 
     * @param domainConfigurationArn
     *        The ARN of the domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainConfigurationResult withDomainConfigurationArn(String domainConfigurationArn) {
        setDomainConfigurationArn(domainConfigurationArn);
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

    public DescribeDomainConfigurationResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A list containing summary information about the server certificate included in the domain configuration.
     * </p>
     * 
     * @return A list containing summary information about the server certificate included in the domain configuration.
     */

    public java.util.List<ServerCertificateSummary> getServerCertificates() {
        return serverCertificates;
    }

    /**
     * <p>
     * A list containing summary information about the server certificate included in the domain configuration.
     * </p>
     * 
     * @param serverCertificates
     *        A list containing summary information about the server certificate included in the domain configuration.
     */

    public void setServerCertificates(java.util.Collection<ServerCertificateSummary> serverCertificates) {
        if (serverCertificates == null) {
            this.serverCertificates = null;
            return;
        }

        this.serverCertificates = new java.util.ArrayList<ServerCertificateSummary>(serverCertificates);
    }

    /**
     * <p>
     * A list containing summary information about the server certificate included in the domain configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerCertificates(java.util.Collection)} or {@link #withServerCertificates(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param serverCertificates
     *        A list containing summary information about the server certificate included in the domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainConfigurationResult withServerCertificates(ServerCertificateSummary... serverCertificates) {
        if (this.serverCertificates == null) {
            setServerCertificates(new java.util.ArrayList<ServerCertificateSummary>(serverCertificates.length));
        }
        for (ServerCertificateSummary ele : serverCertificates) {
            this.serverCertificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing summary information about the server certificate included in the domain configuration.
     * </p>
     * 
     * @param serverCertificates
     *        A list containing summary information about the server certificate included in the domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainConfigurationResult withServerCertificates(java.util.Collection<ServerCertificateSummary> serverCertificates) {
        setServerCertificates(serverCertificates);
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

    public DescribeDomainConfigurationResult withAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        setAuthorizerConfig(authorizerConfig);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain configuration.
     * </p>
     * 
     * @param domainConfigurationStatus
     *        A Boolean value that specifies the current state of the domain configuration.
     * @see DomainConfigurationStatus
     */

    public void setDomainConfigurationStatus(String domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus;
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain configuration.
     * </p>
     * 
     * @return A Boolean value that specifies the current state of the domain configuration.
     * @see DomainConfigurationStatus
     */

    public String getDomainConfigurationStatus() {
        return this.domainConfigurationStatus;
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain configuration.
     * </p>
     * 
     * @param domainConfigurationStatus
     *        A Boolean value that specifies the current state of the domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainConfigurationStatus
     */

    public DescribeDomainConfigurationResult withDomainConfigurationStatus(String domainConfigurationStatus) {
        setDomainConfigurationStatus(domainConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies the current state of the domain configuration.
     * </p>
     * 
     * @param domainConfigurationStatus
     *        A Boolean value that specifies the current state of the domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainConfigurationStatus
     */

    public DescribeDomainConfigurationResult withDomainConfigurationStatus(DomainConfigurationStatus domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus.toString();
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

    public DescribeDomainConfigurationResult withServiceType(String serviceType) {
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

    public DescribeDomainConfigurationResult withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * 
     * @param domainType
     *        The type of the domain.
     * @see DomainType
     */

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * 
     * @return The type of the domain.
     * @see DomainType
     */

    public String getDomainType() {
        return this.domainType;
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * 
     * @param domainType
     *        The type of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public DescribeDomainConfigurationResult withDomainType(String domainType) {
        setDomainType(domainType);
        return this;
    }

    /**
     * <p>
     * The type of the domain.
     * </p>
     * 
     * @param domainType
     *        The type of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainType
     */

    public DescribeDomainConfigurationResult withDomainType(DomainType domainType) {
        this.domainType = domainType.toString();
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
        if (getDomainConfigurationArn() != null)
            sb.append("DomainConfigurationArn: ").append(getDomainConfigurationArn()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getServerCertificates() != null)
            sb.append("ServerCertificates: ").append(getServerCertificates()).append(",");
        if (getAuthorizerConfig() != null)
            sb.append("AuthorizerConfig: ").append(getAuthorizerConfig()).append(",");
        if (getDomainConfigurationStatus() != null)
            sb.append("DomainConfigurationStatus: ").append(getDomainConfigurationStatus()).append(",");
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getDomainType() != null)
            sb.append("DomainType: ").append(getDomainType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainConfigurationResult == false)
            return false;
        DescribeDomainConfigurationResult other = (DescribeDomainConfigurationResult) obj;
        if (other.getDomainConfigurationName() == null ^ this.getDomainConfigurationName() == null)
            return false;
        if (other.getDomainConfigurationName() != null && other.getDomainConfigurationName().equals(this.getDomainConfigurationName()) == false)
            return false;
        if (other.getDomainConfigurationArn() == null ^ this.getDomainConfigurationArn() == null)
            return false;
        if (other.getDomainConfigurationArn() != null && other.getDomainConfigurationArn().equals(this.getDomainConfigurationArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getServerCertificates() == null ^ this.getServerCertificates() == null)
            return false;
        if (other.getServerCertificates() != null && other.getServerCertificates().equals(this.getServerCertificates()) == false)
            return false;
        if (other.getAuthorizerConfig() == null ^ this.getAuthorizerConfig() == null)
            return false;
        if (other.getAuthorizerConfig() != null && other.getAuthorizerConfig().equals(this.getAuthorizerConfig()) == false)
            return false;
        if (other.getDomainConfigurationStatus() == null ^ this.getDomainConfigurationStatus() == null)
            return false;
        if (other.getDomainConfigurationStatus() != null && other.getDomainConfigurationStatus().equals(this.getDomainConfigurationStatus()) == false)
            return false;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getDomainType() == null ^ this.getDomainType() == null)
            return false;
        if (other.getDomainType() != null && other.getDomainType().equals(this.getDomainType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainConfigurationName() == null) ? 0 : getDomainConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getDomainConfigurationArn() == null) ? 0 : getDomainConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getServerCertificates() == null) ? 0 : getServerCertificates().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerConfig() == null) ? 0 : getAuthorizerConfig().hashCode());
        hashCode = prime * hashCode + ((getDomainConfigurationStatus() == null) ? 0 : getDomainConfigurationStatus().hashCode());
        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getDomainType() == null) ? 0 : getDomainType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainConfigurationResult clone() {
        try {
            return (DescribeDomainConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
