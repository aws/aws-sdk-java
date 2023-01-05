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
 * Specifies a transform that removes columns from the dataset if all values in the column are 'null'. By default, Glue
 * Studio will recognize null objects, but some values such as empty strings, strings that are "null", -1 integers or
 * other placeholders such as zeros, are not automatically recognized as nulls.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DropNullFields" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DropNullFields implements Serializable, Cloneable, StructuredPojo {

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
     * A structure that represents whether certain values are recognized as null values for removal.
     * </p>
     */
    private NullCheckBoxList nullCheckBoxList;
    /**
     * <p>
     * A structure that specifies a list of NullValueField structures that represent a custom null value such as zero or
     * other value being used as a null placeholder unique to the dataset.
     * </p>
     * <p>
     * The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     * placeholder and the datatype match the data.
     * </p>
     */
    private java.util.List<NullValueField> nullTextList;

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

    public DropNullFields withName(String name) {
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

    public DropNullFields withInputs(String... inputs) {
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

    public DropNullFields withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * A structure that represents whether certain values are recognized as null values for removal.
     * </p>
     * 
     * @param nullCheckBoxList
     *        A structure that represents whether certain values are recognized as null values for removal.
     */

    public void setNullCheckBoxList(NullCheckBoxList nullCheckBoxList) {
        this.nullCheckBoxList = nullCheckBoxList;
    }

    /**
     * <p>
     * A structure that represents whether certain values are recognized as null values for removal.
     * </p>
     * 
     * @return A structure that represents whether certain values are recognized as null values for removal.
     */

    public NullCheckBoxList getNullCheckBoxList() {
        return this.nullCheckBoxList;
    }

    /**
     * <p>
     * A structure that represents whether certain values are recognized as null values for removal.
     * </p>
     * 
     * @param nullCheckBoxList
     *        A structure that represents whether certain values are recognized as null values for removal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DropNullFields withNullCheckBoxList(NullCheckBoxList nullCheckBoxList) {
        setNullCheckBoxList(nullCheckBoxList);
        return this;
    }

    /**
     * <p>
     * A structure that specifies a list of NullValueField structures that represent a custom null value such as zero or
     * other value being used as a null placeholder unique to the dataset.
     * </p>
     * <p>
     * The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     * placeholder and the datatype match the data.
     * </p>
     * 
     * @return A structure that specifies a list of NullValueField structures that represent a custom null value such as
     *         zero or other value being used as a null placeholder unique to the dataset.</p>
     *         <p>
     *         The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     *         placeholder and the datatype match the data.
     */

    public java.util.List<NullValueField> getNullTextList() {
        return nullTextList;
    }

    /**
     * <p>
     * A structure that specifies a list of NullValueField structures that represent a custom null value such as zero or
     * other value being used as a null placeholder unique to the dataset.
     * </p>
     * <p>
     * The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     * placeholder and the datatype match the data.
     * </p>
     * 
     * @param nullTextList
     *        A structure that specifies a list of NullValueField structures that represent a custom null value such as
     *        zero or other value being used as a null placeholder unique to the dataset.</p>
     *        <p>
     *        The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     *        placeholder and the datatype match the data.
     */

    public void setNullTextList(java.util.Collection<NullValueField> nullTextList) {
        if (nullTextList == null) {
            this.nullTextList = null;
            return;
        }

        this.nullTextList = new java.util.ArrayList<NullValueField>(nullTextList);
    }

    /**
     * <p>
     * A structure that specifies a list of NullValueField structures that represent a custom null value such as zero or
     * other value being used as a null placeholder unique to the dataset.
     * </p>
     * <p>
     * The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     * placeholder and the datatype match the data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNullTextList(java.util.Collection)} or {@link #withNullTextList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nullTextList
     *        A structure that specifies a list of NullValueField structures that represent a custom null value such as
     *        zero or other value being used as a null placeholder unique to the dataset.</p>
     *        <p>
     *        The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     *        placeholder and the datatype match the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DropNullFields withNullTextList(NullValueField... nullTextList) {
        if (this.nullTextList == null) {
            setNullTextList(new java.util.ArrayList<NullValueField>(nullTextList.length));
        }
        for (NullValueField ele : nullTextList) {
            this.nullTextList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that specifies a list of NullValueField structures that represent a custom null value such as zero or
     * other value being used as a null placeholder unique to the dataset.
     * </p>
     * <p>
     * The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     * placeholder and the datatype match the data.
     * </p>
     * 
     * @param nullTextList
     *        A structure that specifies a list of NullValueField structures that represent a custom null value such as
     *        zero or other value being used as a null placeholder unique to the dataset.</p>
     *        <p>
     *        The <code>DropNullFields</code> transform removes custom null values only if both the value of the null
     *        placeholder and the datatype match the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DropNullFields withNullTextList(java.util.Collection<NullValueField> nullTextList) {
        setNullTextList(nullTextList);
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
        if (getNullCheckBoxList() != null)
            sb.append("NullCheckBoxList: ").append(getNullCheckBoxList()).append(",");
        if (getNullTextList() != null)
            sb.append("NullTextList: ").append(getNullTextList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DropNullFields == false)
            return false;
        DropNullFields other = (DropNullFields) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getNullCheckBoxList() == null ^ this.getNullCheckBoxList() == null)
            return false;
        if (other.getNullCheckBoxList() != null && other.getNullCheckBoxList().equals(this.getNullCheckBoxList()) == false)
            return false;
        if (other.getNullTextList() == null ^ this.getNullTextList() == null)
            return false;
        if (other.getNullTextList() != null && other.getNullTextList().equals(this.getNullTextList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getNullCheckBoxList() == null) ? 0 : getNullCheckBoxList().hashCode());
        hashCode = prime * hashCode + ((getNullTextList() == null) ? 0 : getNullTextList().hashCode());
        return hashCode;
    }

    @Override
    public DropNullFields clone() {
        try {
            return (DropNullFields) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DropNullFieldsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
