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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#describeDirectories(DescribeDirectoriesRequest) DescribeDirectories operation}.
 * <p>
 * Obtains information about the directories that belong to this account.
 * </p>
 * <p>
 * You can retrieve information about specific directories by passing the
 * directory identifiers in the <i>DirectoryIds</i> parameter. Otherwise,
 * all directories that belong to the current account are returned.
 * </p>
 * <p>
 * This operation supports pagination with the use of the
 * <i>NextToken</i> request and response parameters. If more results are
 * available, the <i>DescribeDirectoriesResult.NextToken</i> member
 * contains a token that you pass in the next call to DescribeDirectories
 * to retrieve the next set of items.
 * </p>
 * <p>
 * You can also specify a maximum number of return results with the
 * <i>Limit</i> parameter.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#describeDirectories(DescribeDirectoriesRequest)
 */
public class DescribeDirectoriesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A list of identifiers of the directories to obtain the information
     * for. If this member is null, all directories that belong to the
     * current account are returned. <p>An empty list results in an
     * <code>InvalidParameterException</code> being thrown.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> directoryIds;

    /**
     * The <i>DescribeDirectoriesResult.NextToken</i> value from a previous
     * call to <a>DescribeDirectories</a>. Pass null if this is the first
     * call.
     */
    private String nextToken;

    /**
     * The maximum number of items to return. If this value is zero, the
     * maximum number of items is specified by the limitations of the
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer limit;

    /**
     * A list of identifiers of the directories to obtain the information
     * for. If this member is null, all directories that belong to the
     * current account are returned. <p>An empty list results in an
     * <code>InvalidParameterException</code> being thrown.
     *
     * @return A list of identifiers of the directories to obtain the information
     *         for. If this member is null, all directories that belong to the
     *         current account are returned. <p>An empty list results in an
     *         <code>InvalidParameterException</code> being thrown.
     */
    public java.util.List<String> getDirectoryIds() {
        if (directoryIds == null) {
              directoryIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              directoryIds.setAutoConstruct(true);
        }
        return directoryIds;
    }
    
    /**
     * A list of identifiers of the directories to obtain the information
     * for. If this member is null, all directories that belong to the
     * current account are returned. <p>An empty list results in an
     * <code>InvalidParameterException</code> being thrown.
     *
     * @param directoryIds A list of identifiers of the directories to obtain the information
     *         for. If this member is null, all directories that belong to the
     *         current account are returned. <p>An empty list results in an
     *         <code>InvalidParameterException</code> being thrown.
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
     * A list of identifiers of the directories to obtain the information
     * for. If this member is null, all directories that belong to the
     * current account are returned. <p>An empty list results in an
     * <code>InvalidParameterException</code> being thrown.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDirectoryIds(java.util.Collection)} or {@link
     * #withDirectoryIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param directoryIds A list of identifiers of the directories to obtain the information
     *         for. If this member is null, all directories that belong to the
     *         current account are returned. <p>An empty list results in an
     *         <code>InvalidParameterException</code> being thrown.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDirectoriesRequest withDirectoryIds(String... directoryIds) {
        if (getDirectoryIds() == null) setDirectoryIds(new java.util.ArrayList<String>(directoryIds.length));
        for (String value : directoryIds) {
            getDirectoryIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of identifiers of the directories to obtain the information
     * for. If this member is null, all directories that belong to the
     * current account are returned. <p>An empty list results in an
     * <code>InvalidParameterException</code> being thrown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param directoryIds A list of identifiers of the directories to obtain the information
     *         for. If this member is null, all directories that belong to the
     *         current account are returned. <p>An empty list results in an
     *         <code>InvalidParameterException</code> being thrown.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDirectoriesRequest withDirectoryIds(java.util.Collection<String> directoryIds) {
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
     * The <i>DescribeDirectoriesResult.NextToken</i> value from a previous
     * call to <a>DescribeDirectories</a>. Pass null if this is the first
     * call.
     *
     * @return The <i>DescribeDirectoriesResult.NextToken</i> value from a previous
     *         call to <a>DescribeDirectories</a>. Pass null if this is the first
     *         call.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <i>DescribeDirectoriesResult.NextToken</i> value from a previous
     * call to <a>DescribeDirectories</a>. Pass null if this is the first
     * call.
     *
     * @param nextToken The <i>DescribeDirectoriesResult.NextToken</i> value from a previous
     *         call to <a>DescribeDirectories</a>. Pass null if this is the first
     *         call.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <i>DescribeDirectoriesResult.NextToken</i> value from a previous
     * call to <a>DescribeDirectories</a>. Pass null if this is the first
     * call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <i>DescribeDirectoriesResult.NextToken</i> value from a previous
     *         call to <a>DescribeDirectories</a>. Pass null if this is the first
     *         call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDirectoriesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of items to return. If this value is zero, the
     * maximum number of items is specified by the limitations of the
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The maximum number of items to return. If this value is zero, the
     *         maximum number of items is specified by the limitations of the
     *         operation.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of items to return. If this value is zero, the
     * maximum number of items is specified by the limitations of the
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param limit The maximum number of items to return. If this value is zero, the
     *         maximum number of items is specified by the limitations of the
     *         operation.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of items to return. If this value is zero, the
     * maximum number of items is specified by the limitations of the
     * operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param limit The maximum number of items to return. If this value is zero, the
     *         maximum number of items is specified by the limitations of the
     *         operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDirectoriesRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDirectoryIds() == null) ? 0 : getDirectoryIds().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDirectoriesRequest == false) return false;
        DescribeDirectoriesRequest other = (DescribeDirectoriesRequest)obj;
        
        if (other.getDirectoryIds() == null ^ this.getDirectoryIds() == null) return false;
        if (other.getDirectoryIds() != null && other.getDirectoryIds().equals(this.getDirectoryIds()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDirectoriesRequest clone() {
        
            return (DescribeDirectoriesRequest) super.clone();
    }

}
    