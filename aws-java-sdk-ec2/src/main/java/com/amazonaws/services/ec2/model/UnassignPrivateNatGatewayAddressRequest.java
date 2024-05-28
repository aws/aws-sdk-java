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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.UnassignPrivateNatGatewayAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnassignPrivateNatGatewayAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<UnassignPrivateNatGatewayAddressRequest> {

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     */
    private String natGatewayId;
    /**
     * <p>
     * The private IPv4 addresses you want to unassign.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> privateIpAddresses;
    /**
     * <p>
     * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections are
     * still in progress. Default value is 350 seconds.
     * </p>
     */
    private Integer maxDrainDurationSeconds;

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     */

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @return The ID of the NAT gateway.
     */

    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * 
     * @param natGatewayId
     *        The ID of the NAT gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnassignPrivateNatGatewayAddressRequest withNatGatewayId(String natGatewayId) {
        setNatGatewayId(natGatewayId);
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses you want to unassign.
     * </p>
     * 
     * @return The private IPv4 addresses you want to unassign.
     */

    public java.util.List<String> getPrivateIpAddresses() {
        if (privateIpAddresses == null) {
            privateIpAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return privateIpAddresses;
    }

    /**
     * <p>
     * The private IPv4 addresses you want to unassign.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses you want to unassign.
     */

    public void setPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new com.amazonaws.internal.SdkInternalList<String>(privateIpAddresses);
    }

    /**
     * <p>
     * The private IPv4 addresses you want to unassign.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses you want to unassign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnassignPrivateNatGatewayAddressRequest withPrivateIpAddresses(String... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new com.amazonaws.internal.SdkInternalList<String>(privateIpAddresses.length));
        }
        for (String ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses you want to unassign.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses you want to unassign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnassignPrivateNatGatewayAddressRequest withPrivateIpAddresses(java.util.Collection<String> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections are
     * still in progress. Default value is 350 seconds.
     * </p>
     * 
     * @param maxDrainDurationSeconds
     *        The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections
     *        are still in progress. Default value is 350 seconds.
     */

    public void setMaxDrainDurationSeconds(Integer maxDrainDurationSeconds) {
        this.maxDrainDurationSeconds = maxDrainDurationSeconds;
    }

    /**
     * <p>
     * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections are
     * still in progress. Default value is 350 seconds.
     * </p>
     * 
     * @return The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections
     *         are still in progress. Default value is 350 seconds.
     */

    public Integer getMaxDrainDurationSeconds() {
        return this.maxDrainDurationSeconds;
    }

    /**
     * <p>
     * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections are
     * still in progress. Default value is 350 seconds.
     * </p>
     * 
     * @param maxDrainDurationSeconds
     *        The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections
     *        are still in progress. Default value is 350 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnassignPrivateNatGatewayAddressRequest withMaxDrainDurationSeconds(Integer maxDrainDurationSeconds) {
        setMaxDrainDurationSeconds(maxDrainDurationSeconds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<UnassignPrivateNatGatewayAddressRequest> getDryRunRequest() {
        Request<UnassignPrivateNatGatewayAddressRequest> request = new UnassignPrivateNatGatewayAddressRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: ").append(getNatGatewayId()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses()).append(",");
        if (getMaxDrainDurationSeconds() != null)
            sb.append("MaxDrainDurationSeconds: ").append(getMaxDrainDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnassignPrivateNatGatewayAddressRequest == false)
            return false;
        UnassignPrivateNatGatewayAddressRequest other = (UnassignPrivateNatGatewayAddressRequest) obj;
        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getMaxDrainDurationSeconds() == null ^ this.getMaxDrainDurationSeconds() == null)
            return false;
        if (other.getMaxDrainDurationSeconds() != null && other.getMaxDrainDurationSeconds().equals(this.getMaxDrainDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getMaxDrainDurationSeconds() == null) ? 0 : getMaxDrainDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public UnassignPrivateNatGatewayAddressRequest clone() {
        return (UnassignPrivateNatGatewayAddressRequest) super.clone();
    }
}
