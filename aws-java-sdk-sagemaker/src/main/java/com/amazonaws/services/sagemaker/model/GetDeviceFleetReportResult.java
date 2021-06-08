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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GetDeviceFleetReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceFleetReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     */
    private String deviceFleetArn;
    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * The output configuration for storing sample data collected by the fleet.
     * </p>
     */
    private EdgeOutputConfig outputConfig;
    /**
     * <p>
     * Description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Timestamp of when the report was generated.
     * </p>
     */
    private java.util.Date reportGenerated;
    /**
     * <p>
     * Status of devices.
     * </p>
     */
    private DeviceStats deviceStats;
    /**
     * <p>
     * The versions of Edge Manager agent deployed on the fleet.
     * </p>
     */
    private java.util.List<AgentVersion> agentVersions;
    /**
     * <p>
     * Status of model on device.
     * </p>
     */
    private java.util.List<EdgeModelStat> modelStats;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param deviceFleetArn
     *        The Amazon Resource Name (ARN) of the device.
     */

    public void setDeviceFleetArn(String deviceFleetArn) {
        this.deviceFleetArn = deviceFleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device.
     */

    public String getDeviceFleetArn() {
        return this.deviceFleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param deviceFleetArn
     *        The Amazon Resource Name (ARN) of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withDeviceFleetArn(String deviceFleetArn) {
        setDeviceFleetArn(deviceFleetArn);
        return this;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * The output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @param outputConfig
     *        The output configuration for storing sample data collected by the fleet.
     */

    public void setOutputConfig(EdgeOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @return The output configuration for storing sample data collected by the fleet.
     */

    public EdgeOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The output configuration for storing sample data collected by the fleet.
     * </p>
     * 
     * @param outputConfig
     *        The output configuration for storing sample data collected by the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withOutputConfig(EdgeOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * Description of the fleet.
     * </p>
     * 
     * @param description
     *        Description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the fleet.
     * </p>
     * 
     * @return Description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the fleet.
     * </p>
     * 
     * @param description
     *        Description of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the report was generated.
     * </p>
     * 
     * @param reportGenerated
     *        Timestamp of when the report was generated.
     */

    public void setReportGenerated(java.util.Date reportGenerated) {
        this.reportGenerated = reportGenerated;
    }

    /**
     * <p>
     * Timestamp of when the report was generated.
     * </p>
     * 
     * @return Timestamp of when the report was generated.
     */

    public java.util.Date getReportGenerated() {
        return this.reportGenerated;
    }

    /**
     * <p>
     * Timestamp of when the report was generated.
     * </p>
     * 
     * @param reportGenerated
     *        Timestamp of when the report was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withReportGenerated(java.util.Date reportGenerated) {
        setReportGenerated(reportGenerated);
        return this;
    }

    /**
     * <p>
     * Status of devices.
     * </p>
     * 
     * @param deviceStats
     *        Status of devices.
     */

    public void setDeviceStats(DeviceStats deviceStats) {
        this.deviceStats = deviceStats;
    }

    /**
     * <p>
     * Status of devices.
     * </p>
     * 
     * @return Status of devices.
     */

    public DeviceStats getDeviceStats() {
        return this.deviceStats;
    }

    /**
     * <p>
     * Status of devices.
     * </p>
     * 
     * @param deviceStats
     *        Status of devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withDeviceStats(DeviceStats deviceStats) {
        setDeviceStats(deviceStats);
        return this;
    }

    /**
     * <p>
     * The versions of Edge Manager agent deployed on the fleet.
     * </p>
     * 
     * @return The versions of Edge Manager agent deployed on the fleet.
     */

    public java.util.List<AgentVersion> getAgentVersions() {
        return agentVersions;
    }

    /**
     * <p>
     * The versions of Edge Manager agent deployed on the fleet.
     * </p>
     * 
     * @param agentVersions
     *        The versions of Edge Manager agent deployed on the fleet.
     */

    public void setAgentVersions(java.util.Collection<AgentVersion> agentVersions) {
        if (agentVersions == null) {
            this.agentVersions = null;
            return;
        }

        this.agentVersions = new java.util.ArrayList<AgentVersion>(agentVersions);
    }

    /**
     * <p>
     * The versions of Edge Manager agent deployed on the fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentVersions(java.util.Collection)} or {@link #withAgentVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param agentVersions
     *        The versions of Edge Manager agent deployed on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withAgentVersions(AgentVersion... agentVersions) {
        if (this.agentVersions == null) {
            setAgentVersions(new java.util.ArrayList<AgentVersion>(agentVersions.length));
        }
        for (AgentVersion ele : agentVersions) {
            this.agentVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The versions of Edge Manager agent deployed on the fleet.
     * </p>
     * 
     * @param agentVersions
     *        The versions of Edge Manager agent deployed on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withAgentVersions(java.util.Collection<AgentVersion> agentVersions) {
        setAgentVersions(agentVersions);
        return this;
    }

    /**
     * <p>
     * Status of model on device.
     * </p>
     * 
     * @return Status of model on device.
     */

    public java.util.List<EdgeModelStat> getModelStats() {
        return modelStats;
    }

    /**
     * <p>
     * Status of model on device.
     * </p>
     * 
     * @param modelStats
     *        Status of model on device.
     */

    public void setModelStats(java.util.Collection<EdgeModelStat> modelStats) {
        if (modelStats == null) {
            this.modelStats = null;
            return;
        }

        this.modelStats = new java.util.ArrayList<EdgeModelStat>(modelStats);
    }

    /**
     * <p>
     * Status of model on device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelStats(java.util.Collection)} or {@link #withModelStats(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param modelStats
     *        Status of model on device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withModelStats(EdgeModelStat... modelStats) {
        if (this.modelStats == null) {
            setModelStats(new java.util.ArrayList<EdgeModelStat>(modelStats.length));
        }
        for (EdgeModelStat ele : modelStats) {
            this.modelStats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Status of model on device.
     * </p>
     * 
     * @param modelStats
     *        Status of model on device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceFleetReportResult withModelStats(java.util.Collection<EdgeModelStat> modelStats) {
        setModelStats(modelStats);
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
        if (getDeviceFleetArn() != null)
            sb.append("DeviceFleetArn: ").append(getDeviceFleetArn()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getReportGenerated() != null)
            sb.append("ReportGenerated: ").append(getReportGenerated()).append(",");
        if (getDeviceStats() != null)
            sb.append("DeviceStats: ").append(getDeviceStats()).append(",");
        if (getAgentVersions() != null)
            sb.append("AgentVersions: ").append(getAgentVersions()).append(",");
        if (getModelStats() != null)
            sb.append("ModelStats: ").append(getModelStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceFleetReportResult == false)
            return false;
        GetDeviceFleetReportResult other = (GetDeviceFleetReportResult) obj;
        if (other.getDeviceFleetArn() == null ^ this.getDeviceFleetArn() == null)
            return false;
        if (other.getDeviceFleetArn() != null && other.getDeviceFleetArn().equals(this.getDeviceFleetArn()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getReportGenerated() == null ^ this.getReportGenerated() == null)
            return false;
        if (other.getReportGenerated() != null && other.getReportGenerated().equals(this.getReportGenerated()) == false)
            return false;
        if (other.getDeviceStats() == null ^ this.getDeviceStats() == null)
            return false;
        if (other.getDeviceStats() != null && other.getDeviceStats().equals(this.getDeviceStats()) == false)
            return false;
        if (other.getAgentVersions() == null ^ this.getAgentVersions() == null)
            return false;
        if (other.getAgentVersions() != null && other.getAgentVersions().equals(this.getAgentVersions()) == false)
            return false;
        if (other.getModelStats() == null ^ this.getModelStats() == null)
            return false;
        if (other.getModelStats() != null && other.getModelStats().equals(this.getModelStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceFleetArn() == null) ? 0 : getDeviceFleetArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getReportGenerated() == null) ? 0 : getReportGenerated().hashCode());
        hashCode = prime * hashCode + ((getDeviceStats() == null) ? 0 : getDeviceStats().hashCode());
        hashCode = prime * hashCode + ((getAgentVersions() == null) ? 0 : getAgentVersions().hashCode());
        hashCode = prime * hashCode + ((getModelStats() == null) ? 0 : getModelStats().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceFleetReportResult clone() {
        try {
            return (GetDeviceFleetReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
