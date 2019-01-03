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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A custom AMI available to platforms.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CustomAmi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomAmi implements Serializable, Cloneable {

    /**
     * <p>
     * The type of virtualization used to create the custom AMI.
     * </p>
     */
    private String virtualizationType;
    /**
     * <p>
     * THe ID of the image used to create the custom AMI.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The type of virtualization used to create the custom AMI.
     * </p>
     * 
     * @param virtualizationType
     *        The type of virtualization used to create the custom AMI.
     */

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization used to create the custom AMI.
     * </p>
     * 
     * @return The type of virtualization used to create the custom AMI.
     */

    public String getVirtualizationType() {
        return this.virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization used to create the custom AMI.
     * </p>
     * 
     * @param virtualizationType
     *        The type of virtualization used to create the custom AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAmi withVirtualizationType(String virtualizationType) {
        setVirtualizationType(virtualizationType);
        return this;
    }

    /**
     * <p>
     * THe ID of the image used to create the custom AMI.
     * </p>
     * 
     * @param imageId
     *        THe ID of the image used to create the custom AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * THe ID of the image used to create the custom AMI.
     * </p>
     * 
     * @return THe ID of the image used to create the custom AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * THe ID of the image used to create the custom AMI.
     * </p>
     * 
     * @param imageId
     *        THe ID of the image used to create the custom AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAmi withImageId(String imageId) {
        setImageId(imageId);
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
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: ").append(getVirtualizationType()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomAmi == false)
            return false;
        CustomAmi other = (CustomAmi) obj;
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        return hashCode;
    }

    @Override
    public CustomAmi clone() {
        try {
            return (CustomAmi) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
