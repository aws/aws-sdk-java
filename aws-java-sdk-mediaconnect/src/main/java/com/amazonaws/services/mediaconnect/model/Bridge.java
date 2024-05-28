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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A Bridge is the connection between your datacenter's Instances and the AWS cloud. A bridge can be used to send video
 * from the AWS cloud to your datacenter or from your datacenter to the AWS cloud.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Bridge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bridge implements Serializable, Cloneable, StructuredPojo {

    /** The Amazon Resource Number (ARN) of the bridge. */
    private String bridgeArn;

    private java.util.List<MessageDetail> bridgeMessages;

    private String bridgeState;

    private EgressGatewayBridge egressGatewayBridge;

    private IngressGatewayBridge ingressGatewayBridge;
    /** The name of the bridge. */
    private String name;
    /** The outputs on this bridge. */
    private java.util.List<BridgeOutput> outputs;
    /** The placement Amazon Resource Number (ARN) of the bridge. */
    private String placementArn;

    private FailoverConfig sourceFailoverConfig;
    /** The sources on this bridge. */
    private java.util.List<BridgeSource> sources;

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @param bridgeArn
     *        The Amazon Resource Number (ARN) of the bridge.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @return The Amazon Resource Number (ARN) of the bridge.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the bridge.
     * 
     * @param bridgeArn
     *        The Amazon Resource Number (ARN) of the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<MessageDetail> getBridgeMessages() {
        return bridgeMessages;
    }

    /**
     * @param bridgeMessages
     */

    public void setBridgeMessages(java.util.Collection<MessageDetail> bridgeMessages) {
        if (bridgeMessages == null) {
            this.bridgeMessages = null;
            return;
        }

        this.bridgeMessages = new java.util.ArrayList<MessageDetail>(bridgeMessages);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBridgeMessages(java.util.Collection)} or {@link #withBridgeMessages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param bridgeMessages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withBridgeMessages(MessageDetail... bridgeMessages) {
        if (this.bridgeMessages == null) {
            setBridgeMessages(new java.util.ArrayList<MessageDetail>(bridgeMessages.length));
        }
        for (MessageDetail ele : bridgeMessages) {
            this.bridgeMessages.add(ele);
        }
        return this;
    }

    /**
     * @param bridgeMessages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withBridgeMessages(java.util.Collection<MessageDetail> bridgeMessages) {
        setBridgeMessages(bridgeMessages);
        return this;
    }

    /**
     * @param bridgeState
     * @see BridgeState
     */

    public void setBridgeState(String bridgeState) {
        this.bridgeState = bridgeState;
    }

    /**
     * @return
     * @see BridgeState
     */

    public String getBridgeState() {
        return this.bridgeState;
    }

    /**
     * @param bridgeState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BridgeState
     */

    public Bridge withBridgeState(String bridgeState) {
        setBridgeState(bridgeState);
        return this;
    }

    /**
     * @param bridgeState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BridgeState
     */

    public Bridge withBridgeState(BridgeState bridgeState) {
        this.bridgeState = bridgeState.toString();
        return this;
    }

    /**
     * @param egressGatewayBridge
     */

    public void setEgressGatewayBridge(EgressGatewayBridge egressGatewayBridge) {
        this.egressGatewayBridge = egressGatewayBridge;
    }

    /**
     * @return
     */

    public EgressGatewayBridge getEgressGatewayBridge() {
        return this.egressGatewayBridge;
    }

    /**
     * @param egressGatewayBridge
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withEgressGatewayBridge(EgressGatewayBridge egressGatewayBridge) {
        setEgressGatewayBridge(egressGatewayBridge);
        return this;
    }

    /**
     * @param ingressGatewayBridge
     */

    public void setIngressGatewayBridge(IngressGatewayBridge ingressGatewayBridge) {
        this.ingressGatewayBridge = ingressGatewayBridge;
    }

    /**
     * @return
     */

    public IngressGatewayBridge getIngressGatewayBridge() {
        return this.ingressGatewayBridge;
    }

    /**
     * @param ingressGatewayBridge
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withIngressGatewayBridge(IngressGatewayBridge ingressGatewayBridge) {
        setIngressGatewayBridge(ingressGatewayBridge);
        return this;
    }

    /**
     * The name of the bridge.
     * 
     * @param name
     *        The name of the bridge.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the bridge.
     * 
     * @return The name of the bridge.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the bridge.
     * 
     * @param name
     *        The name of the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The outputs on this bridge.
     * 
     * @return The outputs on this bridge.
     */

    public java.util.List<BridgeOutput> getOutputs() {
        return outputs;
    }

    /**
     * The outputs on this bridge.
     * 
     * @param outputs
     *        The outputs on this bridge.
     */

    public void setOutputs(java.util.Collection<BridgeOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<BridgeOutput>(outputs);
    }

    /**
     * The outputs on this bridge.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The outputs on this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withOutputs(BridgeOutput... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<BridgeOutput>(outputs.length));
        }
        for (BridgeOutput ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * The outputs on this bridge.
     * 
     * @param outputs
     *        The outputs on this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withOutputs(java.util.Collection<BridgeOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * The placement Amazon Resource Number (ARN) of the bridge.
     * 
     * @param placementArn
     *        The placement Amazon Resource Number (ARN) of the bridge.
     */

    public void setPlacementArn(String placementArn) {
        this.placementArn = placementArn;
    }

    /**
     * The placement Amazon Resource Number (ARN) of the bridge.
     * 
     * @return The placement Amazon Resource Number (ARN) of the bridge.
     */

    public String getPlacementArn() {
        return this.placementArn;
    }

    /**
     * The placement Amazon Resource Number (ARN) of the bridge.
     * 
     * @param placementArn
     *        The placement Amazon Resource Number (ARN) of the bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withPlacementArn(String placementArn) {
        setPlacementArn(placementArn);
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

    public Bridge withSourceFailoverConfig(FailoverConfig sourceFailoverConfig) {
        setSourceFailoverConfig(sourceFailoverConfig);
        return this;
    }

    /**
     * The sources on this bridge.
     * 
     * @return The sources on this bridge.
     */

    public java.util.List<BridgeSource> getSources() {
        return sources;
    }

    /**
     * The sources on this bridge.
     * 
     * @param sources
     *        The sources on this bridge.
     */

    public void setSources(java.util.Collection<BridgeSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<BridgeSource>(sources);
    }

    /**
     * The sources on this bridge.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The sources on this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withSources(BridgeSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<BridgeSource>(sources.length));
        }
        for (BridgeSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * The sources on this bridge.
     * 
     * @param sources
     *        The sources on this bridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bridge withSources(java.util.Collection<BridgeSource> sources) {
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
        if (getBridgeArn() != null)
            sb.append("BridgeArn: ").append(getBridgeArn()).append(",");
        if (getBridgeMessages() != null)
            sb.append("BridgeMessages: ").append(getBridgeMessages()).append(",");
        if (getBridgeState() != null)
            sb.append("BridgeState: ").append(getBridgeState()).append(",");
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

        if (obj instanceof Bridge == false)
            return false;
        Bridge other = (Bridge) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
            return false;
        if (other.getBridgeMessages() == null ^ this.getBridgeMessages() == null)
            return false;
        if (other.getBridgeMessages() != null && other.getBridgeMessages().equals(this.getBridgeMessages()) == false)
            return false;
        if (other.getBridgeState() == null ^ this.getBridgeState() == null)
            return false;
        if (other.getBridgeState() != null && other.getBridgeState().equals(this.getBridgeState()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getBridgeMessages() == null) ? 0 : getBridgeMessages().hashCode());
        hashCode = prime * hashCode + ((getBridgeState() == null) ? 0 : getBridgeState().hashCode());
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
    public Bridge clone() {
        try {
            return (Bridge) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.BridgeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
