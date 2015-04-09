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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results for the DescribeWorkspaces operation.
 * </p>
 */
public class DescribeWorkspacesResult implements Serializable, Cloneable {

    /**
     * An array of structures that contain the information about the
     * WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     * asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Workspace> workspaces;

    /**
     * If not null, more results are available. Pass this value for the
     * <code>NextToken</code> parameter in a subsequent call to this
     * operation to retrieve the next set of items. This token is valid for
     * one day and must be used within that timeframe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     */
    private String nextToken;

    /**
     * An array of structures that contain the information about the
     * WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     * asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     *
     * @return An array of structures that contain the information about the
     *         WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     *         asynchronous, some of this information may be incomplete for a
     *         newly-created WorkSpace.
     */
    public java.util.List<Workspace> getWorkspaces() {
        if (workspaces == null) {
              workspaces = new com.amazonaws.internal.ListWithAutoConstructFlag<Workspace>();
              workspaces.setAutoConstruct(true);
        }
        return workspaces;
    }
    
    /**
     * An array of structures that contain the information about the
     * WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     * asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     *
     * @param workspaces An array of structures that contain the information about the
     *         WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     *         asynchronous, some of this information may be incomplete for a
     *         newly-created WorkSpace.
     */
    public void setWorkspaces(java.util.Collection<Workspace> workspaces) {
        if (workspaces == null) {
            this.workspaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Workspace> workspacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Workspace>(workspaces.size());
        workspacesCopy.addAll(workspaces);
        this.workspaces = workspacesCopy;
    }
    
    /**
     * An array of structures that contain the information about the
     * WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     * asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workspaces An array of structures that contain the information about the
     *         WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     *         asynchronous, some of this information may be incomplete for a
     *         newly-created WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesResult withWorkspaces(Workspace... workspaces) {
        if (getWorkspaces() == null) setWorkspaces(new java.util.ArrayList<Workspace>(workspaces.length));
        for (Workspace value : workspaces) {
            getWorkspaces().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that contain the information about the
     * WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     * asynchronous, some of this information may be incomplete for a
     * newly-created WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workspaces An array of structures that contain the information about the
     *         WorkSpaces. <p>Because the <a>CreateWorkspaces</a> operation is
     *         asynchronous, some of this information may be incomplete for a
     *         newly-created WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesResult withWorkspaces(java.util.Collection<Workspace> workspaces) {
        if (workspaces == null) {
            this.workspaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Workspace> workspacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Workspace>(workspaces.size());
            workspacesCopy.addAll(workspaces);
            this.workspaces = workspacesCopy;
        }

        return this;
    }

    /**
     * If not null, more results are available. Pass this value for the
     * <code>NextToken</code> parameter in a subsequent call to this
     * operation to retrieve the next set of items. This token is valid for
     * one day and must be used within that timeframe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @return If not null, more results are available. Pass this value for the
     *         <code>NextToken</code> parameter in a subsequent call to this
     *         operation to retrieve the next set of items. This token is valid for
     *         one day and must be used within that timeframe.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this value for the
     * <code>NextToken</code> parameter in a subsequent call to this
     * operation to retrieve the next set of items. This token is valid for
     * one day and must be used within that timeframe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param nextToken If not null, more results are available. Pass this value for the
     *         <code>NextToken</code> parameter in a subsequent call to this
     *         operation to retrieve the next set of items. This token is valid for
     *         one day and must be used within that timeframe.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If not null, more results are available. Pass this value for the
     * <code>NextToken</code> parameter in a subsequent call to this
     * operation to retrieve the next set of items. This token is valid for
     * one day and must be used within that timeframe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param nextToken If not null, more results are available. Pass this value for the
     *         <code>NextToken</code> parameter in a subsequent call to this
     *         operation to retrieve the next set of items. This token is valid for
     *         one day and must be used within that timeframe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getWorkspaces() != null) sb.append("Workspaces: " + getWorkspaces() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkspaces() == null) ? 0 : getWorkspaces().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeWorkspacesResult == false) return false;
        DescribeWorkspacesResult other = (DescribeWorkspacesResult)obj;
        
        if (other.getWorkspaces() == null ^ this.getWorkspaces() == null) return false;
        if (other.getWorkspaces() != null && other.getWorkspaces().equals(this.getWorkspaces()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeWorkspacesResult clone() {
        try {
            return (DescribeWorkspacesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    