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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DeleteImagePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteImagePermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the private image.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The 12-digit identifier of the AWS account for which to delete image permissions.
     * </p>
     */
    private String sharedAccountId;

    /**
     * <p>
     * The name of the private image.
     * </p>
     * 
     * @param name
     *        The name of the private image.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the private image.
     * </p>
     * 
     * @return The name of the private image.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the private image.
     * </p>
     * 
     * @param name
     *        The name of the private image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteImagePermissionsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The 12-digit identifier of the AWS account for which to delete image permissions.
     * </p>
     * 
     * @param sharedAccountId
     *        The 12-digit identifier of the AWS account for which to delete image permissions.
     */

    public void setSharedAccountId(String sharedAccountId) {
        this.sharedAccountId = sharedAccountId;
    }

    /**
     * <p>
     * The 12-digit identifier of the AWS account for which to delete image permissions.
     * </p>
     * 
     * @return The 12-digit identifier of the AWS account for which to delete image permissions.
     */

    public String getSharedAccountId() {
        return this.sharedAccountId;
    }

    /**
     * <p>
     * The 12-digit identifier of the AWS account for which to delete image permissions.
     * </p>
     * 
     * @param sharedAccountId
     *        The 12-digit identifier of the AWS account for which to delete image permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteImagePermissionsRequest withSharedAccountId(String sharedAccountId) {
        setSharedAccountId(sharedAccountId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSharedAccountId() != null)
            sb.append("SharedAccountId: ").append(getSharedAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteImagePermissionsRequest == false)
            return false;
        DeleteImagePermissionsRequest other = (DeleteImagePermissionsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSharedAccountId() == null ^ this.getSharedAccountId() == null)
            return false;
        if (other.getSharedAccountId() != null && other.getSharedAccountId().equals(this.getSharedAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSharedAccountId() == null) ? 0 : getSharedAccountId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteImagePermissionsRequest clone() {
        return (DeleteImagePermissionsRequest) super.clone();
    }

}
