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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeEndpointAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeEndpointAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster to revoke access from.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The AWS account ID whose access is to be revoked.
     * </p>
     */
    private String account;
    /**
     * <p>
     * The virtual private cloud (VPC) identifiers for which access is to be revoked.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcIds;
    /**
     * <p>
     * Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the
     * endpoint authorization are also deleted.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The cluster to revoke access from.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster to revoke access from.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster to revoke access from.
     * </p>
     * 
     * @return The cluster to revoke access from.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster to revoke access from.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster to revoke access from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The AWS account ID whose access is to be revoked.
     * </p>
     * 
     * @param account
     *        The AWS account ID whose access is to be revoked.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The AWS account ID whose access is to be revoked.
     * </p>
     * 
     * @return The AWS account ID whose access is to be revoked.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The AWS account ID whose access is to be revoked.
     * </p>
     * 
     * @param account
     *        The AWS account ID whose access is to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessRequest withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) identifiers for which access is to be revoked.
     * </p>
     * 
     * @return The virtual private cloud (VPC) identifiers for which access is to be revoked.
     */

    public java.util.List<String> getVpcIds() {
        if (vpcIds == null) {
            vpcIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcIds;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) identifiers for which access is to be revoked.
     * </p>
     * 
     * @param vpcIds
     *        The virtual private cloud (VPC) identifiers for which access is to be revoked.
     */

    public void setVpcIds(java.util.Collection<String> vpcIds) {
        if (vpcIds == null) {
            this.vpcIds = null;
            return;
        }

        this.vpcIds = new com.amazonaws.internal.SdkInternalList<String>(vpcIds);
    }

    /**
     * <p>
     * The virtual private cloud (VPC) identifiers for which access is to be revoked.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcIds(java.util.Collection)} or {@link #withVpcIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vpcIds
     *        The virtual private cloud (VPC) identifiers for which access is to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessRequest withVpcIds(String... vpcIds) {
        if (this.vpcIds == null) {
            setVpcIds(new com.amazonaws.internal.SdkInternalList<String>(vpcIds.length));
        }
        for (String ele : vpcIds) {
            this.vpcIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) identifiers for which access is to be revoked.
     * </p>
     * 
     * @param vpcIds
     *        The virtual private cloud (VPC) identifiers for which access is to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessRequest withVpcIds(java.util.Collection<String> vpcIds) {
        setVpcIds(vpcIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the
     * endpoint authorization are also deleted.
     * </p>
     * 
     * @param force
     *        Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with
     *        the endpoint authorization are also deleted.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the
     * endpoint authorization are also deleted.
     * </p>
     * 
     * @return Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with
     *         the endpoint authorization are also deleted.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the
     * endpoint authorization are also deleted.
     * </p>
     * 
     * @param force
     *        Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with
     *        the endpoint authorization are also deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the
     * endpoint authorization are also deleted.
     * </p>
     * 
     * @return Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with
     *         the endpoint authorization are also deleted.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getVpcIds() != null)
            sb.append("VpcIds: ").append(getVpcIds()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeEndpointAccessRequest == false)
            return false;
        RevokeEndpointAccessRequest other = (RevokeEndpointAccessRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getVpcIds() == null ^ this.getVpcIds() == null)
            return false;
        if (other.getVpcIds() != null && other.getVpcIds().equals(this.getVpcIds()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getVpcIds() == null) ? 0 : getVpcIds().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public RevokeEndpointAccessRequest clone() {
        return (RevokeEndpointAccessRequest) super.clone();
    }

}
