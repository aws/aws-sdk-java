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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Required when you set (Profile) under (VideoDescription)>(CodecSettings)>(XavcSettings) to the value
 * XAVC_4K_INTRA_VBR.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Xavc4kIntraVbrProfileSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Xavc4kIntraVbrProfileSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have similar
     * image quality over the operating points that are valid for that class.
     */
    private String xavcClass;

    /**
     * Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have similar
     * image quality over the operating points that are valid for that class.
     * 
     * @param xavcClass
     *        Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have
     *        similar image quality over the operating points that are valid for that class.
     * @see Xavc4kIntraVbrProfileClass
     */

    public void setXavcClass(String xavcClass) {
        this.xavcClass = xavcClass;
    }

    /**
     * Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have similar
     * image quality over the operating points that are valid for that class.
     * 
     * @return Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have
     *         similar image quality over the operating points that are valid for that class.
     * @see Xavc4kIntraVbrProfileClass
     */

    public String getXavcClass() {
        return this.xavcClass;
    }

    /**
     * Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have similar
     * image quality over the operating points that are valid for that class.
     * 
     * @param xavcClass
     *        Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have
     *        similar image quality over the operating points that are valid for that class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Xavc4kIntraVbrProfileClass
     */

    public Xavc4kIntraVbrProfileSettings withXavcClass(String xavcClass) {
        setXavcClass(xavcClass);
        return this;
    }

    /**
     * Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have similar
     * image quality over the operating points that are valid for that class.
     * 
     * @param xavcClass
     *        Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have
     *        similar image quality over the operating points that are valid for that class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Xavc4kIntraVbrProfileClass
     */

    public Xavc4kIntraVbrProfileSettings withXavcClass(Xavc4kIntraVbrProfileClass xavcClass) {
        this.xavcClass = xavcClass.toString();
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
        if (getXavcClass() != null)
            sb.append("XavcClass: ").append(getXavcClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Xavc4kIntraVbrProfileSettings == false)
            return false;
        Xavc4kIntraVbrProfileSettings other = (Xavc4kIntraVbrProfileSettings) obj;
        if (other.getXavcClass() == null ^ this.getXavcClass() == null)
            return false;
        if (other.getXavcClass() != null && other.getXavcClass().equals(this.getXavcClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getXavcClass() == null) ? 0 : getXavcClass().hashCode());
        return hashCode;
    }

    @Override
    public Xavc4kIntraVbrProfileSettings clone() {
        try {
            return (Xavc4kIntraVbrProfileSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Xavc4kIntraVbrProfileSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
