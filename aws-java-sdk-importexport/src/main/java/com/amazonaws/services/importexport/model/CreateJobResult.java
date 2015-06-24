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
 * Output structure for the CreateJob operation.
 */
public class CreateJobResult implements Serializable, Cloneable {

    private String jobId;

    private String jobType;

    private String signature;

    private String signatureFileContents;

    private String warningMessage;

    private com.amazonaws.internal.SdkInternalList<Artifact> artifactList;

    /**
     * Sets the value of the JobId property for this object.
     * 
     * @param jobId
     *        The new value for the JobId property for this object.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * Returns the value of the JobId property for this object.
     * 
     * @return The value of the JobId property for this object.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Sets the value of the JobId property for this object.
     * 
     * @param jobId
     *        The new value for the JobId property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * Returns the value of the JobType property for this object.
     * 
     * @return The value of the JobType property for this object.
     * @see JobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public CreateJobResult withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public CreateJobResult withJobType(JobType jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * Sets the value of the Signature property for this object.
     * 
     * @param signature
     *        The new value for the Signature property for this object.
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Returns the value of the Signature property for this object.
     * 
     * @return The value of the Signature property for this object.
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * Sets the value of the Signature property for this object.
     * 
     * @param signature
     *        The new value for the Signature property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateJobResult withSignature(String signature) {
        setSignature(signature);
        return this;
    }

    /**
     * Sets the value of the SignatureFileContents property for this object.
     * 
     * @param signatureFileContents
     *        The new value for the SignatureFileContents property for this
     *        object.
     */
    public void setSignatureFileContents(String signatureFileContents) {
        this.signatureFileContents = signatureFileContents;
    }

    /**
     * Returns the value of the SignatureFileContents property for this object.
     * 
     * @return The value of the SignatureFileContents property for this object.
     */
    public String getSignatureFileContents() {
        return this.signatureFileContents;
    }

    /**
     * Sets the value of the SignatureFileContents property for this object.
     * 
     * @param signatureFileContents
     *        The new value for the SignatureFileContents property for this
     *        object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateJobResult withSignatureFileContents(
            String signatureFileContents) {
        setSignatureFileContents(signatureFileContents);
        return this;
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
    public CreateJobResult withWarningMessage(String warningMessage) {
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
    public CreateJobResult withArtifactList(Artifact... artifactList) {
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
    public CreateJobResult withArtifactList(
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getSignature() != null)
            sb.append("Signature: " + getSignature() + ",");
        if (getSignatureFileContents() != null)
            sb.append("SignatureFileContents: " + getSignatureFileContents()
                    + ",");
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

        if (obj instanceof CreateJobResult == false)
            return false;
        CreateJobResult other = (CreateJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null
                && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null
                && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null
                && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getSignatureFileContents() == null
                ^ this.getSignatureFileContents() == null)
            return false;
        if (other.getSignatureFileContents() != null
                && other.getSignatureFileContents().equals(
                        this.getSignatureFileContents()) == false)
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
                + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode
                + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode
                + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime
                * hashCode
                + ((getSignatureFileContents() == null) ? 0
                        : getSignatureFileContents().hashCode());
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
    public CreateJobResult clone() {
        try {
            return (CreateJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}