/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.repostspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/repostspace-2022-05-13/CreateSpace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSpaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the private re:Post.
     * </p>
     */
    private String spaceId;

    /**
     * <p>
     * The unique ID of the private re:Post.
     * </p>
     * 
     * @param spaceId
     *        The unique ID of the private re:Post.
     */

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    /**
     * <p>
     * The unique ID of the private re:Post.
     * </p>
     * 
     * @return The unique ID of the private re:Post.
     */

    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * <p>
     * The unique ID of the private re:Post.
     * </p>
     * 
     * @param spaceId
     *        The unique ID of the private re:Post.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSpaceResult withSpaceId(String spaceId) {
        setSpaceId(spaceId);
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
        if (getSpaceId() != null)
            sb.append("SpaceId: ").append(getSpaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSpaceResult == false)
            return false;
        CreateSpaceResult other = (CreateSpaceResult) obj;
        if (other.getSpaceId() == null ^ this.getSpaceId() == null)
            return false;
        if (other.getSpaceId() != null && other.getSpaceId().equals(this.getSpaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpaceId() == null) ? 0 : getSpaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSpaceResult clone() {
        try {
            return (CreateSpaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
