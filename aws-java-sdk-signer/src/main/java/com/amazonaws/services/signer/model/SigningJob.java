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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a signing job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the signing job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A <code>Source</code> that contains information about a signing job's code image source.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * </p>
     */
    private SignedObject signedObject;
    /**
     * <p>
     * A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used for
     * the signing job.
     * </p>
     */
    private SigningMaterial signingMaterial;
    /**
     * <p>
     * The date and time that the signing job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The status of the signing job.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the signing job.
     * </p>
     * 
     * @param jobId
     *        The ID of the signing job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the signing job.
     * </p>
     * 
     * @return The ID of the signing job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the signing job.
     * </p>
     * 
     * @param jobId
     *        The ID of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A <code>Source</code> that contains information about a signing job's code image source.
     * </p>
     * 
     * @param source
     *        A <code>Source</code> that contains information about a signing job's code image source.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * A <code>Source</code> that contains information about a signing job's code image source.
     * </p>
     * 
     * @return A <code>Source</code> that contains information about a signing job's code image source.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * A <code>Source</code> that contains information about a signing job's code image source.
     * </p>
     * 
     * @param source
     *        A <code>Source</code> that contains information about a signing job's code image source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * </p>
     * 
     * @param signedObject
     *        A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     */

    public void setSignedObject(SignedObject signedObject) {
        this.signedObject = signedObject;
    }

    /**
     * <p>
     * A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * </p>
     * 
     * @return A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     */

    public SignedObject getSignedObject() {
        return this.signedObject;
    }

    /**
     * <p>
     * A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * </p>
     * 
     * @param signedObject
     *        A <code>SignedObject</code> structure that contains information about a signing job's signed code image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withSignedObject(SignedObject signedObject) {
        setSignedObject(signedObject);
        return this;
    }

    /**
     * <p>
     * A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used for
     * the signing job.
     * </p>
     * 
     * @param signingMaterial
     *        A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used
     *        for the signing job.
     */

    public void setSigningMaterial(SigningMaterial signingMaterial) {
        this.signingMaterial = signingMaterial;
    }

    /**
     * <p>
     * A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used for
     * the signing job.
     * </p>
     * 
     * @return A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate
     *         used for the signing job.
     */

    public SigningMaterial getSigningMaterial() {
        return this.signingMaterial;
    }

    /**
     * <p>
     * A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used for
     * the signing job.
     * </p>
     * 
     * @param signingMaterial
     *        A <code>SigningMaterial</code> object that contains the Amazon Resource Name (ARN) of the certificate used
     *        for the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withSigningMaterial(SigningMaterial signingMaterial) {
        setSigningMaterial(signingMaterial);
        return this;
    }

    /**
     * <p>
     * The date and time that the signing job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the signing job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the signing job was created.
     * </p>
     * 
     * @return The date and time that the signing job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the signing job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the signing job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningJob withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The status of the signing job.
     * </p>
     * 
     * @param status
     *        The status of the signing job.
     * @see SigningStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the signing job.
     * </p>
     * 
     * @return The status of the signing job.
     * @see SigningStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the signing job.
     * </p>
     * 
     * @param status
     *        The status of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningStatus
     */

    public SigningJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the signing job.
     * </p>
     * 
     * @param status
     *        The status of the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningStatus
     */

    public SigningJob withStatus(SigningStatus status) {
        this.status = status.toString();
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSignedObject() != null)
            sb.append("SignedObject: ").append(getSignedObject()).append(",");
        if (getSigningMaterial() != null)
            sb.append("SigningMaterial: ").append(getSigningMaterial()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningJob == false)
            return false;
        SigningJob other = (SigningJob) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSignedObject() == null ^ this.getSignedObject() == null)
            return false;
        if (other.getSignedObject() != null && other.getSignedObject().equals(this.getSignedObject()) == false)
            return false;
        if (other.getSigningMaterial() == null ^ this.getSigningMaterial() == null)
            return false;
        if (other.getSigningMaterial() != null && other.getSigningMaterial().equals(this.getSigningMaterial()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSignedObject() == null) ? 0 : getSignedObject().hashCode());
        hashCode = prime * hashCode + ((getSigningMaterial() == null) ? 0 : getSigningMaterial().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SigningJob clone() {
        try {
            return (SigningJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
