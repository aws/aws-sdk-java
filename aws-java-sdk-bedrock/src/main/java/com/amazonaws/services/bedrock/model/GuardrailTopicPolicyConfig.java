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
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_CreateGuardrail.html#API_CreateGuardrail_RequestSyntax"
 * >CreateGuardrail request body</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_UpdateGuardrail.html#API_UpdateGuardrail_RequestSyntax"
 * >UpdateGuardrail request body</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailTopicPolicyConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailTopicPolicyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     */
    private java.util.List<GuardrailTopicConfig> topicsConfig;

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     * 
     * @return A list of policies related to topics that the guardrail should deny.
     */

    public java.util.List<GuardrailTopicConfig> getTopicsConfig() {
        return topicsConfig;
    }

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     * 
     * @param topicsConfig
     *        A list of policies related to topics that the guardrail should deny.
     */

    public void setTopicsConfig(java.util.Collection<GuardrailTopicConfig> topicsConfig) {
        if (topicsConfig == null) {
            this.topicsConfig = null;
            return;
        }

        this.topicsConfig = new java.util.ArrayList<GuardrailTopicConfig>(topicsConfig);
    }

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicsConfig(java.util.Collection)} or {@link #withTopicsConfig(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param topicsConfig
     *        A list of policies related to topics that the guardrail should deny.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopicPolicyConfig withTopicsConfig(GuardrailTopicConfig... topicsConfig) {
        if (this.topicsConfig == null) {
            setTopicsConfig(new java.util.ArrayList<GuardrailTopicConfig>(topicsConfig.length));
        }
        for (GuardrailTopicConfig ele : topicsConfig) {
            this.topicsConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of policies related to topics that the guardrail should deny.
     * </p>
     * 
     * @param topicsConfig
     *        A list of policies related to topics that the guardrail should deny.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopicPolicyConfig withTopicsConfig(java.util.Collection<GuardrailTopicConfig> topicsConfig) {
        setTopicsConfig(topicsConfig);
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
        if (getTopicsConfig() != null)
            sb.append("TopicsConfig: ").append(getTopicsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailTopicPolicyConfig == false)
            return false;
        GuardrailTopicPolicyConfig other = (GuardrailTopicPolicyConfig) obj;
        if (other.getTopicsConfig() == null ^ this.getTopicsConfig() == null)
            return false;
        if (other.getTopicsConfig() != null && other.getTopicsConfig().equals(this.getTopicsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicsConfig() == null) ? 0 : getTopicsConfig().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailTopicPolicyConfig clone() {
        try {
            return (GuardrailTopicPolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailTopicPolicyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
