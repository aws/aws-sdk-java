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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information required for custom authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CustomAuthConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomAuthConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authentication type that the custom connector uses.
     * </p>
     */
    private String customAuthenticationType;
    /**
     * <p>
     * Information about authentication parameters required for authentication.
     * </p>
     */
    private java.util.List<AuthParameter> authParameters;

    /**
     * <p>
     * The authentication type that the custom connector uses.
     * </p>
     * 
     * @param customAuthenticationType
     *        The authentication type that the custom connector uses.
     */

    public void setCustomAuthenticationType(String customAuthenticationType) {
        this.customAuthenticationType = customAuthenticationType;
    }

    /**
     * <p>
     * The authentication type that the custom connector uses.
     * </p>
     * 
     * @return The authentication type that the custom connector uses.
     */

    public String getCustomAuthenticationType() {
        return this.customAuthenticationType;
    }

    /**
     * <p>
     * The authentication type that the custom connector uses.
     * </p>
     * 
     * @param customAuthenticationType
     *        The authentication type that the custom connector uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAuthConfig withCustomAuthenticationType(String customAuthenticationType) {
        setCustomAuthenticationType(customAuthenticationType);
        return this;
    }

    /**
     * <p>
     * Information about authentication parameters required for authentication.
     * </p>
     * 
     * @return Information about authentication parameters required for authentication.
     */

    public java.util.List<AuthParameter> getAuthParameters() {
        return authParameters;
    }

    /**
     * <p>
     * Information about authentication parameters required for authentication.
     * </p>
     * 
     * @param authParameters
     *        Information about authentication parameters required for authentication.
     */

    public void setAuthParameters(java.util.Collection<AuthParameter> authParameters) {
        if (authParameters == null) {
            this.authParameters = null;
            return;
        }

        this.authParameters = new java.util.ArrayList<AuthParameter>(authParameters);
    }

    /**
     * <p>
     * Information about authentication parameters required for authentication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthParameters(java.util.Collection)} or {@link #withAuthParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param authParameters
     *        Information about authentication parameters required for authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAuthConfig withAuthParameters(AuthParameter... authParameters) {
        if (this.authParameters == null) {
            setAuthParameters(new java.util.ArrayList<AuthParameter>(authParameters.length));
        }
        for (AuthParameter ele : authParameters) {
            this.authParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about authentication parameters required for authentication.
     * </p>
     * 
     * @param authParameters
     *        Information about authentication parameters required for authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAuthConfig withAuthParameters(java.util.Collection<AuthParameter> authParameters) {
        setAuthParameters(authParameters);
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
        if (getCustomAuthenticationType() != null)
            sb.append("CustomAuthenticationType: ").append(getCustomAuthenticationType()).append(",");
        if (getAuthParameters() != null)
            sb.append("AuthParameters: ").append(getAuthParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomAuthConfig == false)
            return false;
        CustomAuthConfig other = (CustomAuthConfig) obj;
        if (other.getCustomAuthenticationType() == null ^ this.getCustomAuthenticationType() == null)
            return false;
        if (other.getCustomAuthenticationType() != null && other.getCustomAuthenticationType().equals(this.getCustomAuthenticationType()) == false)
            return false;
        if (other.getAuthParameters() == null ^ this.getAuthParameters() == null)
            return false;
        if (other.getAuthParameters() != null && other.getAuthParameters().equals(this.getAuthParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomAuthenticationType() == null) ? 0 : getCustomAuthenticationType().hashCode());
        hashCode = prime * hashCode + ((getAuthParameters() == null) ? 0 : getAuthParameters().hashCode());
        return hashCode;
    }

    @Override
    public CustomAuthConfig clone() {
        try {
            return (CustomAuthConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.CustomAuthConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
