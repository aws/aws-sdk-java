/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/GetSchemaCreationStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaCreationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state, you
     * can add data.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Detailed information about the status of the schema creation operation.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state, you
     * can add data.
     * </p>
     * 
     * @param status
     *        The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state,
     *        you can add data.
     * @see SchemaStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state, you
     * can add data.
     * </p>
     * 
     * @return The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE
     *         state, you can add data.
     * @see SchemaStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state, you
     * can add data.
     * </p>
     * 
     * @param status
     *        The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state,
     *        you can add data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public GetSchemaCreationStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state, you
     * can add data.
     * </p>
     * 
     * @param status
     *        The current state of the schema (PROCESSING, ACTIVE, or DELETING). Once the schema is in the ACTIVE state,
     *        you can add data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public GetSchemaCreationStatusResult withStatus(SchemaStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Detailed information about the status of the schema creation operation.
     * </p>
     * 
     * @param details
     *        Detailed information about the status of the schema creation operation.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * Detailed information about the status of the schema creation operation.
     * </p>
     * 
     * @return Detailed information about the status of the schema creation operation.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Detailed information about the status of the schema creation operation.
     * </p>
     * 
     * @param details
     *        Detailed information about the status of the schema creation operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaCreationStatusResult withDetails(String details) {
        setDetails(details);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSchemaCreationStatusResult == false)
            return false;
        GetSchemaCreationStatusResult other = (GetSchemaCreationStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaCreationStatusResult clone() {
        try {
            return (GetSchemaCreationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
