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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A custom SageMaker image. For more information, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html">Bring your own SageMaker image</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CustomImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the CustomImage. Must be unique to your account.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The version number of the CustomImage.
     * </p>
     */
    private Integer imageVersionNumber;
    /**
     * <p>
     * The name of the AppImageConfig.
     * </p>
     */
    private String appImageConfigName;

    /**
     * <p>
     * The name of the CustomImage. Must be unique to your account.
     * </p>
     * 
     * @param imageName
     *        The name of the CustomImage. Must be unique to your account.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the CustomImage. Must be unique to your account.
     * </p>
     * 
     * @return The name of the CustomImage. Must be unique to your account.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the CustomImage. Must be unique to your account.
     * </p>
     * 
     * @param imageName
     *        The name of the CustomImage. Must be unique to your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomImage withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The version number of the CustomImage.
     * </p>
     * 
     * @param imageVersionNumber
     *        The version number of the CustomImage.
     */

    public void setImageVersionNumber(Integer imageVersionNumber) {
        this.imageVersionNumber = imageVersionNumber;
    }

    /**
     * <p>
     * The version number of the CustomImage.
     * </p>
     * 
     * @return The version number of the CustomImage.
     */

    public Integer getImageVersionNumber() {
        return this.imageVersionNumber;
    }

    /**
     * <p>
     * The version number of the CustomImage.
     * </p>
     * 
     * @param imageVersionNumber
     *        The version number of the CustomImage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomImage withImageVersionNumber(Integer imageVersionNumber) {
        setImageVersionNumber(imageVersionNumber);
        return this;
    }

    /**
     * <p>
     * The name of the AppImageConfig.
     * </p>
     * 
     * @param appImageConfigName
     *        The name of the AppImageConfig.
     */

    public void setAppImageConfigName(String appImageConfigName) {
        this.appImageConfigName = appImageConfigName;
    }

    /**
     * <p>
     * The name of the AppImageConfig.
     * </p>
     * 
     * @return The name of the AppImageConfig.
     */

    public String getAppImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * <p>
     * The name of the AppImageConfig.
     * </p>
     * 
     * @param appImageConfigName
     *        The name of the AppImageConfig.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomImage withAppImageConfigName(String appImageConfigName) {
        setAppImageConfigName(appImageConfigName);
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
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getImageVersionNumber() != null)
            sb.append("ImageVersionNumber: ").append(getImageVersionNumber()).append(",");
        if (getAppImageConfigName() != null)
            sb.append("AppImageConfigName: ").append(getAppImageConfigName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomImage == false)
            return false;
        CustomImage other = (CustomImage) obj;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getImageVersionNumber() == null ^ this.getImageVersionNumber() == null)
            return false;
        if (other.getImageVersionNumber() != null && other.getImageVersionNumber().equals(this.getImageVersionNumber()) == false)
            return false;
        if (other.getAppImageConfigName() == null ^ this.getAppImageConfigName() == null)
            return false;
        if (other.getAppImageConfigName() != null && other.getAppImageConfigName().equals(this.getAppImageConfigName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getImageVersionNumber() == null) ? 0 : getImageVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getAppImageConfigName() == null) ? 0 : getAppImageConfigName().hashCode());
        return hashCode;
    }

    @Override
    public CustomImage clone() {
        try {
            return (CustomImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CustomImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
