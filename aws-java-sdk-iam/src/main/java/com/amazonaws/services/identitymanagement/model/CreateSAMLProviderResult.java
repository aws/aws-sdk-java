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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>CreateSAMLProvider</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateSAMLProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSAMLProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
     * </p>
     */
    private String sAMLProviderArn;
    /**
     * <p>
     * A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag key.
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
     * </p>
     * 
     * @param sAMLProviderArn
     *        The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
     */

    public void setSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
     */

    public String getSAMLProviderArn() {
        return this.sAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
     * </p>
     * 
     * @param sAMLProviderArn
     *        The Amazon Resource Name (ARN) of the new SAML provider resource in IAM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSAMLProviderResult withSAMLProviderArn(String sAMLProviderArn) {
        setSAMLProviderArn(sAMLProviderArn);
        return this;
    }

    /**
     * <p>
     * A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag key.
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * 
     * @return A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag
     *         key. For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *         <i>IAM User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag key.
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag
     *        key. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *        <i>IAM User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag key.
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag
     *        key. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *        <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSAMLProviderResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag key.
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags that are attached to the new IAM SAML provider. The returned list of tags is sorted by tag
     *        key. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *        <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSAMLProviderResult withTags(java.util.Collection<Tag> tags) {
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
        if (getSAMLProviderArn() != null)
            sb.append("SAMLProviderArn: ").append(getSAMLProviderArn()).append(",");
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

        if (obj instanceof CreateSAMLProviderResult == false)
            return false;
        CreateSAMLProviderResult other = (CreateSAMLProviderResult) obj;
        if (other.getSAMLProviderArn() == null ^ this.getSAMLProviderArn() == null)
            return false;
        if (other.getSAMLProviderArn() != null && other.getSAMLProviderArn().equals(this.getSAMLProviderArn()) == false)
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

        hashCode = prime * hashCode + ((getSAMLProviderArn() == null) ? 0 : getSAMLProviderArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSAMLProviderResult clone() {
        try {
            return (CreateSAMLProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
