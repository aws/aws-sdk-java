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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetNetworkAnalyzerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkAnalyzerConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private TraceContent traceContent;
    /**
     * <p>
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     */
    private java.util.List<String> wirelessDevices;
    /**
     * <p>
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     */
    private java.util.List<String> wirelessGateways;

    private String description;
    /**
     * <p>
     * The Amazon Resource Name of the new resource.
     * </p>
     */
    private String arn;

    private String name;

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

    public GetNetworkAnalyzerConfigurationResult withTraceContent(TraceContent traceContent) {
        setTraceContent(traceContent);
        return this;
    }

    /**
     * <p>
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     * 
     * @return List of wireless gateway resources that have been added to the network analyzer configuration.
     */

    public java.util.List<String> getWirelessDevices() {
        return wirelessDevices;
    }

    /**
     * <p>
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     * 
     * @param wirelessDevices
     *        List of wireless gateway resources that have been added to the network analyzer configuration.
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
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessDevices(java.util.Collection)} or {@link #withWirelessDevices(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param wirelessDevices
     *        List of wireless gateway resources that have been added to the network analyzer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkAnalyzerConfigurationResult withWirelessDevices(String... wirelessDevices) {
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
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     * 
     * @param wirelessDevices
     *        List of wireless gateway resources that have been added to the network analyzer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkAnalyzerConfigurationResult withWirelessDevices(java.util.Collection<String> wirelessDevices) {
        setWirelessDevices(wirelessDevices);
        return this;
    }

    /**
     * <p>
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     * 
     * @return List of wireless gateway resources that have been added to the network analyzer configuration.
     */

    public java.util.List<String> getWirelessGateways() {
        return wirelessGateways;
    }

    /**
     * <p>
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     * 
     * @param wirelessGateways
     *        List of wireless gateway resources that have been added to the network analyzer configuration.
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
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessGateways(java.util.Collection)} or {@link #withWirelessGateways(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param wirelessGateways
     *        List of wireless gateway resources that have been added to the network analyzer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkAnalyzerConfigurationResult withWirelessGateways(String... wirelessGateways) {
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
     * List of wireless gateway resources that have been added to the network analyzer configuration.
     * </p>
     * 
     * @param wirelessGateways
     *        List of wireless gateway resources that have been added to the network analyzer configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkAnalyzerConfigurationResult withWirelessGateways(java.util.Collection<String> wirelessGateways) {
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

    public GetNetworkAnalyzerConfigurationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the new resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the new resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the new resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the new resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the new resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the new resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkAnalyzerConfigurationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public GetNetworkAnalyzerConfigurationResult withName(String name) {
        setName(name);
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
        if (getTraceContent() != null)
            sb.append("TraceContent: ").append(getTraceContent()).append(",");
        if (getWirelessDevices() != null)
            sb.append("WirelessDevices: ").append(getWirelessDevices()).append(",");
        if (getWirelessGateways() != null)
            sb.append("WirelessGateways: ").append(getWirelessGateways()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetNetworkAnalyzerConfigurationResult == false)
            return false;
        GetNetworkAnalyzerConfigurationResult other = (GetNetworkAnalyzerConfigurationResult) obj;
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTraceContent() == null) ? 0 : getTraceContent().hashCode());
        hashCode = prime * hashCode + ((getWirelessDevices() == null) ? 0 : getWirelessDevices().hashCode());
        hashCode = prime * hashCode + ((getWirelessGateways() == null) ? 0 : getWirelessGateways().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkAnalyzerConfigurationResult clone() {
        try {
            return (GetNetworkAnalyzerConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
