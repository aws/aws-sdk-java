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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * It contains configs such as ReverseGeocodingConfig and MapMatchingConfig.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/VectorEnrichmentJobConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VectorEnrichmentJobConfig implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private MapMatchingConfig mapMatchingConfig;
    /** <p/> */
    private ReverseGeocodingConfig reverseGeocodingConfig;

    /**
     * <p/>
     * 
     * @param mapMatchingConfig
     */

    public void setMapMatchingConfig(MapMatchingConfig mapMatchingConfig) {
        this.mapMatchingConfig = mapMatchingConfig;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public MapMatchingConfig getMapMatchingConfig() {
        return this.mapMatchingConfig;
    }

    /**
     * <p/>
     * 
     * @param mapMatchingConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VectorEnrichmentJobConfig withMapMatchingConfig(MapMatchingConfig mapMatchingConfig) {
        setMapMatchingConfig(mapMatchingConfig);
        return this;
    }

    /**
     * <p/>
     * 
     * @param reverseGeocodingConfig
     */

    public void setReverseGeocodingConfig(ReverseGeocodingConfig reverseGeocodingConfig) {
        this.reverseGeocodingConfig = reverseGeocodingConfig;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public ReverseGeocodingConfig getReverseGeocodingConfig() {
        return this.reverseGeocodingConfig;
    }

    /**
     * <p/>
     * 
     * @param reverseGeocodingConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VectorEnrichmentJobConfig withReverseGeocodingConfig(ReverseGeocodingConfig reverseGeocodingConfig) {
        setReverseGeocodingConfig(reverseGeocodingConfig);
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
        if (getMapMatchingConfig() != null)
            sb.append("MapMatchingConfig: ").append(getMapMatchingConfig()).append(",");
        if (getReverseGeocodingConfig() != null)
            sb.append("ReverseGeocodingConfig: ").append(getReverseGeocodingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VectorEnrichmentJobConfig == false)
            return false;
        VectorEnrichmentJobConfig other = (VectorEnrichmentJobConfig) obj;
        if (other.getMapMatchingConfig() == null ^ this.getMapMatchingConfig() == null)
            return false;
        if (other.getMapMatchingConfig() != null && other.getMapMatchingConfig().equals(this.getMapMatchingConfig()) == false)
            return false;
        if (other.getReverseGeocodingConfig() == null ^ this.getReverseGeocodingConfig() == null)
            return false;
        if (other.getReverseGeocodingConfig() != null && other.getReverseGeocodingConfig().equals(this.getReverseGeocodingConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMapMatchingConfig() == null) ? 0 : getMapMatchingConfig().hashCode());
        hashCode = prime * hashCode + ((getReverseGeocodingConfig() == null) ? 0 : getReverseGeocodingConfig().hashCode());
        return hashCode;
    }

    @Override
    public VectorEnrichmentJobConfig clone() {
        try {
            return (VectorEnrichmentJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.VectorEnrichmentJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
