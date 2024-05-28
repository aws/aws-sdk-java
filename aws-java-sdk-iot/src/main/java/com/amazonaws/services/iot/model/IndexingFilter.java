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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides additional selections for named shadows and geolocation data.
 * </p>
 * <p>
 * To add named shadows to your fleet indexing configuration, set <code>namedShadowIndexingMode</code> to be ON and
 * specify your shadow names in <code>namedShadowNames</code> filter.
 * </p>
 * <p>
 * To add geolocation data to your fleet indexing configuration:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you store geolocation data in a class/unnamed shadow, set <code>thingIndexingMode</code> to be
 * <code>REGISTRY_AND_SHADOW</code> and specify your geolocation data in <code>geoLocations</code> filter.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you store geolocation data in a named shadow, set <code>namedShadowIndexingMode</code> to be <code>ON</code>, add
 * the shadow name in <code>namedShadowNames</code> filter, and specify your geolocation data in
 * <code>geoLocations</code> filter. For more information, see <a
 * href="https://docs.aws.amazon.com/iot/latest/developerguide/managing-fleet-index.html">Managing fleet indexing</a>.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IndexingFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of shadow names for indexing is 10. To
     * increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private java.util.List<String> namedShadowNames;
    /**
     * <p>
     * The list of geolocation targets that you select to index. The default maximum number of geolocation targets for
     * indexing is <code>1</code>. To increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private java.util.List<GeoLocationTarget> geoLocations;

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of shadow names for indexing is 10. To
     * increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The shadow names that you select to index. The default maximum number of shadow names for indexing is 10.
     *         To increase the limit, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *         >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General
     *         Reference</i>.
     */

    public java.util.List<String> getNamedShadowNames() {
        return namedShadowNames;
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of shadow names for indexing is 10. To
     * increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param namedShadowNames
     *        The shadow names that you select to index. The default maximum number of shadow names for indexing is 10.
     *        To increase the limit, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *        >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setNamedShadowNames(java.util.Collection<String> namedShadowNames) {
        if (namedShadowNames == null) {
            this.namedShadowNames = null;
            return;
        }

        this.namedShadowNames = new java.util.ArrayList<String>(namedShadowNames);
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of shadow names for indexing is 10. To
     * increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamedShadowNames(java.util.Collection)} or {@link #withNamedShadowNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param namedShadowNames
     *        The shadow names that you select to index. The default maximum number of shadow names for indexing is 10.
     *        To increase the limit, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *        >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexingFilter withNamedShadowNames(String... namedShadowNames) {
        if (this.namedShadowNames == null) {
            setNamedShadowNames(new java.util.ArrayList<String>(namedShadowNames.length));
        }
        for (String ele : namedShadowNames) {
            this.namedShadowNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The shadow names that you select to index. The default maximum number of shadow names for indexing is 10. To
     * increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param namedShadowNames
     *        The shadow names that you select to index. The default maximum number of shadow names for indexing is 10.
     *        To increase the limit, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *        >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexingFilter withNamedShadowNames(java.util.Collection<String> namedShadowNames) {
        setNamedShadowNames(namedShadowNames);
        return this;
    }

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default maximum number of geolocation targets for
     * indexing is <code>1</code>. To increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The list of geolocation targets that you select to index. The default maximum number of geolocation
     *         targets for indexing is <code>1</code>. To increase the limit, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *         >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General
     *         Reference</i>.
     */

    public java.util.List<GeoLocationTarget> getGeoLocations() {
        return geoLocations;
    }

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default maximum number of geolocation targets for
     * indexing is <code>1</code>. To increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param geoLocations
     *        The list of geolocation targets that you select to index. The default maximum number of geolocation
     *        targets for indexing is <code>1</code>. To increase the limit, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *        >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setGeoLocations(java.util.Collection<GeoLocationTarget> geoLocations) {
        if (geoLocations == null) {
            this.geoLocations = null;
            return;
        }

        this.geoLocations = new java.util.ArrayList<GeoLocationTarget>(geoLocations);
    }

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default maximum number of geolocation targets for
     * indexing is <code>1</code>. To increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeoLocations(java.util.Collection)} or {@link #withGeoLocations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param geoLocations
     *        The list of geolocation targets that you select to index. The default maximum number of geolocation
     *        targets for indexing is <code>1</code>. To increase the limit, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *        >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexingFilter withGeoLocations(GeoLocationTarget... geoLocations) {
        if (this.geoLocations == null) {
            setGeoLocations(new java.util.ArrayList<GeoLocationTarget>(geoLocations.length));
        }
        for (GeoLocationTarget ele : geoLocations) {
            this.geoLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of geolocation targets that you select to index. The default maximum number of geolocation targets for
     * indexing is <code>1</code>. To increase the limit, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits">Amazon Web
     * Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param geoLocations
     *        The list of geolocation targets that you select to index. The default maximum number of geolocation
     *        targets for indexing is <code>1</code>. To increase the limit, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/iot_device_management.html#fleet-indexing-limits"
     *        >Amazon Web Services IoT Device Management Quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexingFilter withGeoLocations(java.util.Collection<GeoLocationTarget> geoLocations) {
        setGeoLocations(geoLocations);
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
        if (getNamedShadowNames() != null)
            sb.append("NamedShadowNames: ").append(getNamedShadowNames()).append(",");
        if (getGeoLocations() != null)
            sb.append("GeoLocations: ").append(getGeoLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexingFilter == false)
            return false;
        IndexingFilter other = (IndexingFilter) obj;
        if (other.getNamedShadowNames() == null ^ this.getNamedShadowNames() == null)
            return false;
        if (other.getNamedShadowNames() != null && other.getNamedShadowNames().equals(this.getNamedShadowNames()) == false)
            return false;
        if (other.getGeoLocations() == null ^ this.getGeoLocations() == null)
            return false;
        if (other.getGeoLocations() != null && other.getGeoLocations().equals(this.getGeoLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamedShadowNames() == null) ? 0 : getNamedShadowNames().hashCode());
        hashCode = prime * hashCode + ((getGeoLocations() == null) ? 0 : getGeoLocations().hashCode());
        return hashCode;
    }

    @Override
    public IndexingFilter clone() {
        try {
            return (IndexingFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.IndexingFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
