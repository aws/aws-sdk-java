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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the permissions that are available to the specified AWS account for a shared image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/SharedImagePermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SharedImagePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit identifier of the AWS account with which the image is shared.
     * </p>
     */
    private String sharedAccountId;
    /**
     * <p>
     * Describes the permissions for a shared image.
     * </p>
     */
    private ImagePermissions imagePermissions;

    /**
     * <p>
     * The 12-digit identifier of the AWS account with which the image is shared.
     * </p>
     * 
     * @param sharedAccountId
     *        The 12-digit identifier of the AWS account with which the image is shared.
     */

    public void setSharedAccountId(String sharedAccountId) {
        this.sharedAccountId = sharedAccountId;
    }

    /**
     * <p>
     * The 12-digit identifier of the AWS account with which the image is shared.
     * </p>
     * 
     * @return The 12-digit identifier of the AWS account with which the image is shared.
     */

    public String getSharedAccountId() {
        return this.sharedAccountId;
    }

    /**
     * <p>
     * The 12-digit identifier of the AWS account with which the image is shared.
     * </p>
     * 
     * @param sharedAccountId
     *        The 12-digit identifier of the AWS account with which the image is shared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedImagePermissions withSharedAccountId(String sharedAccountId) {
        setSharedAccountId(sharedAccountId);
        return this;
    }

    /**
     * <p>
     * Describes the permissions for a shared image.
     * </p>
     * 
     * @param imagePermissions
     *        Describes the permissions for a shared image.
     */

    public void setImagePermissions(ImagePermissions imagePermissions) {
        this.imagePermissions = imagePermissions;
    }

    /**
     * <p>
     * Describes the permissions for a shared image.
     * </p>
     * 
     * @return Describes the permissions for a shared image.
     */

    public ImagePermissions getImagePermissions() {
        return this.imagePermissions;
    }

    /**
     * <p>
     * Describes the permissions for a shared image.
     * </p>
     * 
     * @param imagePermissions
     *        Describes the permissions for a shared image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SharedImagePermissions withImagePermissions(ImagePermissions imagePermissions) {
        setImagePermissions(imagePermissions);
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
        if (getSharedAccountId() != null)
            sb.append("SharedAccountId: ").append(getSharedAccountId()).append(",");
        if (getImagePermissions() != null)
            sb.append("ImagePermissions: ").append(getImagePermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharedImagePermissions == false)
            return false;
        SharedImagePermissions other = (SharedImagePermissions) obj;
        if (other.getSharedAccountId() == null ^ this.getSharedAccountId() == null)
            return false;
        if (other.getSharedAccountId() != null && other.getSharedAccountId().equals(this.getSharedAccountId()) == false)
            return false;
        if (other.getImagePermissions() == null ^ this.getImagePermissions() == null)
            return false;
        if (other.getImagePermissions() != null && other.getImagePermissions().equals(this.getImagePermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSharedAccountId() == null) ? 0 : getSharedAccountId().hashCode());
        hashCode = prime * hashCode + ((getImagePermissions() == null) ? 0 : getImagePermissions().hashCode());
        return hashCode;
    }

    @Override
    public SharedImagePermissions clone() {
        try {
            return (SharedImagePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.SharedImagePermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
