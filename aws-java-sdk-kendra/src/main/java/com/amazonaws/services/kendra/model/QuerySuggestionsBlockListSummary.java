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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information on a query suggestions block list.
 * </p>
 * <p>
 * This includes information on the block list ID, block list name, when the block list was created, when the block list
 * was last updated, and the count of block words/phrases in the block list.
 * </p>
 * <p>
 * For information on the current quota limits for block lists, see <a
 * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/QuerySuggestionsBlockListSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuerySuggestionsBlockListSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a block list.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the block list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the block list.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date-time summary information for a query suggestions block list was last created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date-time the block list was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The number of items in the block list file.
     * </p>
     */
    private Integer itemCount;

    /**
     * <p>
     * The identifier of a block list.
     * </p>
     * 
     * @param id
     *        The identifier of a block list.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of a block list.
     * </p>
     * 
     * @return The identifier of a block list.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of a block list.
     * </p>
     * 
     * @param id
     *        The identifier of a block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySuggestionsBlockListSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the block list.
     * </p>
     * 
     * @param name
     *        The name of the block list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the block list.
     * </p>
     * 
     * @return The name of the block list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the block list.
     * </p>
     * 
     * @param name
     *        The name of the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySuggestionsBlockListSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the block list.
     * </p>
     * 
     * @param status
     *        The status of the block list.
     * @see QuerySuggestionsBlockListStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the block list.
     * </p>
     * 
     * @return The status of the block list.
     * @see QuerySuggestionsBlockListStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the block list.
     * </p>
     * 
     * @param status
     *        The status of the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuerySuggestionsBlockListStatus
     */

    public QuerySuggestionsBlockListSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the block list.
     * </p>
     * 
     * @param status
     *        The status of the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuerySuggestionsBlockListStatus
     */

    public QuerySuggestionsBlockListSummary withStatus(QuerySuggestionsBlockListStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date-time summary information for a query suggestions block list was last created.
     * </p>
     * 
     * @param createdAt
     *        The date-time summary information for a query suggestions block list was last created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date-time summary information for a query suggestions block list was last created.
     * </p>
     * 
     * @return The date-time summary information for a query suggestions block list was last created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date-time summary information for a query suggestions block list was last created.
     * </p>
     * 
     * @param createdAt
     *        The date-time summary information for a query suggestions block list was last created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySuggestionsBlockListSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date-time the block list was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date-time the block list was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date-time the block list was last updated.
     * </p>
     * 
     * @return The date-time the block list was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date-time the block list was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date-time the block list was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySuggestionsBlockListSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The number of items in the block list file.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the block list file.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items in the block list file.
     * </p>
     * 
     * @return The number of items in the block list file.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The number of items in the block list file.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the block list file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuerySuggestionsBlockListSummary withItemCount(Integer itemCount) {
        setItemCount(itemCount);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuerySuggestionsBlockListSummary == false)
            return false;
        QuerySuggestionsBlockListSummary other = (QuerySuggestionsBlockListSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        return hashCode;
    }

    @Override
    public QuerySuggestionsBlockListSummary clone() {
        try {
            return (QuerySuggestionsBlockListSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.QuerySuggestionsBlockListSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
