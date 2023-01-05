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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the state configuration when an action modifies a property of another element within the same component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/MutationActionSetStateParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MutationActionSetStateParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the component that is being modified.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The name of the component property to apply the state configuration to.
     * </p>
     */
    private String property;
    /**
     * <p>
     * The state configuration to assign to the property.
     * </p>
     */
    private ComponentProperty set;

    /**
     * <p>
     * The name of the component that is being modified.
     * </p>
     * 
     * @param componentName
     *        The name of the component that is being modified.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component that is being modified.
     * </p>
     * 
     * @return The name of the component that is being modified.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component that is being modified.
     * </p>
     * 
     * @param componentName
     *        The name of the component that is being modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutationActionSetStateParameter withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The name of the component property to apply the state configuration to.
     * </p>
     * 
     * @param property
     *        The name of the component property to apply the state configuration to.
     */

    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * <p>
     * The name of the component property to apply the state configuration to.
     * </p>
     * 
     * @return The name of the component property to apply the state configuration to.
     */

    public String getProperty() {
        return this.property;
    }

    /**
     * <p>
     * The name of the component property to apply the state configuration to.
     * </p>
     * 
     * @param property
     *        The name of the component property to apply the state configuration to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutationActionSetStateParameter withProperty(String property) {
        setProperty(property);
        return this;
    }

    /**
     * <p>
     * The state configuration to assign to the property.
     * </p>
     * 
     * @param set
     *        The state configuration to assign to the property.
     */

    public void setSet(ComponentProperty set) {
        this.set = set;
    }

    /**
     * <p>
     * The state configuration to assign to the property.
     * </p>
     * 
     * @return The state configuration to assign to the property.
     */

    public ComponentProperty getSet() {
        return this.set;
    }

    /**
     * <p>
     * The state configuration to assign to the property.
     * </p>
     * 
     * @param set
     *        The state configuration to assign to the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MutationActionSetStateParameter withSet(ComponentProperty set) {
        setSet(set);
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getProperty() != null)
            sb.append("Property: ").append(getProperty()).append(",");
        if (getSet() != null)
            sb.append("Set: ").append(getSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MutationActionSetStateParameter == false)
            return false;
        MutationActionSetStateParameter other = (MutationActionSetStateParameter) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getProperty() == null ^ this.getProperty() == null)
            return false;
        if (other.getProperty() != null && other.getProperty().equals(this.getProperty()) == false)
            return false;
        if (other.getSet() == null ^ this.getSet() == null)
            return false;
        if (other.getSet() != null && other.getSet().equals(this.getSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getProperty() == null) ? 0 : getProperty().hashCode());
        hashCode = prime * hashCode + ((getSet() == null) ? 0 : getSet().hashCode());
        return hashCode;
    }

    @Override
    public MutationActionSetStateParameter clone() {
        try {
            return (MutationActionSetStateParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.MutationActionSetStateParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
