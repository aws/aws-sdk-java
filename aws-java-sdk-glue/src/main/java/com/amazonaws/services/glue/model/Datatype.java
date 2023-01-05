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
 * A structure representing the datatype of the value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Datatype" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Datatype implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The datatype of the value.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A label assigned to the datatype.
     * </p>
     */
    private String label;

    /**
     * <p>
     * The datatype of the value.
     * </p>
     * 
     * @param id
     *        The datatype of the value.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The datatype of the value.
     * </p>
     * 
     * @return The datatype of the value.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The datatype of the value.
     * </p>
     * 
     * @param id
     *        The datatype of the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datatype withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A label assigned to the datatype.
     * </p>
     * 
     * @param label
     *        A label assigned to the datatype.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A label assigned to the datatype.
     * </p>
     * 
     * @return A label assigned to the datatype.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A label assigned to the datatype.
     * </p>
     * 
     * @param label
     *        A label assigned to the datatype.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datatype withLabel(String label) {
        setLabel(label);
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Datatype == false)
            return false;
        Datatype other = (Datatype) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public Datatype clone() {
        try {
            return (Datatype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DatatypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
