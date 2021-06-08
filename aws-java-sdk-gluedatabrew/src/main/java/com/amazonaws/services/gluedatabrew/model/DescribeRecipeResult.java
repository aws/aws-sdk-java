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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeRecipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecipeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier (user name) of the user who created the recipe.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time that the recipe was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The identifier (user name) of the user who last modified the recipe.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The date and time that the recipe was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The name of the project associated with this recipe.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The identifier (user name) of the user who last published the recipe.
     * </p>
     */
    private String publishedBy;
    /**
     * <p>
     * The date and time when the recipe was last published.
     * </p>
     */
    private java.util.Date publishedDate;
    /**
     * <p>
     * The description of the recipe.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the recipe.
     * </p>
     */
    private String name;
    /**
     * <p>
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     */
    private java.util.List<RecipeStep> steps;
    /**
     * <p>
     * Metadata tags associated with this project.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ARN of the recipe.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The recipe version identifier.
     * </p>
     */
    private String recipeVersion;

    /**
     * <p>
     * The identifier (user name) of the user who created the recipe.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user who created the recipe.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the recipe.
     * </p>
     * 
     * @return The identifier (user name) of the user who created the recipe.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the recipe.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user who created the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time that the recipe was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the recipe was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the recipe was created.
     * </p>
     * 
     * @return The date and time that the recipe was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the recipe was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the recipe was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the recipe.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the recipe.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the recipe.
     * </p>
     * 
     * @return The identifier (user name) of the user who last modified the recipe.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the recipe.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The date and time that the recipe was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the recipe was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the recipe was last modified.
     * </p>
     * 
     * @return The date and time that the recipe was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the recipe was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the recipe was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The name of the project associated with this recipe.
     * </p>
     * 
     * @param projectName
     *        The name of the project associated with this recipe.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project associated with this recipe.
     * </p>
     * 
     * @return The name of the project associated with this recipe.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project associated with this recipe.
     * </p>
     * 
     * @param projectName
     *        The name of the project associated with this recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last published the recipe.
     * </p>
     * 
     * @param publishedBy
     *        The identifier (user name) of the user who last published the recipe.
     */

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last published the recipe.
     * </p>
     * 
     * @return The identifier (user name) of the user who last published the recipe.
     */

    public String getPublishedBy() {
        return this.publishedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last published the recipe.
     * </p>
     * 
     * @param publishedBy
     *        The identifier (user name) of the user who last published the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withPublishedBy(String publishedBy) {
        setPublishedBy(publishedBy);
        return this;
    }

    /**
     * <p>
     * The date and time when the recipe was last published.
     * </p>
     * 
     * @param publishedDate
     *        The date and time when the recipe was last published.
     */

    public void setPublishedDate(java.util.Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * <p>
     * The date and time when the recipe was last published.
     * </p>
     * 
     * @return The date and time when the recipe was last published.
     */

    public java.util.Date getPublishedDate() {
        return this.publishedDate;
    }

    /**
     * <p>
     * The date and time when the recipe was last published.
     * </p>
     * 
     * @param publishedDate
     *        The date and time when the recipe was last published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withPublishedDate(java.util.Date publishedDate) {
        setPublishedDate(publishedDate);
        return this;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     * 
     * @param description
     *        The description of the recipe.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     * 
     * @return The description of the recipe.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     * 
     * @param description
     *        The description of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * 
     * @param name
     *        The name of the recipe.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * 
     * @return The name of the recipe.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * 
     * @param name
     *        The name of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     * 
     * @return One or more steps to be performed by the recipe. Each step consists of an action, and the conditions
     *         under which the action should succeed.
     */

    public java.util.List<RecipeStep> getSteps() {
        return steps;
    }

    /**
     * <p>
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     * 
     * @param steps
     *        One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under
     *        which the action should succeed.
     */

    public void setSteps(java.util.Collection<RecipeStep> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<RecipeStep>(steps);
    }

    /**
     * <p>
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under
     *        which the action should succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withSteps(RecipeStep... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<RecipeStep>(steps.length));
        }
        for (RecipeStep ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     * 
     * @param steps
     *        One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under
     *        which the action should succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withSteps(java.util.Collection<RecipeStep> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * Metadata tags associated with this project.
     * </p>
     * 
     * @return Metadata tags associated with this project.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags associated with this project.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this project.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags associated with this project.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeRecipeResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ARN of the recipe.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the recipe.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the recipe.
     * </p>
     * 
     * @return The ARN of the recipe.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the recipe.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The recipe version identifier.
     * </p>
     * 
     * @param recipeVersion
     *        The recipe version identifier.
     */

    public void setRecipeVersion(String recipeVersion) {
        this.recipeVersion = recipeVersion;
    }

    /**
     * <p>
     * The recipe version identifier.
     * </p>
     * 
     * @return The recipe version identifier.
     */

    public String getRecipeVersion() {
        return this.recipeVersion;
    }

    /**
     * <p>
     * The recipe version identifier.
     * </p>
     * 
     * @param recipeVersion
     *        The recipe version identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withRecipeVersion(String recipeVersion) {
        setRecipeVersion(recipeVersion);
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getPublishedBy() != null)
            sb.append("PublishedBy: ").append(getPublishedBy()).append(",");
        if (getPublishedDate() != null)
            sb.append("PublishedDate: ").append(getPublishedDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getRecipeVersion() != null)
            sb.append("RecipeVersion: ").append(getRecipeVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecipeResult == false)
            return false;
        DescribeRecipeResult other = (DescribeRecipeResult) obj;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getPublishedBy() == null ^ this.getPublishedBy() == null)
            return false;
        if (other.getPublishedBy() != null && other.getPublishedBy().equals(this.getPublishedBy()) == false)
            return false;
        if (other.getPublishedDate() == null ^ this.getPublishedDate() == null)
            return false;
        if (other.getPublishedDate() != null && other.getPublishedDate().equals(this.getPublishedDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getRecipeVersion() == null ^ this.getRecipeVersion() == null)
            return false;
        if (other.getRecipeVersion() != null && other.getRecipeVersion().equals(this.getRecipeVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getPublishedBy() == null) ? 0 : getPublishedBy().hashCode());
        hashCode = prime * hashCode + ((getPublishedDate() == null) ? 0 : getPublishedDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getRecipeVersion() == null) ? 0 : getRecipeVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecipeResult clone() {
        try {
            return (DescribeRecipeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
