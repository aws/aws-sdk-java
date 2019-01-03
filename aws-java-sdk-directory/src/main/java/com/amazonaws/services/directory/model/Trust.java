/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a trust relationship between an AWS Managed Microsoft AD directory and an external domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/Trust" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Trust implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Directory ID of the AWS directory involved in the trust relationship.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The unique ID of the trust relationship.
     * </p>
     */
    private String trustId;
    /**
     * <p>
     * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
     * </p>
     */
    private String remoteDomainName;
    /**
     * <p>
     * The trust relationship type. <code>Forest</code> is the default.
     * </p>
     */
    private String trustType;
    /**
     * <p>
     * The trust relationship direction.
     * </p>
     */
    private String trustDirection;
    /**
     * <p>
     * The trust relationship state.
     * </p>
     */
    private String trustState;
    /**
     * <p>
     * The date and time that the trust relationship was created.
     * </p>
     */
    private java.util.Date createdDateTime;
    /**
     * <p>
     * The date and time that the trust relationship was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The date and time that the TrustState was last updated.
     * </p>
     */
    private java.util.Date stateLastUpdatedDateTime;
    /**
     * <p>
     * The reason for the TrustState.
     * </p>
     */
    private String trustStateReason;
    /**
     * <p>
     * Current state of selective authentication for the trust.
     * </p>
     */
    private String selectiveAuth;

    /**
     * <p>
     * The Directory ID of the AWS directory involved in the trust relationship.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID of the AWS directory involved in the trust relationship.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The Directory ID of the AWS directory involved in the trust relationship.
     * </p>
     * 
     * @return The Directory ID of the AWS directory involved in the trust relationship.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The Directory ID of the AWS directory involved in the trust relationship.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID of the AWS directory involved in the trust relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trust withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The unique ID of the trust relationship.
     * </p>
     * 
     * @param trustId
     *        The unique ID of the trust relationship.
     */

    public void setTrustId(String trustId) {
        this.trustId = trustId;
    }

    /**
     * <p>
     * The unique ID of the trust relationship.
     * </p>
     * 
     * @return The unique ID of the trust relationship.
     */

    public String getTrustId() {
        return this.trustId;
    }

    /**
     * <p>
     * The unique ID of the trust relationship.
     * </p>
     * 
     * @param trustId
     *        The unique ID of the trust relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trust withTrustId(String trustId) {
        setTrustId(trustId);
        return this;
    }

    /**
     * <p>
     * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
     * </p>
     * 
     * @param remoteDomainName
     *        The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
     */

    public void setRemoteDomainName(String remoteDomainName) {
        this.remoteDomainName = remoteDomainName;
    }

    /**
     * <p>
     * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
     * </p>
     * 
     * @return The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
     */

    public String getRemoteDomainName() {
        return this.remoteDomainName;
    }

    /**
     * <p>
     * The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
     * </p>
     * 
     * @param remoteDomainName
     *        The Fully Qualified Domain Name (FQDN) of the external domain involved in the trust relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trust withRemoteDomainName(String remoteDomainName) {
        setRemoteDomainName(remoteDomainName);
        return this;
    }

    /**
     * <p>
     * The trust relationship type. <code>Forest</code> is the default.
     * </p>
     * 
     * @param trustType
     *        The trust relationship type. <code>Forest</code> is the default.
     * @see TrustType
     */

    public void setTrustType(String trustType) {
        this.trustType = trustType;
    }

    /**
     * <p>
     * The trust relationship type. <code>Forest</code> is the default.
     * </p>
     * 
     * @return The trust relationship type. <code>Forest</code> is the default.
     * @see TrustType
     */

    public String getTrustType() {
        return this.trustType;
    }

    /**
     * <p>
     * The trust relationship type. <code>Forest</code> is the default.
     * </p>
     * 
     * @param trustType
     *        The trust relationship type. <code>Forest</code> is the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustType
     */

    public Trust withTrustType(String trustType) {
        setTrustType(trustType);
        return this;
    }

    /**
     * <p>
     * The trust relationship type. <code>Forest</code> is the default.
     * </p>
     * 
     * @param trustType
     *        The trust relationship type. <code>Forest</code> is the default.
     * @see TrustType
     */

    public void setTrustType(TrustType trustType) {
        withTrustType(trustType);
    }

    /**
     * <p>
     * The trust relationship type. <code>Forest</code> is the default.
     * </p>
     * 
     * @param trustType
     *        The trust relationship type. <code>Forest</code> is the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustType
     */

    public Trust withTrustType(TrustType trustType) {
        this.trustType = trustType.toString();
        return this;
    }

    /**
     * <p>
     * The trust relationship direction.
     * </p>
     * 
     * @param trustDirection
     *        The trust relationship direction.
     * @see TrustDirection
     */

    public void setTrustDirection(String trustDirection) {
        this.trustDirection = trustDirection;
    }

    /**
     * <p>
     * The trust relationship direction.
     * </p>
     * 
     * @return The trust relationship direction.
     * @see TrustDirection
     */

    public String getTrustDirection() {
        return this.trustDirection;
    }

    /**
     * <p>
     * The trust relationship direction.
     * </p>
     * 
     * @param trustDirection
     *        The trust relationship direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustDirection
     */

    public Trust withTrustDirection(String trustDirection) {
        setTrustDirection(trustDirection);
        return this;
    }

    /**
     * <p>
     * The trust relationship direction.
     * </p>
     * 
     * @param trustDirection
     *        The trust relationship direction.
     * @see TrustDirection
     */

    public void setTrustDirection(TrustDirection trustDirection) {
        withTrustDirection(trustDirection);
    }

    /**
     * <p>
     * The trust relationship direction.
     * </p>
     * 
     * @param trustDirection
     *        The trust relationship direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustDirection
     */

    public Trust withTrustDirection(TrustDirection trustDirection) {
        this.trustDirection = trustDirection.toString();
        return this;
    }

    /**
     * <p>
     * The trust relationship state.
     * </p>
     * 
     * @param trustState
     *        The trust relationship state.
     * @see TrustState
     */

    public void setTrustState(String trustState) {
        this.trustState = trustState;
    }

    /**
     * <p>
     * The trust relationship state.
     * </p>
     * 
     * @return The trust relationship state.
     * @see TrustState
     */

    public String getTrustState() {
        return this.trustState;
    }

    /**
     * <p>
     * The trust relationship state.
     * </p>
     * 
     * @param trustState
     *        The trust relationship state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustState
     */

    public Trust withTrustState(String trustState) {
        setTrustState(trustState);
        return this;
    }

    /**
     * <p>
     * The trust relationship state.
     * </p>
     * 
     * @param trustState
     *        The trust relationship state.
     * @see TrustState
     */

    public void setTrustState(TrustState trustState) {
        withTrustState(trustState);
    }

    /**
     * <p>
     * The trust relationship state.
     * </p>
     * 
     * @param trustState
     *        The trust relationship state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustState
     */

    public Trust withTrustState(TrustState trustState) {
        this.trustState = trustState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the trust relationship was created.
     * </p>
     * 
     * @param createdDateTime
     *        The date and time that the trust relationship was created.
     */

    public void setCreatedDateTime(java.util.Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * <p>
     * The date and time that the trust relationship was created.
     * </p>
     * 
     * @return The date and time that the trust relationship was created.
     */

    public java.util.Date getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * <p>
     * The date and time that the trust relationship was created.
     * </p>
     * 
     * @param createdDateTime
     *        The date and time that the trust relationship was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trust withCreatedDateTime(java.util.Date createdDateTime) {
        setCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the trust relationship was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the trust relationship was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the trust relationship was last updated.
     * </p>
     * 
     * @return The date and time that the trust relationship was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the trust relationship was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the trust relationship was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trust withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the TrustState was last updated.
     * </p>
     * 
     * @param stateLastUpdatedDateTime
     *        The date and time that the TrustState was last updated.
     */

    public void setStateLastUpdatedDateTime(java.util.Date stateLastUpdatedDateTime) {
        this.stateLastUpdatedDateTime = stateLastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the TrustState was last updated.
     * </p>
     * 
     * @return The date and time that the TrustState was last updated.
     */

    public java.util.Date getStateLastUpdatedDateTime() {
        return this.stateLastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the TrustState was last updated.
     * </p>
     * 
     * @param stateLastUpdatedDateTime
     *        The date and time that the TrustState was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trust withStateLastUpdatedDateTime(java.util.Date stateLastUpdatedDateTime) {
        setStateLastUpdatedDateTime(stateLastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The reason for the TrustState.
     * </p>
     * 
     * @param trustStateReason
     *        The reason for the TrustState.
     */

    public void setTrustStateReason(String trustStateReason) {
        this.trustStateReason = trustStateReason;
    }

    /**
     * <p>
     * The reason for the TrustState.
     * </p>
     * 
     * @return The reason for the TrustState.
     */

    public String getTrustStateReason() {
        return this.trustStateReason;
    }

    /**
     * <p>
     * The reason for the TrustState.
     * </p>
     * 
     * @param trustStateReason
     *        The reason for the TrustState.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trust withTrustStateReason(String trustStateReason) {
        setTrustStateReason(trustStateReason);
        return this;
    }

    /**
     * <p>
     * Current state of selective authentication for the trust.
     * </p>
     * 
     * @param selectiveAuth
     *        Current state of selective authentication for the trust.
     * @see SelectiveAuth
     */

    public void setSelectiveAuth(String selectiveAuth) {
        this.selectiveAuth = selectiveAuth;
    }

    /**
     * <p>
     * Current state of selective authentication for the trust.
     * </p>
     * 
     * @return Current state of selective authentication for the trust.
     * @see SelectiveAuth
     */

    public String getSelectiveAuth() {
        return this.selectiveAuth;
    }

    /**
     * <p>
     * Current state of selective authentication for the trust.
     * </p>
     * 
     * @param selectiveAuth
     *        Current state of selective authentication for the trust.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectiveAuth
     */

    public Trust withSelectiveAuth(String selectiveAuth) {
        setSelectiveAuth(selectiveAuth);
        return this;
    }

    /**
     * <p>
     * Current state of selective authentication for the trust.
     * </p>
     * 
     * @param selectiveAuth
     *        Current state of selective authentication for the trust.
     * @see SelectiveAuth
     */

    public void setSelectiveAuth(SelectiveAuth selectiveAuth) {
        withSelectiveAuth(selectiveAuth);
    }

    /**
     * <p>
     * Current state of selective authentication for the trust.
     * </p>
     * 
     * @param selectiveAuth
     *        Current state of selective authentication for the trust.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectiveAuth
     */

    public Trust withSelectiveAuth(SelectiveAuth selectiveAuth) {
        this.selectiveAuth = selectiveAuth.toString();
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getTrustId() != null)
            sb.append("TrustId: ").append(getTrustId()).append(",");
        if (getRemoteDomainName() != null)
            sb.append("RemoteDomainName: ").append(getRemoteDomainName()).append(",");
        if (getTrustType() != null)
            sb.append("TrustType: ").append(getTrustType()).append(",");
        if (getTrustDirection() != null)
            sb.append("TrustDirection: ").append(getTrustDirection()).append(",");
        if (getTrustState() != null)
            sb.append("TrustState: ").append(getTrustState()).append(",");
        if (getCreatedDateTime() != null)
            sb.append("CreatedDateTime: ").append(getCreatedDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getStateLastUpdatedDateTime() != null)
            sb.append("StateLastUpdatedDateTime: ").append(getStateLastUpdatedDateTime()).append(",");
        if (getTrustStateReason() != null)
            sb.append("TrustStateReason: ").append(getTrustStateReason()).append(",");
        if (getSelectiveAuth() != null)
            sb.append("SelectiveAuth: ").append(getSelectiveAuth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Trust == false)
            return false;
        Trust other = (Trust) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getTrustId() == null ^ this.getTrustId() == null)
            return false;
        if (other.getTrustId() != null && other.getTrustId().equals(this.getTrustId()) == false)
            return false;
        if (other.getRemoteDomainName() == null ^ this.getRemoteDomainName() == null)
            return false;
        if (other.getRemoteDomainName() != null && other.getRemoteDomainName().equals(this.getRemoteDomainName()) == false)
            return false;
        if (other.getTrustType() == null ^ this.getTrustType() == null)
            return false;
        if (other.getTrustType() != null && other.getTrustType().equals(this.getTrustType()) == false)
            return false;
        if (other.getTrustDirection() == null ^ this.getTrustDirection() == null)
            return false;
        if (other.getTrustDirection() != null && other.getTrustDirection().equals(this.getTrustDirection()) == false)
            return false;
        if (other.getTrustState() == null ^ this.getTrustState() == null)
            return false;
        if (other.getTrustState() != null && other.getTrustState().equals(this.getTrustState()) == false)
            return false;
        if (other.getCreatedDateTime() == null ^ this.getCreatedDateTime() == null)
            return false;
        if (other.getCreatedDateTime() != null && other.getCreatedDateTime().equals(this.getCreatedDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getStateLastUpdatedDateTime() == null ^ this.getStateLastUpdatedDateTime() == null)
            return false;
        if (other.getStateLastUpdatedDateTime() != null && other.getStateLastUpdatedDateTime().equals(this.getStateLastUpdatedDateTime()) == false)
            return false;
        if (other.getTrustStateReason() == null ^ this.getTrustStateReason() == null)
            return false;
        if (other.getTrustStateReason() != null && other.getTrustStateReason().equals(this.getTrustStateReason()) == false)
            return false;
        if (other.getSelectiveAuth() == null ^ this.getSelectiveAuth() == null)
            return false;
        if (other.getSelectiveAuth() != null && other.getSelectiveAuth().equals(this.getSelectiveAuth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getTrustId() == null) ? 0 : getTrustId().hashCode());
        hashCode = prime * hashCode + ((getRemoteDomainName() == null) ? 0 : getRemoteDomainName().hashCode());
        hashCode = prime * hashCode + ((getTrustType() == null) ? 0 : getTrustType().hashCode());
        hashCode = prime * hashCode + ((getTrustDirection() == null) ? 0 : getTrustDirection().hashCode());
        hashCode = prime * hashCode + ((getTrustState() == null) ? 0 : getTrustState().hashCode());
        hashCode = prime * hashCode + ((getCreatedDateTime() == null) ? 0 : getCreatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStateLastUpdatedDateTime() == null) ? 0 : getStateLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getTrustStateReason() == null) ? 0 : getTrustStateReason().hashCode());
        hashCode = prime * hashCode + ((getSelectiveAuth() == null) ? 0 : getSelectiveAuth().hashCode());
        return hashCode;
    }

    @Override
    public Trust clone() {
        try {
            return (Trust) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.TrustMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
