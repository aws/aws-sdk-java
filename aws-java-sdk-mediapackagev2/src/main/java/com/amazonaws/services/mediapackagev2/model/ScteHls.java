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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ScteHls" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScteHls implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content stream
     * in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * Choose what you want MediaPackage to do with the ad markers.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF manifests. If
     * you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To learn more about
     * DATERANGE, see <a
     * href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35 Ad Marker
     * EXT-X-DATERANGE</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String adMarkerHls;

    /**
     * <p>
     * Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content stream
     * in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * Choose what you want MediaPackage to do with the ad markers.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF manifests. If
     * you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To learn more about
     * DATERANGE, see <a
     * href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35 Ad Marker
     * EXT-X-DATERANGE</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param adMarkerHls
     *        Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content
     *        stream in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in
     *        the output. Choose what you want MediaPackage to do with the ad markers.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF
     *        manifests. If you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To
     *        learn more about DATERANGE, see <a
     *        href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35 Ad
     *        Marker EXT-X-DATERANGE</a>.
     *        </p>
     *        </li>
     * @see AdMarkerHls
     */

    public void setAdMarkerHls(String adMarkerHls) {
        this.adMarkerHls = adMarkerHls;
    }

    /**
     * <p>
     * Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content stream
     * in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * Choose what you want MediaPackage to do with the ad markers.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF manifests. If
     * you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To learn more about
     * DATERANGE, see <a
     * href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35 Ad Marker
     * EXT-X-DATERANGE</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content
     *         stream in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in
     *         the output. Choose what you want MediaPackage to do with the ad markers.</p>
     *         <p>
     *         Value description:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF
     *         manifests. If you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To
     *         learn more about DATERANGE, see <a
     *         href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35
     *         Ad Marker EXT-X-DATERANGE</a>.
     *         </p>
     *         </li>
     * @see AdMarkerHls
     */

    public String getAdMarkerHls() {
        return this.adMarkerHls;
    }

    /**
     * <p>
     * Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content stream
     * in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * Choose what you want MediaPackage to do with the ad markers.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF manifests. If
     * you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To learn more about
     * DATERANGE, see <a
     * href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35 Ad Marker
     * EXT-X-DATERANGE</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param adMarkerHls
     *        Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content
     *        stream in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in
     *        the output. Choose what you want MediaPackage to do with the ad markers.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF
     *        manifests. If you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To
     *        learn more about DATERANGE, see <a
     *        href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35 Ad
     *        Marker EXT-X-DATERANGE</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkerHls
     */

    public ScteHls withAdMarkerHls(String adMarkerHls) {
        setAdMarkerHls(adMarkerHls);
        return this;
    }

    /**
     * <p>
     * Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content stream
     * in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in the output.
     * Choose what you want MediaPackage to do with the ad markers.
     * </p>
     * <p>
     * Value description:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF manifests. If
     * you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To learn more about
     * DATERANGE, see <a
     * href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35 Ad Marker
     * EXT-X-DATERANGE</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param adMarkerHls
     *        Ad markers indicate when ads should be inserted during playback. If you include ad markers in the content
     *        stream in your upstream encoders, then you need to inform MediaPackage what to do with the ad markers in
     *        the output. Choose what you want MediaPackage to do with the ad markers.</p>
     *        <p>
     *        Value description:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DATERANGE - Insert EXT-X-DATERANGE tags to signal ad and program transition events in TS and CMAF
     *        manifests. If you use DATERANGE, you must set a programDateTimeIntervalSeconds value of 1 or higher. To
     *        learn more about DATERANGE, see <a
     *        href="http://docs.aws.amazon.com/mediapackage/latest/ug/scte-35-ad-marker-ext-x-daterange.html">SCTE-35 Ad
     *        Marker EXT-X-DATERANGE</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdMarkerHls
     */

    public ScteHls withAdMarkerHls(AdMarkerHls adMarkerHls) {
        this.adMarkerHls = adMarkerHls.toString();
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
        if (getAdMarkerHls() != null)
            sb.append("AdMarkerHls: ").append(getAdMarkerHls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScteHls == false)
            return false;
        ScteHls other = (ScteHls) obj;
        if (other.getAdMarkerHls() == null ^ this.getAdMarkerHls() == null)
            return false;
        if (other.getAdMarkerHls() != null && other.getAdMarkerHls().equals(this.getAdMarkerHls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdMarkerHls() == null) ? 0 : getAdMarkerHls().hashCode());
        return hashCode;
    }

    @Override
    public ScteHls clone() {
        try {
            return (ScteHls) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.ScteHlsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
