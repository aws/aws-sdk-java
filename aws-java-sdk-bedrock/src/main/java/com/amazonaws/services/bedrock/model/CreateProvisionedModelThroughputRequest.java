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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/CreateProvisionedModelThroughput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProvisionedModelThroughputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the Amazon S3 User Guide.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Number of model units to allocate. A model unit delivers a specific throughput level for the specified model. The
     * throughput level of a model unit specifies the total number of input and output tokens that it can process and
     * generate within a span of one minute. By default, your account has no model units for purchasing Provisioned
     * Throughputs with commitment. You must first visit the <a
     * href="https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase">Amazon Web
     * Services support center</a> to request MUs.
     * </p>
     * <p>
     * For model unit quotas, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/quotas.html#prov-thru-quotas">Provisioned Throughput
     * quotas</a> in the Amazon Bedrock User Guide.
     * </p>
     * <p>
     * For more information about what an MU specifies, contact your Amazon Web Services account manager.
     * </p>
     */
    private Integer modelUnits;
    /**
     * <p>
     * The name for this Provisioned Throughput.
     * </p>
     */
    private String provisionedModelName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the model to associate with this Provisioned Throughput. For a list of
     * models for which you can purchase Provisioned Throughput, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#prov-throughput-models">Amazon Bedrock
     * model IDs for purchasing Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted for
     * longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.
     * </p>
     * <p>
     * Custom models support all levels of commitment. To see which base models support no commitment, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and models for
     * Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * </p>
     */
    private String commitmentDuration;
    /**
     * <p>
     * Tags to associate with this Provisioned Throughput.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the Amazon S3 User Guide.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the Amazon S3 User Guide.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the Amazon S3 User Guide.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a> in the Amazon S3 User Guide.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a> in the Amazon S3 User Guide.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a> in the Amazon S3 User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Number of model units to allocate. A model unit delivers a specific throughput level for the specified model. The
     * throughput level of a model unit specifies the total number of input and output tokens that it can process and
     * generate within a span of one minute. By default, your account has no model units for purchasing Provisioned
     * Throughputs with commitment. You must first visit the <a
     * href="https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase">Amazon Web
     * Services support center</a> to request MUs.
     * </p>
     * <p>
     * For model unit quotas, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/quotas.html#prov-thru-quotas">Provisioned Throughput
     * quotas</a> in the Amazon Bedrock User Guide.
     * </p>
     * <p>
     * For more information about what an MU specifies, contact your Amazon Web Services account manager.
     * </p>
     * 
     * @param modelUnits
     *        Number of model units to allocate. A model unit delivers a specific throughput level for the specified
     *        model. The throughput level of a model unit specifies the total number of input and output tokens that it
     *        can process and generate within a span of one minute. By default, your account has no model units for
     *        purchasing Provisioned Throughputs with commitment. You must first visit the <a
     *        href="https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase">Amazon
     *        Web Services support center</a> to request MUs.</p>
     *        <p>
     *        For model unit quotas, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/quotas.html#prov-thru-quotas">Provisioned
     *        Throughput quotas</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        <p>
     *        For more information about what an MU specifies, contact your Amazon Web Services account manager.
     */

    public void setModelUnits(Integer modelUnits) {
        this.modelUnits = modelUnits;
    }

    /**
     * <p>
     * Number of model units to allocate. A model unit delivers a specific throughput level for the specified model. The
     * throughput level of a model unit specifies the total number of input and output tokens that it can process and
     * generate within a span of one minute. By default, your account has no model units for purchasing Provisioned
     * Throughputs with commitment. You must first visit the <a
     * href="https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase">Amazon Web
     * Services support center</a> to request MUs.
     * </p>
     * <p>
     * For model unit quotas, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/quotas.html#prov-thru-quotas">Provisioned Throughput
     * quotas</a> in the Amazon Bedrock User Guide.
     * </p>
     * <p>
     * For more information about what an MU specifies, contact your Amazon Web Services account manager.
     * </p>
     * 
     * @return Number of model units to allocate. A model unit delivers a specific throughput level for the specified
     *         model. The throughput level of a model unit specifies the total number of input and output tokens that it
     *         can process and generate within a span of one minute. By default, your account has no model units for
     *         purchasing Provisioned Throughputs with commitment. You must first visit the <a
     *         href="https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase">Amazon
     *         Web Services support center</a> to request MUs.</p>
     *         <p>
     *         For model unit quotas, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/quotas.html#prov-thru-quotas">Provisioned
     *         Throughput quotas</a> in the Amazon Bedrock User Guide.
     *         </p>
     *         <p>
     *         For more information about what an MU specifies, contact your Amazon Web Services account manager.
     */

    public Integer getModelUnits() {
        return this.modelUnits;
    }

    /**
     * <p>
     * Number of model units to allocate. A model unit delivers a specific throughput level for the specified model. The
     * throughput level of a model unit specifies the total number of input and output tokens that it can process and
     * generate within a span of one minute. By default, your account has no model units for purchasing Provisioned
     * Throughputs with commitment. You must first visit the <a
     * href="https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase">Amazon Web
     * Services support center</a> to request MUs.
     * </p>
     * <p>
     * For model unit quotas, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/quotas.html#prov-thru-quotas">Provisioned Throughput
     * quotas</a> in the Amazon Bedrock User Guide.
     * </p>
     * <p>
     * For more information about what an MU specifies, contact your Amazon Web Services account manager.
     * </p>
     * 
     * @param modelUnits
     *        Number of model units to allocate. A model unit delivers a specific throughput level for the specified
     *        model. The throughput level of a model unit specifies the total number of input and output tokens that it
     *        can process and generate within a span of one minute. By default, your account has no model units for
     *        purchasing Provisioned Throughputs with commitment. You must first visit the <a
     *        href="https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase">Amazon
     *        Web Services support center</a> to request MUs.</p>
     *        <p>
     *        For model unit quotas, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/quotas.html#prov-thru-quotas">Provisioned
     *        Throughput quotas</a> in the Amazon Bedrock User Guide.
     *        </p>
     *        <p>
     *        For more information about what an MU specifies, contact your Amazon Web Services account manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withModelUnits(Integer modelUnits) {
        setModelUnits(modelUnits);
        return this;
    }

    /**
     * <p>
     * The name for this Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelName
     *        The name for this Provisioned Throughput.
     */

    public void setProvisionedModelName(String provisionedModelName) {
        this.provisionedModelName = provisionedModelName;
    }

    /**
     * <p>
     * The name for this Provisioned Throughput.
     * </p>
     * 
     * @return The name for this Provisioned Throughput.
     */

    public String getProvisionedModelName() {
        return this.provisionedModelName;
    }

    /**
     * <p>
     * The name for this Provisioned Throughput.
     * </p>
     * 
     * @param provisionedModelName
     *        The name for this Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withProvisionedModelName(String provisionedModelName) {
        setProvisionedModelName(provisionedModelName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the model to associate with this Provisioned Throughput. For a list of
     * models for which you can purchase Provisioned Throughput, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#prov-throughput-models">Amazon Bedrock
     * model IDs for purchasing Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param modelId
     *        The Amazon Resource Name (ARN) or name of the model to associate with this Provisioned Throughput. For a
     *        list of models for which you can purchase Provisioned Throughput, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#prov-throughput-models">Amazon
     *        Bedrock model IDs for purchasing Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the model to associate with this Provisioned Throughput. For a list of
     * models for which you can purchase Provisioned Throughput, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#prov-throughput-models">Amazon Bedrock
     * model IDs for purchasing Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or name of the model to associate with this Provisioned Throughput. For a
     *         list of models for which you can purchase Provisioned Throughput, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#prov-throughput-models">Amazon
     *         Bedrock model IDs for purchasing Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or name of the model to associate with this Provisioned Throughput. For a list of
     * models for which you can purchase Provisioned Throughput, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#prov-throughput-models">Amazon Bedrock
     * model IDs for purchasing Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     * </p>
     * 
     * @param modelId
     *        The Amazon Resource Name (ARN) or name of the model to associate with this Provisioned Throughput. For a
     *        list of models for which you can purchase Provisioned Throughput, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-ids.html#prov-throughput-models">Amazon
     *        Bedrock model IDs for purchasing Provisioned Throughput</a> in the Amazon Bedrock User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted for
     * longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.
     * </p>
     * <p>
     * Custom models support all levels of commitment. To see which base models support no commitment, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and models for
     * Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * </p>
     * 
     * @param commitmentDuration
     *        The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted
     *        for longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.</p>
     *        <p>
     *        Custom models support all levels of commitment. To see which base models support no commitment, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and models
     *        for Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * @see CommitmentDuration
     */

    public void setCommitmentDuration(String commitmentDuration) {
        this.commitmentDuration = commitmentDuration;
    }

    /**
     * <p>
     * The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted for
     * longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.
     * </p>
     * <p>
     * Custom models support all levels of commitment. To see which base models support no commitment, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and models for
     * Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * </p>
     * 
     * @return The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted
     *         for longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.</p>
     *         <p>
     *         Custom models support all levels of commitment. To see which base models support no commitment, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and
     *         models for Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * @see CommitmentDuration
     */

    public String getCommitmentDuration() {
        return this.commitmentDuration;
    }

    /**
     * <p>
     * The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted for
     * longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.
     * </p>
     * <p>
     * Custom models support all levels of commitment. To see which base models support no commitment, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and models for
     * Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * </p>
     * 
     * @param commitmentDuration
     *        The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted
     *        for longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.</p>
     *        <p>
     *        Custom models support all levels of commitment. To see which base models support no commitment, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and models
     *        for Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentDuration
     */

    public CreateProvisionedModelThroughputRequest withCommitmentDuration(String commitmentDuration) {
        setCommitmentDuration(commitmentDuration);
        return this;
    }

    /**
     * <p>
     * The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted for
     * longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.
     * </p>
     * <p>
     * Custom models support all levels of commitment. To see which base models support no commitment, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and models for
     * Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * </p>
     * 
     * @param commitmentDuration
     *        The commitment duration requested for the Provisioned Throughput. Billing occurs hourly and is discounted
     *        for longer commitment terms. To request a no-commit Provisioned Throughput, omit this field.</p>
     *        <p>
     *        Custom models support all levels of commitment. To see which base models support no commitment, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/pt-supported.html">Supported regions and models
     *        for Provisioned Throughput</a> in the Amazon Bedrock User Guide
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommitmentDuration
     */

    public CreateProvisionedModelThroughputRequest withCommitmentDuration(CommitmentDuration commitmentDuration) {
        this.commitmentDuration = commitmentDuration.toString();
        return this;
    }

    /**
     * <p>
     * Tags to associate with this Provisioned Throughput.
     * </p>
     * 
     * @return Tags to associate with this Provisioned Throughput.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to associate with this Provisioned Throughput.
     * </p>
     * 
     * @param tags
     *        Tags to associate with this Provisioned Throughput.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags to associate with this Provisioned Throughput.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to associate with this Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to associate with this Provisioned Throughput.
     * </p>
     * 
     * @param tags
     *        Tags to associate with this Provisioned Throughput.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProvisionedModelThroughputRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getModelUnits() != null)
            sb.append("ModelUnits: ").append(getModelUnits()).append(",");
        if (getProvisionedModelName() != null)
            sb.append("ProvisionedModelName: ").append(getProvisionedModelName()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getCommitmentDuration() != null)
            sb.append("CommitmentDuration: ").append(getCommitmentDuration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisionedModelThroughputRequest == false)
            return false;
        CreateProvisionedModelThroughputRequest other = (CreateProvisionedModelThroughputRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getModelUnits() == null ^ this.getModelUnits() == null)
            return false;
        if (other.getModelUnits() != null && other.getModelUnits().equals(this.getModelUnits()) == false)
            return false;
        if (other.getProvisionedModelName() == null ^ this.getProvisionedModelName() == null)
            return false;
        if (other.getProvisionedModelName() != null && other.getProvisionedModelName().equals(this.getProvisionedModelName()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getCommitmentDuration() == null ^ this.getCommitmentDuration() == null)
            return false;
        if (other.getCommitmentDuration() != null && other.getCommitmentDuration().equals(this.getCommitmentDuration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getModelUnits() == null) ? 0 : getModelUnits().hashCode());
        hashCode = prime * hashCode + ((getProvisionedModelName() == null) ? 0 : getProvisionedModelName().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getCommitmentDuration() == null) ? 0 : getCommitmentDuration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateProvisionedModelThroughputRequest clone() {
        return (CreateProvisionedModelThroughputRequest) super.clone();
    }

}
