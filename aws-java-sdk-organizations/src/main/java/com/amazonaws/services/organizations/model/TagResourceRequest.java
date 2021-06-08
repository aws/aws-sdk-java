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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource to add a tag to.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * A list of tags to add to the specified resource.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string,
     * but you can't set it to <code>null</code>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then the
     * entire request fails and the account is not created.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the resource to add a tag to.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource to add a tag to.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource to add a tag to.
     * </p>
     * 
     * @return The ID of the resource to add a tag to.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource to add a tag to.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource to add a tag to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the specified resource.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string,
     * but you can't set it to <code>null</code>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then the
     * entire request fails and the account is not created.
     * </p>
     * </note>
     * 
     * @return A list of tags to add to the specified resource.</p>
     *         <p>
     *         You can specify any of the following taggable resources.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS account – specify the account ID number.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *         <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *         <code>r-<i>1a2b</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *         <code>p-<i>12abcdefg3</i> </code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty
     *         string, but you can't set it to <code>null</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then
     *         the entire request fails and the account is not created.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to add to the specified resource.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string,
     * but you can't set it to <code>null</code>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then the
     * entire request fails and the account is not created.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of tags to add to the specified resource.</p>
     *        <p>
     *        You can specify any of the following taggable resources.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS account – specify the account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *        <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *        <code>r-<i>1a2b</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *        <code>p-<i>12abcdefg3</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty
     *        string, but you can't set it to <code>null</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then
     *        the entire request fails and the account is not created.
     *        </p>
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
     * A list of tags to add to the specified resource.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string,
     * but you can't set it to <code>null</code>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then the
     * entire request fails and the account is not created.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to add to the specified resource.</p>
     *        <p>
     *        You can specify any of the following taggable resources.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS account – specify the account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *        <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *        <code>r-<i>1a2b</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *        <code>p-<i>12abcdefg3</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty
     *        string, but you can't set it to <code>null</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then
     *        the entire request fails and the account is not created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tag... tags) {
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
     * A list of tags to add to the specified resource.
     * </p>
     * <p>
     * You can specify any of the following taggable resources.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS account – specify the account ID number.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     * <code>ou-<i>1a2b-34uvwxyz</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Root – specify the root ID that begins with <code>r-</code> and looks similar to: <code>r-<i>1a2b</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     * <code>p-<i>12abcdefg3</i> </code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string,
     * but you can't set it to <code>null</code>.
     * </p>
     * <note>
     * <p>
     * If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then the
     * entire request fails and the account is not created.
     * </p>
     * </note>
     * 
     * @param tags
     *        A list of tags to add to the specified resource.</p>
     *        <p>
     *        You can specify any of the following taggable resources.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS account – specify the account ID number.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit – specify the OU ID that begins with <code>ou-</code> and looks similar to:
     *        <code>ou-<i>1a2b-34uvwxyz</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Root – specify the root ID that begins with <code>r-</code> and looks similar to:
     *        <code>r-<i>1a2b</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Policy – specify the policy ID that begins with <code>p-</code> andlooks similar to:
     *        <code>p-<i>12abcdefg3</i> </code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty
     *        string, but you can't set it to <code>null</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If any one of the tags is invalid or if you exceed the allowed number of tags for an account user, then
     *        the entire request fails and the account is not created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
