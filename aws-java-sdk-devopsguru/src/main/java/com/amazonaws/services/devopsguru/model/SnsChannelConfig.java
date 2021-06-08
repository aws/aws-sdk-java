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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
 * </p>
 * <p>
 * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants DevOps Guru permission
 * to it notifications. DevOps Guru adds the required policy on your behalf to send notifications using Amazon SNS in
 * your account. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html">Permissions for cross
 * account Amazon SNS topics</a>.
 * </p>
 * <p>
 * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service customer-managed key (CMK), then
 * you must add permissions to the CMK. For more information, see <a
 * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html">Permissions for AWS
 * KMS–encrypted Amazon SNS topics</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/SnsChannelConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnsChannelConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnsChannelConfig withTopicArn(String topicArn) {
        setTopicArn(topicArn);
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnsChannelConfig == false)
            return false;
        SnsChannelConfig other = (SnsChannelConfig) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public SnsChannelConfig clone() {
        try {
            return (SnsChannelConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.SnsChannelConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
