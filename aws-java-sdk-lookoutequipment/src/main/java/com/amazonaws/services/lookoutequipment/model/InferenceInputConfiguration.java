/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * &gt; Specifies configuration information for the input data for the inference, including S3 location of input data..
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/InferenceInputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceInputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies configuration information for the input data for the inference, including S3 location of input data..
     * </p>
     */
    private InferenceS3InputConfiguration s3InputConfiguration;
    /**
     * <p>
     * Indicates the difference between your time zone and Greenwich Mean Time (GMT).
     * </p>
     */
    private String inputTimeZoneOffset;
    /**
     * <p>
     * &gt; Specifies configuration information for the input data for the inference, including timestamp format and
     * delimiter.
     * </p>
     */
    private InferenceInputNameConfiguration inferenceInputNameConfiguration;

    /**
     * <p>
     * Specifies configuration information for the input data for the inference, including S3 location of input data..
     * </p>
     * 
     * @param s3InputConfiguration
     *        Specifies configuration information for the input data for the inference, including S3 location of input
     *        data..
     */

    public void setS3InputConfiguration(InferenceS3InputConfiguration s3InputConfiguration) {
        this.s3InputConfiguration = s3InputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the input data for the inference, including S3 location of input data..
     * </p>
     * 
     * @return Specifies configuration information for the input data for the inference, including S3 location of input
     *         data..
     */

    public InferenceS3InputConfiguration getS3InputConfiguration() {
        return this.s3InputConfiguration;
    }

    /**
     * <p>
     * Specifies configuration information for the input data for the inference, including S3 location of input data..
     * </p>
     * 
     * @param s3InputConfiguration
     *        Specifies configuration information for the input data for the inference, including S3 location of input
     *        data..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceInputConfiguration withS3InputConfiguration(InferenceS3InputConfiguration s3InputConfiguration) {
        setS3InputConfiguration(s3InputConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates the difference between your time zone and Greenwich Mean Time (GMT).
     * </p>
     * 
     * @param inputTimeZoneOffset
     *        Indicates the difference between your time zone and Greenwich Mean Time (GMT).
     */

    public void setInputTimeZoneOffset(String inputTimeZoneOffset) {
        this.inputTimeZoneOffset = inputTimeZoneOffset;
    }

    /**
     * <p>
     * Indicates the difference between your time zone and Greenwich Mean Time (GMT).
     * </p>
     * 
     * @return Indicates the difference between your time zone and Greenwich Mean Time (GMT).
     */

    public String getInputTimeZoneOffset() {
        return this.inputTimeZoneOffset;
    }

    /**
     * <p>
     * Indicates the difference between your time zone and Greenwich Mean Time (GMT).
     * </p>
     * 
     * @param inputTimeZoneOffset
     *        Indicates the difference between your time zone and Greenwich Mean Time (GMT).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceInputConfiguration withInputTimeZoneOffset(String inputTimeZoneOffset) {
        setInputTimeZoneOffset(inputTimeZoneOffset);
        return this;
    }

    /**
     * <p>
     * &gt; Specifies configuration information for the input data for the inference, including timestamp format and
     * delimiter.
     * </p>
     * 
     * @param inferenceInputNameConfiguration
     *        &gt; Specifies configuration information for the input data for the inference, including timestamp format
     *        and delimiter.
     */

    public void setInferenceInputNameConfiguration(InferenceInputNameConfiguration inferenceInputNameConfiguration) {
        this.inferenceInputNameConfiguration = inferenceInputNameConfiguration;
    }

    /**
     * <p>
     * &gt; Specifies configuration information for the input data for the inference, including timestamp format and
     * delimiter.
     * </p>
     * 
     * @return &gt; Specifies configuration information for the input data for the inference, including timestamp format
     *         and delimiter.
     */

    public InferenceInputNameConfiguration getInferenceInputNameConfiguration() {
        return this.inferenceInputNameConfiguration;
    }

    /**
     * <p>
     * &gt; Specifies configuration information for the input data for the inference, including timestamp format and
     * delimiter.
     * </p>
     * 
     * @param inferenceInputNameConfiguration
     *        &gt; Specifies configuration information for the input data for the inference, including timestamp format
     *        and delimiter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceInputConfiguration withInferenceInputNameConfiguration(InferenceInputNameConfiguration inferenceInputNameConfiguration) {
        setInferenceInputNameConfiguration(inferenceInputNameConfiguration);
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
        if (getS3InputConfiguration() != null)
            sb.append("S3InputConfiguration: ").append(getS3InputConfiguration()).append(",");
        if (getInputTimeZoneOffset() != null)
            sb.append("InputTimeZoneOffset: ").append(getInputTimeZoneOffset()).append(",");
        if (getInferenceInputNameConfiguration() != null)
            sb.append("InferenceInputNameConfiguration: ").append(getInferenceInputNameConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceInputConfiguration == false)
            return false;
        InferenceInputConfiguration other = (InferenceInputConfiguration) obj;
        if (other.getS3InputConfiguration() == null ^ this.getS3InputConfiguration() == null)
            return false;
        if (other.getS3InputConfiguration() != null && other.getS3InputConfiguration().equals(this.getS3InputConfiguration()) == false)
            return false;
        if (other.getInputTimeZoneOffset() == null ^ this.getInputTimeZoneOffset() == null)
            return false;
        if (other.getInputTimeZoneOffset() != null && other.getInputTimeZoneOffset().equals(this.getInputTimeZoneOffset()) == false)
            return false;
        if (other.getInferenceInputNameConfiguration() == null ^ this.getInferenceInputNameConfiguration() == null)
            return false;
        if (other.getInferenceInputNameConfiguration() != null
                && other.getInferenceInputNameConfiguration().equals(this.getInferenceInputNameConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3InputConfiguration() == null) ? 0 : getS3InputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInputTimeZoneOffset() == null) ? 0 : getInputTimeZoneOffset().hashCode());
        hashCode = prime * hashCode + ((getInferenceInputNameConfiguration() == null) ? 0 : getInferenceInputNameConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public InferenceInputConfiguration clone() {
        try {
            return (InferenceInputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.InferenceInputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
