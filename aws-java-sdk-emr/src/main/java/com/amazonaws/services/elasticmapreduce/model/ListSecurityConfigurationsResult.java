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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSecurityConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityConfigurationSummary> securityConfigurations;
    /**
     * <p>
     * A pagination token that indicates the next set of results to retrieve. Include the marker in the next
     * ListSecurityConfiguration call to retrieve the next page of results, if required.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     * 
     * @return The creation date and time, and name, of each security configuration.
     */

    public java.util.List<SecurityConfigurationSummary> getSecurityConfigurations() {
        if (securityConfigurations == null) {
            securityConfigurations = new com.amazonaws.internal.SdkInternalList<SecurityConfigurationSummary>();
        }
        return securityConfigurations;
    }

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     * 
     * @param securityConfigurations
     *        The creation date and time, and name, of each security configuration.
     */

    public void setSecurityConfigurations(java.util.Collection<SecurityConfigurationSummary> securityConfigurations) {
        if (securityConfigurations == null) {
            this.securityConfigurations = null;
            return;
        }

        this.securityConfigurations = new com.amazonaws.internal.SdkInternalList<SecurityConfigurationSummary>(securityConfigurations);
    }

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityConfigurations(java.util.Collection)} or
     * {@link #withSecurityConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityConfigurations
     *        The creation date and time, and name, of each security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigurationsResult withSecurityConfigurations(SecurityConfigurationSummary... securityConfigurations) {
        if (this.securityConfigurations == null) {
            setSecurityConfigurations(new com.amazonaws.internal.SdkInternalList<SecurityConfigurationSummary>(securityConfigurations.length));
        }
        for (SecurityConfigurationSummary ele : securityConfigurations) {
            this.securityConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The creation date and time, and name, of each security configuration.
     * </p>
     * 
     * @param securityConfigurations
     *        The creation date and time, and name, of each security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigurationsResult withSecurityConfigurations(java.util.Collection<SecurityConfigurationSummary> securityConfigurations) {
        setSecurityConfigurations(securityConfigurations);
        return this;
    }

    /**
     * <p>
     * A pagination token that indicates the next set of results to retrieve. Include the marker in the next
     * ListSecurityConfiguration call to retrieve the next page of results, if required.
     * </p>
     * 
     * @param marker
     *        A pagination token that indicates the next set of results to retrieve. Include the marker in the next
     *        ListSecurityConfiguration call to retrieve the next page of results, if required.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that indicates the next set of results to retrieve. Include the marker in the next
     * ListSecurityConfiguration call to retrieve the next page of results, if required.
     * </p>
     * 
     * @return A pagination token that indicates the next set of results to retrieve. Include the marker in the next
     *         ListSecurityConfiguration call to retrieve the next page of results, if required.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that indicates the next set of results to retrieve. Include the marker in the next
     * ListSecurityConfiguration call to retrieve the next page of results, if required.
     * </p>
     * 
     * @param marker
     *        A pagination token that indicates the next set of results to retrieve. Include the marker in the next
     *        ListSecurityConfiguration call to retrieve the next page of results, if required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityConfigurationsResult withMarker(String marker) {
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
        if (getSecurityConfigurations() != null)
            sb.append("SecurityConfigurations: ").append(getSecurityConfigurations()).append(",");
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

        if (obj instanceof ListSecurityConfigurationsResult == false)
            return false;
        ListSecurityConfigurationsResult other = (ListSecurityConfigurationsResult) obj;
        if (other.getSecurityConfigurations() == null ^ this.getSecurityConfigurations() == null)
            return false;
        if (other.getSecurityConfigurations() != null && other.getSecurityConfigurations().equals(this.getSecurityConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getSecurityConfigurations() == null) ? 0 : getSecurityConfigurations().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityConfigurationsResult clone() {
        try {
            return (ListSecurityConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
