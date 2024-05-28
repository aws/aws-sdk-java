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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateSourceNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSourceNetworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Account containing the VPC to protect.
     * </p>
     */
    private String originAccountID;
    /**
     * <p>
     * Region containing the VPC to protect.
     * </p>
     */
    private String originRegion;
    /**
     * <p>
     * A set of tags to be associated with the Source Network resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Which VPC ID to protect.
     * </p>
     */
    private String vpcID;

    /**
     * <p>
     * Account containing the VPC to protect.
     * </p>
     * 
     * @param originAccountID
     *        Account containing the VPC to protect.
     */

    public void setOriginAccountID(String originAccountID) {
        this.originAccountID = originAccountID;
    }

    /**
     * <p>
     * Account containing the VPC to protect.
     * </p>
     * 
     * @return Account containing the VPC to protect.
     */

    public String getOriginAccountID() {
        return this.originAccountID;
    }

    /**
     * <p>
     * Account containing the VPC to protect.
     * </p>
     * 
     * @param originAccountID
     *        Account containing the VPC to protect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSourceNetworkRequest withOriginAccountID(String originAccountID) {
        setOriginAccountID(originAccountID);
        return this;
    }

    /**
     * <p>
     * Region containing the VPC to protect.
     * </p>
     * 
     * @param originRegion
     *        Region containing the VPC to protect.
     */

    public void setOriginRegion(String originRegion) {
        this.originRegion = originRegion;
    }

    /**
     * <p>
     * Region containing the VPC to protect.
     * </p>
     * 
     * @return Region containing the VPC to protect.
     */

    public String getOriginRegion() {
        return this.originRegion;
    }

    /**
     * <p>
     * Region containing the VPC to protect.
     * </p>
     * 
     * @param originRegion
     *        Region containing the VPC to protect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSourceNetworkRequest withOriginRegion(String originRegion) {
        setOriginRegion(originRegion);
        return this;
    }

    /**
     * <p>
     * A set of tags to be associated with the Source Network resource.
     * </p>
     * 
     * @return A set of tags to be associated with the Source Network resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags to be associated with the Source Network resource.
     * </p>
     * 
     * @param tags
     *        A set of tags to be associated with the Source Network resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags to be associated with the Source Network resource.
     * </p>
     * 
     * @param tags
     *        A set of tags to be associated with the Source Network resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSourceNetworkRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSourceNetworkRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSourceNetworkRequest addTagsEntry(String key, String value) {
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

    public CreateSourceNetworkRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Which VPC ID to protect.
     * </p>
     * 
     * @param vpcID
     *        Which VPC ID to protect.
     */

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    /**
     * <p>
     * Which VPC ID to protect.
     * </p>
     * 
     * @return Which VPC ID to protect.
     */

    public String getVpcID() {
        return this.vpcID;
    }

    /**
     * <p>
     * Which VPC ID to protect.
     * </p>
     * 
     * @param vpcID
     *        Which VPC ID to protect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSourceNetworkRequest withVpcID(String vpcID) {
        setVpcID(vpcID);
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
        if (getOriginAccountID() != null)
            sb.append("OriginAccountID: ").append(getOriginAccountID()).append(",");
        if (getOriginRegion() != null)
            sb.append("OriginRegion: ").append(getOriginRegion()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getVpcID() != null)
            sb.append("VpcID: ").append(getVpcID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSourceNetworkRequest == false)
            return false;
        CreateSourceNetworkRequest other = (CreateSourceNetworkRequest) obj;
        if (other.getOriginAccountID() == null ^ this.getOriginAccountID() == null)
            return false;
        if (other.getOriginAccountID() != null && other.getOriginAccountID().equals(this.getOriginAccountID()) == false)
            return false;
        if (other.getOriginRegion() == null ^ this.getOriginRegion() == null)
            return false;
        if (other.getOriginRegion() != null && other.getOriginRegion().equals(this.getOriginRegion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcID() == null ^ this.getVpcID() == null)
            return false;
        if (other.getVpcID() != null && other.getVpcID().equals(this.getVpcID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginAccountID() == null) ? 0 : getOriginAccountID().hashCode());
        hashCode = prime * hashCode + ((getOriginRegion() == null) ? 0 : getOriginRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcID() == null) ? 0 : getVpcID().hashCode());
        return hashCode;
    }

    @Override
    public CreateSourceNetworkRequest clone() {
        return (CreateSourceNetworkRequest) super.clone();
    }

}
