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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteSchemaVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSchemaVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * </p>
     */
    private SchemaId schemaId;
    /**
     * <p>
     * A version range may be supplied which may be of the format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * a single version number, 5
     * </p>
     * </li>
     * <li>
     * <p>
     * a range, 5-8 : deletes versions 5, 6, 7, 8
     * </p>
     * </li>
     * </ul>
     */
    private String versions;

    /**
     * <p>
     * This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param schemaId
     *        This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     */

    public void setSchemaId(SchemaId schemaId) {
        this.schemaId = schemaId;
    }

    /**
     * <p>
     * This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @return This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     */

    public SchemaId getSchemaId() {
        return this.schemaId;
    }

    /**
     * <p>
     * This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param schemaId
     *        This is a wrapper structure that may contain the schema name and Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSchemaVersionsRequest withSchemaId(SchemaId schemaId) {
        setSchemaId(schemaId);
        return this;
    }

    /**
     * <p>
     * A version range may be supplied which may be of the format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * a single version number, 5
     * </p>
     * </li>
     * <li>
     * <p>
     * a range, 5-8 : deletes versions 5, 6, 7, 8
     * </p>
     * </li>
     * </ul>
     * 
     * @param versions
     *        A version range may be supplied which may be of the format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        a single version number, 5
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        a range, 5-8 : deletes versions 5, 6, 7, 8
     *        </p>
     *        </li>
     */

    public void setVersions(String versions) {
        this.versions = versions;
    }

    /**
     * <p>
     * A version range may be supplied which may be of the format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * a single version number, 5
     * </p>
     * </li>
     * <li>
     * <p>
     * a range, 5-8 : deletes versions 5, 6, 7, 8
     * </p>
     * </li>
     * </ul>
     * 
     * @return A version range may be supplied which may be of the format:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         a single version number, 5
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         a range, 5-8 : deletes versions 5, 6, 7, 8
     *         </p>
     *         </li>
     */

    public String getVersions() {
        return this.versions;
    }

    /**
     * <p>
     * A version range may be supplied which may be of the format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * a single version number, 5
     * </p>
     * </li>
     * <li>
     * <p>
     * a range, 5-8 : deletes versions 5, 6, 7, 8
     * </p>
     * </li>
     * </ul>
     * 
     * @param versions
     *        A version range may be supplied which may be of the format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        a single version number, 5
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        a range, 5-8 : deletes versions 5, 6, 7, 8
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSchemaVersionsRequest withVersions(String versions) {
        setVersions(versions);
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
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSchemaVersionsRequest == false)
            return false;
        DeleteSchemaVersionsRequest other = (DeleteSchemaVersionsRequest) obj;
        if (other.getSchemaId() == null ^ this.getSchemaId() == null)
            return false;
        if (other.getSchemaId() != null && other.getSchemaId().equals(this.getSchemaId()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaId() == null) ? 0 : getSchemaId().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSchemaVersionsRequest clone() {
        return (DeleteSchemaVersionsRequest) super.clone();
    }

}
