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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListCidrLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCidrLocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A complex type that contains information about the list of CIDR locations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LocationSummary> cidrLocations;

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token to indicate where the service is to begin enumerating results.</p>
     *        <p>
     *        If no value is provided, the listing of results starts from the beginning.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @return An opaque pagination token to indicate where the service is to begin enumerating results.</p>
     *         <p>
     *         If no value is provided, the listing of results starts from the beginning.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token to indicate where the service is to begin enumerating results.
     * </p>
     * <p>
     * If no value is provided, the listing of results starts from the beginning.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token to indicate where the service is to begin enumerating results.</p>
     *        <p>
     *        If no value is provided, the listing of results starts from the beginning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrLocationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the list of CIDR locations.
     * </p>
     * 
     * @return A complex type that contains information about the list of CIDR locations.
     */

    public java.util.List<LocationSummary> getCidrLocations() {
        if (cidrLocations == null) {
            cidrLocations = new com.amazonaws.internal.SdkInternalList<LocationSummary>();
        }
        return cidrLocations;
    }

    /**
     * <p>
     * A complex type that contains information about the list of CIDR locations.
     * </p>
     * 
     * @param cidrLocations
     *        A complex type that contains information about the list of CIDR locations.
     */

    public void setCidrLocations(java.util.Collection<LocationSummary> cidrLocations) {
        if (cidrLocations == null) {
            this.cidrLocations = null;
            return;
        }

        this.cidrLocations = new com.amazonaws.internal.SdkInternalList<LocationSummary>(cidrLocations);
    }

    /**
     * <p>
     * A complex type that contains information about the list of CIDR locations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCidrLocations(java.util.Collection)} or {@link #withCidrLocations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param cidrLocations
     *        A complex type that contains information about the list of CIDR locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrLocationsResult withCidrLocations(LocationSummary... cidrLocations) {
        if (this.cidrLocations == null) {
            setCidrLocations(new com.amazonaws.internal.SdkInternalList<LocationSummary>(cidrLocations.length));
        }
        for (LocationSummary ele : cidrLocations) {
            this.cidrLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the list of CIDR locations.
     * </p>
     * 
     * @param cidrLocations
     *        A complex type that contains information about the list of CIDR locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCidrLocationsResult withCidrLocations(java.util.Collection<LocationSummary> cidrLocations) {
        setCidrLocations(cidrLocations);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCidrLocations() != null)
            sb.append("CidrLocations: ").append(getCidrLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCidrLocationsResult == false)
            return false;
        ListCidrLocationsResult other = (ListCidrLocationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCidrLocations() == null ^ this.getCidrLocations() == null)
            return false;
        if (other.getCidrLocations() != null && other.getCidrLocations().equals(this.getCidrLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCidrLocations() == null) ? 0 : getCidrLocations().hashCode());
        return hashCode;
    }

    @Override
    public ListCidrLocationsResult clone() {
        try {
            return (ListCidrLocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
