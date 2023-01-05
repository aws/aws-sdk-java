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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proposed access control configuration for an Amazon SNS topic. You can propose a configuration for a new Amazon
 * SNS topic or an existing Amazon SNS topic that you own by specifying the policy. If the configuration is for an
 * existing Amazon SNS topic and you do not specify the Amazon SNS policy, then the access preview uses the existing
 * Amazon SNS policy for the topic. If the access preview is for a new resource and you do not specify the policy, then
 * the access preview assumes an Amazon SNS topic without a policy. To propose deletion of an existing Amazon SNS topic
 * policy, you can specify an empty string for the Amazon SNS policy. For more information, see <a
 * href="https://docs.aws.amazon.com/sns/latest/api/API_Topic.html">Topic</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/SnsTopicConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnsTopicConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON policy text that defines who can access an Amazon SNS topic. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-access-policy-use-cases.html">Example cases for Amazon SNS
     * access control</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     */
    private String topicPolicy;

    /**
     * <p>
     * The JSON policy text that defines who can access an Amazon SNS topic. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-access-policy-use-cases.html">Example cases for Amazon SNS
     * access control</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param topicPolicy
     *        The JSON policy text that defines who can access an Amazon SNS topic. For more information, see <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-access-policy-use-cases.html">Example cases for Amazon
     *        SNS access control</a> in the <i>Amazon SNS Developer Guide</i>.
     */

    public void setTopicPolicy(String topicPolicy) {
        this.topicPolicy = topicPolicy;
    }

    /**
     * <p>
     * The JSON policy text that defines who can access an Amazon SNS topic. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-access-policy-use-cases.html">Example cases for Amazon SNS
     * access control</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @return The JSON policy text that defines who can access an Amazon SNS topic. For more information, see <a
     *         href="https://docs.aws.amazon.com/sns/latest/dg/sns-access-policy-use-cases.html">Example cases for
     *         Amazon SNS access control</a> in the <i>Amazon SNS Developer Guide</i>.
     */

    public String getTopicPolicy() {
        return this.topicPolicy;
    }

    /**
     * <p>
     * The JSON policy text that defines who can access an Amazon SNS topic. For more information, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-access-policy-use-cases.html">Example cases for Amazon SNS
     * access control</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * 
     * @param topicPolicy
     *        The JSON policy text that defines who can access an Amazon SNS topic. For more information, see <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-access-policy-use-cases.html">Example cases for Amazon
     *        SNS access control</a> in the <i>Amazon SNS Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnsTopicConfiguration withTopicPolicy(String topicPolicy) {
        setTopicPolicy(topicPolicy);
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
        if (getTopicPolicy() != null)
            sb.append("TopicPolicy: ").append(getTopicPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnsTopicConfiguration == false)
            return false;
        SnsTopicConfiguration other = (SnsTopicConfiguration) obj;
        if (other.getTopicPolicy() == null ^ this.getTopicPolicy() == null)
            return false;
        if (other.getTopicPolicy() != null && other.getTopicPolicy().equals(this.getTopicPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicPolicy() == null) ? 0 : getTopicPolicy().hashCode());
        return hashCode;
    }

    @Override
    public SnsTopicConfiguration clone() {
        try {
            return (SnsTopicConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.SnsTopicConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
