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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an unused access finding for an IAM user password. IAM Access Analyzer charges for unused
 * access analysis based on the number of IAM roles and users analyzed per month. For more details on pricing, see <a
 * href="https://aws.amazon.com/iam/access-analyzer/pricing">IAM Access Analyzer pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UnusedIamUserPasswordDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnusedIamUserPasswordDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the password was last accessed.
     * </p>
     */
    private java.util.Date lastAccessed;

    /**
     * <p>
     * The time at which the password was last accessed.
     * </p>
     * 
     * @param lastAccessed
     *        The time at which the password was last accessed.
     */

    public void setLastAccessed(java.util.Date lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    /**
     * <p>
     * The time at which the password was last accessed.
     * </p>
     * 
     * @return The time at which the password was last accessed.
     */

    public java.util.Date getLastAccessed() {
        return this.lastAccessed;
    }

    /**
     * <p>
     * The time at which the password was last accessed.
     * </p>
     * 
     * @param lastAccessed
     *        The time at which the password was last accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedIamUserPasswordDetails withLastAccessed(java.util.Date lastAccessed) {
        setLastAccessed(lastAccessed);
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
        if (getLastAccessed() != null)
            sb.append("LastAccessed: ").append(getLastAccessed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnusedIamUserPasswordDetails == false)
            return false;
        UnusedIamUserPasswordDetails other = (UnusedIamUserPasswordDetails) obj;
        if (other.getLastAccessed() == null ^ this.getLastAccessed() == null)
            return false;
        if (other.getLastAccessed() != null && other.getLastAccessed().equals(this.getLastAccessed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastAccessed() == null) ? 0 : getLastAccessed().hashCode());
        return hashCode;
    }

    @Override
    public UnusedIamUserPasswordDetails clone() {
        try {
            return (UnusedIamUserPasswordDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.UnusedIamUserPasswordDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
