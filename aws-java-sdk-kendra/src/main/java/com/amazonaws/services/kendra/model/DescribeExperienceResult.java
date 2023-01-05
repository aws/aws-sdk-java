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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExperienceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Shows the identifier of your Amazon Kendra experience.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Shows the identifier of the index for your Amazon Kendra experience.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * Shows the name of your Amazon Kendra experience.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     */
    private java.util.List<ExperienceEndpoint> endpoints;
    /**
     * <p>
     * Shows the configuration information for your Amazon Kendra experience. This includes
     * <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     * <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to your
     * Amazon Kendra experience.
     * </p>
     */
    private ExperienceConfiguration configuration;
    /**
     * <p>
     * Shows the date-time your Amazon Kendra experience was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Shows the date-time your Amazon Kendra experience was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Shows the description for your Amazon Kendra experience.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>, your
     * Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code>
     * field contains the reason that this failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Shows the Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The reason your Amazon Kendra experience could not properly process.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Shows the identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @param id
     *        Shows the identifier of your Amazon Kendra experience.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Shows the identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @return Shows the identifier of your Amazon Kendra experience.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Shows the identifier of your Amazon Kendra experience.
     * </p>
     * 
     * @param id
     *        Shows the identifier of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Shows the identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        Shows the identifier of the index for your Amazon Kendra experience.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * Shows the identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @return Shows the identifier of the index for your Amazon Kendra experience.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * Shows the identifier of the index for your Amazon Kendra experience.
     * </p>
     * 
     * @param indexId
     *        Shows the identifier of the index for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * Shows the name of your Amazon Kendra experience.
     * </p>
     * 
     * @param name
     *        Shows the name of your Amazon Kendra experience.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Shows the name of your Amazon Kendra experience.
     * </p>
     * 
     * @return Shows the name of your Amazon Kendra experience.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Shows the name of your Amazon Kendra experience.
     * </p>
     * 
     * @param name
     *        Shows the name of your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @return Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by
     *         Amazon Web Services.
     */

    public java.util.List<ExperienceEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @param endpoints
     *        Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon
     *        Web Services.
     */

    public void setEndpoints(java.util.Collection<ExperienceEndpoint> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<ExperienceEndpoint>(endpoints);
    }

    /**
     * <p>
     * Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon
     *        Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withEndpoints(ExperienceEndpoint... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<ExperienceEndpoint>(endpoints.length));
        }
        for (ExperienceEndpoint ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @param endpoints
     *        Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon
     *        Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withEndpoints(java.util.Collection<ExperienceEndpoint> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * <p>
     * Shows the configuration information for your Amazon Kendra experience. This includes
     * <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     * <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to your
     * Amazon Kendra experience.
     * </p>
     * 
     * @param configuration
     *        Shows the configuration information for your Amazon Kendra experience. This includes
     *        <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     *        <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to
     *        your Amazon Kendra experience.
     */

    public void setConfiguration(ExperienceConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Shows the configuration information for your Amazon Kendra experience. This includes
     * <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     * <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to your
     * Amazon Kendra experience.
     * </p>
     * 
     * @return Shows the configuration information for your Amazon Kendra experience. This includes
     *         <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     *         <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to
     *         your Amazon Kendra experience.
     */

    public ExperienceConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Shows the configuration information for your Amazon Kendra experience. This includes
     * <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     * <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to your
     * Amazon Kendra experience.
     * </p>
     * 
     * @param configuration
     *        Shows the configuration information for your Amazon Kendra experience. This includes
     *        <code>ContentSourceConfiguration</code>, which specifies the data source IDs and/or FAQ IDs, and
     *        <code>UserIdentityConfiguration</code>, which specifies the user or group information to grant access to
     *        your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withConfiguration(ExperienceConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Shows the date-time your Amazon Kendra experience was created.
     * </p>
     * 
     * @param createdAt
     *        Shows the date-time your Amazon Kendra experience was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Shows the date-time your Amazon Kendra experience was created.
     * </p>
     * 
     * @return Shows the date-time your Amazon Kendra experience was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Shows the date-time your Amazon Kendra experience was created.
     * </p>
     * 
     * @param createdAt
     *        Shows the date-time your Amazon Kendra experience was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Shows the date-time your Amazon Kendra experience was last updated.
     * </p>
     * 
     * @param updatedAt
     *        Shows the date-time your Amazon Kendra experience was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * Shows the date-time your Amazon Kendra experience was last updated.
     * </p>
     * 
     * @return Shows the date-time your Amazon Kendra experience was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * Shows the date-time your Amazon Kendra experience was last updated.
     * </p>
     * 
     * @param updatedAt
     *        Shows the date-time your Amazon Kendra experience was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Shows the description for your Amazon Kendra experience.
     * </p>
     * 
     * @param description
     *        Shows the description for your Amazon Kendra experience.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Shows the description for your Amazon Kendra experience.
     * </p>
     * 
     * @return Shows the description for your Amazon Kendra experience.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Shows the description for your Amazon Kendra experience.
     * </p>
     * 
     * @param description
     *        Shows the description for your Amazon Kendra experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>, your
     * Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code>
     * field contains the reason that this failed.
     * </p>
     * 
     * @param status
     *        The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>,
     *        your Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the
     *        <code>ErrorMessage</code> field contains the reason that this failed.
     * @see ExperienceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>, your
     * Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code>
     * field contains the reason that this failed.
     * </p>
     * 
     * @return The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>,
     *         your Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the
     *         <code>ErrorMessage</code> field contains the reason that this failed.
     * @see ExperienceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>, your
     * Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code>
     * field contains the reason that this failed.
     * </p>
     * 
     * @param status
     *        The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>,
     *        your Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the
     *        <code>ErrorMessage</code> field contains the reason that this failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperienceStatus
     */

    public DescribeExperienceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>, your
     * Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the <code>ErrorMessage</code>
     * field contains the reason that this failed.
     * </p>
     * 
     * @param status
     *        The current processing status of your Amazon Kendra experience. When the status is <code>ACTIVE</code>,
     *        your Amazon Kendra experience is ready to use. When the status is <code>FAILED</code>, the
     *        <code>ErrorMessage</code> field contains the reason that this failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperienceStatus
     */

    public DescribeExperienceResult withStatus(ExperienceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Shows the Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information.
     * </p>
     * 
     * @param roleArn
     *        Shows the Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *        <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *        your user and group information.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Shows the Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information.
     * </p>
     * 
     * @return Shows the Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *         <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *         your user and group information.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Shows the Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     * <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores your user
     * and group information.
     * </p>
     * 
     * @param roleArn
     *        Shows the Amazon Resource Name (ARN) of a role with permission to access <code>Query</code> API,
     *        <code>QuerySuggestions</code> API, <code>SubmitFeedback</code> API, and IAM Identity Center that stores
     *        your user and group information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The reason your Amazon Kendra experience could not properly process.
     * </p>
     * 
     * @param errorMessage
     *        The reason your Amazon Kendra experience could not properly process.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The reason your Amazon Kendra experience could not properly process.
     * </p>
     * 
     * @return The reason your Amazon Kendra experience could not properly process.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The reason your Amazon Kendra experience could not properly process.
     * </p>
     * 
     * @param errorMessage
     *        The reason your Amazon Kendra experience could not properly process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExperienceResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExperienceResult == false)
            return false;
        DescribeExperienceResult other = (DescribeExperienceResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExperienceResult clone() {
        try {
            return (DescribeExperienceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
