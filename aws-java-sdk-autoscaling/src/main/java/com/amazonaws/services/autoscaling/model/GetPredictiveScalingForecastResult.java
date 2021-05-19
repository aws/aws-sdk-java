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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/GetPredictiveScalingForecast"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPredictiveScalingForecastResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The load forecast.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadForecast> loadForecast;
    /**
     * <p>
     * The capacity forecast.
     * </p>
     */
    private CapacityForecast capacityForecast;
    /**
     * <p>
     * The time the forecast was made.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The load forecast.
     * </p>
     * 
     * @return The load forecast.
     */

    public java.util.List<LoadForecast> getLoadForecast() {
        if (loadForecast == null) {
            loadForecast = new com.amazonaws.internal.SdkInternalList<LoadForecast>();
        }
        return loadForecast;
    }

    /**
     * <p>
     * The load forecast.
     * </p>
     * 
     * @param loadForecast
     *        The load forecast.
     */

    public void setLoadForecast(java.util.Collection<LoadForecast> loadForecast) {
        if (loadForecast == null) {
            this.loadForecast = null;
            return;
        }

        this.loadForecast = new com.amazonaws.internal.SdkInternalList<LoadForecast>(loadForecast);
    }

    /**
     * <p>
     * The load forecast.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadForecast(java.util.Collection)} or {@link #withLoadForecast(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param loadForecast
     *        The load forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictiveScalingForecastResult withLoadForecast(LoadForecast... loadForecast) {
        if (this.loadForecast == null) {
            setLoadForecast(new com.amazonaws.internal.SdkInternalList<LoadForecast>(loadForecast.length));
        }
        for (LoadForecast ele : loadForecast) {
            this.loadForecast.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The load forecast.
     * </p>
     * 
     * @param loadForecast
     *        The load forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictiveScalingForecastResult withLoadForecast(java.util.Collection<LoadForecast> loadForecast) {
        setLoadForecast(loadForecast);
        return this;
    }

    /**
     * <p>
     * The capacity forecast.
     * </p>
     * 
     * @param capacityForecast
     *        The capacity forecast.
     */

    public void setCapacityForecast(CapacityForecast capacityForecast) {
        this.capacityForecast = capacityForecast;
    }

    /**
     * <p>
     * The capacity forecast.
     * </p>
     * 
     * @return The capacity forecast.
     */

    public CapacityForecast getCapacityForecast() {
        return this.capacityForecast;
    }

    /**
     * <p>
     * The capacity forecast.
     * </p>
     * 
     * @param capacityForecast
     *        The capacity forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictiveScalingForecastResult withCapacityForecast(CapacityForecast capacityForecast) {
        setCapacityForecast(capacityForecast);
        return this;
    }

    /**
     * <p>
     * The time the forecast was made.
     * </p>
     * 
     * @param updateTime
     *        The time the forecast was made.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the forecast was made.
     * </p>
     * 
     * @return The time the forecast was made.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the forecast was made.
     * </p>
     * 
     * @param updateTime
     *        The time the forecast was made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictiveScalingForecastResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getLoadForecast() != null)
            sb.append("LoadForecast: ").append(getLoadForecast()).append(",");
        if (getCapacityForecast() != null)
            sb.append("CapacityForecast: ").append(getCapacityForecast()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPredictiveScalingForecastResult == false)
            return false;
        GetPredictiveScalingForecastResult other = (GetPredictiveScalingForecastResult) obj;
        if (other.getLoadForecast() == null ^ this.getLoadForecast() == null)
            return false;
        if (other.getLoadForecast() != null && other.getLoadForecast().equals(this.getLoadForecast()) == false)
            return false;
        if (other.getCapacityForecast() == null ^ this.getCapacityForecast() == null)
            return false;
        if (other.getCapacityForecast() != null && other.getCapacityForecast().equals(this.getCapacityForecast()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadForecast() == null) ? 0 : getLoadForecast().hashCode());
        hashCode = prime * hashCode + ((getCapacityForecast() == null) ? 0 : getCapacityForecast().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetPredictiveScalingForecastResult clone() {
        try {
            return (GetPredictiveScalingForecastResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
