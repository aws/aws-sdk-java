/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects that contain summary information about the user's domain configurations.
     * </p>
     */
    private java.util.List<DomainConfigurationSummary> domainConfigurations;
    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * A list of objects that contain summary information about the user's domain configurations.
     * </p>
     * 
     * @return A list of objects that contain summary information about the user's domain configurations.
     */

    public java.util.List<DomainConfigurationSummary> getDomainConfigurations() {
        return domainConfigurations;
    }

    /**
     * <p>
     * A list of objects that contain summary information about the user's domain configurations.
     * </p>
     * 
     * @param domainConfigurations
     *        A list of objects that contain summary information about the user's domain configurations.
     */

    public void setDomainConfigurations(java.util.Collection<DomainConfigurationSummary> domainConfigurations) {
        if (domainConfigurations == null) {
            this.domainConfigurations = null;
            return;
        }

        this.domainConfigurations = new java.util.ArrayList<DomainConfigurationSummary>(domainConfigurations);
    }

    /**
     * <p>
     * A list of objects that contain summary information about the user's domain configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainConfigurations(java.util.Collection)} or {@link #withDomainConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param domainConfigurations
     *        A list of objects that contain summary information about the user's domain configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainConfigurationsResult withDomainConfigurations(DomainConfigurationSummary... domainConfigurations) {
        if (this.domainConfigurations == null) {
            setDomainConfigurations(new java.util.ArrayList<DomainConfigurationSummary>(domainConfigurations.length));
        }
        for (DomainConfigurationSummary ele : domainConfigurations) {
            this.domainConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain summary information about the user's domain configurations.
     * </p>
     * 
     * @param domainConfigurations
     *        A list of objects that contain summary information about the user's domain configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainConfigurationsResult withDomainConfigurations(java.util.Collection<DomainConfigurationSummary> domainConfigurations) {
        setDomainConfigurations(domainConfigurations);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param nextMarker
     *        The marker for the next set of results.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @return The marker for the next set of results.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The marker for the next set of results.
     * </p>
     * 
     * @param nextMarker
     *        The marker for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDomainConfigurationsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getDomainConfigurations() != null)
            sb.append("DomainConfigurations: ").append(getDomainConfigurations()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainConfigurationsResult == false)
            return false;
        ListDomainConfigurationsResult other = (ListDomainConfigurationsResult) obj;
        if (other.getDomainConfigurations() == null ^ this.getDomainConfigurations() == null)
            return false;
        if (other.getDomainConfigurations() != null && other.getDomainConfigurations().equals(this.getDomainConfigurations()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainConfigurations() == null) ? 0 : getDomainConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainConfigurationsResult clone() {
        try {
            return (ListDomainConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
