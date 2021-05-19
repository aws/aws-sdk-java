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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Reports the progress of an instance refresh on an Auto Scaling group that has a warm pool. This includes separate
 * details for instances in the warm pool and instances in the Auto Scaling group (the live pool).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstanceRefreshProgressDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRefreshProgressDetails implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the progress of an instance refresh on instances that are in the Auto Scaling group.
     * </p>
     */
    private InstanceRefreshLivePoolProgress livePoolProgress;
    /**
     * <p>
     * Indicates the progress of an instance refresh on instances that are in the warm pool.
     * </p>
     */
    private InstanceRefreshWarmPoolProgress warmPoolProgress;

    /**
     * <p>
     * Indicates the progress of an instance refresh on instances that are in the Auto Scaling group.
     * </p>
     * 
     * @param livePoolProgress
     *        Indicates the progress of an instance refresh on instances that are in the Auto Scaling group.
     */

    public void setLivePoolProgress(InstanceRefreshLivePoolProgress livePoolProgress) {
        this.livePoolProgress = livePoolProgress;
    }

    /**
     * <p>
     * Indicates the progress of an instance refresh on instances that are in the Auto Scaling group.
     * </p>
     * 
     * @return Indicates the progress of an instance refresh on instances that are in the Auto Scaling group.
     */

    public InstanceRefreshLivePoolProgress getLivePoolProgress() {
        return this.livePoolProgress;
    }

    /**
     * <p>
     * Indicates the progress of an instance refresh on instances that are in the Auto Scaling group.
     * </p>
     * 
     * @param livePoolProgress
     *        Indicates the progress of an instance refresh on instances that are in the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefreshProgressDetails withLivePoolProgress(InstanceRefreshLivePoolProgress livePoolProgress) {
        setLivePoolProgress(livePoolProgress);
        return this;
    }

    /**
     * <p>
     * Indicates the progress of an instance refresh on instances that are in the warm pool.
     * </p>
     * 
     * @param warmPoolProgress
     *        Indicates the progress of an instance refresh on instances that are in the warm pool.
     */

    public void setWarmPoolProgress(InstanceRefreshWarmPoolProgress warmPoolProgress) {
        this.warmPoolProgress = warmPoolProgress;
    }

    /**
     * <p>
     * Indicates the progress of an instance refresh on instances that are in the warm pool.
     * </p>
     * 
     * @return Indicates the progress of an instance refresh on instances that are in the warm pool.
     */

    public InstanceRefreshWarmPoolProgress getWarmPoolProgress() {
        return this.warmPoolProgress;
    }

    /**
     * <p>
     * Indicates the progress of an instance refresh on instances that are in the warm pool.
     * </p>
     * 
     * @param warmPoolProgress
     *        Indicates the progress of an instance refresh on instances that are in the warm pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRefreshProgressDetails withWarmPoolProgress(InstanceRefreshWarmPoolProgress warmPoolProgress) {
        setWarmPoolProgress(warmPoolProgress);
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
        if (getLivePoolProgress() != null)
            sb.append("LivePoolProgress: ").append(getLivePoolProgress()).append(",");
        if (getWarmPoolProgress() != null)
            sb.append("WarmPoolProgress: ").append(getWarmPoolProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRefreshProgressDetails == false)
            return false;
        InstanceRefreshProgressDetails other = (InstanceRefreshProgressDetails) obj;
        if (other.getLivePoolProgress() == null ^ this.getLivePoolProgress() == null)
            return false;
        if (other.getLivePoolProgress() != null && other.getLivePoolProgress().equals(this.getLivePoolProgress()) == false)
            return false;
        if (other.getWarmPoolProgress() == null ^ this.getWarmPoolProgress() == null)
            return false;
        if (other.getWarmPoolProgress() != null && other.getWarmPoolProgress().equals(this.getWarmPoolProgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLivePoolProgress() == null) ? 0 : getLivePoolProgress().hashCode());
        hashCode = prime * hashCode + ((getWarmPoolProgress() == null) ? 0 : getWarmPoolProgress().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRefreshProgressDetails clone() {
        try {
            return (InstanceRefreshProgressDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
