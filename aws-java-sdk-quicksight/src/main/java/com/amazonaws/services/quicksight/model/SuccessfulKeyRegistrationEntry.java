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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A success entry that occurs when a <code>KeyRegistration</code> job is successfully applied to the Amazon QuickSight
 * account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SuccessfulKeyRegistrationEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuccessfulKeyRegistrationEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the KMS key that is associated with the <code>SuccessfulKeyRegistrationEntry</code> entry.
     * </p>
     */
    private String keyArn;
    /**
     * <p>
     * The HTTP status of a <code>SuccessfulKeyRegistrationEntry</code> entry.
     * </p>
     */
    private Integer statusCode;

    /**
     * <p>
     * The ARN of the KMS key that is associated with the <code>SuccessfulKeyRegistrationEntry</code> entry.
     * </p>
     * 
     * @param keyArn
     *        The ARN of the KMS key that is associated with the <code>SuccessfulKeyRegistrationEntry</code> entry.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that is associated with the <code>SuccessfulKeyRegistrationEntry</code> entry.
     * </p>
     * 
     * @return The ARN of the KMS key that is associated with the <code>SuccessfulKeyRegistrationEntry</code> entry.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key that is associated with the <code>SuccessfulKeyRegistrationEntry</code> entry.
     * </p>
     * 
     * @param keyArn
     *        The ARN of the KMS key that is associated with the <code>SuccessfulKeyRegistrationEntry</code> entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuccessfulKeyRegistrationEntry withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * The HTTP status of a <code>SuccessfulKeyRegistrationEntry</code> entry.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status of a <code>SuccessfulKeyRegistrationEntry</code> entry.
     */

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status of a <code>SuccessfulKeyRegistrationEntry</code> entry.
     * </p>
     * 
     * @return The HTTP status of a <code>SuccessfulKeyRegistrationEntry</code> entry.
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP status of a <code>SuccessfulKeyRegistrationEntry</code> entry.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status of a <code>SuccessfulKeyRegistrationEntry</code> entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuccessfulKeyRegistrationEntry withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuccessfulKeyRegistrationEntry == false)
            return false;
        SuccessfulKeyRegistrationEntry other = (SuccessfulKeyRegistrationEntry) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public SuccessfulKeyRegistrationEntry clone() {
        try {
            return (SuccessfulKeyRegistrationEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SuccessfulKeyRegistrationEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
