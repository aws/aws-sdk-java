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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS IAM access key details related to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamAccessKeyDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamAccessKeyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The creation date/time of the IAM access key related to a finding.
     * </p>
     */
    private String createdAt;

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * 
     * @param userName
     *        The user associated with the IAM access key related to a finding.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * 
     * @return The user associated with the IAM access key related to a finding.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * 
     * @param userName
     *        The user associated with the IAM access key related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * 
     * @param status
     *        The status of the IAM access key related to a finding.
     * @see AwsIamAccessKeyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * 
     * @return The status of the IAM access key related to a finding.
     * @see AwsIamAccessKeyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * 
     * @param status
     *        The status of the IAM access key related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsIamAccessKeyStatus
     */

    public AwsIamAccessKeyDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * 
     * @param status
     *        The status of the IAM access key related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsIamAccessKeyStatus
     */

    public AwsIamAccessKeyDetails withStatus(AwsIamAccessKeyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The creation date/time of the IAM access key related to a finding.
     * </p>
     * 
     * @param createdAt
     *        The creation date/time of the IAM access key related to a finding.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The creation date/time of the IAM access key related to a finding.
     * </p>
     * 
     * @return The creation date/time of the IAM access key related to a finding.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The creation date/time of the IAM access key related to a finding.
     * </p>
     * 
     * @param createdAt
     *        The creation date/time of the IAM access key related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamAccessKeyDetails == false)
            return false;
        AwsIamAccessKeyDetails other = (AwsIamAccessKeyDetails) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamAccessKeyDetails clone() {
        try {
            return (AwsIamAccessKeyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamAccessKeyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
