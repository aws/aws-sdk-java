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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for information about a configuration change happening on a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeProgressDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the configuration change.
     * </p>
     */
    private String changeId;
    /**
     * <p>
     * A message corresponding to the status of the configuration change.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The ID of the configuration change.
     * </p>
     * 
     * @param changeId
     *        The ID of the configuration change.
     */

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    /**
     * <p>
     * The ID of the configuration change.
     * </p>
     * 
     * @return The ID of the configuration change.
     */

    public String getChangeId() {
        return this.changeId;
    }

    /**
     * <p>
     * The ID of the configuration change.
     * </p>
     * 
     * @param changeId
     *        The ID of the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressDetails withChangeId(String changeId) {
        setChangeId(changeId);
        return this;
    }

    /**
     * <p>
     * A message corresponding to the status of the configuration change.
     * </p>
     * 
     * @param message
     *        A message corresponding to the status of the configuration change.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message corresponding to the status of the configuration change.
     * </p>
     * 
     * @return A message corresponding to the status of the configuration change.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message corresponding to the status of the configuration change.
     * </p>
     * 
     * @param message
     *        A message corresponding to the status of the configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangeProgressDetails withMessage(String message) {
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
        if (getChangeId() != null)
            sb.append("ChangeId: ").append(getChangeId()).append(",");
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

        if (obj instanceof ChangeProgressDetails == false)
            return false;
        ChangeProgressDetails other = (ChangeProgressDetails) obj;
        if (other.getChangeId() == null ^ this.getChangeId() == null)
            return false;
        if (other.getChangeId() != null && other.getChangeId().equals(this.getChangeId()) == false)
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

        hashCode = prime * hashCode + ((getChangeId() == null) ? 0 : getChangeId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ChangeProgressDetails clone() {
        try {
            return (ChangeProgressDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.ChangeProgressDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
