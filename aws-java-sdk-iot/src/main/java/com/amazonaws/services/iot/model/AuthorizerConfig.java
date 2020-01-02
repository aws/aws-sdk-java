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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that specifies the authorization service for a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the authorization service for a domain configuration.
     * </p>
     */
    private String defaultAuthorizerName;
    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     * </p>
     */
    private Boolean allowAuthorizerOverride;

    /**
     * <p>
     * The name of the authorization service for a domain configuration.
     * </p>
     * 
     * @param defaultAuthorizerName
     *        The name of the authorization service for a domain configuration.
     */

    public void setDefaultAuthorizerName(String defaultAuthorizerName) {
        this.defaultAuthorizerName = defaultAuthorizerName;
    }

    /**
     * <p>
     * The name of the authorization service for a domain configuration.
     * </p>
     * 
     * @return The name of the authorization service for a domain configuration.
     */

    public String getDefaultAuthorizerName() {
        return this.defaultAuthorizerName;
    }

    /**
     * <p>
     * The name of the authorization service for a domain configuration.
     * </p>
     * 
     * @param defaultAuthorizerName
     *        The name of the authorization service for a domain configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizerConfig withDefaultAuthorizerName(String defaultAuthorizerName) {
        setDefaultAuthorizerName(defaultAuthorizerName);
        return this;
    }

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     * </p>
     * 
     * @param allowAuthorizerOverride
     *        A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     */

    public void setAllowAuthorizerOverride(Boolean allowAuthorizerOverride) {
        this.allowAuthorizerOverride = allowAuthorizerOverride;
    }

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     * </p>
     * 
     * @return A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     */

    public Boolean getAllowAuthorizerOverride() {
        return this.allowAuthorizerOverride;
    }

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     * </p>
     * 
     * @param allowAuthorizerOverride
     *        A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizerConfig withAllowAuthorizerOverride(Boolean allowAuthorizerOverride) {
        setAllowAuthorizerOverride(allowAuthorizerOverride);
        return this;
    }

    /**
     * <p>
     * A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     * </p>
     * 
     * @return A Boolean that specifies whether the domain configuration's authorization service can be overridden.
     */

    public Boolean isAllowAuthorizerOverride() {
        return this.allowAuthorizerOverride;
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
        if (getDefaultAuthorizerName() != null)
            sb.append("DefaultAuthorizerName: ").append(getDefaultAuthorizerName()).append(",");
        if (getAllowAuthorizerOverride() != null)
            sb.append("AllowAuthorizerOverride: ").append(getAllowAuthorizerOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizerConfig == false)
            return false;
        AuthorizerConfig other = (AuthorizerConfig) obj;
        if (other.getDefaultAuthorizerName() == null ^ this.getDefaultAuthorizerName() == null)
            return false;
        if (other.getDefaultAuthorizerName() != null && other.getDefaultAuthorizerName().equals(this.getDefaultAuthorizerName()) == false)
            return false;
        if (other.getAllowAuthorizerOverride() == null ^ this.getAllowAuthorizerOverride() == null)
            return false;
        if (other.getAllowAuthorizerOverride() != null && other.getAllowAuthorizerOverride().equals(this.getAllowAuthorizerOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultAuthorizerName() == null) ? 0 : getDefaultAuthorizerName().hashCode());
        hashCode = prime * hashCode + ((getAllowAuthorizerOverride() == null) ? 0 : getAllowAuthorizerOverride().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizerConfig clone() {
        try {
            return (AuthorizerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuthorizerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
