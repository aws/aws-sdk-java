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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/UpdateAuditStreamConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAuditStreamConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The ARN of the Amazon Kinesis data stream that receives the audit events.
     * </p>
     */
    private String auditStreamArn;

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @return The ARN of the fleet.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuditStreamConfigurationRequest withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis data stream that receives the audit events.
     * </p>
     * 
     * @param auditStreamArn
     *        The ARN of the Amazon Kinesis data stream that receives the audit events.
     */

    public void setAuditStreamArn(String auditStreamArn) {
        this.auditStreamArn = auditStreamArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis data stream that receives the audit events.
     * </p>
     * 
     * @return The ARN of the Amazon Kinesis data stream that receives the audit events.
     */

    public String getAuditStreamArn() {
        return this.auditStreamArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis data stream that receives the audit events.
     * </p>
     * 
     * @param auditStreamArn
     *        The ARN of the Amazon Kinesis data stream that receives the audit events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAuditStreamConfigurationRequest withAuditStreamArn(String auditStreamArn) {
        setAuditStreamArn(auditStreamArn);
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getAuditStreamArn() != null)
            sb.append("AuditStreamArn: ").append(getAuditStreamArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAuditStreamConfigurationRequest == false)
            return false;
        UpdateAuditStreamConfigurationRequest other = (UpdateAuditStreamConfigurationRequest) obj;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getAuditStreamArn() == null ^ this.getAuditStreamArn() == null)
            return false;
        if (other.getAuditStreamArn() != null && other.getAuditStreamArn().equals(this.getAuditStreamArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getAuditStreamArn() == null) ? 0 : getAuditStreamArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAuditStreamConfigurationRequest clone() {
        return (UpdateAuditStreamConfigurationRequest) super.clone();
    }

}
