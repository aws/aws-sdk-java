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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveBridgeOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveBridgeOutputResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String bridgeArn;

    private String outputName;

    /**
     * @param bridgeArn
     */

    public void setBridgeArn(String bridgeArn) {
        this.bridgeArn = bridgeArn;
    }

    /**
     * @return
     */

    public String getBridgeArn() {
        return this.bridgeArn;
    }

    /**
     * @param bridgeArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveBridgeOutputResult withBridgeArn(String bridgeArn) {
        setBridgeArn(bridgeArn);
        return this;
    }

    /**
     * @param outputName
     */

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    /**
     * @return
     */

    public String getOutputName() {
        return this.outputName;
    }

    /**
     * @param outputName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveBridgeOutputResult withOutputName(String outputName) {
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

        if (obj instanceof RemoveBridgeOutputResult == false)
            return false;
        RemoveBridgeOutputResult other = (RemoveBridgeOutputResult) obj;
        if (other.getBridgeArn() == null ^ this.getBridgeArn() == null)
            return false;
        if (other.getBridgeArn() != null && other.getBridgeArn().equals(this.getBridgeArn()) == false)
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
        hashCode = prime * hashCode + ((getOutputName() == null) ? 0 : getOutputName().hashCode());
        return hashCode;
    }

    @Override
    public RemoveBridgeOutputResult clone() {
        try {
            return (RemoveBridgeOutputResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
