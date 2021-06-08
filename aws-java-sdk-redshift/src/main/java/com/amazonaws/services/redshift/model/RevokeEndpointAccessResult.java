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

/**
 * <p>
 * Describes an endpoint authorization for authorizing Redshift-managed VPC endpoint access to a cluster across AWS
 * accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevokeEndpointAccess" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeEndpointAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID of the cluster owner.
     * </p>
     */
    private String grantor;
    /**
     * <p>
     * The AWS account ID of the grantee of the cluster.
     * </p>
     */
    private String grantee;
    /**
     * <p>
     * The cluster identifier.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The time (UTC) when the authorization was created.
     * </p>
     */
    private java.util.Date authorizeTime;
    /**
     * <p>
     * The status of the cluster.
     * </p>
     */
    private String clusterStatus;
    /**
     * <p>
     * The status of the authorization action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * </p>
     */
    private Boolean allowedAllVPCs;
    /**
     * <p>
     * The VPCs allowed access to the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allowedVPCs;
    /**
     * <p>
     * The number of Redshift-managed VPC endpoints created for the authorization.
     * </p>
     */
    private Integer endpointCount;

    /**
     * <p>
     * The AWS account ID of the cluster owner.
     * </p>
     * 
     * @param grantor
     *        The AWS account ID of the cluster owner.
     */

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    /**
     * <p>
     * The AWS account ID of the cluster owner.
     * </p>
     * 
     * @return The AWS account ID of the cluster owner.
     */

    public String getGrantor() {
        return this.grantor;
    }

    /**
     * <p>
     * The AWS account ID of the cluster owner.
     * </p>
     * 
     * @param grantor
     *        The AWS account ID of the cluster owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withGrantor(String grantor) {
        setGrantor(grantor);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the grantee of the cluster.
     * </p>
     * 
     * @param grantee
     *        The AWS account ID of the grantee of the cluster.
     */

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    /**
     * <p>
     * The AWS account ID of the grantee of the cluster.
     * </p>
     * 
     * @return The AWS account ID of the grantee of the cluster.
     */

    public String getGrantee() {
        return this.grantee;
    }

    /**
     * <p>
     * The AWS account ID of the grantee of the cluster.
     * </p>
     * 
     * @param grantee
     *        The AWS account ID of the grantee of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withGrantee(String grantee) {
        setGrantee(grantee);
        return this;
    }

    /**
     * <p>
     * The cluster identifier.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier.
     * </p>
     * 
     * @return The cluster identifier.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The time (UTC) when the authorization was created.
     * </p>
     * 
     * @param authorizeTime
     *        The time (UTC) when the authorization was created.
     */

    public void setAuthorizeTime(java.util.Date authorizeTime) {
        this.authorizeTime = authorizeTime;
    }

    /**
     * <p>
     * The time (UTC) when the authorization was created.
     * </p>
     * 
     * @return The time (UTC) when the authorization was created.
     */

    public java.util.Date getAuthorizeTime() {
        return this.authorizeTime;
    }

    /**
     * <p>
     * The time (UTC) when the authorization was created.
     * </p>
     * 
     * @param authorizeTime
     *        The time (UTC) when the authorization was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withAuthorizeTime(java.util.Date authorizeTime) {
        setAuthorizeTime(authorizeTime);
        return this;
    }

    /**
     * <p>
     * The status of the cluster.
     * </p>
     * 
     * @param clusterStatus
     *        The status of the cluster.
     */

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    /**
     * <p>
     * The status of the cluster.
     * </p>
     * 
     * @return The status of the cluster.
     */

    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * <p>
     * The status of the cluster.
     * </p>
     * 
     * @param clusterStatus
     *        The status of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withClusterStatus(String clusterStatus) {
        setClusterStatus(clusterStatus);
        return this;
    }

    /**
     * <p>
     * The status of the authorization action.
     * </p>
     * 
     * @param status
     *        The status of the authorization action.
     * @see AuthorizationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the authorization action.
     * </p>
     * 
     * @return The status of the authorization action.
     * @see AuthorizationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the authorization action.
     * </p>
     * 
     * @param status
     *        The status of the authorization action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationStatus
     */

    public RevokeEndpointAccessResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the authorization action.
     * </p>
     * 
     * @param status
     *        The status of the authorization action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationStatus
     */

    public RevokeEndpointAccessResult withStatus(AuthorizationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * </p>
     * 
     * @param allowedAllVPCs
     *        Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     */

    public void setAllowedAllVPCs(Boolean allowedAllVPCs) {
        this.allowedAllVPCs = allowedAllVPCs;
    }

    /**
     * <p>
     * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * </p>
     * 
     * @return Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     */

    public Boolean getAllowedAllVPCs() {
        return this.allowedAllVPCs;
    }

    /**
     * <p>
     * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * </p>
     * 
     * @param allowedAllVPCs
     *        Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withAllowedAllVPCs(Boolean allowedAllVPCs) {
        setAllowedAllVPCs(allowedAllVPCs);
        return this;
    }

    /**
     * <p>
     * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     * </p>
     * 
     * @return Indicates whether all VPCs in the grantee account are allowed access to the cluster.
     */

    public Boolean isAllowedAllVPCs() {
        return this.allowedAllVPCs;
    }

    /**
     * <p>
     * The VPCs allowed access to the cluster.
     * </p>
     * 
     * @return The VPCs allowed access to the cluster.
     */

    public java.util.List<String> getAllowedVPCs() {
        if (allowedVPCs == null) {
            allowedVPCs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allowedVPCs;
    }

    /**
     * <p>
     * The VPCs allowed access to the cluster.
     * </p>
     * 
     * @param allowedVPCs
     *        The VPCs allowed access to the cluster.
     */

    public void setAllowedVPCs(java.util.Collection<String> allowedVPCs) {
        if (allowedVPCs == null) {
            this.allowedVPCs = null;
            return;
        }

        this.allowedVPCs = new com.amazonaws.internal.SdkInternalList<String>(allowedVPCs);
    }

    /**
     * <p>
     * The VPCs allowed access to the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedVPCs(java.util.Collection)} or {@link #withAllowedVPCs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param allowedVPCs
     *        The VPCs allowed access to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withAllowedVPCs(String... allowedVPCs) {
        if (this.allowedVPCs == null) {
            setAllowedVPCs(new com.amazonaws.internal.SdkInternalList<String>(allowedVPCs.length));
        }
        for (String ele : allowedVPCs) {
            this.allowedVPCs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPCs allowed access to the cluster.
     * </p>
     * 
     * @param allowedVPCs
     *        The VPCs allowed access to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withAllowedVPCs(java.util.Collection<String> allowedVPCs) {
        setAllowedVPCs(allowedVPCs);
        return this;
    }

    /**
     * <p>
     * The number of Redshift-managed VPC endpoints created for the authorization.
     * </p>
     * 
     * @param endpointCount
     *        The number of Redshift-managed VPC endpoints created for the authorization.
     */

    public void setEndpointCount(Integer endpointCount) {
        this.endpointCount = endpointCount;
    }

    /**
     * <p>
     * The number of Redshift-managed VPC endpoints created for the authorization.
     * </p>
     * 
     * @return The number of Redshift-managed VPC endpoints created for the authorization.
     */

    public Integer getEndpointCount() {
        return this.endpointCount;
    }

    /**
     * <p>
     * The number of Redshift-managed VPC endpoints created for the authorization.
     * </p>
     * 
     * @param endpointCount
     *        The number of Redshift-managed VPC endpoints created for the authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeEndpointAccessResult withEndpointCount(Integer endpointCount) {
        setEndpointCount(endpointCount);
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
        if (getGrantor() != null)
            sb.append("Grantor: ").append(getGrantor()).append(",");
        if (getGrantee() != null)
            sb.append("Grantee: ").append(getGrantee()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getAuthorizeTime() != null)
            sb.append("AuthorizeTime: ").append(getAuthorizeTime()).append(",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: ").append(getClusterStatus()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAllowedAllVPCs() != null)
            sb.append("AllowedAllVPCs: ").append(getAllowedAllVPCs()).append(",");
        if (getAllowedVPCs() != null)
            sb.append("AllowedVPCs: ").append(getAllowedVPCs()).append(",");
        if (getEndpointCount() != null)
            sb.append("EndpointCount: ").append(getEndpointCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeEndpointAccessResult == false)
            return false;
        RevokeEndpointAccessResult other = (RevokeEndpointAccessResult) obj;
        if (other.getGrantor() == null ^ this.getGrantor() == null)
            return false;
        if (other.getGrantor() != null && other.getGrantor().equals(this.getGrantor()) == false)
            return false;
        if (other.getGrantee() == null ^ this.getGrantee() == null)
            return false;
        if (other.getGrantee() != null && other.getGrantee().equals(this.getGrantee()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getAuthorizeTime() == null ^ this.getAuthorizeTime() == null)
            return false;
        if (other.getAuthorizeTime() != null && other.getAuthorizeTime().equals(this.getAuthorizeTime()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAllowedAllVPCs() == null ^ this.getAllowedAllVPCs() == null)
            return false;
        if (other.getAllowedAllVPCs() != null && other.getAllowedAllVPCs().equals(this.getAllowedAllVPCs()) == false)
            return false;
        if (other.getAllowedVPCs() == null ^ this.getAllowedVPCs() == null)
            return false;
        if (other.getAllowedVPCs() != null && other.getAllowedVPCs().equals(this.getAllowedVPCs()) == false)
            return false;
        if (other.getEndpointCount() == null ^ this.getEndpointCount() == null)
            return false;
        if (other.getEndpointCount() != null && other.getEndpointCount().equals(this.getEndpointCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrantor() == null) ? 0 : getGrantor().hashCode());
        hashCode = prime * hashCode + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAuthorizeTime() == null) ? 0 : getAuthorizeTime().hashCode());
        hashCode = prime * hashCode + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAllowedAllVPCs() == null) ? 0 : getAllowedAllVPCs().hashCode());
        hashCode = prime * hashCode + ((getAllowedVPCs() == null) ? 0 : getAllowedVPCs().hashCode());
        hashCode = prime * hashCode + ((getEndpointCount() == null) ? 0 : getEndpointCount().hashCode());
        return hashCode;
    }

    @Override
    public RevokeEndpointAccessResult clone() {
        try {
            return (RevokeEndpointAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
