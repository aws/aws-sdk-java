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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes SAML options for an OpenSearch Serverless security configuration in the form of a key-value map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/SamlConfigOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamlConfigOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group attribute for this SAML integration.
     * </p>
     */
    private String groupAttribute;
    /**
     * <p>
     * The XML IdP metadata file generated from your identity provider.
     * </p>
     */
    private String metadata;
    /**
     * <p>
     * The session timeout, in minutes. Minimum is 15 minutes and maximum is 1440 minutes (24 hours or 1 day). Default
     * is 60 minutes.
     * </p>
     */
    private Integer sessionTimeout;
    /**
     * <p>
     * A user attribute for this SAML integration.
     * </p>
     */
    private String userAttribute;

    /**
     * <p>
     * The group attribute for this SAML integration.
     * </p>
     * 
     * @param groupAttribute
     *        The group attribute for this SAML integration.
     */

    public void setGroupAttribute(String groupAttribute) {
        this.groupAttribute = groupAttribute;
    }

    /**
     * <p>
     * The group attribute for this SAML integration.
     * </p>
     * 
     * @return The group attribute for this SAML integration.
     */

    public String getGroupAttribute() {
        return this.groupAttribute;
    }

    /**
     * <p>
     * The group attribute for this SAML integration.
     * </p>
     * 
     * @param groupAttribute
     *        The group attribute for this SAML integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfigOptions withGroupAttribute(String groupAttribute) {
        setGroupAttribute(groupAttribute);
        return this;
    }

    /**
     * <p>
     * The XML IdP metadata file generated from your identity provider.
     * </p>
     * 
     * @param metadata
     *        The XML IdP metadata file generated from your identity provider.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The XML IdP metadata file generated from your identity provider.
     * </p>
     * 
     * @return The XML IdP metadata file generated from your identity provider.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The XML IdP metadata file generated from your identity provider.
     * </p>
     * 
     * @param metadata
     *        The XML IdP metadata file generated from your identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfigOptions withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The session timeout, in minutes. Minimum is 15 minutes and maximum is 1440 minutes (24 hours or 1 day). Default
     * is 60 minutes.
     * </p>
     * 
     * @param sessionTimeout
     *        The session timeout, in minutes. Minimum is 15 minutes and maximum is 1440 minutes (24 hours or 1 day).
     *        Default is 60 minutes.
     */

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    /**
     * <p>
     * The session timeout, in minutes. Minimum is 15 minutes and maximum is 1440 minutes (24 hours or 1 day). Default
     * is 60 minutes.
     * </p>
     * 
     * @return The session timeout, in minutes. Minimum is 15 minutes and maximum is 1440 minutes (24 hours or 1 day).
     *         Default is 60 minutes.
     */

    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * <p>
     * The session timeout, in minutes. Minimum is 15 minutes and maximum is 1440 minutes (24 hours or 1 day). Default
     * is 60 minutes.
     * </p>
     * 
     * @param sessionTimeout
     *        The session timeout, in minutes. Minimum is 15 minutes and maximum is 1440 minutes (24 hours or 1 day).
     *        Default is 60 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfigOptions withSessionTimeout(Integer sessionTimeout) {
        setSessionTimeout(sessionTimeout);
        return this;
    }

    /**
     * <p>
     * A user attribute for this SAML integration.
     * </p>
     * 
     * @param userAttribute
     *        A user attribute for this SAML integration.
     */

    public void setUserAttribute(String userAttribute) {
        this.userAttribute = userAttribute;
    }

    /**
     * <p>
     * A user attribute for this SAML integration.
     * </p>
     * 
     * @return A user attribute for this SAML integration.
     */

    public String getUserAttribute() {
        return this.userAttribute;
    }

    /**
     * <p>
     * A user attribute for this SAML integration.
     * </p>
     * 
     * @param userAttribute
     *        A user attribute for this SAML integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfigOptions withUserAttribute(String userAttribute) {
        setUserAttribute(userAttribute);
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
        if (getGroupAttribute() != null)
            sb.append("GroupAttribute: ").append(getGroupAttribute()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getSessionTimeout() != null)
            sb.append("SessionTimeout: ").append(getSessionTimeout()).append(",");
        if (getUserAttribute() != null)
            sb.append("UserAttribute: ").append(getUserAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamlConfigOptions == false)
            return false;
        SamlConfigOptions other = (SamlConfigOptions) obj;
        if (other.getGroupAttribute() == null ^ this.getGroupAttribute() == null)
            return false;
        if (other.getGroupAttribute() != null && other.getGroupAttribute().equals(this.getGroupAttribute()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSessionTimeout() == null ^ this.getSessionTimeout() == null)
            return false;
        if (other.getSessionTimeout() != null && other.getSessionTimeout().equals(this.getSessionTimeout()) == false)
            return false;
        if (other.getUserAttribute() == null ^ this.getUserAttribute() == null)
            return false;
        if (other.getUserAttribute() != null && other.getUserAttribute().equals(this.getUserAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupAttribute() == null) ? 0 : getGroupAttribute().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getSessionTimeout() == null) ? 0 : getSessionTimeout().hashCode());
        hashCode = prime * hashCode + ((getUserAttribute() == null) ? 0 : getUserAttribute().hashCode());
        return hashCode;
    }

    @Override
    public SamlConfigOptions clone() {
        try {
            return (SamlConfigOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.SamlConfigOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
