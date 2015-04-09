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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.workspaces.AmazonWorkspaces#describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest) DescribeWorkspaceDirectories operation}.
 * <p>
 * Retrieves information about the AWS Directory Service directories in
 * the region that are registered with Amazon WorkSpaces and are
 * available to your account.
 * </p>
 * <p>
 * This operation supports pagination with the use of the
 * <code>NextToken</code> request and response parameters. If more
 * results are available, the <code>NextToken</code> response member
 * contains a token that you pass in the next call to this operation to
 * retrieve the next set of items.
 * </p>
 *
 * @see com.amazonaws.services.workspaces.AmazonWorkspaces#describeWorkspaceDirectories(DescribeWorkspaceDirectoriesRequest)
 */
public class DescribeWorkspaceDirectoriesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An array of strings that contains the directory identifiers to
     * retrieve information for. If this member is null, all directories are
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> directoryIds;

    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     */
    private String nextToken;

    /**
     * An array of strings that contains the directory identifiers to
     * retrieve information for. If this member is null, all directories are
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return An array of strings that contains the directory identifiers to
     *         retrieve information for. If this member is null, all directories are
     *         retrieved.
     */
    public java.util.List<String> getDirectoryIds() {
        if (directoryIds == null) {
              directoryIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              directoryIds.setAutoConstruct(true);
        }
        return directoryIds;
    }
    
    /**
     * An array of strings that contains the directory identifiers to
     * retrieve information for. If this member is null, all directories are
     * retrieved.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param directoryIds An array of strings that contains the directory identifiers to
     *         retrieve information for. If this member is null, all directories are
     *         retrieved.
     */
    public void setDirectoryIds(java.util.Collection<String> directoryIds) {
        if (directoryIds == null) {
            this.directoryIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> directoryIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(directoryIds.size());
        directoryIdsCopy.addAll(directoryIds);
        this.directoryIds = directoryIdsCopy;
    }
    
    /**
     * An array of strings that contains the directory identifiers to
     * retrieve information for. If this member is null, all directories are
     * retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param directoryIds An array of strings that contains the directory identifiers to
     *         retrieve information for. If this member is null, all directories are
     *         retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceDirectoriesRequest withDirectoryIds(String... directoryIds) {
        if (getDirectoryIds() == null) setDirectoryIds(new java.util.ArrayList<String>(directoryIds.length));
        for (String value : directoryIds) {
            getDirectoryIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings that contains the directory identifiers to
     * retrieve information for. If this member is null, all directories are
     * retrieved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param directoryIds An array of strings that contains the directory identifiers to
     *         retrieve information for. If this member is null, all directories are
     *         retrieved.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceDirectoriesRequest withDirectoryIds(java.util.Collection<String> directoryIds) {
        if (directoryIds == null) {
            this.directoryIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> directoryIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(directoryIds.size());
            directoryIdsCopy.addAll(directoryIds);
            this.directoryIds = directoryIdsCopy;
        }

        return this;
    }

    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @return The <code>NextToken</code> value from a previous call to this
     *         operation. Pass null if this is the first call.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param nextToken The <code>NextToken</code> value from a previous call to this
     *         operation. Pass null if this is the first call.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param nextToken The <code>NextToken</code> value from a previous call to this
     *         operation. Pass null if this is the first call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspaceDirectoriesRequest withNextToken(String nextToken) {
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
        if (getDirectoryIds() != null) sb.append("DirectoryIds: " + getDirectoryIds() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectoryIds() == null) ? 0 : getDirectoryIds().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeWorkspaceDirectoriesRequest == false) return false;
        DescribeWorkspaceDirectoriesRequest other = (DescribeWorkspaceDirectoriesRequest)obj;
        
        if (other.getDirectoryIds() == null ^ this.getDirectoryIds() == null) return false;
        if (other.getDirectoryIds() != null && other.getDirectoryIds().equals(this.getDirectoryIds()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeWorkspaceDirectoriesRequest clone() {
        
            return (DescribeWorkspaceDirectoriesRequest) super.clone();
    }

}
    