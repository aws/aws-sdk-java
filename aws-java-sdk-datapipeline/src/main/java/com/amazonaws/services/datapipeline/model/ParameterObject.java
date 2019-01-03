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
 * Contains information about a parameter object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ParameterObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the parameter object.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The attributes of the parameter object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterAttribute> attributes;

    /**
     * <p>
     * The ID of the parameter object.
     * </p>
     * 
     * @param id
     *        The ID of the parameter object.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the parameter object.
     * </p>
     * 
     * @return The ID of the parameter object.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the parameter object.
     * </p>
     * 
     * @param id
     *        The ID of the parameter object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterObject withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The attributes of the parameter object.
     * </p>
     * 
     * @return The attributes of the parameter object.
     */

    public java.util.List<ParameterAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<ParameterAttribute>();
        }
        return attributes;
    }

    /**
     * <p>
     * The attributes of the parameter object.
     * </p>
     * 
     * @param attributes
     *        The attributes of the parameter object.
     */

    public void setAttributes(java.util.Collection<ParameterAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<ParameterAttribute>(attributes);
    }

    /**
     * <p>
     * The attributes of the parameter object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes of the parameter object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterObject withAttributes(ParameterAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<ParameterAttribute>(attributes.length));
        }
        for (ParameterAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes of the parameter object.
     * </p>
     * 
     * @param attributes
     *        The attributes of the parameter object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterObject withAttributes(java.util.Collection<ParameterAttribute> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterObject == false)
            return false;
        ParameterObject other = (ParameterObject) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ParameterObject clone() {
        try {
            return (ParameterObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.ParameterObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
