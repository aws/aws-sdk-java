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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents one or more actions to be performed on a DataBrew dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/Recipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recipe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the recipe.
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
     * The Amazon Resource Name (ARN) of the user who last modified the recipe.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The last modification date and time of the recipe.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The name of the project that the recipe is associated with.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who published the recipe.
     * </p>
     */
    private String publishedBy;
    /**
     * <p>
     * The date and time when the recipe was published.
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
     * The unique name for the recipe.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recipe.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A list of steps that are defined by the recipe.
     * </p>
     */
    private java.util.List<RecipeStep> steps;
    /**
     * <p>
     * Metadata tags that have been applied to the recipe.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The identifier for the version for the recipe. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Numeric version (<code>X.Y</code>) - <code>X</code> and <code>Y</code> stand for major and minor version numbers.
     * The maximum length of each is 6 digits, and neither can be negative values. Both <code>X</code> and
     * <code>Y</code> are required, and "0.0" isn't a valid version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_WORKING</code> - the most recent valid version being developed in a DataBrew project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_PUBLISHED</code> - the most recent published version.
     * </p>
     * </li>
     * </ul>
     */
    private String recipeVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the recipe.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who created the recipe.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who created the recipe.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the recipe.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who created the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withCreatedBy(String createdBy) {
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

    public Recipe withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the recipe.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last modified the recipe.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last modified the recipe.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the recipe.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last modified the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The last modification date and time of the recipe.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modification date and time of the recipe.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last modification date and time of the recipe.
     * </p>
     * 
     * @return The last modification date and time of the recipe.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last modification date and time of the recipe.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modification date and time of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The name of the project that the recipe is associated with.
     * </p>
     * 
     * @param projectName
     *        The name of the project that the recipe is associated with.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that the recipe is associated with.
     * </p>
     * 
     * @return The name of the project that the recipe is associated with.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that the recipe is associated with.
     * </p>
     * 
     * @param projectName
     *        The name of the project that the recipe is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who published the recipe.
     * </p>
     * 
     * @param publishedBy
     *        The Amazon Resource Name (ARN) of the user who published the recipe.
     */

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who published the recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who published the recipe.
     */

    public String getPublishedBy() {
        return this.publishedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who published the recipe.
     * </p>
     * 
     * @param publishedBy
     *        The Amazon Resource Name (ARN) of the user who published the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withPublishedBy(String publishedBy) {
        setPublishedBy(publishedBy);
        return this;
    }

    /**
     * <p>
     * The date and time when the recipe was published.
     * </p>
     * 
     * @param publishedDate
     *        The date and time when the recipe was published.
     */

    public void setPublishedDate(java.util.Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
     * <p>
     * The date and time when the recipe was published.
     * </p>
     * 
     * @return The date and time when the recipe was published.
     */

    public java.util.Date getPublishedDate() {
        return this.publishedDate;
    }

    /**
     * <p>
     * The date and time when the recipe was published.
     * </p>
     * 
     * @param publishedDate
     *        The date and time when the recipe was published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withPublishedDate(java.util.Date publishedDate) {
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

    public Recipe withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique name for the recipe.
     * </p>
     * 
     * @param name
     *        The unique name for the recipe.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name for the recipe.
     * </p>
     * 
     * @return The unique name for the recipe.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name for the recipe.
     * </p>
     * 
     * @param name
     *        The unique name for the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recipe.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the recipe.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the recipe.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the recipe.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A list of steps that are defined by the recipe.
     * </p>
     * 
     * @return A list of steps that are defined by the recipe.
     */

    public java.util.List<RecipeStep> getSteps() {
        return steps;
    }

    /**
     * <p>
     * A list of steps that are defined by the recipe.
     * </p>
     * 
     * @param steps
     *        A list of steps that are defined by the recipe.
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
     * A list of steps that are defined by the recipe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        A list of steps that are defined by the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withSteps(RecipeStep... steps) {
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
     * A list of steps that are defined by the recipe.
     * </p>
     * 
     * @param steps
     *        A list of steps that are defined by the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withSteps(java.util.Collection<RecipeStep> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the recipe.
     * </p>
     * 
     * @return Metadata tags that have been applied to the recipe.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the recipe.
     * </p>
     * 
     * @param tags
     *        Metadata tags that have been applied to the recipe.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the recipe.
     * </p>
     * 
     * @param tags
     *        Metadata tags that have been applied to the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Recipe#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Recipe addTagsEntry(String key, String value) {
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

    public Recipe clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The identifier for the version for the recipe. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Numeric version (<code>X.Y</code>) - <code>X</code> and <code>Y</code> stand for major and minor version numbers.
     * The maximum length of each is 6 digits, and neither can be negative values. Both <code>X</code> and
     * <code>Y</code> are required, and "0.0" isn't a valid version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_WORKING</code> - the most recent valid version being developed in a DataBrew project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_PUBLISHED</code> - the most recent published version.
     * </p>
     * </li>
     * </ul>
     * 
     * @param recipeVersion
     *        The identifier for the version for the recipe. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Numeric version (<code>X.Y</code>) - <code>X</code> and <code>Y</code> stand for major and minor version
     *        numbers. The maximum length of each is 6 digits, and neither can be negative values. Both <code>X</code>
     *        and <code>Y</code> are required, and "0.0" isn't a valid version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST_WORKING</code> - the most recent valid version being developed in a DataBrew project.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST_PUBLISHED</code> - the most recent published version.
     *        </p>
     *        </li>
     */

    public void setRecipeVersion(String recipeVersion) {
        this.recipeVersion = recipeVersion;
    }

    /**
     * <p>
     * The identifier for the version for the recipe. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Numeric version (<code>X.Y</code>) - <code>X</code> and <code>Y</code> stand for major and minor version numbers.
     * The maximum length of each is 6 digits, and neither can be negative values. Both <code>X</code> and
     * <code>Y</code> are required, and "0.0" isn't a valid version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_WORKING</code> - the most recent valid version being developed in a DataBrew project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_PUBLISHED</code> - the most recent published version.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier for the version for the recipe. Must be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Numeric version (<code>X.Y</code>) - <code>X</code> and <code>Y</code> stand for major and minor version
     *         numbers. The maximum length of each is 6 digits, and neither can be negative values. Both <code>X</code>
     *         and <code>Y</code> are required, and "0.0" isn't a valid version.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LATEST_WORKING</code> - the most recent valid version being developed in a DataBrew project.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LATEST_PUBLISHED</code> - the most recent published version.
     *         </p>
     *         </li>
     */

    public String getRecipeVersion() {
        return this.recipeVersion;
    }

    /**
     * <p>
     * The identifier for the version for the recipe. Must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Numeric version (<code>X.Y</code>) - <code>X</code> and <code>Y</code> stand for major and minor version numbers.
     * The maximum length of each is 6 digits, and neither can be negative values. Both <code>X</code> and
     * <code>Y</code> are required, and "0.0" isn't a valid version.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_WORKING</code> - the most recent valid version being developed in a DataBrew project.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LATEST_PUBLISHED</code> - the most recent published version.
     * </p>
     * </li>
     * </ul>
     * 
     * @param recipeVersion
     *        The identifier for the version for the recipe. Must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Numeric version (<code>X.Y</code>) - <code>X</code> and <code>Y</code> stand for major and minor version
     *        numbers. The maximum length of each is 6 digits, and neither can be negative values. Both <code>X</code>
     *        and <code>Y</code> are required, and "0.0" isn't a valid version.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST_WORKING</code> - the most recent valid version being developed in a DataBrew project.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LATEST_PUBLISHED</code> - the most recent published version.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withRecipeVersion(String recipeVersion) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof Recipe == false)
            return false;
        Recipe other = (Recipe) obj;
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
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRecipeVersion() == null) ? 0 : getRecipeVersion().hashCode());
        return hashCode;
    }

    @Override
    public Recipe clone() {
        try {
            return (Recipe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.RecipeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
