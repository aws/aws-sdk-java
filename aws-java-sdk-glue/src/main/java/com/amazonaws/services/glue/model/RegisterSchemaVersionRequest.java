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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RegisterSchemaVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterSchemaVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either <code>SchemaArn</code> or
     * <code>SchemaName</code> and <code>RegistryName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. Either <code>SchemaArn</code> or <code>SchemaName</code> and
     * <code>RegistryName</code> has to be provided.
     * </p>
     * </li>
     * </ul>
     */
    private SchemaId schemaId;
    /**
     * <p>
     * The schema definition using the <code>DataFormat</code> setting for the <code>SchemaName</code>.
     * </p>
     */
    private String schemaDefinition;

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either <code>SchemaArn</code> or
     * <code>SchemaName</code> and <code>RegistryName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. Either <code>SchemaArn</code> or <code>SchemaName</code> and
     * <code>RegistryName</code> has to be provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaId
     *        This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either <code>SchemaArn</code> or
     *        <code>SchemaName</code> and <code>RegistryName</code> has to be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SchemaId$SchemaName: The name of the schema. Either <code>SchemaArn</code> or <code>SchemaName</code> and
     *        <code>RegistryName</code> has to be provided.
     *        </p>
     *        </li>
     */

    public void setSchemaId(SchemaId schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either <code>SchemaArn</code> or
     * <code>SchemaName</code> and <code>RegistryName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. Either <code>SchemaArn</code> or <code>SchemaName</code> and
     * <code>RegistryName</code> has to be provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either <code>SchemaArn</code> or
     *         <code>SchemaName</code> and <code>RegistryName</code> has to be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SchemaId$SchemaName: The name of the schema. Either <code>SchemaArn</code> or <code>SchemaName</code> and
     *         <code>RegistryName</code> has to be provided.
     *         </p>
     *         </li>
     */

    public SchemaId getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either <code>SchemaArn</code> or
     * <code>SchemaName</code> and <code>RegistryName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. Either <code>SchemaArn</code> or <code>SchemaName</code> and
     * <code>RegistryName</code> has to be provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaId
     *        This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either <code>SchemaArn</code> or
     *        <code>SchemaName</code> and <code>RegistryName</code> has to be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SchemaId$SchemaName: The name of the schema. Either <code>SchemaArn</code> or <code>SchemaName</code> and
     *        <code>RegistryName</code> has to be provided.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterSchemaVersionRequest withSchemaId(SchemaId schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * The schema definition using the <code>DataFormat</code> setting for the <code>SchemaName</code>.
     * </p>
     * 
     * @param schemaDefinition
     *        The schema definition using the <code>DataFormat</code> setting for the <code>SchemaName</code>.
     */

    public void setSchemaDefinition(String schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    /**
     * <p>
     * The schema definition using the <code>DataFormat</code> setting for the <code>SchemaName</code>.
     * </p>
     * 
     * @return The schema definition using the <code>DataFormat</code> setting for the <code>SchemaName</code>.
     */

    public String getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * <p>
     * The schema definition using the <code>DataFormat</code> setting for the <code>SchemaName</code>.
     * </p>
     * 
     * @param schemaDefinition
     *        The schema definition using the <code>DataFormat</code> setting for the <code>SchemaName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterSchemaVersionRequest withSchemaDefinition(String schemaDefinition) {
        setSchemaDefinition(schemaDefinition);
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
        if (getSchemaDefinition() != null)
            sb.append("SchemaDefinition: ").append(getSchemaDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterSchemaVersionRequest == false)
            return false;
        RegisterSchemaVersionRequest other = (RegisterSchemaVersionRequest) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getSchemaDefinition() == null ^ this.getSchemaDefinition() == null)
            return false;
        if (other.getSchemaDefinition() != null && other.getSchemaDefinition().equals(this.getSchemaDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        return hashCode;
    }

    @Override
    public RegisterSchemaVersionRequest clone() {
        return (RegisterSchemaVersionRequest) super.clone();
    }

}
