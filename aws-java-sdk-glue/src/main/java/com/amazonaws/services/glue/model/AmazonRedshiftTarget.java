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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Amazon Redshift target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/AmazonRedshiftTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRedshiftTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon Redshift target.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the data of the Amazon Redshift target node.
     * </p>
     */
    private AmazonRedshiftNodeData data;
    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     */
    private java.util.List<String> inputs;

    /**
     * <p>
     * The name of the Amazon Redshift target.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Redshift target.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Redshift target.
     * </p>
     * 
     * @return The name of the Amazon Redshift target.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Redshift target.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Redshift target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftTarget withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the data of the Amazon Redshift target node.
     * </p>
     * 
     * @param data
     *        Specifies the data of the Amazon Redshift target node.
     */

    public void setData(AmazonRedshiftNodeData data) {
        this.data = data;
    }

    /**
     * <p>
     * Specifies the data of the Amazon Redshift target node.
     * </p>
     * 
     * @return Specifies the data of the Amazon Redshift target node.
     */

    public AmazonRedshiftNodeData getData() {
        return this.data;
    }

    /**
     * <p>
     * Specifies the data of the Amazon Redshift target node.
     * </p>
     * 
     * @param data
     *        Specifies the data of the Amazon Redshift target node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftTarget withData(AmazonRedshiftNodeData data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @return The nodes that are inputs to the data target.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
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
     * The nodes that are inputs to the data target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftTarget withInputs(String... inputs) {
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
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftTarget withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonRedshiftTarget == false)
            return false;
        AmazonRedshiftTarget other = (AmazonRedshiftTarget) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        return hashCode;
    }

    @Override
    public AmazonRedshiftTarget clone() {
        try {
            return (AmazonRedshiftTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.AmazonRedshiftTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
