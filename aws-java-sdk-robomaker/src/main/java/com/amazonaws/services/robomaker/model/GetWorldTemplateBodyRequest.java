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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/GetWorldTemplateBody" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorldTemplateBodyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world template.
     * </p>
     */
    private String template;
    /**
     * <p>
     * The Amazon Resource Name (arn) of the world generator job.
     * </p>
     */
    private String generationJob;

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

    public GetWorldTemplateBodyRequest withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world generator job.
     * </p>
     * 
     * @param generationJob
     *        The Amazon Resource Name (arn) of the world generator job.
     */

    public void setGenerationJob(String generationJob) {
        this.generationJob = generationJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world generator job.
     * </p>
     * 
     * @return The Amazon Resource Name (arn) of the world generator job.
     */

    public String getGenerationJob() {
        return this.generationJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (arn) of the world generator job.
     * </p>
     * 
     * @param generationJob
     *        The Amazon Resource Name (arn) of the world generator job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorldTemplateBodyRequest withGenerationJob(String generationJob) {
        setGenerationJob(generationJob);
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
        if (getTemplate() != null)
            sb.append("Template: ").append(getTemplate()).append(",");
        if (getGenerationJob() != null)
            sb.append("GenerationJob: ").append(getGenerationJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorldTemplateBodyRequest == false)
            return false;
        GetWorldTemplateBodyRequest other = (GetWorldTemplateBodyRequest) obj;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getGenerationJob() == null ^ this.getGenerationJob() == null)
            return false;
        if (other.getGenerationJob() != null && other.getGenerationJob().equals(this.getGenerationJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getGenerationJob() == null) ? 0 : getGenerationJob().hashCode());
        return hashCode;
    }

    @Override
    public GetWorldTemplateBodyRequest clone() {
        return (GetWorldTemplateBodyRequest) super.clone();
    }

}
