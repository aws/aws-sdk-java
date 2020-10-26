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
 * The KernelGateway app settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/KernelGatewayAppSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KernelGatewayAppSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * KernelGateway app.
     * </p>
     */
    private ResourceSpec defaultResourceSpec;
    /**
     * <p>
     * A list of custom images that are configured to run as a KernelGateway app.
     * </p>
     */
    private java.util.List<CustomImage> customImages;

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * KernelGateway app.
     * </p>
     * 
     * @param defaultResourceSpec
     *        The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *        KernelGateway app.
     */

    public void setDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * KernelGateway app.
     * </p>
     * 
     * @return The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *         KernelGateway app.
     */

    public ResourceSpec getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    /**
     * <p>
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     * KernelGateway app.
     * </p>
     * 
     * @param defaultResourceSpec
     *        The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the
     *        KernelGateway app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayAppSettings withDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        setDefaultResourceSpec(defaultResourceSpec);
        return this;
    }

    /**
     * <p>
     * A list of custom images that are configured to run as a KernelGateway app.
     * </p>
     * 
     * @return A list of custom images that are configured to run as a KernelGateway app.
     */

    public java.util.List<CustomImage> getCustomImages() {
        return customImages;
    }

    /**
     * <p>
     * A list of custom images that are configured to run as a KernelGateway app.
     * </p>
     * 
     * @param customImages
     *        A list of custom images that are configured to run as a KernelGateway app.
     */

    public void setCustomImages(java.util.Collection<CustomImage> customImages) {
        if (customImages == null) {
            this.customImages = null;
            return;
        }

        this.customImages = new java.util.ArrayList<CustomImage>(customImages);
    }

    /**
     * <p>
     * A list of custom images that are configured to run as a KernelGateway app.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomImages(java.util.Collection)} or {@link #withCustomImages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customImages
     *        A list of custom images that are configured to run as a KernelGateway app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayAppSettings withCustomImages(CustomImage... customImages) {
        if (this.customImages == null) {
            setCustomImages(new java.util.ArrayList<CustomImage>(customImages.length));
        }
        for (CustomImage ele : customImages) {
            this.customImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of custom images that are configured to run as a KernelGateway app.
     * </p>
     * 
     * @param customImages
     *        A list of custom images that are configured to run as a KernelGateway app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KernelGatewayAppSettings withCustomImages(java.util.Collection<CustomImage> customImages) {
        setCustomImages(customImages);
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
        if (getDefaultResourceSpec() != null)
            sb.append("DefaultResourceSpec: ").append(getDefaultResourceSpec()).append(",");
        if (getCustomImages() != null)
            sb.append("CustomImages: ").append(getCustomImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KernelGatewayAppSettings == false)
            return false;
        KernelGatewayAppSettings other = (KernelGatewayAppSettings) obj;
        if (other.getDefaultResourceSpec() == null ^ this.getDefaultResourceSpec() == null)
            return false;
        if (other.getDefaultResourceSpec() != null && other.getDefaultResourceSpec().equals(this.getDefaultResourceSpec()) == false)
            return false;
        if (other.getCustomImages() == null ^ this.getCustomImages() == null)
            return false;
        if (other.getCustomImages() != null && other.getCustomImages().equals(this.getCustomImages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultResourceSpec() == null) ? 0 : getDefaultResourceSpec().hashCode());
        hashCode = prime * hashCode + ((getCustomImages() == null) ? 0 : getCustomImages().hashCode());
        return hashCode;
    }

    @Override
    public KernelGatewayAppSettings clone() {
        try {
            return (KernelGatewayAppSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.KernelGatewayAppSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
