/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * ListVolumeInitiatorsOutput
 * </p>
 */
public class ListVolumeInitiatorsResult implements Serializable, Cloneable {

    /**
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> initiators;

    /**
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     *
     * @return The host names and port numbers of all iSCSI initiators that are
     *         connected to the gateway.
     */
    public java.util.List<String> getInitiators() {
        if (initiators == null) {
              initiators = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              initiators.setAutoConstruct(true);
        }
        return initiators;
    }
    
    /**
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     *
     * @param initiators The host names and port numbers of all iSCSI initiators that are
     *         connected to the gateway.
     */
    public void setInitiators(java.util.Collection<String> initiators) {
        if (initiators == null) {
            this.initiators = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> initiatorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(initiators.size());
        initiatorsCopy.addAll(initiators);
        this.initiators = initiatorsCopy;
    }
    
    /**
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInitiators(java.util.Collection)} or {@link
     * #withInitiators(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param initiators The host names and port numbers of all iSCSI initiators that are
     *         connected to the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListVolumeInitiatorsResult withInitiators(String... initiators) {
        if (getInitiators() == null) setInitiators(new java.util.ArrayList<String>(initiators.length));
        for (String value : initiators) {
            getInitiators().add(value);
        }
        return this;
    }
    
    /**
     * The host names and port numbers of all iSCSI initiators that are
     * connected to the gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param initiators The host names and port numbers of all iSCSI initiators that are
     *         connected to the gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListVolumeInitiatorsResult withInitiators(java.util.Collection<String> initiators) {
        if (initiators == null) {
            this.initiators = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> initiatorsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(initiators.size());
            initiatorsCopy.addAll(initiators);
            this.initiators = initiatorsCopy;
        }

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
        if (getInitiators() != null) sb.append("Initiators: " + getInitiators() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInitiators() == null) ? 0 : getInitiators().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListVolumeInitiatorsResult == false) return false;
        ListVolumeInitiatorsResult other = (ListVolumeInitiatorsResult)obj;
        
        if (other.getInitiators() == null ^ this.getInitiators() == null) return false;
        if (other.getInitiators() != null && other.getInitiators().equals(this.getInitiators()) == false) return false; 
        return true;
    }
    
    @Override
    public ListVolumeInitiatorsResult clone() {
        try {
            return (ListVolumeInitiatorsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    