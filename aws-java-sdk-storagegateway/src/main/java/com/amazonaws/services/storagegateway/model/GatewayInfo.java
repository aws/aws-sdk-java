/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a gateway object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/GatewayInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     */
    private String gatewayId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of gateways
     * for your account and region.
     * </p>
     */
    private String gatewayARN;
    /**
     * <p>
     * The type of the gateway.
     * </p>
     */
    private String gatewayType;
    /**
     * <p>
     * The state of the gateway.
     * </p>
     * <p>
     * Valid Values: DISABLED or ACTIVE
     * </p>
     */
    private String gatewayOperationalState;
    /**
     * <p>
     * The name of the gateway.
     * </p>
     */
    private String gatewayName;
    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     */
    private String ec2InstanceId;
    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     */
    private String ec2InstanceRegion;

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * 
     * @param gatewayId
     *        The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *        Amazon Resource Name (ARN), which you use as input for other operations.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * 
     * @return The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *         Amazon Resource Name (ARN), which you use as input for other operations.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon
     * Resource Name (ARN), which you use as input for other operations.
     * </p>
     * 
     * @param gatewayId
     *        The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway
     *        Amazon Resource Name (ARN), which you use as input for other operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayInfo withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of gateways
     * for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of
     *        gateways for your account and region.
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of gateways
     * for your account and region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of
     *         gateways for your account and region.
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of gateways
     * for your account and region.
     * </p>
     * 
     * @param gatewayARN
     *        The Amazon Resource Name (ARN) of the gateway. Use the <a>ListGateways</a> operation to return a list of
     *        gateways for your account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway.
     */

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @return The type of the gateway.
     */

    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * 
     * @param gatewayType
     *        The type of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayInfo withGatewayType(String gatewayType) {
        setGatewayType(gatewayType);
        return this;
    }

    /**
     * <p>
     * The state of the gateway.
     * </p>
     * <p>
     * Valid Values: DISABLED or ACTIVE
     * </p>
     * 
     * @param gatewayOperationalState
     *        The state of the gateway.</p>
     *        <p>
     *        Valid Values: DISABLED or ACTIVE
     */

    public void setGatewayOperationalState(String gatewayOperationalState) {
        this.gatewayOperationalState = gatewayOperationalState;
    }

    /**
     * <p>
     * The state of the gateway.
     * </p>
     * <p>
     * Valid Values: DISABLED or ACTIVE
     * </p>
     * 
     * @return The state of the gateway.</p>
     *         <p>
     *         Valid Values: DISABLED or ACTIVE
     */

    public String getGatewayOperationalState() {
        return this.gatewayOperationalState;
    }

    /**
     * <p>
     * The state of the gateway.
     * </p>
     * <p>
     * Valid Values: DISABLED or ACTIVE
     * </p>
     * 
     * @param gatewayOperationalState
     *        The state of the gateway.</p>
     *        <p>
     *        Valid Values: DISABLED or ACTIVE
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayInfo withGatewayOperationalState(String gatewayOperationalState) {
        setGatewayOperationalState(gatewayOperationalState);
        return this;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     * 
     * @param gatewayName
     *        The name of the gateway.
     */

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     * 
     * @return The name of the gateway.
     */

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * <p>
     * The name of the gateway.
     * </p>
     * 
     * @param gatewayName
     *        The name of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayInfo withGatewayName(String gatewayName) {
        setGatewayName(gatewayName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     * 
     * @param ec2InstanceId
     *        The ID of the Amazon EC2 instance that was used to launch the gateway.
     */

    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     * 
     * @return The ID of the Amazon EC2 instance that was used to launch the gateway.
     */

    public String getEc2InstanceId() {
        return this.ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     * 
     * @param ec2InstanceId
     *        The ID of the Amazon EC2 instance that was used to launch the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayInfo withEc2InstanceId(String ec2InstanceId) {
        setEc2InstanceId(ec2InstanceId);
        return this;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     * 
     * @param ec2InstanceRegion
     *        The AWS Region where the Amazon EC2 instance is located.
     */

    public void setEc2InstanceRegion(String ec2InstanceRegion) {
        this.ec2InstanceRegion = ec2InstanceRegion;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     * 
     * @return The AWS Region where the Amazon EC2 instance is located.
     */

    public String getEc2InstanceRegion() {
        return this.ec2InstanceRegion;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     * 
     * @param ec2InstanceRegion
     *        The AWS Region where the Amazon EC2 instance is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayInfo withEc2InstanceRegion(String ec2InstanceRegion) {
        setEc2InstanceRegion(ec2InstanceRegion);
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
        if (getGatewayId() != null)
            sb.append("GatewayId: ").append(getGatewayId()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getGatewayType() != null)
            sb.append("GatewayType: ").append(getGatewayType()).append(",");
        if (getGatewayOperationalState() != null)
            sb.append("GatewayOperationalState: ").append(getGatewayOperationalState()).append(",");
        if (getGatewayName() != null)
            sb.append("GatewayName: ").append(getGatewayName()).append(",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: ").append(getEc2InstanceId()).append(",");
        if (getEc2InstanceRegion() != null)
            sb.append("Ec2InstanceRegion: ").append(getEc2InstanceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayInfo == false)
            return false;
        GatewayInfo other = (GatewayInfo) obj;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getGatewayOperationalState() == null ^ this.getGatewayOperationalState() == null)
            return false;
        if (other.getGatewayOperationalState() != null && other.getGatewayOperationalState().equals(this.getGatewayOperationalState()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getEc2InstanceRegion() == null ^ this.getEc2InstanceRegion() == null)
            return false;
        if (other.getEc2InstanceRegion() != null && other.getEc2InstanceRegion().equals(this.getEc2InstanceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime * hashCode + ((getGatewayOperationalState() == null) ? 0 : getGatewayOperationalState().hashCode());
        hashCode = prime * hashCode + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceRegion() == null) ? 0 : getEc2InstanceRegion().hashCode());
        return hashCode;
    }

    @Override
    public GatewayInfo clone() {
        try {
            return (GatewayInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.GatewayInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
