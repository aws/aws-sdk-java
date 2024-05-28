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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetLicenseEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLicenseEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The DNS name.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * The license endpoint ID.
     * </p>
     */
    private String licenseEndpointId;
    /**
     * <p>
     * The security group IDs for the license endpoint.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message of the license endpoint.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The subnet IDs.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The DNS name.
     * </p>
     * 
     * @param dnsName
     *        The DNS name.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name.
     * </p>
     * 
     * @return The DNS name.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name.
     * </p>
     * 
     * @param dnsName
     *        The DNS name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseEndpointResult withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * The license endpoint ID.
     * </p>
     * 
     * @param licenseEndpointId
     *        The license endpoint ID.
     */

    public void setLicenseEndpointId(String licenseEndpointId) {
        this.licenseEndpointId = licenseEndpointId;
    }

    /**
     * <p>
     * The license endpoint ID.
     * </p>
     * 
     * @return The license endpoint ID.
     */

    public String getLicenseEndpointId() {
        return this.licenseEndpointId;
    }

    /**
     * <p>
     * The license endpoint ID.
     * </p>
     * 
     * @param licenseEndpointId
     *        The license endpoint ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseEndpointResult withLicenseEndpointId(String licenseEndpointId) {
        setLicenseEndpointId(licenseEndpointId);
        return this;
    }

    /**
     * <p>
     * The security group IDs for the license endpoint.
     * </p>
     * 
     * @return The security group IDs for the license endpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security group IDs for the license endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs for the license endpoint.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security group IDs for the license endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs for the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseEndpointResult withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group IDs for the license endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs for the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseEndpointResult withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     * 
     * @param status
     *        The status of the license endpoint.
     * @see LicenseEndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     * 
     * @return The status of the license endpoint.
     * @see LicenseEndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     * 
     * @param status
     *        The status of the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseEndpointStatus
     */

    public GetLicenseEndpointResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     * 
     * @param status
     *        The status of the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseEndpointStatus
     */

    public GetLicenseEndpointResult withStatus(LicenseEndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the license endpoint.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the license endpoint.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the license endpoint.
     * </p>
     * 
     * @return The status message of the license endpoint.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the license endpoint.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseEndpointResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The subnet IDs.
     * </p>
     * 
     * @return The subnet IDs.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The subnet IDs.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The subnet IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseEndpointResult withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnet IDs.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseEndpointResult withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     * </p>
     * 
     * @param vpcId
     *        The VCP(virtual private cloud) ID associated with the license endpoint.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     * </p>
     * 
     * @return The VCP(virtual private cloud) ID associated with the license endpoint.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     * </p>
     * 
     * @param vpcId
     *        The VCP(virtual private cloud) ID associated with the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLicenseEndpointResult withVpcId(String vpcId) {
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
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getLicenseEndpointId() != null)
            sb.append("LicenseEndpointId: ").append(getLicenseEndpointId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
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

        if (obj instanceof GetLicenseEndpointResult == false)
            return false;
        GetLicenseEndpointResult other = (GetLicenseEndpointResult) obj;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getLicenseEndpointId() == null ^ this.getLicenseEndpointId() == null)
            return false;
        if (other.getLicenseEndpointId() != null && other.getLicenseEndpointId().equals(this.getLicenseEndpointId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
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

        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getLicenseEndpointId() == null) ? 0 : getLicenseEndpointId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public GetLicenseEndpointResult clone() {
        try {
            return (GetLicenseEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
