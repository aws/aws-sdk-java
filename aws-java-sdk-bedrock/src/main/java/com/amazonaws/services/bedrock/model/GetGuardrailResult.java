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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GetGuardrail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGuardrailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the guardrail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the guardrail.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     */
    private String guardrailId;
    /**
     * <p>
     * The ARN of the guardrail that was created.
     * </p>
     */
    private String guardrailArn;
    /**
     * <p>
     * The version of the guardrail.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The status of the guardrail.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The topic policy that was configured for the guardrail.
     * </p>
     */
    private GuardrailTopicPolicy topicPolicy;
    /**
     * <p>
     * The content policy that was configured for the guardrail.
     * </p>
     */
    private GuardrailContentPolicy contentPolicy;
    /**
     * <p>
     * The word policy that was configured for the guardrail.
     * </p>
     */
    private GuardrailWordPolicy wordPolicy;
    /**
     * <p>
     * The sensitive information policy that was configured for the guardrail.
     * </p>
     */
    private GuardrailSensitiveInformationPolicy sensitiveInformationPolicy;
    /**
     * <p>
     * The date and time at which the guardrail was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time at which the guardrail was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed to be
     * created, updated, versioned, or deleted.
     * </p>
     */
    private java.util.List<String> statusReasons;
    /**
     * <p>
     * Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to carry
     * out before retrying the request.
     * </p>
     */
    private java.util.List<String> failureRecommendations;
    /**
     * <p>
     * The message that the guardrail returns when it blocks a prompt.
     * </p>
     */
    private String blockedInputMessaging;
    /**
     * <p>
     * The message that the guardrail returns when it blocks a model response.
     * </p>
     */
    private String blockedOutputsMessaging;
    /**
     * <p>
     * The ARN of the KMS key that encrypts the guardrail.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name of the guardrail.
     * </p>
     * 
     * @param name
     *        The name of the guardrail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the guardrail.
     * </p>
     * 
     * @return The name of the guardrail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the guardrail.
     * </p>
     * 
     * @param name
     *        The name of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the guardrail.
     * </p>
     * 
     * @param description
     *        The description of the guardrail.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the guardrail.
     * </p>
     * 
     * @return The description of the guardrail.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the guardrail.
     * </p>
     * 
     * @param description
     *        The description of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier of the guardrail.
     */

    public void setGuardrailId(String guardrailId) {
        this.guardrailId = guardrailId;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @return The unique identifier of the guardrail.
     */

    public String getGuardrailId() {
        return this.guardrailId;
    }

    /**
     * <p>
     * The unique identifier of the guardrail.
     * </p>
     * 
     * @param guardrailId
     *        The unique identifier of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withGuardrailId(String guardrailId) {
        setGuardrailId(guardrailId);
        return this;
    }

    /**
     * <p>
     * The ARN of the guardrail that was created.
     * </p>
     * 
     * @param guardrailArn
     *        The ARN of the guardrail that was created.
     */

    public void setGuardrailArn(String guardrailArn) {
        this.guardrailArn = guardrailArn;
    }

    /**
     * <p>
     * The ARN of the guardrail that was created.
     * </p>
     * 
     * @return The ARN of the guardrail that was created.
     */

    public String getGuardrailArn() {
        return this.guardrailArn;
    }

    /**
     * <p>
     * The ARN of the guardrail that was created.
     * </p>
     * 
     * @param guardrailArn
     *        The ARN of the guardrail that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withGuardrailArn(String guardrailArn) {
        setGuardrailArn(guardrailArn);
        return this;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @param version
     *        The version of the guardrail.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @return The version of the guardrail.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the guardrail.
     * </p>
     * 
     * @param version
     *        The version of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The status of the guardrail.
     * </p>
     * 
     * @param status
     *        The status of the guardrail.
     * @see GuardrailStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the guardrail.
     * </p>
     * 
     * @return The status of the guardrail.
     * @see GuardrailStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the guardrail.
     * </p>
     * 
     * @param status
     *        The status of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailStatus
     */

    public GetGuardrailResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the guardrail.
     * </p>
     * 
     * @param status
     *        The status of the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailStatus
     */

    public GetGuardrailResult withStatus(GuardrailStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The topic policy that was configured for the guardrail.
     * </p>
     * 
     * @param topicPolicy
     *        The topic policy that was configured for the guardrail.
     */

    public void setTopicPolicy(GuardrailTopicPolicy topicPolicy) {
        this.topicPolicy = topicPolicy;
    }

    /**
     * <p>
     * The topic policy that was configured for the guardrail.
     * </p>
     * 
     * @return The topic policy that was configured for the guardrail.
     */

    public GuardrailTopicPolicy getTopicPolicy() {
        return this.topicPolicy;
    }

    /**
     * <p>
     * The topic policy that was configured for the guardrail.
     * </p>
     * 
     * @param topicPolicy
     *        The topic policy that was configured for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withTopicPolicy(GuardrailTopicPolicy topicPolicy) {
        setTopicPolicy(topicPolicy);
        return this;
    }

    /**
     * <p>
     * The content policy that was configured for the guardrail.
     * </p>
     * 
     * @param contentPolicy
     *        The content policy that was configured for the guardrail.
     */

    public void setContentPolicy(GuardrailContentPolicy contentPolicy) {
        this.contentPolicy = contentPolicy;
    }

    /**
     * <p>
     * The content policy that was configured for the guardrail.
     * </p>
     * 
     * @return The content policy that was configured for the guardrail.
     */

    public GuardrailContentPolicy getContentPolicy() {
        return this.contentPolicy;
    }

    /**
     * <p>
     * The content policy that was configured for the guardrail.
     * </p>
     * 
     * @param contentPolicy
     *        The content policy that was configured for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withContentPolicy(GuardrailContentPolicy contentPolicy) {
        setContentPolicy(contentPolicy);
        return this;
    }

    /**
     * <p>
     * The word policy that was configured for the guardrail.
     * </p>
     * 
     * @param wordPolicy
     *        The word policy that was configured for the guardrail.
     */

    public void setWordPolicy(GuardrailWordPolicy wordPolicy) {
        this.wordPolicy = wordPolicy;
    }

    /**
     * <p>
     * The word policy that was configured for the guardrail.
     * </p>
     * 
     * @return The word policy that was configured for the guardrail.
     */

    public GuardrailWordPolicy getWordPolicy() {
        return this.wordPolicy;
    }

    /**
     * <p>
     * The word policy that was configured for the guardrail.
     * </p>
     * 
     * @param wordPolicy
     *        The word policy that was configured for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withWordPolicy(GuardrailWordPolicy wordPolicy) {
        setWordPolicy(wordPolicy);
        return this;
    }

    /**
     * <p>
     * The sensitive information policy that was configured for the guardrail.
     * </p>
     * 
     * @param sensitiveInformationPolicy
     *        The sensitive information policy that was configured for the guardrail.
     */

    public void setSensitiveInformationPolicy(GuardrailSensitiveInformationPolicy sensitiveInformationPolicy) {
        this.sensitiveInformationPolicy = sensitiveInformationPolicy;
    }

    /**
     * <p>
     * The sensitive information policy that was configured for the guardrail.
     * </p>
     * 
     * @return The sensitive information policy that was configured for the guardrail.
     */

    public GuardrailSensitiveInformationPolicy getSensitiveInformationPolicy() {
        return this.sensitiveInformationPolicy;
    }

    /**
     * <p>
     * The sensitive information policy that was configured for the guardrail.
     * </p>
     * 
     * @param sensitiveInformationPolicy
     *        The sensitive information policy that was configured for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withSensitiveInformationPolicy(GuardrailSensitiveInformationPolicy sensitiveInformationPolicy) {
        setSensitiveInformationPolicy(sensitiveInformationPolicy);
        return this;
    }

    /**
     * <p>
     * The date and time at which the guardrail was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time at which the guardrail was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was created.
     * </p>
     * 
     * @return The date and time at which the guardrail was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time at which the guardrail was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time at which the guardrail was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time at which the guardrail was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was updated.
     * </p>
     * 
     * @return The date and time at which the guardrail was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time at which the guardrail was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time at which the guardrail was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed to be
     * created, updated, versioned, or deleted.
     * </p>
     * 
     * @return Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed
     *         to be created, updated, versioned, or deleted.
     */

    public java.util.List<String> getStatusReasons() {
        return statusReasons;
    }

    /**
     * <p>
     * Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed to be
     * created, updated, versioned, or deleted.
     * </p>
     * 
     * @param statusReasons
     *        Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed
     *        to be created, updated, versioned, or deleted.
     */

    public void setStatusReasons(java.util.Collection<String> statusReasons) {
        if (statusReasons == null) {
            this.statusReasons = null;
            return;
        }

        this.statusReasons = new java.util.ArrayList<String>(statusReasons);
    }

    /**
     * <p>
     * Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed to be
     * created, updated, versioned, or deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusReasons(java.util.Collection)} or {@link #withStatusReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statusReasons
     *        Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed
     *        to be created, updated, versioned, or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withStatusReasons(String... statusReasons) {
        if (this.statusReasons == null) {
            setStatusReasons(new java.util.ArrayList<String>(statusReasons.length));
        }
        for (String ele : statusReasons) {
            this.statusReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed to be
     * created, updated, versioned, or deleted.
     * </p>
     * 
     * @param statusReasons
     *        Appears if the <code>status</code> is <code>FAILED</code>. A list of reasons for why the guardrail failed
     *        to be created, updated, versioned, or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withStatusReasons(java.util.Collection<String> statusReasons) {
        setStatusReasons(statusReasons);
        return this;
    }

    /**
     * <p>
     * Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to carry
     * out before retrying the request.
     * </p>
     * 
     * @return Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to
     *         carry out before retrying the request.
     */

    public java.util.List<String> getFailureRecommendations() {
        return failureRecommendations;
    }

    /**
     * <p>
     * Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to carry
     * out before retrying the request.
     * </p>
     * 
     * @param failureRecommendations
     *        Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to
     *        carry out before retrying the request.
     */

    public void setFailureRecommendations(java.util.Collection<String> failureRecommendations) {
        if (failureRecommendations == null) {
            this.failureRecommendations = null;
            return;
        }

        this.failureRecommendations = new java.util.ArrayList<String>(failureRecommendations);
    }

    /**
     * <p>
     * Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to carry
     * out before retrying the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureRecommendations(java.util.Collection)} or
     * {@link #withFailureRecommendations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failureRecommendations
     *        Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to
     *        carry out before retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withFailureRecommendations(String... failureRecommendations) {
        if (this.failureRecommendations == null) {
            setFailureRecommendations(new java.util.ArrayList<String>(failureRecommendations.length));
        }
        for (String ele : failureRecommendations) {
            this.failureRecommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to carry
     * out before retrying the request.
     * </p>
     * 
     * @param failureRecommendations
     *        Appears if the <code>status</code> of the guardrail is <code>FAILED</code>. A list of recommendations to
     *        carry out before retrying the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withFailureRecommendations(java.util.Collection<String> failureRecommendations) {
        setFailureRecommendations(failureRecommendations);
        return this;
    }

    /**
     * <p>
     * The message that the guardrail returns when it blocks a prompt.
     * </p>
     * 
     * @param blockedInputMessaging
     *        The message that the guardrail returns when it blocks a prompt.
     */

    public void setBlockedInputMessaging(String blockedInputMessaging) {
        this.blockedInputMessaging = blockedInputMessaging;
    }

    /**
     * <p>
     * The message that the guardrail returns when it blocks a prompt.
     * </p>
     * 
     * @return The message that the guardrail returns when it blocks a prompt.
     */

    public String getBlockedInputMessaging() {
        return this.blockedInputMessaging;
    }

    /**
     * <p>
     * The message that the guardrail returns when it blocks a prompt.
     * </p>
     * 
     * @param blockedInputMessaging
     *        The message that the guardrail returns when it blocks a prompt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withBlockedInputMessaging(String blockedInputMessaging) {
        setBlockedInputMessaging(blockedInputMessaging);
        return this;
    }

    /**
     * <p>
     * The message that the guardrail returns when it blocks a model response.
     * </p>
     * 
     * @param blockedOutputsMessaging
     *        The message that the guardrail returns when it blocks a model response.
     */

    public void setBlockedOutputsMessaging(String blockedOutputsMessaging) {
        this.blockedOutputsMessaging = blockedOutputsMessaging;
    }

    /**
     * <p>
     * The message that the guardrail returns when it blocks a model response.
     * </p>
     * 
     * @return The message that the guardrail returns when it blocks a model response.
     */

    public String getBlockedOutputsMessaging() {
        return this.blockedOutputsMessaging;
    }

    /**
     * <p>
     * The message that the guardrail returns when it blocks a model response.
     * </p>
     * 
     * @param blockedOutputsMessaging
     *        The message that the guardrail returns when it blocks a model response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withBlockedOutputsMessaging(String blockedOutputsMessaging) {
        setBlockedOutputsMessaging(blockedOutputsMessaging);
        return this;
    }

    /**
     * <p>
     * The ARN of the KMS key that encrypts the guardrail.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key that encrypts the guardrail.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that encrypts the guardrail.
     * </p>
     * 
     * @return The ARN of the KMS key that encrypts the guardrail.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that encrypts the guardrail.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key that encrypts the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGuardrailResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getGuardrailId() != null)
            sb.append("GuardrailId: ").append(getGuardrailId()).append(",");
        if (getGuardrailArn() != null)
            sb.append("GuardrailArn: ").append(getGuardrailArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTopicPolicy() != null)
            sb.append("TopicPolicy: ").append(getTopicPolicy()).append(",");
        if (getContentPolicy() != null)
            sb.append("ContentPolicy: ").append(getContentPolicy()).append(",");
        if (getWordPolicy() != null)
            sb.append("WordPolicy: ").append(getWordPolicy()).append(",");
        if (getSensitiveInformationPolicy() != null)
            sb.append("SensitiveInformationPolicy: ").append(getSensitiveInformationPolicy()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getStatusReasons() != null)
            sb.append("StatusReasons: ").append("***Sensitive Data Redacted***").append(",");
        if (getFailureRecommendations() != null)
            sb.append("FailureRecommendations: ").append("***Sensitive Data Redacted***").append(",");
        if (getBlockedInputMessaging() != null)
            sb.append("BlockedInputMessaging: ").append("***Sensitive Data Redacted***").append(",");
        if (getBlockedOutputsMessaging() != null)
            sb.append("BlockedOutputsMessaging: ").append("***Sensitive Data Redacted***").append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGuardrailResult == false)
            return false;
        GetGuardrailResult other = (GetGuardrailResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGuardrailId() == null ^ this.getGuardrailId() == null)
            return false;
        if (other.getGuardrailId() != null && other.getGuardrailId().equals(this.getGuardrailId()) == false)
            return false;
        if (other.getGuardrailArn() == null ^ this.getGuardrailArn() == null)
            return false;
        if (other.getGuardrailArn() != null && other.getGuardrailArn().equals(this.getGuardrailArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTopicPolicy() == null ^ this.getTopicPolicy() == null)
            return false;
        if (other.getTopicPolicy() != null && other.getTopicPolicy().equals(this.getTopicPolicy()) == false)
            return false;
        if (other.getContentPolicy() == null ^ this.getContentPolicy() == null)
            return false;
        if (other.getContentPolicy() != null && other.getContentPolicy().equals(this.getContentPolicy()) == false)
            return false;
        if (other.getWordPolicy() == null ^ this.getWordPolicy() == null)
            return false;
        if (other.getWordPolicy() != null && other.getWordPolicy().equals(this.getWordPolicy()) == false)
            return false;
        if (other.getSensitiveInformationPolicy() == null ^ this.getSensitiveInformationPolicy() == null)
            return false;
        if (other.getSensitiveInformationPolicy() != null && other.getSensitiveInformationPolicy().equals(this.getSensitiveInformationPolicy()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getStatusReasons() == null ^ this.getStatusReasons() == null)
            return false;
        if (other.getStatusReasons() != null && other.getStatusReasons().equals(this.getStatusReasons()) == false)
            return false;
        if (other.getFailureRecommendations() == null ^ this.getFailureRecommendations() == null)
            return false;
        if (other.getFailureRecommendations() != null && other.getFailureRecommendations().equals(this.getFailureRecommendations()) == false)
            return false;
        if (other.getBlockedInputMessaging() == null ^ this.getBlockedInputMessaging() == null)
            return false;
        if (other.getBlockedInputMessaging() != null && other.getBlockedInputMessaging().equals(this.getBlockedInputMessaging()) == false)
            return false;
        if (other.getBlockedOutputsMessaging() == null ^ this.getBlockedOutputsMessaging() == null)
            return false;
        if (other.getBlockedOutputsMessaging() != null && other.getBlockedOutputsMessaging().equals(this.getBlockedOutputsMessaging()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGuardrailId() == null) ? 0 : getGuardrailId().hashCode());
        hashCode = prime * hashCode + ((getGuardrailArn() == null) ? 0 : getGuardrailArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTopicPolicy() == null) ? 0 : getTopicPolicy().hashCode());
        hashCode = prime * hashCode + ((getContentPolicy() == null) ? 0 : getContentPolicy().hashCode());
        hashCode = prime * hashCode + ((getWordPolicy() == null) ? 0 : getWordPolicy().hashCode());
        hashCode = prime * hashCode + ((getSensitiveInformationPolicy() == null) ? 0 : getSensitiveInformationPolicy().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatusReasons() == null) ? 0 : getStatusReasons().hashCode());
        hashCode = prime * hashCode + ((getFailureRecommendations() == null) ? 0 : getFailureRecommendations().hashCode());
        hashCode = prime * hashCode + ((getBlockedInputMessaging() == null) ? 0 : getBlockedInputMessaging().hashCode());
        hashCode = prime * hashCode + ((getBlockedOutputsMessaging() == null) ? 0 : getBlockedOutputsMessaging().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public GetGuardrailResult clone() {
        try {
            return (GetGuardrailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
