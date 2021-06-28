/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that references a schema stored in the Glue Schema Registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SchemaReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that contains schema identity fields. Either this or the <code>SchemaVersionId</code> has to be
     * provided.
     * </p>
     */
    private SchemaId schemaId;
    /**
     * <p>
     * The unique ID assigned to a version of the schema. Either this or the <code>SchemaId</code> has to be provided.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * The version number of the schema.
     * </p>
     */
    private Long schemaVersionNumber;

    /**
     * <p>
     * A structure that contains schema identity fields. Either this or the <code>SchemaVersionId</code> has to be
     * provided.
     * </p>
     * 
     * @param schemaId
     *        A structure that contains schema identity fields. Either this or the <code>SchemaVersionId</code> has to
     *        be provided.
     */

    public void setSchemaId(SchemaId schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * A structure that contains schema identity fields. Either this or the <code>SchemaVersionId</code> has to be
     * provided.
     * </p>
     * 
     * @return A structure that contains schema identity fields. Either this or the <code>SchemaVersionId</code> has to
     *         be provided.
     */

    public SchemaId getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * A structure that contains schema identity fields. Either this or the <code>SchemaVersionId</code> has to be
     * provided.
     * </p>
     * 
     * @param schemaId
     *        A structure that contains schema identity fields. Either this or the <code>SchemaVersionId</code> has to
     *        be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaReference withSchemaId(SchemaId schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * The unique ID assigned to a version of the schema. Either this or the <code>SchemaId</code> has to be provided.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique ID assigned to a version of the schema. Either this or the <code>SchemaId</code> has to be
     *        provided.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * The unique ID assigned to a version of the schema. Either this or the <code>SchemaId</code> has to be provided.
     * </p>
     * 
     * @return The unique ID assigned to a version of the schema. Either this or the <code>SchemaId</code> has to be
     *         provided.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * The unique ID assigned to a version of the schema. Either this or the <code>SchemaId</code> has to be provided.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique ID assigned to a version of the schema. Either this or the <code>SchemaId</code> has to be
     *        provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaReference withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param schemaVersionNumber
     *        The version number of the schema.
     */

    public void setSchemaVersionNumber(Long schemaVersionNumber) {
        this.schemaVersionNumber = schemaVersionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @return The version number of the schema.
     */

    public Long getSchemaVersionNumber() {
        return this.schemaVersionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param schemaVersionNumber
     *        The version number of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaReference withSchemaVersionNumber(Long schemaVersionNumber) {
        setSchemaVersionNumber(schemaVersionNumber);
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
        if (getSchemaId() != null)
            sb.append("SchemaId: ").append(getSchemaId()).append(",");
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
        if (getSchemaVersionNumber() != null)
            sb.append("SchemaVersionNumber: ").append(getSchemaVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaReference == false)
            return false;
        SchemaReference other = (SchemaReference) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getSchemaVersionNumber() == null ^ this.getSchemaVersionNumber() == null)
            return false;
        if (other.getSchemaVersionNumber() != null && other.getSchemaVersionNumber().equals(this.getSchemaVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionNumber() == null) ? 0 : getSchemaVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public SchemaReference clone() {
        try {
            return (SchemaReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SchemaReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
