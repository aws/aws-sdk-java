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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/CreateTrustAnchor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrustAnchorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the trust anchor after a read or write operation.
     * </p>
     */
    private TrustAnchorDetail trustAnchor;

    /**
     * <p>
     * The state of the trust anchor after a read or write operation.
     * </p>
     * 
     * @param trustAnchor
     *        The state of the trust anchor after a read or write operation.
     */

    public void setTrustAnchor(TrustAnchorDetail trustAnchor) {
        this.trustAnchor = trustAnchor;
    }

    /**
     * <p>
     * The state of the trust anchor after a read or write operation.
     * </p>
     * 
     * @return The state of the trust anchor after a read or write operation.
     */

    public TrustAnchorDetail getTrustAnchor() {
        return this.trustAnchor;
    }

    /**
     * <p>
     * The state of the trust anchor after a read or write operation.
     * </p>
     * 
     * @param trustAnchor
     *        The state of the trust anchor after a read or write operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustAnchorResult withTrustAnchor(TrustAnchorDetail trustAnchor) {
        setTrustAnchor(trustAnchor);
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
        if (getTrustAnchor() != null)
            sb.append("TrustAnchor: ").append(getTrustAnchor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrustAnchorResult == false)
            return false;
        CreateTrustAnchorResult other = (CreateTrustAnchorResult) obj;
        if (other.getTrustAnchor() == null ^ this.getTrustAnchor() == null)
            return false;
        if (other.getTrustAnchor() != null && other.getTrustAnchor().equals(this.getTrustAnchor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustAnchor() == null) ? 0 : getTrustAnchor().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrustAnchorResult clone() {
        try {
            return (CreateTrustAnchorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
