/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListImagePackages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImagePackagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The list of Image Packages returned in the response.
     * </p>
     */
    private java.util.List<ImagePackage> imagePackageList;
    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagePackagesResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The list of Image Packages returned in the response.
     * </p>
     * 
     * @return The list of Image Packages returned in the response.
     */

    public java.util.List<ImagePackage> getImagePackageList() {
        return imagePackageList;
    }

    /**
     * <p>
     * The list of Image Packages returned in the response.
     * </p>
     * 
     * @param imagePackageList
     *        The list of Image Packages returned in the response.
     */

    public void setImagePackageList(java.util.Collection<ImagePackage> imagePackageList) {
        if (imagePackageList == null) {
            this.imagePackageList = null;
            return;
        }

        this.imagePackageList = new java.util.ArrayList<ImagePackage>(imagePackageList);
    }

    /**
     * <p>
     * The list of Image Packages returned in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImagePackageList(java.util.Collection)} or {@link #withImagePackageList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param imagePackageList
     *        The list of Image Packages returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagePackagesResult withImagePackageList(ImagePackage... imagePackageList) {
        if (this.imagePackageList == null) {
            setImagePackageList(new java.util.ArrayList<ImagePackage>(imagePackageList.length));
        }
        for (ImagePackage ele : imagePackageList) {
            this.imagePackageList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Image Packages returned in the response.
     * </p>
     * 
     * @param imagePackageList
     *        The list of Image Packages returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagePackagesResult withImagePackageList(java.util.Collection<ImagePackage> imagePackageList) {
        setImagePackageList(imagePackageList);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @return A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start paginating. This is the NextToken from a previously truncated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagePackagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getImagePackageList() != null)
            sb.append("ImagePackageList: ").append(getImagePackageList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImagePackagesResult == false)
            return false;
        ListImagePackagesResult other = (ListImagePackagesResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getImagePackageList() == null ^ this.getImagePackageList() == null)
            return false;
        if (other.getImagePackageList() != null && other.getImagePackageList().equals(this.getImagePackageList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getImagePackageList() == null) ? 0 : getImagePackageList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImagePackagesResult clone() {
        try {
            return (ListImagePackagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
