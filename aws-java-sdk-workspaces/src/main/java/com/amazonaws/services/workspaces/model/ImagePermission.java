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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the AWS accounts that have been granted permission to use a shared image. For more information about
 * sharing images, see <a href="https://docs.aws.amazon.com/workspaces/latest/adminguide/share-custom-image.html"> Share
 * or Unshare a Custom WorkSpaces Image</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImagePermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImagePermission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the AWS account that an image has been shared with.
     * </p>
     */
    private String sharedAccountId;

    /**
     * <p>
     * The identifier of the AWS account that an image has been shared with.
     * </p>
     * 
     * @param sharedAccountId
     *        The identifier of the AWS account that an image has been shared with.
     */

    public void setSharedAccountId(String sharedAccountId) {
        this.sharedAccountId = sharedAccountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that an image has been shared with.
     * </p>
     * 
     * @return The identifier of the AWS account that an image has been shared with.
     */

    public String getSharedAccountId() {
        return this.sharedAccountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that an image has been shared with.
     * </p>
     * 
     * @param sharedAccountId
     *        The identifier of the AWS account that an image has been shared with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePermission withSharedAccountId(String sharedAccountId) {
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

        if (obj instanceof ImagePermission == false)
            return false;
        ImagePermission other = (ImagePermission) obj;
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

        hashCode = prime * hashCode + ((getSharedAccountId() == null) ? 0 : getSharedAccountId().hashCode());
        return hashCode;
    }

    @Override
    public ImagePermission clone() {
        try {
            return (ImagePermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.ImagePermissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
