/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration to run a processing job in a specified container image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AppSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container image to be run by the processing job.
     * </p>
     */
    private String imageUri;
    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     */
    private java.util.List<String> containerEntrypoint;
    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     */
    private java.util.List<String> containerArguments;

    /**
     * <p>
     * The container image to be run by the processing job.
     * </p>
     * 
     * @param imageUri
     *        The container image to be run by the processing job.
     */

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    /**
     * <p>
     * The container image to be run by the processing job.
     * </p>
     * 
     * @return The container image to be run by the processing job.
     */

    public String getImageUri() {
        return this.imageUri;
    }

    /**
     * <p>
     * The container image to be run by the processing job.
     * </p>
     * 
     * @param imageUri
     *        The container image to be run by the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSpecification withImageUri(String imageUri) {
        setImageUri(imageUri);
        return this;
    }

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     * 
     * @return The entrypoint for a container used to run a processing job.
     */

    public java.util.List<String> getContainerEntrypoint() {
        return containerEntrypoint;
    }

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     * 
     * @param containerEntrypoint
     *        The entrypoint for a container used to run a processing job.
     */

    public void setContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        if (containerEntrypoint == null) {
            this.containerEntrypoint = null;
            return;
        }

        this.containerEntrypoint = new java.util.ArrayList<String>(containerEntrypoint);
    }

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerEntrypoint(java.util.Collection)} or {@link #withContainerEntrypoint(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param containerEntrypoint
     *        The entrypoint for a container used to run a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSpecification withContainerEntrypoint(String... containerEntrypoint) {
        if (this.containerEntrypoint == null) {
            setContainerEntrypoint(new java.util.ArrayList<String>(containerEntrypoint.length));
        }
        for (String ele : containerEntrypoint) {
            this.containerEntrypoint.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entrypoint for a container used to run a processing job.
     * </p>
     * 
     * @param containerEntrypoint
     *        The entrypoint for a container used to run a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSpecification withContainerEntrypoint(java.util.Collection<String> containerEntrypoint) {
        setContainerEntrypoint(containerEntrypoint);
        return this;
    }

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     * 
     * @return The arguments for a container used to run a processing job.
     */

    public java.util.List<String> getContainerArguments() {
        return containerArguments;
    }

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for a container used to run a processing job.
     */

    public void setContainerArguments(java.util.Collection<String> containerArguments) {
        if (containerArguments == null) {
            this.containerArguments = null;
            return;
        }

        this.containerArguments = new java.util.ArrayList<String>(containerArguments);
    }

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerArguments(java.util.Collection)} or {@link #withContainerArguments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for a container used to run a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSpecification withContainerArguments(String... containerArguments) {
        if (this.containerArguments == null) {
            setContainerArguments(new java.util.ArrayList<String>(containerArguments.length));
        }
        for (String ele : containerArguments) {
            this.containerArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The arguments for a container used to run a processing job.
     * </p>
     * 
     * @param containerArguments
     *        The arguments for a container used to run a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppSpecification withContainerArguments(java.util.Collection<String> containerArguments) {
        setContainerArguments(containerArguments);
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
        if (getImageUri() != null)
            sb.append("ImageUri: ").append(getImageUri()).append(",");
        if (getContainerEntrypoint() != null)
            sb.append("ContainerEntrypoint: ").append(getContainerEntrypoint()).append(",");
        if (getContainerArguments() != null)
            sb.append("ContainerArguments: ").append(getContainerArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppSpecification == false)
            return false;
        AppSpecification other = (AppSpecification) obj;
        if (other.getImageUri() == null ^ this.getImageUri() == null)
            return false;
        if (other.getImageUri() != null && other.getImageUri().equals(this.getImageUri()) == false)
            return false;
        if (other.getContainerEntrypoint() == null ^ this.getContainerEntrypoint() == null)
            return false;
        if (other.getContainerEntrypoint() != null && other.getContainerEntrypoint().equals(this.getContainerEntrypoint()) == false)
            return false;
        if (other.getContainerArguments() == null ^ this.getContainerArguments() == null)
            return false;
        if (other.getContainerArguments() != null && other.getContainerArguments().equals(this.getContainerArguments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageUri() == null) ? 0 : getImageUri().hashCode());
        hashCode = prime * hashCode + ((getContainerEntrypoint() == null) ? 0 : getContainerEntrypoint().hashCode());
        hashCode = prime * hashCode + ((getContainerArguments() == null) ? 0 : getContainerArguments().hashCode());
        return hashCode;
    }

    @Override
    public AppSpecification clone() {
        try {
            return (AppSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AppSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
