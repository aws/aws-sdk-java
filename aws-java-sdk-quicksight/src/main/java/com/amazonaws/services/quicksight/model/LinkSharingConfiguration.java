/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration of a shareable link to the dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LinkSharingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinkSharingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that contains the permissions of a shareable link.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;

    /**
     * <p>
     * A structure that contains the permissions of a shareable link.
     * </p>
     * 
     * @return A structure that contains the permissions of a shareable link.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A structure that contains the permissions of a shareable link.
     * </p>
     * 
     * @param permissions
     *        A structure that contains the permissions of a shareable link.
     */

    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A structure that contains the permissions of a shareable link.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A structure that contains the permissions of a shareable link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinkSharingConfiguration withPermissions(ResourcePermission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<ResourcePermission>(permissions.length));
        }
        for (ResourcePermission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that contains the permissions of a shareable link.
     * </p>
     * 
     * @param permissions
     *        A structure that contains the permissions of a shareable link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LinkSharingConfiguration withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
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
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LinkSharingConfiguration == false)
            return false;
        LinkSharingConfiguration other = (LinkSharingConfiguration) obj;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        return hashCode;
    }

    @Override
    public LinkSharingConfiguration clone() {
        try {
            return (LinkSharingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LinkSharingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
