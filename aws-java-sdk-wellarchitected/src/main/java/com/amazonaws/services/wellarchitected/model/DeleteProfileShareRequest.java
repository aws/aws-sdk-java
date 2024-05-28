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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteProfileShare" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProfileShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String shareId;
    /**
     * <p>
     * The profile ARN.
     * </p>
     */
    private String profileArn;

    private String clientRequestToken;

    /**
     * @param shareId
     */

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    /**
     * @return
     */

    public String getShareId() {
        return this.shareId;
    }

    /**
     * @param shareId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileShareRequest withShareId(String shareId) {
        setShareId(shareId);
        return this;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     */

    public void setProfileArn(String profileArn) {
        this.profileArn = profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @return The profile ARN.
     */

    public String getProfileArn() {
        return this.profileArn;
    }

    /**
     * <p>
     * The profile ARN.
     * </p>
     * 
     * @param profileArn
     *        The profile ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileShareRequest withProfileArn(String profileArn) {
        setProfileArn(profileArn);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileShareRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getShareId() != null)
            sb.append("ShareId: ").append(getShareId()).append(",");
        if (getProfileArn() != null)
            sb.append("ProfileArn: ").append(getProfileArn()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProfileShareRequest == false)
            return false;
        DeleteProfileShareRequest other = (DeleteProfileShareRequest) obj;
        if (other.getShareId() == null ^ this.getShareId() == null)
            return false;
        if (other.getShareId() != null && other.getShareId().equals(this.getShareId()) == false)
            return false;
        if (other.getProfileArn() == null ^ this.getProfileArn() == null)
            return false;
        if (other.getProfileArn() != null && other.getProfileArn().equals(this.getProfileArn()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareId() == null) ? 0 : getShareId().hashCode());
        hashCode = prime * hashCode + ((getProfileArn() == null) ? 0 : getProfileArn().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProfileShareRequest clone() {
        return (DeleteProfileShareRequest) super.clone();
    }

}
