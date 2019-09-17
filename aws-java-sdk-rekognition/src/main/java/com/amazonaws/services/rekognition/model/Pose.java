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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates the pose of the face as determined by its pitch, roll, and yaw.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Pose implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Value representing the face rotation on the roll axis.
     * </p>
     */
    private Float roll;
    /**
     * <p>
     * Value representing the face rotation on the yaw axis.
     * </p>
     */
    private Float yaw;
    /**
     * <p>
     * Value representing the face rotation on the pitch axis.
     * </p>
     */
    private Float pitch;

    /**
     * <p>
     * Value representing the face rotation on the roll axis.
     * </p>
     * 
     * @param roll
     *        Value representing the face rotation on the roll axis.
     */

    public void setRoll(Float roll) {
        this.roll = roll;
    }

    /**
     * <p>
     * Value representing the face rotation on the roll axis.
     * </p>
     * 
     * @return Value representing the face rotation on the roll axis.
     */

    public Float getRoll() {
        return this.roll;
    }

    /**
     * <p>
     * Value representing the face rotation on the roll axis.
     * </p>
     * 
     * @param roll
     *        Value representing the face rotation on the roll axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pose withRoll(Float roll) {
        setRoll(roll);
        return this;
    }

    /**
     * <p>
     * Value representing the face rotation on the yaw axis.
     * </p>
     * 
     * @param yaw
     *        Value representing the face rotation on the yaw axis.
     */

    public void setYaw(Float yaw) {
        this.yaw = yaw;
    }

    /**
     * <p>
     * Value representing the face rotation on the yaw axis.
     * </p>
     * 
     * @return Value representing the face rotation on the yaw axis.
     */

    public Float getYaw() {
        return this.yaw;
    }

    /**
     * <p>
     * Value representing the face rotation on the yaw axis.
     * </p>
     * 
     * @param yaw
     *        Value representing the face rotation on the yaw axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pose withYaw(Float yaw) {
        setYaw(yaw);
        return this;
    }

    /**
     * <p>
     * Value representing the face rotation on the pitch axis.
     * </p>
     * 
     * @param pitch
     *        Value representing the face rotation on the pitch axis.
     */

    public void setPitch(Float pitch) {
        this.pitch = pitch;
    }

    /**
     * <p>
     * Value representing the face rotation on the pitch axis.
     * </p>
     * 
     * @return Value representing the face rotation on the pitch axis.
     */

    public Float getPitch() {
        return this.pitch;
    }

    /**
     * <p>
     * Value representing the face rotation on the pitch axis.
     * </p>
     * 
     * @param pitch
     *        Value representing the face rotation on the pitch axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pose withPitch(Float pitch) {
        setPitch(pitch);
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
        if (getRoll() != null)
            sb.append("Roll: ").append(getRoll()).append(",");
        if (getYaw() != null)
            sb.append("Yaw: ").append(getYaw()).append(",");
        if (getPitch() != null)
            sb.append("Pitch: ").append(getPitch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Pose == false)
            return false;
        Pose other = (Pose) obj;
        if (other.getRoll() == null ^ this.getRoll() == null)
            return false;
        if (other.getRoll() != null && other.getRoll().equals(this.getRoll()) == false)
            return false;
        if (other.getYaw() == null ^ this.getYaw() == null)
            return false;
        if (other.getYaw() != null && other.getYaw().equals(this.getYaw()) == false)
            return false;
        if (other.getPitch() == null ^ this.getPitch() == null)
            return false;
        if (other.getPitch() != null && other.getPitch().equals(this.getPitch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoll() == null) ? 0 : getRoll().hashCode());
        hashCode = prime * hashCode + ((getYaw() == null) ? 0 : getYaw().hashCode());
        hashCode = prime * hashCode + ((getPitch() == null) ? 0 : getPitch().hashCode());
        return hashCode;
    }

    @Override
    public Pose clone() {
        try {
            return (Pose) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.PoseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
