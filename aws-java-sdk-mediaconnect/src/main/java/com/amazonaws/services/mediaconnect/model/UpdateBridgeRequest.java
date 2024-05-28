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
 * A request to update the bridge.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridge" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBridgeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The Amazon Resource Number (ARN) of the bridge that you want to update. */
    private String bridgeArn;

    private UpdateEgressGatewayBridgeRequest egressGatewayBridge;

    private UpdateIngressGatewayBridgeRequest ingressGatewayBridge;

    private UpdateFailoverConfig sourceFailoverConfig;

    /**
     * The Amazon Resource Number (ARN) of the bridge that you want to update.
     * 
     * @param bridgeArn
     *        The Amazon Resource Number (ARN) of the bridge that you want to update.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the bridge that you want to update.
     * 
     * @return The Amazon Resource Number (ARN) of the bridge that you want to update.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The Amazon Resource Number (ARN) of the bridge that you want to update.
     * 
     * @param bridgeArn
     *        The Amazon Resource Number (ARN) of the bridge that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeRequest withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * @param egressGatewayBridge
     */

    public void setEgressGatewayBridge(UpdateEgressGatewayBridgeRequest egressGatewayBridge) {
        this.egressGatewayBridge = egressGatewayBridge;
    }

    /**
     * @return
     */

    public UpdateEgressGatewayBridgeRequest getEgressGatewayBridge() {
        return this.egressGatewayBridge;
    }

    /**
     * @param egressGatewayBridge
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeRequest withEgressGatewayBridge(UpdateEgressGatewayBridgeRequest egressGatewayBridge) {
        setEgressGatewayBridge(egressGatewayBridge);
        return this;
    }

    /**
     * @param ingressGatewayBridge
     */

    public void setIngressGatewayBridge(UpdateIngressGatewayBridgeRequest ingressGatewayBridge) {
        this.ingressGatewayBridge = ingressGatewayBridge;
    }

    /**
     * @return
     */

    public UpdateIngressGatewayBridgeRequest getIngressGatewayBridge() {
        return this.ingressGatewayBridge;
    }

    /**
     * @param ingressGatewayBridge
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeRequest withIngressGatewayBridge(UpdateIngressGatewayBridgeRequest ingressGatewayBridge) {
        setIngressGatewayBridge(ingressGatewayBridge);
        return this;
    }

    /**
     * @param sourceFailoverConfig
     */

    public void setSourceFailoverConfig(UpdateFailoverConfig sourceFailoverConfig) {
        this.sourceFailoverConfig = sourceFailoverConfig;
    }

    /**
     * @return
     */

    public UpdateFailoverConfig getSourceFailoverConfig() {
        return this.sourceFailoverConfig;
    }

    /**
     * @param sourceFailoverConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeRequest withSourceFailoverConfig(UpdateFailoverConfig sourceFailoverConfig) {
        setSourceFailoverConfig(sourceFailoverConfig);
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
        if (getEgressGatewayBridge() != null)
            sb.append("EgressGatewayBridge: ").append(getEgressGatewayBridge()).append(",");
        if (getIngressGatewayBridge() != null)
            sb.append("IngressGatewayBridge: ").append(getIngressGatewayBridge()).append(",");
        if (getSourceFailoverConfig() != null)
            sb.append("SourceFailoverConfig: ").append(getSourceFailoverConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBridgeRequest == false)
            return false;
        UpdateBridgeRequest other = (UpdateBridgeRequest) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
            return false;
        if (other.getEgressGatewayBridge() == null ^ this.getEgressGatewayBridge() == null)
            return false;
        if (other.getEgressGatewayBridge() != null && other.getEgressGatewayBridge().equals(this.getEgressGatewayBridge()) == false)
            return false;
        if (other.getIngressGatewayBridge() == null ^ this.getIngressGatewayBridge() == null)
            return false;
        if (other.getIngressGatewayBridge() != null && other.getIngressGatewayBridge().equals(this.getIngressGatewayBridge()) == false)
            return false;
        if (other.getSourceFailoverConfig() == null ^ this.getSourceFailoverConfig() == null)
            return false;
        if (other.getSourceFailoverConfig() != null && other.getSourceFailoverConfig().equals(this.getSourceFailoverConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getEgressGatewayBridge() == null) ? 0 : getEgressGatewayBridge().hashCode());
        hashCode = prime * hashCode + ((getIngressGatewayBridge() == null) ? 0 : getIngressGatewayBridge().hashCode());
        hashCode = prime * hashCode + ((getSourceFailoverConfig() == null) ? 0 : getSourceFailoverConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBridgeRequest clone() {
        return (UpdateBridgeRequest) super.clone();
    }

}
