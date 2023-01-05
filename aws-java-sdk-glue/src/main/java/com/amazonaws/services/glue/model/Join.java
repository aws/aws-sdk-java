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
 * Specifies a transform that joins two datasets into one dataset using a comparison phrase on the specified data
 * property keys. You can use inner, outer, left, right, left semi, and left anti joins.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Join" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Join implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * Specifies the type of join to be performed on the datasets.
     * </p>
     */
    private String joinType;
    /**
     * <p>
     * A list of the two columns to be joined.
     * </p>
     */
    private java.util.List<JoinColumn> columns;

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

    public Join withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @return The data inputs identified by their node names.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
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
     * The data inputs identified by their node names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Join withInputs(String... inputs) {
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
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Join withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * Specifies the type of join to be performed on the datasets.
     * </p>
     * 
     * @param joinType
     *        Specifies the type of join to be performed on the datasets.
     * @see JoinType
     */

    public void setJoinType(String joinType) {
        this.joinType = joinType;
    }

    /**
     * <p>
     * Specifies the type of join to be performed on the datasets.
     * </p>
     * 
     * @return Specifies the type of join to be performed on the datasets.
     * @see JoinType
     */

    public String getJoinType() {
        return this.joinType;
    }

    /**
     * <p>
     * Specifies the type of join to be performed on the datasets.
     * </p>
     * 
     * @param joinType
     *        Specifies the type of join to be performed on the datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinType
     */

    public Join withJoinType(String joinType) {
        setJoinType(joinType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of join to be performed on the datasets.
     * </p>
     * 
     * @param joinType
     *        Specifies the type of join to be performed on the datasets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JoinType
     */

    public Join withJoinType(JoinType joinType) {
        this.joinType = joinType.toString();
        return this;
    }

    /**
     * <p>
     * A list of the two columns to be joined.
     * </p>
     * 
     * @return A list of the two columns to be joined.
     */

    public java.util.List<JoinColumn> getColumns() {
        return columns;
    }

    /**
     * <p>
     * A list of the two columns to be joined.
     * </p>
     * 
     * @param columns
     *        A list of the two columns to be joined.
     */

    public void setColumns(java.util.Collection<JoinColumn> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<JoinColumn>(columns);
    }

    /**
     * <p>
     * A list of the two columns to be joined.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        A list of the two columns to be joined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Join withColumns(JoinColumn... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<JoinColumn>(columns.length));
        }
        for (JoinColumn ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the two columns to be joined.
     * </p>
     * 
     * @param columns
     *        A list of the two columns to be joined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Join withColumns(java.util.Collection<JoinColumn> columns) {
        setColumns(columns);
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
        if (getJoinType() != null)
            sb.append("JoinType: ").append(getJoinType()).append(",");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Join == false)
            return false;
        Join other = (Join) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getJoinType() == null ^ this.getJoinType() == null)
            return false;
        if (other.getJoinType() != null && other.getJoinType().equals(this.getJoinType()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getJoinType() == null) ? 0 : getJoinType().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        return hashCode;
    }

    @Override
    public Join clone() {
        try {
            return (Join) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JoinMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
