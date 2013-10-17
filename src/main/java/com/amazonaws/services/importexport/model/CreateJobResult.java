/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Output structure for the CreateJob operation.
 * </p>
 */
public class CreateJobResult implements Serializable {

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
     * An encrypted code used to authenticate the request and response, for
     * example, "DV+TpDfx1/TdSE9ktyK9k/bDTVI=". Only use this value is you
     * want to create the signature file yourself. Generally you should use
     * the SignatureFileContents value.
     */
    private String signature;

    /**
     * The actual text of the SIGNATURE file to be written to disk.
     */
    private String signatureFileContents;

    /**
     * An optional message notifying you of non-fatal issues with the job,
     * such as use of an incompatible Amazon S3 bucket name.
     */
    private String warningMessage;

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
    public CreateJobResult withJobId(String jobId) {
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
    public CreateJobResult withJobType(String jobType) {
        this.jobType = jobType;
        return this;
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
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
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
    public CreateJobResult withJobType(JobType jobType) {
        this.jobType = jobType.toString();
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
    public CreateJobResult withAwsShippingAddress(String awsShippingAddress) {
        this.awsShippingAddress = awsShippingAddress;
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
    public CreateJobResult withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * The actual text of the SIGNATURE file to be written to disk.
     *
     * @return The actual text of the SIGNATURE file to be written to disk.
     */
    public String getSignatureFileContents() {
        return signatureFileContents;
    }
    
    /**
     * The actual text of the SIGNATURE file to be written to disk.
     *
     * @param signatureFileContents The actual text of the SIGNATURE file to be written to disk.
     */
    public void setSignatureFileContents(String signatureFileContents) {
        this.signatureFileContents = signatureFileContents;
    }
    
    /**
     * The actual text of the SIGNATURE file to be written to disk.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signatureFileContents The actual text of the SIGNATURE file to be written to disk.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobResult withSignatureFileContents(String signatureFileContents) {
        this.signatureFileContents = signatureFileContents;
        return this;
    }

    /**
     * An optional message notifying you of non-fatal issues with the job,
     * such as use of an incompatible Amazon S3 bucket name.
     *
     * @return An optional message notifying you of non-fatal issues with the job,
     *         such as use of an incompatible Amazon S3 bucket name.
     */
    public String getWarningMessage() {
        return warningMessage;
    }
    
    /**
     * An optional message notifying you of non-fatal issues with the job,
     * such as use of an incompatible Amazon S3 bucket name.
     *
     * @param warningMessage An optional message notifying you of non-fatal issues with the job,
     *         such as use of an incompatible Amazon S3 bucket name.
     */
    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }
    
    /**
     * An optional message notifying you of non-fatal issues with the job,
     * such as use of an incompatible Amazon S3 bucket name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warningMessage An optional message notifying you of non-fatal issues with the job,
     *         such as use of an incompatible Amazon S3 bucket name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobResult withWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
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
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getJobType() != null) sb.append("JobType: " + getJobType() + ",");
        if (getAwsShippingAddress() != null) sb.append("AwsShippingAddress: " + getAwsShippingAddress() + ",");
        if (getSignature() != null) sb.append("Signature: " + getSignature() + ",");
        if (getSignatureFileContents() != null) sb.append("SignatureFileContents: " + getSignatureFileContents() + ",");
        if (getWarningMessage() != null) sb.append("WarningMessage: " + getWarningMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode()); 
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode()); 
        hashCode = prime * hashCode + ((getAwsShippingAddress() == null) ? 0 : getAwsShippingAddress().hashCode()); 
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode()); 
        hashCode = prime * hashCode + ((getSignatureFileContents() == null) ? 0 : getSignatureFileContents().hashCode()); 
        hashCode = prime * hashCode + ((getWarningMessage() == null) ? 0 : getWarningMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateJobResult == false) return false;
        CreateJobResult other = (CreateJobResult)obj;
        
        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false; 
        if (other.getJobType() == null ^ this.getJobType() == null) return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false) return false; 
        if (other.getAwsShippingAddress() == null ^ this.getAwsShippingAddress() == null) return false;
        if (other.getAwsShippingAddress() != null && other.getAwsShippingAddress().equals(this.getAwsShippingAddress()) == false) return false; 
        if (other.getSignature() == null ^ this.getSignature() == null) return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false) return false; 
        if (other.getSignatureFileContents() == null ^ this.getSignatureFileContents() == null) return false;
        if (other.getSignatureFileContents() != null && other.getSignatureFileContents().equals(this.getSignatureFileContents()) == false) return false; 
        if (other.getWarningMessage() == null ^ this.getWarningMessage() == null) return false;
        if (other.getWarningMessage() != null && other.getWarningMessage().equals(this.getWarningMessage()) == false) return false; 
        return true;
    }
    
}
    