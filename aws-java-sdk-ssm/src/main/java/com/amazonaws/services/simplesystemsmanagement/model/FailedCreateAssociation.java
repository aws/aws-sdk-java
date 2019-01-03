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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a failed association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/FailedCreateAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedCreateAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The association.
     * </p>
     */
    private CreateAssociationBatchRequestEntry entry;
    /**
     * <p>
     * A description of the failure.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The source of the failure.
     * </p>
     */
    private String fault;

    /**
     * <p>
     * The association.
     * </p>
     * 
     * @param entry
     *        The association.
     */

    public void setEntry(CreateAssociationBatchRequestEntry entry) {
        this.entry = entry;
    }

    /**
     * <p>
     * The association.
     * </p>
     * 
     * @return The association.
     */

    public CreateAssociationBatchRequestEntry getEntry() {
        return this.entry;
    }

    /**
     * <p>
     * The association.
     * </p>
     * 
     * @param entry
     *        The association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateAssociation withEntry(CreateAssociationBatchRequestEntry entry) {
        setEntry(entry);
        return this;
    }

    /**
     * <p>
     * A description of the failure.
     * </p>
     * 
     * @param message
     *        A description of the failure.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the failure.
     * </p>
     * 
     * @return A description of the failure.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the failure.
     * </p>
     * 
     * @param message
     *        A description of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateAssociation withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * 
     * @param fault
     *        The source of the failure.
     * @see Fault
     */

    public void setFault(String fault) {
        this.fault = fault;
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * 
     * @return The source of the failure.
     * @see Fault
     */

    public String getFault() {
        return this.fault;
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * 
     * @param fault
     *        The source of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Fault
     */

    public FailedCreateAssociation withFault(String fault) {
        setFault(fault);
        return this;
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * 
     * @param fault
     *        The source of the failure.
     * @see Fault
     */

    public void setFault(Fault fault) {
        withFault(fault);
    }

    /**
     * <p>
     * The source of the failure.
     * </p>
     * 
     * @param fault
     *        The source of the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Fault
     */

    public FailedCreateAssociation withFault(Fault fault) {
        this.fault = fault.toString();
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
        if (getEntry() != null)
            sb.append("Entry: ").append(getEntry()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getFault() != null)
            sb.append("Fault: ").append(getFault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedCreateAssociation == false)
            return false;
        FailedCreateAssociation other = (FailedCreateAssociation) obj;
        if (other.getEntry() == null ^ this.getEntry() == null)
            return false;
        if (other.getEntry() != null && other.getEntry().equals(this.getEntry()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getFault() == null ^ this.getFault() == null)
            return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntry() == null) ? 0 : getEntry().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode());
        return hashCode;
    }

    @Override
    public FailedCreateAssociation clone() {
        try {
            return (FailedCreateAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.FailedCreateAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
