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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the identifier and the name of the <code>GeoMatchSet</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GeoMatchSetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoMatchSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use <code>GeoMatchSetId</code> in a
     * <a>GetGeoMatchSet</a> request to get detailed information about an <a>GeoMatchSet</a>.
     * </p>
     */
    private String geoMatchSetId;
    /**
     * <p>
     * A friendly name or description of the <a>GeoMatchSet</a>. You can't change the name of an
     * <code>GeoMatchSet</code> after you create it.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use <code>GeoMatchSetId</code> in a
     * <a>GetGeoMatchSet</a> request to get detailed information about an <a>GeoMatchSet</a>.
     * </p>
     * 
     * @param geoMatchSetId
     *        The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use <code>GeoMatchSetId</code> in a
     *        <a>GetGeoMatchSet</a> request to get detailed information about an <a>GeoMatchSet</a>.
     */

    public void setGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use <code>GeoMatchSetId</code> in a
     * <a>GetGeoMatchSet</a> request to get detailed information about an <a>GeoMatchSet</a>.
     * </p>
     * 
     * @return The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use <code>GeoMatchSetId</code> in a
     *         <a>GetGeoMatchSet</a> request to get detailed information about an <a>GeoMatchSet</a>.
     */

    public String getGeoMatchSetId() {
        return this.geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use <code>GeoMatchSetId</code> in a
     * <a>GetGeoMatchSet</a> request to get detailed information about an <a>GeoMatchSet</a>.
     * </p>
     * 
     * @param geoMatchSetId
     *        The <code>GeoMatchSetId</code> for an <a>GeoMatchSet</a>. You can use <code>GeoMatchSetId</code> in a
     *        <a>GetGeoMatchSet</a> request to get detailed information about an <a>GeoMatchSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchSetSummary withGeoMatchSetId(String geoMatchSetId) {
        setGeoMatchSetId(geoMatchSetId);
        return this;
    }

    /**
     * <p>
     * A friendly name or description of the <a>GeoMatchSet</a>. You can't change the name of an
     * <code>GeoMatchSet</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>GeoMatchSet</a>. You can't change the name of an
     *        <code>GeoMatchSet</code> after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>GeoMatchSet</a>. You can't change the name of an
     * <code>GeoMatchSet</code> after you create it.
     * </p>
     * 
     * @return A friendly name or description of the <a>GeoMatchSet</a>. You can't change the name of an
     *         <code>GeoMatchSet</code> after you create it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name or description of the <a>GeoMatchSet</a>. You can't change the name of an
     * <code>GeoMatchSet</code> after you create it.
     * </p>
     * 
     * @param name
     *        A friendly name or description of the <a>GeoMatchSet</a>. You can't change the name of an
     *        <code>GeoMatchSet</code> after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchSetSummary withName(String name) {
        setName(name);
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
        if (getGeoMatchSetId() != null)
            sb.append("GeoMatchSetId: ").append(getGeoMatchSetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoMatchSetSummary == false)
            return false;
        GeoMatchSetSummary other = (GeoMatchSetSummary) obj;
        if (other.getGeoMatchSetId() == null ^ this.getGeoMatchSetId() == null)
            return false;
        if (other.getGeoMatchSetId() != null && other.getGeoMatchSetId().equals(this.getGeoMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoMatchSetId() == null) ? 0 : getGeoMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GeoMatchSetSummary clone() {
        try {
            return (GeoMatchSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.GeoMatchSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
