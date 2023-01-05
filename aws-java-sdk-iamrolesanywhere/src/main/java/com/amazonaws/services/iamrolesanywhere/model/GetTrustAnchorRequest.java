/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetTrustAnchor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTrustAnchorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     */
    private String trustAnchorId;

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @param trustAnchorId
     *        The unique identifier of the trust anchor.
     */

    public void setTrustAnchorId(String trustAnchorId) {
        this.trustAnchorId = trustAnchorId;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @return The unique identifier of the trust anchor.
     */

    public String getTrustAnchorId() {
        return this.trustAnchorId;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @param trustAnchorId
     *        The unique identifier of the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrustAnchorRequest withTrustAnchorId(String trustAnchorId) {
        setTrustAnchorId(trustAnchorId);
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
        if (getTrustAnchorId() != null)
            sb.append("TrustAnchorId: ").append(getTrustAnchorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrustAnchorRequest == false)
            return false;
        GetTrustAnchorRequest other = (GetTrustAnchorRequest) obj;
        if (other.getTrustAnchorId() == null ^ this.getTrustAnchorId() == null)
            return false;
        if (other.getTrustAnchorId() != null && other.getTrustAnchorId().equals(this.getTrustAnchorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustAnchorId() == null) ? 0 : getTrustAnchorId().hashCode());
        return hashCode;
    }

    @Override
    public GetTrustAnchorRequest clone() {
        return (GetTrustAnchorRequest) super.clone();
    }

}
