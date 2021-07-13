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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetMigration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMigrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the migration to view. The <code>migrationID</code> is returned by the operation.
     * </p>
     */
    private String migrationId;

    /**
     * <p>
     * The unique identifier of the migration to view. The <code>migrationID</code> is returned by the operation.
     * </p>
     * 
     * @param migrationId
     *        The unique identifier of the migration to view. The <code>migrationID</code> is returned by the operation.
     */

    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    /**
     * <p>
     * The unique identifier of the migration to view. The <code>migrationID</code> is returned by the operation.
     * </p>
     * 
     * @return The unique identifier of the migration to view. The <code>migrationID</code> is returned by the
     *         operation.
     */

    public String getMigrationId() {
        return this.migrationId;
    }

    /**
     * <p>
     * The unique identifier of the migration to view. The <code>migrationID</code> is returned by the operation.
     * </p>
     * 
     * @param migrationId
     *        The unique identifier of the migration to view. The <code>migrationID</code> is returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMigrationRequest withMigrationId(String migrationId) {
        setMigrationId(migrationId);
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
        if (getMigrationId() != null)
            sb.append("MigrationId: ").append(getMigrationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMigrationRequest == false)
            return false;
        GetMigrationRequest other = (GetMigrationRequest) obj;
        if (other.getMigrationId() == null ^ this.getMigrationId() == null)
            return false;
        if (other.getMigrationId() != null && other.getMigrationId().equals(this.getMigrationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMigrationId() == null) ? 0 : getMigrationId().hashCode());
        return hashCode;
    }

    @Override
    public GetMigrationRequest clone() {
        return (GetMigrationRequest) super.clone();
    }

}
