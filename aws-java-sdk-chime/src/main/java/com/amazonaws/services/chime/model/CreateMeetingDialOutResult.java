/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeetingDialOut" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMeetingDialOutResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique ID that tracks API calls.
     * </p>
     */
    private String transactionId;

    /**
     * <p>
     * Unique ID that tracks API calls.
     * </p>
     * 
     * @param transactionId
     *        Unique ID that tracks API calls.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * Unique ID that tracks API calls.
     * </p>
     * 
     * @return Unique ID that tracks API calls.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * Unique ID that tracks API calls.
     * </p>
     * 
     * @param transactionId
     *        Unique ID that tracks API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMeetingDialOutResult withTransactionId(String transactionId) {
        setTransactionId(transactionId);
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
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMeetingDialOutResult == false)
            return false;
        CreateMeetingDialOutResult other = (CreateMeetingDialOutResult) obj;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMeetingDialOutResult clone() {
        try {
            return (CreateMeetingDialOutResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
