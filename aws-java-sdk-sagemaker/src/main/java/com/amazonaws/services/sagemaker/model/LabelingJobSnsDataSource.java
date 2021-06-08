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
 * An Amazon SNS data source used for streaming labeling jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobSnsDataSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobSnsDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to send
     * new data objects to a streaming labeling job.
     * </p>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to send
     * new data objects to a streaming labeling job.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to
     *        send new data objects to a streaming labeling job.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to send
     * new data objects to a streaming labeling job.
     * </p>
     * 
     * @return The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to
     *         send new data objects to a streaming labeling job.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to send
     * new data objects to a streaming labeling job.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon SNS input topic Amazon Resource Name (ARN). Specify the ARN of the input topic you will use to
     *        send new data objects to a streaming labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSnsDataSource withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
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
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobSnsDataSource == false)
            return false;
        LabelingJobSnsDataSource other = (LabelingJobSnsDataSource) obj;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobSnsDataSource clone() {
        try {
            return (LabelingJobSnsDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobSnsDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
