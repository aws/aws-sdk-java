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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchGetDevicePosition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDevicePositionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains device position details such as the device ID, position, and timestamps for when the position was
     * received and sampled.
     * </p>
     */
    private java.util.List<DevicePosition> devicePositions;
    /**
     * <p>
     * Contains error details for each device that failed to send its position to the tracker resource.
     * </p>
     */
    private java.util.List<BatchGetDevicePositionError> errors;

    /**
     * <p>
     * Contains device position details such as the device ID, position, and timestamps for when the position was
     * received and sampled.
     * </p>
     * 
     * @return Contains device position details such as the device ID, position, and timestamps for when the position
     *         was received and sampled.
     */

    public java.util.List<DevicePosition> getDevicePositions() {
        return devicePositions;
    }

    /**
     * <p>
     * Contains device position details such as the device ID, position, and timestamps for when the position was
     * received and sampled.
     * </p>
     * 
     * @param devicePositions
     *        Contains device position details such as the device ID, position, and timestamps for when the position was
     *        received and sampled.
     */

    public void setDevicePositions(java.util.Collection<DevicePosition> devicePositions) {
        if (devicePositions == null) {
            this.devicePositions = null;
            return;
        }

        this.devicePositions = new java.util.ArrayList<DevicePosition>(devicePositions);
    }

    /**
     * <p>
     * Contains device position details such as the device ID, position, and timestamps for when the position was
     * received and sampled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevicePositions(java.util.Collection)} or {@link #withDevicePositions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param devicePositions
     *        Contains device position details such as the device ID, position, and timestamps for when the position was
     *        received and sampled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionResult withDevicePositions(DevicePosition... devicePositions) {
        if (this.devicePositions == null) {
            setDevicePositions(new java.util.ArrayList<DevicePosition>(devicePositions.length));
        }
        for (DevicePosition ele : devicePositions) {
            this.devicePositions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains device position details such as the device ID, position, and timestamps for when the position was
     * received and sampled.
     * </p>
     * 
     * @param devicePositions
     *        Contains device position details such as the device ID, position, and timestamps for when the position was
     *        received and sampled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionResult withDevicePositions(java.util.Collection<DevicePosition> devicePositions) {
        setDevicePositions(devicePositions);
        return this;
    }

    /**
     * <p>
     * Contains error details for each device that failed to send its position to the tracker resource.
     * </p>
     * 
     * @return Contains error details for each device that failed to send its position to the tracker resource.
     */

    public java.util.List<BatchGetDevicePositionError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Contains error details for each device that failed to send its position to the tracker resource.
     * </p>
     * 
     * @param errors
     *        Contains error details for each device that failed to send its position to the tracker resource.
     */

    public void setErrors(java.util.Collection<BatchGetDevicePositionError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetDevicePositionError>(errors);
    }

    /**
     * <p>
     * Contains error details for each device that failed to send its position to the tracker resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Contains error details for each device that failed to send its position to the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionResult withErrors(BatchGetDevicePositionError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetDevicePositionError>(errors.length));
        }
        for (BatchGetDevicePositionError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains error details for each device that failed to send its position to the tracker resource.
     * </p>
     * 
     * @param errors
     *        Contains error details for each device that failed to send its position to the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionResult withErrors(java.util.Collection<BatchGetDevicePositionError> errors) {
        setErrors(errors);
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
        if (getDevicePositions() != null)
            sb.append("DevicePositions: ").append(getDevicePositions()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDevicePositionResult == false)
            return false;
        BatchGetDevicePositionResult other = (BatchGetDevicePositionResult) obj;
        if (other.getDevicePositions() == null ^ this.getDevicePositions() == null)
            return false;
        if (other.getDevicePositions() != null && other.getDevicePositions().equals(this.getDevicePositions()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDevicePositions() == null) ? 0 : getDevicePositions().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDevicePositionResult clone() {
        try {
            return (BatchGetDevicePositionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
