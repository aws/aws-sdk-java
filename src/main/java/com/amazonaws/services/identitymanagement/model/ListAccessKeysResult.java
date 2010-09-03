/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the ListAccessKeys
 * action.
 * </p>
 */
public class ListAccessKeysResult {

    /**
     * A list of access key metadata.
     */
    private java.util.List<AccessKeyMetadata> accessKeyMetadata;

    /**
     * A flag that indicates whether there are more keys to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more keys
     * in the list.
     */
    private Boolean isTruncated;

    /**
     * If <code>IsTruncated</code> is true, this element is present and
     * contains the value to use for the <code>Marker</code> parameter in a
     * follow-up pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * A list of access key metadata.
     *
     * @return A list of access key metadata.
     */
    public java.util.List<AccessKeyMetadata> getAccessKeyMetadata() {
        if (accessKeyMetadata == null) {
            accessKeyMetadata = new java.util.ArrayList<AccessKeyMetadata>();
        }
        return accessKeyMetadata;
    }
    
    /**
     * A list of access key metadata.
     *
     * @param accessKeyMetadata A list of access key metadata.
     */
    public void setAccessKeyMetadata(java.util.Collection<AccessKeyMetadata> accessKeyMetadata) {
        java.util.List<AccessKeyMetadata> accessKeyMetadataCopy = new java.util.ArrayList<AccessKeyMetadata>();
        if (accessKeyMetadata != null) {
            accessKeyMetadataCopy.addAll(accessKeyMetadata);
        }
        this.accessKeyMetadata = accessKeyMetadataCopy;
    }
    
    /**
     * A list of access key metadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessKeyMetadata A list of access key metadata.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAccessKeysResult withAccessKeyMetadata(AccessKeyMetadata... accessKeyMetadata) {
        for (AccessKeyMetadata value : accessKeyMetadata) {
            getAccessKeyMetadata().add(value);
        }
        return this;
    }
    
    /**
     * A list of access key metadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessKeyMetadata A list of access key metadata.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAccessKeysResult withAccessKeyMetadata(java.util.Collection<AccessKeyMetadata> accessKeyMetadata) {
        java.util.List<AccessKeyMetadata> accessKeyMetadataCopy = new java.util.ArrayList<AccessKeyMetadata>();
        if (accessKeyMetadata != null) {
            accessKeyMetadataCopy.addAll(accessKeyMetadata);
        }
        this.accessKeyMetadata = accessKeyMetadataCopy;

        return this;
    }
    
    /**
     * A flag that indicates whether there are more keys to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more keys
     * in the list.
     *
     * @return A flag that indicates whether there are more keys to list. If your
     *         results were truncated, you can make a follow-up pagination request
     *         using the <code>Marker</code> request parameter to retrieve more keys
     *         in the list.
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more keys to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more keys
     * in the list.
     *
     * @param isTruncated A flag that indicates whether there are more keys to list. If your
     *         results were truncated, you can make a follow-up pagination request
     *         using the <code>Marker</code> request parameter to retrieve more keys
     *         in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more keys to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more keys
     * in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more keys to list. If your
     *         results were truncated, you can make a follow-up pagination request
     *         using the <code>Marker</code> request parameter to retrieve more keys
     *         in the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAccessKeysResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    
    
    /**
     * A flag that indicates whether there are more keys to list. If your
     * results were truncated, you can make a follow-up pagination request
     * using the <code>Marker</code> request parameter to retrieve more keys
     * in the list.
     *
     * @return A flag that indicates whether there are more keys to list. If your
     *         results were truncated, you can make a follow-up pagination request
     *         using the <code>Marker</code> request parameter to retrieve more keys
     *         in the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }
    
    /**
     * If <code>IsTruncated</code> is true, this element is present and
     * contains the value to use for the <code>Marker</code> parameter in a
     * follow-up pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return If <code>IsTruncated</code> is true, this element is present and
     *         contains the value to use for the <code>Marker</code> parameter in a
     *         follow-up pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If <code>IsTruncated</code> is true, this element is present and
     * contains the value to use for the <code>Marker</code> parameter in a
     * follow-up pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is true, this element is present and
     *         contains the value to use for the <code>Marker</code> parameter in a
     *         follow-up pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If <code>IsTruncated</code> is true, this element is present and
     * contains the value to use for the <code>Marker</code> parameter in a
     * follow-up pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is true, this element is present and
     *         contains the value to use for the <code>Marker</code> parameter in a
     *         follow-up pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListAccessKeysResult withMarker(String marker) {
        this.marker = marker;
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
        sb.append("AccessKeyMetadata: " + accessKeyMetadata + ", ");
        sb.append("IsTruncated: " + isTruncated + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    