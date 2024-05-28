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
 * Contains configurations to override a prompt template in one part of an agent sequence. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts.html">Advanced prompts</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the prompt template with which to replace the default prompt template. You can use placeholder variables
     * in the base prompt template to customize the prompt. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html">Prompt template placeholder
     * variables</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html">Configure the prompt
     * templates</a>.
     * </p>
     */
    private String basePromptTemplate;
    /**
     * <p>
     * Contains inference parameters to use when the agent invokes a foundation model in the part of the agent sequence
     * defined by the <code>promptType</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     */
    private InferenceConfiguration inferenceConfiguration;
    /**
     * <p>
     * Specifies whether to override the default parser Lambda function when parsing the raw foundation model output in
     * the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     * <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     * >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * </p>
     */
    private String parserMode;
    /**
     * <p>
     * Specifies whether to override the default prompt template for this <code>promptType</code>. Set this value to
     * <code>OVERRIDDEN</code> to use the prompt that you provide in the <code>basePromptTemplate</code>. If you leave
     * it as <code>DEFAULT</code>, the agent uses a default prompt template.
     * </p>
     */
    private String promptCreationMode;
    /**
     * <p>
     * Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If you set
     * this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     * <code>promptType</code> is as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORCHESTRATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_PROCESSING</code> – <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String promptState;
    /**
     * <p>
     * The step in the agent sequence that this prompt configuration applies to.
     * </p>
     */
    private String promptType;

    /**
     * <p>
     * Defines the prompt template with which to replace the default prompt template. You can use placeholder variables
     * in the base prompt template to customize the prompt. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html">Prompt template placeholder
     * variables</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html">Configure the prompt
     * templates</a>.
     * </p>
     * 
     * @param basePromptTemplate
     *        Defines the prompt template with which to replace the default prompt template. You can use placeholder
     *        variables in the base prompt template to customize the prompt. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html">Prompt template
     *        placeholder variables</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html">Configure the
     *        prompt templates</a>.
     */

    public void setBasePromptTemplate(String basePromptTemplate) {
        this.basePromptTemplate = basePromptTemplate;
    }

    /**
     * <p>
     * Defines the prompt template with which to replace the default prompt template. You can use placeholder variables
     * in the base prompt template to customize the prompt. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html">Prompt template placeholder
     * variables</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html">Configure the prompt
     * templates</a>.
     * </p>
     * 
     * @return Defines the prompt template with which to replace the default prompt template. You can use placeholder
     *         variables in the base prompt template to customize the prompt. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html">Prompt template
     *         placeholder variables</a>. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html">Configure the
     *         prompt templates</a>.
     */

    public String getBasePromptTemplate() {
        return this.basePromptTemplate;
    }

    /**
     * <p>
     * Defines the prompt template with which to replace the default prompt template. You can use placeholder variables
     * in the base prompt template to customize the prompt. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html">Prompt template placeholder
     * variables</a>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html">Configure the prompt
     * templates</a>.
     * </p>
     * 
     * @param basePromptTemplate
     *        Defines the prompt template with which to replace the default prompt template. You can use placeholder
     *        variables in the base prompt template to customize the prompt. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/prompt-placeholders.html">Prompt template
     *        placeholder variables</a>. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/advanced-prompts-configure.html">Configure the
     *        prompt templates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptConfiguration withBasePromptTemplate(String basePromptTemplate) {
        setBasePromptTemplate(basePromptTemplate);
        return this;
    }

    /**
     * <p>
     * Contains inference parameters to use when the agent invokes a foundation model in the part of the agent sequence
     * defined by the <code>promptType</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @param inferenceConfiguration
     *        Contains inference parameters to use when the agent invokes a foundation model in the part of the agent
     *        sequence defined by the <code>promptType</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     *        foundation models</a>.
     */

    public void setInferenceConfiguration(InferenceConfiguration inferenceConfiguration) {
        this.inferenceConfiguration = inferenceConfiguration;
    }

    /**
     * <p>
     * Contains inference parameters to use when the agent invokes a foundation model in the part of the agent sequence
     * defined by the <code>promptType</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @return Contains inference parameters to use when the agent invokes a foundation model in the part of the agent
     *         sequence defined by the <code>promptType</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters
     *         for foundation models</a>.
     */

    public InferenceConfiguration getInferenceConfiguration() {
        return this.inferenceConfiguration;
    }

    /**
     * <p>
     * Contains inference parameters to use when the agent invokes a foundation model in the part of the agent sequence
     * defined by the <code>promptType</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     * foundation models</a>.
     * </p>
     * 
     * @param inferenceConfiguration
     *        Contains inference parameters to use when the agent invokes a foundation model in the part of the agent
     *        sequence defined by the <code>promptType</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for
     *        foundation models</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptConfiguration withInferenceConfiguration(InferenceConfiguration inferenceConfiguration) {
        setInferenceConfiguration(inferenceConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies whether to override the default parser Lambda function when parsing the raw foundation model output in
     * the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     * <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     * >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * </p>
     * 
     * @param parserMode
     *        Specifies whether to override the default parser Lambda function when parsing the raw foundation model
     *        output in the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     *        <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     *        >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * @see CreationMode
     */

    public void setParserMode(String parserMode) {
        this.parserMode = parserMode;
    }

    /**
     * <p>
     * Specifies whether to override the default parser Lambda function when parsing the raw foundation model output in
     * the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     * <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     * >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * </p>
     * 
     * @return Specifies whether to override the default parser Lambda function when parsing the raw foundation model
     *         output in the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     *         <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     *         >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * @see CreationMode
     */

    public String getParserMode() {
        return this.parserMode;
    }

    /**
     * <p>
     * Specifies whether to override the default parser Lambda function when parsing the raw foundation model output in
     * the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     * <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     * >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * </p>
     * 
     * @param parserMode
     *        Specifies whether to override the default parser Lambda function when parsing the raw foundation model
     *        output in the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     *        <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     *        >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreationMode
     */

    public PromptConfiguration withParserMode(String parserMode) {
        setParserMode(parserMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether to override the default parser Lambda function when parsing the raw foundation model output in
     * the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     * <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     * >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * </p>
     * 
     * @param parserMode
     *        Specifies whether to override the default parser Lambda function when parsing the raw foundation model
     *        output in the part of the agent sequence defined by the <code>promptType</code>. If you set the field as
     *        <code>OVERRIDEN</code>, the <code>overrideLambda</code> field in the <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_PromptOverrideConfiguration.html"
     *        >PromptOverrideConfiguration</a> must be specified with the ARN of a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreationMode
     */

    public PromptConfiguration withParserMode(CreationMode parserMode) {
        this.parserMode = parserMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to override the default prompt template for this <code>promptType</code>. Set this value to
     * <code>OVERRIDDEN</code> to use the prompt that you provide in the <code>basePromptTemplate</code>. If you leave
     * it as <code>DEFAULT</code>, the agent uses a default prompt template.
     * </p>
     * 
     * @param promptCreationMode
     *        Specifies whether to override the default prompt template for this <code>promptType</code>. Set this value
     *        to <code>OVERRIDDEN</code> to use the prompt that you provide in the <code>basePromptTemplate</code>. If
     *        you leave it as <code>DEFAULT</code>, the agent uses a default prompt template.
     * @see CreationMode
     */

    public void setPromptCreationMode(String promptCreationMode) {
        this.promptCreationMode = promptCreationMode;
    }

    /**
     * <p>
     * Specifies whether to override the default prompt template for this <code>promptType</code>. Set this value to
     * <code>OVERRIDDEN</code> to use the prompt that you provide in the <code>basePromptTemplate</code>. If you leave
     * it as <code>DEFAULT</code>, the agent uses a default prompt template.
     * </p>
     * 
     * @return Specifies whether to override the default prompt template for this <code>promptType</code>. Set this
     *         value to <code>OVERRIDDEN</code> to use the prompt that you provide in the
     *         <code>basePromptTemplate</code>. If you leave it as <code>DEFAULT</code>, the agent uses a default prompt
     *         template.
     * @see CreationMode
     */

    public String getPromptCreationMode() {
        return this.promptCreationMode;
    }

    /**
     * <p>
     * Specifies whether to override the default prompt template for this <code>promptType</code>. Set this value to
     * <code>OVERRIDDEN</code> to use the prompt that you provide in the <code>basePromptTemplate</code>. If you leave
     * it as <code>DEFAULT</code>, the agent uses a default prompt template.
     * </p>
     * 
     * @param promptCreationMode
     *        Specifies whether to override the default prompt template for this <code>promptType</code>. Set this value
     *        to <code>OVERRIDDEN</code> to use the prompt that you provide in the <code>basePromptTemplate</code>. If
     *        you leave it as <code>DEFAULT</code>, the agent uses a default prompt template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreationMode
     */

    public PromptConfiguration withPromptCreationMode(String promptCreationMode) {
        setPromptCreationMode(promptCreationMode);
        return this;
    }

    /**
     * <p>
     * Specifies whether to override the default prompt template for this <code>promptType</code>. Set this value to
     * <code>OVERRIDDEN</code> to use the prompt that you provide in the <code>basePromptTemplate</code>. If you leave
     * it as <code>DEFAULT</code>, the agent uses a default prompt template.
     * </p>
     * 
     * @param promptCreationMode
     *        Specifies whether to override the default prompt template for this <code>promptType</code>. Set this value
     *        to <code>OVERRIDDEN</code> to use the prompt that you provide in the <code>basePromptTemplate</code>. If
     *        you leave it as <code>DEFAULT</code>, the agent uses a default prompt template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreationMode
     */

    public PromptConfiguration withPromptCreationMode(CreationMode promptCreationMode) {
        this.promptCreationMode = promptCreationMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If you set
     * this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     * <code>promptType</code> is as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORCHESTRATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_PROCESSING</code> – <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param promptState
     *        Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If
     *        you set this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     *        <code>promptType</code> is as follows.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORCHESTRATION</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POST_PROCESSING</code> – <code>DISABLED</code>
     *        </p>
     *        </li>
     * @see PromptState
     */

    public void setPromptState(String promptState) {
        this.promptState = promptState;
    }

    /**
     * <p>
     * Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If you set
     * this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     * <code>promptType</code> is as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORCHESTRATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_PROCESSING</code> – <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If
     *         you set this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     *         <code>promptType</code> is as follows.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ORCHESTRATION</code> – <code>ENABLED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>POST_PROCESSING</code> – <code>DISABLED</code>
     *         </p>
     *         </li>
     * @see PromptState
     */

    public String getPromptState() {
        return this.promptState;
    }

    /**
     * <p>
     * Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If you set
     * this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     * <code>promptType</code> is as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORCHESTRATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_PROCESSING</code> – <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param promptState
     *        Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If
     *        you set this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     *        <code>promptType</code> is as follows.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORCHESTRATION</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POST_PROCESSING</code> – <code>DISABLED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptState
     */

    public PromptConfiguration withPromptState(String promptState) {
        setPromptState(promptState);
        return this;
    }

    /**
     * <p>
     * Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If you set
     * this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     * <code>promptType</code> is as follows.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ORCHESTRATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>POST_PROCESSING</code> – <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param promptState
     *        Specifies whether to allow the agent to carry out the step specified in the <code>promptType</code>. If
     *        you set this value to <code>DISABLED</code>, the agent skips that step. The default state for each
     *        <code>promptType</code> is as follows.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PRE_PROCESSING</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ORCHESTRATION</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KNOWLEDGE_BASE_RESPONSE_GENERATION</code> – <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>POST_PROCESSING</code> – <code>DISABLED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptState
     */

    public PromptConfiguration withPromptState(PromptState promptState) {
        this.promptState = promptState.toString();
        return this;
    }

    /**
     * <p>
     * The step in the agent sequence that this prompt configuration applies to.
     * </p>
     * 
     * @param promptType
     *        The step in the agent sequence that this prompt configuration applies to.
     * @see PromptType
     */

    public void setPromptType(String promptType) {
        this.promptType = promptType;
    }

    /**
     * <p>
     * The step in the agent sequence that this prompt configuration applies to.
     * </p>
     * 
     * @return The step in the agent sequence that this prompt configuration applies to.
     * @see PromptType
     */

    public String getPromptType() {
        return this.promptType;
    }

    /**
     * <p>
     * The step in the agent sequence that this prompt configuration applies to.
     * </p>
     * 
     * @param promptType
     *        The step in the agent sequence that this prompt configuration applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptType
     */

    public PromptConfiguration withPromptType(String promptType) {
        setPromptType(promptType);
        return this;
    }

    /**
     * <p>
     * The step in the agent sequence that this prompt configuration applies to.
     * </p>
     * 
     * @param promptType
     *        The step in the agent sequence that this prompt configuration applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptType
     */

    public PromptConfiguration withPromptType(PromptType promptType) {
        this.promptType = promptType.toString();
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
        if (getBasePromptTemplate() != null)
            sb.append("BasePromptTemplate: ").append(getBasePromptTemplate()).append(",");
        if (getInferenceConfiguration() != null)
            sb.append("InferenceConfiguration: ").append(getInferenceConfiguration()).append(",");
        if (getParserMode() != null)
            sb.append("ParserMode: ").append(getParserMode()).append(",");
        if (getPromptCreationMode() != null)
            sb.append("PromptCreationMode: ").append(getPromptCreationMode()).append(",");
        if (getPromptState() != null)
            sb.append("PromptState: ").append(getPromptState()).append(",");
        if (getPromptType() != null)
            sb.append("PromptType: ").append(getPromptType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptConfiguration == false)
            return false;
        PromptConfiguration other = (PromptConfiguration) obj;
        if (other.getBasePromptTemplate() == null ^ this.getBasePromptTemplate() == null)
            return false;
        if (other.getBasePromptTemplate() != null && other.getBasePromptTemplate().equals(this.getBasePromptTemplate()) == false)
            return false;
        if (other.getInferenceConfiguration() == null ^ this.getInferenceConfiguration() == null)
            return false;
        if (other.getInferenceConfiguration() != null && other.getInferenceConfiguration().equals(this.getInferenceConfiguration()) == false)
            return false;
        if (other.getParserMode() == null ^ this.getParserMode() == null)
            return false;
        if (other.getParserMode() != null && other.getParserMode().equals(this.getParserMode()) == false)
            return false;
        if (other.getPromptCreationMode() == null ^ this.getPromptCreationMode() == null)
            return false;
        if (other.getPromptCreationMode() != null && other.getPromptCreationMode().equals(this.getPromptCreationMode()) == false)
            return false;
        if (other.getPromptState() == null ^ this.getPromptState() == null)
            return false;
        if (other.getPromptState() != null && other.getPromptState().equals(this.getPromptState()) == false)
            return false;
        if (other.getPromptType() == null ^ this.getPromptType() == null)
            return false;
        if (other.getPromptType() != null && other.getPromptType().equals(this.getPromptType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBasePromptTemplate() == null) ? 0 : getBasePromptTemplate().hashCode());
        hashCode = prime * hashCode + ((getInferenceConfiguration() == null) ? 0 : getInferenceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getParserMode() == null) ? 0 : getParserMode().hashCode());
        hashCode = prime * hashCode + ((getPromptCreationMode() == null) ? 0 : getPromptCreationMode().hashCode());
        hashCode = prime * hashCode + ((getPromptState() == null) ? 0 : getPromptState().hashCode());
        hashCode = prime * hashCode + ((getPromptType() == null) ? 0 : getPromptType().hashCode());
        return hashCode;
    }

    @Override
    public PromptConfiguration clone() {
        try {
            return (PromptConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
