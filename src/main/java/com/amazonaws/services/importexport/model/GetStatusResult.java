/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Output structure for the GetStatus operation.
 * </p>
 */
public class GetStatusResult {

    /**
     * A unique identifier which refers to a particular job.
     */
    private String jobId;

    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     */
    private String jobType;

    /**
     * Address you ship your storage device to.
     */
    private String awsShippingAddress;

    /**
     * A token representing the location of the storage device, such as
     * "AtAWS".
     */
    private String locationCode;

    /**
     * A more human readable form of the physical location of the storage
     * device.
     */
    private String locationMessage;

    /**
     * A token representing the state of the job, such as "Started".
     */
    private String progressCode;

    /**
     * A more human readable form of the job status.
     */
    private String progressMessage;

    /**
     * Name of the shipping company. This value is included when the
     * LocationCode is "Returned".
     */
    private String carrier;

    /**
     * The shipping tracking number assigned by AWS Import/Export to the
     * storage device when it's returned to you. We return this value when
     * the LocationCode is "Returned".
     */
    private String trackingNumber;

    /**
     * Amazon S3 bucket for user logs.
     */
    private String logBucket;

    /**
     * The key where the user logs were stored.
     */
    private String logKey;

    /**
     * Number of errors. We return this value when the ProgressCode is
     * Success or SuccessWithErrors.
     */
    private Integer errorCount;

    /**
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     */
    private String signature;

    /**
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     */
    private String signatureFileContents;

    /**
     * The last manifest submitted, which will be used to process the job.
     */
    private String currentManifest;

    /**
     * Timestamp of the CreateJob request in ISO8601 date format. For example
     * "2010-03-28T20:27:35Z".
     */
    private java.util.Date creationDate;

    /**
     * A unique identifier which refers to a particular job.
     *
     * @return A unique identifier which refers to a particular job.
     */
    public String getJobId() {
        return jobId;
    }
    
    /**
     * A unique identifier which refers to a particular job.
     *
     * @param jobId A unique identifier which refers to a particular job.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
    /**
     * A unique identifier which refers to a particular job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobId A unique identifier which refers to a particular job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    
    
    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     *
     * @return Specifies whether the job to initiate is an import or export job.
     *
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }
    
    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     *
     * @param jobType Specifies whether the job to initiate is an import or export job.
     *
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    
    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     *
     * @param jobType Specifies whether the job to initiate is an import or export job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see JobType
     */
    public GetStatusResult withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    
    
    /**
     * Address you ship your storage device to.
     *
     * @return Address you ship your storage device to.
     */
    public String getAwsShippingAddress() {
        return awsShippingAddress;
    }
    
    /**
     * Address you ship your storage device to.
     *
     * @param awsShippingAddress Address you ship your storage device to.
     */
    public void setAwsShippingAddress(String awsShippingAddress) {
        this.awsShippingAddress = awsShippingAddress;
    }
    
    /**
     * Address you ship your storage device to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param awsShippingAddress Address you ship your storage device to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withAwsShippingAddress(String awsShippingAddress) {
        this.awsShippingAddress = awsShippingAddress;
        return this;
    }
    
    
    /**
     * A token representing the location of the storage device, such as
     * "AtAWS".
     *
     * @return A token representing the location of the storage device, such as
     *         "AtAWS".
     */
    public String getLocationCode() {
        return locationCode;
    }
    
    /**
     * A token representing the location of the storage device, such as
     * "AtAWS".
     *
     * @param locationCode A token representing the location of the storage device, such as
     *         "AtAWS".
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    
    /**
     * A token representing the location of the storage device, such as
     * "AtAWS".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param locationCode A token representing the location of the storage device, such as
     *         "AtAWS".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withLocationCode(String locationCode) {
        this.locationCode = locationCode;
        return this;
    }
    
    
    /**
     * A more human readable form of the physical location of the storage
     * device.
     *
     * @return A more human readable form of the physical location of the storage
     *         device.
     */
    public String getLocationMessage() {
        return locationMessage;
    }
    
    /**
     * A more human readable form of the physical location of the storage
     * device.
     *
     * @param locationMessage A more human readable form of the physical location of the storage
     *         device.
     */
    public void setLocationMessage(String locationMessage) {
        this.locationMessage = locationMessage;
    }
    
    /**
     * A more human readable form of the physical location of the storage
     * device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param locationMessage A more human readable form of the physical location of the storage
     *         device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withLocationMessage(String locationMessage) {
        this.locationMessage = locationMessage;
        return this;
    }
    
    
    /**
     * A token representing the state of the job, such as "Started".
     *
     * @return A token representing the state of the job, such as "Started".
     */
    public String getProgressCode() {
        return progressCode;
    }
    
    /**
     * A token representing the state of the job, such as "Started".
     *
     * @param progressCode A token representing the state of the job, such as "Started".
     */
    public void setProgressCode(String progressCode) {
        this.progressCode = progressCode;
    }
    
    /**
     * A token representing the state of the job, such as "Started".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progressCode A token representing the state of the job, such as "Started".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withProgressCode(String progressCode) {
        this.progressCode = progressCode;
        return this;
    }
    
    
    /**
     * A more human readable form of the job status.
     *
     * @return A more human readable form of the job status.
     */
    public String getProgressMessage() {
        return progressMessage;
    }
    
    /**
     * A more human readable form of the job status.
     *
     * @param progressMessage A more human readable form of the job status.
     */
    public void setProgressMessage(String progressMessage) {
        this.progressMessage = progressMessage;
    }
    
    /**
     * A more human readable form of the job status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param progressMessage A more human readable form of the job status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withProgressMessage(String progressMessage) {
        this.progressMessage = progressMessage;
        return this;
    }
    
    
    /**
     * Name of the shipping company. This value is included when the
     * LocationCode is "Returned".
     *
     * @return Name of the shipping company. This value is included when the
     *         LocationCode is "Returned".
     */
    public String getCarrier() {
        return carrier;
    }
    
    /**
     * Name of the shipping company. This value is included when the
     * LocationCode is "Returned".
     *
     * @param carrier Name of the shipping company. This value is included when the
     *         LocationCode is "Returned".
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    
    /**
     * Name of the shipping company. This value is included when the
     * LocationCode is "Returned".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param carrier Name of the shipping company. This value is included when the
     *         LocationCode is "Returned".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    
    
    /**
     * The shipping tracking number assigned by AWS Import/Export to the
     * storage device when it's returned to you. We return this value when
     * the LocationCode is "Returned".
     *
     * @return The shipping tracking number assigned by AWS Import/Export to the
     *         storage device when it's returned to you. We return this value when
     *         the LocationCode is "Returned".
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }
    
    /**
     * The shipping tracking number assigned by AWS Import/Export to the
     * storage device when it's returned to you. We return this value when
     * the LocationCode is "Returned".
     *
     * @param trackingNumber The shipping tracking number assigned by AWS Import/Export to the
     *         storage device when it's returned to you. We return this value when
     *         the LocationCode is "Returned".
     */
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
    
    /**
     * The shipping tracking number assigned by AWS Import/Export to the
     * storage device when it's returned to you. We return this value when
     * the LocationCode is "Returned".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trackingNumber The shipping tracking number assigned by AWS Import/Export to the
     *         storage device when it's returned to you. We return this value when
     *         the LocationCode is "Returned".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }
    
    
    /**
     * Amazon S3 bucket for user logs.
     *
     * @return Amazon S3 bucket for user logs.
     */
    public String getLogBucket() {
        return logBucket;
    }
    
    /**
     * Amazon S3 bucket for user logs.
     *
     * @param logBucket Amazon S3 bucket for user logs.
     */
    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }
    
    /**
     * Amazon S3 bucket for user logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logBucket Amazon S3 bucket for user logs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withLogBucket(String logBucket) {
        this.logBucket = logBucket;
        return this;
    }
    
    
    /**
     * The key where the user logs were stored.
     *
     * @return The key where the user logs were stored.
     */
    public String getLogKey() {
        return logKey;
    }
    
    /**
     * The key where the user logs were stored.
     *
     * @param logKey The key where the user logs were stored.
     */
    public void setLogKey(String logKey) {
        this.logKey = logKey;
    }
    
    /**
     * The key where the user logs were stored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logKey The key where the user logs were stored.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withLogKey(String logKey) {
        this.logKey = logKey;
        return this;
    }
    
    
    /**
     * Number of errors. We return this value when the ProgressCode is
     * Success or SuccessWithErrors.
     *
     * @return Number of errors. We return this value when the ProgressCode is
     *         Success or SuccessWithErrors.
     */
    public Integer getErrorCount() {
        return errorCount;
    }
    
    /**
     * Number of errors. We return this value when the ProgressCode is
     * Success or SuccessWithErrors.
     *
     * @param errorCount Number of errors. We return this value when the ProgressCode is
     *         Success or SuccessWithErrors.
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }
    
    /**
     * Number of errors. We return this value when the ProgressCode is
     * Success or SuccessWithErrors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorCount Number of errors. We return this value when the ProgressCode is
     *         Success or SuccessWithErrors.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
    }
    
    
    /**
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     *
     * @return An encrypted code used to authenticate the request and response, for
     *         example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     *         want to create the signature file yourself. Generally you should use
     *         the SignatureFileContents value.
     */
    public String getSignature() {
        return signature;
    }
    
    /**
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     *
     * @param signature An encrypted code used to authenticate the request and response, for
     *         example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     *         want to create the signature file yourself. Generally you should use
     *         the SignatureFileContents value.
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }
    
    /**
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signature An encrypted code used to authenticate the request and response, for
     *         example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     *         want to create the signature file yourself. Generally you should use
     *         the SignatureFileContents value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withSignature(String signature) {
        this.signature = signature;
        return this;
    }
    
    
    /**
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     *
     * @return An encrypted code used to authenticate the request and response, for
     *         example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     *         want to create the signature file yourself. Generally you should use
     *         the SignatureFileContents value.
     */
    public String getSignatureFileContents() {
        return signatureFileContents;
    }
    
    /**
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     *
     * @param signatureFileContents An encrypted code used to authenticate the request and response, for
     *         example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     *         want to create the signature file yourself. Generally you should use
     *         the SignatureFileContents value.
     */
    public void setSignatureFileContents(String signatureFileContents) {
        this.signatureFileContents = signatureFileContents;
    }
    
    /**
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signatureFileContents An encrypted code used to authenticate the request and response, for
     *         example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     *         want to create the signature file yourself. Generally you should use
     *         the SignatureFileContents value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withSignatureFileContents(String signatureFileContents) {
        this.signatureFileContents = signatureFileContents;
        return this;
    }
    
    
    /**
     * The last manifest submitted, which will be used to process the job.
     *
     * @return The last manifest submitted, which will be used to process the job.
     */
    public String getCurrentManifest() {
        return currentManifest;
    }
    
    /**
     * The last manifest submitted, which will be used to process the job.
     *
     * @param currentManifest The last manifest submitted, which will be used to process the job.
     */
    public void setCurrentManifest(String currentManifest) {
        this.currentManifest = currentManifest;
    }
    
    /**
     * The last manifest submitted, which will be used to process the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currentManifest The last manifest submitted, which will be used to process the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withCurrentManifest(String currentManifest) {
        this.currentManifest = currentManifest;
        return this;
    }
    
    
    /**
     * Timestamp of the CreateJob request in ISO8601 date format. For example
     * "2010-03-28T20:27:35Z".
     *
     * @return Timestamp of the CreateJob request in ISO8601 date format. For example
     *         "2010-03-28T20:27:35Z".
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * Timestamp of the CreateJob request in ISO8601 date format. For example
     * "2010-03-28T20:27:35Z".
     *
     * @param creationDate Timestamp of the CreateJob request in ISO8601 date format. For example
     *         "2010-03-28T20:27:35Z".
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * Timestamp of the CreateJob request in ISO8601 date format. For example
     * "2010-03-28T20:27:35Z".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate Timestamp of the CreateJob request in ISO8601 date format. For example
     *         "2010-03-28T20:27:35Z".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStatusResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        
        sb.append("JobId: " + jobId + ", ");
        sb.append("JobType: " + jobType + ", ");
        sb.append("AwsShippingAddress: " + awsShippingAddress + ", ");
        sb.append("LocationCode: " + locationCode + ", ");
        sb.append("LocationMessage: " + locationMessage + ", ");
        sb.append("ProgressCode: " + progressCode + ", ");
        sb.append("ProgressMessage: " + progressMessage + ", ");
        sb.append("Carrier: " + carrier + ", ");
        sb.append("TrackingNumber: " + trackingNumber + ", ");
        sb.append("LogBucket: " + logBucket + ", ");
        sb.append("LogKey: " + logKey + ", ");
        sb.append("ErrorCount: " + errorCount + ", ");
        sb.append("Signature: " + signature + ", ");
        sb.append("SignatureFileContents: " + signatureFileContents + ", ");
        sb.append("CurrentManifest: " + currentManifest + ", ");
        sb.append("CreationDate: " + creationDate + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    