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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RegisterContainerImage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterContainerImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ContainerImage containerImage;

    /**
     * @param containerImage
     */

    public void setContainerImage(ContainerImage containerImage) {
        this.containerImage = containerImage;
    }

    /**
     * @return
     */

    public ContainerImage getContainerImage() {
        return this.containerImage;
    }

    /**
     * @param containerImage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerImageResult withContainerImage(ContainerImage containerImage) {
        setContainerImage(containerImage);
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
        if (getContainerImage() != null)
            sb.append("ContainerImage: ").append(getContainerImage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterContainerImageResult == false)
            return false;
        RegisterContainerImageResult other = (RegisterContainerImageResult) obj;
        if (other.getContainerImage() == null ^ this.getContainerImage() == null)
            return false;
        if (other.getContainerImage() != null && other.getContainerImage().equals(this.getContainerImage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerImage() == null) ? 0 : getContainerImage().hashCode());
        return hashCode;
    }

    @Override
    public RegisterContainerImageResult clone() {
        try {
            return (RegisterContainerImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
