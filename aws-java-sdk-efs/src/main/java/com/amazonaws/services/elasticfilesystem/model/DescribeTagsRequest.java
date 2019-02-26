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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) The maximum number of file system tags to return in the response. Currently, this number is
     * automatically set to 10.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * (Optional) An opaque pagination token returned from a previous <code>DescribeTags</code> operation (String). If
     * present, it specifies to continue the list from where the previous call left off.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The ID of the file system whose tag set you want to retrieve.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) The maximum number of file system tags to return in the response. Currently, this number is
     * automatically set to 10.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of file system tags to return in the response. Currently, this number is
     *        automatically set to 10.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of file system tags to return in the response. Currently, this number is
     * automatically set to 10.
     * </p>
     * 
     * @return (Optional) The maximum number of file system tags to return in the response. Currently, this number is
     *         automatically set to 10.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of file system tags to return in the response. Currently, this number is
     * automatically set to 10.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of file system tags to return in the response. Currently, this number is
     *        automatically set to 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * (Optional) An opaque pagination token returned from a previous <code>DescribeTags</code> operation (String). If
     * present, it specifies to continue the list from where the previous call left off.
     * </p>
     * 
     * @param marker
     *        (Optional) An opaque pagination token returned from a previous <code>DescribeTags</code> operation
     *        (String). If present, it specifies to continue the list from where the previous call left off.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * (Optional) An opaque pagination token returned from a previous <code>DescribeTags</code> operation (String). If
     * present, it specifies to continue the list from where the previous call left off.
     * </p>
     * 
     * @return (Optional) An opaque pagination token returned from a previous <code>DescribeTags</code> operation
     *         (String). If present, it specifies to continue the list from where the previous call left off.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * (Optional) An opaque pagination token returned from a previous <code>DescribeTags</code> operation (String). If
     * present, it specifies to continue the list from where the previous call left off.
     * </p>
     * 
     * @param marker
     *        (Optional) An opaque pagination token returned from a previous <code>DescribeTags</code> operation
     *        (String). If present, it specifies to continue the list from where the previous call left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The ID of the file system whose tag set you want to retrieve.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system whose tag set you want to retrieve.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system whose tag set you want to retrieve.
     * </p>
     * 
     * @return The ID of the file system whose tag set you want to retrieve.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system whose tag set you want to retrieve.
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system whose tag set you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
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
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsRequest == false)
            return false;
        DescribeTagsRequest other = (DescribeTagsRequest) obj;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
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
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTagsRequest clone() {
        return (DescribeTagsRequest) super.clone();
    }

}
