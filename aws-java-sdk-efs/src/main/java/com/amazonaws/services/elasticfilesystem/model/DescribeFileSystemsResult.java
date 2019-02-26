/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeFileSystems"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileSystemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Present if provided by caller in the request (String).
     * </p>
     */
    private String marker;
    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FileSystemDescription> fileSystems;
    /**
     * <p>
     * Present if there are more file systems than returned in the response (String). You can use the
     * <code>NextMarker</code> in the subsequent request to fetch the descriptions.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Present if provided by caller in the request (String).
     * </p>
     * 
     * @param marker
     *        Present if provided by caller in the request (String).
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Present if provided by caller in the request (String).
     * </p>
     * 
     * @return Present if provided by caller in the request (String).
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Present if provided by caller in the request (String).
     * </p>
     * 
     * @param marker
     *        Present if provided by caller in the request (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * 
     * @return An array of file system descriptions.
     */

    public java.util.List<FileSystemDescription> getFileSystems() {
        if (fileSystems == null) {
            fileSystems = new com.amazonaws.internal.SdkInternalList<FileSystemDescription>();
        }
        return fileSystems;
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * 
     * @param fileSystems
     *        An array of file system descriptions.
     */

    public void setFileSystems(java.util.Collection<FileSystemDescription> fileSystems) {
        if (fileSystems == null) {
            this.fileSystems = null;
            return;
        }

        this.fileSystems = new com.amazonaws.internal.SdkInternalList<FileSystemDescription>(fileSystems);
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystems(java.util.Collection)} or {@link #withFileSystems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fileSystems
     *        An array of file system descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsResult withFileSystems(FileSystemDescription... fileSystems) {
        if (this.fileSystems == null) {
            setFileSystems(new com.amazonaws.internal.SdkInternalList<FileSystemDescription>(fileSystems.length));
        }
        for (FileSystemDescription ele : fileSystems) {
            this.fileSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of file system descriptions.
     * </p>
     * 
     * @param fileSystems
     *        An array of file system descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsResult withFileSystems(java.util.Collection<FileSystemDescription> fileSystems) {
        setFileSystems(fileSystems);
        return this;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response (String). You can use the
     * <code>NextMarker</code> in the subsequent request to fetch the descriptions.
     * </p>
     * 
     * @param nextMarker
     *        Present if there are more file systems than returned in the response (String). You can use the
     *        <code>NextMarker</code> in the subsequent request to fetch the descriptions.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response (String). You can use the
     * <code>NextMarker</code> in the subsequent request to fetch the descriptions.
     * </p>
     * 
     * @return Present if there are more file systems than returned in the response (String). You can use the
     *         <code>NextMarker</code> in the subsequent request to fetch the descriptions.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * Present if there are more file systems than returned in the response (String). You can use the
     * <code>NextMarker</code> in the subsequent request to fetch the descriptions.
     * </p>
     * 
     * @param nextMarker
     *        Present if there are more file systems than returned in the response (String). You can use the
     *        <code>NextMarker</code> in the subsequent request to fetch the descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getFileSystems() != null)
            sb.append("FileSystems: ").append(getFileSystems()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFileSystemsResult == false)
            return false;
        DescribeFileSystemsResult other = (DescribeFileSystemsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getFileSystems() == null ^ this.getFileSystems() == null)
            return false;
        if (other.getFileSystems() != null && other.getFileSystems().equals(this.getFileSystems()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
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
    public DescribeFileSystemsResult clone() {
        try {
            return (DescribeFileSystemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
