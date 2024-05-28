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
 * Contains information about an unused access finding for an IAM user access key. IAM Access Analyzer charges for
 * unused access analysis based on the number of IAM roles and users analyzed per month. For more details on pricing,
 * see <a href="https://aws.amazon.com/iam/access-analyzer/pricing">IAM Access Analyzer pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/UnusedIamUserAccessKeyDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnusedIamUserAccessKeyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the access key for which the unused access finding was generated.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The time at which the access key was last accessed.
     * </p>
     */
    private java.util.Date lastAccessed;

    /**
     * <p>
     * The ID of the access key for which the unused access finding was generated.
     * </p>
     * 
     * @param accessKeyId
     *        The ID of the access key for which the unused access finding was generated.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The ID of the access key for which the unused access finding was generated.
     * </p>
     * 
     * @return The ID of the access key for which the unused access finding was generated.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The ID of the access key for which the unused access finding was generated.
     * </p>
     * 
     * @param accessKeyId
     *        The ID of the access key for which the unused access finding was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedIamUserAccessKeyDetails withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The time at which the access key was last accessed.
     * </p>
     * 
     * @param lastAccessed
     *        The time at which the access key was last accessed.
     */

    public void setLastAccessed(java.util.Date lastAccessed) {
        this.lastAccessed = lastAccessed;
    }

    /**
     * <p>
     * The time at which the access key was last accessed.
     * </p>
     * 
     * @return The time at which the access key was last accessed.
     */

    public java.util.Date getLastAccessed() {
        return this.lastAccessed;
    }

    /**
     * <p>
     * The time at which the access key was last accessed.
     * </p>
     * 
     * @param lastAccessed
     *        The time at which the access key was last accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnusedIamUserAccessKeyDetails withLastAccessed(java.util.Date lastAccessed) {
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
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

        if (obj instanceof UnusedIamUserAccessKeyDetails == false)
            return false;
        UnusedIamUserAccessKeyDetails other = (UnusedIamUserAccessKeyDetails) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getLastAccessed() == null) ? 0 : getLastAccessed().hashCode());
        return hashCode;
    }

    @Override
    public UnusedIamUserAccessKeyDetails clone() {
        try {
            return (UnusedIamUserAccessKeyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.UnusedIamUserAccessKeyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
