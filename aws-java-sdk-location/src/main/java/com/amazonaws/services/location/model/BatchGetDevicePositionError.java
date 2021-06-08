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
 * Contains error details for each device that didn't return a position.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchGetDevicePositionError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDevicePositionError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the device that didn't return a position.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * Contains details related to the error code.
     * </p>
     */
    private BatchItemError error;

    /**
     * <p>
     * The ID of the device that didn't return a position.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device that didn't return a position.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the device that didn't return a position.
     * </p>
     * 
     * @return The ID of the device that didn't return a position.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the device that didn't return a position.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device that didn't return a position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionError withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * Contains details related to the error code.
     * </p>
     * 
     * @param error
     *        Contains details related to the error code.
     */

    public void setError(BatchItemError error) {
        this.error = error;
    }

    /**
     * <p>
     * Contains details related to the error code.
     * </p>
     * 
     * @return Contains details related to the error code.
     */

    public BatchItemError getError() {
        return this.error;
    }

    /**
     * <p>
     * Contains details related to the error code.
     * </p>
     * 
     * @param error
     *        Contains details related to the error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionError withError(BatchItemError error) {
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

        if (obj instanceof BatchGetDevicePositionError == false)
            return false;
        BatchGetDevicePositionError other = (BatchGetDevicePositionError) obj;
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
    public BatchGetDevicePositionError clone() {
        try {
            return (BatchGetDevicePositionError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.BatchGetDevicePositionErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
