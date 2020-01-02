/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A summary of information about an index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/IndexConfigurationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IndexConfigurationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the index.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A unique identifier for the index. Use this to identify the index when you are using operations such as
     * <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and <code>DeleteIndex</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the index was last updated by the <code>UpdateIndex</code> operation.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @param name
     *        The name of the index.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @return The name of the index.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @param name
     *        The name of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexConfigurationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the index. Use this to identify the index when you are using operations such as
     * <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and <code>DeleteIndex</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the index. Use this to identify the index when you are using operations such as
     *        <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and <code>DeleteIndex</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the index. Use this to identify the index when you are using operations such as
     * <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and <code>DeleteIndex</code>.
     * </p>
     * 
     * @return A unique identifier for the index. Use this to identify the index when you are using operations such as
     *         <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and <code>DeleteIndex</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the index. Use this to identify the index when you are using operations such as
     * <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and <code>DeleteIndex</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the index. Use this to identify the index when you are using operations such as
     *        <code>Query</code>, <code>DescribeIndex</code>, <code>UpdateIndex</code>, and <code>DeleteIndex</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexConfigurationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the index was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     * 
     * @return The Unix timestamp when the index was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the index was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexConfigurationSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated by the <code>UpdateIndex</code> operation.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the index was last updated by the <code>UpdateIndex</code> operation.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated by the <code>UpdateIndex</code> operation.
     * </p>
     * 
     * @return The Unix timestamp when the index was last updated by the <code>UpdateIndex</code> operation.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated by the <code>UpdateIndex</code> operation.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the index was last updated by the <code>UpdateIndex</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexConfigurationSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * @see IndexStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * </p>
     * 
     * @return The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * @see IndexStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public IndexConfigurationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the status is <code>ACTIVE</code>, the index is ready to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public IndexConfigurationSummary withStatus(IndexStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexConfigurationSummary == false)
            return false;
        IndexConfigurationSummary other = (IndexConfigurationSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public IndexConfigurationSummary clone() {
        try {
            return (IndexConfigurationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.IndexConfigurationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
