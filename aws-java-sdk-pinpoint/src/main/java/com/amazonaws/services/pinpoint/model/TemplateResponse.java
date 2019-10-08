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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a message template that's associated with your Amazon Pinpoint account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TemplateResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date when the message template was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The date when the message template was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The name of the message template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The type of channel that the message template is designed for.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the message template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the message template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateResponse withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date when the message template was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the message template was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the message template was created.
     * </p>
     * 
     * @return The date when the message template was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date when the message template was created.
     * </p>
     * 
     * @param creationDate
     *        The date when the message template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the message template was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the message template was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the message template was last modified.
     * </p>
     * 
     * @return The date when the message template was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date when the message template was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the message template was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *         template. Each tag consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *        template. Each tag consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *        template. Each tag consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public TemplateResponse addTagsEntry(String key, String value) {
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

    public TemplateResponse clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @param templateName
     *        The name of the message template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @return The name of the message template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @param templateName
     *        The name of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateResponse withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for.
     * @see TemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for.
     * </p>
     * 
     * @return The type of channel that the message template is designed for.
     * @see TemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public TemplateResponse withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public TemplateResponse withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateResponse == false)
            return false;
        TemplateResponse other = (TemplateResponse) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public TemplateResponse clone() {
        try {
            return (TemplateResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.TemplateResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
