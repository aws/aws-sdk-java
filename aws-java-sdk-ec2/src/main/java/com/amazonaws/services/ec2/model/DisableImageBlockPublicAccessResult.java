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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableImageBlockPublicAccessResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     */
    private String imageBlockPublicAccessState;

    /**
     * <p>
     * Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @param imageBlockPublicAccessState
     *        Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * @see ImageBlockPublicAccessDisabledState
     */

    public void setImageBlockPublicAccessState(String imageBlockPublicAccessState) {
        this.imageBlockPublicAccessState = imageBlockPublicAccessState;
    }

    /**
     * <p>
     * Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @return Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * @see ImageBlockPublicAccessDisabledState
     */

    public String getImageBlockPublicAccessState() {
        return this.imageBlockPublicAccessState;
    }

    /**
     * <p>
     * Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @param imageBlockPublicAccessState
     *        Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageBlockPublicAccessDisabledState
     */

    public DisableImageBlockPublicAccessResult withImageBlockPublicAccessState(String imageBlockPublicAccessState) {
        setImageBlockPublicAccessState(imageBlockPublicAccessState);
        return this;
    }

    /**
     * <p>
     * Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @param imageBlockPublicAccessState
     *        Returns <code>unblocked</code> if the request succeeds; otherwise, it returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageBlockPublicAccessDisabledState
     */

    public DisableImageBlockPublicAccessResult withImageBlockPublicAccessState(ImageBlockPublicAccessDisabledState imageBlockPublicAccessState) {
        this.imageBlockPublicAccessState = imageBlockPublicAccessState.toString();
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
        if (getImageBlockPublicAccessState() != null)
            sb.append("ImageBlockPublicAccessState: ").append(getImageBlockPublicAccessState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableImageBlockPublicAccessResult == false)
            return false;
        DisableImageBlockPublicAccessResult other = (DisableImageBlockPublicAccessResult) obj;
        if (other.getImageBlockPublicAccessState() == null ^ this.getImageBlockPublicAccessState() == null)
            return false;
        if (other.getImageBlockPublicAccessState() != null && other.getImageBlockPublicAccessState().equals(this.getImageBlockPublicAccessState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageBlockPublicAccessState() == null) ? 0 : getImageBlockPublicAccessState().hashCode());
        return hashCode;
    }

    @Override
    public DisableImageBlockPublicAccessResult clone() {
        try {
            return (DisableImageBlockPublicAccessResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
