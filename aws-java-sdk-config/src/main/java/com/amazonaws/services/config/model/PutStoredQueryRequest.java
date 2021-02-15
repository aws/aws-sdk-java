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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutStoredQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutStoredQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StoredQuery</code> objects. The mandatory fields are <code>QueryName</code> and
     * <code>Expression</code>.
     * </p>
     * <note>
     * <p>
     * When you are creating a query, you must provide a query name and an expression. When you are updating a query,
     * you must provide a query name but updating the description is optional.
     * </p>
     * </note>
     */
    private StoredQuery storedQuery;
    /**
     * <p>
     * A list of <code>Tags</code> object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A list of <code>StoredQuery</code> objects. The mandatory fields are <code>QueryName</code> and
     * <code>Expression</code>.
     * </p>
     * <note>
     * <p>
     * When you are creating a query, you must provide a query name and an expression. When you are updating a query,
     * you must provide a query name but updating the description is optional.
     * </p>
     * </note>
     * 
     * @param storedQuery
     *        A list of <code>StoredQuery</code> objects. The mandatory fields are <code>QueryName</code> and
     *        <code>Expression</code>.</p> <note>
     *        <p>
     *        When you are creating a query, you must provide a query name and an expression. When you are updating a
     *        query, you must provide a query name but updating the description is optional.
     *        </p>
     */

    public void setStoredQuery(StoredQuery storedQuery) {
        this.storedQuery = storedQuery;
    }

    /**
     * <p>
     * A list of <code>StoredQuery</code> objects. The mandatory fields are <code>QueryName</code> and
     * <code>Expression</code>.
     * </p>
     * <note>
     * <p>
     * When you are creating a query, you must provide a query name and an expression. When you are updating a query,
     * you must provide a query name but updating the description is optional.
     * </p>
     * </note>
     * 
     * @return A list of <code>StoredQuery</code> objects. The mandatory fields are <code>QueryName</code> and
     *         <code>Expression</code>.</p> <note>
     *         <p>
     *         When you are creating a query, you must provide a query name and an expression. When you are updating a
     *         query, you must provide a query name but updating the description is optional.
     *         </p>
     */

    public StoredQuery getStoredQuery() {
        return this.storedQuery;
    }

    /**
     * <p>
     * A list of <code>StoredQuery</code> objects. The mandatory fields are <code>QueryName</code> and
     * <code>Expression</code>.
     * </p>
     * <note>
     * <p>
     * When you are creating a query, you must provide a query name and an expression. When you are updating a query,
     * you must provide a query name but updating the description is optional.
     * </p>
     * </note>
     * 
     * @param storedQuery
     *        A list of <code>StoredQuery</code> objects. The mandatory fields are <code>QueryName</code> and
     *        <code>Expression</code>.</p> <note>
     *        <p>
     *        When you are creating a query, you must provide a query name and an expression. When you are updating a
     *        query, you must provide a query name but updating the description is optional.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStoredQueryRequest withStoredQuery(StoredQuery storedQuery) {
        setStoredQuery(storedQuery);
        return this;
    }

    /**
     * <p>
     * A list of <code>Tags</code> object.
     * </p>
     * 
     * @return A list of <code>Tags</code> object.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of <code>Tags</code> object.
     * </p>
     * 
     * @param tags
     *        A list of <code>Tags</code> object.
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
     * A list of <code>Tags</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <code>Tags</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStoredQueryRequest withTags(Tag... tags) {
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
     * A list of <code>Tags</code> object.
     * </p>
     * 
     * @param tags
     *        A list of <code>Tags</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStoredQueryRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getStoredQuery() != null)
            sb.append("StoredQuery: ").append(getStoredQuery()).append(",");
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

        if (obj instanceof PutStoredQueryRequest == false)
            return false;
        PutStoredQueryRequest other = (PutStoredQueryRequest) obj;
        if (other.getStoredQuery() == null ^ this.getStoredQuery() == null)
            return false;
        if (other.getStoredQuery() != null && other.getStoredQuery().equals(this.getStoredQuery()) == false)
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

        hashCode = prime * hashCode + ((getStoredQuery() == null) ? 0 : getStoredQuery().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutStoredQueryRequest clone() {
        return (PutStoredQueryRequest) super.clone();
    }

}
