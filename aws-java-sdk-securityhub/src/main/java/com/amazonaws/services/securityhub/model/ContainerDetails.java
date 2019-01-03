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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container details related to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ContainerDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container related to a finding.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the image related to a finding.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The name of the image related to a finding.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The date/time that the container was started.
     * </p>
     */
    private String launchedAt;

    /**
     * <p>
     * The name of the container related to a finding.
     * </p>
     * 
     * @param name
     *        The name of the container related to a finding.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container related to a finding.
     * </p>
     * 
     * @return The name of the container related to a finding.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container related to a finding.
     * </p>
     * 
     * @param name
     *        The name of the container related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the image related to a finding.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image related to a finding.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the image related to a finding.
     * </p>
     * 
     * @return The identifier of the image related to a finding.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the image related to a finding.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The name of the image related to a finding.
     * </p>
     * 
     * @param imageName
     *        The name of the image related to a finding.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image related to a finding.
     * </p>
     * 
     * @return The name of the image related to a finding.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image related to a finding.
     * </p>
     * 
     * @param imageName
     *        The name of the image related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The date/time that the container was started.
     * </p>
     * 
     * @param launchedAt
     *        The date/time that the container was started.
     */

    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * The date/time that the container was started.
     * </p>
     * 
     * @return The date/time that the container was started.
     */

    public String getLaunchedAt() {
        return this.launchedAt;
    }

    /**
     * <p>
     * The date/time that the container was started.
     * </p>
     * 
     * @param launchedAt
     *        The date/time that the container was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDetails withLaunchedAt(String launchedAt) {
        setLaunchedAt(launchedAt);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: ").append(getLaunchedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDetails == false)
            return false;
        ContainerDetails other = (ContainerDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        return hashCode;
    }

    @Override
    public ContainerDetails clone() {
        try {
            return (ContainerDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ContainerDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
