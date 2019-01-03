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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An argument or property of a node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CodeGenNodeArg" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeGenNodeArg implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the argument or property.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the argument or property.
     * </p>
     */
    private String value;
    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     */
    private Boolean param;

    /**
     * <p>
     * The name of the argument or property.
     * </p>
     * 
     * @param name
     *        The name of the argument or property.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the argument or property.
     * </p>
     * 
     * @return The name of the argument or property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the argument or property.
     * </p>
     * 
     * @param name
     *        The name of the argument or property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenNodeArg withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the argument or property.
     * </p>
     * 
     * @param value
     *        The value of the argument or property.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the argument or property.
     * </p>
     * 
     * @return The value of the argument or property.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the argument or property.
     * </p>
     * 
     * @param value
     *        The value of the argument or property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenNodeArg withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     * 
     * @param param
     *        True if the value is used as a parameter.
     */

    public void setParam(Boolean param) {
        this.param = param;
    }

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     * 
     * @return True if the value is used as a parameter.
     */

    public Boolean getParam() {
        return this.param;
    }

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     * 
     * @param param
     *        True if the value is used as a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeGenNodeArg withParam(Boolean param) {
        setParam(param);
        return this;
    }

    /**
     * <p>
     * True if the value is used as a parameter.
     * </p>
     * 
     * @return True if the value is used as a parameter.
     */

    public Boolean isParam() {
        return this.param;
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
            sb.append("Value: ").append(getValue()).append(",");
        if (getParam() != null)
            sb.append("Param: ").append(getParam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeGenNodeArg == false)
            return false;
        CodeGenNodeArg other = (CodeGenNodeArg) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getParam() == null ^ this.getParam() == null)
            return false;
        if (other.getParam() != null && other.getParam().equals(this.getParam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getParam() == null) ? 0 : getParam().hashCode());
        return hashCode;
    }

    @Override
    public CodeGenNodeArg clone() {
        try {
            return (CodeGenNodeArg) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CodeGenNodeArgMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
