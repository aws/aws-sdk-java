/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Parameters specified in the SSM document that execute on the server when the command is run.
 * </p>
 */
public class DocumentParameter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of parameter. The type can be either “String” or “StringList”.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A description of what the parameter does, how to use it, the default value, and whether or not the parameter is
     * optional.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If specified, the default values for the parameters. Parameters without a default value are required. Parameters
     * with a default value are optional.
     * </p>
     */
    private String defaultValue;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of parameter. The type can be either “String” or “StringList”.
     * </p>
     * 
     * @param type
     *        The type of parameter. The type can be either “String” or “StringList”.
     * @see DocumentParameterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter. The type can be either “String” or “StringList”.
     * </p>
     * 
     * @return The type of parameter. The type can be either “String” or “StringList”.
     * @see DocumentParameterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of parameter. The type can be either “String” or “StringList”.
     * </p>
     * 
     * @param type
     *        The type of parameter. The type can be either “String” or “StringList”.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentParameterType
     */

    public DocumentParameter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of parameter. The type can be either “String” or “StringList”.
     * </p>
     * 
     * @param type
     *        The type of parameter. The type can be either “String” or “StringList”.
     * @see DocumentParameterType
     */

    public void setType(DocumentParameterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of parameter. The type can be either “String” or “StringList”.
     * </p>
     * 
     * @param type
     *        The type of parameter. The type can be either “String” or “StringList”.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentParameterType
     */

    public DocumentParameter withType(DocumentParameterType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A description of what the parameter does, how to use it, the default value, and whether or not the parameter is
     * optional.
     * </p>
     * 
     * @param description
     *        A description of what the parameter does, how to use it, the default value, and whether or not the
     *        parameter is optional.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of what the parameter does, how to use it, the default value, and whether or not the parameter is
     * optional.
     * </p>
     * 
     * @return A description of what the parameter does, how to use it, the default value, and whether or not the
     *         parameter is optional.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of what the parameter does, how to use it, the default value, and whether or not the parameter is
     * optional.
     * </p>
     * 
     * @param description
     *        A description of what the parameter does, how to use it, the default value, and whether or not the
     *        parameter is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentParameter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If specified, the default values for the parameters. Parameters without a default value are required. Parameters
     * with a default value are optional.
     * </p>
     * 
     * @param defaultValue
     *        If specified, the default values for the parameters. Parameters without a default value are required.
     *        Parameters with a default value are optional.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * If specified, the default values for the parameters. Parameters without a default value are required. Parameters
     * with a default value are optional.
     * </p>
     * 
     * @return If specified, the default values for the parameters. Parameters without a default value are required.
     *         Parameters with a default value are optional.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * If specified, the default values for the parameters. Parameters without a default value are required. Parameters
     * with a default value are optional.
     * </p>
     * 
     * @param defaultValue
     *        If specified, the default values for the parameters. Parameters without a default value are required.
     *        Parameters with a default value are optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentParameter withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: " + getDefaultValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentParameter == false)
            return false;
        DocumentParameter other = (DocumentParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        return hashCode;
    }

    @Override
    public DocumentParameter clone() {
        try {
            return (DocumentParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
