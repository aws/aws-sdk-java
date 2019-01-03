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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a hyperparameter to be used by an algorithm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of this hyperparameter. The name must be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief description of the hyperparameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     * <code>Categorical</code>, and <code>FreeText</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The allowed range for this hyperparameter.
     * </p>
     */
    private ParameterRange range;
    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     * </p>
     */
    private Boolean isTunable;
    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     */
    private Boolean isRequired;
    /**
     * <p>
     * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The name of this hyperparameter. The name must be unique.
     * </p>
     * 
     * @param name
     *        The name of this hyperparameter. The name must be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this hyperparameter. The name must be unique.
     * </p>
     * 
     * @return The name of this hyperparameter. The name must be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this hyperparameter. The name must be unique.
     * </p>
     * 
     * @param name
     *        The name of this hyperparameter. The name must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterSpecification withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief description of the hyperparameter.
     * </p>
     * 
     * @param description
     *        A brief description of the hyperparameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the hyperparameter.
     * </p>
     * 
     * @return A brief description of the hyperparameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the hyperparameter.
     * </p>
     * 
     * @param description
     *        A brief description of the hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterSpecification withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     * <code>Categorical</code>, and <code>FreeText</code>.
     * </p>
     * 
     * @param type
     *        The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     *        <code>Categorical</code>, and <code>FreeText</code>.
     * @see ParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     * <code>Categorical</code>, and <code>FreeText</code>.
     * </p>
     * 
     * @return The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     *         <code>Categorical</code>, and <code>FreeText</code>.
     * @see ParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     * <code>Categorical</code>, and <code>FreeText</code>.
     * </p>
     * 
     * @param type
     *        The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     *        <code>Categorical</code>, and <code>FreeText</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public HyperParameterSpecification withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     * <code>Categorical</code>, and <code>FreeText</code>.
     * </p>
     * 
     * @param type
     *        The type of this hyperparameter. The valid types are <code>Integer</code>, <code>Continuous</code>,
     *        <code>Categorical</code>, and <code>FreeText</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParameterType
     */

    public HyperParameterSpecification withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The allowed range for this hyperparameter.
     * </p>
     * 
     * @param range
     *        The allowed range for this hyperparameter.
     */

    public void setRange(ParameterRange range) {
        this.range = range;
    }

    /**
     * <p>
     * The allowed range for this hyperparameter.
     * </p>
     * 
     * @return The allowed range for this hyperparameter.
     */

    public ParameterRange getRange() {
        return this.range;
    }

    /**
     * <p>
     * The allowed range for this hyperparameter.
     * </p>
     * 
     * @param range
     *        The allowed range for this hyperparameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterSpecification withRange(ParameterRange range) {
        setRange(range);
        return this;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     * </p>
     * 
     * @param isTunable
     *        Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     */

    public void setIsTunable(Boolean isTunable) {
        this.isTunable = isTunable;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     * </p>
     * 
     * @return Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     */

    public Boolean getIsTunable() {
        return this.isTunable;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     * </p>
     * 
     * @param isTunable
     *        Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterSpecification withIsTunable(Boolean isTunable) {
        setIsTunable(isTunable);
        return this;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     * </p>
     * 
     * @return Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
     */

    public Boolean isTunable() {
        return this.isTunable;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether this hyperparameter is required.
     */

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     * 
     * @return Indicates whether this hyperparameter is required.
     */

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     * 
     * @param isRequired
     *        Indicates whether this hyperparameter is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterSpecification withIsRequired(Boolean isRequired) {
        setIsRequired(isRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether this hyperparameter is required.
     * </p>
     * 
     * @return Indicates whether this hyperparameter is required.
     */

    public Boolean isRequired() {
        return this.isRequired;
    }

    /**
     * <p>
     * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
     * </p>
     * 
     * @param defaultValue
     *        The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be
     *        required.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
     * </p>
     * 
     * @return The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be
     *         required.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
     * </p>
     * 
     * @param defaultValue
     *        The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be
     *        required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterSpecification withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange()).append(",");
        if (getIsTunable() != null)
            sb.append("IsTunable: ").append(getIsTunable()).append(",");
        if (getIsRequired() != null)
            sb.append("IsRequired: ").append(getIsRequired()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterSpecification == false)
            return false;
        HyperParameterSpecification other = (HyperParameterSpecification) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getIsTunable() == null ^ this.getIsTunable() == null)
            return false;
        if (other.getIsTunable() != null && other.getIsTunable().equals(this.getIsTunable()) == false)
            return false;
        if (other.getIsRequired() == null ^ this.getIsRequired() == null)
            return false;
        if (other.getIsRequired() != null && other.getIsRequired().equals(this.getIsRequired()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode + ((getIsTunable() == null) ? 0 : getIsTunable().hashCode());
        hashCode = prime * hashCode + ((getIsRequired() == null) ? 0 : getIsRequired().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterSpecification clone() {
        try {
            return (HyperParameterSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
