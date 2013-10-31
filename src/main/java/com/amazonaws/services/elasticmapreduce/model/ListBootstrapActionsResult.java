/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * This output contains the boostrap actions detail .
 * </p>
 */
public class ListBootstrapActionsResult implements Serializable {

    /**
     * The bootstrap actions associated with the cluster .
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Command> bootstrapActions;

    /**
     * The pagination token that indicates the next set of results to
     * retrieve .
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String marker;

    /**
     * The bootstrap actions associated with the cluster .
     *
     * @return The bootstrap actions associated with the cluster .
     */
    public java.util.List<Command> getBootstrapActions() {
        if (bootstrapActions == null) {
              bootstrapActions = new com.amazonaws.internal.ListWithAutoConstructFlag<Command>();
              bootstrapActions.setAutoConstruct(true);
        }
        return bootstrapActions;
    }
    
    /**
     * The bootstrap actions associated with the cluster .
     *
     * @param bootstrapActions The bootstrap actions associated with the cluster .
     */
    public void setBootstrapActions(java.util.Collection<Command> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Command> bootstrapActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Command>(bootstrapActions.size());
        bootstrapActionsCopy.addAll(bootstrapActions);
        this.bootstrapActions = bootstrapActionsCopy;
    }
    
    /**
     * The bootstrap actions associated with the cluster .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions The bootstrap actions associated with the cluster .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListBootstrapActionsResult withBootstrapActions(Command... bootstrapActions) {
        if (getBootstrapActions() == null) setBootstrapActions(new java.util.ArrayList<Command>(bootstrapActions.length));
        for (Command value : bootstrapActions) {
            getBootstrapActions().add(value);
        }
        return this;
    }
    
    /**
     * The bootstrap actions associated with the cluster .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions The bootstrap actions associated with the cluster .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListBootstrapActionsResult withBootstrapActions(java.util.Collection<Command> bootstrapActions) {
        if (bootstrapActions == null) {
            this.bootstrapActions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Command> bootstrapActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Command>(bootstrapActions.size());
            bootstrapActionsCopy.addAll(bootstrapActions);
            this.bootstrapActions = bootstrapActionsCopy;
        }

        return this;
    }

    /**
     * The pagination token that indicates the next set of results to
     * retrieve .
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The pagination token that indicates the next set of results to
     *         retrieve .
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve .
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve .
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The pagination token that indicates the next set of results to
     * retrieve .
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param marker The pagination token that indicates the next set of results to
     *         retrieve .
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListBootstrapActionsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBootstrapActions() != null) sb.append("BootstrapActions: " + getBootstrapActions() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListBootstrapActionsResult == false) return false;
        ListBootstrapActionsResult other = (ListBootstrapActionsResult)obj;
        
        if (other.getBootstrapActions() == null ^ this.getBootstrapActions() == null) return false;
        if (other.getBootstrapActions() != null && other.getBootstrapActions().equals(this.getBootstrapActions()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    