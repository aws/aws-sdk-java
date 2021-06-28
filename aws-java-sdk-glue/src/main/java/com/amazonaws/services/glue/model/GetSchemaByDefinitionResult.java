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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetSchemaByDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaByDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The schema ID of the schema version.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     */
    private String dataFormat;
    /**
     * <p>
     * The status of the schema version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time the schema was created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The schema ID of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The schema ID of the schema version.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * The schema ID of the schema version.
     * </p>
     * 
     * @return The schema ID of the schema version.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * The schema ID of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The schema ID of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaByDefinitionResult withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schema.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaByDefinitionResult withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are
     *        supported.
     * @see DataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @return The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are
     *         supported.
     * @see DataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public GetSchemaByDefinitionResult withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are supported.
     * </p>
     * 
     * @param dataFormat
     *        The data format of the schema definition. Currently only <code>AVRO</code> and <code>JSON</code> are
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public GetSchemaByDefinitionResult withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The status of the schema version.
     * </p>
     * 
     * @param status
     *        The status of the schema version.
     * @see SchemaVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the schema version.
     * </p>
     * 
     * @return The status of the schema version.
     * @see SchemaVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the schema version.
     * </p>
     * 
     * @param status
     *        The status of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaVersionStatus
     */

    public GetSchemaByDefinitionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the schema version.
     * </p>
     * 
     * @param status
     *        The status of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaVersionStatus
     */

    public GetSchemaByDefinitionResult withStatus(SchemaVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the schema was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the schema was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the schema was created.
     * </p>
     * 
     * @return The date and time the schema was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the schema was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the schema was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaByDefinitionResult withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
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
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSchemaByDefinitionResult == false)
            return false;
        GetSchemaByDefinitionResult other = (GetSchemaByDefinitionResult) obj;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaByDefinitionResult clone() {
        try {
            return (GetSchemaByDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
