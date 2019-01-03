/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for CreatePipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/CreatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the pipeline. You can use the same name for multiple pipelines associated with your AWS account,
     * because AWS Data Pipeline assigns each pipeline a unique pipeline identifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier. This identifier is not the same as the pipeline identifier assigned by AWS Data Pipeline.
     * You are responsible for defining the format and ensuring the uniqueness of this identifier. You use this
     * parameter to ensure idempotency during repeated calls to <code>CreatePipeline</code>. For example, if the first
     * call to <code>CreatePipeline</code> does not succeed, you can pass in the same unique identifier and pipeline
     * name combination on a subsequent call to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures that if
     * a pipeline already exists with the same name and unique identifier, a new pipeline is not created. Instead,
     * you'll receive the pipeline identifier from the previous attempt. The uniqueness of the name and unique
     * identifier combination is scoped to the AWS account or IAM user credentials.
     * </p>
     */
    private String uniqueId;
    /**
     * <p>
     * The description for the pipeline.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name for the pipeline. You can use the same name for multiple pipelines associated with your AWS account,
     * because AWS Data Pipeline assigns each pipeline a unique pipeline identifier.
     * </p>
     * 
     * @param name
     *        The name for the pipeline. You can use the same name for multiple pipelines associated with your AWS
     *        account, because AWS Data Pipeline assigns each pipeline a unique pipeline identifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the pipeline. You can use the same name for multiple pipelines associated with your AWS account,
     * because AWS Data Pipeline assigns each pipeline a unique pipeline identifier.
     * </p>
     * 
     * @return The name for the pipeline. You can use the same name for multiple pipelines associated with your AWS
     *         account, because AWS Data Pipeline assigns each pipeline a unique pipeline identifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the pipeline. You can use the same name for multiple pipelines associated with your AWS account,
     * because AWS Data Pipeline assigns each pipeline a unique pipeline identifier.
     * </p>
     * 
     * @param name
     *        The name for the pipeline. You can use the same name for multiple pipelines associated with your AWS
     *        account, because AWS Data Pipeline assigns each pipeline a unique pipeline identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier. This identifier is not the same as the pipeline identifier assigned by AWS Data Pipeline.
     * You are responsible for defining the format and ensuring the uniqueness of this identifier. You use this
     * parameter to ensure idempotency during repeated calls to <code>CreatePipeline</code>. For example, if the first
     * call to <code>CreatePipeline</code> does not succeed, you can pass in the same unique identifier and pipeline
     * name combination on a subsequent call to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures that if
     * a pipeline already exists with the same name and unique identifier, a new pipeline is not created. Instead,
     * you'll receive the pipeline identifier from the previous attempt. The uniqueness of the name and unique
     * identifier combination is scoped to the AWS account or IAM user credentials.
     * </p>
     * 
     * @param uniqueId
     *        A unique identifier. This identifier is not the same as the pipeline identifier assigned by AWS Data
     *        Pipeline. You are responsible for defining the format and ensuring the uniqueness of this identifier. You
     *        use this parameter to ensure idempotency during repeated calls to <code>CreatePipeline</code>. For
     *        example, if the first call to <code>CreatePipeline</code> does not succeed, you can pass in the same
     *        unique identifier and pipeline name combination on a subsequent call to <code>CreatePipeline</code>.
     *        <code>CreatePipeline</code> ensures that if a pipeline already exists with the same name and unique
     *        identifier, a new pipeline is not created. Instead, you'll receive the pipeline identifier from the
     *        previous attempt. The uniqueness of the name and unique identifier combination is scoped to the AWS
     *        account or IAM user credentials.
     */

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * <p>
     * A unique identifier. This identifier is not the same as the pipeline identifier assigned by AWS Data Pipeline.
     * You are responsible for defining the format and ensuring the uniqueness of this identifier. You use this
     * parameter to ensure idempotency during repeated calls to <code>CreatePipeline</code>. For example, if the first
     * call to <code>CreatePipeline</code> does not succeed, you can pass in the same unique identifier and pipeline
     * name combination on a subsequent call to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures that if
     * a pipeline already exists with the same name and unique identifier, a new pipeline is not created. Instead,
     * you'll receive the pipeline identifier from the previous attempt. The uniqueness of the name and unique
     * identifier combination is scoped to the AWS account or IAM user credentials.
     * </p>
     * 
     * @return A unique identifier. This identifier is not the same as the pipeline identifier assigned by AWS Data
     *         Pipeline. You are responsible for defining the format and ensuring the uniqueness of this identifier. You
     *         use this parameter to ensure idempotency during repeated calls to <code>CreatePipeline</code>. For
     *         example, if the first call to <code>CreatePipeline</code> does not succeed, you can pass in the same
     *         unique identifier and pipeline name combination on a subsequent call to <code>CreatePipeline</code>.
     *         <code>CreatePipeline</code> ensures that if a pipeline already exists with the same name and unique
     *         identifier, a new pipeline is not created. Instead, you'll receive the pipeline identifier from the
     *         previous attempt. The uniqueness of the name and unique identifier combination is scoped to the AWS
     *         account or IAM user credentials.
     */

    public String getUniqueId() {
        return this.uniqueId;
    }

    /**
     * <p>
     * A unique identifier. This identifier is not the same as the pipeline identifier assigned by AWS Data Pipeline.
     * You are responsible for defining the format and ensuring the uniqueness of this identifier. You use this
     * parameter to ensure idempotency during repeated calls to <code>CreatePipeline</code>. For example, if the first
     * call to <code>CreatePipeline</code> does not succeed, you can pass in the same unique identifier and pipeline
     * name combination on a subsequent call to <code>CreatePipeline</code>. <code>CreatePipeline</code> ensures that if
     * a pipeline already exists with the same name and unique identifier, a new pipeline is not created. Instead,
     * you'll receive the pipeline identifier from the previous attempt. The uniqueness of the name and unique
     * identifier combination is scoped to the AWS account or IAM user credentials.
     * </p>
     * 
     * @param uniqueId
     *        A unique identifier. This identifier is not the same as the pipeline identifier assigned by AWS Data
     *        Pipeline. You are responsible for defining the format and ensuring the uniqueness of this identifier. You
     *        use this parameter to ensure idempotency during repeated calls to <code>CreatePipeline</code>. For
     *        example, if the first call to <code>CreatePipeline</code> does not succeed, you can pass in the same
     *        unique identifier and pipeline name combination on a subsequent call to <code>CreatePipeline</code>.
     *        <code>CreatePipeline</code> ensures that if a pipeline already exists with the same name and unique
     *        identifier, a new pipeline is not created. Instead, you'll receive the pipeline identifier from the
     *        previous attempt. The uniqueness of the name and unique identifier combination is scoped to the AWS
     *        account or IAM user credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withUniqueId(String uniqueId) {
        setUniqueId(uniqueId);
        return this;
    }

    /**
     * <p>
     * The description for the pipeline.
     * </p>
     * 
     * @param description
     *        The description for the pipeline.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the pipeline.
     * </p>
     * 
     * @return The description for the pipeline.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the pipeline.
     * </p>
     * 
     * @param description
     *        The description for the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     * 
     * @return A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *         User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *        User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *        User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling User
     * Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the pipeline at creation. Tags let you control access to pipelines. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html">Controlling
     *        User Access to Pipelines</a> in the <i>AWS Data Pipeline Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUniqueId() != null)
            sb.append("UniqueId: ").append(getUniqueId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreatePipelineRequest == false)
            return false;
        CreatePipelineRequest other = (CreatePipelineRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUniqueId() == null ^ this.getUniqueId() == null)
            return false;
        if (other.getUniqueId() != null && other.getUniqueId().equals(this.getUniqueId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUniqueId() == null) ? 0 : getUniqueId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePipelineRequest clone() {
        return (CreatePipelineRequest) super.clone();
    }

}
