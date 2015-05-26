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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#describeFileSystems(DescribeFileSystemsRequest) DescribeFileSystems operation}.
 * <p>
 * Returns the description of a specific Amazon EFS file system if either
 * the file system <code>CreationToken</code> or the
 * <code>FileSystemId</code> is provided; otherwise, returns descriptions
 * of all file systems owned by the caller's AWS account in the AWS
 * region of the endpoint that you're calling.
 * </p>
 * <p>
 * When retrieving all file system descriptions, you can optionally
 * specify the <code>MaxItems</code> parameter to limit the number of
 * descriptions in a response. If more file system descriptions remain,
 * Amazon EFS returns a <code>NextMarker</code> , an opaque token, in the
 * response. In this case, you should send a subsequent request with the
 * <code>Marker</code> request parameter set to the value of
 * <code>NextMarker</code> .
 * 
 * </p>
 * <p>
 * So to retrieve a list of your file system descriptions, the expected
 * usage of this API is an iterative process of first calling
 * <code>DescribeFileSystems</code> without the <code>Marker</code> and
 * then continuing to call it with the <code>Marker</code> parameter set
 * to the value of the <code>NextMarker</code> from the previous response
 * until the response has no <code>NextMarker</code> .
 * 
 * </p>
 * <p>
 * Note that the implementation may return fewer than
 * <code>MaxItems</code> file system descriptions while still including a
 * <code>NextMarker</code> value.
 * </p>
 * <p>
 * The order of file systems returned in the response of one
 * <code>DescribeFileSystems</code> call, and the order of file systems
 * returned across the responses of a multi-call iteration, is
 * unspecified.
 * </p>
 * <p>
 * This operation requires permission for the
 * <code>elasticfilesystem:DescribeFileSystems</code> action.
 * </p>
 *
 * @see com.amazonaws.services.elasticfilesystem.AmazonElasticFileSystem#describeFileSystems(DescribeFileSystemsRequest)
 */
public class DescribeFileSystemsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Optional integer. Specifies the maximum number of file systems to
     * return in the response. This parameter value must be greater than 0.
     * The number of items Amazon EFS returns will be the minimum of the
     * <code>MaxItems</code> parameter specified in the request and the
     * service's internal maximum number of items per page.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxItems;

    /**
     * Optional string. Opaque pagination token returned from a previous
     * <code>DescribeFileSystems</code> operation. If present, specifies to
     * continue the list from where the returning call had left off.
     */
    private String marker;

    /**
     * Optional string. Restricts the list to the file system with this
     * creation token (you specify a creation token at the time of creating
     * an Amazon EFS file system).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String creationToken;

    /**
     * Optional string. File system ID whose description you want to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     */
    private String fileSystemId;

    /**
     * Optional integer. Specifies the maximum number of file systems to
     * return in the response. This parameter value must be greater than 0.
     * The number of items Amazon EFS returns will be the minimum of the
     * <code>MaxItems</code> parameter specified in the request and the
     * service's internal maximum number of items per page.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Optional integer. Specifies the maximum number of file systems to
     *         return in the response. This parameter value must be greater than 0.
     *         The number of items Amazon EFS returns will be the minimum of the
     *         <code>MaxItems</code> parameter specified in the request and the
     *         service's internal maximum number of items per page.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Optional integer. Specifies the maximum number of file systems to
     * return in the response. This parameter value must be greater than 0.
     * The number of items Amazon EFS returns will be the minimum of the
     * <code>MaxItems</code> parameter specified in the request and the
     * service's internal maximum number of items per page.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxItems Optional integer. Specifies the maximum number of file systems to
     *         return in the response. This parameter value must be greater than 0.
     *         The number of items Amazon EFS returns will be the minimum of the
     *         <code>MaxItems</code> parameter specified in the request and the
     *         service's internal maximum number of items per page.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Optional integer. Specifies the maximum number of file systems to
     * return in the response. This parameter value must be greater than 0.
     * The number of items Amazon EFS returns will be the minimum of the
     * <code>MaxItems</code> parameter specified in the request and the
     * service's internal maximum number of items per page.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxItems Optional integer. Specifies the maximum number of file systems to
     *         return in the response. This parameter value must be greater than 0.
     *         The number of items Amazon EFS returns will be the minimum of the
     *         <code>MaxItems</code> parameter specified in the request and the
     *         service's internal maximum number of items per page.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFileSystemsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Optional string. Opaque pagination token returned from a previous
     * <code>DescribeFileSystems</code> operation. If present, specifies to
     * continue the list from where the returning call had left off.
     *
     * @return Optional string. Opaque pagination token returned from a previous
     *         <code>DescribeFileSystems</code> operation. If present, specifies to
     *         continue the list from where the returning call had left off.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Optional string. Opaque pagination token returned from a previous
     * <code>DescribeFileSystems</code> operation. If present, specifies to
     * continue the list from where the returning call had left off.
     *
     * @param marker Optional string. Opaque pagination token returned from a previous
     *         <code>DescribeFileSystems</code> operation. If present, specifies to
     *         continue the list from where the returning call had left off.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Optional string. Opaque pagination token returned from a previous
     * <code>DescribeFileSystems</code> operation. If present, specifies to
     * continue the list from where the returning call had left off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Optional string. Opaque pagination token returned from a previous
     *         <code>DescribeFileSystems</code> operation. If present, specifies to
     *         continue the list from where the returning call had left off.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFileSystemsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Optional string. Restricts the list to the file system with this
     * creation token (you specify a creation token at the time of creating
     * an Amazon EFS file system).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return Optional string. Restricts the list to the file system with this
     *         creation token (you specify a creation token at the time of creating
     *         an Amazon EFS file system).
     */
    public String getCreationToken() {
        return creationToken;
    }
    
    /**
     * Optional string. Restricts the list to the file system with this
     * creation token (you specify a creation token at the time of creating
     * an Amazon EFS file system).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken Optional string. Restricts the list to the file system with this
     *         creation token (you specify a creation token at the time of creating
     *         an Amazon EFS file system).
     */
    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }
    
    /**
     * Optional string. Restricts the list to the file system with this
     * creation token (you specify a creation token at the time of creating
     * an Amazon EFS file system).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param creationToken Optional string. Restricts the list to the file system with this
     *         creation token (you specify a creation token at the time of creating
     *         an Amazon EFS file system).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFileSystemsRequest withCreationToken(String creationToken) {
        this.creationToken = creationToken;
        return this;
    }

    /**
     * Optional string. File system ID whose description you want to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @return Optional string. File system ID whose description you want to
     *         retrieve.
     */
    public String getFileSystemId() {
        return fileSystemId;
    }
    
    /**
     * Optional string. File system ID whose description you want to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId Optional string. File system ID whose description you want to
     *         retrieve.
     */
    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }
    
    /**
     * Optional string. File system ID whose description you want to
     * retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>fs-[0-9a-f]{8}<br/>
     *
     * @param fileSystemId Optional string. File system ID whose description you want to
     *         retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeFileSystemsRequest withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
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
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getCreationToken() != null) sb.append("CreationToken: " + getCreationToken() + ",");
        if (getFileSystemId() != null) sb.append("FileSystemId: " + getFileSystemId() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeFileSystemsRequest == false) return false;
        DescribeFileSystemsRequest other = (DescribeFileSystemsRequest)obj;
        
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getCreationToken() == null ^ this.getCreationToken() == null) return false;
        if (other.getCreationToken() != null && other.getCreationToken().equals(this.getCreationToken()) == false) return false; 
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null) return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeFileSystemsRequest clone() {
        
            return (DescribeFileSystemsRequest) super.clone();
    }

}
    