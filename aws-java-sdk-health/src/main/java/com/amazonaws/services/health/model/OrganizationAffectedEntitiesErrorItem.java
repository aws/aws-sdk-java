/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Error information returned when a <a>DescribeAffectedEntitiesForOrganization</a> operation cannot find or process a
 * specific entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/OrganizationAffectedEntitiesErrorItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationAffectedEntitiesErrorItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     */
    private String eventArn;
    /**
     * <p>
     * The name of the error.
     * </p>
     */
    private String errorName;
    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @param awsAccountId
     *        The 12-digit AWS account numbers that contains the affected entities.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @return The 12-digit AWS account numbers that contains the affected entities.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @param awsAccountId
     *        The 12-digit AWS account numbers that contains the affected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationAffectedEntitiesErrorItem withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @param eventArn
     *        The unique identifier for the event. Format:
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *        . Example:
     *        <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     */

    public void setEventArn(String eventArn) {
        this.eventArn = eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @return The unique identifier for the event. Format:
     *         <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *         . Example:
     *         <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     */

    public String getEventArn() {
        return this.eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @param eventArn
     *        The unique identifier for the event. Format:
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *        . Example:
     *        <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationAffectedEntitiesErrorItem withEventArn(String eventArn) {
        setEventArn(eventArn);
        return this;
    }

    /**
     * <p>
     * The name of the error.
     * </p>
     * 
     * @param errorName
     *        The name of the error.
     */

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    /**
     * <p>
     * The name of the error.
     * </p>
     * 
     * @return The name of the error.
     */

    public String getErrorName() {
        return this.errorName;
    }

    /**
     * <p>
     * The name of the error.
     * </p>
     * 
     * @param errorName
     *        The name of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationAffectedEntitiesErrorItem withErrorName(String errorName) {
        setErrorName(errorName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @param errorMessage
     *        The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     *        <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @return The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For
     *         example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @param errorMessage
     *        The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     *        <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationAffectedEntitiesErrorItem withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getEventArn() != null)
            sb.append("EventArn: ").append(getEventArn()).append(",");
        if (getErrorName() != null)
            sb.append("ErrorName: ").append(getErrorName()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationAffectedEntitiesErrorItem == false)
            return false;
        OrganizationAffectedEntitiesErrorItem other = (OrganizationAffectedEntitiesErrorItem) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getErrorName() == null ^ this.getErrorName() == null)
            return false;
        if (other.getErrorName() != null && other.getErrorName().equals(this.getErrorName()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode + ((getErrorName() == null) ? 0 : getErrorName().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationAffectedEntitiesErrorItem clone() {
        try {
            return (OrganizationAffectedEntitiesErrorItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.OrganizationAffectedEntitiesErrorItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
