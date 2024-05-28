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
 * An object representing the Source Network to recover.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartSourceNetworkRecoveryRequestNetworkEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSourceNetworkRecoveryRequestNetworkEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * CloudFormation stack name to be used for recovering the network.
     * </p>
     */
    private String cfnStackName;
    /**
     * <p>
     * The ID of the Source Network you want to recover.
     * </p>
     */
    private String sourceNetworkID;

    /**
     * <p>
     * CloudFormation stack name to be used for recovering the network.
     * </p>
     * 
     * @param cfnStackName
     *        CloudFormation stack name to be used for recovering the network.
     */

    public void setCfnStackName(String cfnStackName) {
        this.cfnStackName = cfnStackName;
    }

    /**
     * <p>
     * CloudFormation stack name to be used for recovering the network.
     * </p>
     * 
     * @return CloudFormation stack name to be used for recovering the network.
     */

    public String getCfnStackName() {
        return this.cfnStackName;
    }

    /**
     * <p>
     * CloudFormation stack name to be used for recovering the network.
     * </p>
     * 
     * @param cfnStackName
     *        CloudFormation stack name to be used for recovering the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSourceNetworkRecoveryRequestNetworkEntry withCfnStackName(String cfnStackName) {
        setCfnStackName(cfnStackName);
        return this;
    }

    /**
     * <p>
     * The ID of the Source Network you want to recover.
     * </p>
     * 
     * @param sourceNetworkID
     *        The ID of the Source Network you want to recover.
     */

    public void setSourceNetworkID(String sourceNetworkID) {
        this.sourceNetworkID = sourceNetworkID;
    }

    /**
     * <p>
     * The ID of the Source Network you want to recover.
     * </p>
     * 
     * @return The ID of the Source Network you want to recover.
     */

    public String getSourceNetworkID() {
        return this.sourceNetworkID;
    }

    /**
     * <p>
     * The ID of the Source Network you want to recover.
     * </p>
     * 
     * @param sourceNetworkID
     *        The ID of the Source Network you want to recover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSourceNetworkRecoveryRequestNetworkEntry withSourceNetworkID(String sourceNetworkID) {
        setSourceNetworkID(sourceNetworkID);
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
        if (getCfnStackName() != null)
            sb.append("CfnStackName: ").append("***Sensitive Data Redacted***").append(",");
        if (getSourceNetworkID() != null)
            sb.append("SourceNetworkID: ").append(getSourceNetworkID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSourceNetworkRecoveryRequestNetworkEntry == false)
            return false;
        StartSourceNetworkRecoveryRequestNetworkEntry other = (StartSourceNetworkRecoveryRequestNetworkEntry) obj;
        if (other.getCfnStackName() == null ^ this.getCfnStackName() == null)
            return false;
        if (other.getCfnStackName() != null && other.getCfnStackName().equals(this.getCfnStackName()) == false)
            return false;
        if (other.getSourceNetworkID() == null ^ this.getSourceNetworkID() == null)
            return false;
        if (other.getSourceNetworkID() != null && other.getSourceNetworkID().equals(this.getSourceNetworkID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCfnStackName() == null) ? 0 : getCfnStackName().hashCode());
        hashCode = prime * hashCode + ((getSourceNetworkID() == null) ? 0 : getSourceNetworkID().hashCode());
        return hashCode;
    }

    @Override
    public StartSourceNetworkRecoveryRequestNetworkEntry clone() {
        try {
            return (StartSourceNetworkRecoveryRequestNetworkEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.StartSourceNetworkRecoveryRequestNetworkEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
