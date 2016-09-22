/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the EC2 instances in a cluster grouped by category. For example, key name, subnet ID, IAM
 * instance profile, and so on.
 * </p>
 */
public class Ec2InstanceAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named
     * "hadoop".
     * </p>
     */
    private String ec2KeyName;
    /**
     * <p>
     * To launch the job flow in Amazon VPC, set this parameter to the identifier of the Amazon VPC subnet where you
     * want the job flow to launch. If you do not specify this value, the job flow is launched in the normal AWS cloud,
     * outside of a VPC.
     * </p>
     * <p>
     * Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances. Thus, you
     * cannot specify the cc1.4xlarge instance type for nodes of a job flow launched in a VPC.
     * </p>
     */
    private String ec2SubnetId;
    /**
     * <p>
     * The Availability Zone in which the cluster will run.
     * </p>
     */
    private String ec2AvailabilityZone;
    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this
     * role.
     * </p>
     */
    private String iamInstanceProfile;
    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     */
    private String emrManagedMasterSecurityGroup;
    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the slave nodes.
     * </p>
     */
    private String emrManagedSlaveSecurityGroup;
    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private
     * subnets.
     * </p>
     */
    private String serviceAccessSecurityGroup;
    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> additionalMasterSecurityGroups;
    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> additionalSlaveSecurityGroups;

    /**
     * <p>
     * The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named
     * "hadoop".
     * </p>
     * 
     * @param ec2KeyName
     *        The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named
     *        "hadoop".
     */

    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    /**
     * <p>
     * The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named
     * "hadoop".
     * </p>
     * 
     * @return The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named
     *         "hadoop".
     */

    public String getEc2KeyName() {
        return this.ec2KeyName;
    }

    /**
     * <p>
     * The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named
     * "hadoop".
     * </p>
     * 
     * @param ec2KeyName
     *        The name of the Amazon EC2 key pair to use when connecting with SSH into the master node as a user named
     *        "hadoop".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withEc2KeyName(String ec2KeyName) {
        setEc2KeyName(ec2KeyName);
        return this;
    }

    /**
     * <p>
     * To launch the job flow in Amazon VPC, set this parameter to the identifier of the Amazon VPC subnet where you
     * want the job flow to launch. If you do not specify this value, the job flow is launched in the normal AWS cloud,
     * outside of a VPC.
     * </p>
     * <p>
     * Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances. Thus, you
     * cannot specify the cc1.4xlarge instance type for nodes of a job flow launched in a VPC.
     * </p>
     * 
     * @param ec2SubnetId
     *        To launch the job flow in Amazon VPC, set this parameter to the identifier of the Amazon VPC subnet where
     *        you want the job flow to launch. If you do not specify this value, the job flow is launched in the normal
     *        AWS cloud, outside of a VPC.</p>
     *        <p>
     *        Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances. Thus,
     *        you cannot specify the cc1.4xlarge instance type for nodes of a job flow launched in a VPC.
     */

    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }

    /**
     * <p>
     * To launch the job flow in Amazon VPC, set this parameter to the identifier of the Amazon VPC subnet where you
     * want the job flow to launch. If you do not specify this value, the job flow is launched in the normal AWS cloud,
     * outside of a VPC.
     * </p>
     * <p>
     * Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances. Thus, you
     * cannot specify the cc1.4xlarge instance type for nodes of a job flow launched in a VPC.
     * </p>
     * 
     * @return To launch the job flow in Amazon VPC, set this parameter to the identifier of the Amazon VPC subnet where
     *         you want the job flow to launch. If you do not specify this value, the job flow is launched in the normal
     *         AWS cloud, outside of a VPC.</p>
     *         <p>
     *         Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances.
     *         Thus, you cannot specify the cc1.4xlarge instance type for nodes of a job flow launched in a VPC.
     */

    public String getEc2SubnetId() {
        return this.ec2SubnetId;
    }

    /**
     * <p>
     * To launch the job flow in Amazon VPC, set this parameter to the identifier of the Amazon VPC subnet where you
     * want the job flow to launch. If you do not specify this value, the job flow is launched in the normal AWS cloud,
     * outside of a VPC.
     * </p>
     * <p>
     * Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances. Thus, you
     * cannot specify the cc1.4xlarge instance type for nodes of a job flow launched in a VPC.
     * </p>
     * 
     * @param ec2SubnetId
     *        To launch the job flow in Amazon VPC, set this parameter to the identifier of the Amazon VPC subnet where
     *        you want the job flow to launch. If you do not specify this value, the job flow is launched in the normal
     *        AWS cloud, outside of a VPC.</p>
     *        <p>
     *        Amazon VPC currently does not support cluster compute quadruple extra large (cc1.4xlarge) instances. Thus,
     *        you cannot specify the cc1.4xlarge instance type for nodes of a job flow launched in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withEc2SubnetId(String ec2SubnetId) {
        setEc2SubnetId(ec2SubnetId);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster will run.
     * </p>
     * 
     * @param ec2AvailabilityZone
     *        The Availability Zone in which the cluster will run.
     */

    public void setEc2AvailabilityZone(String ec2AvailabilityZone) {
        this.ec2AvailabilityZone = ec2AvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster will run.
     * </p>
     * 
     * @return The Availability Zone in which the cluster will run.
     */

    public String getEc2AvailabilityZone() {
        return this.ec2AvailabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the cluster will run.
     * </p>
     * 
     * @param ec2AvailabilityZone
     *        The Availability Zone in which the cluster will run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withEc2AvailabilityZone(String ec2AvailabilityZone) {
        setEc2AvailabilityZone(ec2AvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this
     * role.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume
     *        this role.
     */

    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this
     * role.
     * </p>
     * 
     * @return The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume
     *         this role.
     */

    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume this
     * role.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM role that was specified when the job flow was launched. The EC2 instances of the job flow assume
     *        this role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withIamInstanceProfile(String iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * 
     * @param emrManagedMasterSecurityGroup
     *        The identifier of the Amazon EC2 security group for the master node.
     */

    public void setEmrManagedMasterSecurityGroup(String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * 
     * @return The identifier of the Amazon EC2 security group for the master node.
     */

    public String getEmrManagedMasterSecurityGroup() {
        return this.emrManagedMasterSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * 
     * @param emrManagedMasterSecurityGroup
     *        The identifier of the Amazon EC2 security group for the master node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withEmrManagedMasterSecurityGroup(String emrManagedMasterSecurityGroup) {
        setEmrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the slave nodes.
     * </p>
     * 
     * @param emrManagedSlaveSecurityGroup
     *        The identifier of the Amazon EC2 security group for the slave nodes.
     */

    public void setEmrManagedSlaveSecurityGroup(String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the slave nodes.
     * </p>
     * 
     * @return The identifier of the Amazon EC2 security group for the slave nodes.
     */

    public String getEmrManagedSlaveSecurityGroup() {
        return this.emrManagedSlaveSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the slave nodes.
     * </p>
     * 
     * @param emrManagedSlaveSecurityGroup
     *        The identifier of the Amazon EC2 security group for the slave nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withEmrManagedSlaveSecurityGroup(String emrManagedSlaveSecurityGroup) {
        setEmrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private
     * subnets.
     * </p>
     * 
     * @param serviceAccessSecurityGroup
     *        The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC
     *        private subnets.
     */

    public void setServiceAccessSecurityGroup(String serviceAccessSecurityGroup) {
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private
     * subnets.
     * </p>
     * 
     * @return The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC
     *         private subnets.
     */

    public String getServiceAccessSecurityGroup() {
        return this.serviceAccessSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC private
     * subnets.
     * </p>
     * 
     * @param serviceAccessSecurityGroup
     *        The identifier of the Amazon EC2 security group for the Amazon EMR service to access clusters in VPC
     *        private subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withServiceAccessSecurityGroup(String serviceAccessSecurityGroup) {
        setServiceAccessSecurityGroup(serviceAccessSecurityGroup);
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * 
     * @return A list of additional Amazon EC2 security group IDs for the master node.
     */

    public java.util.List<String> getAdditionalMasterSecurityGroups() {
        if (additionalMasterSecurityGroups == null) {
            additionalMasterSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return additionalMasterSecurityGroups;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * 
     * @param additionalMasterSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the master node.
     */

    public void setAdditionalMasterSecurityGroups(java.util.Collection<String> additionalMasterSecurityGroups) {
        if (additionalMasterSecurityGroups == null) {
            this.additionalMasterSecurityGroups = null;
            return;
        }

        this.additionalMasterSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(additionalMasterSecurityGroups);
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalMasterSecurityGroups(java.util.Collection)} or
     * {@link #withAdditionalMasterSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalMasterSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the master node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withAdditionalMasterSecurityGroups(String... additionalMasterSecurityGroups) {
        if (this.additionalMasterSecurityGroups == null) {
            setAdditionalMasterSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(additionalMasterSecurityGroups.length));
        }
        for (String ele : additionalMasterSecurityGroups) {
            this.additionalMasterSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * 
     * @param additionalMasterSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the master node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withAdditionalMasterSecurityGroups(java.util.Collection<String> additionalMasterSecurityGroups) {
        setAdditionalMasterSecurityGroups(additionalMasterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     * 
     * @return A list of additional Amazon EC2 security group IDs for the slave nodes.
     */

    public java.util.List<String> getAdditionalSlaveSecurityGroups() {
        if (additionalSlaveSecurityGroups == null) {
            additionalSlaveSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return additionalSlaveSecurityGroups;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     * 
     * @param additionalSlaveSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the slave nodes.
     */

    public void setAdditionalSlaveSecurityGroups(java.util.Collection<String> additionalSlaveSecurityGroups) {
        if (additionalSlaveSecurityGroups == null) {
            this.additionalSlaveSecurityGroups = null;
            return;
        }

        this.additionalSlaveSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(additionalSlaveSecurityGroups);
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalSlaveSecurityGroups(java.util.Collection)} or
     * {@link #withAdditionalSlaveSecurityGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalSlaveSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the slave nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withAdditionalSlaveSecurityGroups(String... additionalSlaveSecurityGroups) {
        if (this.additionalSlaveSecurityGroups == null) {
            setAdditionalSlaveSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(additionalSlaveSecurityGroups.length));
        }
        for (String ele : additionalSlaveSecurityGroups) {
            this.additionalSlaveSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     * 
     * @param additionalSlaveSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the slave nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2InstanceAttributes withAdditionalSlaveSecurityGroups(java.util.Collection<String> additionalSlaveSecurityGroups) {
        setAdditionalSlaveSecurityGroups(additionalSlaveSecurityGroups);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEc2KeyName() != null)
            sb.append("Ec2KeyName: " + getEc2KeyName() + ",");
        if (getEc2SubnetId() != null)
            sb.append("Ec2SubnetId: " + getEc2SubnetId() + ",");
        if (getEc2AvailabilityZone() != null)
            sb.append("Ec2AvailabilityZone: " + getEc2AvailabilityZone() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getEmrManagedMasterSecurityGroup() != null)
            sb.append("EmrManagedMasterSecurityGroup: " + getEmrManagedMasterSecurityGroup() + ",");
        if (getEmrManagedSlaveSecurityGroup() != null)
            sb.append("EmrManagedSlaveSecurityGroup: " + getEmrManagedSlaveSecurityGroup() + ",");
        if (getServiceAccessSecurityGroup() != null)
            sb.append("ServiceAccessSecurityGroup: " + getServiceAccessSecurityGroup() + ",");
        if (getAdditionalMasterSecurityGroups() != null)
            sb.append("AdditionalMasterSecurityGroups: " + getAdditionalMasterSecurityGroups() + ",");
        if (getAdditionalSlaveSecurityGroups() != null)
            sb.append("AdditionalSlaveSecurityGroups: " + getAdditionalSlaveSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2InstanceAttributes == false)
            return false;
        Ec2InstanceAttributes other = (Ec2InstanceAttributes) obj;
        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null)
            return false;
        if (other.getEc2KeyName() != null && other.getEc2KeyName().equals(this.getEc2KeyName()) == false)
            return false;
        if (other.getEc2SubnetId() == null ^ this.getEc2SubnetId() == null)
            return false;
        if (other.getEc2SubnetId() != null && other.getEc2SubnetId().equals(this.getEc2SubnetId()) == false)
            return false;
        if (other.getEc2AvailabilityZone() == null ^ this.getEc2AvailabilityZone() == null)
            return false;
        if (other.getEc2AvailabilityZone() != null && other.getEc2AvailabilityZone().equals(this.getEc2AvailabilityZone()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getEmrManagedMasterSecurityGroup() == null ^ this.getEmrManagedMasterSecurityGroup() == null)
            return false;
        if (other.getEmrManagedMasterSecurityGroup() != null
                && other.getEmrManagedMasterSecurityGroup().equals(this.getEmrManagedMasterSecurityGroup()) == false)
            return false;
        if (other.getEmrManagedSlaveSecurityGroup() == null ^ this.getEmrManagedSlaveSecurityGroup() == null)
            return false;
        if (other.getEmrManagedSlaveSecurityGroup() != null && other.getEmrManagedSlaveSecurityGroup().equals(this.getEmrManagedSlaveSecurityGroup()) == false)
            return false;
        if (other.getServiceAccessSecurityGroup() == null ^ this.getServiceAccessSecurityGroup() == null)
            return false;
        if (other.getServiceAccessSecurityGroup() != null && other.getServiceAccessSecurityGroup().equals(this.getServiceAccessSecurityGroup()) == false)
            return false;
        if (other.getAdditionalMasterSecurityGroups() == null ^ this.getAdditionalMasterSecurityGroups() == null)
            return false;
        if (other.getAdditionalMasterSecurityGroups() != null
                && other.getAdditionalMasterSecurityGroups().equals(this.getAdditionalMasterSecurityGroups()) == false)
            return false;
        if (other.getAdditionalSlaveSecurityGroups() == null ^ this.getAdditionalSlaveSecurityGroups() == null)
            return false;
        if (other.getAdditionalSlaveSecurityGroups() != null
                && other.getAdditionalSlaveSecurityGroups().equals(this.getAdditionalSlaveSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode());
        hashCode = prime * hashCode + ((getEc2SubnetId() == null) ? 0 : getEc2SubnetId().hashCode());
        hashCode = prime * hashCode + ((getEc2AvailabilityZone() == null) ? 0 : getEc2AvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getEmrManagedMasterSecurityGroup() == null) ? 0 : getEmrManagedMasterSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getEmrManagedSlaveSecurityGroup() == null) ? 0 : getEmrManagedSlaveSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessSecurityGroup() == null) ? 0 : getServiceAccessSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getAdditionalMasterSecurityGroups() == null) ? 0 : getAdditionalMasterSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getAdditionalSlaveSecurityGroups() == null) ? 0 : getAdditionalSlaveSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public Ec2InstanceAttributes clone() {
        try {
            return (Ec2InstanceAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
