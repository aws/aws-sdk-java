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
 * Contains a paginated list of information structures about workflow types.
 * </p>
 */
public class WorkflowTypeInfos implements Serializable {

    /**
     * The list of workflow type information.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowTypeInfo> typeInfos;

    /**
     * The token for the next page of type information. If set then the list
     * consists of more than one page. You can retrieve the next page by
     * repeating the request (that returned the structure) with the this
     * token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * The list of workflow type information.
     *
     * @return The list of workflow type information.
     */
    public java.util.List<WorkflowTypeInfo> getTypeInfos() {
        if (typeInfos == null) {
              typeInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowTypeInfo>();
              typeInfos.setAutoConstruct(true);
        }
        return typeInfos;
    }
    
    /**
     * The list of workflow type information.
     *
     * @param typeInfos The list of workflow type information.
     */
    public void setTypeInfos(java.util.Collection<WorkflowTypeInfo> typeInfos) {
        if (typeInfos == null) {
            this.typeInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowTypeInfo> typeInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowTypeInfo>(typeInfos.size());
        typeInfosCopy.addAll(typeInfos);
        this.typeInfos = typeInfosCopy;
    }
    
    /**
     * The list of workflow type information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param typeInfos The list of workflow type information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeInfos withTypeInfos(WorkflowTypeInfo... typeInfos) {
        if (getTypeInfos() == null) setTypeInfos(new java.util.ArrayList<WorkflowTypeInfo>(typeInfos.length));
        for (WorkflowTypeInfo value : typeInfos) {
            getTypeInfos().add(value);
        }
        return this;
    }
    
    /**
     * The list of workflow type information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param typeInfos The list of workflow type information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeInfos withTypeInfos(java.util.Collection<WorkflowTypeInfo> typeInfos) {
        if (typeInfos == null) {
            this.typeInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowTypeInfo> typeInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowTypeInfo>(typeInfos.size());
            typeInfosCopy.addAll(typeInfos);
            this.typeInfos = typeInfosCopy;
        }

        return this;
    }

    /**
     * The token for the next page of type information. If set then the list
     * consists of more than one page. You can retrieve the next page by
     * repeating the request (that returned the structure) with the this
     * token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return The token for the next page of type information. If set then the list
     *         consists of more than one page. You can retrieve the next page by
     *         repeating the request (that returned the structure) with the this
     *         token and all other arguments unchanged.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * The token for the next page of type information. If set then the list
     * consists of more than one page. You can retrieve the next page by
     * repeating the request (that returned the structure) with the this
     * token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken The token for the next page of type information. If set then the list
     *         consists of more than one page. You can retrieve the next page by
     *         repeating the request (that returned the structure) with the this
     *         token and all other arguments unchanged.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * The token for the next page of type information. If set then the list
     * consists of more than one page. You can retrieve the next page by
     * repeating the request (that returned the structure) with the this
     * token and all other arguments unchanged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken The token for the next page of type information. If set then the list
     *         consists of more than one page. You can retrieve the next page by
     *         repeating the request (that returned the structure) with the this
     *         token and all other arguments unchanged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public WorkflowTypeInfos withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getTypeInfos() != null) sb.append("TypeInfos: " + getTypeInfos() + ",");
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTypeInfos() == null) ? 0 : getTypeInfos().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowTypeInfos == false) return false;
        WorkflowTypeInfos other = (WorkflowTypeInfos)obj;
        
        if (other.getTypeInfos() == null ^ this.getTypeInfos() == null) return false;
        if (other.getTypeInfos() != null && other.getTypeInfos().equals(this.getTypeInfos()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        return true;
    }
    
}
    