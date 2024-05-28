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
 * The configuration settings for the SQS sink.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/SqsQueueSinkConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqsQueueSinkConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the SQS sink.
     * </p>
     */
    private String insightsTarget;

    /**
     * <p>
     * The ARN of the SQS sink.
     * </p>
     * 
     * @param insightsTarget
     *        The ARN of the SQS sink.
     */

    public void setInsightsTarget(String insightsTarget) {
        this.insightsTarget = insightsTarget;
    }

    /**
     * <p>
     * The ARN of the SQS sink.
     * </p>
     * 
     * @return The ARN of the SQS sink.
     */

    public String getInsightsTarget() {
        return this.insightsTarget;
    }

    /**
     * <p>
     * The ARN of the SQS sink.
     * </p>
     * 
     * @param insightsTarget
     *        The ARN of the SQS sink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqsQueueSinkConfiguration withInsightsTarget(String insightsTarget) {
        setInsightsTarget(insightsTarget);
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
        if (getInsightsTarget() != null)
            sb.append("InsightsTarget: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqsQueueSinkConfiguration == false)
            return false;
        SqsQueueSinkConfiguration other = (SqsQueueSinkConfiguration) obj;
        if (other.getInsightsTarget() == null ^ this.getInsightsTarget() == null)
            return false;
        if (other.getInsightsTarget() != null && other.getInsightsTarget().equals(this.getInsightsTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightsTarget() == null) ? 0 : getInsightsTarget().hashCode());
        return hashCode;
    }

    @Override
    public SqsQueueSinkConfiguration clone() {
        try {
            return (SqsQueueSinkConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.SqsQueueSinkConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
