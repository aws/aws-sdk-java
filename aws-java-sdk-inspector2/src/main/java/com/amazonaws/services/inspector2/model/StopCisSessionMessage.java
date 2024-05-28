/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The stop CIS session message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/StopCisSessionMessage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopCisSessionMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The message benchmark profile.
     * </p>
     */
    private String benchmarkProfile;
    /**
     * <p>
     * The message benchmark version.
     * </p>
     */
    private String benchmarkVersion;
    /**
     * <p>
     * The message compute platform.
     * </p>
     */
    private ComputePlatform computePlatform;
    /**
     * <p>
     * The progress of the message.
     * </p>
     */
    private StopCisMessageProgress progress;
    /**
     * <p>
     * The reason for the message.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The status of the message.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The message benchmark profile.
     * </p>
     * 
     * @param benchmarkProfile
     *        The message benchmark profile.
     */

    public void setBenchmarkProfile(String benchmarkProfile) {
        this.benchmarkProfile = benchmarkProfile;
    }

    /**
     * <p>
     * The message benchmark profile.
     * </p>
     * 
     * @return The message benchmark profile.
     */

    public String getBenchmarkProfile() {
        return this.benchmarkProfile;
    }

    /**
     * <p>
     * The message benchmark profile.
     * </p>
     * 
     * @param benchmarkProfile
     *        The message benchmark profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisSessionMessage withBenchmarkProfile(String benchmarkProfile) {
        setBenchmarkProfile(benchmarkProfile);
        return this;
    }

    /**
     * <p>
     * The message benchmark version.
     * </p>
     * 
     * @param benchmarkVersion
     *        The message benchmark version.
     */

    public void setBenchmarkVersion(String benchmarkVersion) {
        this.benchmarkVersion = benchmarkVersion;
    }

    /**
     * <p>
     * The message benchmark version.
     * </p>
     * 
     * @return The message benchmark version.
     */

    public String getBenchmarkVersion() {
        return this.benchmarkVersion;
    }

    /**
     * <p>
     * The message benchmark version.
     * </p>
     * 
     * @param benchmarkVersion
     *        The message benchmark version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisSessionMessage withBenchmarkVersion(String benchmarkVersion) {
        setBenchmarkVersion(benchmarkVersion);
        return this;
    }

    /**
     * <p>
     * The message compute platform.
     * </p>
     * 
     * @param computePlatform
     *        The message compute platform.
     */

    public void setComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The message compute platform.
     * </p>
     * 
     * @return The message compute platform.
     */

    public ComputePlatform getComputePlatform() {
        return this.computePlatform;
    }

    /**
     * <p>
     * The message compute platform.
     * </p>
     * 
     * @param computePlatform
     *        The message compute platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisSessionMessage withComputePlatform(ComputePlatform computePlatform) {
        setComputePlatform(computePlatform);
        return this;
    }

    /**
     * <p>
     * The progress of the message.
     * </p>
     * 
     * @param progress
     *        The progress of the message.
     */

    public void setProgress(StopCisMessageProgress progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the message.
     * </p>
     * 
     * @return The progress of the message.
     */

    public StopCisMessageProgress getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The progress of the message.
     * </p>
     * 
     * @param progress
     *        The progress of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisSessionMessage withProgress(StopCisMessageProgress progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The reason for the message.
     * </p>
     * 
     * @param reason
     *        The reason for the message.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the message.
     * </p>
     * 
     * @return The reason for the message.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the message.
     * </p>
     * 
     * @param reason
     *        The reason for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopCisSessionMessage withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The status of the message.
     * </p>
     * 
     * @param status
     *        The status of the message.
     * @see StopCisSessionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the message.
     * </p>
     * 
     * @return The status of the message.
     * @see StopCisSessionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the message.
     * </p>
     * 
     * @param status
     *        The status of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StopCisSessionStatus
     */

    public StopCisSessionMessage withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the message.
     * </p>
     * 
     * @param status
     *        The status of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StopCisSessionStatus
     */

    public StopCisSessionMessage withStatus(StopCisSessionStatus status) {
        this.status = status.toString();
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
        if (getBenchmarkProfile() != null)
            sb.append("BenchmarkProfile: ").append(getBenchmarkProfile()).append(",");
        if (getBenchmarkVersion() != null)
            sb.append("BenchmarkVersion: ").append(getBenchmarkVersion()).append(",");
        if (getComputePlatform() != null)
            sb.append("ComputePlatform: ").append(getComputePlatform()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopCisSessionMessage == false)
            return false;
        StopCisSessionMessage other = (StopCisSessionMessage) obj;
        if (other.getBenchmarkProfile() == null ^ this.getBenchmarkProfile() == null)
            return false;
        if (other.getBenchmarkProfile() != null && other.getBenchmarkProfile().equals(this.getBenchmarkProfile()) == false)
            return false;
        if (other.getBenchmarkVersion() == null ^ this.getBenchmarkVersion() == null)
            return false;
        if (other.getBenchmarkVersion() != null && other.getBenchmarkVersion().equals(this.getBenchmarkVersion()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBenchmarkProfile() == null) ? 0 : getBenchmarkProfile().hashCode());
        hashCode = prime * hashCode + ((getBenchmarkVersion() == null) ? 0 : getBenchmarkVersion().hashCode());
        hashCode = prime * hashCode + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StopCisSessionMessage clone() {
        try {
            return (StopCisSessionMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.StopCisSessionMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
