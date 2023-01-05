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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Defines the action that is to be applied to the findings that match the filter.
     * </p>
     */
    private String action;
    /**
     * <p>
     * A description of the filter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Defines the criteria to be used in the filter for querying findings.
     * </p>
     */
    private FilterCriteria filterCriteria;
    /**
     * <p>
     * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     * characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The reason for creating the filter.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * A list of tags for the filter.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Defines the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Defines the action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Defines the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @return Defines the action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Defines the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Defines the action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public CreateFilterRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Defines the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        Defines the action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public CreateFilterRequest withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @param description
     *        A description of the filter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @return A description of the filter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @param description
     *        A description of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Defines the criteria to be used in the filter for querying findings.
     * </p>
     * 
     * @param filterCriteria
     *        Defines the criteria to be used in the filter for querying findings.
     */

    public void setFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * Defines the criteria to be used in the filter for querying findings.
     * </p>
     * 
     * @return Defines the criteria to be used in the filter for querying findings.
     */

    public FilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * Defines the criteria to be used in the filter for querying findings.
     * </p>
     * 
     * @param filterCriteria
     *        Defines the criteria to be used in the filter for querying findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withFilterCriteria(FilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     * characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * </p>
     * 
     * @param name
     *        The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     *        characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     * characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * </p>
     * 
     * @return The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     *         characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     * characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * </p>
     * 
     * @param name
     *        The name of the filter. Minimum length of 3. Maximum length of 64. Valid characters include alphanumeric
     *        characters, dot (.), underscore (_), and dash (-). Spaces are not allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The reason for creating the filter.
     * </p>
     * 
     * @param reason
     *        The reason for creating the filter.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for creating the filter.
     * </p>
     * 
     * @return The reason for creating the filter.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for creating the filter.
     * </p>
     * 
     * @param reason
     *        The reason for creating the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * A list of tags for the filter.
     * </p>
     * 
     * @return A list of tags for the filter.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags for the filter.
     * </p>
     * 
     * @param tags
     *        A list of tags for the filter.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags for the filter.
     * </p>
     * 
     * @param tags
     *        A list of tags for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateFilterRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateFilterRequest addTagsEntry(String key, String value) {
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

    public CreateFilterRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
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

        if (obj instanceof CreateFilterRequest == false)
            return false;
        CreateFilterRequest other = (CreateFilterRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
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

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFilterRequest clone() {
        return (CreateFilterRequest) super.clone();
    }

}
