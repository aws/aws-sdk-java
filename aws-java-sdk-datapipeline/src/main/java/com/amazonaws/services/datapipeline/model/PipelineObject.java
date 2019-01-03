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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a pipeline object. This can be a logical, physical, or physical attempt pipeline object.
 * The complete set of components of a pipeline defines the pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/PipelineObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the object.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the object.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Key-value pairs that define the properties of the object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Field> fields;

    /**
     * <p>
     * The ID of the object.
     * </p>
     * 
     * @param id
     *        The ID of the object.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the object.
     * </p>
     * 
     * @return The ID of the object.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the object.
     * </p>
     * 
     * @param id
     *        The ID of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineObject withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the object.
     * </p>
     * 
     * @param name
     *        The name of the object.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the object.
     * </p>
     * 
     * @return The name of the object.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the object.
     * </p>
     * 
     * @param name
     *        The name of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineObject withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that define the properties of the object.
     * </p>
     * 
     * @return Key-value pairs that define the properties of the object.
     */

    public java.util.List<Field> getFields() {
        if (fields == null) {
            fields = new com.amazonaws.internal.SdkInternalList<Field>();
        }
        return fields;
    }

    /**
     * <p>
     * Key-value pairs that define the properties of the object.
     * </p>
     * 
     * @param fields
     *        Key-value pairs that define the properties of the object.
     */

    public void setFields(java.util.Collection<Field> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new com.amazonaws.internal.SdkInternalList<Field>(fields);
    }

    /**
     * <p>
     * Key-value pairs that define the properties of the object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        Key-value pairs that define the properties of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineObject withFields(Field... fields) {
        if (this.fields == null) {
            setFields(new com.amazonaws.internal.SdkInternalList<Field>(fields.length));
        }
        for (Field ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that define the properties of the object.
     * </p>
     * 
     * @param fields
     *        Key-value pairs that define the properties of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineObject withFields(java.util.Collection<Field> fields) {
        setFields(fields);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineObject == false)
            return false;
        PipelineObject other = (PipelineObject) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public PipelineObject clone() {
        try {
            return (PipelineObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.PipelineObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
