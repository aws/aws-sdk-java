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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a parameter used to provision a product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisioningArtifactParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningArtifactParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameter key.
     * </p>
     */
    private String parameterKey;
    /**
     * <p>
     * The default value.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The parameter type.
     * </p>
     */
    private String parameterType;
    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This
     * parameter is used to hide sensitive information.
     * </p>
     */
    private Boolean isNoEcho;
    /**
     * <p>
     * The description of the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Constraints that the administrator has put on a parameter.
     * </p>
     */
    private ParameterConstraints parameterConstraints;

    /**
     * <p>
     * The parameter key.
     * </p>
     * 
     * @param parameterKey
     *        The parameter key.
     */

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The parameter key.
     * </p>
     * 
     * @return The parameter key.
     */

    public String getParameterKey() {
        return this.parameterKey;
    }

    /**
     * <p>
     * The parameter key.
     * </p>
     * 
     * @param parameterKey
     *        The parameter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactParameter withParameterKey(String parameterKey) {
        setParameterKey(parameterKey);
        return this;
    }

    /**
     * <p>
     * The default value.
     * </p>
     * 
     * @param defaultValue
     *        The default value.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value.
     * </p>
     * 
     * @return The default value.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value.
     * </p>
     * 
     * @param defaultValue
     *        The default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactParameter withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     * 
     * @param parameterType
     *        The parameter type.
     */

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     * 
     * @return The parameter type.
     */

    public String getParameterType() {
        return this.parameterType;
    }

    /**
     * <p>
     * The parameter type.
     * </p>
     * 
     * @param parameterType
     *        The parameter type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactParameter withParameterType(String parameterType) {
        setParameterType(parameterType);
        return this;
    }

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This
     * parameter is used to hide sensitive information.
     * </p>
     * 
     * @param isNoEcho
     *        If this value is true, the value for this parameter is obfuscated from view when the parameter is
     *        retrieved. This parameter is used to hide sensitive information.
     */

    public void setIsNoEcho(Boolean isNoEcho) {
        this.isNoEcho = isNoEcho;
    }

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This
     * parameter is used to hide sensitive information.
     * </p>
     * 
     * @return If this value is true, the value for this parameter is obfuscated from view when the parameter is
     *         retrieved. This parameter is used to hide sensitive information.
     */

    public Boolean getIsNoEcho() {
        return this.isNoEcho;
    }

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This
     * parameter is used to hide sensitive information.
     * </p>
     * 
     * @param isNoEcho
     *        If this value is true, the value for this parameter is obfuscated from view when the parameter is
     *        retrieved. This parameter is used to hide sensitive information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactParameter withIsNoEcho(Boolean isNoEcho) {
        setIsNoEcho(isNoEcho);
        return this;
    }

    /**
     * <p>
     * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This
     * parameter is used to hide sensitive information.
     * </p>
     * 
     * @return If this value is true, the value for this parameter is obfuscated from view when the parameter is
     *         retrieved. This parameter is used to hide sensitive information.
     */

    public Boolean isNoEcho() {
        return this.isNoEcho;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     * 
     * @param description
     *        The description of the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     * 
     * @return The description of the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the parameter.
     * </p>
     * 
     * @param description
     *        The description of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactParameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Constraints that the administrator has put on a parameter.
     * </p>
     * 
     * @param parameterConstraints
     *        Constraints that the administrator has put on a parameter.
     */

    public void setParameterConstraints(ParameterConstraints parameterConstraints) {
        this.parameterConstraints = parameterConstraints;
    }

    /**
     * <p>
     * Constraints that the administrator has put on a parameter.
     * </p>
     * 
     * @return Constraints that the administrator has put on a parameter.
     */

    public ParameterConstraints getParameterConstraints() {
        return this.parameterConstraints;
    }

    /**
     * <p>
     * Constraints that the administrator has put on a parameter.
     * </p>
     * 
     * @param parameterConstraints
     *        Constraints that the administrator has put on a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactParameter withParameterConstraints(ParameterConstraints parameterConstraints) {
        setParameterConstraints(parameterConstraints);
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
        if (getParameterKey() != null)
            sb.append("ParameterKey: ").append(getParameterKey()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getParameterType() != null)
            sb.append("ParameterType: ").append(getParameterType()).append(",");
        if (getIsNoEcho() != null)
            sb.append("IsNoEcho: ").append(getIsNoEcho()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameterConstraints() != null)
            sb.append("ParameterConstraints: ").append(getParameterConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactParameter == false)
            return false;
        ProvisioningArtifactParameter other = (ProvisioningArtifactParameter) obj;
        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getParameterType() == null ^ this.getParameterType() == null)
            return false;
        if (other.getParameterType() != null && other.getParameterType().equals(this.getParameterType()) == false)
            return false;
        if (other.getIsNoEcho() == null ^ this.getIsNoEcho() == null)
            return false;
        if (other.getIsNoEcho() != null && other.getIsNoEcho().equals(this.getIsNoEcho()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameterConstraints() == null ^ this.getParameterConstraints() == null)
            return false;
        if (other.getParameterConstraints() != null && other.getParameterConstraints().equals(this.getParameterConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getParameterType() == null) ? 0 : getParameterType().hashCode());
        hashCode = prime * hashCode + ((getIsNoEcho() == null) ? 0 : getIsNoEcho().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameterConstraints() == null) ? 0 : getParameterConstraints().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningArtifactParameter clone() {
        try {
            return (ProvisioningArtifactParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProvisioningArtifactParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
