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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a repository association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RepositoryAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The id of the repository association.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     */
    private String associationArn;
    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the repository.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The state of the repository association.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description of why the repository association is in the current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimeStamp;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository association was created.
     * </p>
     */
    private java.util.Date createdTimeStamp;

    /**
     * <p>
     * The id of the repository association.
     * </p>
     * 
     * @param associationId
     *        The id of the repository association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The id of the repository association.
     * </p>
     * 
     * @return The id of the repository association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The id of the repository association.
     * </p>
     * 
     * @param associationId
     *        The id of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociation withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) identifying the repository association.
     */

    public void setAssociationArn(String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) identifying the repository association.
     */

    public String getAssociationArn() {
        return this.associationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     * 
     * @param associationArn
     *        The Amazon Resource Name (ARN) identifying the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociation withAssociationArn(String associationArn) {
        setAssociationArn(associationArn);
        return this;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param name
     *        The name of the repository.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param name
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the repository.
     * </p>
     * 
     * @param owner
     *        The owner of the repository.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the repository.
     * </p>
     * 
     * @return The owner of the repository.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the repository.
     * </p>
     * 
     * @param owner
     *        The owner of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociation withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @see ProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @return The provider type of the repository association.
     * @see ProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public RepositoryAssociation withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The provider type of the repository association.
     * </p>
     * 
     * @param providerType
     *        The provider type of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProviderType
     */

    public RepositoryAssociation withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * 
     * @param state
     *        The state of the repository association.
     * @see RepositoryAssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * 
     * @return The state of the repository association.
     * @see RepositoryAssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * 
     * @param state
     *        The state of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public RepositoryAssociation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * 
     * @param state
     *        The state of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public RepositoryAssociation withState(RepositoryAssociationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of why the repository association is in the current state.
     * </p>
     * 
     * @param stateReason
     *        A description of why the repository association is in the current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * A description of why the repository association is in the current state.
     * </p>
     * 
     * @return A description of why the repository association is in the current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * A description of why the repository association is in the current state.
     * </p>
     * 
     * @param stateReason
     *        A description of why the repository association is in the current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociation withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository association was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time, in milliseconds since the epoch, when the repository association was last updated.
     */

    public void setLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository association was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the repository association was last updated.
     */

    public java.util.Date getLastUpdatedTimeStamp() {
        return this.lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository association was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time, in milliseconds since the epoch, when the repository association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociation withLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        setLastUpdatedTimeStamp(lastUpdatedTimeStamp);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository association was created.
     * </p>
     * 
     * @param createdTimeStamp
     *        The time, in milliseconds since the epoch, when the repository association was created.
     */

    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository association was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the repository association was created.
     */

    public java.util.Date getCreatedTimeStamp() {
        return this.createdTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the repository association was created.
     * </p>
     * 
     * @param createdTimeStamp
     *        The time, in milliseconds since the epoch, when the repository association was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociation withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        setCreatedTimeStamp(createdTimeStamp);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getAssociationArn() != null)
            sb.append("AssociationArn: ").append(getAssociationArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getLastUpdatedTimeStamp() != null)
            sb.append("LastUpdatedTimeStamp: ").append(getLastUpdatedTimeStamp()).append(",");
        if (getCreatedTimeStamp() != null)
            sb.append("CreatedTimeStamp: ").append(getCreatedTimeStamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryAssociation == false)
            return false;
        RepositoryAssociation other = (RepositoryAssociation) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null)
            return false;
        if (other.getAssociationArn() != null && other.getAssociationArn().equals(this.getAssociationArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getLastUpdatedTimeStamp() == null ^ this.getLastUpdatedTimeStamp() == null)
            return false;
        if (other.getLastUpdatedTimeStamp() != null && other.getLastUpdatedTimeStamp().equals(this.getLastUpdatedTimeStamp()) == false)
            return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null)
            return false;
        if (other.getCreatedTimeStamp() != null && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimeStamp() == null) ? 0 : getLastUpdatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryAssociation clone() {
        try {
            return (RepositoryAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RepositoryAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
