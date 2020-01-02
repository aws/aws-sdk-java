/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/PutCodeBinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutCodeBindingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time and date that the code binding was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time that code bindings were modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * The version number of the schema.
     * </p>
     */
    private String schemaVersion;
    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The time and date that the code binding was created.
     * </p>
     * 
     * @param creationDate
     *        The time and date that the code binding was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The time and date that the code binding was created.
     * </p>
     * 
     * @return The time and date that the code binding was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The time and date that the code binding was created.
     * </p>
     * 
     * @param creationDate
     *        The time and date that the code binding was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCodeBindingResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time that code bindings were modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time that code bindings were modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that code bindings were modified.
     * </p>
     * 
     * @return The date and time that code bindings were modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time that code bindings were modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time that code bindings were modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCodeBindingResult withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param schemaVersion
     *        The version number of the schema.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @return The version number of the schema.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param schemaVersion
     *        The version number of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutCodeBindingResult withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * 
     * @param status
     *        The current status of code binding generation.
     * @see CodeGenerationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * 
     * @return The current status of code binding generation.
     * @see CodeGenerationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * 
     * @param status
     *        The current status of code binding generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodeGenerationStatus
     */

    public PutCodeBindingResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of code binding generation.
     * </p>
     * 
     * @param status
     *        The current status of code binding generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodeGenerationStatus
     */

    public PutCodeBindingResult withStatus(CodeGenerationStatus status) {
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
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

        if (obj instanceof PutCodeBindingResult == false)
            return false;
        PutCodeBindingResult other = (PutCodeBindingResult) obj;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
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

        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public PutCodeBindingResult clone() {
        try {
            return (PutCodeBindingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
