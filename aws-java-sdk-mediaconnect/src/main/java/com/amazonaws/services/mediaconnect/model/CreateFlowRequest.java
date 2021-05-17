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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates a new flow. The request must include one source. The request optionally can include outputs (up to 50) and
 * entitlements (up to 50).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS Region.
     */
    private String availabilityZone;
    /** The entitlements that you want to grant on a flow. */
    private java.util.List<GrantEntitlementRequest> entitlements;
    /**
     * The media streams that you want to add to the flow. You can associate these media streams with sources and
     * outputs on the flow.
     */
    private java.util.List<AddMediaStreamRequest> mediaStreams;
    /** The name of the flow. */
    private String name;
    /** The outputs that you want to add to this flow. */
    private java.util.List<AddOutputRequest> outputs;

    private SetSourceRequest source;

    private FailoverConfig sourceFailoverConfig;

    private java.util.List<SetSourceRequest> sources;
    /** The VPC interfaces you want on the flow. */
    private java.util.List<VpcInterfaceRequest> vpcInterfaces;

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS Region.
     * 
     * @param availabilityZone
     *        The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *        Zones within the current AWS Region.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS Region.
     * 
     * @return The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *         Zones within the current AWS Region.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones
     * within the current AWS Region.
     * 
     * @param availabilityZone
     *        The Availability Zone that you want to create the flow in. These options are limited to the Availability
     *        Zones within the current AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * The entitlements that you want to grant on a flow.
     * 
     * @return The entitlements that you want to grant on a flow.
     */

    public java.util.List<GrantEntitlementRequest> getEntitlements() {
        return entitlements;
    }

    /**
     * The entitlements that you want to grant on a flow.
     * 
     * @param entitlements
     *        The entitlements that you want to grant on a flow.
     */

    public void setEntitlements(java.util.Collection<GrantEntitlementRequest> entitlements) {
        if (entitlements == null) {
            this.entitlements = null;
            return;
        }

        this.entitlements = new java.util.ArrayList<GrantEntitlementRequest>(entitlements);
    }

    /**
     * The entitlements that you want to grant on a flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        The entitlements that you want to grant on a flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withEntitlements(GrantEntitlementRequest... entitlements) {
        if (this.entitlements == null) {
            setEntitlements(new java.util.ArrayList<GrantEntitlementRequest>(entitlements.length));
        }
        for (GrantEntitlementRequest ele : entitlements) {
            this.entitlements.add(ele);
        }
        return this;
    }

    /**
     * The entitlements that you want to grant on a flow.
     * 
     * @param entitlements
     *        The entitlements that you want to grant on a flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withEntitlements(java.util.Collection<GrantEntitlementRequest> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * The media streams that you want to add to the flow. You can associate these media streams with sources and
     * outputs on the flow.
     * 
     * @return The media streams that you want to add to the flow. You can associate these media streams with sources
     *         and outputs on the flow.
     */

    public java.util.List<AddMediaStreamRequest> getMediaStreams() {
        return mediaStreams;
    }

    /**
     * The media streams that you want to add to the flow. You can associate these media streams with sources and
     * outputs on the flow.
     * 
     * @param mediaStreams
     *        The media streams that you want to add to the flow. You can associate these media streams with sources and
     *        outputs on the flow.
     */

    public void setMediaStreams(java.util.Collection<AddMediaStreamRequest> mediaStreams) {
        if (mediaStreams == null) {
            this.mediaStreams = null;
            return;
        }

        this.mediaStreams = new java.util.ArrayList<AddMediaStreamRequest>(mediaStreams);
    }

    /**
     * The media streams that you want to add to the flow. You can associate these media streams with sources and
     * outputs on the flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMediaStreams(java.util.Collection)} or {@link #withMediaStreams(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mediaStreams
     *        The media streams that you want to add to the flow. You can associate these media streams with sources and
     *        outputs on the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withMediaStreams(AddMediaStreamRequest... mediaStreams) {
        if (this.mediaStreams == null) {
            setMediaStreams(new java.util.ArrayList<AddMediaStreamRequest>(mediaStreams.length));
        }
        for (AddMediaStreamRequest ele : mediaStreams) {
            this.mediaStreams.add(ele);
        }
        return this;
    }

    /**
     * The media streams that you want to add to the flow. You can associate these media streams with sources and
     * outputs on the flow.
     * 
     * @param mediaStreams
     *        The media streams that you want to add to the flow. You can associate these media streams with sources and
     *        outputs on the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withMediaStreams(java.util.Collection<AddMediaStreamRequest> mediaStreams) {
        setMediaStreams(mediaStreams);
        return this;
    }

    /**
     * The name of the flow.
     * 
     * @param name
     *        The name of the flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the flow.
     * 
     * @return The name of the flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the flow.
     * 
     * @param name
     *        The name of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The outputs that you want to add to this flow.
     * 
     * @return The outputs that you want to add to this flow.
     */

    public java.util.List<AddOutputRequest> getOutputs() {
        return outputs;
    }

    /**
     * The outputs that you want to add to this flow.
     * 
     * @param outputs
     *        The outputs that you want to add to this flow.
     */

    public void setOutputs(java.util.Collection<AddOutputRequest> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<AddOutputRequest>(outputs);
    }

    /**
     * The outputs that you want to add to this flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The outputs that you want to add to this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withOutputs(AddOutputRequest... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<AddOutputRequest>(outputs.length));
        }
        for (AddOutputRequest ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * The outputs that you want to add to this flow.
     * 
     * @param outputs
     *        The outputs that you want to add to this flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withOutputs(java.util.Collection<AddOutputRequest> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * @param source
     */

    public void setSource(SetSourceRequest source) {
        this.source = source;
    }

    /**
     * @return
     */

    public SetSourceRequest getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withSource(SetSourceRequest source) {
        setSource(source);
        return this;
    }

    /**
     * @param sourceFailoverConfig
     */

    public void setSourceFailoverConfig(FailoverConfig sourceFailoverConfig) {
        this.sourceFailoverConfig = sourceFailoverConfig;
    }

    /**
     * @return
     */

    public FailoverConfig getSourceFailoverConfig() {
        return this.sourceFailoverConfig;
    }

    /**
     * @param sourceFailoverConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withSourceFailoverConfig(FailoverConfig sourceFailoverConfig) {
        setSourceFailoverConfig(sourceFailoverConfig);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<SetSourceRequest> getSources() {
        return sources;
    }

    /**
     * @param sources
     */

    public void setSources(java.util.Collection<SetSourceRequest> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<SetSourceRequest>(sources);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withSources(SetSourceRequest... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<SetSourceRequest>(sources.length));
        }
        for (SetSourceRequest ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * @param sources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withSources(java.util.Collection<SetSourceRequest> sources) {
        setSources(sources);
        return this;
    }

    /**
     * The VPC interfaces you want on the flow.
     * 
     * @return The VPC interfaces you want on the flow.
     */

    public java.util.List<VpcInterfaceRequest> getVpcInterfaces() {
        return vpcInterfaces;
    }

    /**
     * The VPC interfaces you want on the flow.
     * 
     * @param vpcInterfaces
     *        The VPC interfaces you want on the flow.
     */

    public void setVpcInterfaces(java.util.Collection<VpcInterfaceRequest> vpcInterfaces) {
        if (vpcInterfaces == null) {
            this.vpcInterfaces = null;
            return;
        }

        this.vpcInterfaces = new java.util.ArrayList<VpcInterfaceRequest>(vpcInterfaces);
    }

    /**
     * The VPC interfaces you want on the flow.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcInterfaces(java.util.Collection)} or {@link #withVpcInterfaces(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpcInterfaces
     *        The VPC interfaces you want on the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withVpcInterfaces(VpcInterfaceRequest... vpcInterfaces) {
        if (this.vpcInterfaces == null) {
            setVpcInterfaces(new java.util.ArrayList<VpcInterfaceRequest>(vpcInterfaces.length));
        }
        for (VpcInterfaceRequest ele : vpcInterfaces) {
            this.vpcInterfaces.add(ele);
        }
        return this;
    }

    /**
     * The VPC interfaces you want on the flow.
     * 
     * @param vpcInterfaces
     *        The VPC interfaces you want on the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFlowRequest withVpcInterfaces(java.util.Collection<VpcInterfaceRequest> vpcInterfaces) {
        setVpcInterfaces(vpcInterfaces);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
        if (getMediaStreams() != null)
            sb.append("MediaStreams: ").append(getMediaStreams()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSourceFailoverConfig() != null)
            sb.append("SourceFailoverConfig: ").append(getSourceFailoverConfig()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources()).append(",");
        if (getVpcInterfaces() != null)
            sb.append("VpcInterfaces: ").append(getVpcInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFlowRequest == false)
            return false;
        CreateFlowRequest other = (CreateFlowRequest) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
            return false;
        if (other.getMediaStreams() == null ^ this.getMediaStreams() == null)
            return false;
        if (other.getMediaStreams() != null && other.getMediaStreams().equals(this.getMediaStreams()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSourceFailoverConfig() == null ^ this.getSourceFailoverConfig() == null)
            return false;
        if (other.getSourceFailoverConfig() != null && other.getSourceFailoverConfig().equals(this.getSourceFailoverConfig()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getVpcInterfaces() == null ^ this.getVpcInterfaces() == null)
            return false;
        if (other.getVpcInterfaces() != null && other.getVpcInterfaces().equals(this.getVpcInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getMediaStreams() == null) ? 0 : getMediaStreams().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSourceFailoverConfig() == null) ? 0 : getSourceFailoverConfig().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode + ((getVpcInterfaces() == null) ? 0 : getVpcInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public CreateFlowRequest clone() {
        return (CreateFlowRequest) super.clone();
    }

}
