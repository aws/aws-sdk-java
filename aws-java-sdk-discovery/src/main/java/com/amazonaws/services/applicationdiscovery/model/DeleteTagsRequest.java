/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of configuration items with tags that you want to delete.
     * </p>
     */
    private java.util.List<String> configurationIds;
    /**
     * <p>
     * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a
     * <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A list of configuration items with tags that you want to delete.
     * </p>
     * 
     * @return A list of configuration items with tags that you want to delete.
     */

    public java.util.List<String> getConfigurationIds() {
        return configurationIds;
    }

    /**
     * <p>
     * A list of configuration items with tags that you want to delete.
     * </p>
     * 
     * @param configurationIds
     *        A list of configuration items with tags that you want to delete.
     */

    public void setConfigurationIds(java.util.Collection<String> configurationIds) {
        if (configurationIds == null) {
            this.configurationIds = null;
            return;
        }

        this.configurationIds = new java.util.ArrayList<String>(configurationIds);
    }

    /**
     * <p>
     * A list of configuration items with tags that you want to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationIds(java.util.Collection)} or {@link #withConfigurationIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configurationIds
     *        A list of configuration items with tags that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsRequest withConfigurationIds(String... configurationIds) {
        if (this.configurationIds == null) {
            setConfigurationIds(new java.util.ArrayList<String>(configurationIds.length));
        }
        for (String ele : configurationIds) {
            this.configurationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration items with tags that you want to delete.
     * </p>
     * 
     * @param configurationIds
     *        A list of configuration items with tags that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsRequest withConfigurationIds(java.util.Collection<String> configurationIds) {
        setConfigurationIds(configurationIds);
        return this;
    }

    /**
     * <p>
     * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a
     * <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * 
     * @return Tags that you want to delete from one or more configuration items. Specify the tags that you want to
     *         delete in a <i>key</i>-<i>value</i> format. For example:</p>
     *         <p>
     *         <code>{"key": "serverType", "value": "webServer"}</code>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a
     * <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * 
     * @param tags
     *        Tags that you want to delete from one or more configuration items. Specify the tags that you want to
     *        delete in a <i>key</i>-<i>value</i> format. For example:</p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a
     * <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags that you want to delete from one or more configuration items. Specify the tags that you want to
     *        delete in a <i>key</i>-<i>value</i> format. For example:</p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags that you want to delete from one or more configuration items. Specify the tags that you want to delete in a
     * <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * 
     * @param tags
     *        Tags that you want to delete from one or more configuration items. Specify the tags that you want to
     *        delete in a <i>key</i>-<i>value</i> format. For example:</p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getConfigurationIds() != null)
            sb.append("ConfigurationIds: ").append(getConfigurationIds()).append(",");
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

        if (obj instanceof DeleteTagsRequest == false)
            return false;
        DeleteTagsRequest other = (DeleteTagsRequest) obj;
        if (other.getConfigurationIds() == null ^ this.getConfigurationIds() == null)
            return false;
        if (other.getConfigurationIds() != null && other.getConfigurationIds().equals(this.getConfigurationIds()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationIds() == null) ? 0 : getConfigurationIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTagsRequest clone() {
        return (DeleteTagsRequest) super.clone();
    }

}
