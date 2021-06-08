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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a world.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/WorldSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorldSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (arn) of the world generation job.
     * </p>
     */
    private String generationJob;
    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     */
    private String template;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the world.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the world.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the world.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the world.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the world was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the world was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the world was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the world was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world generation job.
     * </p>
     * 
     * @param generationJob
     *        The Amazon Resource Name (arn) of the world generation job.
     */

    public void setGenerationJob(String generationJob) {
        this.generationJob = generationJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world generation job.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world generation job.
     */

    public String getGenerationJob() {
        return this.generationJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world generation job.
     * </p>
     * 
     * @param generationJob
     *        The Amazon Resource Name (arn) of the world generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldSummary withGenerationJob(String generationJob) {
        setGenerationJob(generationJob);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @param template
     *        The Amazon Resource Name (arn) of the world template.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world template.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     * 
     * @param template
     *        The Amazon Resource Name (arn) of the world template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorldSummary withTemplate(String template) {
        setTemplate(template);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getGenerationJob() != null)
            sb.append("GenerationJob: ").append(getGenerationJob()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorldSummary == false)
            return false;
        WorldSummary other = (WorldSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getGenerationJob() == null ^ this.getGenerationJob() == null)
            return false;
        if (other.getGenerationJob() != null && other.getGenerationJob().equals(this.getGenerationJob()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getGenerationJob() == null) ? 0 : getGenerationJob().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        return hashCode;
    }

    @Override
    public WorldSummary clone() {
        try {
            return (WorldSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.WorldSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
