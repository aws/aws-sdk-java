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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIndexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time when the index was originally created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the index was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * This response value is present only if this index is <code>Type=AGGREGATOR</code>.
     * </p>
     * <p>
     * A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     * </p>
     */
    private java.util.List<String> replicatingFrom;
    /**
     * <p>
     * This response value is present only if this index is <code>Type=LOCAL</code>.
     * </p>
     * <p>
     * The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index does
     * exist then the Region in which you called this operation replicates its index information to the Region specified
     * in this response value.
     * </p>
     */
    private java.util.List<String> replicatingTo;
    /**
     * <p>
     * The current state of the index in this Amazon Web Services Region.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Tag key and value pairs that are attached to the index.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of the index in this Region. For information about the aggregator index and how it differs from a local
     * index, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *         name (ARN)</a> of the index.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource name
     * (ARN)</a> of the index.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon resource
     *        name (ARN)</a> of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when the index was originally created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the index was originally created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the index was originally created.
     * </p>
     * 
     * @return The date and time when the index was originally created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the index was originally created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the index was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the index was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the index was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the index was last updated.
     * </p>
     * 
     * @return The date and time when the index was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the index was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the index was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * This response value is present only if this index is <code>Type=AGGREGATOR</code>.
     * </p>
     * <p>
     * A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     * </p>
     * 
     * @return This response value is present only if this index is <code>Type=AGGREGATOR</code>.</p>
     *         <p>
     *         A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     */

    public java.util.List<String> getReplicatingFrom() {
        return replicatingFrom;
    }

    /**
     * <p>
     * This response value is present only if this index is <code>Type=AGGREGATOR</code>.
     * </p>
     * <p>
     * A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     * </p>
     * 
     * @param replicatingFrom
     *        This response value is present only if this index is <code>Type=AGGREGATOR</code>.</p>
     *        <p>
     *        A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     */

    public void setReplicatingFrom(java.util.Collection<String> replicatingFrom) {
        if (replicatingFrom == null) {
            this.replicatingFrom = null;
            return;
        }

        this.replicatingFrom = new java.util.ArrayList<String>(replicatingFrom);
    }

    /**
     * <p>
     * This response value is present only if this index is <code>Type=AGGREGATOR</code>.
     * </p>
     * <p>
     * A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicatingFrom(java.util.Collection)} or {@link #withReplicatingFrom(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicatingFrom
     *        This response value is present only if this index is <code>Type=AGGREGATOR</code>.</p>
     *        <p>
     *        A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withReplicatingFrom(String... replicatingFrom) {
        if (this.replicatingFrom == null) {
            setReplicatingFrom(new java.util.ArrayList<String>(replicatingFrom.length));
        }
        for (String ele : replicatingFrom) {
            this.replicatingFrom.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This response value is present only if this index is <code>Type=AGGREGATOR</code>.
     * </p>
     * <p>
     * A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     * </p>
     * 
     * @param replicatingFrom
     *        This response value is present only if this index is <code>Type=AGGREGATOR</code>.</p>
     *        <p>
     *        A list of the Amazon Web Services Regions that replicate their content to the index in this Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withReplicatingFrom(java.util.Collection<String> replicatingFrom) {
        setReplicatingFrom(replicatingFrom);
        return this;
    }

    /**
     * <p>
     * This response value is present only if this index is <code>Type=LOCAL</code>.
     * </p>
     * <p>
     * The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index does
     * exist then the Region in which you called this operation replicates its index information to the Region specified
     * in this response value.
     * </p>
     * 
     * @return This response value is present only if this index is <code>Type=LOCAL</code>.</p>
     *         <p>
     *         The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index
     *         does exist then the Region in which you called this operation replicates its index information to the
     *         Region specified in this response value.
     */

    public java.util.List<String> getReplicatingTo() {
        return replicatingTo;
    }

    /**
     * <p>
     * This response value is present only if this index is <code>Type=LOCAL</code>.
     * </p>
     * <p>
     * The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index does
     * exist then the Region in which you called this operation replicates its index information to the Region specified
     * in this response value.
     * </p>
     * 
     * @param replicatingTo
     *        This response value is present only if this index is <code>Type=LOCAL</code>.</p>
     *        <p>
     *        The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index
     *        does exist then the Region in which you called this operation replicates its index information to the
     *        Region specified in this response value.
     */

    public void setReplicatingTo(java.util.Collection<String> replicatingTo) {
        if (replicatingTo == null) {
            this.replicatingTo = null;
            return;
        }

        this.replicatingTo = new java.util.ArrayList<String>(replicatingTo);
    }

    /**
     * <p>
     * This response value is present only if this index is <code>Type=LOCAL</code>.
     * </p>
     * <p>
     * The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index does
     * exist then the Region in which you called this operation replicates its index information to the Region specified
     * in this response value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicatingTo(java.util.Collection)} or {@link #withReplicatingTo(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param replicatingTo
     *        This response value is present only if this index is <code>Type=LOCAL</code>.</p>
     *        <p>
     *        The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index
     *        does exist then the Region in which you called this operation replicates its index information to the
     *        Region specified in this response value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withReplicatingTo(String... replicatingTo) {
        if (this.replicatingTo == null) {
            setReplicatingTo(new java.util.ArrayList<String>(replicatingTo.length));
        }
        for (String ele : replicatingTo) {
            this.replicatingTo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This response value is present only if this index is <code>Type=LOCAL</code>.
     * </p>
     * <p>
     * The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index does
     * exist then the Region in which you called this operation replicates its index information to the Region specified
     * in this response value.
     * </p>
     * 
     * @param replicatingTo
     *        This response value is present only if this index is <code>Type=LOCAL</code>.</p>
     *        <p>
     *        The Amazon Web Services Region that contains the aggregator index, if one exists. If an aggregator index
     *        does exist then the Region in which you called this operation replicates its index information to the
     *        Region specified in this response value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withReplicatingTo(java.util.Collection<String> replicatingTo) {
        setReplicatingTo(replicatingTo);
        return this;
    }

    /**
     * <p>
     * The current state of the index in this Amazon Web Services Region.
     * </p>
     * 
     * @param state
     *        The current state of the index in this Amazon Web Services Region.
     * @see IndexState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the index in this Amazon Web Services Region.
     * </p>
     * 
     * @return The current state of the index in this Amazon Web Services Region.
     * @see IndexState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the index in this Amazon Web Services Region.
     * </p>
     * 
     * @param state
     *        The current state of the index in this Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexState
     */

    public GetIndexResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the index in this Amazon Web Services Region.
     * </p>
     * 
     * @param state
     *        The current state of the index in this Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexState
     */

    public GetIndexResult withState(IndexState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Tag key and value pairs that are attached to the index.
     * </p>
     * 
     * @return Tag key and value pairs that are attached to the index.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tag key and value pairs that are attached to the index.
     * </p>
     * 
     * @param tags
     *        Tag key and value pairs that are attached to the index.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tag key and value pairs that are attached to the index.
     * </p>
     * 
     * @param tags
     *        Tag key and value pairs that are attached to the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetIndexResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult addTagsEntry(String key, String value) {
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

    public GetIndexResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of the index in this Region. For information about the aggregator index and how it differs from a local
     * index, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a>.
     * </p>
     * 
     * @param type
     *        The type of the index in this Region. For information about the aggregator index and how it differs from a
     *        local index, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html"
     *        >Turning on cross-Region search by creating an aggregator index</a>.
     * @see IndexType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the index in this Region. For information about the aggregator index and how it differs from a local
     * index, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a>.
     * </p>
     * 
     * @return The type of the index in this Region. For information about the aggregator index and how it differs from
     *         a local index, see <a
     *         href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html"
     *         >Turning on cross-Region search by creating an aggregator index</a>.
     * @see IndexType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the index in this Region. For information about the aggregator index and how it differs from a local
     * index, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a>.
     * </p>
     * 
     * @param type
     *        The type of the index in this Region. For information about the aggregator index and how it differs from a
     *        local index, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html"
     *        >Turning on cross-Region search by creating an aggregator index</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public GetIndexResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the index in this Region. For information about the aggregator index and how it differs from a local
     * index, see <a
     * href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html">Turning on
     * cross-Region search by creating an aggregator index</a>.
     * </p>
     * 
     * @param type
     *        The type of the index in this Region. For information about the aggregator index and how it differs from a
     *        local index, see <a
     *        href="https://docs.aws.amazon.com/resource-explorer/latest/userguide/manage-aggregator-region.html"
     *        >Turning on cross-Region search by creating an aggregator index</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public GetIndexResult withType(IndexType type) {
        this.type = type.toString();
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getReplicatingFrom() != null)
            sb.append("ReplicatingFrom: ").append(getReplicatingFrom()).append(",");
        if (getReplicatingTo() != null)
            sb.append("ReplicatingTo: ").append(getReplicatingTo()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIndexResult == false)
            return false;
        GetIndexResult other = (GetIndexResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getReplicatingFrom() == null ^ this.getReplicatingFrom() == null)
            return false;
        if (other.getReplicatingFrom() != null && other.getReplicatingFrom().equals(this.getReplicatingFrom()) == false)
            return false;
        if (other.getReplicatingTo() == null ^ this.getReplicatingTo() == null)
            return false;
        if (other.getReplicatingTo() != null && other.getReplicatingTo().equals(this.getReplicatingTo()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getReplicatingFrom() == null) ? 0 : getReplicatingFrom().hashCode());
        hashCode = prime * hashCode + ((getReplicatingTo() == null) ? 0 : getReplicatingTo().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetIndexResult clone() {
        try {
            return (GetIndexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
