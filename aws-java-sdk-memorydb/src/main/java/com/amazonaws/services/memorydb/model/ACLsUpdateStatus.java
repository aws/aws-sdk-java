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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the ACL update
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ACLsUpdateStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ACLsUpdateStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of ACLs pending to be applied.
     * </p>
     */
    private String aCLToApply;

    /**
     * <p>
     * A list of ACLs pending to be applied.
     * </p>
     * 
     * @param aCLToApply
     *        A list of ACLs pending to be applied.
     */

    public void setACLToApply(String aCLToApply) {
        this.aCLToApply = aCLToApply;
    }

    /**
     * <p>
     * A list of ACLs pending to be applied.
     * </p>
     * 
     * @return A list of ACLs pending to be applied.
     */

    public String getACLToApply() {
        return this.aCLToApply;
    }

    /**
     * <p>
     * A list of ACLs pending to be applied.
     * </p>
     * 
     * @param aCLToApply
     *        A list of ACLs pending to be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ACLsUpdateStatus withACLToApply(String aCLToApply) {
        setACLToApply(aCLToApply);
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
        if (getACLToApply() != null)
            sb.append("ACLToApply: ").append(getACLToApply());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ACLsUpdateStatus == false)
            return false;
        ACLsUpdateStatus other = (ACLsUpdateStatus) obj;
        if (other.getACLToApply() == null ^ this.getACLToApply() == null)
            return false;
        if (other.getACLToApply() != null && other.getACLToApply().equals(this.getACLToApply()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getACLToApply() == null) ? 0 : getACLToApply().hashCode());
        return hashCode;
    }

    @Override
    public ACLsUpdateStatus clone() {
        try {
            return (ACLsUpdateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ACLsUpdateStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
