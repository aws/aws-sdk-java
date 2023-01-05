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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDataProtectionPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDataProtectionPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The log group name or ARN that you specified in your request.
     * </p>
     */
    private String logGroupIdentifier;
    /**
     * <p>
     * The data protection policy used for this log group.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * The date and time that this policy was most recently updated.
     * </p>
     */
    private Long lastUpdatedTime;

    /**
     * <p>
     * The log group name or ARN that you specified in your request.
     * </p>
     * 
     * @param logGroupIdentifier
     *        The log group name or ARN that you specified in your request.
     */

    public void setLogGroupIdentifier(String logGroupIdentifier) {
        this.logGroupIdentifier = logGroupIdentifier;
    }

    /**
     * <p>
     * The log group name or ARN that you specified in your request.
     * </p>
     * 
     * @return The log group name or ARN that you specified in your request.
     */

    public String getLogGroupIdentifier() {
        return this.logGroupIdentifier;
    }

    /**
     * <p>
     * The log group name or ARN that you specified in your request.
     * </p>
     * 
     * @param logGroupIdentifier
     *        The log group name or ARN that you specified in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataProtectionPolicyResult withLogGroupIdentifier(String logGroupIdentifier) {
        setLogGroupIdentifier(logGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The data protection policy used for this log group.
     * </p>
     * 
     * @param policyDocument
     *        The data protection policy used for this log group.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The data protection policy used for this log group.
     * </p>
     * 
     * @return The data protection policy used for this log group.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The data protection policy used for this log group.
     * </p>
     * 
     * @param policyDocument
     *        The data protection policy used for this log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataProtectionPolicyResult withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * The date and time that this policy was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that this policy was most recently updated.
     */

    public void setLastUpdatedTime(Long lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that this policy was most recently updated.
     * </p>
     * 
     * @return The date and time that this policy was most recently updated.
     */

    public Long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time that this policy was most recently updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time that this policy was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataProtectionPolicyResult withLastUpdatedTime(Long lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getLogGroupIdentifier() != null)
            sb.append("LogGroupIdentifier: ").append(getLogGroupIdentifier()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDataProtectionPolicyResult == false)
            return false;
        PutDataProtectionPolicyResult other = (PutDataProtectionPolicyResult) obj;
        if (other.getLogGroupIdentifier() == null ^ this.getLogGroupIdentifier() == null)
            return false;
        if (other.getLogGroupIdentifier() != null && other.getLogGroupIdentifier().equals(this.getLogGroupIdentifier()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupIdentifier() == null) ? 0 : getLogGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public PutDataProtectionPolicyResult clone() {
        try {
            return (PutDataProtectionPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
