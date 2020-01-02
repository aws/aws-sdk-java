/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DataCaptureConfigSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCaptureConfigSummary implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private Boolean enableCapture;
    /** <p/> */
    private String captureStatus;
    /** <p/> */
    private Integer currentSamplingPercentage;
    /** <p/> */
    private String destinationS3Uri;
    /** <p/> */
    private String kmsKeyId;

    /**
     * <p/>
     * 
     * @param enableCapture
     */

    public void setEnableCapture(Boolean enableCapture) {
        this.enableCapture = enableCapture;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getEnableCapture() {
        return this.enableCapture;
    }

    /**
     * <p/>
     * 
     * @param enableCapture
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfigSummary withEnableCapture(Boolean enableCapture) {
        setEnableCapture(enableCapture);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isEnableCapture() {
        return this.enableCapture;
    }

    /**
     * <p/>
     * 
     * @param captureStatus
     * @see CaptureStatus
     */

    public void setCaptureStatus(String captureStatus) {
        this.captureStatus = captureStatus;
    }

    /**
     * <p/>
     * 
     * @return
     * @see CaptureStatus
     */

    public String getCaptureStatus() {
        return this.captureStatus;
    }

    /**
     * <p/>
     * 
     * @param captureStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptureStatus
     */

    public DataCaptureConfigSummary withCaptureStatus(String captureStatus) {
        setCaptureStatus(captureStatus);
        return this;
    }

    /**
     * <p/>
     * 
     * @param captureStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptureStatus
     */

    public DataCaptureConfigSummary withCaptureStatus(CaptureStatus captureStatus) {
        this.captureStatus = captureStatus.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param currentSamplingPercentage
     */

    public void setCurrentSamplingPercentage(Integer currentSamplingPercentage) {
        this.currentSamplingPercentage = currentSamplingPercentage;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getCurrentSamplingPercentage() {
        return this.currentSamplingPercentage;
    }

    /**
     * <p/>
     * 
     * @param currentSamplingPercentage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfigSummary withCurrentSamplingPercentage(Integer currentSamplingPercentage) {
        setCurrentSamplingPercentage(currentSamplingPercentage);
        return this;
    }

    /**
     * <p/>
     * 
     * @param destinationS3Uri
     */

    public void setDestinationS3Uri(String destinationS3Uri) {
        this.destinationS3Uri = destinationS3Uri;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDestinationS3Uri() {
        return this.destinationS3Uri;
    }

    /**
     * <p/>
     * 
     * @param destinationS3Uri
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfigSummary withDestinationS3Uri(String destinationS3Uri) {
        setDestinationS3Uri(destinationS3Uri);
        return this;
    }

    /**
     * <p/>
     * 
     * @param kmsKeyId
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p/>
     * 
     * @param kmsKeyId
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
