/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the attributes of a compute environment that can be updated. For more information, see <a
 * href="https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html">Compute Environments</a> in the
 * <i>AWS Batch User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/ComputeResourceUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeResourceUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * </p>
     * </note>
     */
    private Integer minvCpus;
    /**
     * <p>
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     * </p>
     * <note>
     * <p>
     * With both <code>BEST_FIT_PROGRESSIVE</code> and <code>SPOT_CAPACITY_OPTIMIZED</code> allocation strategies, AWS
     * Batch might need to go above <code>maxvCpus</code> to meet your capacity requirements. In this event, AWS Batch
     * will never go above <code>maxvCpus</code> by more than a single instance (e.g., no more than a single instance
     * from among those specified in your compute environment).
     * </p>
     * </note>
     */
    private Integer maxvCpus;
    /**
     * <p>
     * The desired number of Amazon EC2 vCPUS in the compute environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * </p>
     * </note>
     */
    private Integer desiredvCpus;
    /**
     * <p>
     * The VPC subnets that the compute resources are launched into. This parameter is required for jobs running on
     * Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the <i>Amazon
     * VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list will be handled as
     * if this parameter wasn't specified and no change is made.
     * </p>
     */
    private java.util.List<String> subnets;
    /**
     * <p>
     * The Amazon EC2 security groups associated with instances launched in the compute environment. This parameter is
     * required for Fargate compute resources, where it can contain up to 5 security groups. This can't be specified for
     * EC2 compute resources. Providing an empty list is handled as if this parameter wasn't specified and no change is
     * made.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * </p>
     * </note>
     * 
     * @param minvCpus
     *        The minimum number of Amazon EC2 vCPUs that an environment should maintain.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     *        </p>
     */

    public void setMinvCpus(Integer minvCpus) {
        this.minvCpus = minvCpus;
    }

    /**
     * <p>
     * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * </p>
     * </note>
     * 
     * @return The minimum number of Amazon EC2 vCPUs that an environment should maintain.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     *         </p>
     */

    public Integer getMinvCpus() {
        return this.minvCpus;
    }

    /**
     * <p>
     * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * </p>
     * </note>
     * 
     * @param minvCpus
     *        The minimum number of Amazon EC2 vCPUs that an environment should maintain.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withMinvCpus(Integer minvCpus) {
        setMinvCpus(minvCpus);
        return this;
    }

    /**
     * <p>
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     * </p>
     * <note>
     * <p>
     * With both <code>BEST_FIT_PROGRESSIVE</code> and <code>SPOT_CAPACITY_OPTIMIZED</code> allocation strategies, AWS
     * Batch might need to go above <code>maxvCpus</code> to meet your capacity requirements. In this event, AWS Batch
     * will never go above <code>maxvCpus</code> by more than a single instance (e.g., no more than a single instance
     * from among those specified in your compute environment).
     * </p>
     * </note>
     * 
     * @param maxvCpus
     *        The maximum number of Amazon EC2 vCPUs that an environment can reach.</p> <note>
     *        <p>
     *        With both <code>BEST_FIT_PROGRESSIVE</code> and <code>SPOT_CAPACITY_OPTIMIZED</code> allocation
     *        strategies, AWS Batch might need to go above <code>maxvCpus</code> to meet your capacity requirements. In
     *        this event, AWS Batch will never go above <code>maxvCpus</code> by more than a single instance (e.g., no
     *        more than a single instance from among those specified in your compute environment).
     *        </p>
     */

    public void setMaxvCpus(Integer maxvCpus) {
        this.maxvCpus = maxvCpus;
    }

    /**
     * <p>
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     * </p>
     * <note>
     * <p>
     * With both <code>BEST_FIT_PROGRESSIVE</code> and <code>SPOT_CAPACITY_OPTIMIZED</code> allocation strategies, AWS
     * Batch might need to go above <code>maxvCpus</code> to meet your capacity requirements. In this event, AWS Batch
     * will never go above <code>maxvCpus</code> by more than a single instance (e.g., no more than a single instance
     * from among those specified in your compute environment).
     * </p>
     * </note>
     * 
     * @return The maximum number of Amazon EC2 vCPUs that an environment can reach.</p> <note>
     *         <p>
     *         With both <code>BEST_FIT_PROGRESSIVE</code> and <code>SPOT_CAPACITY_OPTIMIZED</code> allocation
     *         strategies, AWS Batch might need to go above <code>maxvCpus</code> to meet your capacity requirements. In
     *         this event, AWS Batch will never go above <code>maxvCpus</code> by more than a single instance (e.g., no
     *         more than a single instance from among those specified in your compute environment).
     *         </p>
     */

    public Integer getMaxvCpus() {
        return this.maxvCpus;
    }

    /**
     * <p>
     * The maximum number of Amazon EC2 vCPUs that an environment can reach.
     * </p>
     * <note>
     * <p>
     * With both <code>BEST_FIT_PROGRESSIVE</code> and <code>SPOT_CAPACITY_OPTIMIZED</code> allocation strategies, AWS
     * Batch might need to go above <code>maxvCpus</code> to meet your capacity requirements. In this event, AWS Batch
     * will never go above <code>maxvCpus</code> by more than a single instance (e.g., no more than a single instance
     * from among those specified in your compute environment).
     * </p>
     * </note>
     * 
     * @param maxvCpus
     *        The maximum number of Amazon EC2 vCPUs that an environment can reach.</p> <note>
     *        <p>
     *        With both <code>BEST_FIT_PROGRESSIVE</code> and <code>SPOT_CAPACITY_OPTIMIZED</code> allocation
     *        strategies, AWS Batch might need to go above <code>maxvCpus</code> to meet your capacity requirements. In
     *        this event, AWS Batch will never go above <code>maxvCpus</code> by more than a single instance (e.g., no
     *        more than a single instance from among those specified in your compute environment).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withMaxvCpus(Integer maxvCpus) {
        setMaxvCpus(maxvCpus);
        return this;
    }

    /**
     * <p>
     * The desired number of Amazon EC2 vCPUS in the compute environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * </p>
     * </note>
     * 
     * @param desiredvCpus
     *        The desired number of Amazon EC2 vCPUS in the compute environment.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     *        </p>
     */

    public void setDesiredvCpus(Integer desiredvCpus) {
        this.desiredvCpus = desiredvCpus;
    }

    /**
     * <p>
     * The desired number of Amazon EC2 vCPUS in the compute environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * </p>
     * </note>
     * 
     * @return The desired number of Amazon EC2 vCPUS in the compute environment.</p> <note>
     *         <p>
     *         This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     *         </p>
     */

    public Integer getDesiredvCpus() {
        return this.desiredvCpus;
    }

    /**
     * <p>
     * The desired number of Amazon EC2 vCPUS in the compute environment.
     * </p>
     * <note>
     * <p>
     * This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * </p>
     * </note>
     * 
     * @param desiredvCpus
     *        The desired number of Amazon EC2 vCPUS in the compute environment.</p> <note>
     *        <p>
     *        This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withDesiredvCpus(Integer desiredvCpus) {
        setDesiredvCpus(desiredvCpus);
        return this;
    }

    /**
     * <p>
     * The VPC subnets that the compute resources are launched into. This parameter is required for jobs running on
     * Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the <i>Amazon
     * VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list will be handled as
     * if this parameter wasn't specified and no change is made.
     * </p>
     * 
     * @return The VPC subnets that the compute resources are launched into. This parameter is required for jobs running
     *         on Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     *         href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the
     *         <i>Amazon VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list
     *         will be handled as if this parameter wasn't specified and no change is made.
     */

    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * The VPC subnets that the compute resources are launched into. This parameter is required for jobs running on
     * Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the <i>Amazon
     * VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list will be handled as
     * if this parameter wasn't specified and no change is made.
     * </p>
     * 
     * @param subnets
     *        The VPC subnets that the compute resources are launched into. This parameter is required for jobs running
     *        on Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the
     *        <i>Amazon VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list
     *        will be handled as if this parameter wasn't specified and no change is made.
     */

    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<String>(subnets);
    }

    /**
     * <p>
     * The VPC subnets that the compute resources are launched into. This parameter is required for jobs running on
     * Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the <i>Amazon
     * VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list will be handled as
     * if this parameter wasn't specified and no change is made.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnets(java.util.Collection)} or {@link #withSubnets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subnets
     *        The VPC subnets that the compute resources are launched into. This parameter is required for jobs running
     *        on Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the
     *        <i>Amazon VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list
     *        will be handled as if this parameter wasn't specified and no change is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withSubnets(String... subnets) {
        if (this.subnets == null) {
            setSubnets(new java.util.ArrayList<String>(subnets.length));
        }
        for (String ele : subnets) {
            this.subnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPC subnets that the compute resources are launched into. This parameter is required for jobs running on
     * Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the <i>Amazon
     * VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list will be handled as
     * if this parameter wasn't specified and no change is made.
     * </p>
     * 
     * @param subnets
     *        The VPC subnets that the compute resources are launched into. This parameter is required for jobs running
     *        on Fargate compute resources, where it can contain up to 16 subnets. For more information, see <a
     *        href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and Subnets</a> in the
     *        <i>Amazon VPC User Guide</i>. This can't be specified for EC2 compute resources. Providing an empty list
     *        will be handled as if this parameter wasn't specified and no change is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withSubnets(java.util.Collection<String> subnets) {
        setSubnets(subnets);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 security groups associated with instances launched in the compute environment. This parameter is
     * required for Fargate compute resources, where it can contain up to 5 security groups. This can't be specified for
     * EC2 compute resources. Providing an empty list is handled as if this parameter wasn't specified and no change is
     * made.
     * </p>
     * 
     * @return The Amazon EC2 security groups associated with instances launched in the compute environment. This
     *         parameter is required for Fargate compute resources, where it can contain up to 5 security groups. This
     *         can't be specified for EC2 compute resources. Providing an empty list is handled as if this parameter
     *         wasn't specified and no change is made.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The Amazon EC2 security groups associated with instances launched in the compute environment. This parameter is
     * required for Fargate compute resources, where it can contain up to 5 security groups. This can't be specified for
     * EC2 compute resources. Providing an empty list is handled as if this parameter wasn't specified and no change is
     * made.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups associated with instances launched in the compute environment. This
     *        parameter is required for Fargate compute resources, where it can contain up to 5 security groups. This
     *        can't be specified for EC2 compute resources. Providing an empty list is handled as if this parameter
     *        wasn't specified and no change is made.
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
     * The Amazon EC2 security groups associated with instances launched in the compute environment. This parameter is
     * required for Fargate compute resources, where it can contain up to 5 security groups. This can't be specified for
     * EC2 compute resources. Providing an empty list is handled as if this parameter wasn't specified and no change is
     * made.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups associated with instances launched in the compute environment. This
     *        parameter is required for Fargate compute resources, where it can contain up to 5 security groups. This
     *        can't be specified for EC2 compute resources. Providing an empty list is handled as if this parameter
     *        wasn't specified and no change is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withSecurityGroupIds(String... securityGroupIds) {
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
     * The Amazon EC2 security groups associated with instances launched in the compute environment. This parameter is
     * required for Fargate compute resources, where it can contain up to 5 security groups. This can't be specified for
     * EC2 compute resources. Providing an empty list is handled as if this parameter wasn't specified and no change is
     * made.
     * </p>
     * 
     * @param securityGroupIds
     *        The Amazon EC2 security groups associated with instances launched in the compute environment. This
     *        parameter is required for Fargate compute resources, where it can contain up to 5 security groups. This
     *        can't be specified for EC2 compute resources. Providing an empty list is handled as if this parameter
     *        wasn't specified and no change is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeResourceUpdate withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getMinvCpus() != null)
            sb.append("MinvCpus: ").append(getMinvCpus()).append(",");
        if (getMaxvCpus() != null)
            sb.append("MaxvCpus: ").append(getMaxvCpus()).append(",");
        if (getDesiredvCpus() != null)
            sb.append("DesiredvCpus: ").append(getDesiredvCpus()).append(",");
        if (getSubnets() != null)
            sb.append("Subnets: ").append(getSubnets()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeResourceUpdate == false)
            return false;
        ComputeResourceUpdate other = (ComputeResourceUpdate) obj;
        if (other.getMinvCpus() == null ^ this.getMinvCpus() == null)
            return false;
        if (other.getMinvCpus() != null && other.getMinvCpus().equals(this.getMinvCpus()) == false)
            return false;
        if (other.getMaxvCpus() == null ^ this.getMaxvCpus() == null)
            return false;
        if (other.getMaxvCpus() != null && other.getMaxvCpus().equals(this.getMaxvCpus()) == false)
            return false;
        if (other.getDesiredvCpus() == null ^ this.getDesiredvCpus() == null)
            return false;
        if (other.getDesiredvCpus() != null && other.getDesiredvCpus().equals(this.getDesiredvCpus()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinvCpus() == null) ? 0 : getMinvCpus().hashCode());
        hashCode = prime * hashCode + ((getMaxvCpus() == null) ? 0 : getMaxvCpus().hashCode());
        hashCode = prime * hashCode + ((getDesiredvCpus() == null) ? 0 : getDesiredvCpus().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public ComputeResourceUpdate clone() {
        try {
            return (ComputeResourceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.ComputeResourceUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
