/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration details of the component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ComponentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     */
    private String componentArn;
    /**
     * <p>
     * A group of parameter settings that are used to configure the component for a specific recipe.
     * </p>
     */
    private java.util.List<ComponentParameter> parameters;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param componentArn
     *        The Amazon Resource Name (ARN) of the component.
     */

    public void setComponentArn(String componentArn) {
        this.componentArn = componentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the component.
     */

    public String getComponentArn() {
        return this.componentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param componentArn
     *        The Amazon Resource Name (ARN) of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConfiguration withComponentArn(String componentArn) {
        setComponentArn(componentArn);
        return this;
    }

    /**
     * <p>
     * A group of parameter settings that are used to configure the component for a specific recipe.
     * </p>
     * 
     * @return A group of parameter settings that are used to configure the component for a specific recipe.
     */

    public java.util.List<ComponentParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A group of parameter settings that are used to configure the component for a specific recipe.
     * </p>
     * 
     * @param parameters
     *        A group of parameter settings that are used to configure the component for a specific recipe.
     */

    public void setParameters(java.util.Collection<ComponentParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<ComponentParameter>(parameters);
    }

    /**
     * <p>
     * A group of parameter settings that are used to configure the component for a specific recipe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A group of parameter settings that are used to configure the component for a specific recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConfiguration withParameters(ComponentParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new java.util.ArrayList<ComponentParameter>(parameters.length));
        }
        for (ComponentParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A group of parameter settings that are used to configure the component for a specific recipe.
     * </p>
     * 
     * @param parameters
     *        A group of parameter settings that are used to configure the component for a specific recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentConfiguration withParameters(java.util.Collection<ComponentParameter> parameters) {
        setParameters(parameters);
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
        if (getComponentArn() != null)
            sb.append("ComponentArn: ").append(getComponentArn()).append(",");
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

        if (obj instanceof ComponentConfiguration == false)
            return false;
        ComponentConfiguration other = (ComponentConfiguration) obj;
        if (other.getComponentArn() == null ^ this.getComponentArn() == null)
            return false;
        if (other.getComponentArn() != null && other.getComponentArn().equals(this.getComponentArn()) == false)
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

        hashCode = prime * hashCode + ((getComponentArn() == null) ? 0 : getComponentArn().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ComponentConfiguration clone() {
        try {
            return (ComponentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ComponentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
