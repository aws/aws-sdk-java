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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status of edge devices with this model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EdgeModelStat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeModelStat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The model version.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The number of devices that have this model version and do not have a heart beat.
     * </p>
     */
    private Long offlineDeviceCount;
    /**
     * <p>
     * The number of devices that have this model version and have a heart beat.
     * </p>
     */
    private Long connectedDeviceCount;
    /**
     * <p>
     * The number of devices that have this model version, a heart beat, and are currently running.
     * </p>
     */
    private Long activeDeviceCount;
    /**
     * <p>
     * The number of devices with this model version and are producing sample data.
     * </p>
     */
    private Long samplingDeviceCount;

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeModelStat withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @param modelVersion
     *        The model version.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @return The model version.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The model version.
     * </p>
     * 
     * @param modelVersion
     *        The model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeModelStat withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The number of devices that have this model version and do not have a heart beat.
     * </p>
     * 
     * @param offlineDeviceCount
     *        The number of devices that have this model version and do not have a heart beat.
     */

    public void setOfflineDeviceCount(Long offlineDeviceCount) {
        this.offlineDeviceCount = offlineDeviceCount;
    }

    /**
     * <p>
     * The number of devices that have this model version and do not have a heart beat.
     * </p>
     * 
     * @return The number of devices that have this model version and do not have a heart beat.
     */

    public Long getOfflineDeviceCount() {
        return this.offlineDeviceCount;
    }

    /**
     * <p>
     * The number of devices that have this model version and do not have a heart beat.
     * </p>
     * 
     * @param offlineDeviceCount
     *        The number of devices that have this model version and do not have a heart beat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeModelStat withOfflineDeviceCount(Long offlineDeviceCount) {
        setOfflineDeviceCount(offlineDeviceCount);
        return this;
    }

    /**
     * <p>
     * The number of devices that have this model version and have a heart beat.
     * </p>
     * 
     * @param connectedDeviceCount
     *        The number of devices that have this model version and have a heart beat.
     */

    public void setConnectedDeviceCount(Long connectedDeviceCount) {
        this.connectedDeviceCount = connectedDeviceCount;
    }

    /**
     * <p>
     * The number of devices that have this model version and have a heart beat.
     * </p>
     * 
     * @return The number of devices that have this model version and have a heart beat.
     */

    public Long getConnectedDeviceCount() {
        return this.connectedDeviceCount;
    }

    /**
     * <p>
     * The number of devices that have this model version and have a heart beat.
     * </p>
     * 
     * @param connectedDeviceCount
     *        The number of devices that have this model version and have a heart beat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeModelStat withConnectedDeviceCount(Long connectedDeviceCount) {
        setConnectedDeviceCount(connectedDeviceCount);
        return this;
    }

    /**
     * <p>
     * The number of devices that have this model version, a heart beat, and are currently running.
     * </p>
     * 
     * @param activeDeviceCount
     *        The number of devices that have this model version, a heart beat, and are currently running.
     */

    public void setActiveDeviceCount(Long activeDeviceCount) {
        this.activeDeviceCount = activeDeviceCount;
    }

    /**
     * <p>
     * The number of devices that have this model version, a heart beat, and are currently running.
     * </p>
     * 
     * @return The number of devices that have this model version, a heart beat, and are currently running.
     */

    public Long getActiveDeviceCount() {
        return this.activeDeviceCount;
    }

    /**
     * <p>
     * The number of devices that have this model version, a heart beat, and are currently running.
     * </p>
     * 
     * @param activeDeviceCount
     *        The number of devices that have this model version, a heart beat, and are currently running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeModelStat withActiveDeviceCount(Long activeDeviceCount) {
        setActiveDeviceCount(activeDeviceCount);
        return this;
    }

    /**
     * <p>
     * The number of devices with this model version and are producing sample data.
     * </p>
     * 
     * @param samplingDeviceCount
     *        The number of devices with this model version and are producing sample data.
     */

    public void setSamplingDeviceCount(Long samplingDeviceCount) {
        this.samplingDeviceCount = samplingDeviceCount;
    }

    /**
     * <p>
     * The number of devices with this model version and are producing sample data.
     * </p>
     * 
     * @return The number of devices with this model version and are producing sample data.
     */

    public Long getSamplingDeviceCount() {
        return this.samplingDeviceCount;
    }

    /**
     * <p>
     * The number of devices with this model version and are producing sample data.
     * </p>
     * 
     * @param samplingDeviceCount
     *        The number of devices with this model version and are producing sample data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeModelStat withSamplingDeviceCount(Long samplingDeviceCount) {
        setSamplingDeviceCount(samplingDeviceCount);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getOfflineDeviceCount() != null)
            sb.append("OfflineDeviceCount: ").append(getOfflineDeviceCount()).append(",");
        if (getConnectedDeviceCount() != null)
            sb.append("ConnectedDeviceCount: ").append(getConnectedDeviceCount()).append(",");
        if (getActiveDeviceCount() != null)
            sb.append("ActiveDeviceCount: ").append(getActiveDeviceCount()).append(",");
        if (getSamplingDeviceCount() != null)
            sb.append("SamplingDeviceCount: ").append(getSamplingDeviceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeModelStat == false)
            return false;
        EdgeModelStat other = (EdgeModelStat) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getOfflineDeviceCount() == null ^ this.getOfflineDeviceCount() == null)
            return false;
        if (other.getOfflineDeviceCount() != null && other.getOfflineDeviceCount().equals(this.getOfflineDeviceCount()) == false)
            return false;
        if (other.getConnectedDeviceCount() == null ^ this.getConnectedDeviceCount() == null)
            return false;
        if (other.getConnectedDeviceCount() != null && other.getConnectedDeviceCount().equals(this.getConnectedDeviceCount()) == false)
            return false;
        if (other.getActiveDeviceCount() == null ^ this.getActiveDeviceCount() == null)
            return false;
        if (other.getActiveDeviceCount() != null && other.getActiveDeviceCount().equals(this.getActiveDeviceCount()) == false)
            return false;
        if (other.getSamplingDeviceCount() == null ^ this.getSamplingDeviceCount() == null)
            return false;
        if (other.getSamplingDeviceCount() != null && other.getSamplingDeviceCount().equals(this.getSamplingDeviceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getOfflineDeviceCount() == null) ? 0 : getOfflineDeviceCount().hashCode());
        hashCode = prime * hashCode + ((getConnectedDeviceCount() == null) ? 0 : getConnectedDeviceCount().hashCode());
        hashCode = prime * hashCode + ((getActiveDeviceCount() == null) ? 0 : getActiveDeviceCount().hashCode());
        hashCode = prime * hashCode + ((getSamplingDeviceCount() == null) ? 0 : getSamplingDeviceCount().hashCode());
        return hashCode;
    }

    @Override
    public EdgeModelStat clone() {
        try {
            return (EdgeModelStat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgeModelStatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
