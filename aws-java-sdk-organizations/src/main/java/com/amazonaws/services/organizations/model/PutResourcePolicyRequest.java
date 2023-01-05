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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/PutResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If provided, the new content for the resource policy. The text must be correctly formatted JSON that complies
     * with the syntax for the resource policy's type. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service Control
     * Policy Syntax</a> in the <i>Organizations User Guide.</i>
     * </p>
     */
    private String content;
    /**
     * <p>
     * Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in the list,
     * you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to
     * <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     * resources</a> in the Organizations User Guide.
     * </p>
     * <note>
     * <p>
     * Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown. If any
     * one of the tags is invalid or if you exceed the allowed number of tags for the resource policy, then the entire
     * request fails and the resource policy is not created.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * If provided, the new content for the resource policy. The text must be correctly formatted JSON that complies
     * with the syntax for the resource policy's type. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service Control
     * Policy Syntax</a> in the <i>Organizations User Guide.</i>
     * </p>
     * 
     * @param content
     *        If provided, the new content for the resource policy. The text must be correctly formatted JSON that
     *        complies with the syntax for the resource policy's type. For more information, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *        Control Policy Syntax</a> in the <i>Organizations User Guide.</i>
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * If provided, the new content for the resource policy. The text must be correctly formatted JSON that complies
     * with the syntax for the resource policy's type. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service Control
     * Policy Syntax</a> in the <i>Organizations User Guide.</i>
     * </p>
     * 
     * @return If provided, the new content for the resource policy. The text must be correctly formatted JSON that
     *         complies with the syntax for the resource policy's type. For more information, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *         Control Policy Syntax</a> in the <i>Organizations User Guide.</i>
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * If provided, the new content for the resource policy. The text must be correctly formatted JSON that complies
     * with the syntax for the resource policy's type. For more information, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service Control
     * Policy Syntax</a> in the <i>Organizations User Guide.</i>
     * </p>
     * 
     * @param content
     *        If provided, the new content for the resource policy. The text must be correctly formatted JSON that
     *        complies with the syntax for the resource policy's type. For more information, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_scp-syntax.html">Service
     *        Control Policy Syntax</a> in the <i>Organizations User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in the list,
     * you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to
     * <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     * resources</a> in the Organizations User Guide.
     * </p>
     * <note>
     * <p>
     * Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown. If any
     * one of the tags is invalid or if you exceed the allowed number of tags for the resource policy, then the entire
     * request fails and the resource policy is not created.
     * </p>
     * </note>
     * 
     * @return Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in
     *         the list, you must specify both a tag key and a value. You can set the value to an empty string, but you
     *         can't set it to <code>null</code>. For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     *         resources</a> in the Organizations User Guide.</p> <note>
     *         <p>
     *         Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown.
     *         If any one of the tags is invalid or if you exceed the allowed number of tags for the resource policy,
     *         then the entire request fails and the resource policy is not created.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in the list,
     * you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to
     * <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     * resources</a> in the Organizations User Guide.
     * </p>
     * <note>
     * <p>
     * Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown. If any
     * one of the tags is invalid or if you exceed the allowed number of tags for the resource policy, then the entire
     * request fails and the resource policy is not created.
     * </p>
     * </note>
     * 
     * @param tags
     *        Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in the
     *        list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't
     *        set it to <code>null</code>. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     *        resources</a> in the Organizations User Guide.</p> <note>
     *        <p>
     *        Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown. If
     *        any one of the tags is invalid or if you exceed the allowed number of tags for the resource policy, then
     *        the entire request fails and the resource policy is not created.
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
     * Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in the list,
     * you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to
     * <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     * resources</a> in the Organizations User Guide.
     * </p>
     * <note>
     * <p>
     * Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown. If any
     * one of the tags is invalid or if you exceed the allowed number of tags for the resource policy, then the entire
     * request fails and the resource policy is not created.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in the
     *        list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't
     *        set it to <code>null</code>. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     *        resources</a> in the Organizations User Guide.</p> <note>
     *        <p>
     *        Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown. If
     *        any one of the tags is invalid or if you exceed the allowed number of tags for the resource policy, then
     *        the entire request fails and the resource policy is not created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withTags(Tag... tags) {
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
     * Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in the list,
     * you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to
     * <code>null</code>. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     * resources</a> in the Organizations User Guide.
     * </p>
     * <note>
     * <p>
     * Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown. If any
     * one of the tags is invalid or if you exceed the allowed number of tags for the resource policy, then the entire
     * request fails and the resource policy is not created.
     * </p>
     * </note>
     * 
     * @param tags
     *        Updates the list of tags that you want to attach to the newly-created resource policy. For each tag in the
     *        list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't
     *        set it to <code>null</code>. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html">Tagging Organizations
     *        resources</a> in the Organizations User Guide.</p> <note>
     *        <p>
     *        Calls with tags apply to the initial creation of the resource policy, otherwise an exception is thrown. If
     *        any one of the tags is invalid or if you exceed the allowed number of tags for the resource policy, then
     *        the entire request fails and the resource policy is not created.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourcePolicyRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
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

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
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

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutResourcePolicyRequest clone() {
        return (PutResourcePolicyRequest) super.clone();
    }

}
