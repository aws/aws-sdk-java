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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetShareResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A resource share details object. The object includes the status, the resourceArn, and ownerId.
     * </p>
     */
    private ShareDetails share;

    /**
     * <p>
     * A resource share details object. The object includes the status, the resourceArn, and ownerId.
     * </p>
     * 
     * @param share
     *        A resource share details object. The object includes the status, the resourceArn, and ownerId.
     */

    public void setShare(ShareDetails share) {
        this.share = share;
    }

    /**
     * <p>
     * A resource share details object. The object includes the status, the resourceArn, and ownerId.
     * </p>
     * 
     * @return A resource share details object. The object includes the status, the resourceArn, and ownerId.
     */

    public ShareDetails getShare() {
        return this.share;
    }

    /**
     * <p>
     * A resource share details object. The object includes the status, the resourceArn, and ownerId.
     * </p>
     * 
     * @param share
     *        A resource share details object. The object includes the status, the resourceArn, and ownerId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetShareResult withShare(ShareDetails share) {
        setShare(share);
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
        if (getShare() != null)
            sb.append("Share: ").append(getShare());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetShareResult == false)
            return false;
        GetShareResult other = (GetShareResult) obj;
        if (other.getShare() == null ^ this.getShare() == null)
            return false;
        if (other.getShare() != null && other.getShare().equals(this.getShare()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShare() == null) ? 0 : getShare().hashCode());
        return hashCode;
    }

    @Override
    public GetShareResult clone() {
        try {
            return (GetShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
