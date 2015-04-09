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
 * Container for the parameters to the {@link com.amazonaws.services.workspaces.AmazonWorkspaces#describeWorkspaces(DescribeWorkspacesRequest) DescribeWorkspaces operation}.
 * <p>
 * Obtains information about the specified WorkSpaces.
 * </p>
 * <p>
 * Only one of the filter parameters, such as <code>BundleId</code> ,
 * <code>DirectoryId</code> , or
 * <code>WorkspaceIds</code> , can be specified at a time.
 * </p>
 * <p>
 * This operation supports pagination with the use of the
 * <code>NextToken</code> request and response parameters. If more
 * results are available, the <code>NextToken</code> response member
 * contains a token that you pass in the next call to this operation to
 * retrieve the next set of items.
 * </p>
 *
 * @see com.amazonaws.services.workspaces.AmazonWorkspaces#describeWorkspaces(DescribeWorkspacesRequest)
 */
public class DescribeWorkspacesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An array of strings that contain the identifiers of the WorkSpaces for
     * which to retrieve information. This parameter cannot be combined with
     * any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     * operation is asynchronous, the identifier returned by
     * <a>CreateWorkspaces</a> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> workspaceIds;

    /**
     * Specifies the directory identifier to which to limit the WorkSpaces.
     * Optionally, you can specify a specific directory user with the
     * <code>UserName</code> parameter. This parameter cannot be combined
     * with any other filter parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     */
    private String directoryId;

    /**
     * Used with the <code>DirectoryId</code> parameter to specify the
     * directory user for which to obtain the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     */
    private String userName;

    /**
     * The identifier of a bundle to obtain the WorkSpaces for. All
     * WorkSpaces that are created from this bundle will be retrieved. This
     * parameter cannot be combined with any other filter parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     */
    private String bundleId;

    /**
     * The maximum number of items to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     */
    private Integer limit;

    /**
     * The <code>NextToken</code> value from a previous call to this
     * operation. Pass null if this is the first call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     */
    private String nextToken;

    /**
     * An array of strings that contain the identifiers of the WorkSpaces for
     * which to retrieve information. This parameter cannot be combined with
     * any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     * operation is asynchronous, the identifier returned by
     * <a>CreateWorkspaces</a> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return An array of strings that contain the identifiers of the WorkSpaces for
     *         which to retrieve information. This parameter cannot be combined with
     *         any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     *         operation is asynchronous, the identifier returned by
     *         <a>CreateWorkspaces</a> is not immediately available. If you
     *         immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information will be returned.
     */
    public java.util.List<String> getWorkspaceIds() {
        if (workspaceIds == null) {
              workspaceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              workspaceIds.setAutoConstruct(true);
        }
        return workspaceIds;
    }
    
    /**
     * An array of strings that contain the identifiers of the WorkSpaces for
     * which to retrieve information. This parameter cannot be combined with
     * any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     * operation is asynchronous, the identifier returned by
     * <a>CreateWorkspaces</a> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param workspaceIds An array of strings that contain the identifiers of the WorkSpaces for
     *         which to retrieve information. This parameter cannot be combined with
     *         any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     *         operation is asynchronous, the identifier returned by
     *         <a>CreateWorkspaces</a> is not immediately available. If you
     *         immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information will be returned.
     */
    public void setWorkspaceIds(java.util.Collection<String> workspaceIds) {
        if (workspaceIds == null) {
            this.workspaceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> workspaceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(workspaceIds.size());
        workspaceIdsCopy.addAll(workspaceIds);
        this.workspaceIds = workspaceIdsCopy;
    }
    
    /**
     * An array of strings that contain the identifiers of the WorkSpaces for
     * which to retrieve information. This parameter cannot be combined with
     * any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     * operation is asynchronous, the identifier returned by
     * <a>CreateWorkspaces</a> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param workspaceIds An array of strings that contain the identifiers of the WorkSpaces for
     *         which to retrieve information. This parameter cannot be combined with
     *         any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     *         operation is asynchronous, the identifier returned by
     *         <a>CreateWorkspaces</a> is not immediately available. If you
     *         immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information will be returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesRequest withWorkspaceIds(String... workspaceIds) {
        if (getWorkspaceIds() == null) setWorkspaceIds(new java.util.ArrayList<String>(workspaceIds.length));
        for (String value : workspaceIds) {
            getWorkspaceIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings that contain the identifiers of the WorkSpaces for
     * which to retrieve information. This parameter cannot be combined with
     * any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     * operation is asynchronous, the identifier returned by
     * <a>CreateWorkspaces</a> is not immediately available. If you
     * immediately call <a>DescribeWorkspaces</a> with this identifier, no
     * information will be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param workspaceIds An array of strings that contain the identifiers of the WorkSpaces for
     *         which to retrieve information. This parameter cannot be combined with
     *         any other filter parameter. <p>Because the <a>CreateWorkspaces</a>
     *         operation is asynchronous, the identifier returned by
     *         <a>CreateWorkspaces</a> is not immediately available. If you
     *         immediately call <a>DescribeWorkspaces</a> with this identifier, no
     *         information will be returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesRequest withWorkspaceIds(java.util.Collection<String> workspaceIds) {
        if (workspaceIds == null) {
            this.workspaceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> workspaceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(workspaceIds.size());
            workspaceIdsCopy.addAll(workspaceIds);
            this.workspaceIds = workspaceIdsCopy;
        }

        return this;
    }

    /**
     * Specifies the directory identifier to which to limit the WorkSpaces.
     * Optionally, you can specify a specific directory user with the
     * <code>UserName</code> parameter. This parameter cannot be combined
     * with any other filter parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @return Specifies the directory identifier to which to limit the WorkSpaces.
     *         Optionally, you can specify a specific directory user with the
     *         <code>UserName</code> parameter. This parameter cannot be combined
     *         with any other filter parameter.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * Specifies the directory identifier to which to limit the WorkSpaces.
     * Optionally, you can specify a specific directory user with the
     * <code>UserName</code> parameter. This parameter cannot be combined
     * with any other filter parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @param directoryId Specifies the directory identifier to which to limit the WorkSpaces.
     *         Optionally, you can specify a specific directory user with the
     *         <code>UserName</code> parameter. This parameter cannot be combined
     *         with any other filter parameter.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * Specifies the directory identifier to which to limit the WorkSpaces.
     * Optionally, you can specify a specific directory user with the
     * <code>UserName</code> parameter. This parameter cannot be combined
     * with any other filter parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{8,63}$<br/>
     *
     * @param directoryId Specifies the directory identifier to which to limit the WorkSpaces.
     *         Optionally, you can specify a specific directory user with the
     *         <code>UserName</code> parameter. This parameter cannot be combined
     *         with any other filter parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * Used with the <code>DirectoryId</code> parameter to specify the
     * directory user for which to obtain the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @return Used with the <code>DirectoryId</code> parameter to specify the
     *         directory user for which to obtain the WorkSpace.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Used with the <code>DirectoryId</code> parameter to specify the
     * directory user for which to obtain the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param userName Used with the <code>DirectoryId</code> parameter to specify the
     *         directory user for which to obtain the WorkSpace.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Used with the <code>DirectoryId</code> parameter to specify the
     * directory user for which to obtain the WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     *
     * @param userName Used with the <code>DirectoryId</code> parameter to specify the
     *         directory user for which to obtain the WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The identifier of a bundle to obtain the WorkSpaces for. All
     * WorkSpaces that are created from this bundle will be retrieved. This
     * parameter cannot be combined with any other filter parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @return The identifier of a bundle to obtain the WorkSpaces for. All
     *         WorkSpaces that are created from this bundle will be retrieved. This
     *         parameter cannot be combined with any other filter parameter.
     */
    public String getBundleId() {
        return bundleId;
    }
    
    /**
     * The identifier of a bundle to obtain the WorkSpaces for. All
     * WorkSpaces that are created from this bundle will be retrieved. This
     * parameter cannot be combined with any other filter parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @param bundleId The identifier of a bundle to obtain the WorkSpaces for. All
     *         WorkSpaces that are created from this bundle will be retrieved. This
     *         parameter cannot be combined with any other filter parameter.
     */
    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }
    
    /**
     * The identifier of a bundle to obtain the WorkSpaces for. All
     * WorkSpaces that are created from this bundle will be retrieved. This
     * parameter cannot be combined with any other filter parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^wsb-[0-9a-z]{8,63}$<br/>
     *
     * @param bundleId The identifier of a bundle to obtain the WorkSpaces for. All
     *         WorkSpaces that are created from this bundle will be retrieved. This
     *         parameter cannot be combined with any other filter parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesRequest withBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * The maximum number of items to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @return The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of items to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param limit The maximum number of items to return.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of items to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param limit The maximum number of items to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeWorkspacesRequest withLimit(Integer limit) {
        this.limit = limit;
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
    public DescribeWorkspacesRequest withNextToken(String nextToken) {
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
        if (getWorkspaceIds() != null) sb.append("WorkspaceIds: " + getWorkspaceIds() + ",");
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getBundleId() != null) sb.append("BundleId: " + getBundleId() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkspaceIds() == null) ? 0 : getWorkspaceIds().hashCode()); 
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode()); 
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeWorkspacesRequest == false) return false;
        DescribeWorkspacesRequest other = (DescribeWorkspacesRequest)obj;
        
        if (other.getWorkspaceIds() == null ^ this.getWorkspaceIds() == null) return false;
        if (other.getWorkspaceIds() != null && other.getWorkspaceIds().equals(this.getWorkspaceIds()) == false) return false; 
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getBundleId() == null ^ this.getBundleId() == null) return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeWorkspacesRequest clone() {
        
            return (DescribeWorkspacesRequest) super.clone();
    }

}
    