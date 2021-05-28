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
 * Contains the tracker resource details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteDevicePositionHistoryError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteDevicePositionHistoryError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the device for this position.
     * </p>
     */
    private String deviceId;

    private BatchItemError error;

    /**
     * <p>
     * The ID of the device for this position.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device for this position.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the device for this position.
     * </p>
     * 
     * @return The ID of the device for this position.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the device for this position.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device for this position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDevicePositionHistoryError withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * @param error
     */

    public void setError(BatchItemError error) {
        this.error = error;
    }

    /**
     * @return
     */

    public BatchItemError getError() {
        return this.error;
    }

    /**
     * @param error
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDevicePositionHistoryError withError(BatchItemError error) {
        setError(error);
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
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteDevicePositionHistoryError == false)
            return false;
        BatchDeleteDevicePositionHistoryError other = (BatchDeleteDevicePositionHistoryError) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteDevicePositionHistoryError clone() {
        try {
            return (BatchDeleteDevicePositionHistoryError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.BatchDeleteDevicePositionHistoryErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
