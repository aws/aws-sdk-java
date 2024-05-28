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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/TerminateSolNetworkInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateSolNetworkInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the network operation.
     * </p>
     */
    private String nsLcmOpOccId;
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
     * The identifier of the network operation.
     * </p>
     * 
     * @param nsLcmOpOccId
     *        The identifier of the network operation.
     */

    public void setNsLcmOpOccId(String nsLcmOpOccId) {
        this.nsLcmOpOccId = nsLcmOpOccId;
    }

    /**
     * <p>
     * The identifier of the network operation.
     * </p>
     * 
     * @return The identifier of the network operation.
     */

    public String getNsLcmOpOccId() {
        return this.nsLcmOpOccId;
    }

    /**
     * <p>
     * The identifier of the network operation.
     * </p>
     * 
     * @param nsLcmOpOccId
     *        The identifier of the network operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateSolNetworkInstanceResult withNsLcmOpOccId(String nsLcmOpOccId) {
        setNsLcmOpOccId(nsLcmOpOccId);
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

    public TerminateSolNetworkInstanceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see TerminateSolNetworkInstanceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TerminateSolNetworkInstanceResult addTagsEntry(String key, String value) {
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

    public TerminateSolNetworkInstanceResult clearTagsEntries() {
        this.tags = null;
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
        if (getNsLcmOpOccId() != null)
            sb.append("NsLcmOpOccId: ").append(getNsLcmOpOccId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateSolNetworkInstanceResult == false)
            return false;
        TerminateSolNetworkInstanceResult other = (TerminateSolNetworkInstanceResult) obj;
        if (other.getNsLcmOpOccId() == null ^ this.getNsLcmOpOccId() == null)
            return false;
        if (other.getNsLcmOpOccId() != null && other.getNsLcmOpOccId().equals(this.getNsLcmOpOccId()) == false)
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

        hashCode = prime * hashCode + ((getNsLcmOpOccId() == null) ? 0 : getNsLcmOpOccId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TerminateSolNetworkInstanceResult clone() {
        try {
            return (TerminateSolNetworkInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
