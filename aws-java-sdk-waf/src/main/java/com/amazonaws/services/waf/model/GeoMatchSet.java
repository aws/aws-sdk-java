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
 * Contains one or more countries that AWS WAF will search for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GeoMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoMatchSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <code>GeoMatchSet</code>. You use <code>GeoMatchSetId</code> to get
     * information about a <code>GeoMatchSet</code> (see <a>GeoMatchSet</a>), update a <code>GeoMatchSet</code> (see
     * <a>UpdateGeoMatchSet</a>), insert a <code>GeoMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>GeoMatchSet</code> from AWS WAF (see
     * <a>DeleteGeoMatchSet</a>).
     * </p>
     * <p>
     * <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
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
     * An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search for.
     * </p>
     */
    private java.util.List<GeoMatchConstraint> geoMatchConstraints;

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <code>GeoMatchSet</code>. You use <code>GeoMatchSetId</code> to get
     * information about a <code>GeoMatchSet</code> (see <a>GeoMatchSet</a>), update a <code>GeoMatchSet</code> (see
     * <a>UpdateGeoMatchSet</a>), insert a <code>GeoMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>GeoMatchSet</code> from AWS WAF (see
     * <a>DeleteGeoMatchSet</a>).
     * </p>
     * <p>
     * <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @param geoMatchSetId
     *        The <code>GeoMatchSetId</code> for an <code>GeoMatchSet</code>. You use <code>GeoMatchSetId</code> to get
     *        information about a <code>GeoMatchSet</code> (see <a>GeoMatchSet</a>), update a <code>GeoMatchSet</code>
     *        (see <a>UpdateGeoMatchSet</a>), insert a <code>GeoMatchSet</code> into a <code>Rule</code> or delete one
     *        from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>GeoMatchSet</code> from AWS WAF (see
     *        <a>DeleteGeoMatchSet</a>).</p>
     *        <p>
     *        <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     */

    public void setGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <code>GeoMatchSet</code>. You use <code>GeoMatchSetId</code> to get
     * information about a <code>GeoMatchSet</code> (see <a>GeoMatchSet</a>), update a <code>GeoMatchSet</code> (see
     * <a>UpdateGeoMatchSet</a>), insert a <code>GeoMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>GeoMatchSet</code> from AWS WAF (see
     * <a>DeleteGeoMatchSet</a>).
     * </p>
     * <p>
     * <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @return The <code>GeoMatchSetId</code> for an <code>GeoMatchSet</code>. You use <code>GeoMatchSetId</code> to get
     *         information about a <code>GeoMatchSet</code> (see <a>GeoMatchSet</a>), update a <code>GeoMatchSet</code>
     *         (see <a>UpdateGeoMatchSet</a>), insert a <code>GeoMatchSet</code> into a <code>Rule</code> or delete one
     *         from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>GeoMatchSet</code> from AWS WAF (see
     *         <a>DeleteGeoMatchSet</a>).</p>
     *         <p>
     *         <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     */

    public String getGeoMatchSetId() {
        return this.geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> for an <code>GeoMatchSet</code>. You use <code>GeoMatchSetId</code> to get
     * information about a <code>GeoMatchSet</code> (see <a>GeoMatchSet</a>), update a <code>GeoMatchSet</code> (see
     * <a>UpdateGeoMatchSet</a>), insert a <code>GeoMatchSet</code> into a <code>Rule</code> or delete one from a
     * <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>GeoMatchSet</code> from AWS WAF (see
     * <a>DeleteGeoMatchSet</a>).
     * </p>
     * <p>
     * <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @param geoMatchSetId
     *        The <code>GeoMatchSetId</code> for an <code>GeoMatchSet</code>. You use <code>GeoMatchSetId</code> to get
     *        information about a <code>GeoMatchSet</code> (see <a>GeoMatchSet</a>), update a <code>GeoMatchSet</code>
     *        (see <a>UpdateGeoMatchSet</a>), insert a <code>GeoMatchSet</code> into a <code>Rule</code> or delete one
     *        from a <code>Rule</code> (see <a>UpdateRule</a>), and delete a <code>GeoMatchSet</code> from AWS WAF (see
     *        <a>DeleteGeoMatchSet</a>).</p>
     *        <p>
     *        <code>GeoMatchSetId</code> is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchSet withGeoMatchSetId(String geoMatchSetId) {
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

    public GeoMatchSet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search for.
     * </p>
     * 
     * @return An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search
     *         for.
     */

    public java.util.List<GeoMatchConstraint> getGeoMatchConstraints() {
        return geoMatchConstraints;
    }

    /**
     * <p>
     * An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search for.
     * </p>
     * 
     * @param geoMatchConstraints
     *        An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search
     *        for.
     */

    public void setGeoMatchConstraints(java.util.Collection<GeoMatchConstraint> geoMatchConstraints) {
        if (geoMatchConstraints == null) {
            this.geoMatchConstraints = null;
            return;
        }

        this.geoMatchConstraints = new java.util.ArrayList<GeoMatchConstraint>(geoMatchConstraints);
    }

    /**
     * <p>
     * An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeoMatchConstraints(java.util.Collection)} or {@link #withGeoMatchConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param geoMatchConstraints
     *        An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search
     *        for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchSet withGeoMatchConstraints(GeoMatchConstraint... geoMatchConstraints) {
        if (this.geoMatchConstraints == null) {
            setGeoMatchConstraints(new java.util.ArrayList<GeoMatchConstraint>(geoMatchConstraints.length));
        }
        for (GeoMatchConstraint ele : geoMatchConstraints) {
            this.geoMatchConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search for.
     * </p>
     * 
     * @param geoMatchConstraints
     *        An array of <a>GeoMatchConstraint</a> objects, which contain the country that you want AWS WAF to search
     *        for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchSet withGeoMatchConstraints(java.util.Collection<GeoMatchConstraint> geoMatchConstraints) {
        setGeoMatchConstraints(geoMatchConstraints);
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
            sb.append("Name: ").append(getName()).append(",");
        if (getGeoMatchConstraints() != null)
            sb.append("GeoMatchConstraints: ").append(getGeoMatchConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoMatchSet == false)
            return false;
        GeoMatchSet other = (GeoMatchSet) obj;
        if (other.getGeoMatchSetId() == null ^ this.getGeoMatchSetId() == null)
            return false;
        if (other.getGeoMatchSetId() != null && other.getGeoMatchSetId().equals(this.getGeoMatchSetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGeoMatchConstraints() == null ^ this.getGeoMatchConstraints() == null)
            return false;
        if (other.getGeoMatchConstraints() != null && other.getGeoMatchConstraints().equals(this.getGeoMatchConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoMatchSetId() == null) ? 0 : getGeoMatchSetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGeoMatchConstraints() == null) ? 0 : getGeoMatchConstraints().hashCode());
        return hashCode;
    }

    @Override
    public GeoMatchSet clone() {
        try {
            return (GeoMatchSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.GeoMatchSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
