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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains error details for each geofence that failed to delete from the geofence collection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteGeofenceError" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteGeofenceError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains details associated to the batch error.
     * </p>
     */
    private BatchItemError error;
    /**
     * <p>
     * The geofence associated with the error message.
     * </p>
     */
    private String geofenceId;

    /**
     * <p>
     * Contains details associated to the batch error.
     * </p>
     * 
     * @param error
     *        Contains details associated to the batch error.
     */

    public void setError(BatchItemError error) {
        this.error = error;
    }

    /**
     * <p>
     * Contains details associated to the batch error.
     * </p>
     * 
     * @return Contains details associated to the batch error.
     */

    public BatchItemError getError() {
        return this.error;
    }

    /**
     * <p>
     * Contains details associated to the batch error.
     * </p>
     * 
     * @param error
     *        Contains details associated to the batch error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteGeofenceError withError(BatchItemError error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The geofence associated with the error message.
     * </p>
     * 
     * @param geofenceId
     *        The geofence associated with the error message.
     */

    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    /**
     * <p>
     * The geofence associated with the error message.
     * </p>
     * 
     * @return The geofence associated with the error message.
     */

    public String getGeofenceId() {
        return this.geofenceId;
    }

    /**
     * <p>
     * The geofence associated with the error message.
     * </p>
     * 
     * @param geofenceId
     *        The geofence associated with the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteGeofenceError withGeofenceId(String geofenceId) {
        setGeofenceId(geofenceId);
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
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getGeofenceId() != null)
            sb.append("GeofenceId: ").append(getGeofenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteGeofenceError == false)
            return false;
        BatchDeleteGeofenceError other = (BatchDeleteGeofenceError) obj;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getGeofenceId() == null ^ this.getGeofenceId() == null)
            return false;
        if (other.getGeofenceId() != null && other.getGeofenceId().equals(this.getGeofenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteGeofenceError clone() {
        try {
            return (BatchDeleteGeofenceError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.BatchDeleteGeofenceErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
