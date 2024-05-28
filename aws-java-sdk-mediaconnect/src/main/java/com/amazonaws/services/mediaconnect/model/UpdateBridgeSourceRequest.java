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
 * The fields that you want to update in the bridge source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBridgeSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the bridge that you want to update. */
    private String bridgeArn;

    private UpdateBridgeFlowSourceRequest flowSource;

    private UpdateBridgeNetworkSourceRequest networkSource;
    /** The name of the source that you want to update. */
    private String sourceName;

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @param bridgeArn
     *        The ARN of the bridge that you want to update.
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @return The ARN of the bridge that you want to update.
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * The ARN of the bridge that you want to update.
     * 
     * @param bridgeArn
     *        The ARN of the bridge that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeSourceRequest withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * @param flowSource
     */

    public void setFlowSource(UpdateBridgeFlowSourceRequest flowSource) {
        this.flowSource = flowSource;
    }

    /**
     * @return
     */

    public UpdateBridgeFlowSourceRequest getFlowSource() {
        return this.flowSource;
    }

    /**
     * @param flowSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeSourceRequest withFlowSource(UpdateBridgeFlowSourceRequest flowSource) {
        setFlowSource(flowSource);
        return this;
    }

    /**
     * @param networkSource
     */

    public void setNetworkSource(UpdateBridgeNetworkSourceRequest networkSource) {
        this.networkSource = networkSource;
    }

    /**
     * @return
     */

    public UpdateBridgeNetworkSourceRequest getNetworkSource() {
        return this.networkSource;
    }

    /**
     * @param networkSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeSourceRequest withNetworkSource(UpdateBridgeNetworkSourceRequest networkSource) {
        setNetworkSource(networkSource);
        return this;
    }

    /**
     * The name of the source that you want to update.
     * 
     * @param sourceName
     *        The name of the source that you want to update.
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * The name of the source that you want to update.
     * 
     * @return The name of the source that you want to update.
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * The name of the source that you want to update.
     * 
     * @param sourceName
     *        The name of the source that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeSourceRequest withSourceName(String sourceName) {
        setSourceName(sourceName);
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
        if (getFlowSource() != null)
            sb.append("FlowSource: ").append(getFlowSource()).append(",");
        if (getNetworkSource() != null)
            sb.append("NetworkSource: ").append(getNetworkSource()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBridgeSourceRequest == false)
            return false;
        UpdateBridgeSourceRequest other = (UpdateBridgeSourceRequest) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
            return false;
        if (other.getFlowSource() == null ^ this.getFlowSource() == null)
            return false;
        if (other.getFlowSource() != null && other.getFlowSource().equals(this.getFlowSource()) == false)
            return false;
        if (other.getNetworkSource() == null ^ this.getNetworkSource() == null)
            return false;
        if (other.getNetworkSource() != null && other.getNetworkSource().equals(this.getNetworkSource()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getFlowSource() == null) ? 0 : getFlowSource().hashCode());
        hashCode = prime * hashCode + ((getNetworkSource() == null) ? 0 : getNetworkSource().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBridgeSourceRequest clone() {
        return (UpdateBridgeSourceRequest) super.clone();
    }

}
