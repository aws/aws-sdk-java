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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listMFADevices(ListMFADevicesRequest) ListMFADevices operation}.
 * <p>
 * Lists the MFA devices. If the request includes the user name, then this action lists all the MFA devices associated with the specified user name. If
 * you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request.
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listMFADevices(ListMFADevicesRequest)
 */
public class ListMFADevicesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user whose MFA devices you want to list.
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
     * of MFA devices you want in the response. If there are additional MFA
     * devices beyond the maximum you specify, the <code>IsTruncated</code>
     * response element is <code>true</code>. This parameter is optional. If
     * you do not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * Default constructor for a new ListMFADevicesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListMFADevicesRequest() {}
    
    /**
     * Constructs a new ListMFADevicesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName Name of the user whose MFA devices you want to list.
     */
    public ListMFADevicesRequest(String userName) {
        setUserName(userName);
    }

    /**
     * Name of the user whose MFA devices you want to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user whose MFA devices you want to list.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user whose MFA devices you want to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user whose MFA devices you want to list.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user whose MFA devices you want to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user whose MFA devices you want to list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMFADevicesRequest withUserName(String userName) {
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
    public ListMFADevicesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Use this only when paginating results to indicate the maximum number
     * of MFA devices you want in the response. If there are additional MFA
     * devices beyond the maximum you specify, the <code>IsTruncated</code>
     * response element is <code>true</code>. This parameter is optional. If
     * you do not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of MFA devices you want in the response. If there are additional MFA
     *         devices beyond the maximum you specify, the <code>IsTruncated</code>
     *         response element is <code>true</code>. This parameter is optional. If
     *         you do not include it, it defaults to 100.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of MFA devices you want in the response. If there are additional MFA
     * devices beyond the maximum you specify, the <code>IsTruncated</code>
     * response element is <code>true</code>. This parameter is optional. If
     * you do not include it, it defaults to 100.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of MFA devices you want in the response. If there are additional MFA
     *         devices beyond the maximum you specify, the <code>IsTruncated</code>
     *         response element is <code>true</code>. This parameter is optional. If
     *         you do not include it, it defaults to 100.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of MFA devices you want in the response. If there are additional MFA
     * devices beyond the maximum you specify, the <code>IsTruncated</code>
     * response element is <code>true</code>. This parameter is optional. If
     * you do not include it, it defaults to 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of MFA devices you want in the response. If there are additional MFA
     *         devices beyond the maximum you specify, the <code>IsTruncated</code>
     *         response element is <code>true</code>. This parameter is optional. If
     *         you do not include it, it defaults to 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListMFADevicesRequest withMaxItems(Integer maxItems) {
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

        if (obj instanceof ListMFADevicesRequest == false) return false;
        ListMFADevicesRequest other = (ListMFADevicesRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    