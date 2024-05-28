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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configurations to override prompts in different parts of an agent sequence. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptOverrideConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptOverrideConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Lambda function to use when parsing the raw foundation model output in parts of the agent
     * sequence. If you specify this field, at least one of the <code>promptConfigurations</code> must contain a
     * <code>parserMode</code> value that is set to <code>OVERRIDDEN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html">Parser Lambda function in Agents
     * for Amazon Bedrock</a>.
     * </p>
     */
    private String overrideLambda;
    /**
     * <p>
     * Contains configurations to override a prompt template in one part of an agent sequence. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     */
    private java.util.List<PromptConfiguration> promptConfigurations;

    /**
     * <p>
     * The ARN of the Lambda function to use when parsing the raw foundation model output in parts of the agent
     * sequence. If you specify this field, at least one of the <code>promptConfigurations</code> must contain a
     * <code>parserMode</code> value that is set to <code>OVERRIDDEN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html">Parser Lambda function in Agents
     * for Amazon Bedrock</a>.
     * </p>
     * 
     * @param overrideLambda
     *        The ARN of the Lambda function to use when parsing the raw foundation model output in parts of the agent
     *        sequence. If you specify this field, at least one of the <code>promptConfigurations</code> must contain a
     *        <code>parserMode</code> value that is set to <code>OVERRIDDEN</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html">Parser Lambda function in
     *        Agents for Amazon Bedrock</a>.
     */

    public void setOverrideLambda(String overrideLambda) {
        this.overrideLambda = overrideLambda;
    }

    /**
     * <p>
     * The ARN of the Lambda function to use when parsing the raw foundation model output in parts of the agent
     * sequence. If you specify this field, at least one of the <code>promptConfigurations</code> must contain a
     * <code>parserMode</code> value that is set to <code>OVERRIDDEN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html">Parser Lambda function in Agents
     * for Amazon Bedrock</a>.
     * </p>
     * 
     * @return The ARN of the Lambda function to use when parsing the raw foundation model output in parts of the agent
     *         sequence. If you specify this field, at least one of the <code>promptConfigurations</code> must contain a
     *         <code>parserMode</code> value that is set to <code>OVERRIDDEN</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html">Parser Lambda function in
     *         Agents for Amazon Bedrock</a>.
     */

    public String getOverrideLambda() {
        return this.overrideLambda;
    }

    /**
     * <p>
     * The ARN of the Lambda function to use when parsing the raw foundation model output in parts of the agent
     * sequence. If you specify this field, at least one of the <code>promptConfigurations</code> must contain a
     * <code>parserMode</code> value that is set to <code>OVERRIDDEN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html">Parser Lambda function in Agents
     * for Amazon Bedrock</a>.
     * </p>
     * 
     * @param overrideLambda
     *        The ARN of the Lambda function to use when parsing the raw foundation model output in parts of the agent
     *        sequence. If you specify this field, at least one of the <code>promptConfigurations</code> must contain a
     *        <code>parserMode</code> value that is set to <code>OVERRIDDEN</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/lambda-parser.html">Parser Lambda function in
     *        Agents for Amazon Bedrock</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptOverrideConfiguration withOverrideLambda(String overrideLambda) {
        setOverrideLambda(overrideLambda);
        return this;
    }

    /**
     * <p>
     * Contains configurations to override a prompt template in one part of an agent sequence. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * 
     * @return Contains configurations to override a prompt template in one part of an agent sequence. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     */

    public java.util.List<PromptConfiguration> getPromptConfigurations() {
        return promptConfigurations;
    }

    /**
     * <p>
     * Contains configurations to override a prompt template in one part of an agent sequence. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * 
     * @param promptConfigurations
     *        Contains configurations to override a prompt template in one part of an agent sequence. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     */

    public void setPromptConfigurations(java.util.Collection<PromptConfiguration> promptConfigurations) {
        if (promptConfigurations == null) {
            this.promptConfigurations = null;
            return;
        }

        this.promptConfigurations = new java.util.ArrayList<PromptConfiguration>(promptConfigurations);
    }

    /**
     * <p>
     * Contains configurations to override a prompt template in one part of an agent sequence. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPromptConfigurations(java.util.Collection)} or {@link #withPromptConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param promptConfigurations
     *        Contains configurations to override a prompt template in one part of an agent sequence. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptOverrideConfiguration withPromptConfigurations(PromptConfiguration... promptConfigurations) {
        if (this.promptConfigurations == null) {
            setPromptConfigurations(new java.util.ArrayList<PromptConfiguration>(promptConfigurations.length));
        }
        for (PromptConfiguration ele : promptConfigurations) {
            this.promptConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains configurations to override a prompt template in one part of an agent sequence. For more information, see
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * </p>
     * 
     * @param promptConfigurations
     *        Contains configurations to override a prompt template in one part of an agent sequence. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptOverrideConfiguration withPromptConfigurations(java.util.Collection<PromptConfiguration> promptConfigurations) {
        setPromptConfigurations(promptConfigurations);
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
        if (getOverrideLambda() != null)
            sb.append("OverrideLambda: ").append(getOverrideLambda()).append(",");
        if (getPromptConfigurations() != null)
            sb.append("PromptConfigurations: ").append(getPromptConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptOverrideConfiguration == false)
            return false;
        PromptOverrideConfiguration other = (PromptOverrideConfiguration) obj;
        if (other.getOverrideLambda() == null ^ this.getOverrideLambda() == null)
            return false;
        if (other.getOverrideLambda() != null && other.getOverrideLambda().equals(this.getOverrideLambda()) == false)
            return false;
        if (other.getPromptConfigurations() == null ^ this.getPromptConfigurations() == null)
            return false;
        if (other.getPromptConfigurations() != null && other.getPromptConfigurations().equals(this.getPromptConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverrideLambda() == null) ? 0 : getOverrideLambda().hashCode());
        hashCode = prime * hashCode + ((getPromptConfigurations() == null) ? 0 : getPromptConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public PromptOverrideConfiguration clone() {
        try {
            return (PromptOverrideConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptOverrideConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
