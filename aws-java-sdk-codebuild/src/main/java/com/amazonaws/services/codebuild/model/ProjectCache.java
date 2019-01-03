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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the cache for the build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectCache" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectCache implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Information about the cache location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: This value is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: This is the S3 bucket name/prefix.
     * </p>
     * </li>
     * </ul>
     */
    private String location;

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of cache used by the build project. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NO_CACHE</code>: The build project does not use any cache.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project reads and writes from and to S3.
     *        </p>
     *        </li>
     * @see CacheType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of cache used by the build project. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NO_CACHE</code>: The build project does not use any cache.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: The build project reads and writes from and to S3.
     *         </p>
     *         </li>
     * @see CacheType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of cache used by the build project. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NO_CACHE</code>: The build project does not use any cache.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project reads and writes from and to S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CacheType
     */

    public ProjectCache withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of cache used by the build project. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: The build project does not use any cache.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: The build project reads and writes from and to S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of cache used by the build project. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NO_CACHE</code>: The build project does not use any cache.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: The build project reads and writes from and to S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CacheType
     */

    public ProjectCache withType(CacheType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the cache location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: This value is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: This is the S3 bucket name/prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the cache location: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NO_CACHE</code>: This value is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: This is the S3 bucket name/prefix.
     *        </p>
     *        </li>
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the cache location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: This value is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: This is the S3 bucket name/prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the cache location: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NO_CACHE</code>: This value is ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>S3</code>: This is the S3 bucket name/prefix.
     *         </p>
     *         </li>
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the cache location:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NO_CACHE</code>: This value is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>S3</code>: This is the S3 bucket name/prefix.
     * </p>
     * </li>
     * </ul>
     * 
     * @param location
     *        Information about the cache location: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NO_CACHE</code>: This value is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>S3</code>: This is the S3 bucket name/prefix.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectCache withLocation(String location) {
        setLocation(location);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectCache == false)
            return false;
        ProjectCache other = (ProjectCache) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public ProjectCache clone() {
        try {
            return (ProjectCache) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectCacheMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
