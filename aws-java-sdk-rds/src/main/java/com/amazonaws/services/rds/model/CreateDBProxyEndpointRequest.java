/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxyEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBProxyEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     * </p>
     */
    private String dBProxyName;
    /**
     * <p>
     * The name of the DB proxy endpoint to create.
     * </p>
     */
    private String dBProxyEndpointName;
    /**
     * <p>
     * The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet IDs than
     * for the original DB proxy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSubnetIds;
    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of security
     * group IDs than for the original DB proxy. The default is the default security group for the VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The
     * default is <code>READ_WRITE</code>.
     * </p>
     */
    private String targetRole;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     * </p>
     * 
     * @param dBProxyName
     *        The name of the DB proxy associated with the DB proxy endpoint that you create.
     */

    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     * </p>
     * 
     * @return The name of the DB proxy associated with the DB proxy endpoint that you create.
     */

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * <p>
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     * </p>
     * 
     * @param dBProxyName
     *        The name of the DB proxy associated with the DB proxy endpoint that you create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointRequest withDBProxyName(String dBProxyName) {
        setDBProxyName(dBProxyName);
        return this;
    }

    /**
     * <p>
     * The name of the DB proxy endpoint to create.
     * </p>
     * 
     * @param dBProxyEndpointName
     *        The name of the DB proxy endpoint to create.
     */

    public void setDBProxyEndpointName(String dBProxyEndpointName) {
        this.dBProxyEndpointName = dBProxyEndpointName;
    }

    /**
     * <p>
     * The name of the DB proxy endpoint to create.
     * </p>
     * 
     * @return The name of the DB proxy endpoint to create.
     */

    public String getDBProxyEndpointName() {
        return this.dBProxyEndpointName;
    }

    /**
     * <p>
     * The name of the DB proxy endpoint to create.
     * </p>
     * 
     * @param dBProxyEndpointName
     *        The name of the DB proxy endpoint to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointRequest withDBProxyEndpointName(String dBProxyEndpointName) {
        setDBProxyEndpointName(dBProxyEndpointName);
        return this;
    }

    /**
     * <p>
     * The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet IDs than
     * for the original DB proxy.
     * </p>
     * 
     * @return The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet
     *         IDs than for the original DB proxy.
     */

    public java.util.List<String> getVpcSubnetIds() {
        if (vpcSubnetIds == null) {
            vpcSubnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSubnetIds;
    }

    /**
     * <p>
     * The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet IDs than
     * for the original DB proxy.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet
     *        IDs than for the original DB proxy.
     */

    public void setVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        if (vpcSubnetIds == null) {
            this.vpcSubnetIds = null;
            return;
        }

        this.vpcSubnetIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSubnetIds);
    }

    /**
     * <p>
     * The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet IDs than
     * for the original DB proxy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSubnetIds(java.util.Collection)} or {@link #withVpcSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet
     *        IDs than for the original DB proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointRequest withVpcSubnetIds(String... vpcSubnetIds) {
        if (this.vpcSubnetIds == null) {
            setVpcSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSubnetIds.length));
        }
        for (String ele : vpcSubnetIds) {
            this.vpcSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet IDs than
     * for the original DB proxy.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The VPC subnet IDs for the DB proxy endpoint that you create. You can specify a different set of subnet
     *        IDs than for the original DB proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointRequest withVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        setVpcSubnetIds(vpcSubnetIds);
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of security
     * group IDs than for the original DB proxy. The default is the default security group for the VPC.
     * </p>
     * 
     * @return The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of
     *         security group IDs than for the original DB proxy. The default is the default security group for the VPC.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of security
     * group IDs than for the original DB proxy. The default is the default security group for the VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of
     *        security group IDs than for the original DB proxy. The default is the default security group for the VPC.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of security
     * group IDs than for the original DB proxy. The default is the default security group for the VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of
     *        security group IDs than for the original DB proxy. The default is the default security group for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of security
     * group IDs than for the original DB proxy. The default is the default security group for the VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        The VPC security group IDs for the DB proxy endpoint that you create. You can specify a different set of
     *        security group IDs than for the original DB proxy. The default is the default security group for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The
     * default is <code>READ_WRITE</code>.
     * </p>
     * 
     * @param targetRole
     *        A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     *        The default is <code>READ_WRITE</code>.
     * @see DBProxyEndpointTargetRole
     */

    public void setTargetRole(String targetRole) {
        this.targetRole = targetRole;
    }

    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The
     * default is <code>READ_WRITE</code>.
     * </p>
     * 
     * @return A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     *         The default is <code>READ_WRITE</code>.
     * @see DBProxyEndpointTargetRole
     */

    public String getTargetRole() {
        return this.targetRole;
    }

    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The
     * default is <code>READ_WRITE</code>.
     * </p>
     * 
     * @param targetRole
     *        A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     *        The default is <code>READ_WRITE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DBProxyEndpointTargetRole
     */

    public CreateDBProxyEndpointRequest withTargetRole(String targetRole) {
        setTargetRole(targetRole);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations. The
     * default is <code>READ_WRITE</code>.
     * </p>
     * 
     * @param targetRole
     *        A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     *        The default is <code>READ_WRITE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DBProxyEndpointTargetRole
     */

    public CreateDBProxyEndpointRequest withTargetRole(DBProxyEndpointTargetRole targetRole) {
        this.targetRole = targetRole.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDBProxyName() != null)
            sb.append("DBProxyName: ").append(getDBProxyName()).append(",");
        if (getDBProxyEndpointName() != null)
            sb.append("DBProxyEndpointName: ").append(getDBProxyEndpointName()).append(",");
        if (getVpcSubnetIds() != null)
            sb.append("VpcSubnetIds: ").append(getVpcSubnetIds()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getTargetRole() != null)
            sb.append("TargetRole: ").append(getTargetRole()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBProxyEndpointRequest == false)
            return false;
        CreateDBProxyEndpointRequest other = (CreateDBProxyEndpointRequest) obj;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getDBProxyEndpointName() == null ^ this.getDBProxyEndpointName() == null)
            return false;
        if (other.getDBProxyEndpointName() != null && other.getDBProxyEndpointName().equals(this.getDBProxyEndpointName()) == false)
            return false;
        if (other.getVpcSubnetIds() == null ^ this.getVpcSubnetIds() == null)
            return false;
        if (other.getVpcSubnetIds() != null && other.getVpcSubnetIds().equals(this.getVpcSubnetIds()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getTargetRole() == null ^ this.getTargetRole() == null)
            return false;
        if (other.getTargetRole() != null && other.getTargetRole().equals(this.getTargetRole()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getDBProxyEndpointName() == null) ? 0 : getDBProxyEndpointName().hashCode());
        hashCode = prime * hashCode + ((getVpcSubnetIds() == null) ? 0 : getVpcSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTargetRole() == null) ? 0 : getTargetRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBProxyEndpointRequest clone() {
        return (CreateDBProxyEndpointRequest) super.clone();
    }

}
