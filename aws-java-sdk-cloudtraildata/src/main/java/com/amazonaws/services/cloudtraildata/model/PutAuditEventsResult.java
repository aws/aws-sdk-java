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
package com.amazonaws.services.cloudtraildata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-data-2021-08-11/PutAuditEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAuditEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the error
     * code and error message returned for events that could not be ingested.
     * </p>
     */
    private java.util.List<ResultErrorEntry> failed;
    /**
     * <p>
     * Lists events in the provided event payload that were successfully ingested into CloudTrail.
     * </p>
     */
    private java.util.List<AuditEventResultEntry> successful;

    /**
     * <p>
     * Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the error
     * code and error message returned for events that could not be ingested.
     * </p>
     * 
     * @return Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the
     *         error code and error message returned for events that could not be ingested.
     */

    public java.util.List<ResultErrorEntry> getFailed() {
        return failed;
    }

    /**
     * <p>
     * Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the error
     * code and error message returned for events that could not be ingested.
     * </p>
     * 
     * @param failed
     *        Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the
     *        error code and error message returned for events that could not be ingested.
     */

    public void setFailed(java.util.Collection<ResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new java.util.ArrayList<ResultErrorEntry>(failed);
    }

    /**
     * <p>
     * Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the error
     * code and error message returned for events that could not be ingested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the
     *        error code and error message returned for events that could not be ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuditEventsResult withFailed(ResultErrorEntry... failed) {
        if (this.failed == null) {
            setFailed(new java.util.ArrayList<ResultErrorEntry>(failed.length));
        }
        for (ResultErrorEntry ele : failed) {
            this.failed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the error
     * code and error message returned for events that could not be ingested.
     * </p>
     * 
     * @param failed
     *        Lists events in the provided event payload that could not be ingested into CloudTrail, and includes the
     *        error code and error message returned for events that could not be ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuditEventsResult withFailed(java.util.Collection<ResultErrorEntry> failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * Lists events in the provided event payload that were successfully ingested into CloudTrail.
     * </p>
     * 
     * @return Lists events in the provided event payload that were successfully ingested into CloudTrail.
     */

    public java.util.List<AuditEventResultEntry> getSuccessful() {
        return successful;
    }

    /**
     * <p>
     * Lists events in the provided event payload that were successfully ingested into CloudTrail.
     * </p>
     * 
     * @param successful
     *        Lists events in the provided event payload that were successfully ingested into CloudTrail.
     */

    public void setSuccessful(java.util.Collection<AuditEventResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }

        this.successful = new java.util.ArrayList<AuditEventResultEntry>(successful);
    }

    /**
     * <p>
     * Lists events in the provided event payload that were successfully ingested into CloudTrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessful(java.util.Collection)} or {@link #withSuccessful(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param successful
     *        Lists events in the provided event payload that were successfully ingested into CloudTrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuditEventsResult withSuccessful(AuditEventResultEntry... successful) {
        if (this.successful == null) {
            setSuccessful(new java.util.ArrayList<AuditEventResultEntry>(successful.length));
        }
        for (AuditEventResultEntry ele : successful) {
            this.successful.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists events in the provided event payload that were successfully ingested into CloudTrail.
     * </p>
     * 
     * @param successful
     *        Lists events in the provided event payload that were successfully ingested into CloudTrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuditEventsResult withSuccessful(java.util.Collection<AuditEventResultEntry> successful) {
        setSuccessful(successful);
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
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getSuccessful() != null)
            sb.append("Successful: ").append(getSuccessful());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAuditEventsResult == false)
            return false;
        PutAuditEventsResult other = (PutAuditEventsResult) obj;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getSuccessful() == null ^ this.getSuccessful() == null)
            return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode());
        return hashCode;
    }

    @Override
    public PutAuditEventsResult clone() {
        try {
            return (PutAuditEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
