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
 * Output structure for the GetStatus operation.
 */
public class GetStatusResult implements Serializable, Cloneable {

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
    public GetStatusResult withJobId(String jobId) {
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
    public GetStatusResult withJobType(String jobType) {
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
    public GetStatusResult withJobType(JobType jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * Sets the value of the LocationCode property for this object.
     * 
     * @param locationCode
     *        The new value for the LocationCode property for this object.
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * Returns the value of the LocationCode property for this object.
     * 
     * @return The value of the LocationCode property for this object.
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Sets the value of the LocationCode property for this object.
     * 
     * @param locationCode
     *        The new value for the LocationCode property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withLocationCode(String locationCode) {
        setLocationCode(locationCode);
        return this;
    }

    /**
     * Sets the value of the LocationMessage property for this object.
     * 
     * @param locationMessage
     *        The new value for the LocationMessage property for this object.
     */
    public void setLocationMessage(String locationMessage) {
        this.locationMessage = locationMessage;
    }

    /**
     * Returns the value of the LocationMessage property for this object.
     * 
     * @return The value of the LocationMessage property for this object.
     */
    public String getLocationMessage() {
        return this.locationMessage;
    }

    /**
     * Sets the value of the LocationMessage property for this object.
     * 
     * @param locationMessage
     *        The new value for the LocationMessage property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withLocationMessage(String locationMessage) {
        setLocationMessage(locationMessage);
        return this;
    }

    /**
     * Sets the value of the ProgressCode property for this object.
     * 
     * @param progressCode
     *        The new value for the ProgressCode property for this object.
     */
    public void setProgressCode(String progressCode) {
        this.progressCode = progressCode;
    }

    /**
     * Returns the value of the ProgressCode property for this object.
     * 
     * @return The value of the ProgressCode property for this object.
     */
    public String getProgressCode() {
        return this.progressCode;
    }

    /**
     * Sets the value of the ProgressCode property for this object.
     * 
     * @param progressCode
     *        The new value for the ProgressCode property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withProgressCode(String progressCode) {
        setProgressCode(progressCode);
        return this;
    }

    /**
     * Sets the value of the ProgressMessage property for this object.
     * 
     * @param progressMessage
     *        The new value for the ProgressMessage property for this object.
     */
    public void setProgressMessage(String progressMessage) {
        this.progressMessage = progressMessage;
    }

    /**
     * Returns the value of the ProgressMessage property for this object.
     * 
     * @return The value of the ProgressMessage property for this object.
     */
    public String getProgressMessage() {
        return this.progressMessage;
    }

    /**
     * Sets the value of the ProgressMessage property for this object.
     * 
     * @param progressMessage
     *        The new value for the ProgressMessage property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withProgressMessage(String progressMessage) {
        setProgressMessage(progressMessage);
        return this;
    }

    /**
     * Sets the value of the Carrier property for this object.
     * 
     * @param carrier
     *        The new value for the Carrier property for this object.
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * Returns the value of the Carrier property for this object.
     * 
     * @return The value of the Carrier property for this object.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Sets the value of the Carrier property for this object.
     * 
     * @param carrier
     *        The new value for the Carrier property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withCarrier(String carrier) {
        setCarrier(carrier);
        return this;
    }

    /**
     * Sets the value of the TrackingNumber property for this object.
     * 
     * @param trackingNumber
     *        The new value for the TrackingNumber property for this object.
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * Returns the value of the TrackingNumber property for this object.
     * 
     * @return The value of the TrackingNumber property for this object.
     */
    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    /**
     * Sets the value of the TrackingNumber property for this object.
     * 
     * @param trackingNumber
     *        The new value for the TrackingNumber property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withTrackingNumber(String trackingNumber) {
        setTrackingNumber(trackingNumber);
        return this;
    }

    /**
     * Sets the value of the LogBucket property for this object.
     * 
     * @param logBucket
     *        The new value for the LogBucket property for this object.
     */
    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }

    /**
     * Returns the value of the LogBucket property for this object.
     * 
     * @return The value of the LogBucket property for this object.
     */
    public String getLogBucket() {
        return this.logBucket;
    }

    /**
     * Sets the value of the LogBucket property for this object.
     * 
     * @param logBucket
     *        The new value for the LogBucket property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withLogBucket(String logBucket) {
        setLogBucket(logBucket);
        return this;
    }

    /**
     * Sets the value of the LogKey property for this object.
     * 
     * @param logKey
     *        The new value for the LogKey property for this object.
     */
    public void setLogKey(String logKey) {
        this.logKey = logKey;
    }

    /**
     * Returns the value of the LogKey property for this object.
     * 
     * @return The value of the LogKey property for this object.
     */
    public String getLogKey() {
        return this.logKey;
    }

    /**
     * Sets the value of the LogKey property for this object.
     * 
     * @param logKey
     *        The new value for the LogKey property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withLogKey(String logKey) {
        setLogKey(logKey);
        return this;
    }

    /**
     * Sets the value of the ErrorCount property for this object.
     * 
     * @param errorCount
     *        The new value for the ErrorCount property for this object.
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * Returns the value of the ErrorCount property for this object.
     * 
     * @return The value of the ErrorCount property for this object.
     */
    public Integer getErrorCount() {
        return this.errorCount;
    }

    /**
     * Sets the value of the ErrorCount property for this object.
     * 
     * @param errorCount
     *        The new value for the ErrorCount property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withErrorCount(Integer errorCount) {
        setErrorCount(errorCount);
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
    public GetStatusResult withSignature(String signature) {
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
    public GetStatusResult withSignatureFileContents(
            String signatureFileContents) {
        setSignatureFileContents(signatureFileContents);
        return this;
    }

    /**
     * Sets the value of the CurrentManifest property for this object.
     * 
     * @param currentManifest
     *        The new value for the CurrentManifest property for this object.
     */
    public void setCurrentManifest(String currentManifest) {
        this.currentManifest = currentManifest;
    }

    /**
     * Returns the value of the CurrentManifest property for this object.
     * 
     * @return The value of the CurrentManifest property for this object.
     */
    public String getCurrentManifest() {
        return this.currentManifest;
    }

    /**
     * Sets the value of the CurrentManifest property for this object.
     * 
     * @param currentManifest
     *        The new value for the CurrentManifest property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withCurrentManifest(String currentManifest) {
        setCurrentManifest(currentManifest);
        return this;
    }

    /**
     * Sets the value of the CreationDate property for this object.
     * 
     * @param creationDate
     *        The new value for the CreationDate property for this object.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Returns the value of the CreationDate property for this object.
     * 
     * @return The value of the CreationDate property for this object.
     */
    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * Sets the value of the CreationDate property for this object.
     * 
     * @param creationDate
     *        The new value for the CreationDate property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetStatusResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
    public GetStatusResult withArtifactList(Artifact... artifactList) {
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
    public GetStatusResult withArtifactList(
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
        if (getLocationCode() != null)
            sb.append("LocationCode: " + getLocationCode() + ",");
        if (getLocationMessage() != null)
            sb.append("LocationMessage: " + getLocationMessage() + ",");
        if (getProgressCode() != null)
            sb.append("ProgressCode: " + getProgressCode() + ",");
        if (getProgressMessage() != null)
            sb.append("ProgressMessage: " + getProgressMessage() + ",");
        if (getCarrier() != null)
            sb.append("Carrier: " + getCarrier() + ",");
        if (getTrackingNumber() != null)
            sb.append("TrackingNumber: " + getTrackingNumber() + ",");
        if (getLogBucket() != null)
            sb.append("LogBucket: " + getLogBucket() + ",");
        if (getLogKey() != null)
            sb.append("LogKey: " + getLogKey() + ",");
        if (getErrorCount() != null)
            sb.append("ErrorCount: " + getErrorCount() + ",");
        if (getSignature() != null)
            sb.append("Signature: " + getSignature() + ",");
        if (getSignatureFileContents() != null)
            sb.append("SignatureFileContents: " + getSignatureFileContents()
                    + ",");
        if (getCurrentManifest() != null)
            sb.append("CurrentManifest: " + getCurrentManifest() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
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

        if (obj instanceof GetStatusResult == false)
            return false;
        GetStatusResult other = (GetStatusResult) obj;
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
        if (other.getLocationCode() == null ^ this.getLocationCode() == null)
            return false;
        if (other.getLocationCode() != null
                && other.getLocationCode().equals(this.getLocationCode()) == false)
            return false;
        if (other.getLocationMessage() == null
                ^ this.getLocationMessage() == null)
            return false;
        if (other.getLocationMessage() != null
                && other.getLocationMessage().equals(this.getLocationMessage()) == false)
            return false;
        if (other.getProgressCode() == null ^ this.getProgressCode() == null)
            return false;
        if (other.getProgressCode() != null
                && other.getProgressCode().equals(this.getProgressCode()) == false)
            return false;
        if (other.getProgressMessage() == null
                ^ this.getProgressMessage() == null)
            return false;
        if (other.getProgressMessage() != null
                && other.getProgressMessage().equals(this.getProgressMessage()) == false)
            return false;
        if (other.getCarrier() == null ^ this.getCarrier() == null)
            return false;
        if (other.getCarrier() != null
                && other.getCarrier().equals(this.getCarrier()) == false)
            return false;
        if (other.getTrackingNumber() == null
                ^ this.getTrackingNumber() == null)
            return false;
        if (other.getTrackingNumber() != null
                && other.getTrackingNumber().equals(this.getTrackingNumber()) == false)
            return false;
        if (other.getLogBucket() == null ^ this.getLogBucket() == null)
            return false;
        if (other.getLogBucket() != null
                && other.getLogBucket().equals(this.getLogBucket()) == false)
            return false;
        if (other.getLogKey() == null ^ this.getLogKey() == null)
            return false;
        if (other.getLogKey() != null
                && other.getLogKey().equals(this.getLogKey()) == false)
            return false;
        if (other.getErrorCount() == null ^ this.getErrorCount() == null)
            return false;
        if (other.getErrorCount() != null
                && other.getErrorCount().equals(this.getErrorCount()) == false)
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
        if (other.getCurrentManifest() == null
                ^ this.getCurrentManifest() == null)
            return false;
        if (other.getCurrentManifest() != null
                && other.getCurrentManifest().equals(this.getCurrentManifest()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
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
        hashCode = prime
                * hashCode
                + ((getLocationCode() == null) ? 0 : getLocationCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLocationMessage() == null) ? 0 : getLocationMessage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProgressCode() == null) ? 0 : getProgressCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getProgressMessage() == null) ? 0 : getProgressMessage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCarrier() == null) ? 0 : getCarrier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrackingNumber() == null) ? 0 : getTrackingNumber()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLogBucket() == null) ? 0 : getLogBucket().hashCode());
        hashCode = prime * hashCode
                + ((getLogKey() == null) ? 0 : getLogKey().hashCode());
        hashCode = prime * hashCode
                + ((getErrorCount() == null) ? 0 : getErrorCount().hashCode());
        hashCode = prime * hashCode
                + ((getSignature() == null) ? 0 : getSignature().hashCode());
        hashCode = prime
                * hashCode
                + ((getSignatureFileContents() == null) ? 0
                        : getSignatureFileContents().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentManifest() == null) ? 0 : getCurrentManifest()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getArtifactList() == null) ? 0 : getArtifactList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetStatusResult clone() {
        try {
            return (GetStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}