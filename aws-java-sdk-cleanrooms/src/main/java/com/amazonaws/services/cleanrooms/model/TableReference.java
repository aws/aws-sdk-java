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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A pointer to the dataset that underlies this table. Currently, this can only be an Glue table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/TableReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If present, a reference to the Glue table referred to by this table reference.
     * </p>
     */
    private GlueTableReference glue;

    /**
     * <p>
     * If present, a reference to the Glue table referred to by this table reference.
     * </p>
     * 
     * @param glue
     *        If present, a reference to the Glue table referred to by this table reference.
     */

    public void setGlue(GlueTableReference glue) {
        this.glue = glue;
    }

    /**
     * <p>
     * If present, a reference to the Glue table referred to by this table reference.
     * </p>
     * 
     * @return If present, a reference to the Glue table referred to by this table reference.
     */

    public GlueTableReference getGlue() {
        return this.glue;
    }

    /**
     * <p>
     * If present, a reference to the Glue table referred to by this table reference.
     * </p>
     * 
     * @param glue
     *        If present, a reference to the Glue table referred to by this table reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableReference withGlue(GlueTableReference glue) {
        setGlue(glue);
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
        if (getGlue() != null)
            sb.append("Glue: ").append(getGlue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableReference == false)
            return false;
        TableReference other = (TableReference) obj;
        if (other.getGlue() == null ^ this.getGlue() == null)
            return false;
        if (other.getGlue() != null && other.getGlue().equals(this.getGlue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlue() == null) ? 0 : getGlue().hashCode());
        return hashCode;
    }

    @Override
    public TableReference clone() {
        try {
            return (TableReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.TableReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
