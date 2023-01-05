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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A genome reference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ReferenceItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reference's ARN.
     * </p>
     */
    private String referenceArn;

    /**
     * <p>
     * The reference's ARN.
     * </p>
     * 
     * @param referenceArn
     *        The reference's ARN.
     */

    public void setReferenceArn(String referenceArn) {
        this.referenceArn = referenceArn;
    }

    /**
     * <p>
     * The reference's ARN.
     * </p>
     * 
     * @return The reference's ARN.
     */

    public String getReferenceArn() {
        return this.referenceArn;
    }

    /**
     * <p>
     * The reference's ARN.
     * </p>
     * 
     * @param referenceArn
     *        The reference's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceItem withReferenceArn(String referenceArn) {
        setReferenceArn(referenceArn);
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
        if (getReferenceArn() != null)
            sb.append("ReferenceArn: ").append(getReferenceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceItem == false)
            return false;
        ReferenceItem other = (ReferenceItem) obj;
        if (other.getReferenceArn() == null ^ this.getReferenceArn() == null)
            return false;
        if (other.getReferenceArn() != null && other.getReferenceArn().equals(this.getReferenceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReferenceArn() == null) ? 0 : getReferenceArn().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceItem clone() {
        try {
            return (ReferenceItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ReferenceItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
