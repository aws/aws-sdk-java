/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listSigningCertificates(ListSigningCertificatesRequest) ListSigningCertificates operation}.
 * <p>
 * Returns information about the signing certificates associated with the specified user. If there are none, the action returns an empty list.
 * </p>
 * <p>
 * Although each user is limited to a small number of signing certificates, you can still paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters.
 * </p>
 * <p>
 * If the <code>UserName</code> field is not specified, the user name is determined implicitly based on the AWS access key ID used to sign the request.
 * Because this action works for access keys under the AWS account, this API can be used to manage root credentials even if the AWS account has no
 * associated users.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listSigningCertificates(ListSigningCertificatesRequest)
 */
public class ListSigningCertificatesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of certificate IDs you want in the response. If there are additional
     * certificate IDs beyond the maximum you specify, the
     * <code>IsTruncated</code> response element is <code>true</code>. This
     * parameter is optional. If you do not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * Default constructor for a new ListSigningCertificatesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListSigningCertificatesRequest() {}
    
    /**
     * The name of the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the user.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The name of the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The name of the user.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The name of the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The name of the user.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListSigningCertificatesRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListSigningCertificatesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Use this only when paginating results to indicate the maximum number
     * of certificate IDs you want in the response. If there are additional
     * certificate IDs beyond the maximum you specify, the
     * <code>IsTruncated</code> response element is <code>true</code>. This
     * parameter is optional. If you do not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of certificate IDs you want in the response. If there are additional
     *         certificate IDs beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>. This
     *         parameter is optional. If you do not include it, it defaults to 100.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of certificate IDs you want in the response. If there are additional
     * certificate IDs beyond the maximum you specify, the
     * <code>IsTruncated</code> response element is <code>true</code>. This
     * parameter is optional. If you do not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of certificate IDs you want in the response. If there are additional
     *         certificate IDs beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>. This
     *         parameter is optional. If you do not include it, it defaults to 100.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of certificate IDs you want in the response. If there are additional
     * certificate IDs beyond the maximum you specify, the
     * <code>IsTruncated</code> response element is <code>true</code>. This
     * parameter is optional. If you do not include it, it defaults to 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of certificate IDs you want in the response. If there are additional
     *         certificate IDs beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>. This
     *         parameter is optional. If you do not include it, it defaults to 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListSigningCertificatesRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListSigningCertificatesRequest == false) return false;
        ListSigningCertificatesRequest other = (ListSigningCertificatesRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    