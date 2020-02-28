/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the profiling status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/ProfilingStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfilingStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the latest agent was orchestrated.
     * </p>
     */
    private java.util.Date latestAgentOrchestratedAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the latest agent was reported..
     * </p>
     */
    private java.util.Date latestAgentProfileReportedAt;
    /**
     * <p>
     * The latest aggregated profile
     * </p>
     */
    private AggregatedProfileTime latestAggregatedProfile;

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the latest agent was orchestrated.
     * </p>
     * 
     * @param latestAgentOrchestratedAt
     *        The time, in milliseconds since the epoch, when the latest agent was orchestrated.
     */

    public void setLatestAgentOrchestratedAt(java.util.Date latestAgentOrchestratedAt) {
        this.latestAgentOrchestratedAt = latestAgentOrchestratedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the latest agent was orchestrated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the latest agent was orchestrated.
     */

    public java.util.Date getLatestAgentOrchestratedAt() {
        return this.latestAgentOrchestratedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the latest agent was orchestrated.
     * </p>
     * 
     * @param latestAgentOrchestratedAt
     *        The time, in milliseconds since the epoch, when the latest agent was orchestrated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingStatus withLatestAgentOrchestratedAt(java.util.Date latestAgentOrchestratedAt) {
        setLatestAgentOrchestratedAt(latestAgentOrchestratedAt);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the latest agent was reported..
     * </p>
     * 
     * @param latestAgentProfileReportedAt
     *        The time, in milliseconds since the epoch, when the latest agent was reported..
     */

    public void setLatestAgentProfileReportedAt(java.util.Date latestAgentProfileReportedAt) {
        this.latestAgentProfileReportedAt = latestAgentProfileReportedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the latest agent was reported..
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the latest agent was reported..
     */

    public java.util.Date getLatestAgentProfileReportedAt() {
        return this.latestAgentProfileReportedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the latest agent was reported..
     * </p>
     * 
     * @param latestAgentProfileReportedAt
     *        The time, in milliseconds since the epoch, when the latest agent was reported..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingStatus withLatestAgentProfileReportedAt(java.util.Date latestAgentProfileReportedAt) {
        setLatestAgentProfileReportedAt(latestAgentProfileReportedAt);
        return this;
    }

    /**
     * <p>
     * The latest aggregated profile
     * </p>
     * 
     * @param latestAggregatedProfile
     *        The latest aggregated profile
     */

    public void setLatestAggregatedProfile(AggregatedProfileTime latestAggregatedProfile) {
        this.latestAggregatedProfile = latestAggregatedProfile;
    }

    /**
     * <p>
     * The latest aggregated profile
     * </p>
     * 
     * @return The latest aggregated profile
     */

    public AggregatedProfileTime getLatestAggregatedProfile() {
        return this.latestAggregatedProfile;
    }

    /**
     * <p>
     * The latest aggregated profile
     * </p>
     * 
     * @param latestAggregatedProfile
     *        The latest aggregated profile
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfilingStatus withLatestAggregatedProfile(AggregatedProfileTime latestAggregatedProfile) {
        setLatestAggregatedProfile(latestAggregatedProfile);
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
        if (getLatestAgentOrchestratedAt() != null)
            sb.append("LatestAgentOrchestratedAt: ").append(getLatestAgentOrchestratedAt()).append(",");
        if (getLatestAgentProfileReportedAt() != null)
            sb.append("LatestAgentProfileReportedAt: ").append(getLatestAgentProfileReportedAt()).append(",");
        if (getLatestAggregatedProfile() != null)
            sb.append("LatestAggregatedProfile: ").append(getLatestAggregatedProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfilingStatus == false)
            return false;
        ProfilingStatus other = (ProfilingStatus) obj;
        if (other.getLatestAgentOrchestratedAt() == null ^ this.getLatestAgentOrchestratedAt() == null)
            return false;
        if (other.getLatestAgentOrchestratedAt() != null && other.getLatestAgentOrchestratedAt().equals(this.getLatestAgentOrchestratedAt()) == false)
            return false;
        if (other.getLatestAgentProfileReportedAt() == null ^ this.getLatestAgentProfileReportedAt() == null)
            return false;
        if (other.getLatestAgentProfileReportedAt() != null && other.getLatestAgentProfileReportedAt().equals(this.getLatestAgentProfileReportedAt()) == false)
            return false;
        if (other.getLatestAggregatedProfile() == null ^ this.getLatestAggregatedProfile() == null)
            return false;
        if (other.getLatestAggregatedProfile() != null && other.getLatestAggregatedProfile().equals(this.getLatestAggregatedProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLatestAgentOrchestratedAt() == null) ? 0 : getLatestAgentOrchestratedAt().hashCode());
        hashCode = prime * hashCode + ((getLatestAgentProfileReportedAt() == null) ? 0 : getLatestAgentProfileReportedAt().hashCode());
        hashCode = prime * hashCode + ((getLatestAggregatedProfile() == null) ? 0 : getLatestAggregatedProfile().hashCode());
        return hashCode;
    }

    @Override
    public ProfilingStatus clone() {
        try {
            return (ProfilingStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.ProfilingStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
