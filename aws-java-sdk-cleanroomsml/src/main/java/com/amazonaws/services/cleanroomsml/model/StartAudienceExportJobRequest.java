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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAudienceExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job that you want to export.
     * </p>
     */
    private String audienceGenerationJobArn;

    private AudienceSize audienceSize;
    /**
     * <p>
     * The description of the audience export job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the audience export job.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job that you want to export.
     * </p>
     * 
     * @param audienceGenerationJobArn
     *        The Amazon Resource Name (ARN) of the audience generation job that you want to export.
     */

    public void setAudienceGenerationJobArn(String audienceGenerationJobArn) {
        this.audienceGenerationJobArn = audienceGenerationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job that you want to export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the audience generation job that you want to export.
     */

    public String getAudienceGenerationJobArn() {
        return this.audienceGenerationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience generation job that you want to export.
     * </p>
     * 
     * @param audienceGenerationJobArn
     *        The Amazon Resource Name (ARN) of the audience generation job that you want to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceExportJobRequest withAudienceGenerationJobArn(String audienceGenerationJobArn) {
        setAudienceGenerationJobArn(audienceGenerationJobArn);
        return this;
    }

    /**
     * @param audienceSize
     */

    public void setAudienceSize(AudienceSize audienceSize) {
        this.audienceSize = audienceSize;
    }

    /**
     * @return
     */

    public AudienceSize getAudienceSize() {
        return this.audienceSize;
    }

    /**
     * @param audienceSize
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceExportJobRequest withAudienceSize(AudienceSize audienceSize) {
        setAudienceSize(audienceSize);
        return this;
    }

    /**
     * <p>
     * The description of the audience export job.
     * </p>
     * 
     * @param description
     *        The description of the audience export job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audience export job.
     * </p>
     * 
     * @return The description of the audience export job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the audience export job.
     * </p>
     * 
     * @param description
     *        The description of the audience export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceExportJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the audience export job.
     * </p>
     * 
     * @param name
     *        The name of the audience export job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the audience export job.
     * </p>
     * 
     * @return The name of the audience export job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the audience export job.
     * </p>
     * 
     * @param name
     *        The name of the audience export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceExportJobRequest withName(String name) {
        setName(name);
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
        if (getAudienceGenerationJobArn() != null)
            sb.append("AudienceGenerationJobArn: ").append(getAudienceGenerationJobArn()).append(",");
        if (getAudienceSize() != null)
            sb.append("AudienceSize: ").append(getAudienceSize()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAudienceExportJobRequest == false)
            return false;
        StartAudienceExportJobRequest other = (StartAudienceExportJobRequest) obj;
        if (other.getAudienceGenerationJobArn() == null ^ this.getAudienceGenerationJobArn() == null)
            return false;
        if (other.getAudienceGenerationJobArn() != null && other.getAudienceGenerationJobArn().equals(this.getAudienceGenerationJobArn()) == false)
            return false;
        if (other.getAudienceSize() == null ^ this.getAudienceSize() == null)
            return false;
        if (other.getAudienceSize() != null && other.getAudienceSize().equals(this.getAudienceSize()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudienceGenerationJobArn() == null) ? 0 : getAudienceGenerationJobArn().hashCode());
        hashCode = prime * hashCode + ((getAudienceSize() == null) ? 0 : getAudienceSize().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public StartAudienceExportJobRequest clone() {
        return (StartAudienceExportJobRequest) super.clone();
    }

}
