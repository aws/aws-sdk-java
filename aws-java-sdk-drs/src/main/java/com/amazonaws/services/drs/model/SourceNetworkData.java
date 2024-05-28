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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of Source Network related to a job event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/SourceNetworkData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceNetworkData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Source Network ID.
     * </p>
     */
    private String sourceNetworkID;
    /**
     * <p>
     * VPC ID protected by the Source Network.
     * </p>
     */
    private String sourceVpc;
    /**
     * <p>
     * CloudFormation stack name that was deployed for recovering the Source Network.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * ID of the recovered VPC following Source Network recovery.
     * </p>
     */
    private String targetVpc;

    /**
     * <p>
     * Source Network ID.
     * </p>
     * 
     * @param sourceNetworkID
     *        Source Network ID.
     */

    public void setSourceNetworkID(String sourceNetworkID) {
        this.sourceNetworkID = sourceNetworkID;
    }

    /**
     * <p>
     * Source Network ID.
     * </p>
     * 
     * @return Source Network ID.
     */

    public String getSourceNetworkID() {
        return this.sourceNetworkID;
    }

    /**
     * <p>
     * Source Network ID.
     * </p>
     * 
     * @param sourceNetworkID
     *        Source Network ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetworkData withSourceNetworkID(String sourceNetworkID) {
        setSourceNetworkID(sourceNetworkID);
        return this;
    }

    /**
     * <p>
     * VPC ID protected by the Source Network.
     * </p>
     * 
     * @param sourceVpc
     *        VPC ID protected by the Source Network.
     */

    public void setSourceVpc(String sourceVpc) {
        this.sourceVpc = sourceVpc;
    }

    /**
     * <p>
     * VPC ID protected by the Source Network.
     * </p>
     * 
     * @return VPC ID protected by the Source Network.
     */

    public String getSourceVpc() {
        return this.sourceVpc;
    }

    /**
     * <p>
     * VPC ID protected by the Source Network.
     * </p>
     * 
     * @param sourceVpc
     *        VPC ID protected by the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetworkData withSourceVpc(String sourceVpc) {
        setSourceVpc(sourceVpc);
        return this;
    }

    /**
     * <p>
     * CloudFormation stack name that was deployed for recovering the Source Network.
     * </p>
     * 
     * @param stackName
     *        CloudFormation stack name that was deployed for recovering the Source Network.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * CloudFormation stack name that was deployed for recovering the Source Network.
     * </p>
     * 
     * @return CloudFormation stack name that was deployed for recovering the Source Network.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * CloudFormation stack name that was deployed for recovering the Source Network.
     * </p>
     * 
     * @param stackName
     *        CloudFormation stack name that was deployed for recovering the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetworkData withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * ID of the recovered VPC following Source Network recovery.
     * </p>
     * 
     * @param targetVpc
     *        ID of the recovered VPC following Source Network recovery.
     */

    public void setTargetVpc(String targetVpc) {
        this.targetVpc = targetVpc;
    }

    /**
     * <p>
     * ID of the recovered VPC following Source Network recovery.
     * </p>
     * 
     * @return ID of the recovered VPC following Source Network recovery.
     */

    public String getTargetVpc() {
        return this.targetVpc;
    }

    /**
     * <p>
     * ID of the recovered VPC following Source Network recovery.
     * </p>
     * 
     * @param targetVpc
     *        ID of the recovered VPC following Source Network recovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetworkData withTargetVpc(String targetVpc) {
        setTargetVpc(targetVpc);
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
        if (getSourceNetworkID() != null)
            sb.append("SourceNetworkID: ").append(getSourceNetworkID()).append(",");
        if (getSourceVpc() != null)
            sb.append("SourceVpc: ").append(getSourceVpc()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getTargetVpc() != null)
            sb.append("TargetVpc: ").append(getTargetVpc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceNetworkData == false)
            return false;
        SourceNetworkData other = (SourceNetworkData) obj;
        if (other.getSourceNetworkID() == null ^ this.getSourceNetworkID() == null)
            return false;
        if (other.getSourceNetworkID() != null && other.getSourceNetworkID().equals(this.getSourceNetworkID()) == false)
            return false;
        if (other.getSourceVpc() == null ^ this.getSourceVpc() == null)
            return false;
        if (other.getSourceVpc() != null && other.getSourceVpc().equals(this.getSourceVpc()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getTargetVpc() == null ^ this.getTargetVpc() == null)
            return false;
        if (other.getTargetVpc() != null && other.getTargetVpc().equals(this.getTargetVpc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceNetworkID() == null) ? 0 : getSourceNetworkID().hashCode());
        hashCode = prime * hashCode + ((getSourceVpc() == null) ? 0 : getSourceVpc().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getTargetVpc() == null) ? 0 : getTargetVpc().hashCode());
        return hashCode;
    }

    @Override
    public SourceNetworkData clone() {
        try {
            return (SourceNetworkData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.SourceNetworkDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
