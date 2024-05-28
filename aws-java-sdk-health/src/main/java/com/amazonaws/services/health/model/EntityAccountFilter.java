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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A JSON set of elements including the <code>awsAccountId</code>, <code>eventArn</code> and a set of
 * <code>statusCodes</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EntityAccountFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityAccountFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the event. The event ARN has the
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * format.
     * </p>
     * <p>
     * For example, an event ARN might look like the following:
     * </p>
     * <p>
     * <code>arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     */
    private String eventArn;
    /**
     * <p>
     * The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * A list of entity status codes.
     * </p>
     */
    private java.util.List<String> statusCodes;

    /**
     * <p>
     * The unique identifier for the event. The event ARN has the
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * format.
     * </p>
     * <p>
     * For example, an event ARN might look like the following:
     * </p>
     * <p>
     * <code>arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @param eventArn
     *        The unique identifier for the event. The event ARN has the
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *        format.</p>
     *        <p>
     *        For example, an event ARN might look like the following:
     *        </p>
     *        <p>
     *        <code>arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     */

    public void setEventArn(String eventArn) {
        this.eventArn = eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. The event ARN has the
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * format.
     * </p>
     * <p>
     * For example, an event ARN might look like the following:
     * </p>
     * <p>
     * <code>arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @return The unique identifier for the event. The event ARN has the
     *         <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *         format.</p>
     *         <p>
     *         For example, an event ARN might look like the following:
     *         </p>
     *         <p>
     *         <code>arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     */

    public String getEventArn() {
        return this.eventArn;
    }

    /**
     * <p>
     * The unique identifier for the event. The event ARN has the
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * format.
     * </p>
     * <p>
     * For example, an event ARN might look like the following:
     * </p>
     * <p>
     * <code>arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @param eventArn
     *        The unique identifier for the event. The event ARN has the
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *        format.</p>
     *        <p>
     *        For example, an event ARN might look like the following:
     *        </p>
     *        <p>
     *        <code>arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityAccountFilter withEventArn(String eventArn) {
        setEventArn(eventArn);
        return this;
    }

    /**
     * <p>
     * The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * </p>
     * 
     * @param awsAccountId
     *        The 12-digit Amazon Web Services account numbers that contains the affected entities.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * </p>
     * 
     * @return The 12-digit Amazon Web Services account numbers that contains the affected entities.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * </p>
     * 
     * @param awsAccountId
     *        The 12-digit Amazon Web Services account numbers that contains the affected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityAccountFilter withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * A list of entity status codes.
     * </p>
     * 
     * @return A list of entity status codes.
     * @see EntityStatusCode
     */

    public java.util.List<String> getStatusCodes() {
        return statusCodes;
    }

    /**
     * <p>
     * A list of entity status codes.
     * </p>
     * 
     * @param statusCodes
     *        A list of entity status codes.
     * @see EntityStatusCode
     */

    public void setStatusCodes(java.util.Collection<String> statusCodes) {
        if (statusCodes == null) {
            this.statusCodes = null;
            return;
        }

        this.statusCodes = new java.util.ArrayList<String>(statusCodes);
    }

    /**
     * <p>
     * A list of entity status codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusCodes(java.util.Collection)} or {@link #withStatusCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusCodes
     *        A list of entity status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatusCode
     */

    public EntityAccountFilter withStatusCodes(String... statusCodes) {
        if (this.statusCodes == null) {
            setStatusCodes(new java.util.ArrayList<String>(statusCodes.length));
        }
        for (String ele : statusCodes) {
            this.statusCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity status codes.
     * </p>
     * 
     * @param statusCodes
     *        A list of entity status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatusCode
     */

    public EntityAccountFilter withStatusCodes(java.util.Collection<String> statusCodes) {
        setStatusCodes(statusCodes);
        return this;
    }

    /**
     * <p>
     * A list of entity status codes.
     * </p>
     * 
     * @param statusCodes
     *        A list of entity status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityStatusCode
     */

    public EntityAccountFilter withStatusCodes(EntityStatusCode... statusCodes) {
        java.util.ArrayList<String> statusCodesCopy = new java.util.ArrayList<String>(statusCodes.length);
        for (EntityStatusCode value : statusCodes) {
            statusCodesCopy.add(value.toString());
        }
        if (getStatusCodes() == null) {
            setStatusCodes(statusCodesCopy);
        } else {
            getStatusCodes().addAll(statusCodesCopy);
        }
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
        if (getEventArn() != null)
            sb.append("EventArn: ").append(getEventArn()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getStatusCodes() != null)
            sb.append("StatusCodes: ").append(getStatusCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityAccountFilter == false)
            return false;
        EntityAccountFilter other = (EntityAccountFilter) obj;
        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getStatusCodes() == null ^ this.getStatusCodes() == null)
            return false;
        if (other.getStatusCodes() != null && other.getStatusCodes().equals(this.getStatusCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getStatusCodes() == null) ? 0 : getStatusCodes().hashCode());
        return hashCode;
    }

    @Override
    public EntityAccountFilter clone() {
        try {
            return (EntityAccountFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.EntityAccountFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
