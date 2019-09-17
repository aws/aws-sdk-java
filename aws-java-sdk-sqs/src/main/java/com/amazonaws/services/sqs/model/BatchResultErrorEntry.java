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
package com.amazonaws.services.sqs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Gives a detailed description of the result of an action on each entry in the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sqs-2012-11-05/BatchResultErrorEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchResultErrorEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies whether the error happened due to the producer.
     * </p>
     */
    private Boolean senderFault;
    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request.
     * </p>
     * 
     * @param id
     *        The <code>Id</code> of an entry in a batch request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request.
     * </p>
     * 
     * @return The <code>Id</code> of an entry in a batch request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request.
     * </p>
     * 
     * @param id
     *        The <code>Id</code> of an entry in a batch request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchResultErrorEntry withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies whether the error happened due to the producer.
     * </p>
     * 
     * @param senderFault
     *        Specifies whether the error happened due to the producer.
     */

    public void setSenderFault(Boolean senderFault) {
        this.senderFault = senderFault;
    }

    /**
     * <p>
     * Specifies whether the error happened due to the producer.
     * </p>
     * 
     * @return Specifies whether the error happened due to the producer.
     */

    public Boolean getSenderFault() {
        return this.senderFault;
    }

    /**
     * <p>
     * Specifies whether the error happened due to the producer.
     * </p>
     * 
     * @param senderFault
     *        Specifies whether the error happened due to the producer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchResultErrorEntry withSenderFault(Boolean senderFault) {
        setSenderFault(senderFault);
        return this;
    }

    /**
     * <p>
     * Specifies whether the error happened due to the producer.
     * </p>
     * 
     * @return Specifies whether the error happened due to the producer.
     */

    public Boolean isSenderFault() {
        return this.senderFault;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     * 
     * @param code
     *        An error code representing why the action failed on this entry.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     * 
     * @return An error code representing why the action failed on this entry.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     * 
     * @param code
     *        An error code representing why the action failed on this entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchResultErrorEntry withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     * 
     * @param message
     *        A message explaining why the action failed on this entry.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     * 
     * @return A message explaining why the action failed on this entry.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     * 
     * @param message
     *        A message explaining why the action failed on this entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchResultErrorEntry withMessage(String message) {
        setMessage(message);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSenderFault() != null)
            sb.append("SenderFault: ").append(getSenderFault()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchResultErrorEntry == false)
            return false;
        BatchResultErrorEntry other = (BatchResultErrorEntry) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSenderFault() == null ^ this.getSenderFault() == null)
            return false;
        if (other.getSenderFault() != null && other.getSenderFault().equals(this.getSenderFault()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSenderFault() == null) ? 0 : getSenderFault().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public BatchResultErrorEntry clone() {
        try {
            return (BatchResultErrorEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
