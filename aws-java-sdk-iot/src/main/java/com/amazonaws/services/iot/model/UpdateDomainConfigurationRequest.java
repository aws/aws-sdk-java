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
public class UpdateDomainConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain configuration to be updated.
     * </p>
     */
    private String domainConfigurationName;
    /**
     * <p>
     * An object that specifies the authorization service for a domain.
     * </p>
     */
    private AuthorizerConfig authorizerConfig;
    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     */
    private String domainConfigurationStatus;
    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     */
    private Boolean removeAuthorizerConfig;

    /**
     * <p>
     * The name of the domain configuration to be updated.
     * </p>
     * 
     * @param domainConfigurationName
     *        The name of the domain configuration to be updated.
     */

    public void setDomainConfigurationName(String domainConfigurationName) {
        this.domainConfigurationName = domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration to be updated.
     * </p>
     * 
     * @return The name of the domain configuration to be updated.
     */

    public String getDomainConfigurationName() {
        return this.domainConfigurationName;
    }

    /**
     * <p>
     * The name of the domain configuration to be updated.
     * </p>
     * 
     * @param domainConfigurationName
     *        The name of the domain configuration to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigurationRequest withDomainConfigurationName(String domainConfigurationName) {
        setDomainConfigurationName(domainConfigurationName);
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

    public UpdateDomainConfigurationRequest withAuthorizerConfig(AuthorizerConfig authorizerConfig) {
        setAuthorizerConfig(authorizerConfig);
        return this;
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * 
     * @param domainConfigurationStatus
     *        The status to which the domain configuration should be updated.
     * @see DomainConfigurationStatus
     */

    public void setDomainConfigurationStatus(String domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus;
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * 
     * @return The status to which the domain configuration should be updated.
     * @see DomainConfigurationStatus
     */

    public String getDomainConfigurationStatus() {
        return this.domainConfigurationStatus;
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * 
     * @param domainConfigurationStatus
     *        The status to which the domain configuration should be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainConfigurationStatus
     */

    public UpdateDomainConfigurationRequest withDomainConfigurationStatus(String domainConfigurationStatus) {
        setDomainConfigurationStatus(domainConfigurationStatus);
        return this;
    }

    /**
     * <p>
     * The status to which the domain configuration should be updated.
     * </p>
     * 
     * @param domainConfigurationStatus
     *        The status to which the domain configuration should be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DomainConfigurationStatus
     */

    public UpdateDomainConfigurationRequest withDomainConfigurationStatus(DomainConfigurationStatus domainConfigurationStatus) {
        this.domainConfigurationStatus = domainConfigurationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     * 
     * @param removeAuthorizerConfig
     *        Removes the authorization configuration from a domain.
     */

    public void setRemoveAuthorizerConfig(Boolean removeAuthorizerConfig) {
        this.removeAuthorizerConfig = removeAuthorizerConfig;
    }

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     * 
     * @return Removes the authorization configuration from a domain.
     */

    public Boolean getRemoveAuthorizerConfig() {
        return this.removeAuthorizerConfig;
    }

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     * 
     * @param removeAuthorizerConfig
     *        Removes the authorization configuration from a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigurationRequest withRemoveAuthorizerConfig(Boolean removeAuthorizerConfig) {
        setRemoveAuthorizerConfig(removeAuthorizerConfig);
        return this;
    }

    /**
     * <p>
     * Removes the authorization configuration from a domain.
     * </p>
     * 
     * @return Removes the authorization configuration from a domain.
     */

    public Boolean isRemoveAuthorizerConfig() {
        return this.removeAuthorizerConfig;
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
        if (getAuthorizerConfig() != null)
            sb.append("AuthorizerConfig: ").append(getAuthorizerConfig()).append(",");
        if (getDomainConfigurationStatus() != null)
            sb.append("DomainConfigurationStatus: ").append(getDomainConfigurationStatus()).append(",");
        if (getRemoveAuthorizerConfig() != null)
            sb.append("RemoveAuthorizerConfig: ").append(getRemoveAuthorizerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainConfigurationRequest == false)
            return false;
        UpdateDomainConfigurationRequest other = (UpdateDomainConfigurationRequest) obj;
        if (other.getDomainConfigurationName() == null ^ this.getDomainConfigurationName() == null)
            return false;
        if (other.getDomainConfigurationName() != null && other.getDomainConfigurationName().equals(this.getDomainConfigurationName()) == false)
            return false;
        if (other.getAuthorizerConfig() == null ^ this.getAuthorizerConfig() == null)
            return false;
        if (other.getAuthorizerConfig() != null && other.getAuthorizerConfig().equals(this.getAuthorizerConfig()) == false)
            return false;
        if (other.getDomainConfigurationStatus() == null ^ this.getDomainConfigurationStatus() == null)
            return false;
        if (other.getDomainConfigurationStatus() != null && other.getDomainConfigurationStatus().equals(this.getDomainConfigurationStatus()) == false)
            return false;
        if (other.getRemoveAuthorizerConfig() == null ^ this.getRemoveAuthorizerConfig() == null)
            return false;
        if (other.getRemoveAuthorizerConfig() != null && other.getRemoveAuthorizerConfig().equals(this.getRemoveAuthorizerConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainConfigurationName() == null) ? 0 : getDomainConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerConfig() == null) ? 0 : getAuthorizerConfig().hashCode());
        hashCode = prime * hashCode + ((getDomainConfigurationStatus() == null) ? 0 : getDomainConfigurationStatus().hashCode());
        hashCode = prime * hashCode + ((getRemoveAuthorizerConfig() == null) ? 0 : getRemoveAuthorizerConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainConfigurationRequest clone() {
        return (UpdateDomainConfigurationRequest) super.clone();
    }

}
