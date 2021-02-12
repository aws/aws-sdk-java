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
 * Contains the response to a successful <a>UploadServerCertificate</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UploadServerCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UploadServerCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The meta information of the uploaded server certificate without its certificate body, certificate chain, and
     * private key.
     * </p>
     */
    private ServerCertificateMetadata serverCertificateMetadata;
    /**
     * <p>
     * A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by tag
     * key. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The meta information of the uploaded server certificate without its certificate body, certificate chain, and
     * private key.
     * </p>
     * 
     * @param serverCertificateMetadata
     *        The meta information of the uploaded server certificate without its certificate body, certificate chain,
     *        and private key.
     */

    public void setServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        this.serverCertificateMetadata = serverCertificateMetadata;
    }

    /**
     * <p>
     * The meta information of the uploaded server certificate without its certificate body, certificate chain, and
     * private key.
     * </p>
     * 
     * @return The meta information of the uploaded server certificate without its certificate body, certificate chain,
     *         and private key.
     */

    public ServerCertificateMetadata getServerCertificateMetadata() {
        return this.serverCertificateMetadata;
    }

    /**
     * <p>
     * The meta information of the uploaded server certificate without its certificate body, certificate chain, and
     * private key.
     * </p>
     * 
     * @param serverCertificateMetadata
     *        The meta information of the uploaded server certificate without its certificate body, certificate chain,
     *        and private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateResult withServerCertificateMetadata(ServerCertificateMetadata serverCertificateMetadata) {
        setServerCertificateMetadata(serverCertificateMetadata);
        return this;
    }

    /**
     * <p>
     * A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by tag
     * key. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * 
     * @return A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted
     *         by tag key. For more information about tagging, see <a
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
     * A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by tag
     * key. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by
     *        tag key. For more information about tagging, see <a
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
     * A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by tag
     * key. For more information about tagging, see <a
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
     *        A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by
     *        tag key. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *        <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateResult withTags(Tag... tags) {
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
     * A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by tag
     * key. For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of tags that are attached to the new IAM server certificate. The returned list of tags is sorted by
     *        tag key. For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html">Tagging IAM resources</a> in the
     *        <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UploadServerCertificateResult withTags(java.util.Collection<Tag> tags) {
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
        if (getServerCertificateMetadata() != null)
            sb.append("ServerCertificateMetadata: ").append(getServerCertificateMetadata()).append(",");
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

        if (obj instanceof UploadServerCertificateResult == false)
            return false;
        UploadServerCertificateResult other = (UploadServerCertificateResult) obj;
        if (other.getServerCertificateMetadata() == null ^ this.getServerCertificateMetadata() == null)
            return false;
        if (other.getServerCertificateMetadata() != null && other.getServerCertificateMetadata().equals(this.getServerCertificateMetadata()) == false)
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

        hashCode = prime * hashCode + ((getServerCertificateMetadata() == null) ? 0 : getServerCertificateMetadata().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UploadServerCertificateResult clone() {
        try {
            return (UploadServerCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
