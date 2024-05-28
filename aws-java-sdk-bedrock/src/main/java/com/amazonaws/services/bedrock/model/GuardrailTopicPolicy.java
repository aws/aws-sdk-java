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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about topics that the guardrail should identify and deny.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GetGuardrail.html#API_GetGuardrail_ResponseSyntax"
 * >GetGuardrail response body</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailTopicPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailTopicPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     */
    private java.util.List<GuardrailTopic> topics;

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     * 
     * @return A list of policies related to topics that the guardrail should deny.
     */

    public java.util.List<GuardrailTopic> getTopics() {
        return topics;
    }

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     * 
     * @param topics
     *        A list of policies related to topics that the guardrail should deny.
     */

    public void setTopics(java.util.Collection<GuardrailTopic> topics) {
        if (topics == null) {
            this.topics = null;
            return;
        }

        this.topics = new java.util.ArrayList<GuardrailTopic>(topics);
    }

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopics(java.util.Collection)} or {@link #withTopics(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param topics
     *        A list of policies related to topics that the guardrail should deny.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopicPolicy withTopics(GuardrailTopic... topics) {
        if (this.topics == null) {
            setTopics(new java.util.ArrayList<GuardrailTopic>(topics.length));
        }
        for (GuardrailTopic ele : topics) {
            this.topics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     * 
     * @param topics
     *        A list of policies related to topics that the guardrail should deny.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopicPolicy withTopics(java.util.Collection<GuardrailTopic> topics) {
        setTopics(topics);
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
        if (getTopics() != null)
            sb.append("Topics: ").append(getTopics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailTopicPolicy == false)
            return false;
        GuardrailTopicPolicy other = (GuardrailTopicPolicy) obj;
        if (other.getTopics() == null ^ this.getTopics() == null)
            return false;
        if (other.getTopics() != null && other.getTopics().equals(this.getTopics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopics() == null) ? 0 : getTopics().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailTopicPolicy clone() {
        try {
            return (GuardrailTopicPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailTopicPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
