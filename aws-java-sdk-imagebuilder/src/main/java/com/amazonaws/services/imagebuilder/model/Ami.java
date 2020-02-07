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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of an EC2 AMI.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/Ami" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ami implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Region of the EC2 AMI.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The AMI ID of the EC2 AMI.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The name of the EC2 AMI.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the EC2 AMI.
     * </p>
     */
    private String description;

    private ImageState state;

    /**
     * <p>
     * The AWS Region of the EC2 AMI.
     * </p>
     * 
     * @param region
     *        The AWS Region of the EC2 AMI.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region of the EC2 AMI.
     * </p>
     * 
     * @return The AWS Region of the EC2 AMI.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region of the EC2 AMI.
     * </p>
     * 
     * @param region
     *        The AWS Region of the EC2 AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ami withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The AMI ID of the EC2 AMI.
     * </p>
     * 
     * @param image
     *        The AMI ID of the EC2 AMI.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The AMI ID of the EC2 AMI.
     * </p>
     * 
     * @return The AMI ID of the EC2 AMI.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The AMI ID of the EC2 AMI.
     * </p>
     * 
     * @param image
     *        The AMI ID of the EC2 AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ami withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The name of the EC2 AMI.
     * </p>
     * 
     * @param name
     *        The name of the EC2 AMI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the EC2 AMI.
     * </p>
     * 
     * @return The name of the EC2 AMI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the EC2 AMI.
     * </p>
     * 
     * @param name
     *        The name of the EC2 AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ami withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the EC2 AMI.
     * </p>
     * 
     * @param description
     *        The description of the EC2 AMI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the EC2 AMI.
     * </p>
     * 
     * @return The description of the EC2 AMI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the EC2 AMI.
     * </p>
     * 
     * @param description
     *        The description of the EC2 AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ami withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param state
     */

    public void setState(ImageState state) {
        this.state = state;
    }

    /**
     * @return
     */

    public ImageState getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ami withState(ImageState state) {
        setState(state);
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ami == false)
            return false;
        Ami other = (Ami) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Ami clone() {
        try {
            return (Ami) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.AmiMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
