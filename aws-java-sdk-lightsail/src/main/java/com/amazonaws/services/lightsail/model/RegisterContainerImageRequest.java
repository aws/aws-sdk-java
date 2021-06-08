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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RegisterContainerImage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterContainerImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container service for which to register a container image.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The label for the container image when it's registered to the container service.
     * </p>
     * <p>
     * Use a descriptive label that you can use to track the different versions of your registered container images.
     * </p>
     * <p>
     * Use the <code>GetContainerImages</code> action to return the container images registered to a Lightsail container
     * service. The label is the <code>&lt;imagelabel&gt;</code> portion of the following image name example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>:container-service-1.&lt;imagelabel&gt;.1</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the name of your container service is <code>mycontainerservice</code>, and the label that you specify is
     * <code>mystaticwebsite</code>, then the name of the registered container image will be
     * <code>:mycontainerservice.mystaticwebsite.1</code>.
     * </p>
     * <p>
     * The number at the end of these image name examples represents the version of the registered container image. If
     * you push and register another container image to the same Lightsail container service, with the same label, then
     * the version number for the new registered container image will be <code>2</code>. If you push and register
     * another container image, the version number will be <code>3</code>, and so on.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The digest of the container image to be registered.
     * </p>
     */
    private String digest;

    /**
     * <p>
     * The name of the container service for which to register a container image.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to register a container image.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to register a container image.
     * </p>
     * 
     * @return The name of the container service for which to register a container image.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to register a container image.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to register a container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerImageRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The label for the container image when it's registered to the container service.
     * </p>
     * <p>
     * Use a descriptive label that you can use to track the different versions of your registered container images.
     * </p>
     * <p>
     * Use the <code>GetContainerImages</code> action to return the container images registered to a Lightsail container
     * service. The label is the <code>&lt;imagelabel&gt;</code> portion of the following image name example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>:container-service-1.&lt;imagelabel&gt;.1</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the name of your container service is <code>mycontainerservice</code>, and the label that you specify is
     * <code>mystaticwebsite</code>, then the name of the registered container image will be
     * <code>:mycontainerservice.mystaticwebsite.1</code>.
     * </p>
     * <p>
     * The number at the end of these image name examples represents the version of the registered container image. If
     * you push and register another container image to the same Lightsail container service, with the same label, then
     * the version number for the new registered container image will be <code>2</code>. If you push and register
     * another container image, the version number will be <code>3</code>, and so on.
     * </p>
     * 
     * @param label
     *        The label for the container image when it's registered to the container service.</p>
     *        <p>
     *        Use a descriptive label that you can use to track the different versions of your registered container
     *        images.
     *        </p>
     *        <p>
     *        Use the <code>GetContainerImages</code> action to return the container images registered to a Lightsail
     *        container service. The label is the <code>&lt;imagelabel&gt;</code> portion of the following image name
     *        example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>:container-service-1.&lt;imagelabel&gt;.1</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the name of your container service is <code>mycontainerservice</code>, and the label that you specify
     *        is <code>mystaticwebsite</code>, then the name of the registered container image will be
     *        <code>:mycontainerservice.mystaticwebsite.1</code>.
     *        </p>
     *        <p>
     *        The number at the end of these image name examples represents the version of the registered container
     *        image. If you push and register another container image to the same Lightsail container service, with the
     *        same label, then the version number for the new registered container image will be <code>2</code>. If you
     *        push and register another container image, the version number will be <code>3</code>, and so on.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label for the container image when it's registered to the container service.
     * </p>
     * <p>
     * Use a descriptive label that you can use to track the different versions of your registered container images.
     * </p>
     * <p>
     * Use the <code>GetContainerImages</code> action to return the container images registered to a Lightsail container
     * service. The label is the <code>&lt;imagelabel&gt;</code> portion of the following image name example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>:container-service-1.&lt;imagelabel&gt;.1</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the name of your container service is <code>mycontainerservice</code>, and the label that you specify is
     * <code>mystaticwebsite</code>, then the name of the registered container image will be
     * <code>:mycontainerservice.mystaticwebsite.1</code>.
     * </p>
     * <p>
     * The number at the end of these image name examples represents the version of the registered container image. If
     * you push and register another container image to the same Lightsail container service, with the same label, then
     * the version number for the new registered container image will be <code>2</code>. If you push and register
     * another container image, the version number will be <code>3</code>, and so on.
     * </p>
     * 
     * @return The label for the container image when it's registered to the container service.</p>
     *         <p>
     *         Use a descriptive label that you can use to track the different versions of your registered container
     *         images.
     *         </p>
     *         <p>
     *         Use the <code>GetContainerImages</code> action to return the container images registered to a Lightsail
     *         container service. The label is the <code>&lt;imagelabel&gt;</code> portion of the following image name
     *         example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>:container-service-1.&lt;imagelabel&gt;.1</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the name of your container service is <code>mycontainerservice</code>, and the label that you specify
     *         is <code>mystaticwebsite</code>, then the name of the registered container image will be
     *         <code>:mycontainerservice.mystaticwebsite.1</code>.
     *         </p>
     *         <p>
     *         The number at the end of these image name examples represents the version of the registered container
     *         image. If you push and register another container image to the same Lightsail container service, with the
     *         same label, then the version number for the new registered container image will be <code>2</code>. If you
     *         push and register another container image, the version number will be <code>3</code>, and so on.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label for the container image when it's registered to the container service.
     * </p>
     * <p>
     * Use a descriptive label that you can use to track the different versions of your registered container images.
     * </p>
     * <p>
     * Use the <code>GetContainerImages</code> action to return the container images registered to a Lightsail container
     * service. The label is the <code>&lt;imagelabel&gt;</code> portion of the following image name example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>:container-service-1.&lt;imagelabel&gt;.1</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the name of your container service is <code>mycontainerservice</code>, and the label that you specify is
     * <code>mystaticwebsite</code>, then the name of the registered container image will be
     * <code>:mycontainerservice.mystaticwebsite.1</code>.
     * </p>
     * <p>
     * The number at the end of these image name examples represents the version of the registered container image. If
     * you push and register another container image to the same Lightsail container service, with the same label, then
     * the version number for the new registered container image will be <code>2</code>. If you push and register
     * another container image, the version number will be <code>3</code>, and so on.
     * </p>
     * 
     * @param label
     *        The label for the container image when it's registered to the container service.</p>
     *        <p>
     *        Use a descriptive label that you can use to track the different versions of your registered container
     *        images.
     *        </p>
     *        <p>
     *        Use the <code>GetContainerImages</code> action to return the container images registered to a Lightsail
     *        container service. The label is the <code>&lt;imagelabel&gt;</code> portion of the following image name
     *        example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>:container-service-1.&lt;imagelabel&gt;.1</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the name of your container service is <code>mycontainerservice</code>, and the label that you specify
     *        is <code>mystaticwebsite</code>, then the name of the registered container image will be
     *        <code>:mycontainerservice.mystaticwebsite.1</code>.
     *        </p>
     *        <p>
     *        The number at the end of these image name examples represents the version of the registered container
     *        image. If you push and register another container image to the same Lightsail container service, with the
     *        same label, then the version number for the new registered container image will be <code>2</code>. If you
     *        push and register another container image, the version number will be <code>3</code>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerImageRequest withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The digest of the container image to be registered.
     * </p>
     * 
     * @param digest
     *        The digest of the container image to be registered.
     */

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * <p>
     * The digest of the container image to be registered.
     * </p>
     * 
     * @return The digest of the container image to be registered.
     */

    public String getDigest() {
        return this.digest;
    }

    /**
     * <p>
     * The digest of the container image to be registered.
     * </p>
     * 
     * @param digest
     *        The digest of the container image to be registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterContainerImageRequest withDigest(String digest) {
        setDigest(digest);
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getDigest() != null)
            sb.append("Digest: ").append(getDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterContainerImageRequest == false)
            return false;
        RegisterContainerImageRequest other = (RegisterContainerImageRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getDigest() == null ^ this.getDigest() == null)
            return false;
        if (other.getDigest() != null && other.getDigest().equals(this.getDigest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getDigest() == null) ? 0 : getDigest().hashCode());
        return hashCode;
    }

    @Override
    public RegisterContainerImageRequest clone() {
        return (RegisterContainerImageRequest) super.clone();
    }

}
