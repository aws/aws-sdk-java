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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Response to GetFunctionConfiguration request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ImageConfigResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageConfigResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration values that override the container image Dockerfile.
     * </p>
     */
    private ImageConfig imageConfig;
    /**
     * <p>
     * Error response to GetFunctionConfiguration.
     * </p>
     */
    private ImageConfigError error;

    /**
     * <p>
     * Configuration values that override the container image Dockerfile.
     * </p>
     * 
     * @param imageConfig
     *        Configuration values that override the container image Dockerfile.
     */

    public void setImageConfig(ImageConfig imageConfig) {
        this.imageConfig = imageConfig;
    }

    /**
     * <p>
     * Configuration values that override the container image Dockerfile.
     * </p>
     * 
     * @return Configuration values that override the container image Dockerfile.
     */

    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    /**
     * <p>
     * Configuration values that override the container image Dockerfile.
     * </p>
     * 
     * @param imageConfig
     *        Configuration values that override the container image Dockerfile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfigResponse withImageConfig(ImageConfig imageConfig) {
        setImageConfig(imageConfig);
        return this;
    }

    /**
     * <p>
     * Error response to GetFunctionConfiguration.
     * </p>
     * 
     * @param error
     *        Error response to GetFunctionConfiguration.
     */

    public void setError(ImageConfigError error) {
        this.error = error;
    }

    /**
     * <p>
     * Error response to GetFunctionConfiguration.
     * </p>
     * 
     * @return Error response to GetFunctionConfiguration.
     */

    public ImageConfigError getError() {
        return this.error;
    }

    /**
     * <p>
     * Error response to GetFunctionConfiguration.
     * </p>
     * 
     * @param error
     *        Error response to GetFunctionConfiguration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageConfigResponse withError(ImageConfigError error) {
        setError(error);
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
        if (getImageConfig() != null)
            sb.append("ImageConfig: ").append(getImageConfig()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageConfigResponse == false)
            return false;
        ImageConfigResponse other = (ImageConfigResponse) obj;
        if (other.getImageConfig() == null ^ this.getImageConfig() == null)
            return false;
        if (other.getImageConfig() != null && other.getImageConfig().equals(this.getImageConfig()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageConfig() == null) ? 0 : getImageConfig().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public ImageConfigResponse clone() {
        try {
            return (ImageConfigResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.ImageConfigResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
