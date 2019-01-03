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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListInstanceFleets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstanceFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceFleet> instanceFleets;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     * 
     * @return The list of instance fleets for the cluster and given filters.
     */

    public java.util.List<InstanceFleet> getInstanceFleets() {
        if (instanceFleets == null) {
            instanceFleets = new com.amazonaws.internal.SdkInternalList<InstanceFleet>();
        }
        return instanceFleets;
    }

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     * 
     * @param instanceFleets
     *        The list of instance fleets for the cluster and given filters.
     */

    public void setInstanceFleets(java.util.Collection<InstanceFleet> instanceFleets) {
        if (instanceFleets == null) {
            this.instanceFleets = null;
            return;
        }

        this.instanceFleets = new com.amazonaws.internal.SdkInternalList<InstanceFleet>(instanceFleets);
    }

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceFleets(java.util.Collection)} or {@link #withInstanceFleets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceFleets
     *        The list of instance fleets for the cluster and given filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceFleetsResult withInstanceFleets(InstanceFleet... instanceFleets) {
        if (this.instanceFleets == null) {
            setInstanceFleets(new com.amazonaws.internal.SdkInternalList<InstanceFleet>(instanceFleets.length));
        }
        for (InstanceFleet ele : instanceFleets) {
            this.instanceFleets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of instance fleets for the cluster and given filters.
     * </p>
     * 
     * @param instanceFleets
     *        The list of instance fleets for the cluster and given filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceFleetsResult withInstanceFleets(java.util.Collection<InstanceFleet> instanceFleets) {
        setInstanceFleets(instanceFleets);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstanceFleetsResult withMarker(String marker) {
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
        if (getInstanceFleets() != null)
            sb.append("InstanceFleets: ").append(getInstanceFleets()).append(",");
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

        if (obj instanceof ListInstanceFleetsResult == false)
            return false;
        ListInstanceFleetsResult other = (ListInstanceFleetsResult) obj;
        if (other.getInstanceFleets() == null ^ this.getInstanceFleets() == null)
            return false;
        if (other.getInstanceFleets() != null && other.getInstanceFleets().equals(this.getInstanceFleets()) == false)
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

        hashCode = prime * hashCode + ((getInstanceFleets() == null) ? 0 : getInstanceFleets().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListInstanceFleetsResult clone() {
        try {
            return (ListInstanceFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
