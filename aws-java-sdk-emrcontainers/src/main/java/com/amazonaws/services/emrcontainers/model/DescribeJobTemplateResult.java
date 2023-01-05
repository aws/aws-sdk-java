/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeJobTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This output displays information about the specified job template.
     * </p>
     */
    private JobTemplate jobTemplate;

    /**
     * <p>
     * This output displays information about the specified job template.
     * </p>
     * 
     * @param jobTemplate
     *        This output displays information about the specified job template.
     */

    public void setJobTemplate(JobTemplate jobTemplate) {
        this.jobTemplate = jobTemplate;
    }

    /**
     * <p>
     * This output displays information about the specified job template.
     * </p>
     * 
     * @return This output displays information about the specified job template.
     */

    public JobTemplate getJobTemplate() {
        return this.jobTemplate;
    }

    /**
     * <p>
     * This output displays information about the specified job template.
     * </p>
     * 
     * @param jobTemplate
     *        This output displays information about the specified job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobTemplateResult withJobTemplate(JobTemplate jobTemplate) {
        setJobTemplate(jobTemplate);
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
        if (getJobTemplate() != null)
            sb.append("JobTemplate: ").append(getJobTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobTemplateResult == false)
            return false;
        DescribeJobTemplateResult other = (DescribeJobTemplateResult) obj;
        if (other.getJobTemplate() == null ^ this.getJobTemplate() == null)
            return false;
        if (other.getJobTemplate() != null && other.getJobTemplate().equals(this.getJobTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobTemplate() == null) ? 0 : getJobTemplate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobTemplateResult clone() {
        try {
            return (DescribeJobTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
