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
public class GetImageBlockPublicAccessStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The current state of block public access for AMIs at the account level in the specified Amazon Web Services
     * Region.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Any attempt to publicly share your AMIs in the specified Region is blocked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Your AMIs in the specified Region can be publicly shared.
     * </p>
     * </li>
     * </ul>
     */
    private String imageBlockPublicAccessState;

    /**
     * <p>
     * The current state of block public access for AMIs at the account level in the specified Amazon Web Services
     * Region.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Any attempt to publicly share your AMIs in the specified Region is blocked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Your AMIs in the specified Region can be publicly shared.
     * </p>
     * </li>
     * </ul>
     * 
     * @param imageBlockPublicAccessState
     *        The current state of block public access for AMIs at the account level in the specified Amazon Web
     *        Services Region.</p>
     *        <p>
     *        Possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>block-new-sharing</code> - Any attempt to publicly share your AMIs in the specified Region is
     *        blocked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unblocked</code> - Your AMIs in the specified Region can be publicly shared.
     *        </p>
     *        </li>
     */

    public void setImageBlockPublicAccessState(String imageBlockPublicAccessState) {
        this.imageBlockPublicAccessState = imageBlockPublicAccessState;
    }

    /**
     * <p>
     * The current state of block public access for AMIs at the account level in the specified Amazon Web Services
     * Region.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Any attempt to publicly share your AMIs in the specified Region is blocked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Your AMIs in the specified Region can be publicly shared.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of block public access for AMIs at the account level in the specified Amazon Web
     *         Services Region.</p>
     *         <p>
     *         Possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>block-new-sharing</code> - Any attempt to publicly share your AMIs in the specified Region is
     *         blocked.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unblocked</code> - Your AMIs in the specified Region can be publicly shared.
     *         </p>
     *         </li>
     */

    public String getImageBlockPublicAccessState() {
        return this.imageBlockPublicAccessState;
    }

    /**
     * <p>
     * The current state of block public access for AMIs at the account level in the specified Amazon Web Services
     * Region.
     * </p>
     * <p>
     * Possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>block-new-sharing</code> - Any attempt to publicly share your AMIs in the specified Region is blocked.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unblocked</code> - Your AMIs in the specified Region can be publicly shared.
     * </p>
     * </li>
     * </ul>
     * 
     * @param imageBlockPublicAccessState
     *        The current state of block public access for AMIs at the account level in the specified Amazon Web
     *        Services Region.</p>
     *        <p>
     *        Possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>block-new-sharing</code> - Any attempt to publicly share your AMIs in the specified Region is
     *        blocked.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unblocked</code> - Your AMIs in the specified Region can be publicly shared.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageBlockPublicAccessStateResult withImageBlockPublicAccessState(String imageBlockPublicAccessState) {
        setImageBlockPublicAccessState(imageBlockPublicAccessState);
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

        if (obj instanceof GetImageBlockPublicAccessStateResult == false)
            return false;
        GetImageBlockPublicAccessStateResult other = (GetImageBlockPublicAccessStateResult) obj;
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
    public GetImageBlockPublicAccessStateResult clone() {
        try {
            return (GetImageBlockPublicAccessStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
