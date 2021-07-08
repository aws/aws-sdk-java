/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the CreateRouteTable action in Amazon EC2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/EC2CreateRouteTableAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2CreateRouteTableAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the CreateRouteTable action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the ID of a VPC.
     * </p>
     */
    private ActionTarget vpcId;

    /**
     * <p>
     * A description of the CreateRouteTable action.
     * </p>
     * 
     * @param description
     *        A description of the CreateRouteTable action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the CreateRouteTable action.
     * </p>
     * 
     * @return A description of the CreateRouteTable action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the CreateRouteTable action.
     * </p>
     * 
     * @param description
     *        A description of the CreateRouteTable action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteTableAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the ID of a VPC.
     * </p>
     * 
     * @param vpcId
     *        Information about the ID of a VPC.
     */

    public void setVpcId(ActionTarget vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Information about the ID of a VPC.
     * </p>
     * 
     * @return Information about the ID of a VPC.
     */

    public ActionTarget getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Information about the ID of a VPC.
     * </p>
     * 
     * @param vpcId
     *        Information about the ID of a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2CreateRouteTableAction withVpcId(ActionTarget vpcId) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof EC2CreateRouteTableAction == false)
            return false;
        EC2CreateRouteTableAction other = (EC2CreateRouteTableAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public EC2CreateRouteTableAction clone() {
        try {
            return (EC2CreateRouteTableAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.EC2CreateRouteTableActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
