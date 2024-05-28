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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration information for the Wisdom assistant integration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/AssistantIntegrationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssistantIntegrationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integrated Amazon SNS topic used for streaming chat messages.
     * </p>
     */
    private String topicIntegrationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integrated Amazon SNS topic used for streaming chat messages.
     * </p>
     * 
     * @param topicIntegrationArn
     *        The Amazon Resource Name (ARN) of the integrated Amazon SNS topic used for streaming chat messages.
     */

    public void setTopicIntegrationArn(String topicIntegrationArn) {
        this.topicIntegrationArn = topicIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integrated Amazon SNS topic used for streaming chat messages.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the integrated Amazon SNS topic used for streaming chat messages.
     */

    public String getTopicIntegrationArn() {
        return this.topicIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the integrated Amazon SNS topic used for streaming chat messages.
     * </p>
     * 
     * @param topicIntegrationArn
     *        The Amazon Resource Name (ARN) of the integrated Amazon SNS topic used for streaming chat messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantIntegrationConfiguration withTopicIntegrationArn(String topicIntegrationArn) {
        setTopicIntegrationArn(topicIntegrationArn);
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
        if (getTopicIntegrationArn() != null)
            sb.append("TopicIntegrationArn: ").append(getTopicIntegrationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssistantIntegrationConfiguration == false)
            return false;
        AssistantIntegrationConfiguration other = (AssistantIntegrationConfiguration) obj;
        if (other.getTopicIntegrationArn() == null ^ this.getTopicIntegrationArn() == null)
            return false;
        if (other.getTopicIntegrationArn() != null && other.getTopicIntegrationArn().equals(this.getTopicIntegrationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicIntegrationArn() == null) ? 0 : getTopicIntegrationArn().hashCode());
        return hashCode;
    }

    @Override
    public AssistantIntegrationConfiguration clone() {
        try {
            return (AssistantIntegrationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.AssistantIntegrationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
