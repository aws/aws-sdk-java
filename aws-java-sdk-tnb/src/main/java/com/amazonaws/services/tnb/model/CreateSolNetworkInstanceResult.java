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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/CreateSolNetworkInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSolNetworkInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Network instance ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Network instance ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Network instance name.
     * </p>
     */
    private String nsInstanceName;
    /**
     * <p>
     * Network service descriptor ID.
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
     * Network instance ARN.
     * </p>
     * 
     * @param arn
     *        Network instance ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Network instance ARN.
     * </p>
     * 
     * @return Network instance ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Network instance ARN.
     * </p>
     * 
     * @param arn
     *        Network instance ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @param id
     *        Network instance ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @return Network instance ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Network instance ID.
     * </p>
     * 
     * @param id
     *        Network instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @param nsInstanceName
     *        Network instance name.
     */

    public void setNsInstanceName(String nsInstanceName) {
        this.nsInstanceName = nsInstanceName;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @return Network instance name.
     */

    public String getNsInstanceName() {
        return this.nsInstanceName;
    }

    /**
     * <p>
     * Network instance name.
     * </p>
     * 
     * @param nsInstanceName
     *        Network instance name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceResult withNsInstanceName(String nsInstanceName) {
        setNsInstanceName(nsInstanceName);
        return this;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @param nsdInfoId
     *        Network service descriptor ID.
     */

    public void setNsdInfoId(String nsdInfoId) {
        this.nsdInfoId = nsdInfoId;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @return Network service descriptor ID.
     */

    public String getNsdInfoId() {
        return this.nsdInfoId;
    }

    /**
     * <p>
     * Network service descriptor ID.
     * </p>
     * 
     * @param nsdInfoId
     *        Network service descriptor ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceResult withNsdInfoId(String nsdInfoId) {
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

    public CreateSolNetworkInstanceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSolNetworkInstanceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolNetworkInstanceResult addTagsEntry(String key, String value) {
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

    public CreateSolNetworkInstanceResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getNsInstanceName() != null)
            sb.append("NsInstanceName: ").append(getNsInstanceName()).append(",");
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

        if (obj instanceof CreateSolNetworkInstanceResult == false)
            return false;
        CreateSolNetworkInstanceResult other = (CreateSolNetworkInstanceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getNsInstanceName() == null ^ this.getNsInstanceName() == null)
            return false;
        if (other.getNsInstanceName() != null && other.getNsInstanceName().equals(this.getNsInstanceName()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getNsInstanceName() == null) ? 0 : getNsInstanceName().hashCode());
        hashCode = prime * hashCode + ((getNsdInfoId() == null) ? 0 : getNsdInfoId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSolNetworkInstanceResult clone() {
        try {
            return (CreateSolNetworkInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
