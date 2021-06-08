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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container encapsulates the runtime environment for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/Container" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Container implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Containers and container images are Region-specific. This is the Region context for the container.
     * </p>
     */
    private String region;
    /**
     * <p>
     * A list of URIs for containers created in the context Region.
     * </p>
     */
    private java.util.List<String> imageUris;

    /**
     * <p>
     * Containers and container images are Region-specific. This is the Region context for the container.
     * </p>
     * 
     * @param region
     *        Containers and container images are Region-specific. This is the Region context for the container.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Containers and container images are Region-specific. This is the Region context for the container.
     * </p>
     * 
     * @return Containers and container images are Region-specific. This is the Region context for the container.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Containers and container images are Region-specific. This is the Region context for the container.
     * </p>
     * 
     * @param region
     *        Containers and container images are Region-specific. This is the Region context for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * A list of URIs for containers created in the context Region.
     * </p>
     * 
     * @return A list of URIs for containers created in the context Region.
     */

    public java.util.List<String> getImageUris() {
        return imageUris;
    }

    /**
     * <p>
     * A list of URIs for containers created in the context Region.
     * </p>
     * 
     * @param imageUris
     *        A list of URIs for containers created in the context Region.
     */

    public void setImageUris(java.util.Collection<String> imageUris) {
        if (imageUris == null) {
            this.imageUris = null;
            return;
        }

        this.imageUris = new java.util.ArrayList<String>(imageUris);
    }

    /**
     * <p>
     * A list of URIs for containers created in the context Region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageUris(java.util.Collection)} or {@link #withImageUris(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageUris
     *        A list of URIs for containers created in the context Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withImageUris(String... imageUris) {
        if (this.imageUris == null) {
            setImageUris(new java.util.ArrayList<String>(imageUris.length));
        }
        for (String ele : imageUris) {
            this.imageUris.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of URIs for containers created in the context Region.
     * </p>
     * 
     * @param imageUris
     *        A list of URIs for containers created in the context Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withImageUris(java.util.Collection<String> imageUris) {
        setImageUris(imageUris);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getImageUris() != null)
            sb.append("ImageUris: ").append(getImageUris());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Container == false)
            return false;
        Container other = (Container) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getImageUris() == null ^ this.getImageUris() == null)
            return false;
        if (other.getImageUris() != null && other.getImageUris().equals(this.getImageUris()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getImageUris() == null) ? 0 : getImageUris().hashCode());
        return hashCode;
    }

    @Override
    public Container clone() {
        try {
            return (Container) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ContainerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
