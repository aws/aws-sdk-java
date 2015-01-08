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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the new provisioned throughput settings to apply to a
 * global secondary index.
 * </p>
 */
public class GlobalSecondaryIndexUpdate implements Serializable {

    /**
     * The name of a global secondary index, along with the updated
     * provisioned throughput settings that are to be applied to that index.
     */
    private UpdateGlobalSecondaryIndexAction update;

    /**
     * The name of a global secondary index, along with the updated
     * provisioned throughput settings that are to be applied to that index.
     *
     * @return The name of a global secondary index, along with the updated
     *         provisioned throughput settings that are to be applied to that index.
     */
    public UpdateGlobalSecondaryIndexAction getUpdate() {
        return update;
    }
    
    /**
     * The name of a global secondary index, along with the updated
     * provisioned throughput settings that are to be applied to that index.
     *
     * @param update The name of a global secondary index, along with the updated
     *         provisioned throughput settings that are to be applied to that index.
     */
    public void setUpdate(UpdateGlobalSecondaryIndexAction update) {
        this.update = update;
    }
    
    /**
     * The name of a global secondary index, along with the updated
     * provisioned throughput settings that are to be applied to that index.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param update The name of a global secondary index, along with the updated
     *         provisioned throughput settings that are to be applied to that index.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GlobalSecondaryIndexUpdate withUpdate(UpdateGlobalSecondaryIndexAction update) {
        this.update = update;
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
        if (getUpdate() != null) sb.append("Update: " + getUpdate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GlobalSecondaryIndexUpdate == false) return false;
        GlobalSecondaryIndexUpdate other = (GlobalSecondaryIndexUpdate)obj;
        
        if (other.getUpdate() == null ^ this.getUpdate() == null) return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false) return false; 
        return true;
    }
    
}
    