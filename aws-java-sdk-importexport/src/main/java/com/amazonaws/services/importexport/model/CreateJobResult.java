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
package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Output structure for the CreateJob operation.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String jobId;

    private String jobType;

    private String signature;

    private String signatureFileContents;

    private String warningMessage;

    private com.amazonaws.internal.SdkInternalList<Artifact> artifactList;

    /**
     * @param jobId
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * @param jobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * @param jobType
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * @return
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * @param jobType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateJobResult withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * @param jobType
     * @see JobType
     */

    public void setJobType(JobType jobType) {
        withJobType(jobType);
    }

    /**
     * @param jobType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public CreateJobResult withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * @param signature
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * @return
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * @param signature
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withSignature(String signature) {
        setSignature(signature);
        return this;
    }

    /**
     * @param signatureFileContents
     */

    public void setSignatureFileContents(String signatureFileContents) {
        this.signatureFileContents = signatureFileContents;
    }

    /**
     * @return
     */

    public String getSignatureFileContents() {
        return this.signatureFileContents;
    }

    /**
     * @param signatureFileContents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withSignatureFileContents(String signatureFileContents) {
        setSignatureFileContents(signatureFileContents);
        return this;
    }

    /**
     * @param warningMessage
     */

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    /**
     * @return
     */

    public String getWarningMessage() {
        return this.warningMessage;
    }

    /**
     * @param warningMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withWarningMessage(String warningMessage) {
        setWarningMessage(warningMessage);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Artifact> getArtifactList() {
        if (artifactList == null) {
            artifactList = new com.amazonaws.internal.SdkInternalList<Artifact>();
        }
        return artifactList;
    }

    /**
     * @param artifactList
     */

    public void setArtifactList(java.util.Collection<Artifact> artifactList) {
        if (artifactList == null) {
            this.artifactList = null;
            return;
        }

        this.artifactList = new com.amazonaws.internal.SdkInternalList<Artifact>(artifactList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArtifactList(java.util.Collection)} or {@link #withArtifactList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param artifactList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withArtifactList(Artifact... artifactList) {
        if (this.artifactList == null) {
            setArtifactList(new com.amazonaws.internal.SdkInternalList<Artifact>(artifactList.length));
        }
        for (Artifact ele : artifactList) {
            this.artifactList.add(ele);
        }
        return this;
    }

    /**
     * @param artifactList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobResult withArtifactList(java.util.Collection<Artifact> artifactList) {
        setArtifactList(artifactList);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature()).append(",");
        if (getSignatureFileContents() != null)
            sb.append("SignatureFileContents: ").append(getSignatureFileContents()).append(",");
        if (getWarningMessage() != null)
            sb.append("WarningMessage: ").append(getWarningMessage()).append(",");
        if (getArtifactList() != null)
            sb.append("ArtifactList: ").append(getArtifactList());
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
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getSignatureFileContents() == null ^ this.getSignatureFileContents() == null)
            return false;
        if (other.getSignatureFileContents() != null && other.getSignatureFileContents().equals(this.getSignatureFileContents()) == false)
            return false;
        if (other.getWarningMessage() == null ^ this.getWarningMessage() == null)
            return false;
        if (other.getWarningMessage() != null && other.getWarningMessage().equals(this.getWarningMessage()) == false)
            return false;
        if (other.getArtifactList() == null ^ this.getArtifactList() == null)
            return false;
        if (other.getArtifactList() != null && other.getArtifactList().equals(this.getArtifactList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getSignatureFileContents() == null) ? 0 : getSignatureFileContents().hashCode());
        hashCode = prime * hashCode + ((getWarningMessage() == null) ? 0 : getWarningMessage().hashCode());
        hashCode = prime * hashCode + ((getArtifactList() == null) ? 0 : getArtifactList().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobResult clone() {
        try {
            return (CreateJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
