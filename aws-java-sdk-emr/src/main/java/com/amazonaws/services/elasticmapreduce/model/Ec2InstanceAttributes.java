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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the EC2 instances in a cluster grouped by
 * category. For example, key name, subnet ID, IAM instance profile, and
 * so on.
 * </p>
 */
public class Ec2InstanceAttributes implements Serializable {

    /**
     * The name of the Amazon EC2 key pair to use when connecting with SSH
     * into the master node as a user named "hadoop".
     */
    private String ec2KeyName;

    /**
     * To launch the job flow in Amazon VPC, set this parameter to the
     * identifier of the Amazon VPC subnet where you want the job flow to
     * launch. If you do not specify this value, the job flow is launched in
     * the normal AWS cloud, outside of a VPC. <p> Amazon VPC currently does
     * not support cluster compute quadruple extra large (cc1.4xlarge)
     * instances. Thus, you cannot specify the cc1.4xlarge instance type for
     * nodes of a job flow launched in a VPC.
     */
    private String ec2SubnetId;

    /**
     * The Availability Zone in which the cluster will run.
     */
    private String ec2AvailabilityZone;

    /**
     * The IAM role that was specified when the job flow was launched. The
     * EC2 instances of the job flow assume this role.
     */
    private String iamInstanceProfile;

    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * Elastic MapReduce) for the master node.
     */
    private String emrManagedMasterSecurityGroup;

    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * Elastic MapReduce) for the slave nodes.
     */
    private String emrManagedSlaveSecurityGroup;

    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalMasterSecurityGroups;

    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalSlaveSecurityGroups;

    /**
     * The name of the Amazon EC2 key pair to use when connecting with SSH
     * into the master node as a user named "hadoop".
     *
     * @return The name of the Amazon EC2 key pair to use when connecting with SSH
     *         into the master node as a user named "hadoop".
     */
    public String getEc2KeyName() {
        return ec2KeyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair to use when connecting with SSH
     * into the master node as a user named "hadoop".
     *
     * @param ec2KeyName The name of the Amazon EC2 key pair to use when connecting with SSH
     *         into the master node as a user named "hadoop".
     */
    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair to use when connecting with SSH
     * into the master node as a user named "hadoop".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2KeyName The name of the Amazon EC2 key pair to use when connecting with SSH
     *         into the master node as a user named "hadoop".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
        return this;
    }

    /**
     * To launch the job flow in Amazon VPC, set this parameter to the
     * identifier of the Amazon VPC subnet where you want the job flow to
     * launch. If you do not specify this value, the job flow is launched in
     * the normal AWS cloud, outside of a VPC. <p> Amazon VPC currently does
     * not support cluster compute quadruple extra large (cc1.4xlarge)
     * instances. Thus, you cannot specify the cc1.4xlarge instance type for
     * nodes of a job flow launched in a VPC.
     *
     * @return To launch the job flow in Amazon VPC, set this parameter to the
     *         identifier of the Amazon VPC subnet where you want the job flow to
     *         launch. If you do not specify this value, the job flow is launched in
     *         the normal AWS cloud, outside of a VPC. <p> Amazon VPC currently does
     *         not support cluster compute quadruple extra large (cc1.4xlarge)
     *         instances. Thus, you cannot specify the cc1.4xlarge instance type for
     *         nodes of a job flow launched in a VPC.
     */
    public String getEc2SubnetId() {
        return ec2SubnetId;
    }
    
    /**
     * To launch the job flow in Amazon VPC, set this parameter to the
     * identifier of the Amazon VPC subnet where you want the job flow to
     * launch. If you do not specify this value, the job flow is launched in
     * the normal AWS cloud, outside of a VPC. <p> Amazon VPC currently does
     * not support cluster compute quadruple extra large (cc1.4xlarge)
     * instances. Thus, you cannot specify the cc1.4xlarge instance type for
     * nodes of a job flow launched in a VPC.
     *
     * @param ec2SubnetId To launch the job flow in Amazon VPC, set this parameter to the
     *         identifier of the Amazon VPC subnet where you want the job flow to
     *         launch. If you do not specify this value, the job flow is launched in
     *         the normal AWS cloud, outside of a VPC. <p> Amazon VPC currently does
     *         not support cluster compute quadruple extra large (cc1.4xlarge)
     *         instances. Thus, you cannot specify the cc1.4xlarge instance type for
     *         nodes of a job flow launched in a VPC.
     */
    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }
    
    /**
     * To launch the job flow in Amazon VPC, set this parameter to the
     * identifier of the Amazon VPC subnet where you want the job flow to
     * launch. If you do not specify this value, the job flow is launched in
     * the normal AWS cloud, outside of a VPC. <p> Amazon VPC currently does
     * not support cluster compute quadruple extra large (cc1.4xlarge)
     * instances. Thus, you cannot specify the cc1.4xlarge instance type for
     * nodes of a job flow launched in a VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2SubnetId To launch the job flow in Amazon VPC, set this parameter to the
     *         identifier of the Amazon VPC subnet where you want the job flow to
     *         launch. If you do not specify this value, the job flow is launched in
     *         the normal AWS cloud, outside of a VPC. <p> Amazon VPC currently does
     *         not support cluster compute quadruple extra large (cc1.4xlarge)
     *         instances. Thus, you cannot specify the cc1.4xlarge instance type for
     *         nodes of a job flow launched in a VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
        return this;
    }

    /**
     * The Availability Zone in which the cluster will run.
     *
     * @return The Availability Zone in which the cluster will run.
     */
    public String getEc2AvailabilityZone() {
        return ec2AvailabilityZone;
    }
    
    /**
     * The Availability Zone in which the cluster will run.
     *
     * @param ec2AvailabilityZone The Availability Zone in which the cluster will run.
     */
    public void setEc2AvailabilityZone(String ec2AvailabilityZone) {
        this.ec2AvailabilityZone = ec2AvailabilityZone;
    }
    
    /**
     * The Availability Zone in which the cluster will run.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ec2AvailabilityZone The Availability Zone in which the cluster will run.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withEc2AvailabilityZone(String ec2AvailabilityZone) {
        this.ec2AvailabilityZone = ec2AvailabilityZone;
        return this;
    }

    /**
     * The IAM role that was specified when the job flow was launched. The
     * EC2 instances of the job flow assume this role.
     *
     * @return The IAM role that was specified when the job flow was launched. The
     *         EC2 instances of the job flow assume this role.
     */
    public String getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * The IAM role that was specified when the job flow was launched. The
     * EC2 instances of the job flow assume this role.
     *
     * @param iamInstanceProfile The IAM role that was specified when the job flow was launched. The
     *         EC2 instances of the job flow assume this role.
     */
    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * The IAM role that was specified when the job flow was launched. The
     * EC2 instances of the job flow assume this role.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamInstanceProfile The IAM role that was specified when the job flow was launched. The
     *         EC2 instances of the job flow assume this role.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * Elastic MapReduce) for the master node.
     *
     * @return The identifier of the Amazon EC2 security group (managed by Amazon
     *         Elastic MapReduce) for the master node.
     */
    public String getEmrManagedMasterSecurityGroup() {
        return emrManagedMasterSecurityGroup;
    }
    
    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * Elastic MapReduce) for the master node.
     *
     * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group (managed by Amazon
     *         Elastic MapReduce) for the master node.
     */
    public void setEmrManagedMasterSecurityGroup(String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
    }
    
    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * Elastic MapReduce) for the master node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param emrManagedMasterSecurityGroup The identifier of the Amazon EC2 security group (managed by Amazon
     *         Elastic MapReduce) for the master node.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withEmrManagedMasterSecurityGroup(String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
        return this;
    }

    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * Elastic MapReduce) for the slave nodes.
     *
     * @return The identifier of the Amazon EC2 security group (managed by Amazon
     *         Elastic MapReduce) for the slave nodes.
     */
    public String getEmrManagedSlaveSecurityGroup() {
        return emrManagedSlaveSecurityGroup;
    }
    
    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * Elastic MapReduce) for the slave nodes.
     *
     * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group (managed by Amazon
     *         Elastic MapReduce) for the slave nodes.
     */
    public void setEmrManagedSlaveSecurityGroup(String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
    }
    
    /**
     * The identifier of the Amazon EC2 security group (managed by Amazon
     * Elastic MapReduce) for the slave nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param emrManagedSlaveSecurityGroup The identifier of the Amazon EC2 security group (managed by Amazon
     *         Elastic MapReduce) for the slave nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withEmrManagedSlaveSecurityGroup(String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
        return this;
    }

    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     *
     * @return A list of additional Amazon EC2 security group IDs for the master
     *         node.
     */
    public java.util.List<String> getAdditionalMasterSecurityGroups() {
        if (additionalMasterSecurityGroups == null) {
              additionalMasterSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              additionalMasterSecurityGroups.setAutoConstruct(true);
        }
        return additionalMasterSecurityGroups;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     *
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for the master
     *         node.
     */
    public void setAdditionalMasterSecurityGroups(java.util.Collection<String> additionalMasterSecurityGroups) {
        if (additionalMasterSecurityGroups == null) {
            this.additionalMasterSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalMasterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(additionalMasterSecurityGroups.size());
        additionalMasterSecurityGroupsCopy.addAll(additionalMasterSecurityGroups);
        this.additionalMasterSecurityGroups = additionalMasterSecurityGroupsCopy;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for the master
     *         node.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withAdditionalMasterSecurityGroups(String... additionalMasterSecurityGroups) {
        if (getAdditionalMasterSecurityGroups() == null) setAdditionalMasterSecurityGroups(new java.util.ArrayList<String>(additionalMasterSecurityGroups.length));
        for (String value : additionalMasterSecurityGroups) {
            getAdditionalMasterSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the master
     * node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalMasterSecurityGroups A list of additional Amazon EC2 security group IDs for the master
     *         node.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withAdditionalMasterSecurityGroups(java.util.Collection<String> additionalMasterSecurityGroups) {
        if (additionalMasterSecurityGroups == null) {
            this.additionalMasterSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalMasterSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(additionalMasterSecurityGroups.size());
            additionalMasterSecurityGroupsCopy.addAll(additionalMasterSecurityGroups);
            this.additionalMasterSecurityGroups = additionalMasterSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     *
     * @return A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     */
    public java.util.List<String> getAdditionalSlaveSecurityGroups() {
        if (additionalSlaveSecurityGroups == null) {
              additionalSlaveSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              additionalSlaveSecurityGroups.setAutoConstruct(true);
        }
        return additionalSlaveSecurityGroups;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     *
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     */
    public void setAdditionalSlaveSecurityGroups(java.util.Collection<String> additionalSlaveSecurityGroups) {
        if (additionalSlaveSecurityGroups == null) {
            this.additionalSlaveSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalSlaveSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(additionalSlaveSecurityGroups.size());
        additionalSlaveSecurityGroupsCopy.addAll(additionalSlaveSecurityGroups);
        this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroupsCopy;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withAdditionalSlaveSecurityGroups(String... additionalSlaveSecurityGroups) {
        if (getAdditionalSlaveSecurityGroups() == null) setAdditionalSlaveSecurityGroups(new java.util.ArrayList<String>(additionalSlaveSecurityGroups.length));
        for (String value : additionalSlaveSecurityGroups) {
            getAdditionalSlaveSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of additional Amazon EC2 security group IDs for the slave
     * nodes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalSlaveSecurityGroups A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ec2InstanceAttributes withAdditionalSlaveSecurityGroups(java.util.Collection<String> additionalSlaveSecurityGroups) {
        if (additionalSlaveSecurityGroups == null) {
            this.additionalSlaveSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> additionalSlaveSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(additionalSlaveSecurityGroups.size());
            additionalSlaveSecurityGroupsCopy.addAll(additionalSlaveSecurityGroups);
            this.additionalSlaveSecurityGroups = additionalSlaveSecurityGroupsCopy;
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
        if (getEc2KeyName() != null) sb.append("Ec2KeyName: " + getEc2KeyName() + ",");
        if (getEc2SubnetId() != null) sb.append("Ec2SubnetId: " + getEc2SubnetId() + ",");
        if (getEc2AvailabilityZone() != null) sb.append("Ec2AvailabilityZone: " + getEc2AvailabilityZone() + ",");
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getEmrManagedMasterSecurityGroup() != null) sb.append("EmrManagedMasterSecurityGroup: " + getEmrManagedMasterSecurityGroup() + ",");
        if (getEmrManagedSlaveSecurityGroup() != null) sb.append("EmrManagedSlaveSecurityGroup: " + getEmrManagedSlaveSecurityGroup() + ",");
        if (getAdditionalMasterSecurityGroups() != null) sb.append("AdditionalMasterSecurityGroups: " + getAdditionalMasterSecurityGroups() + ",");
        if (getAdditionalSlaveSecurityGroups() != null) sb.append("AdditionalSlaveSecurityGroups: " + getAdditionalSlaveSecurityGroups() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getAdditionalMasterSecurityGroups() == null) ? 0 : getAdditionalMasterSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalSlaveSecurityGroups() == null) ? 0 : getAdditionalSlaveSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Ec2InstanceAttributes == false) return false;
        Ec2InstanceAttributes other = (Ec2InstanceAttributes)obj;
        
        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null) return false;
        if (other.getEc2KeyName() != null && other.getEc2KeyName().equals(this.getEc2KeyName()) == false) return false; 
        if (other.getEc2SubnetId() == null ^ this.getEc2SubnetId() == null) return false;
        if (other.getEc2SubnetId() != null && other.getEc2SubnetId().equals(this.getEc2SubnetId()) == false) return false; 
        if (other.getEc2AvailabilityZone() == null ^ this.getEc2AvailabilityZone() == null) return false;
        if (other.getEc2AvailabilityZone() != null && other.getEc2AvailabilityZone().equals(this.getEc2AvailabilityZone()) == false) return false; 
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null) return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false) return false; 
        if (other.getEmrManagedMasterSecurityGroup() == null ^ this.getEmrManagedMasterSecurityGroup() == null) return false;
        if (other.getEmrManagedMasterSecurityGroup() != null && other.getEmrManagedMasterSecurityGroup().equals(this.getEmrManagedMasterSecurityGroup()) == false) return false; 
        if (other.getEmrManagedSlaveSecurityGroup() == null ^ this.getEmrManagedSlaveSecurityGroup() == null) return false;
        if (other.getEmrManagedSlaveSecurityGroup() != null && other.getEmrManagedSlaveSecurityGroup().equals(this.getEmrManagedSlaveSecurityGroup()) == false) return false; 
        if (other.getAdditionalMasterSecurityGroups() == null ^ this.getAdditionalMasterSecurityGroups() == null) return false;
        if (other.getAdditionalMasterSecurityGroups() != null && other.getAdditionalMasterSecurityGroups().equals(this.getAdditionalMasterSecurityGroups()) == false) return false; 
        if (other.getAdditionalSlaveSecurityGroups() == null ^ this.getAdditionalSlaveSecurityGroups() == null) return false;
        if (other.getAdditionalSlaveSecurityGroups() != null && other.getAdditionalSlaveSecurityGroups().equals(this.getAdditionalSlaveSecurityGroups()) == false) return false; 
        return true;
    }
    
}
    