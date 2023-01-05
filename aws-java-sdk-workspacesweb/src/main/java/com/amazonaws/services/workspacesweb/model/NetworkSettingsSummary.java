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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of network settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/NetworkSettingsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkSettingsSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     */
    private String networkSettingsArn;
    /**
     * <p>
     * The VPC ID of the network settings.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @param networkSettingsArn
     *        The ARN of the network settings.
     */

    public void setNetworkSettingsArn(String networkSettingsArn) {
        this.networkSettingsArn = networkSettingsArn;
    }

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @return The ARN of the network settings.
     */

    public String getNetworkSettingsArn() {
        return this.networkSettingsArn;
    }

    /**
     * <p>
     * The ARN of the network settings.
     * </p>
     * 
     * @param networkSettingsArn
     *        The ARN of the network settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettingsSummary withNetworkSettingsArn(String networkSettingsArn) {
        setNetworkSettingsArn(networkSettingsArn);
        return this;
    }

    /**
     * <p>
     * The VPC ID of the network settings.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the network settings.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID of the network settings.
     * </p>
     * 
     * @return The VPC ID of the network settings.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID of the network settings.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID of the network settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSettingsSummary withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getNetworkSettingsArn() != null)
            sb.append("NetworkSettingsArn: ").append(getNetworkSettingsArn()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkSettingsSummary == false)
            return false;
        NetworkSettingsSummary other = (NetworkSettingsSummary) obj;
        if (other.getNetworkSettingsArn() == null ^ this.getNetworkSettingsArn() == null)
            return false;
        if (other.getNetworkSettingsArn() != null && other.getNetworkSettingsArn().equals(this.getNetworkSettingsArn()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkSettingsArn() == null) ? 0 : getNetworkSettingsArn().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkSettingsSummary clone() {
        try {
            return (NetworkSettingsSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspacesweb.model.transform.NetworkSettingsSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
