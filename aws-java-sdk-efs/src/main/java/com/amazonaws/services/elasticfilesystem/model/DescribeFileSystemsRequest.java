/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DescribeFileSystemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) Specifies the maximum number of file systems to return in the response (integer). This parameter value
     * must be greater than 0. The number of items that Amazon EFS returns is the minimum of the <code>MaxItems</code>
     * parameter specified in the request and the service's internal maximum number of items per page.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation (String).
     * If present, specifies to continue the list from where the returning call had left off.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * (Optional) Restricts the list to the file system with this creation token (String). You specify a creation token
     * when you create an Amazon EFS file system.
     * </p>
     */
    private String creationToken;
    /**
     * <p>
     * (Optional) ID of the file system whose description you want to retrieve (String).
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) Specifies the maximum number of file systems to return in the response (integer). This parameter value
     * must be greater than 0. The number of items that Amazon EFS returns is the minimum of the <code>MaxItems</code>
     * parameter specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Specifies the maximum number of file systems to return in the response (integer). This
     *        parameter value must be greater than 0. The number of items that Amazon EFS returns is the minimum of the
     *        <code>MaxItems</code> parameter specified in the request and the service's internal maximum number of
     *        items per page.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of file systems to return in the response (integer). This parameter value
     * must be greater than 0. The number of items that Amazon EFS returns is the minimum of the <code>MaxItems</code>
     * parameter specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @return (Optional) Specifies the maximum number of file systems to return in the response (integer). This
     *         parameter value must be greater than 0. The number of items that Amazon EFS returns is the minimum of the
     *         <code>MaxItems</code> parameter specified in the request and the service's internal maximum number of
     *         items per page.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of file systems to return in the response (integer). This parameter value
     * must be greater than 0. The number of items that Amazon EFS returns is the minimum of the <code>MaxItems</code>
     * parameter specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxItems
     *        (Optional) Specifies the maximum number of file systems to return in the response (integer). This
     *        parameter value must be greater than 0. The number of items that Amazon EFS returns is the minimum of the
     *        <code>MaxItems</code> parameter specified in the request and the service's internal maximum number of
     *        items per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation (String).
     * If present, specifies to continue the list from where the returning call had left off.
     * </p>
     * 
     * @param marker
     *        (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation
     *        (String). If present, specifies to continue the list from where the returning call had left off.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation (String).
     * If present, specifies to continue the list from where the returning call had left off.
     * </p>
     * 
     * @return (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation
     *         (String). If present, specifies to continue the list from where the returning call had left off.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation (String).
     * If present, specifies to continue the list from where the returning call had left off.
     * </p>
     * 
     * @param marker
     *        (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation
     *        (String). If present, specifies to continue the list from where the returning call had left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * (Optional) Restricts the list to the file system with this creation token (String). You specify a creation token
     * when you create an Amazon EFS file system.
     * </p>
     * 
     * @param creationToken
     *        (Optional) Restricts the list to the file system with this creation token (String). You specify a creation
     *        token when you create an Amazon EFS file system.
     */

    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * (Optional) Restricts the list to the file system with this creation token (String). You specify a creation token
     * when you create an Amazon EFS file system.
     * </p>
     * 
     * @return (Optional) Restricts the list to the file system with this creation token (String). You specify a
     *         creation token when you create an Amazon EFS file system.
     */

    public String getCreationToken() {
        return this.creationToken;
    }

    /**
     * <p>
     * (Optional) Restricts the list to the file system with this creation token (String). You specify a creation token
     * when you create an Amazon EFS file system.
     * </p>
     * 
     * @param creationToken
     *        (Optional) Restricts the list to the file system with this creation token (String). You specify a creation
     *        token when you create an Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsRequest withCreationToken(String creationToken) {
        setCreationToken(creationToken);
        return this;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose description you want to retrieve (String).
     * </p>
     * 
     * @param fileSystemId
     *        (Optional) ID of the file system whose description you want to retrieve (String).
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose description you want to retrieve (String).
     * </p>
     * 
     * @return (Optional) ID of the file system whose description you want to retrieve (String).
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * (Optional) ID of the file system whose description you want to retrieve (String).
     * </p>
     * 
     * @param fileSystemId
     *        (Optional) ID of the file system whose description you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getCreationToken() != null)
            sb.append("CreationToken: " + getCreationToken() + ",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: " + getFileSystemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFileSystemsRequest == false)
            return false;
        DescribeFileSystemsRequest other = (DescribeFileSystemsRequest) obj;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getCreationToken() == null ^ this.getCreationToken() == null)
            return false;
        if (other.getCreationToken() != null && other.getCreationToken().equals(this.getCreationToken()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getCreationToken() == null) ? 0 : getCreationToken().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileSystemsRequest clone() {
        return (DescribeFileSystemsRequest) super.clone();
    }
}
