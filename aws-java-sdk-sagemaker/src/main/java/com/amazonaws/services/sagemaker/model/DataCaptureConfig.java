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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DataCaptureConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCaptureConfig implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private Boolean enableCapture;
    /** <p/> */
    private Integer initialSamplingPercentage;
    /** <p/> */
    private String destinationS3Uri;
    /** <p/> */
    private String kmsKeyId;
    /** <p/> */
    private java.util.List<CaptureOption> captureOptions;
    /** <p/> */
    private CaptureContentTypeHeader captureContentTypeHeader;

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

    public DataCaptureConfig withEnableCapture(Boolean enableCapture) {
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
     * @param initialSamplingPercentage
     */

    public void setInitialSamplingPercentage(Integer initialSamplingPercentage) {
        this.initialSamplingPercentage = initialSamplingPercentage;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getInitialSamplingPercentage() {
        return this.initialSamplingPercentage;
    }

    /**
     * <p/>
     * 
     * @param initialSamplingPercentage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withInitialSamplingPercentage(Integer initialSamplingPercentage) {
        setInitialSamplingPercentage(initialSamplingPercentage);
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

    public DataCaptureConfig withDestinationS3Uri(String destinationS3Uri) {
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

    public DataCaptureConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<CaptureOption> getCaptureOptions() {
        return captureOptions;
    }

    /**
     * <p/>
     * 
     * @param captureOptions
     */

    public void setCaptureOptions(java.util.Collection<CaptureOption> captureOptions) {
        if (captureOptions == null) {
            this.captureOptions = null;
            return;
        }

        this.captureOptions = new java.util.ArrayList<CaptureOption>(captureOptions);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptureOptions(java.util.Collection)} or {@link #withCaptureOptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param captureOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withCaptureOptions(CaptureOption... captureOptions) {
        if (this.captureOptions == null) {
            setCaptureOptions(new java.util.ArrayList<CaptureOption>(captureOptions.length));
        }
        for (CaptureOption ele : captureOptions) {
            this.captureOptions.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param captureOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withCaptureOptions(java.util.Collection<CaptureOption> captureOptions) {
        setCaptureOptions(captureOptions);
        return this;
    }

    /**
     * <p/>
     * 
     * @param captureContentTypeHeader
     */

    public void setCaptureContentTypeHeader(CaptureContentTypeHeader captureContentTypeHeader) {
        this.captureContentTypeHeader = captureContentTypeHeader;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public CaptureContentTypeHeader getCaptureContentTypeHeader() {
        return this.captureContentTypeHeader;
    }

    /**
     * <p/>
     * 
     * @param captureContentTypeHeader
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withCaptureContentTypeHeader(CaptureContentTypeHeader captureContentTypeHeader) {
        setCaptureContentTypeHeader(captureContentTypeHeader);
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
        if (getInitialSamplingPercentage() != null)
            sb.append("InitialSamplingPercentage: ").append(getInitialSamplingPercentage()).append(",");
        if (getDestinationS3Uri() != null)
            sb.append("DestinationS3Uri: ").append(getDestinationS3Uri()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getCaptureOptions() != null)
            sb.append("CaptureOptions: ").append(getCaptureOptions()).append(",");
        if (getCaptureContentTypeHeader() != null)
            sb.append("CaptureContentTypeHeader: ").append(getCaptureContentTypeHeader());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCaptureConfig == false)
            return false;
        DataCaptureConfig other = (DataCaptureConfig) obj;
        if (other.getEnableCapture() == null ^ this.getEnableCapture() == null)
            return false;
        if (other.getEnableCapture() != null && other.getEnableCapture().equals(this.getEnableCapture()) == false)
            return false;
        if (other.getInitialSamplingPercentage() == null ^ this.getInitialSamplingPercentage() == null)
            return false;
        if (other.getInitialSamplingPercentage() != null && other.getInitialSamplingPercentage().equals(this.getInitialSamplingPercentage()) == false)
            return false;
        if (other.getDestinationS3Uri() == null ^ this.getDestinationS3Uri() == null)
            return false;
        if (other.getDestinationS3Uri() != null && other.getDestinationS3Uri().equals(this.getDestinationS3Uri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCaptureOptions() == null ^ this.getCaptureOptions() == null)
            return false;
        if (other.getCaptureOptions() != null && other.getCaptureOptions().equals(this.getCaptureOptions()) == false)
            return false;
        if (other.getCaptureContentTypeHeader() == null ^ this.getCaptureContentTypeHeader() == null)
            return false;
        if (other.getCaptureContentTypeHeader() != null && other.getCaptureContentTypeHeader().equals(this.getCaptureContentTypeHeader()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableCapture() == null) ? 0 : getEnableCapture().hashCode());
        hashCode = prime * hashCode + ((getInitialSamplingPercentage() == null) ? 0 : getInitialSamplingPercentage().hashCode());
        hashCode = prime * hashCode + ((getDestinationS3Uri() == null) ? 0 : getDestinationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getCaptureOptions() == null) ? 0 : getCaptureOptions().hashCode());
        hashCode = prime * hashCode + ((getCaptureContentTypeHeader() == null) ? 0 : getCaptureContentTypeHeader().hashCode());
        return hashCode;
    }

    @Override
    public DataCaptureConfig clone() {
        try {
            return (DataCaptureConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DataCaptureConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
