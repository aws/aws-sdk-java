/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeAccessPoints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccessPointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) When retrieving all access points for a file system, you can optionally specify the
     * <code>MaxItems</code> parameter to limit the number of objects returned in a response. The default value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can use <code>NextMarker</code> in the
     * subsequent request to fetch the next page of access point descriptions.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with
     * <code>FileSystemId</code>.
     * </p>
     */
    private String accessPointId;
    /**
     * <p>
     * (Optional) If you provide a <code>FileSystemId</code>, EFS returns all access points for that file system;
     * mutually exclusive with <code>AccessPointId</code>.
     * </p>
     */
    private String fileSystemId;

    /**
     * <p>
     * (Optional) When retrieving all access points for a file system, you can optionally specify the
     * <code>MaxItems</code> parameter to limit the number of objects returned in a response. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        (Optional) When retrieving all access points for a file system, you can optionally specify the
     *        <code>MaxItems</code> parameter to limit the number of objects returned in a response. The default value
     *        is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) When retrieving all access points for a file system, you can optionally specify the
     * <code>MaxItems</code> parameter to limit the number of objects returned in a response. The default value is 100.
     * </p>
     * 
     * @return (Optional) When retrieving all access points for a file system, you can optionally specify the
     *         <code>MaxItems</code> parameter to limit the number of objects returned in a response. The default value
     *         is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) When retrieving all access points for a file system, you can optionally specify the
     * <code>MaxItems</code> parameter to limit the number of objects returned in a response. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        (Optional) When retrieving all access points for a file system, you can optionally specify the
     *        <code>MaxItems</code> parameter to limit the number of objects returned in a response. The default value
     *        is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can use <code>NextMarker</code> in the
     * subsequent request to fetch the next page of access point descriptions.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is present if the response is paginated. You can use <code>NextMarker</code> in the
     *        subsequent request to fetch the next page of access point descriptions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can use <code>NextMarker</code> in the
     * subsequent request to fetch the next page of access point descriptions.
     * </p>
     * 
     * @return <code>NextToken</code> is present if the response is paginated. You can use <code>NextMarker</code> in
     *         the subsequent request to fetch the next page of access point descriptions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can use <code>NextMarker</code> in the
     * subsequent request to fetch the next page of access point descriptions.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is present if the response is paginated. You can use <code>NextMarker</code> in the
     *        subsequent request to fetch the next page of access point descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with
     * <code>FileSystemId</code>.
     * </p>
     * 
     * @param accessPointId
     *        (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with
     *        <code>FileSystemId</code>.
     */

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    /**
     * <p>
     * (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with
     * <code>FileSystemId</code>.
     * </p>
     * 
     * @return (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with
     *         <code>FileSystemId</code>.
     */

    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * <p>
     * (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with
     * <code>FileSystemId</code>.
     * </p>
     * 
     * @param accessPointId
     *        (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with
     *        <code>FileSystemId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPointsRequest withAccessPointId(String accessPointId) {
        setAccessPointId(accessPointId);
        return this;
    }

    /**
     * <p>
     * (Optional) If you provide a <code>FileSystemId</code>, EFS returns all access points for that file system;
     * mutually exclusive with <code>AccessPointId</code>.
     * </p>
     * 
     * @param fileSystemId
     *        (Optional) If you provide a <code>FileSystemId</code>, EFS returns all access points for that file system;
     *        mutually exclusive with <code>AccessPointId</code>.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * (Optional) If you provide a <code>FileSystemId</code>, EFS returns all access points for that file system;
     * mutually exclusive with <code>AccessPointId</code>.
     * </p>
     * 
     * @return (Optional) If you provide a <code>FileSystemId</code>, EFS returns all access points for that file
     *         system; mutually exclusive with <code>AccessPointId</code>.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * (Optional) If you provide a <code>FileSystemId</code>, EFS returns all access points for that file system;
     * mutually exclusive with <code>AccessPointId</code>.
     * </p>
     * 
     * @param fileSystemId
     *        (Optional) If you provide a <code>FileSystemId</code>, EFS returns all access points for that file system;
     *        mutually exclusive with <code>AccessPointId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccessPointsRequest withFileSystemId(String fileSystemId) {
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getAccessPointId() != null)
            sb.append("AccessPointId: ").append(getAccessPointId()).append(",");
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

        if (obj instanceof DescribeAccessPointsRequest == false)
            return false;
        DescribeAccessPointsRequest other = (DescribeAccessPointsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAccessPointId() == null ^ this.getAccessPointId() == null)
            return false;
        if (other.getAccessPointId() != null && other.getAccessPointId().equals(this.getAccessPointId()) == false)
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAccessPointId() == null) ? 0 : getAccessPointId().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccessPointsRequest clone() {
        return (DescribeAccessPointsRequest) super.clone();
    }

}
