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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of security controls and control parameter values that are included in a configuration policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SecurityControlCustomParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityControlCustomParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the security control.
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * An object that specifies parameter values for a control in a configuration policy.
     * </p>
     */
    private java.util.Map<String, ParameterConfiguration> parameters;

    /**
     * <p>
     * The ID of the security control.
     * </p>
     * 
     * @param securityControlId
     *        The ID of the security control.
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The ID of the security control.
     * </p>
     * 
     * @return The ID of the security control.
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The ID of the security control.
     * </p>
     * 
     * @param securityControlId
     *        The ID of the security control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlCustomParameter withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * An object that specifies parameter values for a control in a configuration policy.
     * </p>
     * 
     * @return An object that specifies parameter values for a control in a configuration policy.
     */

    public java.util.Map<String, ParameterConfiguration> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * An object that specifies parameter values for a control in a configuration policy.
     * </p>
     * 
     * @param parameters
     *        An object that specifies parameter values for a control in a configuration policy.
     */

    public void setParameters(java.util.Map<String, ParameterConfiguration> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * An object that specifies parameter values for a control in a configuration policy.
     * </p>
     * 
     * @param parameters
     *        An object that specifies parameter values for a control in a configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlCustomParameter withParameters(java.util.Map<String, ParameterConfiguration> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see SecurityControlCustomParameter#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlCustomParameter addParametersEntry(String key, ParameterConfiguration value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, ParameterConfiguration>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlCustomParameter clearParametersEntries() {
        this.parameters = null;
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
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityControlCustomParameter == false)
            return false;
        SecurityControlCustomParameter other = (SecurityControlCustomParameter) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public SecurityControlCustomParameter clone() {
        try {
            return (SecurityControlCustomParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SecurityControlCustomParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
