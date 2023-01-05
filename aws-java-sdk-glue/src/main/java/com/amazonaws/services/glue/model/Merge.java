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
 * Specifies a transform that merges a <code>DynamicFrame</code> with a staging <code>DynamicFrame</code> based on the
 * specified primary keys to identify records. Duplicate records (records with the same primary keys) are not
 * de-duplicated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Merge" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Merge implements Serializable, Cloneable, StructuredPojo {

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
     * The source <code>DynamicFrame</code> that will be merged with a staging <code>DynamicFrame</code>.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The list of primary key fields to match records from the source and staging dynamic frames.
     * </p>
     */
    private java.util.List<java.util.List<String>> primaryKeys;

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

    public Merge withName(String name) {
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

    public Merge withInputs(String... inputs) {
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

    public Merge withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The source <code>DynamicFrame</code> that will be merged with a staging <code>DynamicFrame</code>.
     * </p>
     * 
     * @param source
     *        The source <code>DynamicFrame</code> that will be merged with a staging <code>DynamicFrame</code>.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source <code>DynamicFrame</code> that will be merged with a staging <code>DynamicFrame</code>.
     * </p>
     * 
     * @return The source <code>DynamicFrame</code> that will be merged with a staging <code>DynamicFrame</code>.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source <code>DynamicFrame</code> that will be merged with a staging <code>DynamicFrame</code>.
     * </p>
     * 
     * @param source
     *        The source <code>DynamicFrame</code> that will be merged with a staging <code>DynamicFrame</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Merge withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The list of primary key fields to match records from the source and staging dynamic frames.
     * </p>
     * 
     * @return The list of primary key fields to match records from the source and staging dynamic frames.
     */

    public java.util.List<java.util.List<String>> getPrimaryKeys() {
        return primaryKeys;
    }

    /**
     * <p>
     * The list of primary key fields to match records from the source and staging dynamic frames.
     * </p>
     * 
     * @param primaryKeys
     *        The list of primary key fields to match records from the source and staging dynamic frames.
     */

    public void setPrimaryKeys(java.util.Collection<java.util.List<String>> primaryKeys) {
        if (primaryKeys == null) {
            this.primaryKeys = null;
            return;
        }

        this.primaryKeys = new java.util.ArrayList<java.util.List<String>>(primaryKeys);
    }

    /**
     * <p>
     * The list of primary key fields to match records from the source and staging dynamic frames.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrimaryKeys(java.util.Collection)} or {@link #withPrimaryKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param primaryKeys
     *        The list of primary key fields to match records from the source and staging dynamic frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Merge withPrimaryKeys(java.util.List<String>... primaryKeys) {
        if (this.primaryKeys == null) {
            setPrimaryKeys(new java.util.ArrayList<java.util.List<String>>(primaryKeys.length));
        }
        for (java.util.List<String> ele : primaryKeys) {
            this.primaryKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of primary key fields to match records from the source and staging dynamic frames.
     * </p>
     * 
     * @param primaryKeys
     *        The list of primary key fields to match records from the source and staging dynamic frames.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Merge withPrimaryKeys(java.util.Collection<java.util.List<String>> primaryKeys) {
        setPrimaryKeys(primaryKeys);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getPrimaryKeys() != null)
            sb.append("PrimaryKeys: ").append(getPrimaryKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Merge == false)
            return false;
        Merge other = (Merge) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getPrimaryKeys() == null ^ this.getPrimaryKeys() == null)
            return false;
        if (other.getPrimaryKeys() != null && other.getPrimaryKeys().equals(this.getPrimaryKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getPrimaryKeys() == null) ? 0 : getPrimaryKeys().hashCode());
        return hashCode;
    }

    @Override
    public Merge clone() {
        try {
            return (Merge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.MergeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
