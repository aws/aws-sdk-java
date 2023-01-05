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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExperienceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of your Amazon Kendra experience you want to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A new name for your Amazon Kendra experience.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Configuration information you want to update for your Amazon Kendra experience.
     * </p>
     */
    private ExperienceConfiguration configuration;
    /**
     * <p>
     * A new description for your Amazon Kendra experience.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The identifier of your Amazon Kendra experience you want to update.
     * </p>
     * 
     * @param id
     *        The identifier of your Amazon Kendra experience you want to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience you want to update.
     * </p>
     * 
     * @return The identifier of your Amazon Kendra experience you want to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of your Amazon Kendra experience you want to update.
     * </p>
     * 
     * @param id
     *        The identifier of your Amazon Kendra experience you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperienceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A new name for your Amazon Kendra experience.
     * </p>
     * 
     * @param name
     *        A new name for your Amazon Kendra experience.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for your Amazon Kendra experience.
     * </p>
     * 
     * @return A new name for your Amazon Kendra experience.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for your Amazon Kendra experience.
     * </p>
     * 
     * @param name
     *        A new name for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperienceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @return The identifier of the index for your Amazon Kendra experience.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperienceRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *        <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *        your user and group information. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *         <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *         your user and group information. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *        <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *        your user and group information. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html">IAM roles for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperienceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Configuration information you want to update for your Amazon Kendra experience.
     * </p>
     * 
     * @param configuration
     *        Configuration information you want to update for your Amazon Kendra experience.
     */

    public void setConfiguration(ExperienceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Configuration information you want to update for your Amazon Kendra experience.
     * </p>
     * 
     * @return Configuration information you want to update for your Amazon Kendra experience.
     */

    public ExperienceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Configuration information you want to update for your Amazon Kendra experience.
     * </p>
     * 
     * @param configuration
     *        Configuration information you want to update for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperienceRequest withConfiguration(ExperienceConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * A new description for your Amazon Kendra experience.
     * </p>
     * 
     * @param description
     *        A new description for your Amazon Kendra experience.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for your Amazon Kendra experience.
     * </p>
     * 
     * @return A new description for your Amazon Kendra experience.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for your Amazon Kendra experience.
     * </p>
     * 
     * @param description
     *        A new description for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExperienceRequest withDescription(String description) {
        setDescription(description);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateExperienceRequest == false)
            return false;
        UpdateExperienceRequest other = (UpdateExperienceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateExperienceRequest clone() {
        return (UpdateExperienceRequest) super.clone();
    }

}
