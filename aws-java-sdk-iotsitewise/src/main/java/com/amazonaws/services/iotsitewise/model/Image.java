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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an image that is one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An image file. Choose this option to upload a new image.
 * </p>
 * </li>
 * <li>
 * <p>
 * The ID of an existing image. Choose this option to keep an existing image.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Image" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an existing image. Specify this parameter to keep an existing image.
     * </p>
     */
    private String id;

    private ImageFile file;

    /**
     * <p>
     * The ID of an existing image. Specify this parameter to keep an existing image.
     * </p>
     * 
     * @param id
     *        The ID of an existing image. Specify this parameter to keep an existing image.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of an existing image. Specify this parameter to keep an existing image.
     * </p>
     * 
     * @return The ID of an existing image. Specify this parameter to keep an existing image.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of an existing image. Specify this parameter to keep an existing image.
     * </p>
     * 
     * @param id
     *        The ID of an existing image. Specify this parameter to keep an existing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param file
     */

    public void setFile(ImageFile file) {
        this.file = file;
    }

    /**
     * @return
     */

    public ImageFile getFile() {
        return this.file;
    }

    /**
     * @param file
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withFile(ImageFile file) {
        setFile(file);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getFile() != null)
            sb.append("File: ").append(getFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        return hashCode;
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
