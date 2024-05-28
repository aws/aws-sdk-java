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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSolNetworkInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Network instance description.
     * </p>
     */
    private String nsDescription;
    /**
     * <p>
     * Network instance name.
     * </p>
     */
    private String nsName;
    /**
     * <p>
     * ID for network service descriptor.
     * </p>
     */
    private String nsdInfoId;
    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Network instance description.
     * </p>
     * 
     * @param nsDescription
     *        Network instance description.
     */

    public void setNsDescription(String nsDescription) {
        this.nsDescription = nsDescription;
    }

    /**
     * <p>
     * Network instance description.
     * </p>
     * 
     * @return Network instance description.
     */

    public String getNsDescription() {
        return this.nsDescription;
    }

    /**
     * <p>
     * Network instance description.
     * </p>
     * 
     * @param nsDescription
     *        Network instance description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceRequest withNsDescription(String nsDescription) {
        setNsDescription(nsDescription);
        return this;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @param nsName
     *        Network instance name.
     */

    public void setNsName(String nsName) {
        this.nsName = nsName;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @return Network instance name.
     */

    public String getNsName() {
        return this.nsName;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @param nsName
     *        Network instance name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceRequest withNsName(String nsName) {
        setNsName(nsName);
        return this;
    }

    /**
     * <p>
     * ID for network service descriptor.
     * </p>
     * 
     * @param nsdInfoId
     *        ID for network service descriptor.
     */

    public void setNsdInfoId(String nsdInfoId) {
        this.nsdInfoId = nsdInfoId;
    }

    /**
     * <p>
     * ID for network service descriptor.
     * </p>
     * 
     * @return ID for network service descriptor.
     */

    public String getNsdInfoId() {
        return this.nsdInfoId;
    }

    /**
     * <p>
     * ID for network service descriptor.
     * </p>
     * 
     * @param nsdInfoId
     *        ID for network service descriptor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceRequest withNsdInfoId(String nsdInfoId) {
        setNsdInfoId(nsdInfoId);
        return this;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @return A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *         optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *         costs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional
     * value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
     * </p>
     * 
     * @param tags
     *        A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an
     *        optional value. You can use tags to search and filter your resources or track your Amazon Web Services
     *        costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSolNetworkInstanceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceRequest addTagsEntry(String key, String value) {
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

    public CreateSolNetworkInstanceRequest clearTagsEntries() {
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
        if (getNsDescription() != null)
            sb.append("NsDescription: ").append(getNsDescription()).append(",");
        if (getNsName() != null)
            sb.append("NsName: ").append(getNsName()).append(",");
        if (getNsdInfoId() != null)
            sb.append("NsdInfoId: ").append(getNsdInfoId()).append(",");
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

        if (obj instanceof CreateSolNetworkInstanceRequest == false)
            return false;
        CreateSolNetworkInstanceRequest other = (CreateSolNetworkInstanceRequest) obj;
        if (other.getNsDescription() == null ^ this.getNsDescription() == null)
            return false;
        if (other.getNsDescription() != null && other.getNsDescription().equals(this.getNsDescription()) == false)
            return false;
        if (other.getNsName() == null ^ this.getNsName() == null)
            return false;
        if (other.getNsName() != null && other.getNsName().equals(this.getNsName()) == false)
            return false;
        if (other.getNsdInfoId() == null ^ this.getNsdInfoId() == null)
            return false;
        if (other.getNsdInfoId() != null && other.getNsdInfoId().equals(this.getNsdInfoId()) == false)
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

        hashCode = prime * hashCode + ((getNsDescription() == null) ? 0 : getNsDescription().hashCode());
        hashCode = prime * hashCode + ((getNsName() == null) ? 0 : getNsName().hashCode());
        hashCode = prime * hashCode + ((getNsdInfoId() == null) ? 0 : getNsdInfoId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSolNetworkInstanceRequest clone() {
        return (CreateSolNetworkInstanceRequest) super.clone();
    }

}
