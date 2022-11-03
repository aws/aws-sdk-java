/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     */
    private java.util.List<FieldValue> fields;
    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     */
    private String templateId;

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     * 
     * @return A list of detailed field information.
     */

    public java.util.List<FieldValue> getFields() {
        return fields;
    }

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     * 
     * @param fields
     *        A list of detailed field information.
     */

    public void setFields(java.util.Collection<FieldValue> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<FieldValue>(fields);
    }

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        A list of detailed field information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseResult withFields(FieldValue... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<FieldValue>(fields.length));
        }
        for (FieldValue ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     * 
     * @param fields
     *        A list of detailed field information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseResult withFields(java.util.Collection<FieldValue> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @return The token for the next set of results. This is null if there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @return A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *         control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetCaseResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseResult addTagsEntry(String key, String value) {
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

    public GetCaseResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier of a template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @return A unique identifier of a template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * A unique identifier of a template.
     * </p>
     * 
     * @param templateId
     *        A unique identifier of a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseResult withTemplateId(String templateId) {
        setTemplateId(templateId);
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
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCaseResult == false)
            return false;
        GetCaseResult other = (GetCaseResult) obj;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public GetCaseResult clone() {
        try {
            return (GetCaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
