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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The filter expression defining criteria by which to group traces.
     * </p>
     */
    private String filterExpression;
    /**
     * <p>
     * The structure containing configurations related to insights.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The InsightsEnabled boolean can be set to true to enable insights for the new group or false to disable insights
     * for the new group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The NotificationsEnabled boolean can be set to true to enable insights notifications for the new group.
     * Notifications may only be enabled on a group with InsightsEnabled set to true.
     * </p>
     * </li>
     * </ul>
     */
    private InsightsConfiguration insightsConfiguration;
    /**
     * <p>
     * A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information about
     * ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     * Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
     * </p>
     * 
     * @param groupName
     *        The case-sensitive name of the new group. Default is a reserved name and names must be unique.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
     * </p>
     * 
     * @return The case-sensitive name of the new group. Default is a reserved name and names must be unique.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The case-sensitive name of the new group. Default is a reserved name and names must be unique.
     * </p>
     * 
     * @param groupName
     *        The case-sensitive name of the new group. Default is a reserved name and names must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The filter expression defining criteria by which to group traces.
     * </p>
     * 
     * @param filterExpression
     *        The filter expression defining criteria by which to group traces.
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * The filter expression defining criteria by which to group traces.
     * </p>
     * 
     * @return The filter expression defining criteria by which to group traces.
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * The filter expression defining criteria by which to group traces.
     * </p>
     * 
     * @param filterExpression
     *        The filter expression defining criteria by which to group traces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
        return this;
    }

    /**
     * <p>
     * The structure containing configurations related to insights.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The InsightsEnabled boolean can be set to true to enable insights for the new group or false to disable insights
     * for the new group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The NotificationsEnabled boolean can be set to true to enable insights notifications for the new group.
     * Notifications may only be enabled on a group with InsightsEnabled set to true.
     * </p>
     * </li>
     * </ul>
     * 
     * @param insightsConfiguration
     *        The structure containing configurations related to insights.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The InsightsEnabled boolean can be set to true to enable insights for the new group or false to disable
     *        insights for the new group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The NotificationsEnabled boolean can be set to true to enable insights notifications for the new group.
     *        Notifications may only be enabled on a group with InsightsEnabled set to true.
     *        </p>
     *        </li>
     */

    public void setInsightsConfiguration(InsightsConfiguration insightsConfiguration) {
        this.insightsConfiguration = insightsConfiguration;
    }

    /**
     * <p>
     * The structure containing configurations related to insights.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The InsightsEnabled boolean can be set to true to enable insights for the new group or false to disable insights
     * for the new group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The NotificationsEnabled boolean can be set to true to enable insights notifications for the new group.
     * Notifications may only be enabled on a group with InsightsEnabled set to true.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The structure containing configurations related to insights.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The InsightsEnabled boolean can be set to true to enable insights for the new group or false to disable
     *         insights for the new group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The NotificationsEnabled boolean can be set to true to enable insights notifications for the new group.
     *         Notifications may only be enabled on a group with InsightsEnabled set to true.
     *         </p>
     *         </li>
     */

    public InsightsConfiguration getInsightsConfiguration() {
        return this.insightsConfiguration;
    }

    /**
     * <p>
     * The structure containing configurations related to insights.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The InsightsEnabled boolean can be set to true to enable insights for the new group or false to disable insights
     * for the new group.
     * </p>
     * </li>
     * <li>
     * <p>
     * The NotificationsEnabled boolean can be set to true to enable insights notifications for the new group.
     * Notifications may only be enabled on a group with InsightsEnabled set to true.
     * </p>
     * </li>
     * </ul>
     * 
     * @param insightsConfiguration
     *        The structure containing configurations related to insights.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The InsightsEnabled boolean can be set to true to enable insights for the new group or false to disable
     *        insights for the new group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The NotificationsEnabled boolean can be set to true to enable insights notifications for the new group.
     *        Notifications may only be enabled on a group with InsightsEnabled set to true.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withInsightsConfiguration(InsightsConfiguration insightsConfiguration) {
        setInsightsConfiguration(insightsConfiguration);
        return this;
    }

    /**
     * <p>
     * A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information about
     * ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     * Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information
     *         about ways to use tags, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference</i>.</p>
     *         <p>
     *         The following restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of user-applied tags per resource: 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum tag key length: 128 Unicode characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum tag value length: 256 Unicode characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information about
     * ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     * Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information
     *        about ways to use tags, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of user-applied tags per resource: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag key length: 128 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag value length: 256 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     *        </p>
     *        </li>
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
     * A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information about
     * ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     * Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information
     *        about ways to use tags, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of user-applied tags per resource: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag key length: 128 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag value length: 256 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withTags(Tag... tags) {
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
     * A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information about
     * ways to use tags, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web
     * Services resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * The following restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of user-applied tags per resource: 50
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag key length: 128 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum tag value length: 256 Unicode characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        A map that contains one or more tag keys and tag values to attach to an X-Ray group. For more information
     *        about ways to use tags, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference</i>.</p>
     *        <p>
     *        The following restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of user-applied tags per resource: 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag key length: 128 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum tag value length: 256 Unicode characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid values for key and value: a-z, A-Z, 0-9, space, and the following characters: _ . : / = + - and @
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Don't use <code>aws:</code> as a prefix for keys; it's reserved for Amazon Web Services use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: ").append(getFilterExpression()).append(",");
        if (getInsightsConfiguration() != null)
            sb.append("InsightsConfiguration: ").append(getInsightsConfiguration()).append(",");
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

        if (obj instanceof CreateGroupRequest == false)
            return false;
        CreateGroupRequest other = (CreateGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getInsightsConfiguration() == null ^ this.getInsightsConfiguration() == null)
            return false;
        if (other.getInsightsConfiguration() != null && other.getInsightsConfiguration().equals(this.getInsightsConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getInsightsConfiguration() == null) ? 0 : getInsightsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupRequest clone() {
        return (CreateGroupRequest) super.clone();
    }

}
