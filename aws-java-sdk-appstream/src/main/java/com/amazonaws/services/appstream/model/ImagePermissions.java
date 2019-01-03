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
 * Describes the permissions for an image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ImagePermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImagePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the image can be used for a fleet.
     * </p>
     */
    private Boolean allowFleet;
    /**
     * <p>
     * Indicates whether the image can be used for an image builder.
     * </p>
     */
    private Boolean allowImageBuilder;

    /**
     * <p>
     * Indicates whether the image can be used for a fleet.
     * </p>
     * 
     * @param allowFleet
     *        Indicates whether the image can be used for a fleet.
     */

    public void setAllowFleet(Boolean allowFleet) {
        this.allowFleet = allowFleet;
    }

    /**
     * <p>
     * Indicates whether the image can be used for a fleet.
     * </p>
     * 
     * @return Indicates whether the image can be used for a fleet.
     */

    public Boolean getAllowFleet() {
        return this.allowFleet;
    }

    /**
     * <p>
     * Indicates whether the image can be used for a fleet.
     * </p>
     * 
     * @param allowFleet
     *        Indicates whether the image can be used for a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePermissions withAllowFleet(Boolean allowFleet) {
        setAllowFleet(allowFleet);
        return this;
    }

    /**
     * <p>
     * Indicates whether the image can be used for a fleet.
     * </p>
     * 
     * @return Indicates whether the image can be used for a fleet.
     */

    public Boolean isAllowFleet() {
        return this.allowFleet;
    }

    /**
     * <p>
     * Indicates whether the image can be used for an image builder.
     * </p>
     * 
     * @param allowImageBuilder
     *        Indicates whether the image can be used for an image builder.
     */

    public void setAllowImageBuilder(Boolean allowImageBuilder) {
        this.allowImageBuilder = allowImageBuilder;
    }

    /**
     * <p>
     * Indicates whether the image can be used for an image builder.
     * </p>
     * 
     * @return Indicates whether the image can be used for an image builder.
     */

    public Boolean getAllowImageBuilder() {
        return this.allowImageBuilder;
    }

    /**
     * <p>
     * Indicates whether the image can be used for an image builder.
     * </p>
     * 
     * @param allowImageBuilder
     *        Indicates whether the image can be used for an image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePermissions withAllowImageBuilder(Boolean allowImageBuilder) {
        setAllowImageBuilder(allowImageBuilder);
        return this;
    }

    /**
     * <p>
     * Indicates whether the image can be used for an image builder.
     * </p>
     * 
     * @return Indicates whether the image can be used for an image builder.
     */

    public Boolean isAllowImageBuilder() {
        return this.allowImageBuilder;
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
        if (getAllowFleet() != null)
            sb.append("AllowFleet: ").append(getAllowFleet()).append(",");
        if (getAllowImageBuilder() != null)
            sb.append("AllowImageBuilder: ").append(getAllowImageBuilder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImagePermissions == false)
            return false;
        ImagePermissions other = (ImagePermissions) obj;
        if (other.getAllowFleet() == null ^ this.getAllowFleet() == null)
            return false;
        if (other.getAllowFleet() != null && other.getAllowFleet().equals(this.getAllowFleet()) == false)
            return false;
        if (other.getAllowImageBuilder() == null ^ this.getAllowImageBuilder() == null)
            return false;
        if (other.getAllowImageBuilder() != null && other.getAllowImageBuilder().equals(this.getAllowImageBuilder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowFleet() == null) ? 0 : getAllowFleet().hashCode());
        hashCode = prime * hashCode + ((getAllowImageBuilder() == null) ? 0 : getAllowImageBuilder().hashCode());
        return hashCode;
    }

    @Override
    public ImagePermissions clone() {
        try {
            return (ImagePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ImagePermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
