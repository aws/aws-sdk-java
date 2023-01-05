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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The currently active data capture configuration used by your Endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DataCaptureConfigSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCaptureConfigSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether data capture is enabled or disabled.
     * </p>
     */
    private Boolean enableCapture;
    /**
     * <p>
     * Whether data capture is currently functional.
     * </p>
     */
    private String captureStatus;
    /**
     * <p>
     * The percentage of requests being captured by your Endpoint.
     * </p>
     */
    private Integer currentSamplingPercentage;
    /**
     * <p>
     * The Amazon S3 location being used to capture the data.
     * </p>
     */
    private String destinationS3Uri;
    /**
     * <p>
     * The KMS key being used to encrypt the data in Amazon S3.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Whether data capture is enabled or disabled.
     * </p>
     * 
     * @param enableCapture
     *        Whether data capture is enabled or disabled.
     */

    public void setEnableCapture(Boolean enableCapture) {
        this.enableCapture = enableCapture;
    }

    /**
     * <p>
     * Whether data capture is enabled or disabled.
     * </p>
     * 
     * @return Whether data capture is enabled or disabled.
     */

    public Boolean getEnableCapture() {
        return this.enableCapture;
    }

    /**
     * <p>
     * Whether data capture is enabled or disabled.
     * </p>
     * 
     * @param enableCapture
     *        Whether data capture is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfigSummary withEnableCapture(Boolean enableCapture) {
        setEnableCapture(enableCapture);
        return this;
    }

    /**
     * <p>
     * Whether data capture is enabled or disabled.
     * </p>
     * 
     * @return Whether data capture is enabled or disabled.
     */

    public Boolean isEnableCapture() {
        return this.enableCapture;
    }

    /**
     * <p>
     * Whether data capture is currently functional.
     * </p>
     * 
     * @param captureStatus
     *        Whether data capture is currently functional.
     * @see CaptureStatus
     */

    public void setCaptureStatus(String captureStatus) {
        this.captureStatus = captureStatus;
    }

    /**
     * <p>
     * Whether data capture is currently functional.
     * </p>
     * 
     * @return Whether data capture is currently functional.
     * @see CaptureStatus
     */

    public String getCaptureStatus() {
        return this.captureStatus;
    }

    /**
     * <p>
     * Whether data capture is currently functional.
     * </p>
     * 
     * @param captureStatus
     *        Whether data capture is currently functional.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptureStatus
     */

    public DataCaptureConfigSummary withCaptureStatus(String captureStatus) {
        setCaptureStatus(captureStatus);
        return this;
    }

    /**
     * <p>
     * Whether data capture is currently functional.
     * </p>
     * 
     * @param captureStatus
     *        Whether data capture is currently functional.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptureStatus
     */

    public DataCaptureConfigSummary withCaptureStatus(CaptureStatus captureStatus) {
        this.captureStatus = captureStatus.toString();
        return this;
    }

    /**
     * <p>
     * The percentage of requests being captured by your Endpoint.
     * </p>
     * 
     * @param currentSamplingPercentage
     *        The percentage of requests being captured by your Endpoint.
     */

    public void setCurrentSamplingPercentage(Integer currentSamplingPercentage) {
        this.currentSamplingPercentage = currentSamplingPercentage;
    }

    /**
     * <p>
     * The percentage of requests being captured by your Endpoint.
     * </p>
     * 
     * @return The percentage of requests being captured by your Endpoint.
     */

    public Integer getCurrentSamplingPercentage() {
        return this.currentSamplingPercentage;
    }

    /**
     * <p>
     * The percentage of requests being captured by your Endpoint.
     * </p>
     * 
     * @param currentSamplingPercentage
     *        The percentage of requests being captured by your Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfigSummary withCurrentSamplingPercentage(Integer currentSamplingPercentage) {
        setCurrentSamplingPercentage(currentSamplingPercentage);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location being used to capture the data.
     * </p>
     * 
     * @param destinationS3Uri
     *        The Amazon S3 location being used to capture the data.
     */

    public void setDestinationS3Uri(String destinationS3Uri) {
        this.destinationS3Uri = destinationS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location being used to capture the data.
     * </p>
     * 
     * @return The Amazon S3 location being used to capture the data.
     */

    public String getDestinationS3Uri() {
        return this.destinationS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location being used to capture the data.
     * </p>
     * 
     * @param destinationS3Uri
     *        The Amazon S3 location being used to capture the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfigSummary withDestinationS3Uri(String destinationS3Uri) {
        setDestinationS3Uri(destinationS3Uri);
        return this;
    }

    /**
     * <p>
     * The KMS key being used to encrypt the data in Amazon S3.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key being used to encrypt the data in Amazon S3.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key being used to encrypt the data in Amazon S3.
     * </p>
     * 
     * @return The KMS key being used to encrypt the data in Amazon S3.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key being used to encrypt the data in Amazon S3.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key being used to encrypt the data in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfigSummary withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getEnableCapture() != null)
            sb.append("EnableCapture: ").append(getEnableCapture()).append(",");
        if (getCaptureStatus() != null)
            sb.append("CaptureStatus: ").append(getCaptureStatus()).append(",");
        if (getCurrentSamplingPercentage() != null)
            sb.append("CurrentSamplingPercentage: ").append(getCurrentSamplingPercentage()).append(",");
        if (getDestinationS3Uri() != null)
            sb.append("DestinationS3Uri: ").append(getDestinationS3Uri()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCaptureConfigSummary == false)
            return false;
        DataCaptureConfigSummary other = (DataCaptureConfigSummary) obj;
        if (other.getEnableCapture() == null ^ this.getEnableCapture() == null)
            return false;
        if (other.getEnableCapture() != null && other.getEnableCapture().equals(this.getEnableCapture()) == false)
            return false;
        if (other.getCaptureStatus() == null ^ this.getCaptureStatus() == null)
            return false;
        if (other.getCaptureStatus() != null && other.getCaptureStatus().equals(this.getCaptureStatus()) == false)
            return false;
        if (other.getCurrentSamplingPercentage() == null ^ this.getCurrentSamplingPercentage() == null)
            return false;
        if (other.getCurrentSamplingPercentage() != null && other.getCurrentSamplingPercentage().equals(this.getCurrentSamplingPercentage()) == false)
            return false;
        if (other.getDestinationS3Uri() == null ^ this.getDestinationS3Uri() == null)
            return false;
        if (other.getDestinationS3Uri() != null && other.getDestinationS3Uri().equals(this.getDestinationS3Uri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableCapture() == null) ? 0 : getEnableCapture().hashCode());
        hashCode = prime * hashCode + ((getCaptureStatus() == null) ? 0 : getCaptureStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentSamplingPercentage() == null) ? 0 : getCurrentSamplingPercentage().hashCode());
        hashCode = prime * hashCode + ((getDestinationS3Uri() == null) ? 0 : getDestinationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DataCaptureConfigSummary clone() {
        try {
            return (DataCaptureConfigSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DataCaptureConfigSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
