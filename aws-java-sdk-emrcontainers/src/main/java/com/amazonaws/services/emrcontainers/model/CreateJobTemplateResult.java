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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateJobTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * This output display the created job template ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * This output displays the name of the created job template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * This output display the ARN of the created job template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * This output displays the date and time when the job template was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * This output display the created job template ID.
     * </p>
     * 
     * @param id
     *        This output display the created job template ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * This output display the created job template ID.
     * </p>
     * 
     * @return This output display the created job template ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * This output display the created job template ID.
     * </p>
     * 
     * @param id
     *        This output display the created job template ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * This output displays the name of the created job template.
     * </p>
     * 
     * @param name
     *        This output displays the name of the created job template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * This output displays the name of the created job template.
     * </p>
     * 
     * @return This output displays the name of the created job template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * This output displays the name of the created job template.
     * </p>
     * 
     * @param name
     *        This output displays the name of the created job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * This output display the ARN of the created job template.
     * </p>
     * 
     * @param arn
     *        This output display the ARN of the created job template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * This output display the ARN of the created job template.
     * </p>
     * 
     * @return This output display the ARN of the created job template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * This output display the ARN of the created job template.
     * </p>
     * 
     * @param arn
     *        This output display the ARN of the created job template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * This output displays the date and time when the job template was created.
     * </p>
     * 
     * @param createdAt
     *        This output displays the date and time when the job template was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * This output displays the date and time when the job template was created.
     * </p>
     * 
     * @return This output displays the date and time when the job template was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * This output displays the date and time when the job template was created.
     * </p>
     * 
     * @param createdAt
     *        This output displays the date and time when the job template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobTemplateResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobTemplateResult == false)
            return false;
        CreateJobTemplateResult other = (CreateJobTemplateResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobTemplateResult clone() {
        try {
            return (CreateJobTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
