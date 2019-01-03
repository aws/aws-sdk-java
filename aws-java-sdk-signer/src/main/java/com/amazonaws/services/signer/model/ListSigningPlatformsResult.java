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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningPlatforms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSigningPlatformsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all platforms that match the request parameters.
     * </p>
     */
    private java.util.List<SigningPlatform> platforms;
    /**
     * <p>
     * Value for specifying the next set of paginated results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of all platforms that match the request parameters.
     * </p>
     * 
     * @return A list of all platforms that match the request parameters.
     */

    public java.util.List<SigningPlatform> getPlatforms() {
        return platforms;
    }

    /**
     * <p>
     * A list of all platforms that match the request parameters.
     * </p>
     * 
     * @param platforms
     *        A list of all platforms that match the request parameters.
     */

    public void setPlatforms(java.util.Collection<SigningPlatform> platforms) {
        if (platforms == null) {
            this.platforms = null;
            return;
        }

        this.platforms = new java.util.ArrayList<SigningPlatform>(platforms);
    }

    /**
     * <p>
     * A list of all platforms that match the request parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatforms(java.util.Collection)} or {@link #withPlatforms(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param platforms
     *        A list of all platforms that match the request parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningPlatformsResult withPlatforms(SigningPlatform... platforms) {
        if (this.platforms == null) {
            setPlatforms(new java.util.ArrayList<SigningPlatform>(platforms.length));
        }
        for (SigningPlatform ele : platforms) {
            this.platforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all platforms that match the request parameters.
     * </p>
     * 
     * @param platforms
     *        A list of all platforms that match the request parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningPlatformsResult withPlatforms(java.util.Collection<SigningPlatform> platforms) {
        setPlatforms(platforms);
        return this;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return.
     * </p>
     * 
     * @param nextToken
     *        Value for specifying the next set of paginated results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return.
     * </p>
     * 
     * @return Value for specifying the next set of paginated results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Value for specifying the next set of paginated results to return.
     * </p>
     * 
     * @param nextToken
     *        Value for specifying the next set of paginated results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSigningPlatformsResult withNextToken(String nextToken) {
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
        if (getPlatforms() != null)
            sb.append("Platforms: ").append(getPlatforms()).append(",");
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

        if (obj instanceof ListSigningPlatformsResult == false)
            return false;
        ListSigningPlatformsResult other = (ListSigningPlatformsResult) obj;
        if (other.getPlatforms() == null ^ this.getPlatforms() == null)
            return false;
        if (other.getPlatforms() != null && other.getPlatforms().equals(this.getPlatforms()) == false)
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

        hashCode = prime * hashCode + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSigningPlatformsResult clone() {
        try {
            return (ListSigningPlatformsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
