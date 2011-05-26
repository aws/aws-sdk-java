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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * Contains Availability Zone information.
 * </p>
 * <p>
 * This data type is used as an element in the following data type:
 * <ul>
 * <li> OrderableDBInstanceOption </li>
 * 
 * </ul>
 * 
 * </p>
 */
public class AvailabilityZone {

    /**
     * The name of the availability zone.
     */
    private String name;

    /**
     * The name of the availability zone.
     *
     * @return The name of the availability zone.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the availability zone.
     *
     * @param name The name of the availability zone.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the availability zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the availability zone.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AvailabilityZone withName(String name) {
        this.name = name;
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
        sb.append("Name: " + name + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    