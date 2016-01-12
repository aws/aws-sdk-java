/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * Describes a trust relationship between an Microsoft AD in the AWS cloud and
 * an external domain.
 */
public class Trust implements Serializable, Cloneable {

    /**
     * The Directory ID of the AWS directory involved in the trust relationship.
     */
    private String directoryId;
    /** The unique ID of the trust relationship. */
    private String trustId;
    /**
     * The Fully Qualified Domain Name (FQDN) of the external domain involved in
     * the trust relationship.
     */
    private String remoteDomainName;
    /** The trust relationship type. */
    private String trustType;
    /** The trust relationship direction. */
    private String trustDirection;
    /** The trust relationship state. */
    private String trustState;
    /** The date and time that the trust relationship was created. */
    private java.util.Date createdDateTime;
    /** The date and time that the trust relationship was last updated. */
    private java.util.Date lastUpdatedDateTime;
    /** The date and time that the TrustState was last updated. */
    private java.util.Date stateLastUpdatedDateTime;

    /**
     * The Directory ID of the AWS directory involved in the trust relationship.
     * 
     * @param directoryId
     *        The Directory ID of the AWS directory involved in the trust
     *        relationship.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * The Directory ID of the AWS directory involved in the trust relationship.
     * 
     * @return The Directory ID of the AWS directory involved in the trust
     *         relationship.
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * The Directory ID of the AWS directory involved in the trust relationship.
     * 
     * @param directoryId
     *        The Directory ID of the AWS directory involved in the trust
     *        relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Trust withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * The unique ID of the trust relationship.
     * 
     * @param trustId
     *        The unique ID of the trust relationship.
     */
    public void setTrustId(String trustId) {
        this.trustId = trustId;
    }

    /**
     * The unique ID of the trust relationship.
     * 
     * @return The unique ID of the trust relationship.
     */
    public String getTrustId() {
        return this.trustId;
    }

    /**
     * The unique ID of the trust relationship.
     * 
     * @param trustId
     *        The unique ID of the trust relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Trust withTrustId(String trustId) {
        setTrustId(trustId);
        return this;
    }

    /**
     * The Fully Qualified Domain Name (FQDN) of the external domain involved in
     * the trust relationship.
     * 
     * @param remoteDomainName
     *        The Fully Qualified Domain Name (FQDN) of the external domain
     *        involved in the trust relationship.
     */
    public void setRemoteDomainName(String remoteDomainName) {
        this.remoteDomainName = remoteDomainName;
    }

    /**
     * The Fully Qualified Domain Name (FQDN) of the external domain involved in
     * the trust relationship.
     * 
     * @return The Fully Qualified Domain Name (FQDN) of the external domain
     *         involved in the trust relationship.
     */
    public String getRemoteDomainName() {
        return this.remoteDomainName;
    }

    /**
     * The Fully Qualified Domain Name (FQDN) of the external domain involved in
     * the trust relationship.
     * 
     * @param remoteDomainName
     *        The Fully Qualified Domain Name (FQDN) of the external domain
     *        involved in the trust relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Trust withRemoteDomainName(String remoteDomainName) {
        setRemoteDomainName(remoteDomainName);
        return this;
    }

    /**
     * The trust relationship type.
     * 
     * @param trustType
     *        The trust relationship type.
     * @see TrustType
     */
    public void setTrustType(String trustType) {
        this.trustType = trustType;
    }

    /**
     * The trust relationship type.
     * 
     * @return The trust relationship type.
     * @see TrustType
     */
    public String getTrustType() {
        return this.trustType;
    }

    /**
     * The trust relationship type.
     * 
     * @param trustType
     *        The trust relationship type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustType
     */
    public Trust withTrustType(String trustType) {
        setTrustType(trustType);
        return this;
    }

    /**
     * The trust relationship type.
     * 
     * @param trustType
     *        The trust relationship type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustType
     */
    public void setTrustType(TrustType trustType) {
        this.trustType = trustType.toString();
    }

    /**
     * The trust relationship type.
     * 
     * @param trustType
     *        The trust relationship type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustType
     */
    public Trust withTrustType(TrustType trustType) {
        setTrustType(trustType);
        return this;
    }

    /**
     * The trust relationship direction.
     * 
     * @param trustDirection
     *        The trust relationship direction.
     * @see TrustDirection
     */
    public void setTrustDirection(String trustDirection) {
        this.trustDirection = trustDirection;
    }

    /**
     * The trust relationship direction.
     * 
     * @return The trust relationship direction.
     * @see TrustDirection
     */
    public String getTrustDirection() {
        return this.trustDirection;
    }

    /**
     * The trust relationship direction.
     * 
     * @param trustDirection
     *        The trust relationship direction.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustDirection
     */
    public Trust withTrustDirection(String trustDirection) {
        setTrustDirection(trustDirection);
        return this;
    }

    /**
     * The trust relationship direction.
     * 
     * @param trustDirection
     *        The trust relationship direction.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustDirection
     */
    public void setTrustDirection(TrustDirection trustDirection) {
        this.trustDirection = trustDirection.toString();
    }

    /**
     * The trust relationship direction.
     * 
     * @param trustDirection
     *        The trust relationship direction.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustDirection
     */
    public Trust withTrustDirection(TrustDirection trustDirection) {
        setTrustDirection(trustDirection);
        return this;
    }

    /**
     * The trust relationship state.
     * 
     * @param trustState
     *        The trust relationship state.
     * @see TrustState
     */
    public void setTrustState(String trustState) {
        this.trustState = trustState;
    }

    /**
     * The trust relationship state.
     * 
     * @return The trust relationship state.
     * @see TrustState
     */
    public String getTrustState() {
        return this.trustState;
    }

    /**
     * The trust relationship state.
     * 
     * @param trustState
     *        The trust relationship state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustState
     */
    public Trust withTrustState(String trustState) {
        setTrustState(trustState);
        return this;
    }

    /**
     * The trust relationship state.
     * 
     * @param trustState
     *        The trust relationship state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustState
     */
    public void setTrustState(TrustState trustState) {
        this.trustState = trustState.toString();
    }

    /**
     * The trust relationship state.
     * 
     * @param trustState
     *        The trust relationship state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustState
     */
    public Trust withTrustState(TrustState trustState) {
        setTrustState(trustState);
        return this;
    }

    /**
     * The date and time that the trust relationship was created.
     * 
     * @param createdDateTime
     *        The date and time that the trust relationship was created.
     */
    public void setCreatedDateTime(java.util.Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * The date and time that the trust relationship was created.
     * 
     * @return The date and time that the trust relationship was created.
     */
    public java.util.Date getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * The date and time that the trust relationship was created.
     * 
     * @param createdDateTime
     *        The date and time that the trust relationship was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Trust withCreatedDateTime(java.util.Date createdDateTime) {
        setCreatedDateTime(createdDateTime);
        return this;
    }

    /**
     * The date and time that the trust relationship was last updated.
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the trust relationship was last updated.
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * The date and time that the trust relationship was last updated.
     * 
     * @return The date and time that the trust relationship was last updated.
     */
    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * The date and time that the trust relationship was last updated.
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the trust relationship was last updated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Trust withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * The date and time that the TrustState was last updated.
     * 
     * @param stateLastUpdatedDateTime
     *        The date and time that the TrustState was last updated.
     */
    public void setStateLastUpdatedDateTime(
            java.util.Date stateLastUpdatedDateTime) {
        this.stateLastUpdatedDateTime = stateLastUpdatedDateTime;
    }

    /**
     * The date and time that the TrustState was last updated.
     * 
     * @return The date and time that the TrustState was last updated.
     */
    public java.util.Date getStateLastUpdatedDateTime() {
        return this.stateLastUpdatedDateTime;
    }

    /**
     * The date and time that the TrustState was last updated.
     * 
     * @param stateLastUpdatedDateTime
     *        The date and time that the TrustState was last updated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Trust withStateLastUpdatedDateTime(
            java.util.Date stateLastUpdatedDateTime) {
        setStateLastUpdatedDateTime(stateLastUpdatedDateTime);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getTrustId() != null)
            sb.append("TrustId: " + getTrustId() + ",");
        if (getRemoteDomainName() != null)
            sb.append("RemoteDomainName: " + getRemoteDomainName() + ",");
        if (getTrustType() != null)
            sb.append("TrustType: " + getTrustType() + ",");
        if (getTrustDirection() != null)
            sb.append("TrustDirection: " + getTrustDirection() + ",");
        if (getTrustState() != null)
            sb.append("TrustState: " + getTrustState() + ",");
        if (getCreatedDateTime() != null)
            sb.append("CreatedDateTime: " + getCreatedDateTime() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: " + getLastUpdatedDateTime() + ",");
        if (getStateLastUpdatedDateTime() != null)
            sb.append("StateLastUpdatedDateTime: "
                    + getStateLastUpdatedDateTime());
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
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getTrustId() == null ^ this.getTrustId() == null)
            return false;
        if (other.getTrustId() != null
                && other.getTrustId().equals(this.getTrustId()) == false)
            return false;
        if (other.getRemoteDomainName() == null
                ^ this.getRemoteDomainName() == null)
            return false;
        if (other.getRemoteDomainName() != null
                && other.getRemoteDomainName().equals(
                        this.getRemoteDomainName()) == false)
            return false;
        if (other.getTrustType() == null ^ this.getTrustType() == null)
            return false;
        if (other.getTrustType() != null
                && other.getTrustType().equals(this.getTrustType()) == false)
            return false;
        if (other.getTrustDirection() == null
                ^ this.getTrustDirection() == null)
            return false;
        if (other.getTrustDirection() != null
                && other.getTrustDirection().equals(this.getTrustDirection()) == false)
            return false;
        if (other.getTrustState() == null ^ this.getTrustState() == null)
            return false;
        if (other.getTrustState() != null
                && other.getTrustState().equals(this.getTrustState()) == false)
            return false;
        if (other.getCreatedDateTime() == null
                ^ this.getCreatedDateTime() == null)
            return false;
        if (other.getCreatedDateTime() != null
                && other.getCreatedDateTime().equals(this.getCreatedDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null
                ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(
                        this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getStateLastUpdatedDateTime() == null
                ^ this.getStateLastUpdatedDateTime() == null)
            return false;
        if (other.getStateLastUpdatedDateTime() != null
                && other.getStateLastUpdatedDateTime().equals(
                        this.getStateLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode
                + ((getTrustId() == null) ? 0 : getTrustId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoteDomainName() == null) ? 0 : getRemoteDomainName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTrustType() == null) ? 0 : getTrustType().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrustDirection() == null) ? 0 : getTrustDirection()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTrustState() == null) ? 0 : getTrustState().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreatedDateTime() == null) ? 0 : getCreatedDateTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0
                        : getLastUpdatedDateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateLastUpdatedDateTime() == null) ? 0
                        : getStateLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public Trust clone() {
        try {
            return (Trust) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}