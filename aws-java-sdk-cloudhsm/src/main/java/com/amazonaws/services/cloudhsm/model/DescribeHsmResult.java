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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of the <a>DescribeHsm</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeHsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHsmResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the HSM.
     * </p>
     */
    private String hsmArn;
    /**
     * <p>
     * The status of the HSM.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Contains additional information about the status of the HSM.
     * </p>
     */
    private String statusDetails;
    /**
     * <p>
     * The Availability Zone that the HSM is in.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The identifier of the elastic network interface (ENI) attached to the HSM.
     * </p>
     */
    private String eniId;
    /**
     * <p>
     * The IP address assigned to the HSM's ENI.
     * </p>
     */
    private String eniIp;

    private String subscriptionType;
    /**
     * <p>
     * The subscription start date.
     * </p>
     */
    private String subscriptionStartDate;
    /**
     * <p>
     * The subscription end date.
     * </p>
     */
    private String subscriptionEndDate;
    /**
     * <p>
     * The identifier of the VPC that the HSM is in.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The identifier of the subnet that the HSM is in.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The ARN of the IAM role assigned to the HSM.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The serial number of the HSM.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The name of the HSM vendor.
     * </p>
     */
    private String vendorName;
    /**
     * <p>
     * The HSM model type.
     * </p>
     */
    private String hsmType;
    /**
     * <p>
     * The HSM software version.
     * </p>
     */
    private String softwareVersion;
    /**
     * <p>
     * The public SSH key.
     * </p>
     */
    private String sshPublicKey;
    /**
     * <p>
     * The date and time that the SSH key was last updated.
     * </p>
     */
    private String sshKeyLastUpdated;
    /**
     * <p>
     * The URI of the certificate server.
     * </p>
     */
    private String serverCertUri;
    /**
     * <p>
     * The date and time that the server certificate was last updated.
     * </p>
     */
    private String serverCertLastUpdated;
    /**
     * <p>
     * The list of partitions on the HSM.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> partitions;

    /**
     * <p>
     * The ARN of the HSM.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM.
     */

    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM.
     * </p>
     * 
     * @return The ARN of the HSM.
     */

    public String getHsmArn() {
        return this.hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withHsmArn(String hsmArn) {
        setHsmArn(hsmArn);
        return this;
    }

    /**
     * <p>
     * The status of the HSM.
     * </p>
     * 
     * @param status
     *        The status of the HSM.
     * @see HsmStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the HSM.
     * </p>
     * 
     * @return The status of the HSM.
     * @see HsmStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the HSM.
     * </p>
     * 
     * @param status
     *        The status of the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HsmStatus
     */

    public DescribeHsmResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the HSM.
     * </p>
     * 
     * @param status
     *        The status of the HSM.
     * @see HsmStatus
     */

    public void setStatus(HsmStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the HSM.
     * </p>
     * 
     * @param status
     *        The status of the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HsmStatus
     */

    public DescribeHsmResult withStatus(HsmStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Contains additional information about the status of the HSM.
     * </p>
     * 
     * @param statusDetails
     *        Contains additional information about the status of the HSM.
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * Contains additional information about the status of the HSM.
     * </p>
     * 
     * @return Contains additional information about the status of the HSM.
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * Contains additional information about the status of the HSM.
     * </p>
     * 
     * @param statusDetails
     *        Contains additional information about the status of the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The Availability Zone that the HSM is in.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that the HSM is in.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the HSM is in.
     * </p>
     * 
     * @return The Availability Zone that the HSM is in.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the HSM is in.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that the HSM is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The identifier of the elastic network interface (ENI) attached to the HSM.
     * </p>
     * 
     * @param eniId
     *        The identifier of the elastic network interface (ENI) attached to the HSM.
     */

    public void setEniId(String eniId) {
        this.eniId = eniId;
    }

    /**
     * <p>
     * The identifier of the elastic network interface (ENI) attached to the HSM.
     * </p>
     * 
     * @return The identifier of the elastic network interface (ENI) attached to the HSM.
     */

    public String getEniId() {
        return this.eniId;
    }

    /**
     * <p>
     * The identifier of the elastic network interface (ENI) attached to the HSM.
     * </p>
     * 
     * @param eniId
     *        The identifier of the elastic network interface (ENI) attached to the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withEniId(String eniId) {
        setEniId(eniId);
        return this;
    }

    /**
     * <p>
     * The IP address assigned to the HSM's ENI.
     * </p>
     * 
     * @param eniIp
     *        The IP address assigned to the HSM's ENI.
     */

    public void setEniIp(String eniIp) {
        this.eniIp = eniIp;
    }

    /**
     * <p>
     * The IP address assigned to the HSM's ENI.
     * </p>
     * 
     * @return The IP address assigned to the HSM's ENI.
     */

    public String getEniIp() {
        return this.eniIp;
    }

    /**
     * <p>
     * The IP address assigned to the HSM's ENI.
     * </p>
     * 
     * @param eniIp
     *        The IP address assigned to the HSM's ENI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withEniIp(String eniIp) {
        setEniIp(eniIp);
        return this;
    }

    /**
     * @param subscriptionType
     * @see SubscriptionType
     */

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    /**
     * @return
     * @see SubscriptionType
     */

    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @param subscriptionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public DescribeHsmResult withSubscriptionType(String subscriptionType) {
        setSubscriptionType(subscriptionType);
        return this;
    }

    /**
     * @param subscriptionType
     * @see SubscriptionType
     */

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        withSubscriptionType(subscriptionType);
    }

    /**
     * @param subscriptionType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public DescribeHsmResult withSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
        return this;
    }

    /**
     * <p>
     * The subscription start date.
     * </p>
     * 
     * @param subscriptionStartDate
     *        The subscription start date.
     */

    public void setSubscriptionStartDate(String subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    /**
     * <p>
     * The subscription start date.
     * </p>
     * 
     * @return The subscription start date.
     */

    public String getSubscriptionStartDate() {
        return this.subscriptionStartDate;
    }

    /**
     * <p>
     * The subscription start date.
     * </p>
     * 
     * @param subscriptionStartDate
     *        The subscription start date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withSubscriptionStartDate(String subscriptionStartDate) {
        setSubscriptionStartDate(subscriptionStartDate);
        return this;
    }

    /**
     * <p>
     * The subscription end date.
     * </p>
     * 
     * @param subscriptionEndDate
     *        The subscription end date.
     */

    public void setSubscriptionEndDate(String subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }

    /**
     * <p>
     * The subscription end date.
     * </p>
     * 
     * @return The subscription end date.
     */

    public String getSubscriptionEndDate() {
        return this.subscriptionEndDate;
    }

    /**
     * <p>
     * The subscription end date.
     * </p>
     * 
     * @param subscriptionEndDate
     *        The subscription end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withSubscriptionEndDate(String subscriptionEndDate) {
        setSubscriptionEndDate(subscriptionEndDate);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC that the HSM is in.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the HSM is in.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the HSM is in.
     * </p>
     * 
     * @return The identifier of the VPC that the HSM is in.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the HSM is in.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the HSM is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet that the HSM is in.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet that the HSM is in.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that the HSM is in.
     * </p>
     * 
     * @return The identifier of the subnet that the HSM is in.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet that the HSM is in.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet that the HSM is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role assigned to the HSM.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role assigned to the HSM.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role assigned to the HSM.
     * </p>
     * 
     * @return The ARN of the IAM role assigned to the HSM.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role assigned to the HSM.
     * </p>
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role assigned to the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The serial number of the HSM.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the HSM.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number of the HSM.
     * </p>
     * 
     * @return The serial number of the HSM.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The serial number of the HSM.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The name of the HSM vendor.
     * </p>
     * 
     * @param vendorName
     *        The name of the HSM vendor.
     */

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * <p>
     * The name of the HSM vendor.
     * </p>
     * 
     * @return The name of the HSM vendor.
     */

    public String getVendorName() {
        return this.vendorName;
    }

    /**
     * <p>
     * The name of the HSM vendor.
     * </p>
     * 
     * @param vendorName
     *        The name of the HSM vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withVendorName(String vendorName) {
        setVendorName(vendorName);
        return this;
    }

    /**
     * <p>
     * The HSM model type.
     * </p>
     * 
     * @param hsmType
     *        The HSM model type.
     */

    public void setHsmType(String hsmType) {
        this.hsmType = hsmType;
    }

    /**
     * <p>
     * The HSM model type.
     * </p>
     * 
     * @return The HSM model type.
     */

    public String getHsmType() {
        return this.hsmType;
    }

    /**
     * <p>
     * The HSM model type.
     * </p>
     * 
     * @param hsmType
     *        The HSM model type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withHsmType(String hsmType) {
        setHsmType(hsmType);
        return this;
    }

    /**
     * <p>
     * The HSM software version.
     * </p>
     * 
     * @param softwareVersion
     *        The HSM software version.
     */

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    /**
     * <p>
     * The HSM software version.
     * </p>
     * 
     * @return The HSM software version.
     */

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    /**
     * <p>
     * The HSM software version.
     * </p>
     * 
     * @param softwareVersion
     *        The HSM software version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withSoftwareVersion(String softwareVersion) {
        setSoftwareVersion(softwareVersion);
        return this;
    }

    /**
     * <p>
     * The public SSH key.
     * </p>
     * 
     * @param sshPublicKey
     *        The public SSH key.
     */

    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * <p>
     * The public SSH key.
     * </p>
     * 
     * @return The public SSH key.
     */

    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * <p>
     * The public SSH key.
     * </p>
     * 
     * @param sshPublicKey
     *        The public SSH key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withSshPublicKey(String sshPublicKey) {
        setSshPublicKey(sshPublicKey);
        return this;
    }

    /**
     * <p>
     * The date and time that the SSH key was last updated.
     * </p>
     * 
     * @param sshKeyLastUpdated
     *        The date and time that the SSH key was last updated.
     */

    public void setSshKeyLastUpdated(String sshKeyLastUpdated) {
        this.sshKeyLastUpdated = sshKeyLastUpdated;
    }

    /**
     * <p>
     * The date and time that the SSH key was last updated.
     * </p>
     * 
     * @return The date and time that the SSH key was last updated.
     */

    public String getSshKeyLastUpdated() {
        return this.sshKeyLastUpdated;
    }

    /**
     * <p>
     * The date and time that the SSH key was last updated.
     * </p>
     * 
     * @param sshKeyLastUpdated
     *        The date and time that the SSH key was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withSshKeyLastUpdated(String sshKeyLastUpdated) {
        setSshKeyLastUpdated(sshKeyLastUpdated);
        return this;
    }

    /**
     * <p>
     * The URI of the certificate server.
     * </p>
     * 
     * @param serverCertUri
     *        The URI of the certificate server.
     */

    public void setServerCertUri(String serverCertUri) {
        this.serverCertUri = serverCertUri;
    }

    /**
     * <p>
     * The URI of the certificate server.
     * </p>
     * 
     * @return The URI of the certificate server.
     */

    public String getServerCertUri() {
        return this.serverCertUri;
    }

    /**
     * <p>
     * The URI of the certificate server.
     * </p>
     * 
     * @param serverCertUri
     *        The URI of the certificate server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withServerCertUri(String serverCertUri) {
        setServerCertUri(serverCertUri);
        return this;
    }

    /**
     * <p>
     * The date and time that the server certificate was last updated.
     * </p>
     * 
     * @param serverCertLastUpdated
     *        The date and time that the server certificate was last updated.
     */

    public void setServerCertLastUpdated(String serverCertLastUpdated) {
        this.serverCertLastUpdated = serverCertLastUpdated;
    }

    /**
     * <p>
     * The date and time that the server certificate was last updated.
     * </p>
     * 
     * @return The date and time that the server certificate was last updated.
     */

    public String getServerCertLastUpdated() {
        return this.serverCertLastUpdated;
    }

    /**
     * <p>
     * The date and time that the server certificate was last updated.
     * </p>
     * 
     * @param serverCertLastUpdated
     *        The date and time that the server certificate was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withServerCertLastUpdated(String serverCertLastUpdated) {
        setServerCertLastUpdated(serverCertLastUpdated);
        return this;
    }

    /**
     * <p>
     * The list of partitions on the HSM.
     * </p>
     * 
     * @return The list of partitions on the HSM.
     */

    public java.util.List<String> getPartitions() {
        if (partitions == null) {
            partitions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return partitions;
    }

    /**
     * <p>
     * The list of partitions on the HSM.
     * </p>
     * 
     * @param partitions
     *        The list of partitions on the HSM.
     */

    public void setPartitions(java.util.Collection<String> partitions) {
        if (partitions == null) {
            this.partitions = null;
            return;
        }

        this.partitions = new com.amazonaws.internal.SdkInternalList<String>(partitions);
    }

    /**
     * <p>
     * The list of partitions on the HSM.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitions(java.util.Collection)} or {@link #withPartitions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param partitions
     *        The list of partitions on the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withPartitions(String... partitions) {
        if (this.partitions == null) {
            setPartitions(new com.amazonaws.internal.SdkInternalList<String>(partitions.length));
        }
        for (String ele : partitions) {
            this.partitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of partitions on the HSM.
     * </p>
     * 
     * @param partitions
     *        The list of partitions on the HSM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHsmResult withPartitions(java.util.Collection<String> partitions) {
        setPartitions(partitions);
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
        if (getHsmArn() != null)
            sb.append("HsmArn: ").append(getHsmArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getEniId() != null)
            sb.append("EniId: ").append(getEniId()).append(",");
        if (getEniIp() != null)
            sb.append("EniIp: ").append(getEniIp()).append(",");
        if (getSubscriptionType() != null)
            sb.append("SubscriptionType: ").append(getSubscriptionType()).append(",");
        if (getSubscriptionStartDate() != null)
            sb.append("SubscriptionStartDate: ").append(getSubscriptionStartDate()).append(",");
        if (getSubscriptionEndDate() != null)
            sb.append("SubscriptionEndDate: ").append(getSubscriptionEndDate()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getVendorName() != null)
            sb.append("VendorName: ").append(getVendorName()).append(",");
        if (getHsmType() != null)
            sb.append("HsmType: ").append(getHsmType()).append(",");
        if (getSoftwareVersion() != null)
            sb.append("SoftwareVersion: ").append(getSoftwareVersion()).append(",");
        if (getSshPublicKey() != null)
            sb.append("SshPublicKey: ").append(getSshPublicKey()).append(",");
        if (getSshKeyLastUpdated() != null)
            sb.append("SshKeyLastUpdated: ").append(getSshKeyLastUpdated()).append(",");
        if (getServerCertUri() != null)
            sb.append("ServerCertUri: ").append(getServerCertUri()).append(",");
        if (getServerCertLastUpdated() != null)
            sb.append("ServerCertLastUpdated: ").append(getServerCertLastUpdated()).append(",");
        if (getPartitions() != null)
            sb.append("Partitions: ").append(getPartitions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHsmResult == false)
            return false;
        DescribeHsmResult other = (DescribeHsmResult) obj;
        if (other.getHsmArn() == null ^ this.getHsmArn() == null)
            return false;
        if (other.getHsmArn() != null && other.getHsmArn().equals(this.getHsmArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEniId() == null ^ this.getEniId() == null)
            return false;
        if (other.getEniId() != null && other.getEniId().equals(this.getEniId()) == false)
            return false;
        if (other.getEniIp() == null ^ this.getEniIp() == null)
            return false;
        if (other.getEniIp() != null && other.getEniIp().equals(this.getEniIp()) == false)
            return false;
        if (other.getSubscriptionType() == null ^ this.getSubscriptionType() == null)
            return false;
        if (other.getSubscriptionType() != null && other.getSubscriptionType().equals(this.getSubscriptionType()) == false)
            return false;
        if (other.getSubscriptionStartDate() == null ^ this.getSubscriptionStartDate() == null)
            return false;
        if (other.getSubscriptionStartDate() != null && other.getSubscriptionStartDate().equals(this.getSubscriptionStartDate()) == false)
            return false;
        if (other.getSubscriptionEndDate() == null ^ this.getSubscriptionEndDate() == null)
            return false;
        if (other.getSubscriptionEndDate() != null && other.getSubscriptionEndDate().equals(this.getSubscriptionEndDate()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getVendorName() == null ^ this.getVendorName() == null)
            return false;
        if (other.getVendorName() != null && other.getVendorName().equals(this.getVendorName()) == false)
            return false;
        if (other.getHsmType() == null ^ this.getHsmType() == null)
            return false;
        if (other.getHsmType() != null && other.getHsmType().equals(this.getHsmType()) == false)
            return false;
        if (other.getSoftwareVersion() == null ^ this.getSoftwareVersion() == null)
            return false;
        if (other.getSoftwareVersion() != null && other.getSoftwareVersion().equals(this.getSoftwareVersion()) == false)
            return false;
        if (other.getSshPublicKey() == null ^ this.getSshPublicKey() == null)
            return false;
        if (other.getSshPublicKey() != null && other.getSshPublicKey().equals(this.getSshPublicKey()) == false)
            return false;
        if (other.getSshKeyLastUpdated() == null ^ this.getSshKeyLastUpdated() == null)
            return false;
        if (other.getSshKeyLastUpdated() != null && other.getSshKeyLastUpdated().equals(this.getSshKeyLastUpdated()) == false)
            return false;
        if (other.getServerCertUri() == null ^ this.getServerCertUri() == null)
            return false;
        if (other.getServerCertUri() != null && other.getServerCertUri().equals(this.getServerCertUri()) == false)
            return false;
        if (other.getServerCertLastUpdated() == null ^ this.getServerCertLastUpdated() == null)
            return false;
        if (other.getServerCertLastUpdated() != null && other.getServerCertLastUpdated().equals(this.getServerCertLastUpdated()) == false)
            return false;
        if (other.getPartitions() == null ^ this.getPartitions() == null)
            return false;
        if (other.getPartitions() != null && other.getPartitions().equals(this.getPartitions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsmArn() == null) ? 0 : getHsmArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEniId() == null) ? 0 : getEniId().hashCode());
        hashCode = prime * hashCode + ((getEniIp() == null) ? 0 : getEniIp().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionType() == null) ? 0 : getSubscriptionType().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionStartDate() == null) ? 0 : getSubscriptionStartDate().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionEndDate() == null) ? 0 : getSubscriptionEndDate().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getVendorName() == null) ? 0 : getVendorName().hashCode());
        hashCode = prime * hashCode + ((getHsmType() == null) ? 0 : getHsmType().hashCode());
        hashCode = prime * hashCode + ((getSoftwareVersion() == null) ? 0 : getSoftwareVersion().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKey() == null) ? 0 : getSshPublicKey().hashCode());
        hashCode = prime * hashCode + ((getSshKeyLastUpdated() == null) ? 0 : getSshKeyLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getServerCertUri() == null) ? 0 : getServerCertUri().hashCode());
        hashCode = prime * hashCode + ((getServerCertLastUpdated() == null) ? 0 : getServerCertLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getPartitions() == null) ? 0 : getPartitions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHsmResult clone() {
        try {
            return (DescribeHsmResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
