/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeImageGenerationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageGenerationConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The structure that contains the information required for the Kinesis video stream (KVS) images delivery. If this
     * structure is null, the configuration will be deleted from the stream.
     * </p>
     */
    private ImageGenerationConfiguration imageGenerationConfiguration;

    /**
     * <p>
     * The structure that contains the information required for the Kinesis video stream (KVS) images delivery. If this
     * structure is null, the configuration will be deleted from the stream.
     * </p>
     * 
     * @param imageGenerationConfiguration
     *        The structure that contains the information required for the Kinesis video stream (KVS) images delivery.
     *        If this structure is null, the configuration will be deleted from the stream.
     */

    public void setImageGenerationConfiguration(ImageGenerationConfiguration imageGenerationConfiguration) {
        this.imageGenerationConfiguration = imageGenerationConfiguration;
    }

    /**
     * <p>
     * The structure that contains the information required for the Kinesis video stream (KVS) images delivery. If this
     * structure is null, the configuration will be deleted from the stream.
     * </p>
     * 
     * @return The structure that contains the information required for the Kinesis video stream (KVS) images delivery.
     *         If this structure is null, the configuration will be deleted from the stream.
     */

    public ImageGenerationConfiguration getImageGenerationConfiguration() {
        return this.imageGenerationConfiguration;
    }

    /**
     * <p>
     * The structure that contains the information required for the Kinesis video stream (KVS) images delivery. If this
     * structure is null, the configuration will be deleted from the stream.
     * </p>
     * 
     * @param imageGenerationConfiguration
     *        The structure that contains the information required for the Kinesis video stream (KVS) images delivery.
     *        If this structure is null, the configuration will be deleted from the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageGenerationConfigurationResult withImageGenerationConfiguration(ImageGenerationConfiguration imageGenerationConfiguration) {
        setImageGenerationConfiguration(imageGenerationConfiguration);
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
        if (getImageGenerationConfiguration() != null)
            sb.append("ImageGenerationConfiguration: ").append(getImageGenerationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageGenerationConfigurationResult == false)
            return false;
        DescribeImageGenerationConfigurationResult other = (DescribeImageGenerationConfigurationResult) obj;
        if (other.getImageGenerationConfiguration() == null ^ this.getImageGenerationConfiguration() == null)
            return false;
        if (other.getImageGenerationConfiguration() != null && other.getImageGenerationConfiguration().equals(this.getImageGenerationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageGenerationConfiguration() == null) ? 0 : getImageGenerationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageGenerationConfigurationResult clone() {
        try {
            return (DescribeImageGenerationConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
