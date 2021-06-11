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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The settings for source failover
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/FailoverConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailoverConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * The type of failover you choose for this flow. MERGE combines the source streams into a single stream, allowing
     * graceful recovery from any single-source loss. FAILOVER allows switching between different streams.
     */
    private String failoverMode;
    /** Search window time to look for dash-7 packets */
    private Integer recoveryWindow;
    /**
     * The priority you want to assign to a source. You can have a primary stream and a backup stream or two equally
     * prioritized streams.
     */
    private SourcePriority sourcePriority;

    private String state;

    /**
     * The type of failover you choose for this flow. MERGE combines the source streams into a single stream, allowing
     * graceful recovery from any single-source loss. FAILOVER allows switching between different streams.
     * 
     * @param failoverMode
     *        The type of failover you choose for this flow. MERGE combines the source streams into a single stream,
     *        allowing graceful recovery from any single-source loss. FAILOVER allows switching between different
     *        streams.
     * @see FailoverMode
     */

    public void setFailoverMode(String failoverMode) {
        this.failoverMode = failoverMode;
    }

    /**
     * The type of failover you choose for this flow. MERGE combines the source streams into a single stream, allowing
     * graceful recovery from any single-source loss. FAILOVER allows switching between different streams.
     * 
     * @return The type of failover you choose for this flow. MERGE combines the source streams into a single stream,
     *         allowing graceful recovery from any single-source loss. FAILOVER allows switching between different
     *         streams.
     * @see FailoverMode
     */

    public String getFailoverMode() {
        return this.failoverMode;
    }

    /**
     * The type of failover you choose for this flow. MERGE combines the source streams into a single stream, allowing
     * graceful recovery from any single-source loss. FAILOVER allows switching between different streams.
     * 
     * @param failoverMode
     *        The type of failover you choose for this flow. MERGE combines the source streams into a single stream,
     *        allowing graceful recovery from any single-source loss. FAILOVER allows switching between different
     *        streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailoverMode
     */

    public FailoverConfig withFailoverMode(String failoverMode) {
        setFailoverMode(failoverMode);
        return this;
    }

    /**
     * The type of failover you choose for this flow. MERGE combines the source streams into a single stream, allowing
     * graceful recovery from any single-source loss. FAILOVER allows switching between different streams.
     * 
     * @param failoverMode
     *        The type of failover you choose for this flow. MERGE combines the source streams into a single stream,
     *        allowing graceful recovery from any single-source loss. FAILOVER allows switching between different
     *        streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailoverMode
     */

    public FailoverConfig withFailoverMode(FailoverMode failoverMode) {
        this.failoverMode = failoverMode.toString();
        return this;
    }

    /**
     * Search window time to look for dash-7 packets
     * 
     * @param recoveryWindow
     *        Search window time to look for dash-7 packets
     */

    public void setRecoveryWindow(Integer recoveryWindow) {
        this.recoveryWindow = recoveryWindow;
    }

    /**
     * Search window time to look for dash-7 packets
     * 
     * @return Search window time to look for dash-7 packets
     */

    public Integer getRecoveryWindow() {
        return this.recoveryWindow;
    }

    /**
     * Search window time to look for dash-7 packets
     * 
     * @param recoveryWindow
     *        Search window time to look for dash-7 packets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverConfig withRecoveryWindow(Integer recoveryWindow) {
        setRecoveryWindow(recoveryWindow);
        return this;
    }

    /**
     * The priority you want to assign to a source. You can have a primary stream and a backup stream or two equally
     * prioritized streams.
     * 
     * @param sourcePriority
     *        The priority you want to assign to a source. You can have a primary stream and a backup stream or two
     *        equally prioritized streams.
     */

    public void setSourcePriority(SourcePriority sourcePriority) {
        this.sourcePriority = sourcePriority;
    }

    /**
     * The priority you want to assign to a source. You can have a primary stream and a backup stream or two equally
     * prioritized streams.
     * 
     * @return The priority you want to assign to a source. You can have a primary stream and a backup stream or two
     *         equally prioritized streams.
     */

    public SourcePriority getSourcePriority() {
        return this.sourcePriority;
    }

    /**
     * The priority you want to assign to a source. You can have a primary stream and a backup stream or two equally
     * prioritized streams.
     * 
     * @param sourcePriority
     *        The priority you want to assign to a source. You can have a primary stream and a backup stream or two
     *        equally prioritized streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailoverConfig withSourcePriority(SourcePriority sourcePriority) {
        setSourcePriority(sourcePriority);
        return this;
    }

    /**
     * @param state
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public FailoverConfig withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public FailoverConfig withState(State state) {
        this.state = state.toString();
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
        if (getFailoverMode() != null)
            sb.append("FailoverMode: ").append(getFailoverMode()).append(",");
        if (getRecoveryWindow() != null)
            sb.append("RecoveryWindow: ").append(getRecoveryWindow()).append(",");
        if (getSourcePriority() != null)
            sb.append("SourcePriority: ").append(getSourcePriority()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverConfig == false)
            return false;
        FailoverConfig other = (FailoverConfig) obj;
        if (other.getFailoverMode() == null ^ this.getFailoverMode() == null)
            return false;
        if (other.getFailoverMode() != null && other.getFailoverMode().equals(this.getFailoverMode()) == false)
            return false;
        if (other.getRecoveryWindow() == null ^ this.getRecoveryWindow() == null)
            return false;
        if (other.getRecoveryWindow() != null && other.getRecoveryWindow().equals(this.getRecoveryWindow()) == false)
            return false;
        if (other.getSourcePriority() == null ^ this.getSourcePriority() == null)
            return false;
        if (other.getSourcePriority() != null && other.getSourcePriority().equals(this.getSourcePriority()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailoverMode() == null) ? 0 : getFailoverMode().hashCode());
        hashCode = prime * hashCode + ((getRecoveryWindow() == null) ? 0 : getRecoveryWindow().hashCode());
        hashCode = prime * hashCode + ((getSourcePriority() == null) ? 0 : getSourcePriority().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public FailoverConfig clone() {
        try {
            return (FailoverConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.FailoverConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
