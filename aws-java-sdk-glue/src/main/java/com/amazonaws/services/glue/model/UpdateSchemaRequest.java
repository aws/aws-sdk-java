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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     * <code>SchemaName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * </li>
     * </ul>
     */
    private SchemaId schemaId;
    /**
     * <p>
     * Version number required for check pointing. One of <code>VersionNumber</code> or <code>Compatibility</code> has
     * to be provided.
     * </p>
     */
    private SchemaVersionNumber schemaVersionNumber;
    /**
     * <p>
     * The new compatibility setting for the schema.
     * </p>
     */
    private String compatibility;
    /**
     * <p>
     * The new description for the schema.
     * </p>
     */
    private String description;

    /**
     * <p>
     * This is a wrapper structure to contain schema identity fields. The structure contains:
     * </p>
     * <ul>
     * <li>
     * <p>
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     * <code>SchemaName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaId
     *        This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     *        <code>SchemaName</code> has to be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has
     *        to be provided.
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
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     * <code>SchemaName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     *         <code>SchemaName</code> has to be provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has
     *         to be provided.
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
     * SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     * <code>SchemaName</code> has to be provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has to be
     * provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param schemaId
     *        This is a wrapper structure to contain schema identity fields. The structure contains:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of <code>SchemaArn</code> or
     *        <code>SchemaName</code> has to be provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SchemaId$SchemaName: The name of the schema. One of <code>SchemaArn</code> or <code>SchemaName</code> has
     *        to be provided.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaRequest withSchemaId(SchemaId schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * Version number required for check pointing. One of <code>VersionNumber</code> or <code>Compatibility</code> has
     * to be provided.
     * </p>
     * 
     * @param schemaVersionNumber
     *        Version number required for check pointing. One of <code>VersionNumber</code> or
     *        <code>Compatibility</code> has to be provided.
     */

    public void setSchemaVersionNumber(SchemaVersionNumber schemaVersionNumber) {
        this.schemaVersionNumber = schemaVersionNumber;
    }

    /**
     * <p>
     * Version number required for check pointing. One of <code>VersionNumber</code> or <code>Compatibility</code> has
     * to be provided.
     * </p>
     * 
     * @return Version number required for check pointing. One of <code>VersionNumber</code> or
     *         <code>Compatibility</code> has to be provided.
     */

    public SchemaVersionNumber getSchemaVersionNumber() {
        return this.schemaVersionNumber;
    }

    /**
     * <p>
     * Version number required for check pointing. One of <code>VersionNumber</code> or <code>Compatibility</code> has
     * to be provided.
     * </p>
     * 
     * @param schemaVersionNumber
     *        Version number required for check pointing. One of <code>VersionNumber</code> or
     *        <code>Compatibility</code> has to be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaRequest withSchemaVersionNumber(SchemaVersionNumber schemaVersionNumber) {
        setSchemaVersionNumber(schemaVersionNumber);
        return this;
    }

    /**
     * <p>
     * The new compatibility setting for the schema.
     * </p>
     * 
     * @param compatibility
     *        The new compatibility setting for the schema.
     * @see Compatibility
     */

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    /**
     * <p>
     * The new compatibility setting for the schema.
     * </p>
     * 
     * @return The new compatibility setting for the schema.
     * @see Compatibility
     */

    public String getCompatibility() {
        return this.compatibility;
    }

    /**
     * <p>
     * The new compatibility setting for the schema.
     * </p>
     * 
     * @param compatibility
     *        The new compatibility setting for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public UpdateSchemaRequest withCompatibility(String compatibility) {
        setCompatibility(compatibility);
        return this;
    }

    /**
     * <p>
     * The new compatibility setting for the schema.
     * </p>
     * 
     * @param compatibility
     *        The new compatibility setting for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compatibility
     */

    public UpdateSchemaRequest withCompatibility(Compatibility compatibility) {
        this.compatibility = compatibility.toString();
        return this;
    }

    /**
     * <p>
     * The new description for the schema.
     * </p>
     * 
     * @param description
     *        The new description for the schema.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description for the schema.
     * </p>
     * 
     * @return The new description for the schema.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description for the schema.
     * </p>
     * 
     * @param description
     *        The new description for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaRequest withDescription(String description) {
        setDescription(description);
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
        if (getSchemaVersionNumber() != null)
            sb.append("SchemaVersionNumber: ").append(getSchemaVersionNumber()).append(",");
        if (getCompatibility() != null)
            sb.append("Compatibility: ").append(getCompatibility()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSchemaRequest == false)
            return false;
        UpdateSchemaRequest other = (UpdateSchemaRequest) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getSchemaVersionNumber() == null ^ this.getSchemaVersionNumber() == null)
            return false;
        if (other.getSchemaVersionNumber() != null && other.getSchemaVersionNumber().equals(this.getSchemaVersionNumber()) == false)
            return false;
        if (other.getCompatibility() == null ^ this.getCompatibility() == null)
            return false;
        if (other.getCompatibility() != null && other.getCompatibility().equals(this.getCompatibility()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionNumber() == null) ? 0 : getSchemaVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getCompatibility() == null) ? 0 : getCompatibility().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSchemaRequest clone() {
        return (UpdateSchemaRequest) super.clone();
    }

}
