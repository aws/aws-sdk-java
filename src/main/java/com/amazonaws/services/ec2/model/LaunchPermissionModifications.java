/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * Launch Permission Modifications
 */
public class LaunchPermissionModifications {

    private java.util.List<LaunchPermission> add;

    private java.util.List<LaunchPermission> remove;

    /**
     * Returns the value of the Add property for this object.
     *
     * @return The value of the Add property for this object.
     */
    public java.util.List<LaunchPermission> getAdd() {
        
        if (add == null) {
            add = new java.util.ArrayList<LaunchPermission>();
        }
        return add;
    }
    
    /**
     * Sets the value of the Add property for this object.
     *
     * @param add The new value for the Add property for this object.
     */
    public void setAdd(java.util.Collection<LaunchPermission> add) {
        java.util.List<LaunchPermission> addCopy = new java.util.ArrayList<LaunchPermission>();
        if (add != null) {
            addCopy.addAll(add);
        }
        this.add = addCopy;
    }
    
    /**
     * Sets the value of the Add property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param add The new value for the Add property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchPermissionModifications withAdd(LaunchPermission... add) {
        if (getAdd() == null) setAdd(new java.util.ArrayList<LaunchPermission>());
        for (LaunchPermission value : add) {
            getAdd().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Add property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param add The new value for the Add property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchPermissionModifications withAdd(java.util.Collection<LaunchPermission> add) {
        java.util.List<LaunchPermission> addCopy = new java.util.ArrayList<LaunchPermission>();
        if (add != null) {
            addCopy.addAll(add);
        }
        this.add = addCopy;

        return this;
    }
    
    /**
     * Returns the value of the Remove property for this object.
     *
     * @return The value of the Remove property for this object.
     */
    public java.util.List<LaunchPermission> getRemove() {
        
        if (remove == null) {
            remove = new java.util.ArrayList<LaunchPermission>();
        }
        return remove;
    }
    
    /**
     * Sets the value of the Remove property for this object.
     *
     * @param remove The new value for the Remove property for this object.
     */
    public void setRemove(java.util.Collection<LaunchPermission> remove) {
        java.util.List<LaunchPermission> removeCopy = new java.util.ArrayList<LaunchPermission>();
        if (remove != null) {
            removeCopy.addAll(remove);
        }
        this.remove = removeCopy;
    }
    
    /**
     * Sets the value of the Remove property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remove The new value for the Remove property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchPermissionModifications withRemove(LaunchPermission... remove) {
        if (getRemove() == null) setRemove(new java.util.ArrayList<LaunchPermission>());
        for (LaunchPermission value : remove) {
            getRemove().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Remove property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param remove The new value for the Remove property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LaunchPermissionModifications withRemove(java.util.Collection<LaunchPermission> remove) {
        java.util.List<LaunchPermission> removeCopy = new java.util.ArrayList<LaunchPermission>();
        if (remove != null) {
            removeCopy.addAll(remove);
        }
        this.remove = removeCopy;

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
        sb.append("Add: " + add + ", ");
        sb.append("Remove: " + remove + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    