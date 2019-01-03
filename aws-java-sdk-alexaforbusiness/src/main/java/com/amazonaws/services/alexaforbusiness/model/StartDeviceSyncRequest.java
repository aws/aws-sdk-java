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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartDeviceSync" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeviceSyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the room with which the device to sync is associated. Required.
     * </p>
     */
    private String roomArn;
    /**
     * <p>
     * The ARN of the device to sync. Required.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     */
    private java.util.List<String> features;

    /**
     * <p>
     * The ARN of the room with which the device to sync is associated. Required.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room with which the device to sync is associated. Required.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The ARN of the room with which the device to sync is associated. Required.
     * </p>
     * 
     * @return The ARN of the room with which the device to sync is associated. Required.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The ARN of the room with which the device to sync is associated. Required.
     * </p>
     * 
     * @param roomArn
     *        The ARN of the room with which the device to sync is associated. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceSyncRequest withRoomArn(String roomArn) {
        setRoomArn(roomArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the device to sync. Required.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device to sync. Required.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of the device to sync. Required.
     * </p>
     * 
     * @return The ARN of the device to sync. Required.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The ARN of the device to sync. Required.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device to sync. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeviceSyncRequest withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     * 
     * @return Request structure to start the device sync. Required.
     * @see Feature
     */

    public java.util.List<String> getFeatures() {
        return features;
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     * 
     * @param features
     *        Request structure to start the device sync. Required.
     * @see Feature
     */

    public void setFeatures(java.util.Collection<String> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<String>(features);
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatures(java.util.Collection)} or {@link #withFeatures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param features
     *        Request structure to start the device sync. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Feature
     */

    public StartDeviceSyncRequest withFeatures(String... features) {
        if (this.features == null) {
            setFeatures(new java.util.ArrayList<String>(features.length));
        }
        for (String ele : features) {
            this.features.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     * 
     * @param features
     *        Request structure to start the device sync. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Feature
     */

    public StartDeviceSyncRequest withFeatures(java.util.Collection<String> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * Request structure to start the device sync. Required.
     * </p>
     * 
     * @param features
     *        Request structure to start the device sync. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Feature
     */

    public StartDeviceSyncRequest withFeatures(Feature... features) {
        java.util.ArrayList<String> featuresCopy = new java.util.ArrayList<String>(features.length);
        for (Feature value : features) {
            featuresCopy.add(value.toString());
        }
        if (getFeatures() == null) {
            setFeatures(featuresCopy);
        } else {
            getFeatures().addAll(featuresCopy);
        }
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
        if (getRoomArn() != null)
            sb.append("RoomArn: ").append(getRoomArn()).append(",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDeviceSyncRequest == false)
            return false;
        StartDeviceSyncRequest other = (StartDeviceSyncRequest) obj;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        return hashCode;
    }

    @Override
    public StartDeviceSyncRequest clone() {
        return (StartDeviceSyncRequest) super.clone();
    }

}
