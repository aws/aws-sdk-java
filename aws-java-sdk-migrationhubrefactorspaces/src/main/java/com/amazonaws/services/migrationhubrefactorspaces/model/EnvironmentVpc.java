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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information for the <code>EnvironmentVpc</code> resource as a response to
 * <code>ListEnvironmentVpc</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/EnvironmentVpc"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentVpc implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the virtual private cloud (VPC) owner.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     * </p>
     */
    private java.util.List<String> cidrBlocks;
    /**
     * <p>
     * A timestamp that indicates when the VPC is first added to the environment.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A timestamp that indicates when the VPC was last updated by the environment.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The name of the VPC at the time it is added to the environment.
     * </p>
     */
    private String vpcName;

    /**
     * <p>
     * The Amazon Web Services account ID of the virtual private cloud (VPC) owner.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the virtual private cloud (VPC) owner.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the virtual private cloud (VPC) owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the virtual private cloud (VPC) owner.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the virtual private cloud (VPC) owner.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the virtual private cloud (VPC) owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVpc withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     * </p>
     * 
     * @return The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     */

    public java.util.List<String> getCidrBlocks() {
        return cidrBlocks;
    }

    /**
     * <p>
     * The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     * </p>
     * 
     * @param cidrBlocks
     *        The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     */

    public void setCidrBlocks(java.util.Collection<String> cidrBlocks) {
        if (cidrBlocks == null) {
            this.cidrBlocks = null;
            return;
        }

        this.cidrBlocks = new java.util.ArrayList<String>(cidrBlocks);
    }

    /**
     * <p>
     * The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrBlocks(java.util.Collection)} or {@link #withCidrBlocks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cidrBlocks
     *        The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVpc withCidrBlocks(String... cidrBlocks) {
        if (this.cidrBlocks == null) {
            setCidrBlocks(new java.util.ArrayList<String>(cidrBlocks.length));
        }
        for (String ele : cidrBlocks) {
            this.cidrBlocks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     * </p>
     * 
     * @param cidrBlocks
     *        The list of Amazon Virtual Private Cloud (Amazon VPC) CIDR blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVpc withCidrBlocks(java.util.Collection<String> cidrBlocks) {
        setCidrBlocks(cidrBlocks);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the VPC is first added to the environment.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that indicates when the VPC is first added to the environment.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the VPC is first added to the environment.
     * </p>
     * 
     * @return A timestamp that indicates when the VPC is first added to the environment.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the VPC is first added to the environment.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that indicates when the VPC is first added to the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVpc withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @return The unique identifier of the environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of the environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVpc withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the VPC was last updated by the environment.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the VPC was last updated by the environment.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the VPC was last updated by the environment.
     * </p>
     * 
     * @return A timestamp that indicates when the VPC was last updated by the environment.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the VPC was last updated by the environment.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the VPC was last updated by the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVpc withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVpc withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The name of the VPC at the time it is added to the environment.
     * </p>
     * 
     * @param vpcName
     *        The name of the VPC at the time it is added to the environment.
     */

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    /**
     * <p>
     * The name of the VPC at the time it is added to the environment.
     * </p>
     * 
     * @return The name of the VPC at the time it is added to the environment.
     */

    public String getVpcName() {
        return this.vpcName;
    }

    /**
     * <p>
     * The name of the VPC at the time it is added to the environment.
     * </p>
     * 
     * @param vpcName
     *        The name of the VPC at the time it is added to the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVpc withVpcName(String vpcName) {
        setVpcName(vpcName);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCidrBlocks() != null)
            sb.append("CidrBlocks: ").append(getCidrBlocks()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getVpcName() != null)
            sb.append("VpcName: ").append(getVpcName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentVpc == false)
            return false;
        EnvironmentVpc other = (EnvironmentVpc) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCidrBlocks() == null ^ this.getCidrBlocks() == null)
            return false;
        if (other.getCidrBlocks() != null && other.getCidrBlocks().equals(this.getCidrBlocks()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpcName() == null ^ this.getVpcName() == null)
            return false;
        if (other.getVpcName() != null && other.getVpcName().equals(this.getVpcName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCidrBlocks() == null) ? 0 : getCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcName() == null) ? 0 : getVpcName().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentVpc clone() {
        try {
            return (EnvironmentVpc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubrefactorspaces.model.transform.EnvironmentVpcMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
