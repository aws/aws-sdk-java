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
 * Image tests configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImageTestsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageTestsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     */
    private Boolean imageTestsEnabled;
    /**
     * <p>
     * The maximum time in minutes that tests are permitted to run.
     * </p>
     */
    private Integer timeoutMinutes;

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     * 
     * @param imageTestsEnabled
     *        Defines if tests should be executed when building this image.
     */

    public void setImageTestsEnabled(Boolean imageTestsEnabled) {
        this.imageTestsEnabled = imageTestsEnabled;
    }

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     * 
     * @return Defines if tests should be executed when building this image.
     */

    public Boolean getImageTestsEnabled() {
        return this.imageTestsEnabled;
    }

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     * 
     * @param imageTestsEnabled
     *        Defines if tests should be executed when building this image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageTestsConfiguration withImageTestsEnabled(Boolean imageTestsEnabled) {
        setImageTestsEnabled(imageTestsEnabled);
        return this;
    }

    /**
     * <p>
     * Defines if tests should be executed when building this image.
     * </p>
     * 
     * @return Defines if tests should be executed when building this image.
     */

    public Boolean isImageTestsEnabled() {
        return this.imageTestsEnabled;
    }

    /**
     * <p>
     * The maximum time in minutes that tests are permitted to run.
     * </p>
     * 
     * @param timeoutMinutes
     *        The maximum time in minutes that tests are permitted to run.
     */

    public void setTimeoutMinutes(Integer timeoutMinutes) {
        this.timeoutMinutes = timeoutMinutes;
    }

    /**
     * <p>
     * The maximum time in minutes that tests are permitted to run.
     * </p>
     * 
     * @return The maximum time in minutes that tests are permitted to run.
     */

    public Integer getTimeoutMinutes() {
        return this.timeoutMinutes;
    }

    /**
     * <p>
     * The maximum time in minutes that tests are permitted to run.
     * </p>
     * 
     * @param timeoutMinutes
     *        The maximum time in minutes that tests are permitted to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageTestsConfiguration withTimeoutMinutes(Integer timeoutMinutes) {
        setTimeoutMinutes(timeoutMinutes);
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
        if (getImageTestsEnabled() != null)
            sb.append("ImageTestsEnabled: ").append(getImageTestsEnabled()).append(",");
        if (getTimeoutMinutes() != null)
            sb.append("TimeoutMinutes: ").append(getTimeoutMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageTestsConfiguration == false)
            return false;
        ImageTestsConfiguration other = (ImageTestsConfiguration) obj;
        if (other.getImageTestsEnabled() == null ^ this.getImageTestsEnabled() == null)
            return false;
        if (other.getImageTestsEnabled() != null && other.getImageTestsEnabled().equals(this.getImageTestsEnabled()) == false)
            return false;
        if (other.getTimeoutMinutes() == null ^ this.getTimeoutMinutes() == null)
            return false;
        if (other.getTimeoutMinutes() != null && other.getTimeoutMinutes().equals(this.getTimeoutMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageTestsEnabled() == null) ? 0 : getImageTestsEnabled().hashCode());
        hashCode = prime * hashCode + ((getTimeoutMinutes() == null) ? 0 : getTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public ImageTestsConfiguration clone() {
        try {
            return (ImageTestsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImageTestsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
