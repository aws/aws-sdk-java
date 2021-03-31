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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/AuthorizeEndpointAccess" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeEndpointAccessRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier of the cluster to grant access to.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The AWS account ID to grant access to.
     * </p>
     */
    private String account;
    /**
     * <p>
     * The virtual private cloud (VPC) identifiers to grant access to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcIds;

    /**
     * <p>
     * The cluster identifier of the cluster to grant access to.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster to grant access to.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster to grant access to.
     * </p>
     * 
     * @return The cluster identifier of the cluster to grant access to.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier of the cluster to grant access to.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier of the cluster to grant access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeEndpointAccessRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The AWS account ID to grant access to.
     * </p>
     * 
     * @param account
     *        The AWS account ID to grant access to.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The AWS account ID to grant access to.
     * </p>
     * 
     * @return The AWS account ID to grant access to.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The AWS account ID to grant access to.
     * </p>
     * 
     * @param account
     *        The AWS account ID to grant access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeEndpointAccessRequest withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) identifiers to grant access to.
     * </p>
     * 
     * @return The virtual private cloud (VPC) identifiers to grant access to.
     */

    public java.util.List<String> getVpcIds() {
        if (vpcIds == null) {
            vpcIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcIds;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) identifiers to grant access to.
     * </p>
     * 
     * @param vpcIds
     *        The virtual private cloud (VPC) identifiers to grant access to.
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
     * The virtual private cloud (VPC) identifiers to grant access to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcIds(java.util.Collection)} or {@link #withVpcIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vpcIds
     *        The virtual private cloud (VPC) identifiers to grant access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeEndpointAccessRequest withVpcIds(String... vpcIds) {
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
     * The virtual private cloud (VPC) identifiers to grant access to.
     * </p>
     * 
     * @param vpcIds
     *        The virtual private cloud (VPC) identifiers to grant access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthorizeEndpointAccessRequest withVpcIds(java.util.Collection<String> vpcIds) {
        setVpcIds(vpcIds);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getVpcIds() != null)
            sb.append("VpcIds: ").append(getVpcIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthorizeEndpointAccessRequest == false)
            return false;
        AuthorizeEndpointAccessRequest other = (AuthorizeEndpointAccessRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getVpcIds() == null) ? 0 : getVpcIds().hashCode());
        return hashCode;
    }

    @Override
    public AuthorizeEndpointAccessRequest clone() {
        return (AuthorizeEndpointAccessRequest) super.clone();
    }

}
