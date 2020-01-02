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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The model variable.&gt;
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ModelVariable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelVariable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The model variable's name.&gt;
     * </p>
     */
    private String name;
    /**
     * <p>
     * The model variable's index.&gt;
     * </p>
     */
    private Integer index;

    /**
     * <p>
     * The model variable's name.&gt;
     * </p>
     * 
     * @param name
     *        The model variable's name.&gt;
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The model variable's name.&gt;
     * </p>
     * 
     * @return The model variable's name.&gt;
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The model variable's name.&gt;
     * </p>
     * 
     * @param name
     *        The model variable's name.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVariable withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The model variable's index.&gt;
     * </p>
     * 
     * @param index
     *        The model variable's index.&gt;
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The model variable's index.&gt;
     * </p>
     * 
     * @return The model variable's index.&gt;
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The model variable's index.&gt;
     * </p>
     * 
     * @param index
     *        The model variable's index.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelVariable withIndex(Integer index) {
        setIndex(index);
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelVariable == false)
            return false;
        ModelVariable other = (ModelVariable) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        return hashCode;
    }

    @Override
    public ModelVariable clone() {
        try {
            return (ModelVariable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ModelVariableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
