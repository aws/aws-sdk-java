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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListImageVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImageVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of versions and their properties.
     * </p>
     */
    private java.util.List<ImageVersion> imageVersions;
    /**
     * <p>
     * A token for getting the next set of versions, if there are any.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of versions and their properties.
     * </p>
     * 
     * @return A list of versions and their properties.
     */

    public java.util.List<ImageVersion> getImageVersions() {
        return imageVersions;
    }

    /**
     * <p>
     * A list of versions and their properties.
     * </p>
     * 
     * @param imageVersions
     *        A list of versions and their properties.
     */

    public void setImageVersions(java.util.Collection<ImageVersion> imageVersions) {
        if (imageVersions == null) {
            this.imageVersions = null;
            return;
        }

        this.imageVersions = new java.util.ArrayList<ImageVersion>(imageVersions);
    }

    /**
     * <p>
     * A list of versions and their properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageVersions(java.util.Collection)} or {@link #withImageVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param imageVersions
     *        A list of versions and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageVersionsResult withImageVersions(ImageVersion... imageVersions) {
        if (this.imageVersions == null) {
            setImageVersions(new java.util.ArrayList<ImageVersion>(imageVersions.length));
        }
        for (ImageVersion ele : imageVersions) {
            this.imageVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of versions and their properties.
     * </p>
     * 
     * @param imageVersions
     *        A list of versions and their properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageVersionsResult withImageVersions(java.util.Collection<ImageVersion> imageVersions) {
        setImageVersions(imageVersions);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of versions, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of versions, if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of versions, if there are any.
     * </p>
     * 
     * @return A token for getting the next set of versions, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of versions, if there are any.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of versions, if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImageVersionsResult withNextToken(String nextToken) {
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
        if (getImageVersions() != null)
            sb.append("ImageVersions: ").append(getImageVersions()).append(",");
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

        if (obj instanceof ListImageVersionsResult == false)
            return false;
        ListImageVersionsResult other = (ListImageVersionsResult) obj;
        if (other.getImageVersions() == null ^ this.getImageVersions() == null)
            return false;
        if (other.getImageVersions() != null && other.getImageVersions().equals(this.getImageVersions()) == false)
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

        hashCode = prime * hashCode + ((getImageVersions() == null) ? 0 : getImageVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImageVersionsResult clone() {
        try {
            return (ListImageVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
