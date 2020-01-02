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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RepositoryAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifying the repository association.
     * </p>
     */
    private String associationArn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, since the repository association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimeStamp;
    /**
     * <p>
     * The repository association ID.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The name of the repository association.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The owner of the repository association.
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
     * <dl>
     * <dt>Associated</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is associated with the repository.
     * </p>
     * </dd>
     * <dt>Associating</dt>
     * <dd>
     * <p>
     * The association is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The association failed. For more information about troubleshooting (or why it failed), see [troubleshooting
     * topic].
     * </p>
     * </dd>
     * <dt>Disassociating</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     * </p>
     * </dd>
     * </dl>
     */
    private String state;

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

    public RepositoryAssociationSummary withAssociationArn(String associationArn) {
        setAssociationArn(associationArn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, since the repository association was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time, in milliseconds since the epoch, since the repository association was last updated.
     */

    public void setLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, since the repository association was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, since the repository association was last updated.
     */

    public java.util.Date getLastUpdatedTimeStamp() {
        return this.lastUpdatedTimeStamp;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, since the repository association was last updated.
     * </p>
     * 
     * @param lastUpdatedTimeStamp
     *        The time, in milliseconds since the epoch, since the repository association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        setLastUpdatedTimeStamp(lastUpdatedTimeStamp);
        return this;
    }

    /**
     * <p>
     * The repository association ID.
     * </p>
     * 
     * @param associationId
     *        The repository association ID.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The repository association ID.
     * </p>
     * 
     * @return The repository association ID.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The repository association ID.
     * </p>
     * 
     * @param associationId
     *        The repository association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The name of the repository association.
     * </p>
     * 
     * @param name
     *        The name of the repository association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the repository association.
     * </p>
     * 
     * @return The name of the repository association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the repository association.
     * </p>
     * 
     * @param name
     *        The name of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The owner of the repository association.
     * </p>
     * 
     * @param owner
     *        The owner of the repository association.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the repository association.
     * </p>
     * 
     * @return The owner of the repository association.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the repository association.
     * </p>
     * 
     * @param owner
     *        The owner of the repository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAssociationSummary withOwner(String owner) {
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

    public RepositoryAssociationSummary withProviderType(String providerType) {
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

    public RepositoryAssociationSummary withProviderType(ProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <dl>
     * <dt>Associated</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is associated with the repository.
     * </p>
     * </dd>
     * <dt>Associating</dt>
     * <dd>
     * <p>
     * The association is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The association failed. For more information about troubleshooting (or why it failed), see [troubleshooting
     * topic].
     * </p>
     * </dd>
     * <dt>Disassociating</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param state
     *        The state of the repository association.</p>
     *        <dl>
     *        <dt>Associated</dt>
     *        <dd>
     *        <p>
     *        Amazon CodeGuru Reviewer is associated with the repository.
     *        </p>
     *        </dd>
     *        <dt>Associating</dt>
     *        <dd>
     *        <p>
     *        The association is in progress.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The association failed. For more information about troubleshooting (or why it failed), see
     *        [troubleshooting topic].
     *        </p>
     *        </dd>
     *        <dt>Disassociating</dt>
     *        <dd>
     *        <p>
     *        Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     *        </p>
     *        </dd>
     * @see RepositoryAssociationState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <dl>
     * <dt>Associated</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is associated with the repository.
     * </p>
     * </dd>
     * <dt>Associating</dt>
     * <dd>
     * <p>
     * The association is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The association failed. For more information about troubleshooting (or why it failed), see [troubleshooting
     * topic].
     * </p>
     * </dd>
     * <dt>Disassociating</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The state of the repository association.</p>
     *         <dl>
     *         <dt>Associated</dt>
     *         <dd>
     *         <p>
     *         Amazon CodeGuru Reviewer is associated with the repository.
     *         </p>
     *         </dd>
     *         <dt>Associating</dt>
     *         <dd>
     *         <p>
     *         The association is in progress.
     *         </p>
     *         </dd>
     *         <dt>Failed</dt>
     *         <dd>
     *         <p>
     *         The association failed. For more information about troubleshooting (or why it failed), see
     *         [troubleshooting topic].
     *         </p>
     *         </dd>
     *         <dt>Disassociating</dt>
     *         <dd>
     *         <p>
     *         Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     *         </p>
     *         </dd>
     * @see RepositoryAssociationState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <dl>
     * <dt>Associated</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is associated with the repository.
     * </p>
     * </dd>
     * <dt>Associating</dt>
     * <dd>
     * <p>
     * The association is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The association failed. For more information about troubleshooting (or why it failed), see [troubleshooting
     * topic].
     * </p>
     * </dd>
     * <dt>Disassociating</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param state
     *        The state of the repository association.</p>
     *        <dl>
     *        <dt>Associated</dt>
     *        <dd>
     *        <p>
     *        Amazon CodeGuru Reviewer is associated with the repository.
     *        </p>
     *        </dd>
     *        <dt>Associating</dt>
     *        <dd>
     *        <p>
     *        The association is in progress.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The association failed. For more information about troubleshooting (or why it failed), see
     *        [troubleshooting topic].
     *        </p>
     *        </dd>
     *        <dt>Disassociating</dt>
     *        <dd>
     *        <p>
     *        Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public RepositoryAssociationSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the repository association.
     * </p>
     * <dl>
     * <dt>Associated</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is associated with the repository.
     * </p>
     * </dd>
     * <dt>Associating</dt>
     * <dd>
     * <p>
     * The association is in progress.
     * </p>
     * </dd>
     * <dt>Failed</dt>
     * <dd>
     * <p>
     * The association failed. For more information about troubleshooting (or why it failed), see [troubleshooting
     * topic].
     * </p>
     * </dd>
     * <dt>Disassociating</dt>
     * <dd>
     * <p>
     * Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param state
     *        The state of the repository association.</p>
     *        <dl>
     *        <dt>Associated</dt>
     *        <dd>
     *        <p>
     *        Amazon CodeGuru Reviewer is associated with the repository.
     *        </p>
     *        </dd>
     *        <dt>Associating</dt>
     *        <dd>
     *        <p>
     *        The association is in progress.
     *        </p>
     *        </dd>
     *        <dt>Failed</dt>
     *        <dd>
     *        <p>
     *        The association failed. For more information about troubleshooting (or why it failed), see
     *        [troubleshooting topic].
     *        </p>
     *        </dd>
     *        <dt>Disassociating</dt>
     *        <dd>
     *        <p>
     *        Amazon CodeGuru Reviewer is in the process of disassociating with the repository.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryAssociationState
     */

    public RepositoryAssociationSummary withState(RepositoryAssociationState state) {
        this.state = state.toString();
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
        if (getAssociationArn() != null)
            sb.append("AssociationArn: ").append(getAssociationArn()).append(",");
        if (getLastUpdatedTimeStamp() != null)
            sb.append("LastUpdatedTimeStamp: ").append(getLastUpdatedTimeStamp()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryAssociationSummary == false)
            return false;
        RepositoryAssociationSummary other = (RepositoryAssociationSummary) obj;
        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null)
            return false;
        if (other.getAssociationArn() != null && other.getAssociationArn().equals(this.getAssociationArn()) == false)
            return false;
        if (other.getLastUpdatedTimeStamp() == null ^ this.getLastUpdatedTimeStamp() == null)
            return false;
        if (other.getLastUpdatedTimeStamp() != null && other.getLastUpdatedTimeStamp().equals(this.getLastUpdatedTimeStamp()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimeStamp() == null) ? 0 : getLastUpdatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryAssociationSummary clone() {
        try {
            return (RepositoryAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RepositoryAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
