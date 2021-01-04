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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the outlier detection for a virtual node's listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/OutlierDetection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutlierDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base amount of time for which a host is ejected.
     * </p>
     */
    private Duration baseEjectionDuration;
    /**
     * <p>
     * The time interval between ejection sweep analysis.
     * </p>
     */
    private Duration interval;
    /**
     * <p>
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least
     * one host regardless of the value.
     * </p>
     */
    private Integer maxEjectionPercent;
    /**
     * <p>
     * Number of consecutive <code>5xx</code> errors required for ejection.
     * </p>
     */
    private Long maxServerErrors;

    /**
     * <p>
     * The base amount of time for which a host is ejected.
     * </p>
     * 
     * @param baseEjectionDuration
     *        The base amount of time for which a host is ejected.
     */

    public void setBaseEjectionDuration(Duration baseEjectionDuration) {
        this.baseEjectionDuration = baseEjectionDuration;
    }

    /**
     * <p>
     * The base amount of time for which a host is ejected.
     * </p>
     * 
     * @return The base amount of time for which a host is ejected.
     */

    public Duration getBaseEjectionDuration() {
        return this.baseEjectionDuration;
    }

    /**
     * <p>
     * The base amount of time for which a host is ejected.
     * </p>
     * 
     * @param baseEjectionDuration
     *        The base amount of time for which a host is ejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutlierDetection withBaseEjectionDuration(Duration baseEjectionDuration) {
        setBaseEjectionDuration(baseEjectionDuration);
        return this;
    }

    /**
     * <p>
     * The time interval between ejection sweep analysis.
     * </p>
     * 
     * @param interval
     *        The time interval between ejection sweep analysis.
     */

    public void setInterval(Duration interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time interval between ejection sweep analysis.
     * </p>
     * 
     * @return The time interval between ejection sweep analysis.
     */

    public Duration getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time interval between ejection sweep analysis.
     * </p>
     * 
     * @param interval
     *        The time interval between ejection sweep analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutlierDetection withInterval(Duration interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least
     * one host regardless of the value.
     * </p>
     * 
     * @param maxEjectionPercent
     *        Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at
     *        least one host regardless of the value.
     */

    public void setMaxEjectionPercent(Integer maxEjectionPercent) {
        this.maxEjectionPercent = maxEjectionPercent;
    }

    /**
     * <p>
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least
     * one host regardless of the value.
     * </p>
     * 
     * @return Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject
     *         at least one host regardless of the value.
     */

    public Integer getMaxEjectionPercent() {
        return this.maxEjectionPercent;
    }

    /**
     * <p>
     * Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least
     * one host regardless of the value.
     * </p>
     * 
     * @param maxEjectionPercent
     *        Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at
     *        least one host regardless of the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutlierDetection withMaxEjectionPercent(Integer maxEjectionPercent) {
        setMaxEjectionPercent(maxEjectionPercent);
        return this;
    }

    /**
     * <p>
     * Number of consecutive <code>5xx</code> errors required for ejection.
     * </p>
     * 
     * @param maxServerErrors
     *        Number of consecutive <code>5xx</code> errors required for ejection.
     */

    public void setMaxServerErrors(Long maxServerErrors) {
        this.maxServerErrors = maxServerErrors;
    }

    /**
     * <p>
     * Number of consecutive <code>5xx</code> errors required for ejection.
     * </p>
     * 
     * @return Number of consecutive <code>5xx</code> errors required for ejection.
     */

    public Long getMaxServerErrors() {
        return this.maxServerErrors;
    }

    /**
     * <p>
     * Number of consecutive <code>5xx</code> errors required for ejection.
     * </p>
     * 
     * @param maxServerErrors
     *        Number of consecutive <code>5xx</code> errors required for ejection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutlierDetection withMaxServerErrors(Long maxServerErrors) {
        setMaxServerErrors(maxServerErrors);
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
        if (getBaseEjectionDuration() != null)
            sb.append("BaseEjectionDuration: ").append(getBaseEjectionDuration()).append(",");
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getMaxEjectionPercent() != null)
            sb.append("MaxEjectionPercent: ").append(getMaxEjectionPercent()).append(",");
        if (getMaxServerErrors() != null)
            sb.append("MaxServerErrors: ").append(getMaxServerErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutlierDetection == false)
            return false;
        OutlierDetection other = (OutlierDetection) obj;
        if (other.getBaseEjectionDuration() == null ^ this.getBaseEjectionDuration() == null)
            return false;
        if (other.getBaseEjectionDuration() != null && other.getBaseEjectionDuration().equals(this.getBaseEjectionDuration()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getMaxEjectionPercent() == null ^ this.getMaxEjectionPercent() == null)
            return false;
        if (other.getMaxEjectionPercent() != null && other.getMaxEjectionPercent().equals(this.getMaxEjectionPercent()) == false)
            return false;
        if (other.getMaxServerErrors() == null ^ this.getMaxServerErrors() == null)
            return false;
        if (other.getMaxServerErrors() != null && other.getMaxServerErrors().equals(this.getMaxServerErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseEjectionDuration() == null) ? 0 : getBaseEjectionDuration().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getMaxEjectionPercent() == null) ? 0 : getMaxEjectionPercent().hashCode());
        hashCode = prime * hashCode + ((getMaxServerErrors() == null) ? 0 : getMaxServerErrors().hashCode());
        return hashCode;
    }

    @Override
    public OutlierDetection clone() {
        try {
            return (OutlierDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.OutlierDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
