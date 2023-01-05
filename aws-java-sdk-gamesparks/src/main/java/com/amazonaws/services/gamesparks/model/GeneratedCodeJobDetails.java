/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a generated code job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GeneratedCodeJobDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneratedCodeJobDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the generated code job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The expiration date and time for the download URL.
     * </p>
     * <p>
     * The download URL us guaranteed to be available until at least this time.
     * </p>
     */
    private java.util.Date expirationTime;
    /**
     * <p>
     * The identifier for the generated code job.
     * </p>
     */
    private String generatedCodeJobId;
    /**
     * <p>
     * A presigned URL that can be used to download the generated code.
     * </p>
     */
    private String s3Url;
    /**
     * <p>
     * The status of the generated code job
     * </p>
     */
    private String status;

    /**
     * <p>
     * The description of the generated code job.
     * </p>
     * 
     * @param description
     *        The description of the generated code job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the generated code job.
     * </p>
     * 
     * @return The description of the generated code job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the generated code job.
     * </p>
     * 
     * @param description
     *        The description of the generated code job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedCodeJobDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The expiration date and time for the download URL.
     * </p>
     * <p>
     * The download URL us guaranteed to be available until at least this time.
     * </p>
     * 
     * @param expirationTime
     *        The expiration date and time for the download URL.</p>
     *        <p>
     *        The download URL us guaranteed to be available until at least this time.
     */

    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The expiration date and time for the download URL.
     * </p>
     * <p>
     * The download URL us guaranteed to be available until at least this time.
     * </p>
     * 
     * @return The expiration date and time for the download URL.</p>
     *         <p>
     *         The download URL us guaranteed to be available until at least this time.
     */

    public java.util.Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The expiration date and time for the download URL.
     * </p>
     * <p>
     * The download URL us guaranteed to be available until at least this time.
     * </p>
     * 
     * @param expirationTime
     *        The expiration date and time for the download URL.</p>
     *        <p>
     *        The download URL us guaranteed to be available until at least this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedCodeJobDetails withExpirationTime(java.util.Date expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * The identifier for the generated code job.
     * </p>
     * 
     * @param generatedCodeJobId
     *        The identifier for the generated code job.
     */

    public void setGeneratedCodeJobId(String generatedCodeJobId) {
        this.generatedCodeJobId = generatedCodeJobId;
    }

    /**
     * <p>
     * The identifier for the generated code job.
     * </p>
     * 
     * @return The identifier for the generated code job.
     */

    public String getGeneratedCodeJobId() {
        return this.generatedCodeJobId;
    }

    /**
     * <p>
     * The identifier for the generated code job.
     * </p>
     * 
     * @param generatedCodeJobId
     *        The identifier for the generated code job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedCodeJobDetails withGeneratedCodeJobId(String generatedCodeJobId) {
        setGeneratedCodeJobId(generatedCodeJobId);
        return this;
    }

    /**
     * <p>
     * A presigned URL that can be used to download the generated code.
     * </p>
     * 
     * @param s3Url
     *        A presigned URL that can be used to download the generated code.
     */

    public void setS3Url(String s3Url) {
        this.s3Url = s3Url;
    }

    /**
     * <p>
     * A presigned URL that can be used to download the generated code.
     * </p>
     * 
     * @return A presigned URL that can be used to download the generated code.
     */

    public String getS3Url() {
        return this.s3Url;
    }

    /**
     * <p>
     * A presigned URL that can be used to download the generated code.
     * </p>
     * 
     * @param s3Url
     *        A presigned URL that can be used to download the generated code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneratedCodeJobDetails withS3Url(String s3Url) {
        setS3Url(s3Url);
        return this;
    }

    /**
     * <p>
     * The status of the generated code job
     * </p>
     * 
     * @param status
     *        The status of the generated code job
     * @see GeneratedCodeJobState
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the generated code job
     * </p>
     * 
     * @return The status of the generated code job
     * @see GeneratedCodeJobState
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the generated code job
     * </p>
     * 
     * @param status
     *        The status of the generated code job
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedCodeJobState
     */

    public GeneratedCodeJobDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the generated code job
     * </p>
     * 
     * @param status
     *        The status of the generated code job
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GeneratedCodeJobState
     */

    public GeneratedCodeJobDetails withStatus(GeneratedCodeJobState status) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getGeneratedCodeJobId() != null)
            sb.append("GeneratedCodeJobId: ").append(getGeneratedCodeJobId()).append(",");
        if (getS3Url() != null)
            sb.append("S3Url: ").append(getS3Url()).append(",");
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

        if (obj instanceof GeneratedCodeJobDetails == false)
            return false;
        GeneratedCodeJobDetails other = (GeneratedCodeJobDetails) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getGeneratedCodeJobId() == null ^ this.getGeneratedCodeJobId() == null)
            return false;
        if (other.getGeneratedCodeJobId() != null && other.getGeneratedCodeJobId().equals(this.getGeneratedCodeJobId()) == false)
            return false;
        if (other.getS3Url() == null ^ this.getS3Url() == null)
            return false;
        if (other.getS3Url() != null && other.getS3Url().equals(this.getS3Url()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getGeneratedCodeJobId() == null) ? 0 : getGeneratedCodeJobId().hashCode());
        hashCode = prime * hashCode + ((getS3Url() == null) ? 0 : getS3Url().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GeneratedCodeJobDetails clone() {
        try {
            return (GeneratedCodeJobDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.GeneratedCodeJobDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
