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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Descriptions of the endpoint settings available for your source or target database engine.
     * </p>
     */
    private java.util.List<EndpointSetting> endpointSettings;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointSettingsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Descriptions of the endpoint settings available for your source or target database engine.
     * </p>
     * 
     * @return Descriptions of the endpoint settings available for your source or target database engine.
     */

    public java.util.List<EndpointSetting> getEndpointSettings() {
        return endpointSettings;
    }

    /**
     * <p>
     * Descriptions of the endpoint settings available for your source or target database engine.
     * </p>
     * 
     * @param endpointSettings
     *        Descriptions of the endpoint settings available for your source or target database engine.
     */

    public void setEndpointSettings(java.util.Collection<EndpointSetting> endpointSettings) {
        if (endpointSettings == null) {
            this.endpointSettings = null;
            return;
        }

        this.endpointSettings = new java.util.ArrayList<EndpointSetting>(endpointSettings);
    }

    /**
     * <p>
     * Descriptions of the endpoint settings available for your source or target database engine.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointSettings(java.util.Collection)} or {@link #withEndpointSettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param endpointSettings
     *        Descriptions of the endpoint settings available for your source or target database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointSettingsResult withEndpointSettings(EndpointSetting... endpointSettings) {
        if (this.endpointSettings == null) {
            setEndpointSettings(new java.util.ArrayList<EndpointSetting>(endpointSettings.length));
        }
        for (EndpointSetting ele : endpointSettings) {
            this.endpointSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Descriptions of the endpoint settings available for your source or target database engine.
     * </p>
     * 
     * @param endpointSettings
     *        Descriptions of the endpoint settings available for your source or target database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointSettingsResult withEndpointSettings(java.util.Collection<EndpointSetting> endpointSettings) {
        setEndpointSettings(endpointSettings);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getEndpointSettings() != null)
            sb.append("EndpointSettings: ").append(getEndpointSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointSettingsResult == false)
            return false;
        DescribeEndpointSettingsResult other = (DescribeEndpointSettingsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getEndpointSettings() == null ^ this.getEndpointSettings() == null)
            return false;
        if (other.getEndpointSettings() != null && other.getEndpointSettings().equals(this.getEndpointSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getEndpointSettings() == null) ? 0 : getEndpointSettings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointSettingsResult clone() {
        try {
            return (DescribeEndpointSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
