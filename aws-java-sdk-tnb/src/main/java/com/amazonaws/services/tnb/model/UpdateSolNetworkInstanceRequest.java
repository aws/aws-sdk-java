/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/UpdateSolNetworkInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSolNetworkInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the network instance.
     * </p>
     */
    private String nsInstanceId;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. When you use this API, the tags are transferred to the network operation that is created. Use tags to
     * search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of update.
     * </p>
     */
    private String updateType;

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @param nsInstanceId
     *        ID of the network instance.
     */

    public void setNsInstanceId(String nsInstanceId) {
        this.nsInstanceId = nsInstanceId;
    }

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @return ID of the network instance.
     */

    public String getNsInstanceId() {
        return this.nsInstanceId;
    }

    /**
     * <p>
     * ID of the network instance.
     * </p>
     * 
     * @param nsInstanceId
     *        ID of the network instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSolNetworkInstanceRequest withNsInstanceId(String nsInstanceId) {
        setNsInstanceId(nsInstanceId);
        return this;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. When you use this API, the tags are transferred to the network operation that is created. Use tags to
     * search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @return A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *         optional value. When you use this API, the tags are transferred to the network operation that is created.
     *         Use tags to search and filter your resources or track your Amazon Web Services costs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. When you use this API, the tags are transferred to the network operation that is created. Use tags to
     * search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. When you use this API, the tags are transferred to the network operation that is created.
     *        Use tags to search and filter your resources or track your Amazon Web Services costs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. When you use this API, the tags are transferred to the network operation that is created. Use tags to
     * search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. When you use this API, the tags are transferred to the network operation that is created.
     *        Use tags to search and filter your resources or track your Amazon Web Services costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSolNetworkInstanceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateSolNetworkInstanceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSolNetworkInstanceRequest addTagsEntry(String key, String value) {
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

    public UpdateSolNetworkInstanceRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of update.
     * </p>
     * 
     * @param updateType
     *        The type of update.
     * @see UpdateSolNetworkType
     */

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    /**
     * <p>
     * The type of update.
     * </p>
     * 
     * @return The type of update.
     * @see UpdateSolNetworkType
     */

    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * <p>
     * The type of update.
     * </p>
     * 
     * @param updateType
     *        The type of update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateSolNetworkType
     */

    public UpdateSolNetworkInstanceRequest withUpdateType(String updateType) {
        setUpdateType(updateType);
        return this;
    }

    /**
     * <p>
     * The type of update.
     * </p>
     * 
     * @param updateType
     *        The type of update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateSolNetworkType
     */

    public UpdateSolNetworkInstanceRequest withUpdateType(UpdateSolNetworkType updateType) {
        this.updateType = updateType.toString();
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
        if (getNsInstanceId() != null)
            sb.append("NsInstanceId: ").append(getNsInstanceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getUpdateType() != null)
            sb.append("UpdateType: ").append(getUpdateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSolNetworkInstanceRequest == false)
            return false;
        UpdateSolNetworkInstanceRequest other = (UpdateSolNetworkInstanceRequest) obj;
        if (other.getNsInstanceId() == null ^ this.getNsInstanceId() == null)
            return false;
        if (other.getNsInstanceId() != null && other.getNsInstanceId().equals(this.getNsInstanceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdateType() == null ^ this.getUpdateType() == null)
            return false;
        if (other.getUpdateType() != null && other.getUpdateType().equals(this.getUpdateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNsInstanceId() == null) ? 0 : getNsInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateType() == null) ? 0 : getUpdateType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSolNetworkInstanceRequest clone() {
        return (UpdateSolNetworkInstanceRequest) super.clone();
    }

}
