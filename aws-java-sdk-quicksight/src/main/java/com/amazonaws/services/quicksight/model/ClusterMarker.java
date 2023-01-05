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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The cluster marker that is a part of the cluster marker configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ClusterMarker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterMarker implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The simple cluster marker of the cluster marker.
     * </p>
     */
    private SimpleClusterMarker simpleClusterMarker;

    /**
     * <p>
     * The simple cluster marker of the cluster marker.
     * </p>
     * 
     * @param simpleClusterMarker
     *        The simple cluster marker of the cluster marker.
     */

    public void setSimpleClusterMarker(SimpleClusterMarker simpleClusterMarker) {
        this.simpleClusterMarker = simpleClusterMarker;
    }

    /**
     * <p>
     * The simple cluster marker of the cluster marker.
     * </p>
     * 
     * @return The simple cluster marker of the cluster marker.
     */

    public SimpleClusterMarker getSimpleClusterMarker() {
        return this.simpleClusterMarker;
    }

    /**
     * <p>
     * The simple cluster marker of the cluster marker.
     * </p>
     * 
     * @param simpleClusterMarker
     *        The simple cluster marker of the cluster marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterMarker withSimpleClusterMarker(SimpleClusterMarker simpleClusterMarker) {
        setSimpleClusterMarker(simpleClusterMarker);
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
        if (getSimpleClusterMarker() != null)
            sb.append("SimpleClusterMarker: ").append(getSimpleClusterMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterMarker == false)
            return false;
        ClusterMarker other = (ClusterMarker) obj;
        if (other.getSimpleClusterMarker() == null ^ this.getSimpleClusterMarker() == null)
            return false;
        if (other.getSimpleClusterMarker() != null && other.getSimpleClusterMarker().equals(this.getSimpleClusterMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleClusterMarker() == null) ? 0 : getSimpleClusterMarker().hashCode());
        return hashCode;
    }

    @Override
    public ClusterMarker clone() {
        try {
            return (ClusterMarker) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ClusterMarkerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
