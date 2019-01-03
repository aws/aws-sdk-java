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
 * <p>
 * This output contains the bootstrap actions detail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListBootstrapActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBootstrapActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Command> bootstrapActions;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     * 
     * @return The bootstrap actions associated with the cluster.
     */

    public java.util.List<Command> getBootstrapActions() {
        if (bootstrapActions == null) {
            bootstrapActions = new com.amazonaws.internal.SdkInternalList<Command>();
        }
        return bootstrapActions;
    }

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     * 
     * @param bootstrapActions
     *        The bootstrap actions associated with the cluster.
     */

    public void setBootstrapActions(java.util.Collection<Command> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }

        this.bootstrapActions = new com.amazonaws.internal.SdkInternalList<Command>(bootstrapActions);
    }

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBootstrapActions(java.util.Collection)} or {@link #withBootstrapActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param bootstrapActions
     *        The bootstrap actions associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBootstrapActionsResult withBootstrapActions(Command... bootstrapActions) {
        if (this.bootstrapActions == null) {
            setBootstrapActions(new com.amazonaws.internal.SdkInternalList<Command>(bootstrapActions.length));
        }
        for (Command ele : bootstrapActions) {
            this.bootstrapActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The bootstrap actions associated with the cluster.
     * </p>
     * 
     * @param bootstrapActions
     *        The bootstrap actions associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBootstrapActionsResult withBootstrapActions(java.util.Collection<Command> bootstrapActions) {
        setBootstrapActions(bootstrapActions);
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

    public ListBootstrapActionsResult withMarker(String marker) {
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
        if (getBootstrapActions() != null)
            sb.append("BootstrapActions: ").append(getBootstrapActions()).append(",");
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

        if (obj instanceof ListBootstrapActionsResult == false)
            return false;
        ListBootstrapActionsResult other = (ListBootstrapActionsResult) obj;
        if (other.getBootstrapActions() == null ^ this.getBootstrapActions() == null)
            return false;
        if (other.getBootstrapActions() != null && other.getBootstrapActions().equals(this.getBootstrapActions()) == false)
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

        hashCode = prime * hashCode + ((getBootstrapActions() == null) ? 0 : getBootstrapActions().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListBootstrapActionsResult clone() {
        try {
            return (ListBootstrapActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
