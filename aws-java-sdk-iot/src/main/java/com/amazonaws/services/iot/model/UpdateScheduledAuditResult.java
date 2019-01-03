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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateScheduledAuditResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     */
    private String scheduledAuditArn;

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     * 
     * @param scheduledAuditArn
     *        The ARN of the scheduled audit.
     */

    public void setScheduledAuditArn(String scheduledAuditArn) {
        this.scheduledAuditArn = scheduledAuditArn;
    }

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     * 
     * @return The ARN of the scheduled audit.
     */

    public String getScheduledAuditArn() {
        return this.scheduledAuditArn;
    }

    /**
     * <p>
     * The ARN of the scheduled audit.
     * </p>
     * 
     * @param scheduledAuditArn
     *        The ARN of the scheduled audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateScheduledAuditResult withScheduledAuditArn(String scheduledAuditArn) {
        setScheduledAuditArn(scheduledAuditArn);
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
        if (getScheduledAuditArn() != null)
            sb.append("ScheduledAuditArn: ").append(getScheduledAuditArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateScheduledAuditResult == false)
            return false;
        UpdateScheduledAuditResult other = (UpdateScheduledAuditResult) obj;
        if (other.getScheduledAuditArn() == null ^ this.getScheduledAuditArn() == null)
            return false;
        if (other.getScheduledAuditArn() != null && other.getScheduledAuditArn().equals(this.getScheduledAuditArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledAuditArn() == null) ? 0 : getScheduledAuditArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateScheduledAuditResult clone() {
        try {
            return (UpdateScheduledAuditResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
