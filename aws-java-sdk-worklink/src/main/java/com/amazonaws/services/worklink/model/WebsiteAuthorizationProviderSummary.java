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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the website authorization provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/WebsiteAuthorizationProviderSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebsiteAuthorizationProviderSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     */
    private String authorizationProviderId;
    /**
     * <p>
     * The authorization provider type.
     * </p>
     */
    private String authorizationProviderType;
    /**
     * <p>
     * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The time of creation.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * 
     * @param authorizationProviderId
     *        A unique identifier for the authorization provider.
     */

    public void setAuthorizationProviderId(String authorizationProviderId) {
        this.authorizationProviderId = authorizationProviderId;
    }

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * 
     * @return A unique identifier for the authorization provider.
     */

    public String getAuthorizationProviderId() {
        return this.authorizationProviderId;
    }

    /**
     * <p>
     * A unique identifier for the authorization provider.
     * </p>
     * 
     * @param authorizationProviderId
     *        A unique identifier for the authorization provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebsiteAuthorizationProviderSummary withAuthorizationProviderId(String authorizationProviderId) {
        setAuthorizationProviderId(authorizationProviderId);
        return this;
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * 
     * @param authorizationProviderType
     *        The authorization provider type.
     * @see AuthorizationProviderType
     */

    public void setAuthorizationProviderType(String authorizationProviderType) {
        this.authorizationProviderType = authorizationProviderType;
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * 
     * @return The authorization provider type.
     * @see AuthorizationProviderType
     */

    public String getAuthorizationProviderType() {
        return this.authorizationProviderType;
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * 
     * @param authorizationProviderType
     *        The authorization provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationProviderType
     */

    public WebsiteAuthorizationProviderSummary withAuthorizationProviderType(String authorizationProviderType) {
        setAuthorizationProviderType(authorizationProviderType);
        return this;
    }

    /**
     * <p>
     * The authorization provider type.
     * </p>
     * 
     * @param authorizationProviderType
     *        The authorization provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationProviderType
     */

    public WebsiteAuthorizationProviderSummary withAuthorizationProviderType(AuthorizationProviderType authorizationProviderType) {
        this.authorizationProviderType = authorizationProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
     * </p>
     * 
     * @param domainName
     *        The domain name of the authorization provider. This applies only to SAML-based authorization providers.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
     * </p>
     * 
     * @return The domain name of the authorization provider. This applies only to SAML-based authorization providers.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of the authorization provider. This applies only to SAML-based authorization providers.
     * </p>
     * 
     * @param domainName
     *        The domain name of the authorization provider. This applies only to SAML-based authorization providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebsiteAuthorizationProviderSummary withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The time of creation.
     * </p>
     * 
     * @param createdTime
     *        The time of creation.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time of creation.
     * </p>
     * 
     * @return The time of creation.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time of creation.
     * </p>
     * 
     * @param createdTime
     *        The time of creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebsiteAuthorizationProviderSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getAuthorizationProviderId() != null)
            sb.append("AuthorizationProviderId: ").append(getAuthorizationProviderId()).append(",");
        if (getAuthorizationProviderType() != null)
            sb.append("AuthorizationProviderType: ").append(getAuthorizationProviderType()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebsiteAuthorizationProviderSummary == false)
            return false;
        WebsiteAuthorizationProviderSummary other = (WebsiteAuthorizationProviderSummary) obj;
        if (other.getAuthorizationProviderId() == null ^ this.getAuthorizationProviderId() == null)
            return false;
        if (other.getAuthorizationProviderId() != null && other.getAuthorizationProviderId().equals(this.getAuthorizationProviderId()) == false)
            return false;
        if (other.getAuthorizationProviderType() == null ^ this.getAuthorizationProviderType() == null)
            return false;
        if (other.getAuthorizationProviderType() != null && other.getAuthorizationProviderType().equals(this.getAuthorizationProviderType()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationProviderId() == null) ? 0 : getAuthorizationProviderId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationProviderType() == null) ? 0 : getAuthorizationProviderType().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public WebsiteAuthorizationProviderSummary clone() {
        try {
            return (WebsiteAuthorizationProviderSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.worklink.model.transform.WebsiteAuthorizationProviderSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
