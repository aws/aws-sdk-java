/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for DASH PUT operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DashConfigurationForPut"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashConfigurationForPut implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor populates
     * the Location tag with the URL for manifest update requests, to be used by players that don't support sticky
     * redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor manifests, and you are
     * either using client-side reporting or your players support sticky HTTP redirects. Valid values are DISABLED and
     * EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is the default value.
     * </p>
     */
    private String mpdLocation;
    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests
     * or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD.
     * The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     */
    private String originManifestType;

    /**
     * <p>
     * The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor populates
     * the Location tag with the URL for manifest update requests, to be used by players that don't support sticky
     * redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor manifests, and you are
     * either using client-side reporting or your players support sticky HTTP redirects. Valid values are DISABLED and
     * EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is the default value.
     * </p>
     * 
     * @param mpdLocation
     *        The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor
     *        populates the Location tag with the URL for manifest update requests, to be used by players that don't
     *        support sticky redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor
     *        manifests, and you are either using client-side reporting or your players support sticky HTTP redirects.
     *        Valid values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is
     *        the default value.
     */

    public void setMpdLocation(String mpdLocation) {
        this.mpdLocation = mpdLocation;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor populates
     * the Location tag with the URL for manifest update requests, to be used by players that don't support sticky
     * redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor manifests, and you are
     * either using client-side reporting or your players support sticky HTTP redirects. Valid values are DISABLED and
     * EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is the default value.
     * </p>
     * 
     * @return The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor
     *         populates the Location tag with the URL for manifest update requests, to be used by players that don't
     *         support sticky redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor
     *         manifests, and you are either using client-side reporting or your players support sticky HTTP redirects.
     *         Valid values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and
     *         is the default value.
     */

    public String getMpdLocation() {
        return this.mpdLocation;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor populates
     * the Location tag with the URL for manifest update requests, to be used by players that don't support sticky
     * redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor manifests, and you are
     * either using client-side reporting or your players support sticky HTTP redirects. Valid values are DISABLED and
     * EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is the default value.
     * </p>
     * 
     * @param mpdLocation
     *        The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor
     *        populates the Location tag with the URL for manifest update requests, to be used by players that don't
     *        support sticky redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor
     *        manifests, and you are either using client-side reporting or your players support sticky HTTP redirects.
     *        Valid values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is
     *        the default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashConfigurationForPut withMpdLocation(String mpdLocation) {
        setMpdLocation(mpdLocation);
        return this;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests
     * or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD.
     * The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * 
     * @param originManifestType
     *        The setting that controls whether MediaTailor handles manifests from the origin server as multi-period
     *        manifests or single-period manifests. If your origin server produces single-period manifests, set this to
     *        SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set
     *        it to MULTI_PERIOD.
     * @see OriginManifestType
     */

    public void setOriginManifestType(String originManifestType) {
        this.originManifestType = originManifestType;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests
     * or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD.
     * The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * 
     * @return The setting that controls whether MediaTailor handles manifests from the origin server as multi-period
     *         manifests or single-period manifests. If your origin server produces single-period manifests, set this to
     *         SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set
     *         it to MULTI_PERIOD.
     * @see OriginManifestType
     */

    public String getOriginManifestType() {
        return this.originManifestType;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests
     * or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD.
     * The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * 
     * @param originManifestType
     *        The setting that controls whether MediaTailor handles manifests from the origin server as multi-period
     *        manifests or single-period manifests. If your origin server produces single-period manifests, set this to
     *        SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set
     *        it to MULTI_PERIOD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginManifestType
     */

    public DashConfigurationForPut withOriginManifestType(String originManifestType) {
        setOriginManifestType(originManifestType);
        return this;
    }

    /**
     * <p>
     * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests
     * or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD.
     * The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD.
     * </p>
     * 
     * @param originManifestType
     *        The setting that controls whether MediaTailor handles manifests from the origin server as multi-period
     *        manifests or single-period manifests. If your origin server produces single-period manifests, set this to
     *        SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set
     *        it to MULTI_PERIOD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginManifestType
     */

    public DashConfigurationForPut withOriginManifestType(OriginManifestType originManifestType) {
        this.originManifestType = originManifestType.toString();
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
        if (getMpdLocation() != null)
            sb.append("MpdLocation: ").append(getMpdLocation()).append(",");
        if (getOriginManifestType() != null)
            sb.append("OriginManifestType: ").append(getOriginManifestType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashConfigurationForPut == false)
            return false;
        DashConfigurationForPut other = (DashConfigurationForPut) obj;
        if (other.getMpdLocation() == null ^ this.getMpdLocation() == null)
            return false;
        if (other.getMpdLocation() != null && other.getMpdLocation().equals(this.getMpdLocation()) == false)
            return false;
        if (other.getOriginManifestType() == null ^ this.getOriginManifestType() == null)
            return false;
        if (other.getOriginManifestType() != null && other.getOriginManifestType().equals(this.getOriginManifestType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMpdLocation() == null) ? 0 : getMpdLocation().hashCode());
        hashCode = prime * hashCode + ((getOriginManifestType() == null) ? 0 : getOriginManifestType().hashCode());
        return hashCode;
    }

    @Override
    public DashConfigurationForPut clone() {
        try {
            return (DashConfigurationForPut) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.DashConfigurationForPutMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
