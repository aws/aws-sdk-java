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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RegisterSchemaVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterSchemaVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID that represents the version of this schema.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * The version of this schema (for sync flow only, in case this is the first version).
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The status of the schema version.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique ID that represents the version of this schema.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique ID that represents the version of this schema.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * The unique ID that represents the version of this schema.
     * </p>
     * 
     * @return The unique ID that represents the version of this schema.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * The unique ID that represents the version of this schema.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique ID that represents the version of this schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterSchemaVersionResult withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * The version of this schema (for sync flow only, in case this is the first version).
     * </p>
     * 
     * @param versionNumber
     *        The version of this schema (for sync flow only, in case this is the first version).
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version of this schema (for sync flow only, in case this is the first version).
     * </p>
     * 
     * @return The version of this schema (for sync flow only, in case this is the first version).
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version of this schema (for sync flow only, in case this is the first version).
     * </p>
     * 
     * @param versionNumber
     *        The version of this schema (for sync flow only, in case this is the first version).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterSchemaVersionResult withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
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

    public RegisterSchemaVersionResult withStatus(String status) {
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

    public RegisterSchemaVersionResult withStatus(SchemaVersionStatus status) {
        this.status = status.toString();
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
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterSchemaVersionResult == false)
            return false;
        RegisterSchemaVersionResult other = (RegisterSchemaVersionResult) obj;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public RegisterSchemaVersionResult clone() {
        try {
            return (RegisterSchemaVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
