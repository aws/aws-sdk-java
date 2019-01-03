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
 * Specifies the type of update to perform to an <a>GeoMatchSet</a> with <a>UpdateGeoMatchSet</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GeoMatchSetUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoMatchSetUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The country from which web requests originate that you want AWS WAF to search for.
     * </p>
     */
    private GeoMatchConstraint geoMatchConstraint;

    /**
     * <p>
     * Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * </p>
     * 
     * @return Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public GeoMatchSetUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert or delete a country with <a>UpdateGeoMatchSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public GeoMatchSetUpdate withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The country from which web requests originate that you want AWS WAF to search for.
     * </p>
     * 
     * @param geoMatchConstraint
     *        The country from which web requests originate that you want AWS WAF to search for.
     */

    public void setGeoMatchConstraint(GeoMatchConstraint geoMatchConstraint) {
        this.geoMatchConstraint = geoMatchConstraint;
    }

    /**
     * <p>
     * The country from which web requests originate that you want AWS WAF to search for.
     * </p>
     * 
     * @return The country from which web requests originate that you want AWS WAF to search for.
     */

    public GeoMatchConstraint getGeoMatchConstraint() {
        return this.geoMatchConstraint;
    }

    /**
     * <p>
     * The country from which web requests originate that you want AWS WAF to search for.
     * </p>
     * 
     * @param geoMatchConstraint
     *        The country from which web requests originate that you want AWS WAF to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchSetUpdate withGeoMatchConstraint(GeoMatchConstraint geoMatchConstraint) {
        setGeoMatchConstraint(geoMatchConstraint);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getGeoMatchConstraint() != null)
            sb.append("GeoMatchConstraint: ").append(getGeoMatchConstraint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoMatchSetUpdate == false)
            return false;
        GeoMatchSetUpdate other = (GeoMatchSetUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getGeoMatchConstraint() == null ^ this.getGeoMatchConstraint() == null)
            return false;
        if (other.getGeoMatchConstraint() != null && other.getGeoMatchConstraint().equals(this.getGeoMatchConstraint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getGeoMatchConstraint() == null) ? 0 : getGeoMatchConstraint().hashCode());
        return hashCode;
    }

    @Override
    public GeoMatchSetUpdate clone() {
        try {
            return (GeoMatchSetUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.waf.model.waf_regional.transform.GeoMatchSetUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
