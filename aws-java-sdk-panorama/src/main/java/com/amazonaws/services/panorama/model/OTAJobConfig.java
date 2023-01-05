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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An over-the-air update (OTA) job configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/OTAJobConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OTAJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target version of the device software.
     * </p>
     */
    private String imageVersion;

    /**
     * <p>
     * The target version of the device software.
     * </p>
     * 
     * @param imageVersion
     *        The target version of the device software.
     */

    public void setImageVersion(String imageVersion) {
        this.imageVersion = imageVersion;
    }

    /**
     * <p>
     * The target version of the device software.
     * </p>
     * 
     * @return The target version of the device software.
     */

    public String getImageVersion() {
        return this.imageVersion;
    }

    /**
     * <p>
     * The target version of the device software.
     * </p>
     * 
     * @param imageVersion
     *        The target version of the device software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OTAJobConfig withImageVersion(String imageVersion) {
        setImageVersion(imageVersion);
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
        if (getImageVersion() != null)
            sb.append("ImageVersion: ").append(getImageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OTAJobConfig == false)
            return false;
        OTAJobConfig other = (OTAJobConfig) obj;
        if (other.getImageVersion() == null ^ this.getImageVersion() == null)
            return false;
        if (other.getImageVersion() != null && other.getImageVersion().equals(this.getImageVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageVersion() == null) ? 0 : getImageVersion().hashCode());
        return hashCode;
    }

    @Override
    public OTAJobConfig clone() {
        try {
            return (OTAJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.OTAJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
