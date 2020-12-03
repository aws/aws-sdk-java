/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata associated with received licenses and grants.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ReceivedMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReceivedMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Received status.
     * </p>
     */
    private String receivedStatus;
    /**
     * <p>
     * Allowed operations.
     * </p>
     */
    private java.util.List<String> allowedOperations;

    /**
     * <p>
     * Received status.
     * </p>
     * 
     * @param receivedStatus
     *        Received status.
     * @see ReceivedStatus
     */

    public void setReceivedStatus(String receivedStatus) {
        this.receivedStatus = receivedStatus;
    }

    /**
     * <p>
     * Received status.
     * </p>
     * 
     * @return Received status.
     * @see ReceivedStatus
     */

    public String getReceivedStatus() {
        return this.receivedStatus;
    }

    /**
     * <p>
     * Received status.
     * </p>
     * 
     * @param receivedStatus
     *        Received status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReceivedStatus
     */

    public ReceivedMetadata withReceivedStatus(String receivedStatus) {
        setReceivedStatus(receivedStatus);
        return this;
    }

    /**
     * <p>
     * Received status.
     * </p>
     * 
     * @param receivedStatus
     *        Received status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReceivedStatus
     */

    public ReceivedMetadata withReceivedStatus(ReceivedStatus receivedStatus) {
        this.receivedStatus = receivedStatus.toString();
        return this;
    }

    /**
     * <p>
     * Allowed operations.
     * </p>
     * 
     * @return Allowed operations.
     * @see AllowedOperation
     */

    public java.util.List<String> getAllowedOperations() {
        return allowedOperations;
    }

    /**
     * <p>
     * Allowed operations.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations.
     * @see AllowedOperation
     */

    public void setAllowedOperations(java.util.Collection<String> allowedOperations) {
        if (allowedOperations == null) {
            this.allowedOperations = null;
            return;
        }

        this.allowedOperations = new java.util.ArrayList<String>(allowedOperations);
    }

    /**
     * <p>
     * Allowed operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOperations(java.util.Collection)} or {@link #withAllowedOperations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public ReceivedMetadata withAllowedOperations(String... allowedOperations) {
        if (this.allowedOperations == null) {
            setAllowedOperations(new java.util.ArrayList<String>(allowedOperations.length));
        }
        for (String ele : allowedOperations) {
            this.allowedOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Allowed operations.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public ReceivedMetadata withAllowedOperations(java.util.Collection<String> allowedOperations) {
        setAllowedOperations(allowedOperations);
        return this;
    }

    /**
     * <p>
     * Allowed operations.
     * </p>
     * 
     * @param allowedOperations
     *        Allowed operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowedOperation
     */

    public ReceivedMetadata withAllowedOperations(AllowedOperation... allowedOperations) {
        java.util.ArrayList<String> allowedOperationsCopy = new java.util.ArrayList<String>(allowedOperations.length);
        for (AllowedOperation value : allowedOperations) {
            allowedOperationsCopy.add(value.toString());
        }
        if (getAllowedOperations() == null) {
            setAllowedOperations(allowedOperationsCopy);
        } else {
            getAllowedOperations().addAll(allowedOperationsCopy);
        }
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
        if (getReceivedStatus() != null)
            sb.append("ReceivedStatus: ").append(getReceivedStatus()).append(",");
        if (getAllowedOperations() != null)
            sb.append("AllowedOperations: ").append(getAllowedOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReceivedMetadata == false)
            return false;
        ReceivedMetadata other = (ReceivedMetadata) obj;
        if (other.getReceivedStatus() == null ^ this.getReceivedStatus() == null)
            return false;
        if (other.getReceivedStatus() != null && other.getReceivedStatus().equals(this.getReceivedStatus()) == false)
            return false;
        if (other.getAllowedOperations() == null ^ this.getAllowedOperations() == null)
            return false;
        if (other.getAllowedOperations() != null && other.getAllowedOperations().equals(this.getAllowedOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReceivedStatus() == null) ? 0 : getReceivedStatus().hashCode());
        hashCode = prime * hashCode + ((getAllowedOperations() == null) ? 0 : getAllowedOperations().hashCode());
        return hashCode;
    }

    @Override
    public ReceivedMetadata clone() {
        try {
            return (ReceivedMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ReceivedMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
