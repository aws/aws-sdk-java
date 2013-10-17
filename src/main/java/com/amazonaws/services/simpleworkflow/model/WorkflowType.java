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
 * Represents a workflow type.
 * </p>
 */
public class WorkflowType implements Serializable {

    /**
     * The name of the workflow type. This field is required. <note>The
     * combination of workflow type name and version must be unique with in a
     * domain.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * The version of the workflow type. This field is required. <note>The
     * combination of workflow type name and version must be unique with in a
     * domain.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String version;

    /**
     * The name of the workflow type. This field is required. <note>The
     * combination of workflow type name and version must be unique with in a
     * domain.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the workflow type. This field is required. <note>The
     *         combination of workflow type name and version must be unique with in a
     *         domain.</note>
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the workflow type. This field is required. <note>The
     * combination of workflow type name and version must be unique with in a
     * domain.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the workflow type. This field is required. <note>The
     *         combination of workflow type name and version must be unique with in a
     *         domain.</note>
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the workflow type. This field is required. <note>The
     * combination of workflow type name and version must be unique with in a
     * domain.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the workflow type. This field is required. <note>The
     *         combination of workflow type name and version must be unique with in a
     *         domain.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The version of the workflow type. This field is required. <note>The
     * combination of workflow type name and version must be unique with in a
     * domain.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The version of the workflow type. This field is required. <note>The
     *         combination of workflow type name and version must be unique with in a
     *         domain.</note>
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The version of the workflow type. This field is required. <note>The
     * combination of workflow type name and version must be unique with in a
     * domain.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param version The version of the workflow type. This field is required. <note>The
     *         combination of workflow type name and version must be unique with in a
     *         domain.</note>
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The version of the workflow type. This field is required. <note>The
     * combination of workflow type name and version must be unique with in a
     * domain.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param version The version of the workflow type. This field is required. <note>The
     *         combination of workflow type name and version must be unique with in a
     *         domain.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowType withVersion(String version) {
        this.version = version;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowType == false) return false;
        WorkflowType other = (WorkflowType)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        return true;
    }
    
}
    