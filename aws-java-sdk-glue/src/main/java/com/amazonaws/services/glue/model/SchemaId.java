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
 * The unique ID of the schema in the Glue schema registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SchemaId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be provided.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The name of the schema registry that contains the schema.
     * </p>
     */
    private String registryName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has
     *        to be provided.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code>
     *         has to be provided.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has
     *        to be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaId withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be provided.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be provided.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be provided.
     * </p>
     * 
     * @return The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be provided.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be provided.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaId withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The name of the schema registry that contains the schema.
     * </p>
     * 
     * @param registryName
     *        The name of the schema registry that contains the schema.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * The name of the schema registry that contains the schema.
     * </p>
     * 
     * @return The name of the schema registry that contains the schema.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * The name of the schema registry that contains the schema.
     * </p>
     * 
     * @param registryName
     *        The name of the schema registry that contains the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaId withRegistryName(String registryName) {
        setRegistryName(registryName);
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaId == false)
            return false;
        SchemaId other = (SchemaId) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        return hashCode;
    }

    @Override
    public SchemaId clone() {
        try {
            return (SchemaId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SchemaIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
