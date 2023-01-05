/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateNetworkAnalyzerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNetworkAnalyzerConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String configurationName;

    private TraceContent traceContent;
    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     */
    private java.util.List<String> wirelessDevicesToAdd;
    /**
     * <p>
     * Wireless device resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessDeviceId</code> of the resources to remove in the input array.
     * </p>
     */
    private java.util.List<String> wirelessDevicesToRemove;
    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     */
    private java.util.List<String> wirelessGatewaysToAdd;
    /**
     * <p>
     * Wireless gateway resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resources to remove in the input array.
     * </p>
     */
    private java.util.List<String> wirelessGatewaysToRemove;

    private String description;

    /**
     * @param configurationName
     */

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * @return
     */

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * @param configurationName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withConfigurationName(String configurationName) {
        setConfigurationName(configurationName);
        return this;
    }

    /**
     * @param traceContent
     */

    public void setTraceContent(TraceContent traceContent) {
        this.traceContent = traceContent;
    }

    /**
     * @return
     */

    public TraceContent getTraceContent() {
        return this.traceContent;
    }

    /**
     * @param traceContent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withTraceContent(TraceContent traceContent) {
        setTraceContent(traceContent);
        return this;
    }

    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     * 
     * @return Wireless device resources to add to the network analyzer configuration. Provide the
     *         <code>WirelessDeviceId</code> of the resource to add in the input array.
     */

    public java.util.List<String> getWirelessDevicesToAdd() {
        return wirelessDevicesToAdd;
    }

    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     * 
     * @param wirelessDevicesToAdd
     *        Wireless device resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resource to add in the input array.
     */

    public void setWirelessDevicesToAdd(java.util.Collection<String> wirelessDevicesToAdd) {
        if (wirelessDevicesToAdd == null) {
            this.wirelessDevicesToAdd = null;
            return;
        }

        this.wirelessDevicesToAdd = new java.util.ArrayList<String>(wirelessDevicesToAdd);
    }

    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessDevicesToAdd(java.util.Collection)} or {@link #withWirelessDevicesToAdd(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param wirelessDevicesToAdd
     *        Wireless device resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resource to add in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withWirelessDevicesToAdd(String... wirelessDevicesToAdd) {
        if (this.wirelessDevicesToAdd == null) {
            setWirelessDevicesToAdd(new java.util.ArrayList<String>(wirelessDevicesToAdd.length));
        }
        for (String ele : wirelessDevicesToAdd) {
            this.wirelessDevicesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     * 
     * @param wirelessDevicesToAdd
     *        Wireless device resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resource to add in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withWirelessDevicesToAdd(java.util.Collection<String> wirelessDevicesToAdd) {
        setWirelessDevicesToAdd(wirelessDevicesToAdd);
        return this;
    }

    /**
     * <p>
     * Wireless device resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessDeviceId</code> of the resources to remove in the input array.
     * </p>
     * 
     * @return Wireless device resources to remove from the network analyzer configuration. Provide the
     *         <code>WirelessDeviceId</code> of the resources to remove in the input array.
     */

    public java.util.List<String> getWirelessDevicesToRemove() {
        return wirelessDevicesToRemove;
    }

    /**
     * <p>
     * Wireless device resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessDeviceId</code> of the resources to remove in the input array.
     * </p>
     * 
     * @param wirelessDevicesToRemove
     *        Wireless device resources to remove from the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resources to remove in the input array.
     */

    public void setWirelessDevicesToRemove(java.util.Collection<String> wirelessDevicesToRemove) {
        if (wirelessDevicesToRemove == null) {
            this.wirelessDevicesToRemove = null;
            return;
        }

        this.wirelessDevicesToRemove = new java.util.ArrayList<String>(wirelessDevicesToRemove);
    }

    /**
     * <p>
     * Wireless device resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessDeviceId</code> of the resources to remove in the input array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessDevicesToRemove(java.util.Collection)} or
     * {@link #withWirelessDevicesToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param wirelessDevicesToRemove
     *        Wireless device resources to remove from the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resources to remove in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withWirelessDevicesToRemove(String... wirelessDevicesToRemove) {
        if (this.wirelessDevicesToRemove == null) {
            setWirelessDevicesToRemove(new java.util.ArrayList<String>(wirelessDevicesToRemove.length));
        }
        for (String ele : wirelessDevicesToRemove) {
            this.wirelessDevicesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Wireless device resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessDeviceId</code> of the resources to remove in the input array.
     * </p>
     * 
     * @param wirelessDevicesToRemove
     *        Wireless device resources to remove from the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resources to remove in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withWirelessDevicesToRemove(java.util.Collection<String> wirelessDevicesToRemove) {
        setWirelessDevicesToRemove(wirelessDevicesToRemove);
        return this;
    }

    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     * 
     * @return Wireless gateway resources to add to the network analyzer configuration. Provide the
     *         <code>WirelessGatewayId</code> of the resource to add in the input array.
     */

    public java.util.List<String> getWirelessGatewaysToAdd() {
        return wirelessGatewaysToAdd;
    }

    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     * 
     * @param wirelessGatewaysToAdd
     *        Wireless gateway resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resource to add in the input array.
     */

    public void setWirelessGatewaysToAdd(java.util.Collection<String> wirelessGatewaysToAdd) {
        if (wirelessGatewaysToAdd == null) {
            this.wirelessGatewaysToAdd = null;
            return;
        }

        this.wirelessGatewaysToAdd = new java.util.ArrayList<String>(wirelessGatewaysToAdd);
    }

    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessGatewaysToAdd(java.util.Collection)} or
     * {@link #withWirelessGatewaysToAdd(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param wirelessGatewaysToAdd
     *        Wireless gateway resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resource to add in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withWirelessGatewaysToAdd(String... wirelessGatewaysToAdd) {
        if (this.wirelessGatewaysToAdd == null) {
            setWirelessGatewaysToAdd(new java.util.ArrayList<String>(wirelessGatewaysToAdd.length));
        }
        for (String ele : wirelessGatewaysToAdd) {
            this.wirelessGatewaysToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     * 
     * @param wirelessGatewaysToAdd
     *        Wireless gateway resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resource to add in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withWirelessGatewaysToAdd(java.util.Collection<String> wirelessGatewaysToAdd) {
        setWirelessGatewaysToAdd(wirelessGatewaysToAdd);
        return this;
    }

    /**
     * <p>
     * Wireless gateway resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resources to remove in the input array.
     * </p>
     * 
     * @return Wireless gateway resources to remove from the network analyzer configuration. Provide the
     *         <code>WirelessGatewayId</code> of the resources to remove in the input array.
     */

    public java.util.List<String> getWirelessGatewaysToRemove() {
        return wirelessGatewaysToRemove;
    }

    /**
     * <p>
     * Wireless gateway resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resources to remove in the input array.
     * </p>
     * 
     * @param wirelessGatewaysToRemove
     *        Wireless gateway resources to remove from the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resources to remove in the input array.
     */

    public void setWirelessGatewaysToRemove(java.util.Collection<String> wirelessGatewaysToRemove) {
        if (wirelessGatewaysToRemove == null) {
            this.wirelessGatewaysToRemove = null;
            return;
        }

        this.wirelessGatewaysToRemove = new java.util.ArrayList<String>(wirelessGatewaysToRemove);
    }

    /**
     * <p>
     * Wireless gateway resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resources to remove in the input array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessGatewaysToRemove(java.util.Collection)} or
     * {@link #withWirelessGatewaysToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param wirelessGatewaysToRemove
     *        Wireless gateway resources to remove from the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resources to remove in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withWirelessGatewaysToRemove(String... wirelessGatewaysToRemove) {
        if (this.wirelessGatewaysToRemove == null) {
            setWirelessGatewaysToRemove(new java.util.ArrayList<String>(wirelessGatewaysToRemove.length));
        }
        for (String ele : wirelessGatewaysToRemove) {
            this.wirelessGatewaysToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Wireless gateway resources to remove from the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resources to remove in the input array.
     * </p>
     * 
     * @param wirelessGatewaysToRemove
     *        Wireless gateway resources to remove from the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resources to remove in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withWirelessGatewaysToRemove(java.util.Collection<String> wirelessGatewaysToRemove) {
        setWirelessGatewaysToRemove(wirelessGatewaysToRemove);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkAnalyzerConfigurationRequest withDescription(String description) {
        setDescription(description);
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
        if (getConfigurationName() != null)
            sb.append("ConfigurationName: ").append(getConfigurationName()).append(",");
        if (getTraceContent() != null)
            sb.append("TraceContent: ").append(getTraceContent()).append(",");
        if (getWirelessDevicesToAdd() != null)
            sb.append("WirelessDevicesToAdd: ").append(getWirelessDevicesToAdd()).append(",");
        if (getWirelessDevicesToRemove() != null)
            sb.append("WirelessDevicesToRemove: ").append(getWirelessDevicesToRemove()).append(",");
        if (getWirelessGatewaysToAdd() != null)
            sb.append("WirelessGatewaysToAdd: ").append(getWirelessGatewaysToAdd()).append(",");
        if (getWirelessGatewaysToRemove() != null)
            sb.append("WirelessGatewaysToRemove: ").append(getWirelessGatewaysToRemove()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNetworkAnalyzerConfigurationRequest == false)
            return false;
        UpdateNetworkAnalyzerConfigurationRequest other = (UpdateNetworkAnalyzerConfigurationRequest) obj;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null && other.getConfigurationName().equals(this.getConfigurationName()) == false)
            return false;
        if (other.getTraceContent() == null ^ this.getTraceContent() == null)
            return false;
        if (other.getTraceContent() != null && other.getTraceContent().equals(this.getTraceContent()) == false)
            return false;
        if (other.getWirelessDevicesToAdd() == null ^ this.getWirelessDevicesToAdd() == null)
            return false;
        if (other.getWirelessDevicesToAdd() != null && other.getWirelessDevicesToAdd().equals(this.getWirelessDevicesToAdd()) == false)
            return false;
        if (other.getWirelessDevicesToRemove() == null ^ this.getWirelessDevicesToRemove() == null)
            return false;
        if (other.getWirelessDevicesToRemove() != null && other.getWirelessDevicesToRemove().equals(this.getWirelessDevicesToRemove()) == false)
            return false;
        if (other.getWirelessGatewaysToAdd() == null ^ this.getWirelessGatewaysToAdd() == null)
            return false;
        if (other.getWirelessGatewaysToAdd() != null && other.getWirelessGatewaysToAdd().equals(this.getWirelessGatewaysToAdd()) == false)
            return false;
        if (other.getWirelessGatewaysToRemove() == null ^ this.getWirelessGatewaysToRemove() == null)
            return false;
        if (other.getWirelessGatewaysToRemove() != null && other.getWirelessGatewaysToRemove().equals(this.getWirelessGatewaysToRemove()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getTraceContent() == null) ? 0 : getTraceContent().hashCode());
        hashCode = prime * hashCode + ((getWirelessDevicesToAdd() == null) ? 0 : getWirelessDevicesToAdd().hashCode());
        hashCode = prime * hashCode + ((getWirelessDevicesToRemove() == null) ? 0 : getWirelessDevicesToRemove().hashCode());
        hashCode = prime * hashCode + ((getWirelessGatewaysToAdd() == null) ? 0 : getWirelessGatewaysToAdd().hashCode());
        hashCode = prime * hashCode + ((getWirelessGatewaysToRemove() == null) ? 0 : getWirelessGatewaysToRemove().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNetworkAnalyzerConfigurationRequest clone() {
        return (UpdateNetworkAnalyzerConfigurationRequest) super.clone();
    }

}
