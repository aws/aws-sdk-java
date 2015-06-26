/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.importexport.model;

import java.io.Serializable;

/**
 * Output structure for the UpateJob operation.
 */
public class UpdateJobResult implements Serializable, Cloneable {

    private Boolean success;

    private String warningMessage;

    private com.amazonaws.internal.SdkInternalList<Artifact> artifactList;

    /**
     * Sets the value of the Success property for this object.
     * 
     * @param success
     *        The new value for the Success property for this object.
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * Returns the value of the Success property for this object.
     * 
     * @return The value of the Success property for this object.
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * Sets the value of the Success property for this object.
     * 
     * @param success
     *        The new value for the Success property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateJobResult withSuccess(Boolean success) {
        setSuccess(success);
        return this;
    }

    /**
     * Returns the value of the Success property for this object.
     * 
     * @return The value of the Success property for this object.
     */
    public Boolean isSuccess() {
        return this.success;
    }

    /**
     * Sets the value of the WarningMessage property for this object.
     * 
     * @param warningMessage
     *        The new value for the WarningMessage property for this object.
     */
    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    /**
     * Returns the value of the WarningMessage property for this object.
     * 
     * @return The value of the WarningMessage property for this object.
     */
    public String getWarningMessage() {
        return this.warningMessage;
    }

    /**
     * Sets the value of the WarningMessage property for this object.
     * 
     * @param warningMessage
     *        The new value for the WarningMessage property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateJobResult withWarningMessage(String warningMessage) {
        setWarningMessage(warningMessage);
        return this;
    }

    /**
     * Returns the value of the ArtifactList property for this object.
     * 
     * @return The value of the ArtifactList property for this object.
     */
    public java.util.List<Artifact> getArtifactList() {
        if (artifactList == null) {
            artifactList = new com.amazonaws.internal.SdkInternalList<Artifact>();
        }
        return artifactList;
    }

    /**
     * Sets the value of the ArtifactList property for this object.
     * 
     * @param artifactList
     *        The new value for the ArtifactList property for this object.
     */
    public void setArtifactList(java.util.Collection<Artifact> artifactList) {
        if (artifactList == null) {
            this.artifactList = null;
            return;
        }

        this.artifactList = new com.amazonaws.internal.SdkInternalList<Artifact>(
                artifactList);
    }

    /**
     * Sets the value of the ArtifactList property for this object.
     * 
     * @param artifactList
     *        The new value for the ArtifactList property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateJobResult withArtifactList(Artifact... artifactList) {
        if (this.artifactList == null) {
            setArtifactList(new com.amazonaws.internal.SdkInternalList<Artifact>(
                    artifactList.length));
        }
        for (Artifact ele : artifactList) {
            this.artifactList.add(ele);
        }
        return this;
    }

    /**
     * Sets the value of the ArtifactList property for this object.
     * 
     * @param artifactList
     *        The new value for the ArtifactList property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateJobResult withArtifactList(
            java.util.Collection<Artifact> artifactList) {
        setArtifactList(artifactList);
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
        if (getSuccess() != null)
            sb.append("Success: " + getSuccess() + ",");
        if (getWarningMessage() != null)
            sb.append("WarningMessage: " + getWarningMessage() + ",");
        if (getArtifactList() != null)
            sb.append("ArtifactList: " + getArtifactList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobResult == false)
            return false;
        UpdateJobResult other = (UpdateJobResult) obj;
        if (other.getSuccess() == null ^ this.getSuccess() == null)
            return false;
        if (other.getSuccess() != null
                && other.getSuccess().equals(this.getSuccess()) == false)
            return false;
        if (other.getWarningMessage() == null
                ^ this.getWarningMessage() == null)
            return false;
        if (other.getWarningMessage() != null
                && other.getWarningMessage().equals(this.getWarningMessage()) == false)
            return false;
        if (other.getArtifactList() == null ^ this.getArtifactList() == null)
            return false;
        if (other.getArtifactList() != null
                && other.getArtifactList().equals(this.getArtifactList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSuccess() == null) ? 0 : getSuccess().hashCode());
        hashCode = prime
                * hashCode
                + ((getWarningMessage() == null) ? 0 : getWarningMessage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getArtifactList() == null) ? 0 : getArtifactList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobResult clone() {
        try {
            return (UpdateJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}