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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateVariable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVariableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the variable.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The source of the data.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * The default value for the variable when no value is received.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The variable type.
     * </p>
     */
    private String variableType;

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param name
     *        The name of the variable.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @return The name of the variable.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the variable.
     * </p>
     * 
     * @param name
     *        The name of the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVariableRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param dataType
     *        The data type.
     * @see DataType
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @return The data type.
     * @see DataType
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param dataType
     *        The data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataType
     */

    public CreateVariableRequest withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param dataType
     *        The data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataType
     */

    public CreateVariableRequest withDataType(DataType dataType) {
        this.dataType = dataType.toString();
        return this;
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * 
     * @param dataSource
     *        The source of the data.
     * @see DataSource
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * 
     * @return The source of the data.
     * @see DataSource
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * 
     * @param dataSource
     *        The source of the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public CreateVariableRequest withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The source of the data.
     * </p>
     * 
     * @param dataSource
     *        The source of the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public CreateVariableRequest withDataSource(DataSource dataSource) {
        this.dataSource = dataSource.toString();
        return this;
    }

    /**
     * <p>
     * The default value for the variable when no value is received.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the variable when no value is received.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value for the variable when no value is received.
     * </p>
     * 
     * @return The default value for the variable when no value is received.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value for the variable when no value is received.
     * </p>
     * 
     * @param defaultValue
     *        The default value for the variable when no value is received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVariableRequest withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVariableRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The variable type.
     * </p>
     * 
     * @param variableType
     *        The variable type.
     */

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    /**
     * <p>
     * The variable type.
     * </p>
     * 
     * @return The variable type.
     */

    public String getVariableType() {
        return this.variableType;
    }

    /**
     * <p>
     * The variable type.
     * </p>
     * 
     * @param variableType
     *        The variable type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVariableRequest withVariableType(String variableType) {
        setVariableType(variableType);
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVariableType() != null)
            sb.append("VariableType: ").append(getVariableType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVariableRequest == false)
            return false;
        CreateVariableRequest other = (CreateVariableRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVariableType() == null ^ this.getVariableType() == null)
            return false;
        if (other.getVariableType() != null && other.getVariableType().equals(this.getVariableType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVariableType() == null) ? 0 : getVariableType().hashCode());
        return hashCode;
    }

    @Override
    public CreateVariableRequest clone() {
        return (CreateVariableRequest) super.clone();
    }

}
