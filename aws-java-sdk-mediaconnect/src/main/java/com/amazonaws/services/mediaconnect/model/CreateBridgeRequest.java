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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates a new bridge. The request must include one source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/CreateBridge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBridgeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Create a bridge with the egress bridge type. An egress bridge is a cloud-to-ground bridge. The content comes from
     * an existing MediaConnect flow and is delivered to your premises.
     */
    private AddEgressGatewayBridgeRequest egressGatewayBridge;
    /**
     * Create a bridge with the ingress bridge type. An ingress bridge is a ground-to-cloud bridge. The content
     * originates at your premises and is delivered to the cloud.
     */
    private AddIngressGatewayBridgeRequest ingressGatewayBridge;
    /** The name of the bridge. This name can not be modified after the bridge is created. */
    private String name;
    /** The outputs that you want to add to this bridge. */
    private java.util.List<AddBridgeOutputRequest> outputs;
    /** The bridge placement Amazon Resource Number (ARN). */
    private String placementArn;
    /** The settings for source failover. */
    private FailoverConfig sourceFailoverConfig;
    /** The sources that you want to add to this bridge. */
    private java.util.List<AddBridgeSourceRequest> sources;

    /**
     * Create a bridge with the egress bridge type. An egress bridge is a cloud-to-ground bridge. The content comes from
     * an existing MediaConnect flow and is delivered to your premises.
     * 
     * @param egressGatewayBridge
     *        Create a bridge with the egress bridge type. An egress bridge is a cloud-to-ground bridge. The content
     *        comes from an existing MediaConnect flow and is delivered to your premises.
     */

    public void setEgressGatewayBridge(AddEgressGatewayBridgeRequest egressGatewayBridge) {
        this.egressGatewayBridge = egressGatewayBridge;
    }

    /**
     * Create a bridge with the egress bridge type. An egress bridge is a cloud-to-ground bridge. The content comes from
     * an existing MediaConnect flow and is delivered to your premises.
     * 
     * @return Create a bridge with the egress bridge type. An egress bridge is a cloud-to-ground bridge. The content
     *         comes from an existing MediaConnect flow and is delivered to your premises.
     */

    public AddEgressGatewayBridgeRequest getEgressGatewayBridge() {
        return this.egressGatewayBridge;
    }

    /**
     * Create a bridge with the egress bridge type. An egress bridge is a cloud-to-ground bridge. The content comes from
     * an existing MediaConnect flow and is delivered to your premises.
     * 
     * @param egressGatewayBridge
     *        Create a bridge with the egress bridge type. An egress bridge is a cloud-to-ground bridge. The content
     *        comes from an existing MediaConnect flow and is delivered to your premises.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withEgressGatewayBridge(AddEgressGatewayBridgeRequest egressGatewayBridge) {
        setEgressGatewayBridge(egressGatewayBridge);
        return this;
    }

    /**
     * Create a bridge with the ingress bridge type. An ingress bridge is a ground-to-cloud bridge. The content
     * originates at your premises and is delivered to the cloud.
     * 
     * @param ingressGatewayBridge
     *        Create a bridge with the ingress bridge type. An ingress bridge is a ground-to-cloud bridge. The content
     *        originates at your premises and is delivered to the cloud.
     */

    public void setIngressGatewayBridge(AddIngressGatewayBridgeRequest ingressGatewayBridge) {
        this.ingressGatewayBridge = ingressGatewayBridge;
    }

    /**
     * Create a bridge with the ingress bridge type. An ingress bridge is a ground-to-cloud bridge. The content
     * originates at your premises and is delivered to the cloud.
     * 
     * @return Create a bridge with the ingress bridge type. An ingress bridge is a ground-to-cloud bridge. The content
     *         originates at your premises and is delivered to the cloud.
     */

    public AddIngressGatewayBridgeRequest getIngressGatewayBridge() {
        return this.ingressGatewayBridge;
    }

    /**
     * Create a bridge with the ingress bridge type. An ingress bridge is a ground-to-cloud bridge. The content
     * originates at your premises and is delivered to the cloud.
     * 
     * @param ingressGatewayBridge
     *        Create a bridge with the ingress bridge type. An ingress bridge is a ground-to-cloud bridge. The content
     *        originates at your premises and is delivered to the cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withIngressGatewayBridge(AddIngressGatewayBridgeRequest ingressGatewayBridge) {
        setIngressGatewayBridge(ingressGatewayBridge);
        return this;
    }

    /**
     * The name of the bridge. This name can not be modified after the bridge is created.
     * 
     * @param name
     *        The name of the bridge. This name can not be modified after the bridge is created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the bridge. This name can not be modified after the bridge is created.
     * 
     * @return The name of the bridge. This name can not be modified after the bridge is created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the bridge. This name can not be modified after the bridge is created.
     * 
     * @param name
     *        The name of the bridge. This name can not be modified after the bridge is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The outputs that you want to add to this bridge.
     * 
     * @return The outputs that you want to add to this bridge.
     */

    public java.util.List<AddBridgeOutputRequest> getOutputs() {
        return outputs;
    }

    /**
     * The outputs that you want to add to this bridge.
     * 
     * @param outputs
     *        The outputs that you want to add to this bridge.
     */

    public void setOutputs(java.util.Collection<AddBridgeOutputRequest> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<AddBridgeOutputRequest>(outputs);
    }

    /**
     * The outputs that you want to add to this bridge.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The outputs that you want to add to this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withOutputs(AddBridgeOutputRequest... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<AddBridgeOutputRequest>(outputs.length));
        }
        for (AddBridgeOutputRequest ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * The outputs that you want to add to this bridge.
     * 
     * @param outputs
     *        The outputs that you want to add to this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withOutputs(java.util.Collection<AddBridgeOutputRequest> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * The bridge placement Amazon Resource Number (ARN).
     * 
     * @param placementArn
     *        The bridge placement Amazon Resource Number (ARN).
     */

    public void setPlacementArn(String placementArn) {
        this.placementArn = placementArn;
    }

    /**
     * The bridge placement Amazon Resource Number (ARN).
     * 
     * @return The bridge placement Amazon Resource Number (ARN).
     */

    public String getPlacementArn() {
        return this.placementArn;
    }

    /**
     * The bridge placement Amazon Resource Number (ARN).
     * 
     * @param placementArn
     *        The bridge placement Amazon Resource Number (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withPlacementArn(String placementArn) {
        setPlacementArn(placementArn);
        return this;
    }

    /**
     * The settings for source failover.
     * 
     * @param sourceFailoverConfig
     *        The settings for source failover.
     */

    public void setSourceFailoverConfig(FailoverConfig sourceFailoverConfig) {
        this.sourceFailoverConfig = sourceFailoverConfig;
    }

    /**
     * The settings for source failover.
     * 
     * @return The settings for source failover.
     */

    public FailoverConfig getSourceFailoverConfig() {
        return this.sourceFailoverConfig;
    }

    /**
     * The settings for source failover.
     * 
     * @param sourceFailoverConfig
     *        The settings for source failover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withSourceFailoverConfig(FailoverConfig sourceFailoverConfig) {
        setSourceFailoverConfig(sourceFailoverConfig);
        return this;
    }

    /**
     * The sources that you want to add to this bridge.
     * 
     * @return The sources that you want to add to this bridge.
     */

    public java.util.List<AddBridgeSourceRequest> getSources() {
        return sources;
    }

    /**
     * The sources that you want to add to this bridge.
     * 
     * @param sources
     *        The sources that you want to add to this bridge.
     */

    public void setSources(java.util.Collection<AddBridgeSourceRequest> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<AddBridgeSourceRequest>(sources);
    }

    /**
     * The sources that you want to add to this bridge.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The sources that you want to add to this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withSources(AddBridgeSourceRequest... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<AddBridgeSourceRequest>(sources.length));
        }
        for (AddBridgeSourceRequest ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * The sources that you want to add to this bridge.
     * 
     * @param sources
     *        The sources that you want to add to this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBridgeRequest withSources(java.util.Collection<AddBridgeSourceRequest> sources) {
        setSources(sources);
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
        if (getEgressGatewayBridge() != null)
            sb.append("EgressGatewayBridge: ").append(getEgressGatewayBridge()).append(",");
        if (getIngressGatewayBridge() != null)
            sb.append("IngressGatewayBridge: ").append(getIngressGatewayBridge()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getPlacementArn() != null)
            sb.append("PlacementArn: ").append(getPlacementArn()).append(",");
        if (getSourceFailoverConfig() != null)
            sb.append("SourceFailoverConfig: ").append(getSourceFailoverConfig()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBridgeRequest == false)
            return false;
        CreateBridgeRequest other = (CreateBridgeRequest) obj;
        if (other.getEgressGatewayBridge() == null ^ this.getEgressGatewayBridge() == null)
            return false;
        if (other.getEgressGatewayBridge() != null && other.getEgressGatewayBridge().equals(this.getEgressGatewayBridge()) == false)
            return false;
        if (other.getIngressGatewayBridge() == null ^ this.getIngressGatewayBridge() == null)
            return false;
        if (other.getIngressGatewayBridge() != null && other.getIngressGatewayBridge().equals(this.getIngressGatewayBridge()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getPlacementArn() == null ^ this.getPlacementArn() == null)
            return false;
        if (other.getPlacementArn() != null && other.getPlacementArn().equals(this.getPlacementArn()) == false)
            return false;
        if (other.getSourceFailoverConfig() == null ^ this.getSourceFailoverConfig() == null)
            return false;
        if (other.getSourceFailoverConfig() != null && other.getSourceFailoverConfig().equals(this.getSourceFailoverConfig()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressGatewayBridge() == null) ? 0 : getEgressGatewayBridge().hashCode());
        hashCode = prime * hashCode + ((getIngressGatewayBridge() == null) ? 0 : getIngressGatewayBridge().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getPlacementArn() == null) ? 0 : getPlacementArn().hashCode());
        hashCode = prime * hashCode + ((getSourceFailoverConfig() == null) ? 0 : getSourceFailoverConfig().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public CreateBridgeRequest clone() {
        return (CreateBridgeRequest) super.clone();
    }

}
