/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to create a new dedicated IP pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CreateDedicatedIpPool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDedicatedIpPoolRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the pool.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     * 
     * @param poolName
     *        The name of the dedicated IP pool.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     * 
     * @return The name of the dedicated IP pool.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * The name of the dedicated IP pool.
     * </p>
     * 
     * @param poolName
     *        The name of the dedicated IP pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDedicatedIpPoolRequest withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the pool.
     * </p>
     * 
     * @return An object that defines the tags (keys and values) that you want to associate with the pool.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the pool.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the pool.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the pool.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDedicatedIpPoolRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that defines the tags (keys and values) that you want to associate with the pool.
     * </p>
     * 
     * @param tags
     *        An object that defines the tags (keys and values) that you want to associate with the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDedicatedIpPoolRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName()).append(",");
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

        if (obj instanceof CreateDedicatedIpPoolRequest == false)
            return false;
        CreateDedicatedIpPoolRequest other = (CreateDedicatedIpPoolRequest) obj;
        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
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

        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDedicatedIpPoolRequest clone() {
        return (CreateDedicatedIpPoolRequest) super.clone();
    }

}
