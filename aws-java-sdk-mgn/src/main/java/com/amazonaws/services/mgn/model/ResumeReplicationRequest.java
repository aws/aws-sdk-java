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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ResumeReplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResumeReplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Resume Replication Request account ID.
     * </p>
     */
    private String accountID;
    /**
     * <p>
     * Resume Replication Request source server ID.
     * </p>
     */
    private String sourceServerID;

    /**
     * <p>
     * Resume Replication Request account ID.
     * </p>
     * 
     * @param accountID
     *        Resume Replication Request account ID.
     */

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    /**
     * <p>
     * Resume Replication Request account ID.
     * </p>
     * 
     * @return Resume Replication Request account ID.
     */

    public String getAccountID() {
        return this.accountID;
    }

    /**
     * <p>
     * Resume Replication Request account ID.
     * </p>
     * 
     * @param accountID
     *        Resume Replication Request account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResumeReplicationRequest withAccountID(String accountID) {
        setAccountID(accountID);
        return this;
    }

    /**
     * <p>
     * Resume Replication Request source server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Resume Replication Request source server ID.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Resume Replication Request source server ID.
     * </p>
     * 
     * @return Resume Replication Request source server ID.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Resume Replication Request source server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Resume Replication Request source server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResumeReplicationRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
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
        if (getAccountID() != null)
            sb.append("AccountID: ").append(getAccountID()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResumeReplicationRequest == false)
            return false;
        ResumeReplicationRequest other = (ResumeReplicationRequest) obj;
        if (other.getAccountID() == null ^ this.getAccountID() == null)
            return false;
        if (other.getAccountID() != null && other.getAccountID().equals(this.getAccountID()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountID() == null) ? 0 : getAccountID().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        return hashCode;
    }

    @Override
    public ResumeReplicationRequest clone() {
        return (ResumeReplicationRequest) super.clone();
    }

}
