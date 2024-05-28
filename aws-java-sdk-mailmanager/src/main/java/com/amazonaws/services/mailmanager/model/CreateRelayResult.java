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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateRelay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRelayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the created relay resource.
     * </p>
     */
    private String relayId;

    /**
     * <p>
     * A unique identifier of the created relay resource.
     * </p>
     * 
     * @param relayId
     *        A unique identifier of the created relay resource.
     */

    public void setRelayId(String relayId) {
        this.relayId = relayId;
    }

    /**
     * <p>
     * A unique identifier of the created relay resource.
     * </p>
     * 
     * @return A unique identifier of the created relay resource.
     */

    public String getRelayId() {
        return this.relayId;
    }

    /**
     * <p>
     * A unique identifier of the created relay resource.
     * </p>
     * 
     * @param relayId
     *        A unique identifier of the created relay resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelayResult withRelayId(String relayId) {
        setRelayId(relayId);
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
        if (getRelayId() != null)
            sb.append("RelayId: ").append(getRelayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRelayResult == false)
            return false;
        CreateRelayResult other = (CreateRelayResult) obj;
        if (other.getRelayId() == null ^ this.getRelayId() == null)
            return false;
        if (other.getRelayId() != null && other.getRelayId().equals(this.getRelayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelayId() == null) ? 0 : getRelayId().hashCode());
        return hashCode;
    }

    @Override
    public CreateRelayResult clone() {
        try {
            return (CreateRelayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
