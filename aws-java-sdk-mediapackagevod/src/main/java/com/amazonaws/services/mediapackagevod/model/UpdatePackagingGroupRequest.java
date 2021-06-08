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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A MediaPackage VOD PackagingGroup resource configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/UpdatePackagingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePackagingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private Authorization authorization;
    /** The ID of a MediaPackage VOD PackagingGroup resource. */
    private String id;

    /**
     * @param authorization
     */

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    /**
     * @return
     */

    public Authorization getAuthorization() {
        return this.authorization;
    }

    /**
     * @param authorization
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackagingGroupRequest withAuthorization(Authorization authorization) {
        setAuthorization(authorization);
        return this;
    }

    /**
     * The ID of a MediaPackage VOD PackagingGroup resource.
     * 
     * @param id
     *        The ID of a MediaPackage VOD PackagingGroup resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of a MediaPackage VOD PackagingGroup resource.
     * 
     * @return The ID of a MediaPackage VOD PackagingGroup resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of a MediaPackage VOD PackagingGroup resource.
     * 
     * @param id
     *        The ID of a MediaPackage VOD PackagingGroup resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePackagingGroupRequest withId(String id) {
        setId(id);
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
        if (getAuthorization() != null)
            sb.append("Authorization: ").append(getAuthorization()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackagingGroupRequest == false)
            return false;
        UpdatePackagingGroupRequest other = (UpdatePackagingGroupRequest) obj;
        if (other.getAuthorization() == null ^ this.getAuthorization() == null)
            return false;
        if (other.getAuthorization() != null && other.getAuthorization().equals(this.getAuthorization()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorization() == null) ? 0 : getAuthorization().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePackagingGroupRequest clone() {
        return (UpdatePackagingGroupRequest) super.clone();
    }

}
