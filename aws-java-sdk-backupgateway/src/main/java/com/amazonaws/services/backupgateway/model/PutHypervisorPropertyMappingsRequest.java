/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupgateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutHypervisorPropertyMappings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutHypervisorPropertyMappingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     */
    private String hypervisorArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     * </p>
     */
    private java.util.List<VmwareToAwsTagMapping> vmwareToAwsTagMappings;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor.
     */

    public void setHypervisorArn(String hypervisorArn) {
        this.hypervisorArn = hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the hypervisor.
     */

    public String getHypervisorArn() {
        return this.hypervisorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the hypervisor.
     * </p>
     * 
     * @param hypervisorArn
     *        The Amazon Resource Name (ARN) of the hypervisor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutHypervisorPropertyMappingsRequest withHypervisorArn(String hypervisorArn) {
        setHypervisorArn(hypervisorArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutHypervisorPropertyMappingsRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     * </p>
     * 
     * @return This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     */

    public java.util.List<VmwareToAwsTagMapping> getVmwareToAwsTagMappings() {
        return vmwareToAwsTagMappings;
    }

    /**
     * <p>
     * This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     * </p>
     * 
     * @param vmwareToAwsTagMappings
     *        This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     */

    public void setVmwareToAwsTagMappings(java.util.Collection<VmwareToAwsTagMapping> vmwareToAwsTagMappings) {
        if (vmwareToAwsTagMappings == null) {
            this.vmwareToAwsTagMappings = null;
            return;
        }

        this.vmwareToAwsTagMappings = new java.util.ArrayList<VmwareToAwsTagMapping>(vmwareToAwsTagMappings);
    }

    /**
     * <p>
     * This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVmwareToAwsTagMappings(java.util.Collection)} or
     * {@link #withVmwareToAwsTagMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vmwareToAwsTagMappings
     *        This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutHypervisorPropertyMappingsRequest withVmwareToAwsTagMappings(VmwareToAwsTagMapping... vmwareToAwsTagMappings) {
        if (this.vmwareToAwsTagMappings == null) {
            setVmwareToAwsTagMappings(new java.util.ArrayList<VmwareToAwsTagMapping>(vmwareToAwsTagMappings.length));
        }
        for (VmwareToAwsTagMapping ele : vmwareToAwsTagMappings) {
            this.vmwareToAwsTagMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     * </p>
     * 
     * @param vmwareToAwsTagMappings
     *        This action requests the mappings of on-premises VMware tags to the Amazon Web Services tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutHypervisorPropertyMappingsRequest withVmwareToAwsTagMappings(java.util.Collection<VmwareToAwsTagMapping> vmwareToAwsTagMappings) {
        setVmwareToAwsTagMappings(vmwareToAwsTagMappings);
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
        if (getHypervisorArn() != null)
            sb.append("HypervisorArn: ").append(getHypervisorArn()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getVmwareToAwsTagMappings() != null)
            sb.append("VmwareToAwsTagMappings: ").append(getVmwareToAwsTagMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutHypervisorPropertyMappingsRequest == false)
            return false;
        PutHypervisorPropertyMappingsRequest other = (PutHypervisorPropertyMappingsRequest) obj;
        if (other.getHypervisorArn() == null ^ this.getHypervisorArn() == null)
            return false;
        if (other.getHypervisorArn() != null && other.getHypervisorArn().equals(this.getHypervisorArn()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getVmwareToAwsTagMappings() == null ^ this.getVmwareToAwsTagMappings() == null)
            return false;
        if (other.getVmwareToAwsTagMappings() != null && other.getVmwareToAwsTagMappings().equals(this.getVmwareToAwsTagMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHypervisorArn() == null) ? 0 : getHypervisorArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVmwareToAwsTagMappings() == null) ? 0 : getVmwareToAwsTagMappings().hashCode());
        return hashCode;
    }

    @Override
    public PutHypervisorPropertyMappingsRequest clone() {
        return (PutHypervisorPropertyMappingsRequest) super.clone();
    }

}
