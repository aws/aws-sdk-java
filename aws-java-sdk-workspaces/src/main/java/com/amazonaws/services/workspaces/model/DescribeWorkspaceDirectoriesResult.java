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
 * Contains the results of the DescribeWorkspaceDirectories operation.
 * </p>
 */
public class DescribeWorkspaceDirectoriesResult implements Serializable, Cloneable {

    /**
     * An array of structures that contain information about the directories.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceDirectory> directories;

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
     * An array of structures that contain information about the directories.
     *
     * @return An array of structures that contain information about the directories.
     */
    public java.util.List<WorkspaceDirectory> getDirectories() {
        if (directories == null) {
              directories = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceDirectory>();
              directories.setAutoConstruct(true);
        }
        return directories;
    }
    
    /**
     * An array of structures that contain information about the directories.
     *
     * @param directories An array of structures that contain information about the directories.
     */
    public void setDirectories(java.util.Collection<WorkspaceDirectory> directories) {
        if (directories == null) {
            this.directories = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceDirectory> directoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceDirectory>(directories.size());
        directoriesCopy.addAll(directories);
        this.directories = directoriesCopy;
    }
    
    /**
     * An array of structures that contain information about the directories.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDirectories(java.util.Collection)} or {@link
     * #withDirectories(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param directories An array of structures that contain information about the directories.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceDirectoriesResult withDirectories(WorkspaceDirectory... directories) {
        if (getDirectories() == null) setDirectories(new java.util.ArrayList<WorkspaceDirectory>(directories.length));
        for (WorkspaceDirectory value : directories) {
            getDirectories().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that contain information about the directories.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param directories An array of structures that contain information about the directories.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceDirectoriesResult withDirectories(java.util.Collection<WorkspaceDirectory> directories) {
        if (directories == null) {
            this.directories = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceDirectory> directoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkspaceDirectory>(directories.size());
            directoriesCopy.addAll(directories);
            this.directories = directoriesCopy;
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
    public DescribeWorkspaceDirectoriesResult withNextToken(String nextToken) {
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
        if (getDirectories() != null) sb.append("Directories: " + getDirectories() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectories() == null) ? 0 : getDirectories().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeWorkspaceDirectoriesResult == false) return false;
        DescribeWorkspaceDirectoriesResult other = (DescribeWorkspaceDirectoriesResult)obj;
        
        if (other.getDirectories() == null ^ this.getDirectories() == null) return false;
        if (other.getDirectories() != null && other.getDirectories().equals(this.getDirectories()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeWorkspaceDirectoriesResult clone() {
        try {
            return (DescribeWorkspaceDirectoriesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    