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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteHsm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteHsmResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier (ID) of the HSM that was deleted.
     * </p>
     */
    private String hsmId;

    /**
     * <p>
     * The identifier (ID) of the HSM that was deleted.
     * </p>
     * 
     * @param hsmId
     *        The identifier (ID) of the HSM that was deleted.
     */

    public void setHsmId(String hsmId) {
        this.hsmId = hsmId;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM that was deleted.
     * </p>
     * 
     * @return The identifier (ID) of the HSM that was deleted.
     */

    public String getHsmId() {
        return this.hsmId;
    }

    /**
     * <p>
     * The identifier (ID) of the HSM that was deleted.
     * </p>
     * 
     * @param hsmId
     *        The identifier (ID) of the HSM that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteHsmResult withHsmId(String hsmId) {
        setHsmId(hsmId);
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
        if (getHsmId() != null)
            sb.append("HsmId: ").append(getHsmId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHsmResult == false)
            return false;
        DeleteHsmResult other = (DeleteHsmResult) obj;
        if (other.getHsmId() == null ^ this.getHsmId() == null)
            return false;
        if (other.getHsmId() != null && other.getHsmId().equals(this.getHsmId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHsmId() == null) ? 0 : getHsmId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHsmResult clone() {
        try {
            return (DeleteHsmResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
