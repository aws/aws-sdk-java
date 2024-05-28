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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Extra details specific to this schema change type notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/SchemaChangeRequestDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaChangeRequestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     * </p>
     */
    private java.util.List<SchemaChangeDetails> changes;
    /**
     * <p>
     * A date in the future when the schema change is taking effect.
     * </p>
     */
    private java.util.Date schemaChangeAt;

    /**
     * <p>
     * List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     * </p>
     * 
     * @return List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     */

    public java.util.List<SchemaChangeDetails> getChanges() {
        return changes;
    }

    /**
     * <p>
     * List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     * </p>
     * 
     * @param changes
     *        List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     */

    public void setChanges(java.util.Collection<SchemaChangeDetails> changes) {
        if (changes == null) {
            this.changes = null;
            return;
        }

        this.changes = new java.util.ArrayList<SchemaChangeDetails>(changes);
    }

    /**
     * <p>
     * List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChanges(java.util.Collection)} or {@link #withChanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param changes
     *        List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaChangeRequestDetails withChanges(SchemaChangeDetails... changes) {
        if (this.changes == null) {
            setChanges(new java.util.ArrayList<SchemaChangeDetails>(changes.length));
        }
        for (SchemaChangeDetails ele : changes) {
            this.changes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     * </p>
     * 
     * @param changes
     *        List of schema changes happening in the scope of this notification. This can have up to 100 entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaChangeRequestDetails withChanges(java.util.Collection<SchemaChangeDetails> changes) {
        setChanges(changes);
        return this;
    }

    /**
     * <p>
     * A date in the future when the schema change is taking effect.
     * </p>
     * 
     * @param schemaChangeAt
     *        A date in the future when the schema change is taking effect.
     */

    public void setSchemaChangeAt(java.util.Date schemaChangeAt) {
        this.schemaChangeAt = schemaChangeAt;
    }

    /**
     * <p>
     * A date in the future when the schema change is taking effect.
     * </p>
     * 
     * @return A date in the future when the schema change is taking effect.
     */

    public java.util.Date getSchemaChangeAt() {
        return this.schemaChangeAt;
    }

    /**
     * <p>
     * A date in the future when the schema change is taking effect.
     * </p>
     * 
     * @param schemaChangeAt
     *        A date in the future when the schema change is taking effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaChangeRequestDetails withSchemaChangeAt(java.util.Date schemaChangeAt) {
        setSchemaChangeAt(schemaChangeAt);
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
        if (getChanges() != null)
            sb.append("Changes: ").append(getChanges()).append(",");
        if (getSchemaChangeAt() != null)
            sb.append("SchemaChangeAt: ").append(getSchemaChangeAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaChangeRequestDetails == false)
            return false;
        SchemaChangeRequestDetails other = (SchemaChangeRequestDetails) obj;
        if (other.getChanges() == null ^ this.getChanges() == null)
            return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false)
            return false;
        if (other.getSchemaChangeAt() == null ^ this.getSchemaChangeAt() == null)
            return false;
        if (other.getSchemaChangeAt() != null && other.getSchemaChangeAt().equals(this.getSchemaChangeAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode());
        hashCode = prime * hashCode + ((getSchemaChangeAt() == null) ? 0 : getSchemaChangeAt().hashCode());
        return hashCode;
    }

    @Override
    public SchemaChangeRequestDetails clone() {
        try {
            return (SchemaChangeRequestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.SchemaChangeRequestDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
