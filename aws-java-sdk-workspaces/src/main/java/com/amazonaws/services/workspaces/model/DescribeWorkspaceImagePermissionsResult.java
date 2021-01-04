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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceImagePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceImagePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the image.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The identifiers of the AWS accounts that the image has been shared with.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ImagePermission> imagePermissions;
    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @return The identifier of the image.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the image.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceImagePermissionsResult withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The identifiers of the AWS accounts that the image has been shared with.
     * </p>
     * 
     * @return The identifiers of the AWS accounts that the image has been shared with.
     */

    public java.util.List<ImagePermission> getImagePermissions() {
        if (imagePermissions == null) {
            imagePermissions = new com.amazonaws.internal.SdkInternalList<ImagePermission>();
        }
        return imagePermissions;
    }

    /**
     * <p>
     * The identifiers of the AWS accounts that the image has been shared with.
     * </p>
     * 
     * @param imagePermissions
     *        The identifiers of the AWS accounts that the image has been shared with.
     */

    public void setImagePermissions(java.util.Collection<ImagePermission> imagePermissions) {
        if (imagePermissions == null) {
            this.imagePermissions = null;
            return;
        }

        this.imagePermissions = new com.amazonaws.internal.SdkInternalList<ImagePermission>(imagePermissions);
    }

    /**
     * <p>
     * The identifiers of the AWS accounts that the image has been shared with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImagePermissions(java.util.Collection)} or {@link #withImagePermissions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param imagePermissions
     *        The identifiers of the AWS accounts that the image has been shared with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceImagePermissionsResult withImagePermissions(ImagePermission... imagePermissions) {
        if (this.imagePermissions == null) {
            setImagePermissions(new com.amazonaws.internal.SdkInternalList<ImagePermission>(imagePermissions.length));
        }
        for (ImagePermission ele : imagePermissions) {
            this.imagePermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the AWS accounts that the image has been shared with.
     * </p>
     * 
     * @param imagePermissions
     *        The identifiers of the AWS accounts that the image has been shared with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceImagePermissionsResult withImagePermissions(java.util.Collection<ImagePermission> imagePermissions) {
        setImagePermissions(imagePermissions);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @return The token to use to retrieve the next set of results, or null if no more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if no more results are available.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if no more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceImagePermissionsResult withNextToken(String nextToken) {
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getImagePermissions() != null)
            sb.append("ImagePermissions: ").append(getImagePermissions()).append(",");
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

        if (obj instanceof DescribeWorkspaceImagePermissionsResult == false)
            return false;
        DescribeWorkspaceImagePermissionsResult other = (DescribeWorkspaceImagePermissionsResult) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImagePermissions() == null ^ this.getImagePermissions() == null)
            return false;
        if (other.getImagePermissions() != null && other.getImagePermissions().equals(this.getImagePermissions()) == false)
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

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImagePermissions() == null) ? 0 : getImagePermissions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceImagePermissionsResult clone() {
        try {
            return (DescribeWorkspaceImagePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
