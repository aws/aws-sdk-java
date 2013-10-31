/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about the EC2 instances in a cluster grouped by category. For example, EC2 Key Name, Subnet Id, Instance Profile, and so on.
 * </p>
 */
public class Ec2InstanceAttributes implements Serializable {

    /**
     * The name of the Amazon EC2 key pair to use when connecting with SSH
     * into the master node as a user named "hadoop".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String ec2SubnetId;

    /**
     * The Availability Zone in which the cluster will run.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String ec2AvailabilityZone;

    /**
     * The IAM role that was specified when the job flow was launched. The
     * EC2 instances of the job flow assume this role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String iamInstanceProfile;

    /**
     * The name of the Amazon EC2 key pair to use when connecting with SSH
     * into the master node as a user named "hadoop".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The Availability Zone in which the cluster will run.
     */
    public String getEc2AvailabilityZone() {
        return ec2AvailabilityZone;
    }
    
    /**
     * The Availability Zone in which the cluster will run.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
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
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() );
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
        return true;
    }
    
}
    