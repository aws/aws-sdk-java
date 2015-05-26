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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeFileSystemsResult implements Serializable, Cloneable {

    /**
     * A string, present if provided by caller in the request.
     */
    private String marker;

    /**
     * An array of file system descriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<FileSystemDescription> fileSystems;

    /**
     * A string, present if there are more file systems than returned in the
     * response. You can use the <code>NextMarker</code> in the subsequent
     * request to fetch the descriptions.
     */
    private String nextMarker;

    /**
     * A string, present if provided by caller in the request.
     *
     * @return A string, present if provided by caller in the request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A string, present if provided by caller in the request.
     *
     * @param marker A string, present if provided by caller in the request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A string, present if provided by caller in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A string, present if provided by caller in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFileSystemsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * An array of file system descriptions.
     *
     * @return An array of file system descriptions.
     */
    public java.util.List<FileSystemDescription> getFileSystems() {
        if (fileSystems == null) {
              fileSystems = new com.amazonaws.internal.ListWithAutoConstructFlag<FileSystemDescription>();
              fileSystems.setAutoConstruct(true);
        }
        return fileSystems;
    }
    
    /**
     * An array of file system descriptions.
     *
     * @param fileSystems An array of file system descriptions.
     */
    public void setFileSystems(java.util.Collection<FileSystemDescription> fileSystems) {
        if (fileSystems == null) {
            this.fileSystems = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<FileSystemDescription> fileSystemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FileSystemDescription>(fileSystems.size());
        fileSystemsCopy.addAll(fileSystems);
        this.fileSystems = fileSystemsCopy;
    }
    
    /**
     * An array of file system descriptions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFileSystems(java.util.Collection)} or {@link
     * #withFileSystems(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fileSystems An array of file system descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFileSystemsResult withFileSystems(FileSystemDescription... fileSystems) {
        if (getFileSystems() == null) setFileSystems(new java.util.ArrayList<FileSystemDescription>(fileSystems.length));
        for (FileSystemDescription value : fileSystems) {
            getFileSystems().add(value);
        }
        return this;
    }
    
    /**
     * An array of file system descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fileSystems An array of file system descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFileSystemsResult withFileSystems(java.util.Collection<FileSystemDescription> fileSystems) {
        if (fileSystems == null) {
            this.fileSystems = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<FileSystemDescription> fileSystemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FileSystemDescription>(fileSystems.size());
            fileSystemsCopy.addAll(fileSystems);
            this.fileSystems = fileSystemsCopy;
        }

        return this;
    }

    /**
     * A string, present if there are more file systems than returned in the
     * response. You can use the <code>NextMarker</code> in the subsequent
     * request to fetch the descriptions.
     *
     * @return A string, present if there are more file systems than returned in the
     *         response. You can use the <code>NextMarker</code> in the subsequent
     *         request to fetch the descriptions.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * A string, present if there are more file systems than returned in the
     * response. You can use the <code>NextMarker</code> in the subsequent
     * request to fetch the descriptions.
     *
     * @param nextMarker A string, present if there are more file systems than returned in the
     *         response. You can use the <code>NextMarker</code> in the subsequent
     *         request to fetch the descriptions.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * A string, present if there are more file systems than returned in the
     * response. You can use the <code>NextMarker</code> in the subsequent
     * request to fetch the descriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker A string, present if there are more file systems than returned in the
     *         response. You can use the <code>NextMarker</code> in the subsequent
     *         request to fetch the descriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFileSystemsResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getFileSystems() != null) sb.append("FileSystems: " + getFileSystems() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getFileSystems() == null) ? 0 : getFileSystems().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeFileSystemsResult == false) return false;
        DescribeFileSystemsResult other = (DescribeFileSystemsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getFileSystems() == null ^ this.getFileSystems() == null) return false;
        if (other.getFileSystems() != null && other.getFileSystems().equals(this.getFileSystems()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeFileSystemsResult clone() {
        try {
            return (DescribeFileSystemsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    