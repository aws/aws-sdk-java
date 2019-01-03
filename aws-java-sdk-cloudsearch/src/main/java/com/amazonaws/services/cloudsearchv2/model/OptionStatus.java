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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The status of domain configuration option.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionStatus implements Serializable, Cloneable {

    /**
     * <p>
     * A timestamp for when this option was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * A timestamp for when this option was last updated.
     * </p>
     */
    private java.util.Date updateDate;
    /**
     * <p>
     * A unique integer that indicates when this option was last updated.
     * </p>
     */
    private Integer updateVersion;
    /**
     * <p>
     * The state of processing a change to an option. Possible values:
     * </p>
     * <ul>
     * <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     * <a>IndexDocuments</a> has been called and indexing is complete.</li>
     * <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     * <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     * <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be used
     * to index the data. You must either modify the option value or update or remove the incompatible documents.</li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * Indicates that the option will be deleted once processing is complete.
     * </p>
     */
    private Boolean pendingDeletion;

    /**
     * <p>
     * A timestamp for when this option was created.
     * </p>
     * 
     * @param creationDate
     *        A timestamp for when this option was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * A timestamp for when this option was created.
     * </p>
     * 
     * @return A timestamp for when this option was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * A timestamp for when this option was created.
     * </p>
     * 
     * @param creationDate
     *        A timestamp for when this option was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionStatus withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * A timestamp for when this option was last updated.
     * </p>
     * 
     * @param updateDate
     *        A timestamp for when this option was last updated.
     */

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * A timestamp for when this option was last updated.
     * </p>
     * 
     * @return A timestamp for when this option was last updated.
     */

    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * A timestamp for when this option was last updated.
     * </p>
     * 
     * @param updateDate
     *        A timestamp for when this option was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionStatus withUpdateDate(java.util.Date updateDate) {
        setUpdateDate(updateDate);
        return this;
    }

    /**
     * <p>
     * A unique integer that indicates when this option was last updated.
     * </p>
     * 
     * @param updateVersion
     *        A unique integer that indicates when this option was last updated.
     */

    public void setUpdateVersion(Integer updateVersion) {
        this.updateVersion = updateVersion;
    }

    /**
     * <p>
     * A unique integer that indicates when this option was last updated.
     * </p>
     * 
     * @return A unique integer that indicates when this option was last updated.
     */

    public Integer getUpdateVersion() {
        return this.updateVersion;
    }

    /**
     * <p>
     * A unique integer that indicates when this option was last updated.
     * </p>
     * 
     * @param updateVersion
     *        A unique integer that indicates when this option was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionStatus withUpdateVersion(Integer updateVersion) {
        setUpdateVersion(updateVersion);
        return this;
    }

    /**
     * <p>
     * The state of processing a change to an option. Possible values:
     * </p>
     * <ul>
     * <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     * <a>IndexDocuments</a> has been called and indexing is complete.</li>
     * <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     * <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     * <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be used
     * to index the data. You must either modify the option value or update or remove the incompatible documents.</li>
     * </ul>
     * 
     * @param state
     *        The state of processing a change to an option. Possible values:</p>
     *        <ul>
     *        <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     *        <a>IndexDocuments</a> has been called and indexing is complete.</li>
     *        <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     *        <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     *        <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be
     *        used to index the data. You must either modify the option value or update or remove the incompatible
     *        documents.</li>
     * @see OptionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of processing a change to an option. Possible values:
     * </p>
     * <ul>
     * <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     * <a>IndexDocuments</a> has been called and indexing is complete.</li>
     * <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     * <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     * <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be used
     * to index the data. You must either modify the option value or update or remove the incompatible documents.</li>
     * </ul>
     * 
     * @return The state of processing a change to an option. Possible values:</p>
     *         <ul>
     *         <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     *         <a>IndexDocuments</a> has been called and indexing is complete.</li>
     *         <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     *         <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     *         <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot
     *         be used to index the data. You must either modify the option value or update or remove the incompatible
     *         documents.</li>
     * @see OptionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of processing a change to an option. Possible values:
     * </p>
     * <ul>
     * <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     * <a>IndexDocuments</a> has been called and indexing is complete.</li>
     * <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     * <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     * <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be used
     * to index the data. You must either modify the option value or update or remove the incompatible documents.</li>
     * </ul>
     * 
     * @param state
     *        The state of processing a change to an option. Possible values:</p>
     *        <ul>
     *        <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     *        <a>IndexDocuments</a> has been called and indexing is complete.</li>
     *        <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     *        <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     *        <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be
     *        used to index the data. You must either modify the option value or update or remove the incompatible
     *        documents.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptionState
     */

    public OptionStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of processing a change to an option. Possible values:
     * </p>
     * <ul>
     * <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     * <a>IndexDocuments</a> has been called and indexing is complete.</li>
     * <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     * <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     * <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be used
     * to index the data. You must either modify the option value or update or remove the incompatible documents.</li>
     * </ul>
     * 
     * @param state
     *        The state of processing a change to an option. Possible values:</p>
     *        <ul>
     *        <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     *        <a>IndexDocuments</a> has been called and indexing is complete.</li>
     *        <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     *        <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     *        <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be
     *        used to index the data. You must either modify the option value or update or remove the incompatible
     *        documents.</li>
     * @see OptionState
     */

    public void setState(OptionState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of processing a change to an option. Possible values:
     * </p>
     * <ul>
     * <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     * <a>IndexDocuments</a> has been called and indexing is complete.</li>
     * <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     * <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     * <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be used
     * to index the data. You must either modify the option value or update or remove the incompatible documents.</li>
     * </ul>
     * 
     * @param state
     *        The state of processing a change to an option. Possible values:</p>
     *        <ul>
     *        <li> <code>RequiresIndexDocuments</code>: the option's latest value will not be deployed until
     *        <a>IndexDocuments</a> has been called and indexing is complete.</li>
     *        <li> <code>Processing</code>: the option's latest value is in the process of being activated.</li>
     *        <li> <code>Active</code>: the option's latest value is completely deployed.</li>
     *        <li> <code>FailedToValidate</code>: the option value is not compatible with the domain's data and cannot be
     *        used to index the data. You must either modify the option value or update or remove the incompatible
     *        documents.</li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OptionState
     */

    public OptionStatus withState(OptionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Indicates that the option will be deleted once processing is complete.
     * </p>
     * 
     * @param pendingDeletion
     *        Indicates that the option will be deleted once processing is complete.
     */

    public void setPendingDeletion(Boolean pendingDeletion) {
        this.pendingDeletion = pendingDeletion;
    }

    /**
     * <p>
     * Indicates that the option will be deleted once processing is complete.
     * </p>
     * 
     * @return Indicates that the option will be deleted once processing is complete.
     */

    public Boolean getPendingDeletion() {
        return this.pendingDeletion;
    }

    /**
     * <p>
     * Indicates that the option will be deleted once processing is complete.
     * </p>
     * 
     * @param pendingDeletion
     *        Indicates that the option will be deleted once processing is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionStatus withPendingDeletion(Boolean pendingDeletion) {
        setPendingDeletion(pendingDeletion);
        return this;
    }

    /**
     * <p>
     * Indicates that the option will be deleted once processing is complete.
     * </p>
     * 
     * @return Indicates that the option will be deleted once processing is complete.
     */

    public Boolean isPendingDeletion() {
        return this.pendingDeletion;
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: ").append(getUpdateDate()).append(",");
        if (getUpdateVersion() != null)
            sb.append("UpdateVersion: ").append(getUpdateVersion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getPendingDeletion() != null)
            sb.append("PendingDeletion: ").append(getPendingDeletion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionStatus == false)
            return false;
        OptionStatus other = (OptionStatus) obj;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        if (other.getUpdateVersion() == null ^ this.getUpdateVersion() == null)
            return false;
        if (other.getUpdateVersion() != null && other.getUpdateVersion().equals(this.getUpdateVersion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPendingDeletion() == null ^ this.getPendingDeletion() == null)
            return false;
        if (other.getPendingDeletion() != null && other.getPendingDeletion().equals(this.getPendingDeletion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateVersion() == null) ? 0 : getUpdateVersion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPendingDeletion() == null) ? 0 : getPendingDeletion().hashCode());
        return hashCode;
    }

    @Override
    public OptionStatus clone() {
        try {
            return (OptionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
