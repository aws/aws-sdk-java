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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/AcceptShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptShareRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource share.
     * </p>
     */
    private String shareId;

    /**
     * <p>
     * The ID of the resource share.
     * </p>
     * 
     * @param shareId
     *        The ID of the resource share.
     */

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    /**
     * <p>
     * The ID of the resource share.
     * </p>
     * 
     * @return The ID of the resource share.
     */

    public String getShareId() {
        return this.shareId;
    }

    /**
     * <p>
     * The ID of the resource share.
     * </p>
     * 
     * @param shareId
     *        The ID of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptShareRequest withShareId(String shareId) {
        setShareId(shareId);
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
            sb.append("ShareId: ").append(getShareId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptShareRequest == false)
            return false;
        AcceptShareRequest other = (AcceptShareRequest) obj;
        if (other.getShareId() == null ^ this.getShareId() == null)
            return false;
        if (other.getShareId() != null && other.getShareId().equals(this.getShareId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareId() == null) ? 0 : getShareId().hashCode());
        return hashCode;
    }

    @Override
    public AcceptShareRequest clone() {
        return (AcceptShareRequest) super.clone();
    }

}
