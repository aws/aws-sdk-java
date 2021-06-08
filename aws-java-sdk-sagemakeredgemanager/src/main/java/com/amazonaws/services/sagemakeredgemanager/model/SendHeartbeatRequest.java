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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/SendHeartbeat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendHeartbeatRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     * </p>
     */
    private java.util.List<EdgeMetric> agentMetrics;
    /**
     * <p>
     * Returns a list of models deployed on the the device.
     * </p>
     */
    private java.util.List<Model> models;
    /**
     * <p>
     * Returns the version of the agent.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * The unique name of the device.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     */
    private String deviceFleetName;

    /**
     * <p>
     * For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     * </p>
     * 
     * @return For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     */

    public java.util.List<EdgeMetric> getAgentMetrics() {
        return agentMetrics;
    }

    /**
     * <p>
     * For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     * </p>
     * 
     * @param agentMetrics
     *        For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     */

    public void setAgentMetrics(java.util.Collection<EdgeMetric> agentMetrics) {
        if (agentMetrics == null) {
            this.agentMetrics = null;
            return;
        }

        this.agentMetrics = new java.util.ArrayList<EdgeMetric>(agentMetrics);
    }

    /**
     * <p>
     * For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentMetrics(java.util.Collection)} or {@link #withAgentMetrics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentMetrics
     *        For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendHeartbeatRequest withAgentMetrics(EdgeMetric... agentMetrics) {
        if (this.agentMetrics == null) {
            setAgentMetrics(new java.util.ArrayList<EdgeMetric>(agentMetrics.length));
        }
        for (EdgeMetric ele : agentMetrics) {
            this.agentMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     * </p>
     * 
     * @param agentMetrics
     *        For internal use. Returns a list of SageMaker Edge Manager agent operating metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendHeartbeatRequest withAgentMetrics(java.util.Collection<EdgeMetric> agentMetrics) {
        setAgentMetrics(agentMetrics);
        return this;
    }

    /**
     * <p>
     * Returns a list of models deployed on the the device.
     * </p>
     * 
     * @return Returns a list of models deployed on the the device.
     */

    public java.util.List<Model> getModels() {
        return models;
    }

    /**
     * <p>
     * Returns a list of models deployed on the the device.
     * </p>
     * 
     * @param models
     *        Returns a list of models deployed on the the device.
     */

    public void setModels(java.util.Collection<Model> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<Model>(models);
    }

    /**
     * <p>
     * Returns a list of models deployed on the the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModels(java.util.Collection)} or {@link #withModels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param models
     *        Returns a list of models deployed on the the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendHeartbeatRequest withModels(Model... models) {
        if (this.models == null) {
            setModels(new java.util.ArrayList<Model>(models.length));
        }
        for (Model ele : models) {
            this.models.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of models deployed on the the device.
     * </p>
     * 
     * @param models
     *        Returns a list of models deployed on the the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendHeartbeatRequest withModels(java.util.Collection<Model> models) {
        setModels(models);
        return this;
    }

    /**
     * <p>
     * Returns the version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        Returns the version of the agent.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * Returns the version of the agent.
     * </p>
     * 
     * @return Returns the version of the agent.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * Returns the version of the agent.
     * </p>
     * 
     * @param agentVersion
     *        Returns the version of the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendHeartbeatRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * The unique name of the device.
     * </p>
     * 
     * @param deviceName
     *        The unique name of the device.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The unique name of the device.
     * </p>
     * 
     * @return The unique name of the device.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The unique name of the device.
     * </p>
     * 
     * @param deviceName
     *        The unique name of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendHeartbeatRequest withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet that the device belongs to.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @return The name of the fleet that the device belongs to.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet that the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet that the device belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendHeartbeatRequest withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
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
        if (getAgentMetrics() != null)
            sb.append("AgentMetrics: ").append(getAgentMetrics()).append(",");
        if (getModels() != null)
            sb.append("Models: ").append(getModels()).append(",");
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendHeartbeatRequest == false)
            return false;
        SendHeartbeatRequest other = (SendHeartbeatRequest) obj;
        if (other.getAgentMetrics() == null ^ this.getAgentMetrics() == null)
            return false;
        if (other.getAgentMetrics() != null && other.getAgentMetrics().equals(this.getAgentMetrics()) == false)
            return false;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentMetrics() == null) ? 0 : getAgentMetrics().hashCode());
        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        return hashCode;
    }

    @Override
    public SendHeartbeatRequest clone() {
        return (SendHeartbeatRequest) super.clone();
    }

}
