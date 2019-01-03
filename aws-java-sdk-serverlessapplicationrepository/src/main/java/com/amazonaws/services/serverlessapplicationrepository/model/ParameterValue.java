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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameter value of the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ParameterValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS
     * CloudFormation uses the default value that is specified in your template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS
     * CloudFormation uses the default value that is specified in your template.
     * </p>
     * 
     * @param name
     *        The key associated with the parameter. If you don't specify a key and value for a particular parameter,
     *        AWS CloudFormation uses the default value that is specified in your template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS
     * CloudFormation uses the default value that is specified in your template.
     * </p>
     * 
     * @return The key associated with the parameter. If you don't specify a key and value for a particular parameter,
     *         AWS CloudFormation uses the default value that is specified in your template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS
     * CloudFormation uses the default value that is specified in your template.
     * </p>
     * 
     * @param name
     *        The key associated with the parameter. If you don't specify a key and value for a particular parameter,
     *        AWS CloudFormation uses the default value that is specified in your template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     * 
     * @param value
     *        The input value associated with the parameter.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     * 
     * @return The input value associated with the parameter.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     * 
     * @param value
     *        The input value associated with the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterValue withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterValue == false)
            return false;
        ParameterValue other = (ParameterValue) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ParameterValue clone() {
        try {
            return (ParameterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.serverlessapplicationrepository.model.transform.ParameterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
