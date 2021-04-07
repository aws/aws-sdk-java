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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>CreateCacheParameterGroup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheParameterGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCacheParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-specified name for the cache parameter group.
     * </p>
     */
    private String cacheParameterGroupName;
    /**
     * <p>
     * The name of the cache parameter group family that the cache parameter group can be used with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> | <code>memcached1.6</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> | <code>redis4.0</code> |
     * <code>redis5.0</code> | <code>redis6.x</code> |
     * </p>
     */
    private String cacheParameterGroupFamily;
    /**
     * <p>
     * A user-specified description for the cache parameter group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateCacheParameterGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateCacheParameterGroupRequest() {
    }

    /**
     * Constructs a new CreateCacheParameterGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param cacheParameterGroupName
     *        A user-specified name for the cache parameter group.
     * @param cacheParameterGroupFamily
     *        The name of the cache parameter group family that the cache parameter group can be used with.</p>
     *        <p>
     *        Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> | <code>memcached1.6</code> |
     *        <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> | <code>redis4.0</code> |
     *        <code>redis5.0</code> | <code>redis6.x</code> |
     * @param description
     *        A user-specified description for the cache parameter group.
     */
    public CreateCacheParameterGroupRequest(String cacheParameterGroupName, String cacheParameterGroupFamily, String description) {
        setCacheParameterGroupName(cacheParameterGroupName);
        setCacheParameterGroupFamily(cacheParameterGroupFamily);
        setDescription(description);
    }

    /**
     * <p>
     * A user-specified name for the cache parameter group.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        A user-specified name for the cache parameter group.
     */

    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }

    /**
     * <p>
     * A user-specified name for the cache parameter group.
     * </p>
     * 
     * @return A user-specified name for the cache parameter group.
     */

    public String getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }

    /**
     * <p>
     * A user-specified name for the cache parameter group.
     * </p>
     * 
     * @param cacheParameterGroupName
     *        A user-specified name for the cache parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        setCacheParameterGroupName(cacheParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the cache parameter group family that the cache parameter group can be used with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> | <code>memcached1.6</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> | <code>redis4.0</code> |
     * <code>redis5.0</code> | <code>redis6.x</code> |
     * </p>
     * 
     * @param cacheParameterGroupFamily
     *        The name of the cache parameter group family that the cache parameter group can be used with.</p>
     *        <p>
     *        Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> | <code>memcached1.6</code> |
     *        <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> | <code>redis4.0</code> |
     *        <code>redis5.0</code> | <code>redis6.x</code> |
     */

    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cache parameter group family that the cache parameter group can be used with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> | <code>memcached1.6</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> | <code>redis4.0</code> |
     * <code>redis5.0</code> | <code>redis6.x</code> |
     * </p>
     * 
     * @return The name of the cache parameter group family that the cache parameter group can be used with.</p>
     *         <p>
     *         Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> | <code>memcached1.6</code> |
     *         <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> | <code>redis4.0</code> |
     *         <code>redis5.0</code> | <code>redis6.x</code> |
     */

    public String getCacheParameterGroupFamily() {
        return this.cacheParameterGroupFamily;
    }

    /**
     * <p>
     * The name of the cache parameter group family that the cache parameter group can be used with.
     * </p>
     * <p>
     * Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> | <code>memcached1.6</code> |
     * <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> | <code>redis4.0</code> |
     * <code>redis5.0</code> | <code>redis6.x</code> |
     * </p>
     * 
     * @param cacheParameterGroupFamily
     *        The name of the cache parameter group family that the cache parameter group can be used with.</p>
     *        <p>
     *        Valid values are: <code>memcached1.4</code> | <code>memcached1.5</code> | <code>memcached1.6</code> |
     *        <code>redis2.6</code> | <code>redis2.8</code> | <code>redis3.2</code> | <code>redis4.0</code> |
     *        <code>redis5.0</code> | <code>redis6.x</code> |
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheParameterGroupRequest withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        setCacheParameterGroupFamily(cacheParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * A user-specified description for the cache parameter group.
     * </p>
     * 
     * @param description
     *        A user-specified description for the cache parameter group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-specified description for the cache parameter group.
     * </p>
     * 
     * @return A user-specified description for the cache parameter group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-specified description for the cache parameter group.
     * </p>
     * 
     * @param description
     *        A user-specified description for the cache parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheParameterGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @return A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by
     *         a tag value, although null is accepted.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheParameterGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getCacheParameterGroupName() != null)
            sb.append("CacheParameterGroupName: ").append(getCacheParameterGroupName()).append(",");
        if (getCacheParameterGroupFamily() != null)
            sb.append("CacheParameterGroupFamily: ").append(getCacheParameterGroupFamily()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateCacheParameterGroupRequest == false)
            return false;
        CreateCacheParameterGroupRequest other = (CreateCacheParameterGroupRequest) obj;
        if (other.getCacheParameterGroupName() == null ^ this.getCacheParameterGroupName() == null)
            return false;
        if (other.getCacheParameterGroupName() != null && other.getCacheParameterGroupName().equals(this.getCacheParameterGroupName()) == false)
            return false;
        if (other.getCacheParameterGroupFamily() == null ^ this.getCacheParameterGroupFamily() == null)
            return false;
        if (other.getCacheParameterGroupFamily() != null && other.getCacheParameterGroupFamily().equals(this.getCacheParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getCacheParameterGroupName() == null) ? 0 : getCacheParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getCacheParameterGroupFamily() == null) ? 0 : getCacheParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCacheParameterGroupRequest clone() {
        return (CreateCacheParameterGroupRequest) super.clone();
    }

}
