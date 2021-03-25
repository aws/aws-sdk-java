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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the location of input data.
 * </p>
 * <p>
 * You must specify at least one of the following: <code>S3DataSource</code> or <code>SnsDataSource</code>.
 * </p>
 * <p>
 * Use <code>SnsDataSource</code> to specify an SNS input topic for a streaming labeling job. If you do not specify and
 * SNS input topic ARN, Ground Truth will create a one-time labeling job.
 * </p>
 * <p>
 * Use <code>S3DataSource</code> to specify an input manifest file for both streaming and one-time labeling jobs. Adding
 * an <code>S3DataSource</code> is optional if you use <code>SnsDataSource</code> to create a streaming labeling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobDataSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location of the input data objects.
     * </p>
     */
    private LabelingJobS3DataSource s3DataSource;
    /**
     * <p>
     * An Amazon SNS data source used for streaming labeling jobs. To learn more, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-send-data"
     * >Send Data to a Streaming Labeling Job</a>.
     * </p>
     */
    private LabelingJobSnsDataSource snsDataSource;

    /**
     * <p>
     * The Amazon S3 location of the input data objects.
     * </p>
     * 
     * @param s3DataSource
     *        The Amazon S3 location of the input data objects.
     */

    public void setS3DataSource(LabelingJobS3DataSource s3DataSource) {
        this.s3DataSource = s3DataSource;
    }

    /**
     * <p>
     * The Amazon S3 location of the input data objects.
     * </p>
     * 
     * @return The Amazon S3 location of the input data objects.
     */

    public LabelingJobS3DataSource getS3DataSource() {
        return this.s3DataSource;
    }

    /**
     * <p>
     * The Amazon S3 location of the input data objects.
     * </p>
     * 
     * @param s3DataSource
     *        The Amazon S3 location of the input data objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobDataSource withS3DataSource(LabelingJobS3DataSource s3DataSource) {
        setS3DataSource(s3DataSource);
        return this;
    }

    /**
     * <p>
     * An Amazon SNS data source used for streaming labeling jobs. To learn more, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-send-data"
     * >Send Data to a Streaming Labeling Job</a>.
     * </p>
     * 
     * @param snsDataSource
     *        An Amazon SNS data source used for streaming labeling jobs. To learn more, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-send-data"
     *        >Send Data to a Streaming Labeling Job</a>.
     */

    public void setSnsDataSource(LabelingJobSnsDataSource snsDataSource) {
        this.snsDataSource = snsDataSource;
    }

    /**
     * <p>
     * An Amazon SNS data source used for streaming labeling jobs. To learn more, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-send-data"
     * >Send Data to a Streaming Labeling Job</a>.
     * </p>
     * 
     * @return An Amazon SNS data source used for streaming labeling jobs. To learn more, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-send-data"
     *         >Send Data to a Streaming Labeling Job</a>.
     */

    public LabelingJobSnsDataSource getSnsDataSource() {
        return this.snsDataSource;
    }

    /**
     * <p>
     * An Amazon SNS data source used for streaming labeling jobs. To learn more, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-send-data"
     * >Send Data to a Streaming Labeling Job</a>.
     * </p>
     * 
     * @param snsDataSource
     *        An Amazon SNS data source used for streaming labeling jobs. To learn more, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-send-data"
     *        >Send Data to a Streaming Labeling Job</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobDataSource withSnsDataSource(LabelingJobSnsDataSource snsDataSource) {
        setSnsDataSource(snsDataSource);
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
        if (getS3DataSource() != null)
            sb.append("S3DataSource: ").append(getS3DataSource()).append(",");
        if (getSnsDataSource() != null)
            sb.append("SnsDataSource: ").append(getSnsDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobDataSource == false)
            return false;
        LabelingJobDataSource other = (LabelingJobDataSource) obj;
        if (other.getS3DataSource() == null ^ this.getS3DataSource() == null)
            return false;
        if (other.getS3DataSource() != null && other.getS3DataSource().equals(this.getS3DataSource()) == false)
            return false;
        if (other.getSnsDataSource() == null ^ this.getSnsDataSource() == null)
            return false;
        if (other.getSnsDataSource() != null && other.getSnsDataSource().equals(this.getSnsDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DataSource() == null) ? 0 : getS3DataSource().hashCode());
        hashCode = prime * hashCode + ((getSnsDataSource() == null) ? 0 : getSnsDataSource().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobDataSource clone() {
        try {
            return (LabelingJobDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
