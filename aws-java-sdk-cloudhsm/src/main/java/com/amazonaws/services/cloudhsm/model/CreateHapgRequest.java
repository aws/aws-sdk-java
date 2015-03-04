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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#createHapg(CreateHapgRequest) CreateHapg operation}.
 * <p>
 * Creates a high-availability partition group. A high-availability
 * partition group is a group of partitions that spans multiple physical
 * HSMs.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#createHapg(CreateHapgRequest)
 */
public class CreateHapgRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The label of the new high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     */
    private String label;

    /**
     * The label of the new high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @return The label of the new high-availability partition group.
     */
    public String getLabel() {
        return label;
    }
    
    /**
     * The label of the new high-availability partition group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @param label The label of the new high-availability partition group.
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    /**
     * The label of the new high-availability partition group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]{1,64}<br/>
     *
     * @param label The label of the new high-availability partition group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateHapgRequest withLabel(String label) {
        this.label = label;
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
        if (getLabel() != null) sb.append("Label: " + getLabel() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateHapgRequest == false) return false;
        CreateHapgRequest other = (CreateHapgRequest)obj;
        
        if (other.getLabel() == null ^ this.getLabel() == null) return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateHapgRequest clone() {
        
            return (CreateHapgRequest) super.clone();
    }

}
    