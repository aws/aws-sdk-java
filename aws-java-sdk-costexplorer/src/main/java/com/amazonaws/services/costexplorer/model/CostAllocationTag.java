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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The cost allocation tag structure. This includes detailed metadata for the <code>CostAllocationTag</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostAllocationTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostAllocationTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type tags.
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @param tagKey
     *        The key for the cost allocation tag.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @return The key for the cost allocation tag.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The key for the cost allocation tag.
     * </p>
     * 
     * @param tagKey
     *        The key for the cost allocation tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostAllocationTag withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type tags.
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     * 
     * @param type
     *        The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type
     *        tags. <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support
     *        Amazon Web Services resources for cost allocation purposes. <code>UserDefined</code> type tags are tags
     *        that you define, create, and apply to resources.
     * @see CostAllocationTagType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type tags.
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     * 
     * @return The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type
     *         tags. <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to
     *         support Amazon Web Services resources for cost allocation purposes. <code>UserDefined</code> type tags
     *         are tags that you define, create, and apply to resources.
     * @see CostAllocationTagType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type tags.
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     * 
     * @param type
     *        The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type
     *        tags. <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support
     *        Amazon Web Services resources for cost allocation purposes. <code>UserDefined</code> type tags are tags
     *        that you define, create, and apply to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagType
     */

    public CostAllocationTag withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type tags.
     * <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support Amazon Web
     * Services resources for cost allocation purposes. <code>UserDefined</code> type tags are tags that you define,
     * create, and apply to resources.
     * </p>
     * 
     * @param type
     *        The type of cost allocation tag. You can use <code>AWSGenerated</code> or <code>UserDefined</code> type
     *        tags. <code>AWSGenerated</code> type tags are tags that Amazon Web Services defines and applies to support
     *        Amazon Web Services resources for cost allocation purposes. <code>UserDefined</code> type tags are tags
     *        that you define, create, and apply to resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagType
     */

    public CostAllocationTag withType(CostAllocationTagType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     * 
     * @param status
     *        The status of a cost allocation tag.
     * @see CostAllocationTagStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     * 
     * @return The status of a cost allocation tag.
     * @see CostAllocationTagStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     * 
     * @param status
     *        The status of a cost allocation tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagStatus
     */

    public CostAllocationTag withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a cost allocation tag.
     * </p>
     * 
     * @param status
     *        The status of a cost allocation tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostAllocationTagStatus
     */

    public CostAllocationTag withStatus(CostAllocationTagStatus status) {
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof CostAllocationTag == false)
            return false;
        CostAllocationTag other = (CostAllocationTag) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CostAllocationTag clone() {
        try {
            return (CostAllocationTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostAllocationTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
