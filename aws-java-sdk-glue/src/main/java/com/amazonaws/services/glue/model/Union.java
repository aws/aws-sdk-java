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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a transform that combines the rows from two or more datasets into a single result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Union" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Union implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * Indicates the type of Union transform.
     * </p>
     * <p>
     * Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting union
     * does not remove duplicate rows.
     * </p>
     * <p>
     * Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * </p>
     */
    private String unionType;

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @return The name of the transform node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Union withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     * 
     * @return The node ID inputs to the transform.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     * 
     * @param inputs
     *        The node ID inputs to the transform.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The node ID inputs to the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Union withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The node ID inputs to the transform.
     * </p>
     * 
     * @param inputs
     *        The node ID inputs to the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Union withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * Indicates the type of Union transform.
     * </p>
     * <p>
     * Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting union
     * does not remove duplicate rows.
     * </p>
     * <p>
     * Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * </p>
     * 
     * @param unionType
     *        Indicates the type of Union transform. </p>
     *        <p>
     *        Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting
     *        union does not remove duplicate rows.
     *        </p>
     *        <p>
     *        Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * @see UnionType
     */

    public void setUnionType(String unionType) {
        this.unionType = unionType;
    }

    /**
     * <p>
     * Indicates the type of Union transform.
     * </p>
     * <p>
     * Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting union
     * does not remove duplicate rows.
     * </p>
     * <p>
     * Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * </p>
     * 
     * @return Indicates the type of Union transform. </p>
     *         <p>
     *         Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting
     *         union does not remove duplicate rows.
     *         </p>
     *         <p>
     *         Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * @see UnionType
     */

    public String getUnionType() {
        return this.unionType;
    }

    /**
     * <p>
     * Indicates the type of Union transform.
     * </p>
     * <p>
     * Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting union
     * does not remove duplicate rows.
     * </p>
     * <p>
     * Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * </p>
     * 
     * @param unionType
     *        Indicates the type of Union transform. </p>
     *        <p>
     *        Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting
     *        union does not remove duplicate rows.
     *        </p>
     *        <p>
     *        Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnionType
     */

    public Union withUnionType(String unionType) {
        setUnionType(unionType);
        return this;
    }

    /**
     * <p>
     * Indicates the type of Union transform.
     * </p>
     * <p>
     * Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting union
     * does not remove duplicate rows.
     * </p>
     * <p>
     * Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * </p>
     * 
     * @param unionType
     *        Indicates the type of Union transform. </p>
     *        <p>
     *        Specify <code>ALL</code> to join all rows from data sources to the resulting DynamicFrame. The resulting
     *        union does not remove duplicate rows.
     *        </p>
     *        <p>
     *        Specify <code>DISTINCT</code> to remove duplicate rows in the resulting DynamicFrame.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnionType
     */

    public Union withUnionType(UnionType unionType) {
        this.unionType = unionType.toString();
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getUnionType() != null)
            sb.append("UnionType: ").append(getUnionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Union == false)
            return false;
        Union other = (Union) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getUnionType() == null ^ this.getUnionType() == null)
            return false;
        if (other.getUnionType() != null && other.getUnionType().equals(this.getUnionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getUnionType() == null) ? 0 : getUnionType().hashCode());
        return hashCode;
    }

    @Override
    public Union clone() {
        try {
            return (Union) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.UnionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
