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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The dynamic SSM parameter value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DynamicSsmParameterValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamicSsmParameterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Variable dynamic parameters. A parameter value is determined when an incident is created.
     * </p>
     */
    private String variable;

    /**
     * <p>
     * Variable dynamic parameters. A parameter value is determined when an incident is created.
     * </p>
     * 
     * @param variable
     *        Variable dynamic parameters. A parameter value is determined when an incident is created.
     * @see VariableType
     */

    public void setVariable(String variable) {
        this.variable = variable;
    }

    /**
     * <p>
     * Variable dynamic parameters. A parameter value is determined when an incident is created.
     * </p>
     * 
     * @return Variable dynamic parameters. A parameter value is determined when an incident is created.
     * @see VariableType
     */

    public String getVariable() {
        return this.variable;
    }

    /**
     * <p>
     * Variable dynamic parameters. A parameter value is determined when an incident is created.
     * </p>
     * 
     * @param variable
     *        Variable dynamic parameters. A parameter value is determined when an incident is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VariableType
     */

    public DynamicSsmParameterValue withVariable(String variable) {
        setVariable(variable);
        return this;
    }

    /**
     * <p>
     * Variable dynamic parameters. A parameter value is determined when an incident is created.
     * </p>
     * 
     * @param variable
     *        Variable dynamic parameters. A parameter value is determined when an incident is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VariableType
     */

    public DynamicSsmParameterValue withVariable(VariableType variable) {
        this.variable = variable.toString();
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
        if (getVariable() != null)
            sb.append("Variable: ").append(getVariable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamicSsmParameterValue == false)
            return false;
        DynamicSsmParameterValue other = (DynamicSsmParameterValue) obj;
        if (other.getVariable() == null ^ this.getVariable() == null)
            return false;
        if (other.getVariable() != null && other.getVariable().equals(this.getVariable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariable() == null) ? 0 : getVariable().hashCode());
        return hashCode;
    }

    @Override
    public DynamicSsmParameterValue clone() {
        try {
            return (DynamicSsmParameterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.DynamicSsmParameterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
