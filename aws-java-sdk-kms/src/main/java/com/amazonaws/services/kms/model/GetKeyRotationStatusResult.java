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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetKeyRotationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKeyRotationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     */
    private Boolean keyRotationEnabled;

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * 
     * @param keyRotationEnabled
     *        A Boolean value that specifies whether key rotation is enabled.
     */

    public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * 
     * @return A Boolean value that specifies whether key rotation is enabled.
     */

    public Boolean getKeyRotationEnabled() {
        return this.keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * 
     * @param keyRotationEnabled
     *        A Boolean value that specifies whether key rotation is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyRotationStatusResult withKeyRotationEnabled(Boolean keyRotationEnabled) {
        setKeyRotationEnabled(keyRotationEnabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * 
     * @return A Boolean value that specifies whether key rotation is enabled.
     */

    public Boolean isKeyRotationEnabled() {
        return this.keyRotationEnabled;
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
        if (getKeyRotationEnabled() != null)
            sb.append("KeyRotationEnabled: ").append(getKeyRotationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyRotationStatusResult == false)
            return false;
        GetKeyRotationStatusResult other = (GetKeyRotationStatusResult) obj;
        if (other.getKeyRotationEnabled() == null ^ this.getKeyRotationEnabled() == null)
            return false;
        if (other.getKeyRotationEnabled() != null && other.getKeyRotationEnabled().equals(this.getKeyRotationEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyRotationEnabled() == null) ? 0 : getKeyRotationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyRotationStatusResult clone() {
        try {
            return (GetKeyRotationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
