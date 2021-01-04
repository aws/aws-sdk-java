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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteContainerImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteContainerImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container service for which to delete a registered container image.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The name of the container image to delete from the container service.
     * </p>
     * <p>
     * Use the <code>GetContainerImages</code> action to get the name of the container images that are registered to a
     * container service.
     * </p>
     * <note>
     * <p>
     * Container images sourced from your Lightsail container service, that are registered and stored on your service,
     * start with a colon (<code>:</code>). For example, <code>:container-service-1.mystaticwebsite.1</code>. Container
     * images sourced from a public registry like Docker Hub don't start with a colon. For example,
     * <code>nginx:latest</code> or <code>nginx</code>.
     * </p>
     * </note>
     */
    private String image;

    /**
     * <p>
     * The name of the container service for which to delete a registered container image.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to delete a registered container image.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to delete a registered container image.
     * </p>
     * 
     * @return The name of the container service for which to delete a registered container image.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to delete a registered container image.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to delete a registered container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteContainerImageRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The name of the container image to delete from the container service.
     * </p>
     * <p>
     * Use the <code>GetContainerImages</code> action to get the name of the container images that are registered to a
     * container service.
     * </p>
     * <note>
     * <p>
     * Container images sourced from your Lightsail container service, that are registered and stored on your service,
     * start with a colon (<code>:</code>). For example, <code>:container-service-1.mystaticwebsite.1</code>. Container
     * images sourced from a public registry like Docker Hub don't start with a colon. For example,
     * <code>nginx:latest</code> or <code>nginx</code>.
     * </p>
     * </note>
     * 
     * @param image
     *        The name of the container image to delete from the container service.</p>
     *        <p>
     *        Use the <code>GetContainerImages</code> action to get the name of the container images that are registered
     *        to a container service.
     *        </p>
     *        <note>
     *        <p>
     *        Container images sourced from your Lightsail container service, that are registered and stored on your
     *        service, start with a colon (<code>:</code>). For example,
     *        <code>:container-service-1.mystaticwebsite.1</code>. Container images sourced from a public registry like
     *        Docker Hub don't start with a colon. For example, <code>nginx:latest</code> or <code>nginx</code>.
     *        </p>
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The name of the container image to delete from the container service.
     * </p>
     * <p>
     * Use the <code>GetContainerImages</code> action to get the name of the container images that are registered to a
     * container service.
     * </p>
     * <note>
     * <p>
     * Container images sourced from your Lightsail container service, that are registered and stored on your service,
     * start with a colon (<code>:</code>). For example, <code>:container-service-1.mystaticwebsite.1</code>. Container
     * images sourced from a public registry like Docker Hub don't start with a colon. For example,
     * <code>nginx:latest</code> or <code>nginx</code>.
     * </p>
     * </note>
     * 
     * @return The name of the container image to delete from the container service.</p>
     *         <p>
     *         Use the <code>GetContainerImages</code> action to get the name of the container images that are
     *         registered to a container service.
     *         </p>
     *         <note>
     *         <p>
     *         Container images sourced from your Lightsail container service, that are registered and stored on your
     *         service, start with a colon (<code>:</code>). For example,
     *         <code>:container-service-1.mystaticwebsite.1</code>. Container images sourced from a public registry like
     *         Docker Hub don't start with a colon. For example, <code>nginx:latest</code> or <code>nginx</code>.
     *         </p>
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The name of the container image to delete from the container service.
     * </p>
     * <p>
     * Use the <code>GetContainerImages</code> action to get the name of the container images that are registered to a
     * container service.
     * </p>
     * <note>
     * <p>
     * Container images sourced from your Lightsail container service, that are registered and stored on your service,
     * start with a colon (<code>:</code>). For example, <code>:container-service-1.mystaticwebsite.1</code>. Container
     * images sourced from a public registry like Docker Hub don't start with a colon. For example,
     * <code>nginx:latest</code> or <code>nginx</code>.
     * </p>
     * </note>
     * 
     * @param image
     *        The name of the container image to delete from the container service.</p>
     *        <p>
     *        Use the <code>GetContainerImages</code> action to get the name of the container images that are registered
     *        to a container service.
     *        </p>
     *        <note>
     *        <p>
     *        Container images sourced from your Lightsail container service, that are registered and stored on your
     *        service, start with a colon (<code>:</code>). For example,
     *        <code>:container-service-1.mystaticwebsite.1</code>. Container images sourced from a public registry like
     *        Docker Hub don't start with a colon. For example, <code>nginx:latest</code> or <code>nginx</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteContainerImageRequest withImage(String image) {
        setImage(image);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteContainerImageRequest == false)
            return false;
        DeleteContainerImageRequest other = (DeleteContainerImageRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        return hashCode;
    }

    @Override
    public DeleteContainerImageRequest clone() {
        return (DeleteContainerImageRequest) super.clone();
    }

}
