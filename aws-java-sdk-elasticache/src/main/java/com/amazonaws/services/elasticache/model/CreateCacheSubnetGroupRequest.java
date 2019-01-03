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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>CreateCacheSubnetGroup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/CreateCacheSubnetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCacheSubnetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the cache subnet group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * <p>
     * Example: <code>mysubnetgroup</code>
     * </p>
     */
    private String cacheSubnetGroupName;
    /**
     * <p>
     * A description for the cache subnet group.
     * </p>
     */
    private String cacheSubnetGroupDescription;
    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;

    /**
     * <p>
     * A name for the cache subnet group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * <p>
     * Example: <code>mysubnetgroup</code>
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        A name for the cache subnet group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *        </p>
     *        <p>
     *        Example: <code>mysubnetgroup</code>
     */

    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * A name for the cache subnet group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * <p>
     * Example: <code>mysubnetgroup</code>
     * </p>
     * 
     * @return A name for the cache subnet group. This value is stored as a lowercase string.</p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *         </p>
     *         <p>
     *         Example: <code>mysubnetgroup</code>
     */

    public String getCacheSubnetGroupName() {
        return this.cacheSubnetGroupName;
    }

    /**
     * <p>
     * A name for the cache subnet group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     * </p>
     * <p>
     * Example: <code>mysubnetgroup</code>
     * </p>
     * 
     * @param cacheSubnetGroupName
     *        A name for the cache subnet group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
     *        </p>
     *        <p>
     *        Example: <code>mysubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheSubnetGroupRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        setCacheSubnetGroupName(cacheSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A description for the cache subnet group.
     * </p>
     * 
     * @param cacheSubnetGroupDescription
     *        A description for the cache subnet group.
     */

    public void setCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
    }

    /**
     * <p>
     * A description for the cache subnet group.
     * </p>
     * 
     * @return A description for the cache subnet group.
     */

    public String getCacheSubnetGroupDescription() {
        return this.cacheSubnetGroupDescription;
    }

    /**
     * <p>
     * A description for the cache subnet group.
     * </p>
     * 
     * @param cacheSubnetGroupDescription
     *        A description for the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheSubnetGroupRequest withCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        setCacheSubnetGroupDescription(cacheSubnetGroupDescription);
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     * 
     * @return A list of VPC subnet IDs for the cache subnet group.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs for the cache subnet group.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs for the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs for the cache subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCacheSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: ").append(getCacheSubnetGroupName()).append(",");
        if (getCacheSubnetGroupDescription() != null)
            sb.append("CacheSubnetGroupDescription: ").append(getCacheSubnetGroupDescription()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCacheSubnetGroupRequest == false)
            return false;
        CreateCacheSubnetGroupRequest other = (CreateCacheSubnetGroupRequest) obj;
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getCacheSubnetGroupDescription() == null ^ this.getCacheSubnetGroupDescription() == null)
            return false;
        if (other.getCacheSubnetGroupDescription() != null && other.getCacheSubnetGroupDescription().equals(this.getCacheSubnetGroupDescription()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getCacheSubnetGroupDescription() == null) ? 0 : getCacheSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public CreateCacheSubnetGroupRequest clone() {
        return (CreateCacheSubnetGroupRequest) super.clone();
    }

}
