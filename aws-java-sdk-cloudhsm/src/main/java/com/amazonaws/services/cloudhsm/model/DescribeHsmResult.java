/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of the DescribeHsm action.
 * </p>
 */
public class DescribeHsmResult implements Serializable {

    /**
     * The ARN of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     */
    private String hsmArn;

    /**
     * The status of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED
     */
    private String status;

    /**
     * Contains additional information about the status of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String statusDetails;

    /**
     * The Availability Zone that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]*<br/>
     */
    private String availabilityZone;

    /**
     * The identifier of the elastic network interface (ENI) attached to the
     * HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>eni-[0-9a-f]{8}<br/>
     */
    private String eniId;

    /**
     * The IP address assigned to the HSM's ENI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     */
    private String eniIp;

    /**
     * The subscription type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     */
    private String subscriptionType;

    /**
     * The subscription start date.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     */
    private String subscriptionStartDate;

    /**
     * The subscription end date.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     */
    private String subscriptionEndDate;

    /**
     * The identifier of the VPC that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>vpc-[0-9a-f]{8}<br/>
     */
    private String vpcId;

    /**
     * The identifier of the subnet the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     */
    private String subnetId;

    /**
     * The ARN of the IAM role assigned to the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     */
    private String iamRoleArn;

    /**
     * The serial number of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,16}<br/>
     */
    private String serialNumber;

    /**
     * The name of the HSM vendor.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String vendorName;

    /**
     * The HSM model type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String hsmType;

    /**
     * The HSM software version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String softwareVersion;

    /**
     * The public SSH key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/= ._:\\@-]*<br/>
     */
    private String sshPublicKey;

    /**
     * The date and time the SSH key was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     */
    private String sshKeyLastUpdated;

    /**
     * The URI of the certificate server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     */
    private String serverCertUri;

    /**
     * The date and time the server certificate was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     */
    private String serverCertLastUpdated;

    /**
     * The list of partitions on the HSM.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> partitions;

    /**
     * The ARN of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the HSM.
     */
    public String getHsmArn() {
        return hsmArn;
    }
    
    /**
     * The ARN of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @param hsmArn The ARN of the HSM.
     */
    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }
    
    /**
     * The ARN of the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @param hsmArn The ARN of the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
        return this;
    }

    /**
     * The status of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED
     *
     * @return The status of the HSM.
     *
     * @see HsmStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED
     *
     * @param status The status of the HSM.
     *
     * @see HsmStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED
     *
     * @param status The status of the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see HsmStatus
     */
    public DescribeHsmResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED
     *
     * @param status The status of the HSM.
     *
     * @see HsmStatus
     */
    public void setStatus(HsmStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, RUNNING, UPDATING, SUSPENDED, TERMINATING, TERMINATED, DEGRADED
     *
     * @param status The status of the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see HsmStatus
     */
    public DescribeHsmResult withStatus(HsmStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Contains additional information about the status of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return Contains additional information about the status of the HSM.
     */
    public String getStatusDetails() {
        return statusDetails;
    }
    
    /**
     * Contains additional information about the status of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param statusDetails Contains additional information about the status of the HSM.
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }
    
    /**
     * Contains additional information about the status of the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param statusDetails Contains additional information about the status of the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * The Availability Zone that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]*<br/>
     *
     * @return The Availability Zone that the HSM is in.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]*<br/>
     *
     * @param availabilityZone The Availability Zone that the HSM is in.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone that the HSM is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9\-]*<br/>
     *
     * @param availabilityZone The Availability Zone that the HSM is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The identifier of the elastic network interface (ENI) attached to the
     * HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>eni-[0-9a-f]{8}<br/>
     *
     * @return The identifier of the elastic network interface (ENI) attached to the
     *         HSM.
     */
    public String getEniId() {
        return eniId;
    }
    
    /**
     * The identifier of the elastic network interface (ENI) attached to the
     * HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>eni-[0-9a-f]{8}<br/>
     *
     * @param eniId The identifier of the elastic network interface (ENI) attached to the
     *         HSM.
     */
    public void setEniId(String eniId) {
        this.eniId = eniId;
    }
    
    /**
     * The identifier of the elastic network interface (ENI) attached to the
     * HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>eni-[0-9a-f]{8}<br/>
     *
     * @param eniId The identifier of the elastic network interface (ENI) attached to the
     *         HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withEniId(String eniId) {
        this.eniId = eniId;
        return this;
    }

    /**
     * The IP address assigned to the HSM's ENI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @return The IP address assigned to the HSM's ENI.
     */
    public String getEniIp() {
        return eniIp;
    }
    
    /**
     * The IP address assigned to the HSM's ENI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param eniIp The IP address assigned to the HSM's ENI.
     */
    public void setEniIp(String eniIp) {
        this.eniIp = eniIp;
    }
    
    /**
     * The IP address assigned to the HSM's ENI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}<br/>
     *
     * @param eniIp The IP address assigned to the HSM's ENI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withEniIp(String eniIp) {
        this.eniIp = eniIp;
        return this;
    }

    /**
     * The subscription type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @return The subscription type.
     *
     * @see SubscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }
    
    /**
     * The subscription type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @param subscriptionType The subscription type.
     *
     * @see SubscriptionType
     */
    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }
    
    /**
     * The subscription type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @param subscriptionType The subscription type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SubscriptionType
     */
    public DescribeHsmResult withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * The subscription type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @param subscriptionType The subscription type.
     *
     * @see SubscriptionType
     */
    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
    }
    
    /**
     * The subscription type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PRODUCTION
     *
     * @param subscriptionType The subscription type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see SubscriptionType
     */
    public DescribeHsmResult withSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
        return this;
    }

    /**
     * The subscription start date.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @return The subscription start date.
     */
    public String getSubscriptionStartDate() {
        return subscriptionStartDate;
    }
    
    /**
     * The subscription start date.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param subscriptionStartDate The subscription start date.
     */
    public void setSubscriptionStartDate(String subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }
    
    /**
     * The subscription start date.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param subscriptionStartDate The subscription start date.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withSubscriptionStartDate(String subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
        return this;
    }

    /**
     * The subscription end date.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @return The subscription end date.
     */
    public String getSubscriptionEndDate() {
        return subscriptionEndDate;
    }
    
    /**
     * The subscription end date.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param subscriptionEndDate The subscription end date.
     */
    public void setSubscriptionEndDate(String subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }
    
    /**
     * The subscription end date.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param subscriptionEndDate The subscription end date.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withSubscriptionEndDate(String subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
        return this;
    }

    /**
     * The identifier of the VPC that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>vpc-[0-9a-f]{8}<br/>
     *
     * @return The identifier of the VPC that the HSM is in.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The identifier of the VPC that the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>vpc-[0-9a-f]{8}<br/>
     *
     * @param vpcId The identifier of the VPC that the HSM is in.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The identifier of the VPC that the HSM is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>vpc-[0-9a-f]{8}<br/>
     *
     * @param vpcId The identifier of the VPC that the HSM is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The identifier of the subnet the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @return The identifier of the subnet the HSM is in.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The identifier of the subnet the HSM is in.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @param subnetId The identifier of the subnet the HSM is in.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The identifier of the subnet the HSM is in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>subnet-[0-9a-f]{8}<br/>
     *
     * @param subnetId The identifier of the subnet the HSM is in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ARN of the IAM role assigned to the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @return The ARN of the IAM role assigned to the HSM.
     */
    public String getIamRoleArn() {
        return iamRoleArn;
    }
    
    /**
     * The ARN of the IAM role assigned to the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @param iamRoleArn The ARN of the IAM role assigned to the HSM.
     */
    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }
    
    /**
     * The ARN of the IAM role assigned to the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}<br/>
     *
     * @param iamRoleArn The ARN of the IAM role assigned to the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
        return this;
    }

    /**
     * The serial number of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,16}<br/>
     *
     * @return The serial number of the HSM.
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    
    /**
     * The serial number of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,16}<br/>
     *
     * @param serialNumber The serial number of the HSM.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * The serial number of the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d{1,16}<br/>
     *
     * @param serialNumber The serial number of the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * The name of the HSM vendor.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return The name of the HSM vendor.
     */
    public String getVendorName() {
        return vendorName;
    }
    
    /**
     * The name of the HSM vendor.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param vendorName The name of the HSM vendor.
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    
    /**
     * The name of the HSM vendor.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param vendorName The name of the HSM vendor.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }

    /**
     * The HSM model type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return The HSM model type.
     */
    public String getHsmType() {
        return hsmType;
    }
    
    /**
     * The HSM model type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param hsmType The HSM model type.
     */
    public void setHsmType(String hsmType) {
        this.hsmType = hsmType;
    }
    
    /**
     * The HSM model type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param hsmType The HSM model type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withHsmType(String hsmType) {
        this.hsmType = hsmType;
        return this;
    }

    /**
     * The HSM software version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return The HSM software version.
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }
    
    /**
     * The HSM software version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param softwareVersion The HSM software version.
     */
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
    
    /**
     * The HSM software version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param softwareVersion The HSM software version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    /**
     * The public SSH key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/= ._:\\@-]*<br/>
     *
     * @return The public SSH key.
     */
    public String getSshPublicKey() {
        return sshPublicKey;
    }
    
    /**
     * The public SSH key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/= ._:\\@-]*<br/>
     *
     * @param sshPublicKey The public SSH key.
     */
    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }
    
    /**
     * The public SSH key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/= ._:\\@-]*<br/>
     *
     * @param sshPublicKey The public SSH key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

    /**
     * The date and time the SSH key was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @return The date and time the SSH key was last updated.
     */
    public String getSshKeyLastUpdated() {
        return sshKeyLastUpdated;
    }
    
    /**
     * The date and time the SSH key was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param sshKeyLastUpdated The date and time the SSH key was last updated.
     */
    public void setSshKeyLastUpdated(String sshKeyLastUpdated) {
        this.sshKeyLastUpdated = sshKeyLastUpdated;
    }
    
    /**
     * The date and time the SSH key was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param sshKeyLastUpdated The date and time the SSH key was last updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withSshKeyLastUpdated(String sshKeyLastUpdated) {
        this.sshKeyLastUpdated = sshKeyLastUpdated;
        return this;
    }

    /**
     * The URI of the certificate server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @return The URI of the certificate server.
     */
    public String getServerCertUri() {
        return serverCertUri;
    }
    
    /**
     * The URI of the certificate server.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param serverCertUri The URI of the certificate server.
     */
    public void setServerCertUri(String serverCertUri) {
        this.serverCertUri = serverCertUri;
    }
    
    /**
     * The URI of the certificate server.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\w :+=./\\-]*<br/>
     *
     * @param serverCertUri The URI of the certificate server.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withServerCertUri(String serverCertUri) {
        this.serverCertUri = serverCertUri;
        return this;
    }

    /**
     * The date and time the server certificate was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @return The date and time the server certificate was last updated.
     */
    public String getServerCertLastUpdated() {
        return serverCertLastUpdated;
    }
    
    /**
     * The date and time the server certificate was last updated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param serverCertLastUpdated The date and time the server certificate was last updated.
     */
    public void setServerCertLastUpdated(String serverCertLastUpdated) {
        this.serverCertLastUpdated = serverCertLastUpdated;
    }
    
    /**
     * The date and time the server certificate was last updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\d*<br/>
     *
     * @param serverCertLastUpdated The date and time the server certificate was last updated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withServerCertLastUpdated(String serverCertLastUpdated) {
        this.serverCertLastUpdated = serverCertLastUpdated;
        return this;
    }

    /**
     * The list of partitions on the HSM.
     *
     * @return The list of partitions on the HSM.
     */
    public java.util.List<String> getPartitions() {
        if (partitions == null) {
              partitions = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              partitions.setAutoConstruct(true);
        }
        return partitions;
    }
    
    /**
     * The list of partitions on the HSM.
     *
     * @param partitions The list of partitions on the HSM.
     */
    public void setPartitions(java.util.Collection<String> partitions) {
        if (partitions == null) {
            this.partitions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> partitionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(partitions.size());
        partitionsCopy.addAll(partitions);
        this.partitions = partitionsCopy;
    }
    
    /**
     * The list of partitions on the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partitions The list of partitions on the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withPartitions(String... partitions) {
        if (getPartitions() == null) setPartitions(new java.util.ArrayList<String>(partitions.length));
        for (String value : partitions) {
            getPartitions().add(value);
        }
        return this;
    }
    
    /**
     * The list of partitions on the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param partitions The list of partitions on the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHsmResult withPartitions(java.util.Collection<String> partitions) {
        if (partitions == null) {
            this.partitions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> partitionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(partitions.size());
            partitionsCopy.addAll(partitions);
            this.partitions = partitionsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHsmArn() != null) sb.append("HsmArn: " + getHsmArn() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusDetails() != null) sb.append("StatusDetails: " + getStatusDetails() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getEniId() != null) sb.append("EniId: " + getEniId() + ",");
        if (getEniIp() != null) sb.append("EniIp: " + getEniIp() + ",");
        if (getSubscriptionType() != null) sb.append("SubscriptionType: " + getSubscriptionType() + ",");
        if (getSubscriptionStartDate() != null) sb.append("SubscriptionStartDate: " + getSubscriptionStartDate() + ",");
        if (getSubscriptionEndDate() != null) sb.append("SubscriptionEndDate: " + getSubscriptionEndDate() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getIamRoleArn() != null) sb.append("IamRoleArn: " + getIamRoleArn() + ",");
        if (getSerialNumber() != null) sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getVendorName() != null) sb.append("VendorName: " + getVendorName() + ",");
        if (getHsmType() != null) sb.append("HsmType: " + getHsmType() + ",");
        if (getSoftwareVersion() != null) sb.append("SoftwareVersion: " + getSoftwareVersion() + ",");
        if (getSshPublicKey() != null) sb.append("SshPublicKey: " + getSshPublicKey() + ",");
        if (getSshKeyLastUpdated() != null) sb.append("SshKeyLastUpdated: " + getSshKeyLastUpdated() + ",");
        if (getServerCertUri() != null) sb.append("ServerCertUri: " + getServerCertUri() + ",");
        if (getServerCertLastUpdated() != null) sb.append("ServerCertLastUpdated: " + getServerCertLastUpdated() + ",");
        if (getPartitions() != null) sb.append("Partitions: " + getPartitions() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeHsmResult == false) return false;
        DescribeHsmResult other = (DescribeHsmResult)obj;
        
        if (other.getHsmArn() == null ^ this.getHsmArn() == null) return false;
        if (other.getHsmArn() != null && other.getHsmArn().equals(this.getHsmArn()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null) return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getEniId() == null ^ this.getEniId() == null) return false;
        if (other.getEniId() != null && other.getEniId().equals(this.getEniId()) == false) return false; 
        if (other.getEniIp() == null ^ this.getEniIp() == null) return false;
        if (other.getEniIp() != null && other.getEniIp().equals(this.getEniIp()) == false) return false; 
        if (other.getSubscriptionType() == null ^ this.getSubscriptionType() == null) return false;
        if (other.getSubscriptionType() != null && other.getSubscriptionType().equals(this.getSubscriptionType()) == false) return false; 
        if (other.getSubscriptionStartDate() == null ^ this.getSubscriptionStartDate() == null) return false;
        if (other.getSubscriptionStartDate() != null && other.getSubscriptionStartDate().equals(this.getSubscriptionStartDate()) == false) return false; 
        if (other.getSubscriptionEndDate() == null ^ this.getSubscriptionEndDate() == null) return false;
        if (other.getSubscriptionEndDate() != null && other.getSubscriptionEndDate().equals(this.getSubscriptionEndDate()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null) return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false) return false; 
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null) return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false) return false; 
        if (other.getVendorName() == null ^ this.getVendorName() == null) return false;
        if (other.getVendorName() != null && other.getVendorName().equals(this.getVendorName()) == false) return false; 
        if (other.getHsmType() == null ^ this.getHsmType() == null) return false;
        if (other.getHsmType() != null && other.getHsmType().equals(this.getHsmType()) == false) return false; 
        if (other.getSoftwareVersion() == null ^ this.getSoftwareVersion() == null) return false;
        if (other.getSoftwareVersion() != null && other.getSoftwareVersion().equals(this.getSoftwareVersion()) == false) return false; 
        if (other.getSshPublicKey() == null ^ this.getSshPublicKey() == null) return false;
        if (other.getSshPublicKey() != null && other.getSshPublicKey().equals(this.getSshPublicKey()) == false) return false; 
        if (other.getSshKeyLastUpdated() == null ^ this.getSshKeyLastUpdated() == null) return false;
        if (other.getSshKeyLastUpdated() != null && other.getSshKeyLastUpdated().equals(this.getSshKeyLastUpdated()) == false) return false; 
        if (other.getServerCertUri() == null ^ this.getServerCertUri() == null) return false;
        if (other.getServerCertUri() != null && other.getServerCertUri().equals(this.getServerCertUri()) == false) return false; 
        if (other.getServerCertLastUpdated() == null ^ this.getServerCertLastUpdated() == null) return false;
        if (other.getServerCertLastUpdated() != null && other.getServerCertLastUpdated().equals(this.getServerCertLastUpdated()) == false) return false; 
        if (other.getPartitions() == null ^ this.getPartitions() == null) return false;
        if (other.getPartitions() != null && other.getPartitions().equals(this.getPartitions()) == false) return false; 
        return true;
    }
    
}
    