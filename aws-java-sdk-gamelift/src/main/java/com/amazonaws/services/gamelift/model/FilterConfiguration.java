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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of fleet locations where a game session queue can place new game sessions. You can use a filter to temporarily
 * turn off placements for specific locations. For queues that have multi-location fleets, you can use a filter
 * configuration allow placement with some, but not all of these locations.
 * </p>
 * <p>
 * Filter configurations are part of a <a>GameSessionQueue</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/FilterConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of locations to allow game session placement in, in the form of AWS Region codes such as
     * <code>us-west-2</code>.
     * </p>
     */
    private java.util.List<String> allowedLocations;

    /**
     * <p>
     * A list of locations to allow game session placement in, in the form of AWS Region codes such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @return A list of locations to allow game session placement in, in the form of AWS Region codes such as
     *         <code>us-west-2</code>.
     */

    public java.util.List<String> getAllowedLocations() {
        return allowedLocations;
    }

    /**
     * <p>
     * A list of locations to allow game session placement in, in the form of AWS Region codes such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param allowedLocations
     *        A list of locations to allow game session placement in, in the form of AWS Region codes such as
     *        <code>us-west-2</code>.
     */

    public void setAllowedLocations(java.util.Collection<String> allowedLocations) {
        if (allowedLocations == null) {
            this.allowedLocations = null;
            return;
        }

        this.allowedLocations = new java.util.ArrayList<String>(allowedLocations);
    }

    /**
     * <p>
     * A list of locations to allow game session placement in, in the form of AWS Region codes such as
     * <code>us-west-2</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedLocations(java.util.Collection)} or {@link #withAllowedLocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param allowedLocations
     *        A list of locations to allow game session placement in, in the form of AWS Region codes such as
     *        <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterConfiguration withAllowedLocations(String... allowedLocations) {
        if (this.allowedLocations == null) {
            setAllowedLocations(new java.util.ArrayList<String>(allowedLocations.length));
        }
        for (String ele : allowedLocations) {
            this.allowedLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of locations to allow game session placement in, in the form of AWS Region codes such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param allowedLocations
     *        A list of locations to allow game session placement in, in the form of AWS Region codes such as
     *        <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterConfiguration withAllowedLocations(java.util.Collection<String> allowedLocations) {
        setAllowedLocations(allowedLocations);
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
        if (getAllowedLocations() != null)
            sb.append("AllowedLocations: ").append(getAllowedLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterConfiguration == false)
            return false;
        FilterConfiguration other = (FilterConfiguration) obj;
        if (other.getAllowedLocations() == null ^ this.getAllowedLocations() == null)
            return false;
        if (other.getAllowedLocations() != null && other.getAllowedLocations().equals(this.getAllowedLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedLocations() == null) ? 0 : getAllowedLocations().hashCode());
        return hashCode;
    }

    @Override
    public FilterConfiguration clone() {
        try {
            return (FilterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.FilterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
