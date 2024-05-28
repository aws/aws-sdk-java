/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows you to specify additional settings for your Call Analytics post-call request, including output locations for
 * your redacted transcript, which IAM role to use, and which encryption key to use.
 * </p>
 * <p>
 * <code>DataAccessRoleArn</code> and <code>OutputLocation</code> are required fields.
 * </p>
 * <p>
 * <code>PostCallAnalyticsSettings</code> provides the same insights as a Call Analytics post-call transcription. For
 * more information, refer to <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-post-call.html">Post-call
 * analytics with real-time transcriptions</a> in the <i>Amazon Transcribe Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/PostCallAnalyticsSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostCallAnalyticsSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the Amazon S3 bucket that contains the post-call data.
     * </p>
     */
    private String outputLocation;
    /**
     * <p>
     * The ARN of the role used by Amazon Web Services Transcribe to upload your post call analysis. For more
     * information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-post-call.html">Post-call
     * analytics with real-time transcriptions</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * The content redaction output settings for a post-call analysis task.
     * </p>
     */
    private String contentRedactionOutput;
    /**
     * <p>
     * The ID of the KMS (Key Management Service) key used to encrypt the output.
     * </p>
     */
    private String outputEncryptionKMSKeyId;

    /**
     * <p>
     * The URL of the Amazon S3 bucket that contains the post-call data.
     * </p>
     * 
     * @param outputLocation
     *        The URL of the Amazon S3 bucket that contains the post-call data.
     */

    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * The URL of the Amazon S3 bucket that contains the post-call data.
     * </p>
     * 
     * @return The URL of the Amazon S3 bucket that contains the post-call data.
     */

    public String getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * The URL of the Amazon S3 bucket that contains the post-call data.
     * </p>
     * 
     * @param outputLocation
     *        The URL of the Amazon S3 bucket that contains the post-call data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCallAnalyticsSettings withOutputLocation(String outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used by Amazon Web Services Transcribe to upload your post call analysis. For more
     * information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-post-call.html">Post-call
     * analytics with real-time transcriptions</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The ARN of the role used by Amazon Web Services Transcribe to upload your post call analysis. For more
     *        information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-post-call.html">Post-call
     *        analytics with real-time transcriptions</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role used by Amazon Web Services Transcribe to upload your post call analysis. For more
     * information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-post-call.html">Post-call
     * analytics with real-time transcriptions</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @return The ARN of the role used by Amazon Web Services Transcribe to upload your post call analysis. For more
     *         information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-post-call.html">Post-call
     *         analytics with real-time transcriptions</a> in the <i>Amazon Transcribe Developer Guide</i>.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role used by Amazon Web Services Transcribe to upload your post call analysis. For more
     * information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-post-call.html">Post-call
     * analytics with real-time transcriptions</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The ARN of the role used by Amazon Web Services Transcribe to upload your post call analysis. For more
     *        information, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-post-call.html">Post-call
     *        analytics with real-time transcriptions</a> in the <i>Amazon Transcribe Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCallAnalyticsSettings withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The content redaction output settings for a post-call analysis task.
     * </p>
     * 
     * @param contentRedactionOutput
     *        The content redaction output settings for a post-call analysis task.
     * @see ContentRedactionOutput
     */

    public void setContentRedactionOutput(String contentRedactionOutput) {
        this.contentRedactionOutput = contentRedactionOutput;
    }

    /**
     * <p>
     * The content redaction output settings for a post-call analysis task.
     * </p>
     * 
     * @return The content redaction output settings for a post-call analysis task.
     * @see ContentRedactionOutput
     */

    public String getContentRedactionOutput() {
        return this.contentRedactionOutput;
    }

    /**
     * <p>
     * The content redaction output settings for a post-call analysis task.
     * </p>
     * 
     * @param contentRedactionOutput
     *        The content redaction output settings for a post-call analysis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentRedactionOutput
     */

    public PostCallAnalyticsSettings withContentRedactionOutput(String contentRedactionOutput) {
        setContentRedactionOutput(contentRedactionOutput);
        return this;
    }

    /**
     * <p>
     * The content redaction output settings for a post-call analysis task.
     * </p>
     * 
     * @param contentRedactionOutput
     *        The content redaction output settings for a post-call analysis task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentRedactionOutput
     */

    public PostCallAnalyticsSettings withContentRedactionOutput(ContentRedactionOutput contentRedactionOutput) {
        this.contentRedactionOutput = contentRedactionOutput.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the KMS (Key Management Service) key used to encrypt the output.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The ID of the KMS (Key Management Service) key used to encrypt the output.
     */

    public void setOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        this.outputEncryptionKMSKeyId = outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The ID of the KMS (Key Management Service) key used to encrypt the output.
     * </p>
     * 
     * @return The ID of the KMS (Key Management Service) key used to encrypt the output.
     */

    public String getOutputEncryptionKMSKeyId() {
        return this.outputEncryptionKMSKeyId;
    }

    /**
     * <p>
     * The ID of the KMS (Key Management Service) key used to encrypt the output.
     * </p>
     * 
     * @param outputEncryptionKMSKeyId
     *        The ID of the KMS (Key Management Service) key used to encrypt the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostCallAnalyticsSettings withOutputEncryptionKMSKeyId(String outputEncryptionKMSKeyId) {
        setOutputEncryptionKMSKeyId(outputEncryptionKMSKeyId);
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
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getContentRedactionOutput() != null)
            sb.append("ContentRedactionOutput: ").append(getContentRedactionOutput()).append(",");
        if (getOutputEncryptionKMSKeyId() != null)
            sb.append("OutputEncryptionKMSKeyId: ").append(getOutputEncryptionKMSKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostCallAnalyticsSettings == false)
            return false;
        PostCallAnalyticsSettings other = (PostCallAnalyticsSettings) obj;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getContentRedactionOutput() == null ^ this.getContentRedactionOutput() == null)
            return false;
        if (other.getContentRedactionOutput() != null && other.getContentRedactionOutput().equals(this.getContentRedactionOutput()) == false)
            return false;
        if (other.getOutputEncryptionKMSKeyId() == null ^ this.getOutputEncryptionKMSKeyId() == null)
            return false;
        if (other.getOutputEncryptionKMSKeyId() != null && other.getOutputEncryptionKMSKeyId().equals(this.getOutputEncryptionKMSKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getContentRedactionOutput() == null) ? 0 : getContentRedactionOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputEncryptionKMSKeyId() == null) ? 0 : getOutputEncryptionKMSKeyId().hashCode());
        return hashCode;
    }

    @Override
    public PostCallAnalyticsSettings clone() {
        try {
            return (PostCallAnalyticsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.PostCallAnalyticsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
