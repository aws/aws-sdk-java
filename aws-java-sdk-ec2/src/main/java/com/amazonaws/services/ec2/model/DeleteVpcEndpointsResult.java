/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * 
 */
public class DeleteVpcEndpointsResult implements Serializable, Cloneable {

    /**
     * Information about the endpoints that were not successfully deleted.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessful;

    /**
     * Information about the endpoints that were not successfully deleted.
     *
     * @return Information about the endpoints that were not successfully deleted.
     */
    public java.util.List<UnsuccessfulItem> getUnsuccessful() {
        if (unsuccessful == null) {
              unsuccessful = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>();
              unsuccessful.setAutoConstruct(true);
        }
        return unsuccessful;
    }
    
    /**
     * Information about the endpoints that were not successfully deleted.
     *
     * @param unsuccessful Information about the endpoints that were not successfully deleted.
     */
    public void setUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>(unsuccessful.size());
        unsuccessfulCopy.addAll(unsuccessful);
        this.unsuccessful = unsuccessfulCopy;
    }
    
    /**
     * Information about the endpoints that were not successfully deleted.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUnsuccessful(java.util.Collection)} or {@link
     * #withUnsuccessful(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unsuccessful Information about the endpoints that were not successfully deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteVpcEndpointsResult withUnsuccessful(UnsuccessfulItem... unsuccessful) {
        if (getUnsuccessful() == null) setUnsuccessful(new java.util.ArrayList<UnsuccessfulItem>(unsuccessful.length));
        for (UnsuccessfulItem value : unsuccessful) {
            getUnsuccessful().add(value);
        }
        return this;
    }
    
    /**
     * Information about the endpoints that were not successfully deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param unsuccessful Information about the endpoints that were not successfully deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteVpcEndpointsResult withUnsuccessful(java.util.Collection<UnsuccessfulItem> unsuccessful) {
        if (unsuccessful == null) {
            this.unsuccessful = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem> unsuccessfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UnsuccessfulItem>(unsuccessful.size());
            unsuccessfulCopy.addAll(unsuccessful);
            this.unsuccessful = unsuccessfulCopy;
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
        if (getUnsuccessful() != null) sb.append("Unsuccessful: " + getUnsuccessful() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUnsuccessful() == null) ? 0 : getUnsuccessful().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteVpcEndpointsResult == false) return false;
        DeleteVpcEndpointsResult other = (DeleteVpcEndpointsResult)obj;
        
        if (other.getUnsuccessful() == null ^ this.getUnsuccessful() == null) return false;
        if (other.getUnsuccessful() != null && other.getUnsuccessful().equals(this.getUnsuccessful()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteVpcEndpointsResult clone() {
        try {
            return (DeleteVpcEndpointsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    