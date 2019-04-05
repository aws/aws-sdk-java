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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeResourcePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeResourcePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The principals.
     * </p>
     */
    private java.util.List<Principal> principals;
    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The principals.
     * </p>
     * 
     * @return The principals.
     */

    public java.util.List<Principal> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The principals.
     * </p>
     * 
     * @param principals
     *        The principals.
     */

    public void setPrincipals(java.util.Collection<Principal> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<Principal>(principals);
    }

    /**
     * <p>
     * The principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        The principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePermissionsResult withPrincipals(Principal... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<Principal>(principals.length));
        }
        for (Principal ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The principals.
     * </p>
     * 
     * @param principals
     *        The principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePermissionsResult withPrincipals(java.util.Collection<Principal> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param marker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @return The marker to use when requesting the next set of results. If there are no additional results, the string
     *         is empty.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param marker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeResourcePermissionsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResourcePermissionsResult == false)
            return false;
        DescribeResourcePermissionsResult other = (DescribeResourcePermissionsResult) obj;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeResourcePermissionsResult clone() {
        try {
            return (DescribeResourcePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
