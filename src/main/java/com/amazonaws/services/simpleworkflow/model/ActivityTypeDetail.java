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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Detailed information about an activity type.
 * </p>
 */
public class ActivityTypeDetail implements Serializable {

    /**
     * General information about the activity type. <p> The status of
     * activity type (returned in the ActivityTypeInfo structure) can be one
     * of the following. <ul> <li> <b>REGISTERED</b>: The type is registered
     * and available. Workers supporting this type should be running. </li>
     * <li> <b>DEPRECATED</b>: The type was deprecated using
     * <a>DeprecateActivityType</a>, but is still in use. You should keep
     * workers supporting this type running. You cannot create new tasks of
     * this type. </li> </ul>
     */
    private ActivityTypeInfo typeInfo;

    /**
     * The configuration settings registered with the activity type.
     */
    private ActivityTypeConfiguration configuration;

    /**
     * General information about the activity type. <p> The status of
     * activity type (returned in the ActivityTypeInfo structure) can be one
     * of the following. <ul> <li> <b>REGISTERED</b>: The type is registered
     * and available. Workers supporting this type should be running. </li>
     * <li> <b>DEPRECATED</b>: The type was deprecated using
     * <a>DeprecateActivityType</a>, but is still in use. You should keep
     * workers supporting this type running. You cannot create new tasks of
     * this type. </li> </ul>
     *
     * @return General information about the activity type. <p> The status of
     *         activity type (returned in the ActivityTypeInfo structure) can be one
     *         of the following. <ul> <li> <b>REGISTERED</b>: The type is registered
     *         and available. Workers supporting this type should be running. </li>
     *         <li> <b>DEPRECATED</b>: The type was deprecated using
     *         <a>DeprecateActivityType</a>, but is still in use. You should keep
     *         workers supporting this type running. You cannot create new tasks of
     *         this type. </li> </ul>
     */
    public ActivityTypeInfo getTypeInfo() {
        return typeInfo;
    }
    
    /**
     * General information about the activity type. <p> The status of
     * activity type (returned in the ActivityTypeInfo structure) can be one
     * of the following. <ul> <li> <b>REGISTERED</b>: The type is registered
     * and available. Workers supporting this type should be running. </li>
     * <li> <b>DEPRECATED</b>: The type was deprecated using
     * <a>DeprecateActivityType</a>, but is still in use. You should keep
     * workers supporting this type running. You cannot create new tasks of
     * this type. </li> </ul>
     *
     * @param typeInfo General information about the activity type. <p> The status of
     *         activity type (returned in the ActivityTypeInfo structure) can be one
     *         of the following. <ul> <li> <b>REGISTERED</b>: The type is registered
     *         and available. Workers supporting this type should be running. </li>
     *         <li> <b>DEPRECATED</b>: The type was deprecated using
     *         <a>DeprecateActivityType</a>, but is still in use. You should keep
     *         workers supporting this type running. You cannot create new tasks of
     *         this type. </li> </ul>
     */
    public void setTypeInfo(ActivityTypeInfo typeInfo) {
        this.typeInfo = typeInfo;
    }
    
    /**
     * General information about the activity type. <p> The status of
     * activity type (returned in the ActivityTypeInfo structure) can be one
     * of the following. <ul> <li> <b>REGISTERED</b>: The type is registered
     * and available. Workers supporting this type should be running. </li>
     * <li> <b>DEPRECATED</b>: The type was deprecated using
     * <a>DeprecateActivityType</a>, but is still in use. You should keep
     * workers supporting this type running. You cannot create new tasks of
     * this type. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param typeInfo General information about the activity type. <p> The status of
     *         activity type (returned in the ActivityTypeInfo structure) can be one
     *         of the following. <ul> <li> <b>REGISTERED</b>: The type is registered
     *         and available. Workers supporting this type should be running. </li>
     *         <li> <b>DEPRECATED</b>: The type was deprecated using
     *         <a>DeprecateActivityType</a>, but is still in use. You should keep
     *         workers supporting this type running. You cannot create new tasks of
     *         this type. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeDetail withTypeInfo(ActivityTypeInfo typeInfo) {
        this.typeInfo = typeInfo;
        return this;
    }

    /**
     * The configuration settings registered with the activity type.
     *
     * @return The configuration settings registered with the activity type.
     */
    public ActivityTypeConfiguration getConfiguration() {
        return configuration;
    }
    
    /**
     * The configuration settings registered with the activity type.
     *
     * @param configuration The configuration settings registered with the activity type.
     */
    public void setConfiguration(ActivityTypeConfiguration configuration) {
        this.configuration = configuration;
    }
    
    /**
     * The configuration settings registered with the activity type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configuration The configuration settings registered with the activity type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeDetail withConfiguration(ActivityTypeConfiguration configuration) {
        this.configuration = configuration;
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
        if (getTypeInfo() != null) sb.append("TypeInfo: " + getTypeInfo() + ",");
        if (getConfiguration() != null) sb.append("Configuration: " + getConfiguration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTypeInfo() == null) ? 0 : getTypeInfo().hashCode()); 
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTypeDetail == false) return false;
        ActivityTypeDetail other = (ActivityTypeDetail)obj;
        
        if (other.getTypeInfo() == null ^ this.getTypeInfo() == null) return false;
        if (other.getTypeInfo() != null && other.getTypeInfo().equals(this.getTypeInfo()) == false) return false; 
        if (other.getConfiguration() == null ^ this.getConfiguration() == null) return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false) return false; 
        return true;
    }
    
}
    