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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reference information about the content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ContentReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the content.
     * </p>
     */
    private String contentArn;
    /**
     * <p>
     * The identifier of the content.
     * </p>
     */
    private String contentId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     */
    private String knowledgeBaseArn;
    /**
     * <p>
     * The identifier of the knowledge base.
     * </p>
     */
    private String knowledgeBaseId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the content.
     * </p>
     * 
     * @param contentArn
     *        The Amazon Resource Name (ARN) of the content.
     */

    public void setContentArn(String contentArn) {
        this.contentArn = contentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the content.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the content.
     */

    public String getContentArn() {
        return this.contentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the content.
     * </p>
     * 
     * @param contentArn
     *        The Amazon Resource Name (ARN) of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentReference withContentArn(String contentArn) {
        setContentArn(contentArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the content.
     * </p>
     * 
     * @param contentId
     *        The identifier of the content.
     */

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * <p>
     * The identifier of the content.
     * </p>
     * 
     * @return The identifier of the content.
     */

    public String getContentId() {
        return this.contentId;
    }

    /**
     * <p>
     * The identifier of the content.
     * </p>
     * 
     * @param contentId
     *        The identifier of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentReference withContentId(String contentId) {
        setContentId(contentId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     */

    public void setKnowledgeBaseArn(String knowledgeBaseArn) {
        this.knowledgeBaseArn = knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the knowledge base.
     */

    public String getKnowledgeBaseArn() {
        return this.knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentReference withKnowledgeBaseArn(String knowledgeBaseArn) {
        setKnowledgeBaseArn(knowledgeBaseArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base.
     * </p>
     * 
     * @return The identifier of the knowledge base.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentReference withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
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
        if (getContentArn() != null)
            sb.append("ContentArn: ").append(getContentArn()).append(",");
        if (getContentId() != null)
            sb.append("ContentId: ").append(getContentId()).append(",");
        if (getKnowledgeBaseArn() != null)
            sb.append("KnowledgeBaseArn: ").append(getKnowledgeBaseArn()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentReference == false)
            return false;
        ContentReference other = (ContentReference) obj;
        if (other.getContentArn() == null ^ this.getContentArn() == null)
            return false;
        if (other.getContentArn() != null && other.getContentArn().equals(this.getContentArn()) == false)
            return false;
        if (other.getContentId() == null ^ this.getContentId() == null)
            return false;
        if (other.getContentId() != null && other.getContentId().equals(this.getContentId()) == false)
            return false;
        if (other.getKnowledgeBaseArn() == null ^ this.getKnowledgeBaseArn() == null)
            return false;
        if (other.getKnowledgeBaseArn() != null && other.getKnowledgeBaseArn().equals(this.getKnowledgeBaseArn()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentArn() == null) ? 0 : getContentArn().hashCode());
        hashCode = prime * hashCode + ((getContentId() == null) ? 0 : getContentId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseArn() == null) ? 0 : getKnowledgeBaseArn().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        return hashCode;
    }

    @Override
    public ContentReference clone() {
        try {
            return (ContentReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.ContentReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
