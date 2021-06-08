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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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

    public GetSchemaRequest withSchemaId(SchemaId schemaId) {
        setSchemaId(schemaId);
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
            sb.append("SchemaId: ").append(getSchemaId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSchemaRequest == false)
            return false;
        GetSchemaRequest other = (GetSchemaRequest) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaRequest clone() {
        return (GetSchemaRequest) super.clone();
    }

}
