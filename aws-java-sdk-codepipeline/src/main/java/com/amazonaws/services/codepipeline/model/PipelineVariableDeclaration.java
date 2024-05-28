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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A variable declared at the pipeline level.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineVariableDeclaration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineVariableDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a pipeline-level variable.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of a pipeline-level variable.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The description of a pipeline-level variable. It's used to add additional context about the variable, and not
     * being used at time when pipeline executes.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of a pipeline-level variable.
     * </p>
     * 
     * @param name
     *        The name of a pipeline-level variable.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a pipeline-level variable.
     * </p>
     * 
     * @return The name of a pipeline-level variable.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a pipeline-level variable.
     * </p>
     * 
     * @param name
     *        The name of a pipeline-level variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineVariableDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of a pipeline-level variable.
     * </p>
     * 
     * @param defaultValue
     *        The value of a pipeline-level variable.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The value of a pipeline-level variable.
     * </p>
     * 
     * @return The value of a pipeline-level variable.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The value of a pipeline-level variable.
     * </p>
     * 
     * @param defaultValue
     *        The value of a pipeline-level variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineVariableDeclaration withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The description of a pipeline-level variable. It's used to add additional context about the variable, and not
     * being used at time when pipeline executes.
     * </p>
     * 
     * @param description
     *        The description of a pipeline-level variable. It's used to add additional context about the variable, and
     *        not being used at time when pipeline executes.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a pipeline-level variable. It's used to add additional context about the variable, and not
     * being used at time when pipeline executes.
     * </p>
     * 
     * @return The description of a pipeline-level variable. It's used to add additional context about the variable, and
     *         not being used at time when pipeline executes.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a pipeline-level variable. It's used to add additional context about the variable, and not
     * being used at time when pipeline executes.
     * </p>
     * 
     * @param description
     *        The description of a pipeline-level variable. It's used to add additional context about the variable, and
     *        not being used at time when pipeline executes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineVariableDeclaration withDescription(String description) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
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

        if (obj instanceof PipelineVariableDeclaration == false)
            return false;
        PipelineVariableDeclaration other = (PipelineVariableDeclaration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public PipelineVariableDeclaration clone() {
        try {
            return (PipelineVariableDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineVariableDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
