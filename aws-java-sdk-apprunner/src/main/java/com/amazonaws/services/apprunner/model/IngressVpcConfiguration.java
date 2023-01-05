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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of your VPC and the associated VPC endpoint. The VPC endpoint is an Amazon Web Services PrivateLink
 * resource that allows access to your App Runner services from within an Amazon VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/IngressVpcConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngressVpcConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the VPC that is used for the VPC endpoint.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the VPC endpoint that your App Runner service connects to.
     * </p>
     */
    private String vpcEndpointId;

    /**
     * <p>
     * The ID of the VPC that is used for the VPC endpoint.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC that is used for the VPC endpoint.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC that is used for the VPC endpoint.
     * </p>
     * 
     * @return The ID of the VPC that is used for the VPC endpoint.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC that is used for the VPC endpoint.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC that is used for the VPC endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressVpcConfiguration withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC endpoint that your App Runner service connects to.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint that your App Runner service connects to.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint that your App Runner service connects to.
     * </p>
     * 
     * @return The ID of the VPC endpoint that your App Runner service connects to.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the VPC endpoint that your App Runner service connects to.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the VPC endpoint that your App Runner service connects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressVpcConfiguration withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngressVpcConfiguration == false)
            return false;
        IngressVpcConfiguration other = (IngressVpcConfiguration) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public IngressVpcConfiguration clone() {
        try {
            return (IngressVpcConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.IngressVpcConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
