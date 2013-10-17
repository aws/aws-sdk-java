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
package com.amazonaws.services.route53.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type that contains the information for each change in a change batch request.
 * </p>
 */
public class Change implements Serializable {

    /**
     * The action to perform. <p>Valid values: <code>CREATE</code> |
     * <code>DELETE</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE
     */
    private String action;

    /**
     * Information about the resource record set to create or delete.
     */
    private ResourceRecordSet resourceRecordSet;

    /**
     * Default constructor for a new Change object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Change() {}
    
    /**
     * Constructs a new Change object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param action The action to perform. <p>Valid values:
     * <code>CREATE</code> | <code>DELETE</code>
     * @param resourceRecordSet Information about the resource record set to
     * create or delete.
     */
    public Change(String action, ResourceRecordSet resourceRecordSet) {
        setAction(action);
        setResourceRecordSet(resourceRecordSet);
    }

    /**
     * Constructs a new Change object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param action The action to perform. <p>Valid values:
     * <code>CREATE</code> | <code>DELETE</code>
     * @param resourceRecordSet Information about the resource record set to
     * create or delete.
     */
    public Change(ChangeAction action, ResourceRecordSet resourceRecordSet) {
        this.action = action.toString();
        this.resourceRecordSet = resourceRecordSet;
    }

    /**
     * The action to perform. <p>Valid values: <code>CREATE</code> |
     * <code>DELETE</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE
     *
     * @return The action to perform. <p>Valid values: <code>CREATE</code> |
     *         <code>DELETE</code>
     *
     * @see ChangeAction
     */
    public String getAction() {
        return action;
    }
    
    /**
     * The action to perform. <p>Valid values: <code>CREATE</code> |
     * <code>DELETE</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE
     *
     * @param action The action to perform. <p>Valid values: <code>CREATE</code> |
     *         <code>DELETE</code>
     *
     * @see ChangeAction
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * The action to perform. <p>Valid values: <code>CREATE</code> |
     * <code>DELETE</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE
     *
     * @param action The action to perform. <p>Valid values: <code>CREATE</code> |
     *         <code>DELETE</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChangeAction
     */
    public Change withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * The action to perform. <p>Valid values: <code>CREATE</code> |
     * <code>DELETE</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE
     *
     * @param action The action to perform. <p>Valid values: <code>CREATE</code> |
     *         <code>DELETE</code>
     *
     * @see ChangeAction
     */
    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }
    
    /**
     * The action to perform. <p>Valid values: <code>CREATE</code> |
     * <code>DELETE</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, DELETE
     *
     * @param action The action to perform. <p>Valid values: <code>CREATE</code> |
     *         <code>DELETE</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChangeAction
     */
    public Change withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * Information about the resource record set to create or delete.
     *
     * @return Information about the resource record set to create or delete.
     */
    public ResourceRecordSet getResourceRecordSet() {
        return resourceRecordSet;
    }
    
    /**
     * Information about the resource record set to create or delete.
     *
     * @param resourceRecordSet Information about the resource record set to create or delete.
     */
    public void setResourceRecordSet(ResourceRecordSet resourceRecordSet) {
        this.resourceRecordSet = resourceRecordSet;
    }
    
    /**
     * Information about the resource record set to create or delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceRecordSet Information about the resource record set to create or delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Change withResourceRecordSet(ResourceRecordSet resourceRecordSet) {
        this.resourceRecordSet = resourceRecordSet;
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
        if (getAction() != null) sb.append("Action: " + getAction() + ",");
        if (getResourceRecordSet() != null) sb.append("ResourceRecordSet: " + getResourceRecordSet() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode()); 
        hashCode = prime * hashCode + ((getResourceRecordSet() == null) ? 0 : getResourceRecordSet().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Change == false) return false;
        Change other = (Change)obj;
        
        if (other.getAction() == null ^ this.getAction() == null) return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false) return false; 
        if (other.getResourceRecordSet() == null ^ this.getResourceRecordSet() == null) return false;
        if (other.getResourceRecordSet() != null && other.getResourceRecordSet().equals(this.getResourceRecordSet()) == false) return false; 
        return true;
    }
    
}
    