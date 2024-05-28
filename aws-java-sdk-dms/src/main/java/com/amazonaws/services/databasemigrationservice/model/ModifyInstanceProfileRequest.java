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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyInstanceProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the instance profile. Identifiers must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     */
    private String instanceProfileIdentifier;
    /**
     * <p>
     * The Availability Zone where the instance profile runs.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that is used to encrypt the connection parameters for the instance
     * profile.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyArn</code> parameter, then DMS uses your default encryption key.
     * </p>
     * <p>
     * KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has
     * a different default encryption key for each Amazon Web Services Region.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an instance
     * profile with a public IP address. A value of <code>false</code> represents an instance profile with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * Specifies the network type for the instance profile. A value of <code>IPV4</code> represents an instance profile
     * with IPv4 network type and only supports IPv4 addressing. A value of <code>IPV6</code> represents an instance
     * profile with IPv6 network type and only supports IPv6 addressing. A value of <code>DUAL</code> represents an
     * instance profile with dual network type that supports IPv4 and IPv6 addressing.
     * </p>
     */
    private String networkType;
    /**
     * <p>
     * A user-friendly name for the instance profile.
     * </p>
     */
    private String instanceProfileName;
    /**
     * <p>
     * A user-friendly description for the instance profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A subnet group to associate with the instance profile.
     * </p>
     */
    private String subnetGroupIdentifier;
    /**
     * <p>
     * Specifies the VPC security groups to be used with the instance profile. The VPC security group must work with the
     * VPC containing the instance profile.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroups;

    /**
     * <p>
     * The identifier of the instance profile. Identifiers must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @param instanceProfileIdentifier
     *        The identifier of the instance profile. Identifiers must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */

    public void setInstanceProfileIdentifier(String instanceProfileIdentifier) {
        this.instanceProfileIdentifier = instanceProfileIdentifier;
    }

    /**
     * <p>
     * The identifier of the instance profile. Identifiers must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @return The identifier of the instance profile. Identifiers must begin with a letter and must contain only ASCII
     *         letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */

    public String getInstanceProfileIdentifier() {
        return this.instanceProfileIdentifier;
    }

    /**
     * <p>
     * The identifier of the instance profile. Identifiers must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @param instanceProfileIdentifier
     *        The identifier of the instance profile. Identifiers must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withInstanceProfileIdentifier(String instanceProfileIdentifier) {
        setInstanceProfileIdentifier(instanceProfileIdentifier);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the instance profile runs.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the instance profile runs.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the instance profile runs.
     * </p>
     * 
     * @return The Availability Zone where the instance profile runs.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the instance profile runs.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the instance profile runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that is used to encrypt the connection parameters for the instance
     * profile.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyArn</code> parameter, then DMS uses your default encryption key.
     * </p>
     * <p>
     * KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has
     * a different default encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key that is used to encrypt the connection parameters for the
     *        instance profile.</p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyArn</code> parameter, then DMS uses your default
     *        encryption key.
     *        </p>
     *        <p>
     *        KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default encryption key for each Amazon Web Services Region.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that is used to encrypt the connection parameters for the instance
     * profile.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyArn</code> parameter, then DMS uses your default encryption key.
     * </p>
     * <p>
     * KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has
     * a different default encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key that is used to encrypt the connection parameters for the
     *         instance profile.</p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyArn</code> parameter, then DMS uses your default
     *         encryption key.
     *         </p>
     *         <p>
     *         KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services
     *         account has a different default encryption key for each Amazon Web Services Region.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key that is used to encrypt the connection parameters for the instance
     * profile.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyArn</code> parameter, then DMS uses your default encryption key.
     * </p>
     * <p>
     * KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services account has
     * a different default encryption key for each Amazon Web Services Region.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key that is used to encrypt the connection parameters for the
     *        instance profile.</p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyArn</code> parameter, then DMS uses your default
     *        encryption key.
     *        </p>
     *        <p>
     *        KMS creates the default encryption key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default encryption key for each Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an instance
     * profile with a public IP address. A value of <code>false</code> represents an instance profile with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an
     *        instance profile with a public IP address. A value of <code>false</code> represents an instance profile
     *        with a private IP address. The default value is <code>true</code>.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an instance
     * profile with a public IP address. A value of <code>false</code> represents an instance profile with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an
     *         instance profile with a public IP address. A value of <code>false</code> represents an instance profile
     *         with a private IP address. The default value is <code>true</code>.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an instance
     * profile with a public IP address. A value of <code>false</code> represents an instance profile with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an
     *        instance profile with a public IP address. A value of <code>false</code> represents an instance profile
     *        with a private IP address. The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an instance
     * profile with a public IP address. A value of <code>false</code> represents an instance profile with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the instance profile. A value of <code>true</code> represents an
     *         instance profile with a public IP address. A value of <code>false</code> represents an instance profile
     *         with a private IP address. The default value is <code>true</code>.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the network type for the instance profile. A value of <code>IPV4</code> represents an instance profile
     * with IPv4 network type and only supports IPv4 addressing. A value of <code>IPV6</code> represents an instance
     * profile with IPv6 network type and only supports IPv6 addressing. A value of <code>DUAL</code> represents an
     * instance profile with dual network type that supports IPv4 and IPv6 addressing.
     * </p>
     * 
     * @param networkType
     *        Specifies the network type for the instance profile. A value of <code>IPV4</code> represents an instance
     *        profile with IPv4 network type and only supports IPv4 addressing. A value of <code>IPV6</code> represents
     *        an instance profile with IPv6 network type and only supports IPv6 addressing. A value of <code>DUAL</code>
     *        represents an instance profile with dual network type that supports IPv4 and IPv6 addressing.
     */

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * Specifies the network type for the instance profile. A value of <code>IPV4</code> represents an instance profile
     * with IPv4 network type and only supports IPv4 addressing. A value of <code>IPV6</code> represents an instance
     * profile with IPv6 network type and only supports IPv6 addressing. A value of <code>DUAL</code> represents an
     * instance profile with dual network type that supports IPv4 and IPv6 addressing.
     * </p>
     * 
     * @return Specifies the network type for the instance profile. A value of <code>IPV4</code> represents an instance
     *         profile with IPv4 network type and only supports IPv4 addressing. A value of <code>IPV6</code> represents
     *         an instance profile with IPv6 network type and only supports IPv6 addressing. A value of
     *         <code>DUAL</code> represents an instance profile with dual network type that supports IPv4 and IPv6
     *         addressing.
     */

    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * <p>
     * Specifies the network type for the instance profile. A value of <code>IPV4</code> represents an instance profile
     * with IPv4 network type and only supports IPv4 addressing. A value of <code>IPV6</code> represents an instance
     * profile with IPv6 network type and only supports IPv6 addressing. A value of <code>DUAL</code> represents an
     * instance profile with dual network type that supports IPv4 and IPv6 addressing.
     * </p>
     * 
     * @param networkType
     *        Specifies the network type for the instance profile. A value of <code>IPV4</code> represents an instance
     *        profile with IPv4 network type and only supports IPv4 addressing. A value of <code>IPV6</code> represents
     *        an instance profile with IPv6 network type and only supports IPv6 addressing. A value of <code>DUAL</code>
     *        represents an instance profile with dual network type that supports IPv4 and IPv6 addressing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the instance profile.
     * </p>
     * 
     * @param instanceProfileName
     *        A user-friendly name for the instance profile.
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * A user-friendly name for the instance profile.
     * </p>
     * 
     * @return A user-friendly name for the instance profile.
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * A user-friendly name for the instance profile.
     * </p>
     * 
     * @param instanceProfileName
     *        A user-friendly name for the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withInstanceProfileName(String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
        return this;
    }

    /**
     * <p>
     * A user-friendly description for the instance profile.
     * </p>
     * 
     * @param description
     *        A user-friendly description for the instance profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-friendly description for the instance profile.
     * </p>
     * 
     * @return A user-friendly description for the instance profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-friendly description for the instance profile.
     * </p>
     * 
     * @param description
     *        A user-friendly description for the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A subnet group to associate with the instance profile.
     * </p>
     * 
     * @param subnetGroupIdentifier
     *        A subnet group to associate with the instance profile.
     */

    public void setSubnetGroupIdentifier(String subnetGroupIdentifier) {
        this.subnetGroupIdentifier = subnetGroupIdentifier;
    }

    /**
     * <p>
     * A subnet group to associate with the instance profile.
     * </p>
     * 
     * @return A subnet group to associate with the instance profile.
     */

    public String getSubnetGroupIdentifier() {
        return this.subnetGroupIdentifier;
    }

    /**
     * <p>
     * A subnet group to associate with the instance profile.
     * </p>
     * 
     * @param subnetGroupIdentifier
     *        A subnet group to associate with the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withSubnetGroupIdentifier(String subnetGroupIdentifier) {
        setSubnetGroupIdentifier(subnetGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC security groups to be used with the instance profile. The VPC security group must work with the
     * VPC containing the instance profile.
     * </p>
     * 
     * @return Specifies the VPC security groups to be used with the instance profile. The VPC security group must work
     *         with the VPC containing the instance profile.
     */

    public java.util.List<String> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * Specifies the VPC security groups to be used with the instance profile. The VPC security group must work with the
     * VPC containing the instance profile.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Specifies the VPC security groups to be used with the instance profile. The VPC security group must work
     *        with the VPC containing the instance profile.
     */

    public void setVpcSecurityGroups(java.util.Collection<String> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<String>(vpcSecurityGroups);
    }

    /**
     * <p>
     * Specifies the VPC security groups to be used with the instance profile. The VPC security group must work with the
     * VPC containing the instance profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Specifies the VPC security groups to be used with the instance profile. The VPC security group must work
     *        with the VPC containing the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withVpcSecurityGroups(String... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new java.util.ArrayList<String>(vpcSecurityGroups.length));
        }
        for (String ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the VPC security groups to be used with the instance profile. The VPC security group must work with the
     * VPC containing the instance profile.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Specifies the VPC security groups to be used with the instance profile. The VPC security group must work
     *        with the VPC containing the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceProfileRequest withVpcSecurityGroups(java.util.Collection<String> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
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
        if (getInstanceProfileIdentifier() != null)
            sb.append("InstanceProfileIdentifier: ").append(getInstanceProfileIdentifier()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType()).append(",");
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: ").append(getInstanceProfileName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSubnetGroupIdentifier() != null)
            sb.append("SubnetGroupIdentifier: ").append(getSubnetGroupIdentifier()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceProfileRequest == false)
            return false;
        ModifyInstanceProfileRequest other = (ModifyInstanceProfileRequest) obj;
        if (other.getInstanceProfileIdentifier() == null ^ this.getInstanceProfileIdentifier() == null)
            return false;
        if (other.getInstanceProfileIdentifier() != null && other.getInstanceProfileIdentifier().equals(this.getInstanceProfileIdentifier()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSubnetGroupIdentifier() == null ^ this.getSubnetGroupIdentifier() == null)
            return false;
        if (other.getSubnetGroupIdentifier() != null && other.getSubnetGroupIdentifier().equals(this.getSubnetGroupIdentifier()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceProfileIdentifier() == null) ? 0 : getInstanceProfileIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupIdentifier() == null) ? 0 : getSubnetGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceProfileRequest clone() {
        return (ModifyInstanceProfileRequest) super.clone();
    }

}
