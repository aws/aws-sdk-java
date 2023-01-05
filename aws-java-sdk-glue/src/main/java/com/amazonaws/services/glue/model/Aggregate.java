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
 * Specifies a transform that groups rows by chosen fields and computes the aggregated value by specified function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Aggregate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Aggregate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the fields and rows to use as inputs for the aggregate transform.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * Specifies the fields to group by.
     * </p>
     */
    private java.util.List<java.util.List<String>> groups;
    /**
     * <p>
     * Specifies the aggregate functions to be performed on specified fields.
     * </p>
     */
    private java.util.List<AggregateOperation> aggs;

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

    public Aggregate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the fields and rows to use as inputs for the aggregate transform.
     * </p>
     * 
     * @return Specifies the fields and rows to use as inputs for the aggregate transform.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * Specifies the fields and rows to use as inputs for the aggregate transform.
     * </p>
     * 
     * @param inputs
     *        Specifies the fields and rows to use as inputs for the aggregate transform.
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
     * Specifies the fields and rows to use as inputs for the aggregate transform.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        Specifies the fields and rows to use as inputs for the aggregate transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregate withInputs(String... inputs) {
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
     * Specifies the fields and rows to use as inputs for the aggregate transform.
     * </p>
     * 
     * @param inputs
     *        Specifies the fields and rows to use as inputs for the aggregate transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregate withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * Specifies the fields to group by.
     * </p>
     * 
     * @return Specifies the fields to group by.
     */

    public java.util.List<java.util.List<String>> getGroups() {
        return groups;
    }

    /**
     * <p>
     * Specifies the fields to group by.
     * </p>
     * 
     * @param groups
     *        Specifies the fields to group by.
     */

    public void setGroups(java.util.Collection<java.util.List<String>> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<java.util.List<String>>(groups);
    }

    /**
     * <p>
     * Specifies the fields to group by.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        Specifies the fields to group by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregate withGroups(java.util.List<String>... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<java.util.List<String>>(groups.length));
        }
        for (java.util.List<String> ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the fields to group by.
     * </p>
     * 
     * @param groups
     *        Specifies the fields to group by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregate withGroups(java.util.Collection<java.util.List<String>> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * Specifies the aggregate functions to be performed on specified fields.
     * </p>
     * 
     * @return Specifies the aggregate functions to be performed on specified fields.
     */

    public java.util.List<AggregateOperation> getAggs() {
        return aggs;
    }

    /**
     * <p>
     * Specifies the aggregate functions to be performed on specified fields.
     * </p>
     * 
     * @param aggs
     *        Specifies the aggregate functions to be performed on specified fields.
     */

    public void setAggs(java.util.Collection<AggregateOperation> aggs) {
        if (aggs == null) {
            this.aggs = null;
            return;
        }

        this.aggs = new java.util.ArrayList<AggregateOperation>(aggs);
    }

    /**
     * <p>
     * Specifies the aggregate functions to be performed on specified fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggs(java.util.Collection)} or {@link #withAggs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param aggs
     *        Specifies the aggregate functions to be performed on specified fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregate withAggs(AggregateOperation... aggs) {
        if (this.aggs == null) {
            setAggs(new java.util.ArrayList<AggregateOperation>(aggs.length));
        }
        for (AggregateOperation ele : aggs) {
            this.aggs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the aggregate functions to be performed on specified fields.
     * </p>
     * 
     * @param aggs
     *        Specifies the aggregate functions to be performed on specified fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregate withAggs(java.util.Collection<AggregateOperation> aggs) {
        setAggs(aggs);
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
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getAggs() != null)
            sb.append("Aggs: ").append(getAggs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Aggregate == false)
            return false;
        Aggregate other = (Aggregate) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getAggs() == null ^ this.getAggs() == null)
            return false;
        if (other.getAggs() != null && other.getAggs().equals(this.getAggs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getAggs() == null) ? 0 : getAggs().hashCode());
        return hashCode;
    }

    @Override
    public Aggregate clone() {
        try {
            return (Aggregate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.AggregateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
