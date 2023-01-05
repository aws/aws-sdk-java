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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMediaStorageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMediaStorageConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     */
    private MediaStorageConfiguration mediaStorageConfiguration;

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     * 
     * @param mediaStorageConfiguration
     *        A structure that encapsulates, or contains, the media storage configuration properties.
     */

    public void setMediaStorageConfiguration(MediaStorageConfiguration mediaStorageConfiguration) {
        this.mediaStorageConfiguration = mediaStorageConfiguration;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     * 
     * @return A structure that encapsulates, or contains, the media storage configuration properties.
     */

    public MediaStorageConfiguration getMediaStorageConfiguration() {
        return this.mediaStorageConfiguration;
    }

    /**
     * <p>
     * A structure that encapsulates, or contains, the media storage configuration properties.
     * </p>
     * 
     * @param mediaStorageConfiguration
     *        A structure that encapsulates, or contains, the media storage configuration properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMediaStorageConfigurationResult withMediaStorageConfiguration(MediaStorageConfiguration mediaStorageConfiguration) {
        setMediaStorageConfiguration(mediaStorageConfiguration);
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
        if (getMediaStorageConfiguration() != null)
            sb.append("MediaStorageConfiguration: ").append(getMediaStorageConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMediaStorageConfigurationResult == false)
            return false;
        DescribeMediaStorageConfigurationResult other = (DescribeMediaStorageConfigurationResult) obj;
        if (other.getMediaStorageConfiguration() == null ^ this.getMediaStorageConfiguration() == null)
            return false;
        if (other.getMediaStorageConfiguration() != null && other.getMediaStorageConfiguration().equals(this.getMediaStorageConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaStorageConfiguration() == null) ? 0 : getMediaStorageConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMediaStorageConfigurationResult clone() {
        try {
            return (DescribeMediaStorageConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
