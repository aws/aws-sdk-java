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
 * Output structure for the GetStatus operation.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String jobId;

    private String jobType;

    private String locationCode;

    private String locationMessage;

    private String progressCode;

    private String progressMessage;

    private String carrier;

    private String trackingNumber;

    private String logBucket;

    private String logKey;

    private Integer errorCount;

    private String signature;

    private String signatureFileContents;

    private String currentManifest;

    private java.util.Date creationDate;

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

    public GetStatusResult withJobId(String jobId) {
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

    public GetStatusResult withJobType(String jobType) {
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

    public GetStatusResult withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * @param locationCode
     */

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * @return
     */

    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * @param locationCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withLocationCode(String locationCode) {
        setLocationCode(locationCode);
        return this;
    }

    /**
     * @param locationMessage
     */

    public void setLocationMessage(String locationMessage) {
        this.locationMessage = locationMessage;
    }

    /**
     * @return
     */

    public String getLocationMessage() {
        return this.locationMessage;
    }

    /**
     * @param locationMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withLocationMessage(String locationMessage) {
        setLocationMessage(locationMessage);
        return this;
    }

    /**
     * @param progressCode
     */

    public void setProgressCode(String progressCode) {
        this.progressCode = progressCode;
    }

    /**
     * @return
     */

    public String getProgressCode() {
        return this.progressCode;
    }

    /**
     * @param progressCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withProgressCode(String progressCode) {
        setProgressCode(progressCode);
        return this;
    }

    /**
     * @param progressMessage
     */

    public void setProgressMessage(String progressMessage) {
        this.progressMessage = progressMessage;
    }

    /**
     * @return
     */

    public String getProgressMessage() {
        return this.progressMessage;
    }

    /**
     * @param progressMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withProgressMessage(String progressMessage) {
        setProgressMessage(progressMessage);
        return this;
    }

    /**
     * @param carrier
     */

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * @return
     */

    public String getCarrier() {
        return this.carrier;
    }

    /**
     * @param carrier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withCarrier(String carrier) {
        setCarrier(carrier);
        return this;
    }

    /**
     * @param trackingNumber
     */

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * @return
     */

    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    /**
     * @param trackingNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withTrackingNumber(String trackingNumber) {
        setTrackingNumber(trackingNumber);
        return this;
    }

    /**
     * @param logBucket
     */

    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }

    /**
     * @return
     */

    public String getLogBucket() {
        return this.logBucket;
    }

    /**
     * @param logBucket
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withLogBucket(String logBucket) {
        setLogBucket(logBucket);
        return this;
    }

    /**
     * @param logKey
     */

    public void setLogKey(String logKey) {
        this.logKey = logKey;
    }

    /**
     * @return
     */

    public String getLogKey() {
        return this.logKey;
    }

    /**
     * @param logKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withLogKey(String logKey) {
        setLogKey(logKey);
        return this;
    }

    /**
     * @param errorCount
     */

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * @return
     */

    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * @param errorCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withErrorCount(Integer errorCount) {
        setErrorCount(errorCount);
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

    public GetStatusResult withSignature(String signature) {
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

    public GetStatusResult withSignatureFileContents(String signatureFileContents) {
        setSignatureFileContents(signatureFileContents);
        return this;
    }

    /**
     * @param currentManifest
     */

    public void setCurrentManifest(String currentManifest) {
        this.currentManifest = currentManifest;
    }

    /**
     * @return
     */

    public String getCurrentManifest() {
        return this.currentManifest;
    }

    /**
     * @param currentManifest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withCurrentManifest(String currentManifest) {
        setCurrentManifest(currentManifest);
        return this;
    }

    /**
     * @param creationDate
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * @param creationDate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatusResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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

    public GetStatusResult withArtifactList(Artifact... artifactList) {
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

    public GetStatusResult withArtifactList(java.util.Collection<Artifact> artifactList) {
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
        if (getLocationCode() != null)
            sb.append("LocationCode: ").append(getLocationCode()).append(",");
        if (getLocationMessage() != null)
            sb.append("LocationMessage: ").append(getLocationMessage()).append(",");
        if (getProgressCode() != null)
            sb.append("ProgressCode: ").append(getProgressCode()).append(",");
        if (getProgressMessage() != null)
            sb.append("ProgressMessage: ").append(getProgressMessage()).append(",");
        if (getCarrier() != null)
            sb.append("Carrier: ").append(getCarrier()).append(",");
        if (getTrackingNumber() != null)
            sb.append("TrackingNumber: ").append(getTrackingNumber()).append(",");
        if (getLogBucket() != null)
            sb.append("LogBucket: ").append(getLogBucket()).append(",");
        if (getLogKey() != null)
            sb.append("LogKey: ").append(getLogKey()).append(",");
        if (getErrorCount() != null)
            sb.append("ErrorCount: ").append(getErrorCount()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature()).append(",");
        if (getSignatureFileContents() != null)
            sb.append("SignatureFileContents: ").append(getSignatureFileContents()).append(",");
        if (getCurrentManifest() != null)
            sb.append("CurrentManifest: ").append(getCurrentManifest()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
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

        if (obj instanceof GetStatusResult == false)
            return false;
        GetStatusResult other = (GetStatusResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getLocationCode() == null ^ this.getLocationCode() == null)
            return false;
        if (other.getLocationCode() != null && other.getLocationCode().equals(this.getLocationCode()) == false)
            return false;
        if (other.getLocationMessage() == null ^ this.getLocationMessage() == null)
            return false;
        if (other.getLocationMessage() != null && other.getLocationMessage().equals(this.getLocationMessage()) == false)
            return false;
        if (other.getProgressCode() == null ^ this.getProgressCode() == null)
            return false;
        if (other.getProgressCode() != null && other.getProgressCode().equals(this.getProgressCode()) == false)
            return false;
        if (other.getProgressMessage() == null ^ this.getProgressMessage() == null)
            return false;
        if (other.getProgressMessage() != null && other.getProgressMessage().equals(this.getProgressMessage()) == false)
            return false;
        if (other.getCarrier() == null ^ this.getCarrier() == null)
            return false;
        if (other.getCarrier() != null && other.getCarrier().equals(this.getCarrier()) == false)
            return false;
        if (other.getTrackingNumber() == null ^ this.getTrackingNumber() == null)
            return false;
        if (other.getTrackingNumber() != null && other.getTrackingNumber().equals(this.getTrackingNumber()) == false)
            return false;
        if (other.getLogBucket() == null ^ this.getLogBucket() == null)
            return false;
        if (other.getLogBucket() != null && other.getLogBucket().equals(this.getLogBucket()) == false)
            return false;
        if (other.getLogKey() == null ^ this.getLogKey() == null)
            return false;
        if (other.getLogKey() != null && other.getLogKey().equals(this.getLogKey()) == false)
            return false;
        if (other.getErrorCount() == null ^ this.getErrorCount() == null)
            return false;
        if (other.getErrorCount() != null && other.getErrorCount().equals(this.getErrorCount()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        if (other.getSignatureFileContents() == null ^ this.getSignatureFileContents() == null)
            return false;
        if (other.getSignatureFileContents() != null && other.getSignatureFileContents().equals(this.getSignatureFileContents()) == false)
            return false;
        if (other.getCurrentManifest() == null ^ this.getCurrentManifest() == null)
            return false;
        if (other.getCurrentManifest() != null && other.getCurrentManifest().equals(this.getCurrentManifest()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
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
        hashCode = prime * hashCode + ((getLocationCode() == null) ? 0 : getLocationCode().hashCode());
        hashCode = prime * hashCode + ((getLocationMessage() == null) ? 0 : getLocationMessage().hashCode());
        hashCode = prime * hashCode + ((getProgressCode() == null) ? 0 : getProgressCode().hashCode());
        hashCode = prime * hashCode + ((getProgressMessage() == null) ? 0 : getProgressMessage().hashCode());
        hashCode = prime * hashCode + ((getCarrier() == null) ? 0 : getCarrier().hashCode());
        hashCode = prime * hashCode + ((getTrackingNumber() == null) ? 0 : getTrackingNumber().hashCode());
        hashCode = prime * hashCode + ((getLogBucket() == null) ? 0 : getLogBucket().hashCode());
        hashCode = prime * hashCode + ((getLogKey() == null) ? 0 : getLogKey().hashCode());
        hashCode = prime * hashCode + ((getErrorCount() == null) ? 0 : getErrorCount().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime * hashCode + ((getSignatureFileContents() == null) ? 0 : getSignatureFileContents().hashCode());
        hashCode = prime * hashCode + ((getCurrentManifest() == null) ? 0 : getCurrentManifest().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getArtifactList() == null) ? 0 : getArtifactList().hashCode());
        return hashCode;
    }

    @Override
    public GetStatusResult clone() {
        try {
            return (GetStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
