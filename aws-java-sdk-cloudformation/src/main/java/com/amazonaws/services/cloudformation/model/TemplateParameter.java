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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The TemplateParameter data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TemplateParameter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateParameter implements Serializable, Cloneable {

    /**
     * <p>
     * The name associated with the parameter.
     * </p>
     */
    private String parameterKey;
    /**
     * <p>
     * The default value associated with the parameter.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     * </p>
     */
    private Boolean noEcho;
    /**
     * <p>
     * User defined description associated with the parameter.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name associated with the parameter.
     * </p>
     * 
     * @param parameterKey
     *        The name associated with the parameter.
     */

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The name associated with the parameter.
     * </p>
     * 
     * @return The name associated with the parameter.
     */

    public String getParameterKey() {
        return this.parameterKey;
    }

    /**
     * <p>
     * The name associated with the parameter.
     * </p>
     * 
     * @param parameterKey
     *        The name associated with the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateParameter withParameterKey(String parameterKey) {
        setParameterKey(parameterKey);
        return this;
    }

    /**
     * <p>
     * The default value associated with the parameter.
     * </p>
     * 
     * @param defaultValue
     *        The default value associated with the parameter.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value associated with the parameter.
     * </p>
     * 
     * @return The default value associated with the parameter.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value associated with the parameter.
     * </p>
     * 
     * @param defaultValue
     *        The default value associated with the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateParameter withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     * </p>
     * 
     * @param noEcho
     *        Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     */

    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     * </p>
     * 
     * @return Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     */

    public Boolean getNoEcho() {
        return this.noEcho;
    }

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     * </p>
     * 
     * @param noEcho
     *        Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateParameter withNoEcho(Boolean noEcho) {
        setNoEcho(noEcho);
        return this;
    }

    /**
     * <p>
     * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     * </p>
     * 
     * @return Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
     */

    public Boolean isNoEcho() {
        return this.noEcho;
    }

    /**
     * <p>
     * User defined description associated with the parameter.
     * </p>
     * 
     * @param description
     *        User defined description associated with the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User defined description associated with the parameter.
     * </p>
     * 
     * @return User defined description associated with the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * User defined description associated with the parameter.
     * </p>
     * 
     * @param description
     *        User defined description associated with the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateParameter withDescription(String description) {
        setDescription(description);
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
        if (getNoEcho() != null)
            sb.append("NoEcho: ").append(getNoEcho()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateParameter == false)
            return false;
        TemplateParameter other = (TemplateParameter) obj;
        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getNoEcho() == null ^ this.getNoEcho() == null)
            return false;
        if (other.getNoEcho() != null && other.getNoEcho().equals(this.getNoEcho()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getNoEcho() == null) ? 0 : getNoEcho().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public TemplateParameter clone() {
        try {
            return (TemplateParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
