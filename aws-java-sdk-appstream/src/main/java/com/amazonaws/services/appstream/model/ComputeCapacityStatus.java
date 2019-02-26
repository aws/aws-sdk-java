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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the capacity status for a fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ComputeCapacityStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeCapacityStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The desired number of streaming instances.
     * </p>
     */
    private Integer desired;
    /**
     * <p>
     * The total number of simultaneous streaming instances that are running.
     * </p>
     */
    private Integer running;
    /**
     * <p>
     * The number of instances in use for streaming.
     * </p>
     */
    private Integer inUse;
    /**
     * <p>
     * The number of currently available instances that can be used to stream sessions.
     * </p>
     */
    private Integer available;

    /**
     * <p>
     * The desired number of streaming instances.
     * </p>
     * 
     * @param desired
     *        The desired number of streaming instances.
     */

    public void setDesired(Integer desired) {
        this.desired = desired;
    }

    /**
     * <p>
     * The desired number of streaming instances.
     * </p>
     * 
     * @return The desired number of streaming instances.
     */

    public Integer getDesired() {
        return this.desired;
    }

    /**
     * <p>
     * The desired number of streaming instances.
     * </p>
     * 
     * @param desired
     *        The desired number of streaming instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeCapacityStatus withDesired(Integer desired) {
        setDesired(desired);
        return this;
    }

    /**
     * <p>
     * The total number of simultaneous streaming instances that are running.
     * </p>
     * 
     * @param running
     *        The total number of simultaneous streaming instances that are running.
     */

    public void setRunning(Integer running) {
        this.running = running;
    }

    /**
     * <p>
     * The total number of simultaneous streaming instances that are running.
     * </p>
     * 
     * @return The total number of simultaneous streaming instances that are running.
     */

    public Integer getRunning() {
        return this.running;
    }

    /**
     * <p>
     * The total number of simultaneous streaming instances that are running.
     * </p>
     * 
     * @param running
     *        The total number of simultaneous streaming instances that are running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeCapacityStatus withRunning(Integer running) {
        setRunning(running);
        return this;
    }

    /**
     * <p>
     * The number of instances in use for streaming.
     * </p>
     * 
     * @param inUse
     *        The number of instances in use for streaming.
     */

    public void setInUse(Integer inUse) {
        this.inUse = inUse;
    }

    /**
     * <p>
     * The number of instances in use for streaming.
     * </p>
     * 
     * @return The number of instances in use for streaming.
     */

    public Integer getInUse() {
        return this.inUse;
    }

    /**
     * <p>
     * The number of instances in use for streaming.
     * </p>
     * 
     * @param inUse
     *        The number of instances in use for streaming.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeCapacityStatus withInUse(Integer inUse) {
        setInUse(inUse);
        return this;
    }

    /**
     * <p>
     * The number of currently available instances that can be used to stream sessions.
     * </p>
     * 
     * @param available
     *        The number of currently available instances that can be used to stream sessions.
     */

    public void setAvailable(Integer available) {
        this.available = available;
    }

    /**
     * <p>
     * The number of currently available instances that can be used to stream sessions.
     * </p>
     * 
     * @return The number of currently available instances that can be used to stream sessions.
     */

    public Integer getAvailable() {
        return this.available;
    }

    /**
     * <p>
     * The number of currently available instances that can be used to stream sessions.
     * </p>
     * 
     * @param available
     *        The number of currently available instances that can be used to stream sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeCapacityStatus withAvailable(Integer available) {
        setAvailable(available);
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
        if (getDesired() != null)
            sb.append("Desired: ").append(getDesired()).append(",");
        if (getRunning() != null)
            sb.append("Running: ").append(getRunning()).append(",");
        if (getInUse() != null)
            sb.append("InUse: ").append(getInUse()).append(",");
        if (getAvailable() != null)
            sb.append("Available: ").append(getAvailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeCapacityStatus == false)
            return false;
        ComputeCapacityStatus other = (ComputeCapacityStatus) obj;
        if (other.getDesired() == null ^ this.getDesired() == null)
            return false;
        if (other.getDesired() != null && other.getDesired().equals(this.getDesired()) == false)
            return false;
        if (other.getRunning() == null ^ this.getRunning() == null)
            return false;
        if (other.getRunning() != null && other.getRunning().equals(this.getRunning()) == false)
            return false;
        if (other.getInUse() == null ^ this.getInUse() == null)
            return false;
        if (other.getInUse() != null && other.getInUse().equals(this.getInUse()) == false)
            return false;
        if (other.getAvailable() == null ^ this.getAvailable() == null)
            return false;
        if (other.getAvailable() != null && other.getAvailable().equals(this.getAvailable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesired() == null) ? 0 : getDesired().hashCode());
        hashCode = prime * hashCode + ((getRunning() == null) ? 0 : getRunning().hashCode());
        hashCode = prime * hashCode + ((getInUse() == null) ? 0 : getInUse().hashCode());
        hashCode = prime * hashCode + ((getAvailable() == null) ? 0 : getAvailable().hashCode());
        return hashCode;
    }

    @Override
    public ComputeCapacityStatus clone() {
        try {
            return (ComputeCapacityStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ComputeCapacityStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
