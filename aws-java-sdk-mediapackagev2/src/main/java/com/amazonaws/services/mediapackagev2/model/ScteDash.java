/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SCTE configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ScteDash" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScteDash implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Choose how ad markers are included in the packaged content. If you include ad markers in the content stream in
     * your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full XML.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - The SCTE marker is expressed fully in XML.
     * </p>
     * </li>
     * </ul>
     */
    private String adMarkerDash;

    /**
     * <p>
     * Choose how ad markers are included in the packaged content. If you include ad markers in the content stream in
     * your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full XML.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - The SCTE marker is expressed fully in XML.
     * </p>
     * </li>
     * </ul>
     * 
     * @param adMarkerDash
     *        Choose how ad markers are included in the packaged content. If you include ad markers in the content
     *        stream in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in
     *        the output.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full
     *        XML.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XML</code> - The SCTE marker is expressed fully in XML.
     *        </p>
     *        </li>
     * @see AdMarkerDash
     */

    public void setAdMarkerDash(String adMarkerDash) {
        this.adMarkerDash = adMarkerDash;
    }

    /**
     * <p>
     * Choose how ad markers are included in the packaged content. If you include ad markers in the content stream in
     * your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full XML.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - The SCTE marker is expressed fully in XML.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Choose how ad markers are included in the packaged content. If you include ad markers in the content
     *         stream in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in
     *         the output.</p>
     *         <p>
     *         Value description:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full
     *         XML.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>XML</code> - The SCTE marker is expressed fully in XML.
     *         </p>
     *         </li>
     * @see AdMarkerDash
     */

    public String getAdMarkerDash() {
        return this.adMarkerDash;
    }

    /**
     * <p>
     * Choose how ad markers are included in the packaged content. If you include ad markers in the content stream in
     * your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full XML.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - The SCTE marker is expressed fully in XML.
     * </p>
     * </li>
     * </ul>
     * 
     * @param adMarkerDash
     *        Choose how ad markers are included in the packaged content. If you include ad markers in the content
     *        stream in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in
     *        the output.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full
     *        XML.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XML</code> - The SCTE marker is expressed fully in XML.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkerDash
     */

    public ScteDash withAdMarkerDash(String adMarkerDash) {
        setAdMarkerDash(adMarkerDash);
        return this;
    }

    /**
     * <p>
     * Choose how ad markers are included in the packaged content. If you include ad markers in the content stream in
     * your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full XML.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>XML</code> - The SCTE marker is expressed fully in XML.
     * </p>
     * </li>
     * </ul>
     * 
     * @param adMarkerDash
     *        Choose how ad markers are included in the packaged content. If you include ad markers in the content
     *        stream in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in
     *        the output.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Binary</code> - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full
     *        XML.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>XML</code> - The SCTE marker is expressed fully in XML.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkerDash
     */

    public ScteDash withAdMarkerDash(AdMarkerDash adMarkerDash) {
        this.adMarkerDash = adMarkerDash.toString();
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
        if (getAdMarkerDash() != null)
            sb.append("AdMarkerDash: ").append(getAdMarkerDash());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScteDash == false)
            return false;
        ScteDash other = (ScteDash) obj;
        if (other.getAdMarkerDash() == null ^ this.getAdMarkerDash() == null)
            return false;
        if (other.getAdMarkerDash() != null && other.getAdMarkerDash().equals(this.getAdMarkerDash()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkerDash() == null) ? 0 : getAdMarkerDash().hashCode());
        return hashCode;
    }

    @Override
    public ScteDash clone() {
        try {
            return (ScteDash) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.ScteDashMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
