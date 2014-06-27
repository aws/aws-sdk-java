/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomain#uploadDocuments(UploadDocumentsRequest) UploadDocuments operation}.
 * <p>
 * Posts a batch of documents to a search domain for indexing. A
 * document batch is a collection of add and delete operations that
 * represent the documents you want to add, update, or delete from your
 * domain. Batches can be described in either JSON or XML. Each item that
 * you want Amazon CloudSearch to return as a search result (such as a
 * product) is represented as a document. Every document has a unique ID
 * and one or more fields that contain the data that you want to search
 * and return in results. Individual documents cannot contain more than
 * 1 MB of data. The entire batch cannot exceed 5 MB. To get the best
 * possible upload performance, group add and delete operations in
 * batches that are close the 5 MB limit. Submitting a large volume of
 * single-document batches can overload a domain's document service.
 * </p>
 * <p>
 * The endpoint for submitting <code>UploadDocuments</code> requests is
 * domain-specific. To get the document endpoint for your domain, use the
 * Amazon CloudSearch configuration service <code>DescribeDomains</code>
 * action. A domain's endpoints are also displayed on the domain
 * dashboard in the Amazon CloudSearch console.
 * </p>
 * <p>
 * For more information about formatting your data for Amazon
 * CloudSearch, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/preparing-data.html"> Preparing Your Data </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * For more information about uploading data for indexing, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/uploading-data.html"> Uploading Data </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearchdomain.AmazonCloudSearchDomain#uploadDocuments(UploadDocumentsRequest)
 */
public class UploadDocumentsRequest extends AmazonWebServiceRequest implements Serializable {

    private Long contentLength;

    /**
     * A batch of documents formatted in JSON or HTML.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     */
    private java.io.InputStream documents;

    /**
     * The format of the batch you are uploading. Amazon CloudSearch supports
     * two document batch formats: <ul> <li>application/json</li>
     * <li>application/xml</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/json, application/xml
     */
    private String contentType;

    /**
     * Returns the value of the ContentLength property for this object.
     *
     * @return The value of the ContentLength property for this object.
     */
    public Long getContentLength() {
        return contentLength;
    }
    
    /**
     * Sets the value of the ContentLength property for this object.
     *
     * @param contentLength The new value for the ContentLength property for this object.
     */
    public void setContentLength(Long contentLength) {
        this.contentLength = contentLength;
    }
    
    /**
     * Sets the value of the ContentLength property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contentLength The new value for the ContentLength property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadDocumentsRequest withContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * A batch of documents formatted in JSON or HTML.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     *
     * @return A batch of documents formatted in JSON or HTML.
     */
    public java.io.InputStream getDocuments() {
        return documents;
    }
    
    /**
     * A batch of documents formatted in JSON or HTML.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     *
     * @param documents A batch of documents formatted in JSON or HTML.
     */
    public void setDocuments(java.io.InputStream documents) {
        this.documents = documents;
    }
    
    /**
     * A batch of documents formatted in JSON or HTML.
     *
     * This stream must implement mark/reset in order for signature calculation to be performed
     * before this data is read for the request payload.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param documents A batch of documents formatted in JSON or HTML.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UploadDocumentsRequest withDocuments(java.io.InputStream documents) {
        this.documents = documents;
        return this;
    }

    /**
     * The format of the batch you are uploading. Amazon CloudSearch supports
     * two document batch formats: <ul> <li>application/json</li>
     * <li>application/xml</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/json, application/xml
     *
     * @return The format of the batch you are uploading. Amazon CloudSearch supports
     *         two document batch formats: <ul> <li>application/json</li>
     *         <li>application/xml</li> </ul>
     *
     * @see ContentType
     */
    public String getContentType() {
        return contentType;
    }
    
    /**
     * The format of the batch you are uploading. Amazon CloudSearch supports
     * two document batch formats: <ul> <li>application/json</li>
     * <li>application/xml</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/json, application/xml
     *
     * @param contentType The format of the batch you are uploading. Amazon CloudSearch supports
     *         two document batch formats: <ul> <li>application/json</li>
     *         <li>application/xml</li> </ul>
     *
     * @see ContentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
    
    /**
     * The format of the batch you are uploading. Amazon CloudSearch supports
     * two document batch formats: <ul> <li>application/json</li>
     * <li>application/xml</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/json, application/xml
     *
     * @param contentType The format of the batch you are uploading. Amazon CloudSearch supports
     *         two document batch formats: <ul> <li>application/json</li>
     *         <li>application/xml</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ContentType
     */
    public UploadDocumentsRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * The format of the batch you are uploading. Amazon CloudSearch supports
     * two document batch formats: <ul> <li>application/json</li>
     * <li>application/xml</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/json, application/xml
     *
     * @param contentType The format of the batch you are uploading. Amazon CloudSearch supports
     *         two document batch formats: <ul> <li>application/json</li>
     *         <li>application/xml</li> </ul>
     *
     * @see ContentType
     */
    public void setContentType(ContentType contentType) {
        this.contentType = contentType.toString();
    }
    
    /**
     * The format of the batch you are uploading. Amazon CloudSearch supports
     * two document batch formats: <ul> <li>application/json</li>
     * <li>application/xml</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>application/json, application/xml
     *
     * @param contentType The format of the batch you are uploading. Amazon CloudSearch supports
     *         two document batch formats: <ul> <li>application/json</li>
     *         <li>application/xml</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ContentType
     */
    public UploadDocumentsRequest withContentType(ContentType contentType) {
        this.contentType = contentType.toString();
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
        if (getContentLength() != null) sb.append("ContentLength: " + getContentLength() + ",");
        if (getDocuments() != null) sb.append("Documents: " + getDocuments() + ",");
        if (getContentType() != null) sb.append("ContentType: " + getContentType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContentLength() == null) ? 0 : getContentLength().hashCode()); 
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode()); 
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UploadDocumentsRequest == false) return false;
        UploadDocumentsRequest other = (UploadDocumentsRequest)obj;
        
        if (other.getContentLength() == null ^ this.getContentLength() == null) return false;
        if (other.getContentLength() != null && other.getContentLength().equals(this.getContentLength()) == false) return false; 
        if (other.getDocuments() == null ^ this.getDocuments() == null) return false;
        if (other.getDocuments() != null && other.getDocuments().equals(this.getDocuments()) == false) return false; 
        if (other.getContentType() == null ^ this.getContentType() == null) return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false) return false; 
        return true;
    }
    
}
    