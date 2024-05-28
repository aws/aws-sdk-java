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
package com.amazonaws.services.repostspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/DeregisterAdmin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterAdminRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the admin to remove.
     * </p>
     */
    private String adminId;
    /**
     * <p>
     * The ID of the private re:Post to remove the admin from.
     * </p>
     */
    private String spaceId;

    /**
     * <p>
     * The ID of the admin to remove.
     * </p>
     * 
     * @param adminId
     *        The ID of the admin to remove.
     */

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    /**
     * <p>
     * The ID of the admin to remove.
     * </p>
     * 
     * @return The ID of the admin to remove.
     */

    public String getAdminId() {
        return this.adminId;
    }

    /**
     * <p>
     * The ID of the admin to remove.
     * </p>
     * 
     * @param adminId
     *        The ID of the admin to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterAdminRequest withAdminId(String adminId) {
        setAdminId(adminId);
        return this;
    }

    /**
     * <p>
     * The ID of the private re:Post to remove the admin from.
     * </p>
     * 
     * @param spaceId
     *        The ID of the private re:Post to remove the admin from.
     */

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    /**
     * <p>
     * The ID of the private re:Post to remove the admin from.
     * </p>
     * 
     * @return The ID of the private re:Post to remove the admin from.
     */

    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * <p>
     * The ID of the private re:Post to remove the admin from.
     * </p>
     * 
     * @param spaceId
     *        The ID of the private re:Post to remove the admin from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterAdminRequest withSpaceId(String spaceId) {
        setSpaceId(spaceId);
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
        if (getAdminId() != null)
            sb.append("AdminId: ").append(getAdminId()).append(",");
        if (getSpaceId() != null)
            sb.append("SpaceId: ").append(getSpaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterAdminRequest == false)
            return false;
        DeregisterAdminRequest other = (DeregisterAdminRequest) obj;
        if (other.getAdminId() == null ^ this.getAdminId() == null)
            return false;
        if (other.getAdminId() != null && other.getAdminId().equals(this.getAdminId()) == false)
            return false;
        if (other.getSpaceId() == null ^ this.getSpaceId() == null)
            return false;
        if (other.getSpaceId() != null && other.getSpaceId().equals(this.getSpaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        hashCode = prime * hashCode + ((getSpaceId() == null) ? 0 : getSpaceId().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterAdminRequest clone() {
        return (DeregisterAdminRequest) super.clone();
    }

}
