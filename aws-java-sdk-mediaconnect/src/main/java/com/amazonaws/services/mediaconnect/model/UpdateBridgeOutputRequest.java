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
 * The fields that you want to update in the bridge output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateBridgeOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBridgeOutputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the bridge that you want to update. */
    private String bridgeArn;

    private UpdateBridgeNetworkOutputRequest networkOutput;
    /** The name of the bridge output that you want to update. */
    private String outputName;

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

    public UpdateBridgeOutputRequest withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * @param networkOutput
     */

    public void setNetworkOutput(UpdateBridgeNetworkOutputRequest networkOutput) {
        this.networkOutput = networkOutput;
    }

    /**
     * @return
     */

    public UpdateBridgeNetworkOutputRequest getNetworkOutput() {
        return this.networkOutput;
    }

    /**
     * @param networkOutput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeOutputRequest withNetworkOutput(UpdateBridgeNetworkOutputRequest networkOutput) {
        setNetworkOutput(networkOutput);
        return this;
    }

    /**
     * The name of the bridge output that you want to update.
     * 
     * @param outputName
     *        The name of the bridge output that you want to update.
     */

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    /**
     * The name of the bridge output that you want to update.
     * 
     * @return The name of the bridge output that you want to update.
     */

    public String getOutputName() {
        return this.outputName;
    }

    /**
     * The name of the bridge output that you want to update.
     * 
     * @param outputName
     *        The name of the bridge output that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBridgeOutputRequest withOutputName(String outputName) {
        setOutputName(outputName);
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
        if (getNetworkOutput() != null)
            sb.append("NetworkOutput: ").append(getNetworkOutput()).append(",");
        if (getOutputName() != null)
            sb.append("OutputName: ").append(getOutputName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBridgeOutputRequest == false)
            return false;
        UpdateBridgeOutputRequest other = (UpdateBridgeOutputRequest) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
            return false;
        if (other.getNetworkOutput() == null ^ this.getNetworkOutput() == null)
            return false;
        if (other.getNetworkOutput() != null && other.getNetworkOutput().equals(this.getNetworkOutput()) == false)
            return false;
        if (other.getOutputName() == null ^ this.getOutputName() == null)
            return false;
        if (other.getOutputName() != null && other.getOutputName().equals(this.getOutputName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBridgeArn() == null) ? 0 : getBridgeArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkOutput() == null) ? 0 : getNetworkOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputName() == null) ? 0 : getOutputName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBridgeOutputRequest clone() {
        return (UpdateBridgeOutputRequest) super.clone();
    }

}
