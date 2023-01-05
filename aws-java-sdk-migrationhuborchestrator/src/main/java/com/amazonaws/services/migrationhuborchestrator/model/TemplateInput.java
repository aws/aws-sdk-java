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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input parameters of a template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/TemplateInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the template.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * The data type of the template input.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * Determine if an input is required from the template.
     * </p>
     */
    private Boolean required;

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param inputName
     *        The name of the template.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @return The name of the template.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the template.
     * </p>
     * 
     * @param inputName
     *        The name of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateInput withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * The data type of the template input.
     * </p>
     * 
     * @param dataType
     *        The data type of the template input.
     * @see DataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the template input.
     * </p>
     * 
     * @return The data type of the template input.
     * @see DataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the template input.
     * </p>
     * 
     * @param dataType
     *        The data type of the template input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataType
     */

    public TemplateInput withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type of the template input.
     * </p>
     * 
     * @param dataType
     *        The data type of the template input.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataType
     */

    public TemplateInput withDataType(DataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * Determine if an input is required from the template.
     * </p>
     * 
     * @param required
     *        Determine if an input is required from the template.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Determine if an input is required from the template.
     * </p>
     * 
     * @return Determine if an input is required from the template.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Determine if an input is required from the template.
     * </p>
     * 
     * @param required
     *        Determine if an input is required from the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateInput withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Determine if an input is required from the template.
     * </p>
     * 
     * @return Determine if an input is required from the template.
     */

    public Boolean isRequired() {
        return this.required;
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName()).append(",");
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateInput == false)
            return false;
        TemplateInput other = (TemplateInput) obj;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        return hashCode;
    }

    @Override
    public TemplateInput clone() {
        try {
            return (TemplateInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.TemplateInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
