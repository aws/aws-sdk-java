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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateNetworkAnalyzerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkAnalyzerConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String name;

    private TraceContent traceContent;
    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     */
    private java.util.List<String> wirelessDevices;
    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     */
    private java.util.List<String> wirelessGateways;

    private String description;

    private java.util.List<Tag> tags;

    private String clientRequestToken;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAnalyzerConfigurationRequest withName(String name) {
        setName(name);
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

    public CreateNetworkAnalyzerConfigurationRequest withTraceContent(TraceContent traceContent) {
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

    public java.util.List<String> getWirelessDevices() {
        return wirelessDevices;
    }

    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     * 
     * @param wirelessDevices
     *        Wireless device resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resource to add in the input array.
     */

    public void setWirelessDevices(java.util.Collection<String> wirelessDevices) {
        if (wirelessDevices == null) {
            this.wirelessDevices = null;
            return;
        }

        this.wirelessDevices = new java.util.ArrayList<String>(wirelessDevices);
    }

    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessDevices(java.util.Collection)} or {@link #withWirelessDevices(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param wirelessDevices
     *        Wireless device resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resource to add in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAnalyzerConfigurationRequest withWirelessDevices(String... wirelessDevices) {
        if (this.wirelessDevices == null) {
            setWirelessDevices(new java.util.ArrayList<String>(wirelessDevices.length));
        }
        for (String ele : wirelessDevices) {
            this.wirelessDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Wireless device resources to add to the network analyzer configuration. Provide the <code>WirelessDeviceId</code>
     * of the resource to add in the input array.
     * </p>
     * 
     * @param wirelessDevices
     *        Wireless device resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessDeviceId</code> of the resource to add in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAnalyzerConfigurationRequest withWirelessDevices(java.util.Collection<String> wirelessDevices) {
        setWirelessDevices(wirelessDevices);
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

    public java.util.List<String> getWirelessGateways() {
        return wirelessGateways;
    }

    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     * 
     * @param wirelessGateways
     *        Wireless gateway resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resource to add in the input array.
     */

    public void setWirelessGateways(java.util.Collection<String> wirelessGateways) {
        if (wirelessGateways == null) {
            this.wirelessGateways = null;
            return;
        }

        this.wirelessGateways = new java.util.ArrayList<String>(wirelessGateways);
    }

    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessGateways(java.util.Collection)} or {@link #withWirelessGateways(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param wirelessGateways
     *        Wireless gateway resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resource to add in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAnalyzerConfigurationRequest withWirelessGateways(String... wirelessGateways) {
        if (this.wirelessGateways == null) {
            setWirelessGateways(new java.util.ArrayList<String>(wirelessGateways.length));
        }
        for (String ele : wirelessGateways) {
            this.wirelessGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Wireless gateway resources to add to the network analyzer configuration. Provide the
     * <code>WirelessGatewayId</code> of the resource to add in the input array.
     * </p>
     * 
     * @param wirelessGateways
     *        Wireless gateway resources to add to the network analyzer configuration. Provide the
     *        <code>WirelessGatewayId</code> of the resource to add in the input array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAnalyzerConfigurationRequest withWirelessGateways(java.util.Collection<String> wirelessGateways) {
        setWirelessGateways(wirelessGateways);
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

    public CreateNetworkAnalyzerConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAnalyzerConfigurationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAnalyzerConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkAnalyzerConfigurationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTraceContent() != null)
            sb.append("TraceContent: ").append(getTraceContent()).append(",");
        if (getWirelessDevices() != null)
            sb.append("WirelessDevices: ").append(getWirelessDevices()).append(",");
        if (getWirelessGateways() != null)
            sb.append("WirelessGateways: ").append(getWirelessGateways()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkAnalyzerConfigurationRequest == false)
            return false;
        CreateNetworkAnalyzerConfigurationRequest other = (CreateNetworkAnalyzerConfigurationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTraceContent() == null ^ this.getTraceContent() == null)
            return false;
        if (other.getTraceContent() != null && other.getTraceContent().equals(this.getTraceContent()) == false)
            return false;
        if (other.getWirelessDevices() == null ^ this.getWirelessDevices() == null)
            return false;
        if (other.getWirelessDevices() != null && other.getWirelessDevices().equals(this.getWirelessDevices()) == false)
            return false;
        if (other.getWirelessGateways() == null ^ this.getWirelessGateways() == null)
            return false;
        if (other.getWirelessGateways() != null && other.getWirelessGateways().equals(this.getWirelessGateways()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTraceContent() == null) ? 0 : getTraceContent().hashCode());
        hashCode = prime * hashCode + ((getWirelessDevices() == null) ? 0 : getWirelessDevices().hashCode());
        hashCode = prime * hashCode + ((getWirelessGateways() == null) ? 0 : getWirelessGateways().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkAnalyzerConfigurationRequest clone() {
        return (CreateNetworkAnalyzerConfigurationRequest) super.clone();
    }

}
