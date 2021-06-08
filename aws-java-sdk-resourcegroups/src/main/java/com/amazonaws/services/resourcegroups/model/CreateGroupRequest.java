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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/CreateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group, which is the identifier of the group in other operations. You can't change the name of a
     * resource group after you create it. A resource group name can consist of letters, numbers, hyphens, periods, and
     * underscores. The name cannot start with <code>AWS</code> or <code>aws</code>; these are reserved. A resource
     * group name must be unique within each AWS Region in your AWS account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores,
     * periods, and spaces.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The resource query that determines which AWS resources are members of this group. For more information about
     * resource queries, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>ResourceQuery</code> or a <code>Configuration</code>, but not both.
     * </p>
     * </note>
     */
    private ResourceQuery resourceQuery;
    /**
     * <p>
     * The tags to add to the group. A tag is key-value pair string.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A configuration associates the resource group with an AWS service and specifies how the service can interact with
     * the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a> elements. For details
     * about the syntax of service configurations, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     */
    private java.util.List<GroupConfigurationItem> configuration;

    /**
     * <p>
     * The name of the group, which is the identifier of the group in other operations. You can't change the name of a
     * resource group after you create it. A resource group name can consist of letters, numbers, hyphens, periods, and
     * underscores. The name cannot start with <code>AWS</code> or <code>aws</code>; these are reserved. A resource
     * group name must be unique within each AWS Region in your AWS account.
     * </p>
     * 
     * @param name
     *        The name of the group, which is the identifier of the group in other operations. You can't change the name
     *        of a resource group after you create it. A resource group name can consist of letters, numbers, hyphens,
     *        periods, and underscores. The name cannot start with <code>AWS</code> or <code>aws</code>; these are
     *        reserved. A resource group name must be unique within each AWS Region in your AWS account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the group, which is the identifier of the group in other operations. You can't change the name of a
     * resource group after you create it. A resource group name can consist of letters, numbers, hyphens, periods, and
     * underscores. The name cannot start with <code>AWS</code> or <code>aws</code>; these are reserved. A resource
     * group name must be unique within each AWS Region in your AWS account.
     * </p>
     * 
     * @return The name of the group, which is the identifier of the group in other operations. You can't change the
     *         name of a resource group after you create it. A resource group name can consist of letters, numbers,
     *         hyphens, periods, and underscores. The name cannot start with <code>AWS</code> or <code>aws</code>; these
     *         are reserved. A resource group name must be unique within each AWS Region in your AWS account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the group, which is the identifier of the group in other operations. You can't change the name of a
     * resource group after you create it. A resource group name can consist of letters, numbers, hyphens, periods, and
     * underscores. The name cannot start with <code>AWS</code> or <code>aws</code>; these are reserved. A resource
     * group name must be unique within each AWS Region in your AWS account.
     * </p>
     * 
     * @param name
     *        The name of the group, which is the identifier of the group in other operations. You can't change the name
     *        of a resource group after you create it. A resource group name can consist of letters, numbers, hyphens,
     *        periods, and underscores. The name cannot start with <code>AWS</code> or <code>aws</code>; these are
     *        reserved. A resource group name must be unique within each AWS Region in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores,
     * periods, and spaces.
     * </p>
     * 
     * @param description
     *        The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores,
     *        periods, and spaces.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores,
     * periods, and spaces.
     * </p>
     * 
     * @return The description of the resource group. Descriptions can consist of letters, numbers, hyphens,
     *         underscores, periods, and spaces.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores,
     * periods, and spaces.
     * </p>
     * 
     * @param description
     *        The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores,
     *        periods, and spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The resource query that determines which AWS resources are members of this group. For more information about
     * resource queries, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>ResourceQuery</code> or a <code>Configuration</code>, but not both.
     * </p>
     * </note>
     * 
     * @param resourceQuery
     *        The resource query that determines which AWS resources are members of this group. For more information
     *        about resource queries, see <a href=
     *        "https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     *        >Create a tag-based group in Resource Groups</a>. </p> <note>
     *        <p>
     *        A resource group can contain either a <code>ResourceQuery</code> or a <code>Configuration</code>, but not
     *        both.
     *        </p>
     */

    public void setResourceQuery(ResourceQuery resourceQuery) {
        this.resourceQuery = resourceQuery;
    }

    /**
     * <p>
     * The resource query that determines which AWS resources are members of this group. For more information about
     * resource queries, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>ResourceQuery</code> or a <code>Configuration</code>, but not both.
     * </p>
     * </note>
     * 
     * @return The resource query that determines which AWS resources are members of this group. For more information
     *         about resource queries, see <a href=
     *         "https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     *         >Create a tag-based group in Resource Groups</a>. </p> <note>
     *         <p>
     *         A resource group can contain either a <code>ResourceQuery</code> or a <code>Configuration</code>, but not
     *         both.
     *         </p>
     */

    public ResourceQuery getResourceQuery() {
        return this.resourceQuery;
    }

    /**
     * <p>
     * The resource query that determines which AWS resources are members of this group. For more information about
     * resource queries, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     * >Create a tag-based group in Resource Groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>ResourceQuery</code> or a <code>Configuration</code>, but not both.
     * </p>
     * </note>
     * 
     * @param resourceQuery
     *        The resource query that determines which AWS resources are members of this group. For more information
     *        about resource queries, see <a href=
     *        "https://docs.aws.amazon.com/ARG/latest/userguide/gettingstarted-query.html#gettingstarted-query-cli-tag"
     *        >Create a tag-based group in Resource Groups</a>. </p> <note>
     *        <p>
     *        A resource group can contain either a <code>ResourceQuery</code> or a <code>Configuration</code>, but not
     *        both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withResourceQuery(ResourceQuery resourceQuery) {
        setResourceQuery(resourceQuery);
        return this;
    }

    /**
     * <p>
     * The tags to add to the group. A tag is key-value pair string.
     * </p>
     * 
     * @return The tags to add to the group. A tag is key-value pair string.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the group. A tag is key-value pair string.
     * </p>
     * 
     * @param tags
     *        The tags to add to the group. A tag is key-value pair string.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to add to the group. A tag is key-value pair string.
     * </p>
     * 
     * @param tags
     *        The tags to add to the group. A tag is key-value pair string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest addTagsEntry(String key, String value) {
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

    public CreateGroupRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A configuration associates the resource group with an AWS service and specifies how the service can interact with
     * the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a> elements. For details
     * about the syntax of service configurations, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     * 
     * @return A configuration associates the resource group with an AWS service and specifies how the service can
     *         interact with the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a>
     *         elements. For details about the syntax of service configurations, see <a
     *         href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *         resource groups</a>.</p> <note>
     *         <p>
     *         A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not
     *         both.
     *         </p>
     */

    public java.util.List<GroupConfigurationItem> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * A configuration associates the resource group with an AWS service and specifies how the service can interact with
     * the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a> elements. For details
     * about the syntax of service configurations, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     * 
     * @param configuration
     *        A configuration associates the resource group with an AWS service and specifies how the service can
     *        interact with the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a>
     *        elements. For details about the syntax of service configurations, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *        resource groups</a>.</p> <note>
     *        <p>
     *        A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not
     *        both.
     *        </p>
     */

    public void setConfiguration(java.util.Collection<GroupConfigurationItem> configuration) {
        if (configuration == null) {
            this.configuration = null;
            return;
        }

        this.configuration = new java.util.ArrayList<GroupConfigurationItem>(configuration);
    }

    /**
     * <p>
     * A configuration associates the resource group with an AWS service and specifies how the service can interact with
     * the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a> elements. For details
     * about the syntax of service configurations, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfiguration(java.util.Collection)} or {@link #withConfiguration(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configuration
     *        A configuration associates the resource group with an AWS service and specifies how the service can
     *        interact with the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a>
     *        elements. For details about the syntax of service configurations, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *        resource groups</a>.</p> <note>
     *        <p>
     *        A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not
     *        both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withConfiguration(GroupConfigurationItem... configuration) {
        if (this.configuration == null) {
            setConfiguration(new java.util.ArrayList<GroupConfigurationItem>(configuration.length));
        }
        for (GroupConfigurationItem ele : configuration) {
            this.configuration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A configuration associates the resource group with an AWS service and specifies how the service can interact with
     * the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a> elements. For details
     * about the syntax of service configurations, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     * 
     * @param configuration
     *        A configuration associates the resource group with an AWS service and specifies how the service can
     *        interact with the resources in the group. A configuration is an array of <a>GroupConfigurationItem</a>
     *        elements. For details about the syntax of service configurations, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *        resource groups</a>.</p> <note>
     *        <p>
     *        A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not
     *        both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withConfiguration(java.util.Collection<GroupConfigurationItem> configuration) {
        setConfiguration(configuration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResourceQuery() != null)
            sb.append("ResourceQuery: ").append(getResourceQuery()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupRequest == false)
            return false;
        CreateGroupRequest other = (CreateGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResourceQuery() == null ^ this.getResourceQuery() == null)
            return false;
        if (other.getResourceQuery() != null && other.getResourceQuery().equals(this.getResourceQuery()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResourceQuery() == null) ? 0 : getResourceQuery().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupRequest clone() {
        return (CreateGroupRequest) super.clone();
    }

}
