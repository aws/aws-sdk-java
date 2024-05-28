/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/CreateDatastore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatastoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The data store status.
     * </p>
     */
    private String datastoreStatus;

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatastoreResult withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @see DatastoreStatus
     */

    public void setDatastoreStatus(String datastoreStatus) {
        this.datastoreStatus = datastoreStatus;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @return The data store status.
     * @see DatastoreStatus
     */

    public String getDatastoreStatus() {
        return this.datastoreStatus;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public CreateDatastoreResult withDatastoreStatus(String datastoreStatus) {
        setDatastoreStatus(datastoreStatus);
        return this;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public CreateDatastoreResult withDatastoreStatus(DatastoreStatus datastoreStatus) {
        this.datastoreStatus = datastoreStatus.toString();
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getDatastoreStatus() != null)
            sb.append("DatastoreStatus: ").append(getDatastoreStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatastoreResult == false)
            return false;
        CreateDatastoreResult other = (CreateDatastoreResult) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getDatastoreStatus() == null ^ this.getDatastoreStatus() == null)
            return false;
        if (other.getDatastoreStatus() != null && other.getDatastoreStatus().equals(this.getDatastoreStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getDatastoreStatus() == null) ? 0 : getDatastoreStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatastoreResult clone() {
        try {
            return (CreateDatastoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
