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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proposed access control configuration for an SQS queue. You can propose a configuration for a new SQS queue or an
 * existing SQS queue that you own by specifying the SQS policy. If the configuration is for an existing SQS queue and
 * you do not specify the SQS policy, the access preview uses the existing SQS policy for the queue. If the access
 * preview is for a new resource and you do not specify the policy, the access preview assumes an SQS queue without a
 * policy. To propose deletion of an existing SQS queue policy, you can specify an empty string for the SQS policy. For
 * more information about SQS policy limits, see <a
 * href="https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/quotas-policies.html">Quotas related
 * to policies</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/SqsQueueConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqsQueueConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The proposed resource policy for the SQS queue.
     * </p>
     */
    private String queuePolicy;

    /**
     * <p>
     * The proposed resource policy for the SQS queue.
     * </p>
     * 
     * @param queuePolicy
     *        The proposed resource policy for the SQS queue.
     */

    public void setQueuePolicy(String queuePolicy) {
        this.queuePolicy = queuePolicy;
    }

    /**
     * <p>
     * The proposed resource policy for the SQS queue.
     * </p>
     * 
     * @return The proposed resource policy for the SQS queue.
     */

    public String getQueuePolicy() {
        return this.queuePolicy;
    }

    /**
     * <p>
     * The proposed resource policy for the SQS queue.
     * </p>
     * 
     * @param queuePolicy
     *        The proposed resource policy for the SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqsQueueConfiguration withQueuePolicy(String queuePolicy) {
        setQueuePolicy(queuePolicy);
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
        if (getQueuePolicy() != null)
            sb.append("QueuePolicy: ").append(getQueuePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqsQueueConfiguration == false)
            return false;
        SqsQueueConfiguration other = (SqsQueueConfiguration) obj;
        if (other.getQueuePolicy() == null ^ this.getQueuePolicy() == null)
            return false;
        if (other.getQueuePolicy() != null && other.getQueuePolicy().equals(this.getQueuePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueuePolicy() == null) ? 0 : getQueuePolicy().hashCode());
        return hashCode;
    }

    @Override
    public SqsQueueConfiguration clone() {
        try {
            return (SqsQueueConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.SqsQueueConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
