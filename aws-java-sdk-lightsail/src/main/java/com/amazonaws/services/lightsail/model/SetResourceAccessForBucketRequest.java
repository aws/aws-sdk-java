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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetResourceAccessForBucket"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetResourceAccessForBucketRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Lightsail instance for which to set bucket access. The instance must be in a running or stopped
     * state.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The name of the bucket for which to set access to another Lightsail resource.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The access setting.
     * </p>
     * <p>
     * The following access settings are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow</code> - Allows access to the bucket and its objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a resource
     * previously set to <code>allow</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String access;

    /**
     * <p>
     * The name of the Lightsail instance for which to set bucket access. The instance must be in a running or stopped
     * state.
     * </p>
     * 
     * @param resourceName
     *        The name of the Lightsail instance for which to set bucket access. The instance must be in a running or
     *        stopped state.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance for which to set bucket access. The instance must be in a running or stopped
     * state.
     * </p>
     * 
     * @return The name of the Lightsail instance for which to set bucket access. The instance must be in a running or
     *         stopped state.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the Lightsail instance for which to set bucket access. The instance must be in a running or stopped
     * state.
     * </p>
     * 
     * @param resourceName
     *        The name of the Lightsail instance for which to set bucket access. The instance must be in a running or
     *        stopped state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetResourceAccessForBucketRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The name of the bucket for which to set access to another Lightsail resource.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket for which to set access to another Lightsail resource.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket for which to set access to another Lightsail resource.
     * </p>
     * 
     * @return The name of the bucket for which to set access to another Lightsail resource.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket for which to set access to another Lightsail resource.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket for which to set access to another Lightsail resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetResourceAccessForBucketRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The access setting.
     * </p>
     * <p>
     * The following access settings are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow</code> - Allows access to the bucket and its objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a resource
     * previously set to <code>allow</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param access
     *        The access setting.</p>
     *        <p>
     *        The following access settings are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow</code> - Allows access to the bucket and its objects.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a
     *        resource previously set to <code>allow</code>.
     *        </p>
     *        </li>
     * @see ResourceBucketAccess
     */

    public void setAccess(String access) {
        this.access = access;
    }

    /**
     * <p>
     * The access setting.
     * </p>
     * <p>
     * The following access settings are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow</code> - Allows access to the bucket and its objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a resource
     * previously set to <code>allow</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The access setting.</p>
     *         <p>
     *         The following access settings are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>allow</code> - Allows access to the bucket and its objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a
     *         resource previously set to <code>allow</code>.
     *         </p>
     *         </li>
     * @see ResourceBucketAccess
     */

    public String getAccess() {
        return this.access;
    }

    /**
     * <p>
     * The access setting.
     * </p>
     * <p>
     * The following access settings are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow</code> - Allows access to the bucket and its objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a resource
     * previously set to <code>allow</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param access
     *        The access setting.</p>
     *        <p>
     *        The following access settings are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow</code> - Allows access to the bucket and its objects.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a
     *        resource previously set to <code>allow</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceBucketAccess
     */

    public SetResourceAccessForBucketRequest withAccess(String access) {
        setAccess(access);
        return this;
    }

    /**
     * <p>
     * The access setting.
     * </p>
     * <p>
     * The following access settings are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow</code> - Allows access to the bucket and its objects.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a resource
     * previously set to <code>allow</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param access
     *        The access setting.</p>
     *        <p>
     *        The following access settings are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow</code> - Allows access to the bucket and its objects.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deny</code> - Denies access to the bucket and its objects. Use this setting to remove access for a
     *        resource previously set to <code>allow</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceBucketAccess
     */

    public SetResourceAccessForBucketRequest withAccess(ResourceBucketAccess access) {
        this.access = access.toString();
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getAccess() != null)
            sb.append("Access: ").append(getAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetResourceAccessForBucketRequest == false)
            return false;
        SetResourceAccessForBucketRequest other = (SetResourceAccessForBucketRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getAccess() == null ^ this.getAccess() == null)
            return false;
        if (other.getAccess() != null && other.getAccess().equals(this.getAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getAccess() == null) ? 0 : getAccess().hashCode());
        return hashCode;
    }

    @Override
    public SetResourceAccessForBucketRequest clone() {
        return (SetResourceAccessForBucketRequest) super.clone();
    }

}
