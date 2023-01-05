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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information for updating the user on the progress of fulfilling an intent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/FulfillmentUpdatesSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FulfillmentUpdatesSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether fulfillment updates are sent to the user. When this field is true, updates are sent.
     * </p>
     * <p>
     * If the <code>active</code> field is set to true, the <code>startResponse</code>, <code>updateResponse</code>, and
     * <code>timeoutInSeconds</code> fields are required.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * Provides configuration information for the message sent to users when the fulfillment Lambda functions starts
     * running.
     * </p>
     */
    private FulfillmentStartResponseSpecification startResponse;
    /**
     * <p>
     * Provides configuration information for messages sent periodically to the user while the fulfillment Lambda
     * function is running.
     * </p>
     */
    private FulfillmentUpdateResponseSpecification updateResponse;
    /**
     * <p>
     * The length of time that the fulfillment Lambda function should run before it times out.
     * </p>
     */
    private Integer timeoutInSeconds;

    /**
     * <p>
     * Determines whether fulfillment updates are sent to the user. When this field is true, updates are sent.
     * </p>
     * <p>
     * If the <code>active</code> field is set to true, the <code>startResponse</code>, <code>updateResponse</code>, and
     * <code>timeoutInSeconds</code> fields are required.
     * </p>
     * 
     * @param active
     *        Determines whether fulfillment updates are sent to the user. When this field is true, updates are
     *        sent.</p>
     *        <p>
     *        If the <code>active</code> field is set to true, the <code>startResponse</code>,
     *        <code>updateResponse</code>, and <code>timeoutInSeconds</code> fields are required.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Determines whether fulfillment updates are sent to the user. When this field is true, updates are sent.
     * </p>
     * <p>
     * If the <code>active</code> field is set to true, the <code>startResponse</code>, <code>updateResponse</code>, and
     * <code>timeoutInSeconds</code> fields are required.
     * </p>
     * 
     * @return Determines whether fulfillment updates are sent to the user. When this field is true, updates are
     *         sent.</p>
     *         <p>
     *         If the <code>active</code> field is set to true, the <code>startResponse</code>,
     *         <code>updateResponse</code>, and <code>timeoutInSeconds</code> fields are required.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Determines whether fulfillment updates are sent to the user. When this field is true, updates are sent.
     * </p>
     * <p>
     * If the <code>active</code> field is set to true, the <code>startResponse</code>, <code>updateResponse</code>, and
     * <code>timeoutInSeconds</code> fields are required.
     * </p>
     * 
     * @param active
     *        Determines whether fulfillment updates are sent to the user. When this field is true, updates are
     *        sent.</p>
     *        <p>
     *        If the <code>active</code> field is set to true, the <code>startResponse</code>,
     *        <code>updateResponse</code>, and <code>timeoutInSeconds</code> fields are required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentUpdatesSpecification withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Determines whether fulfillment updates are sent to the user. When this field is true, updates are sent.
     * </p>
     * <p>
     * If the <code>active</code> field is set to true, the <code>startResponse</code>, <code>updateResponse</code>, and
     * <code>timeoutInSeconds</code> fields are required.
     * </p>
     * 
     * @return Determines whether fulfillment updates are sent to the user. When this field is true, updates are
     *         sent.</p>
     *         <p>
     *         If the <code>active</code> field is set to true, the <code>startResponse</code>,
     *         <code>updateResponse</code>, and <code>timeoutInSeconds</code> fields are required.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * Provides configuration information for the message sent to users when the fulfillment Lambda functions starts
     * running.
     * </p>
     * 
     * @param startResponse
     *        Provides configuration information for the message sent to users when the fulfillment Lambda functions
     *        starts running.
     */

    public void setStartResponse(FulfillmentStartResponseSpecification startResponse) {
        this.startResponse = startResponse;
    }

    /**
     * <p>
     * Provides configuration information for the message sent to users when the fulfillment Lambda functions starts
     * running.
     * </p>
     * 
     * @return Provides configuration information for the message sent to users when the fulfillment Lambda functions
     *         starts running.
     */

    public FulfillmentStartResponseSpecification getStartResponse() {
        return this.startResponse;
    }

    /**
     * <p>
     * Provides configuration information for the message sent to users when the fulfillment Lambda functions starts
     * running.
     * </p>
     * 
     * @param startResponse
     *        Provides configuration information for the message sent to users when the fulfillment Lambda functions
     *        starts running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentUpdatesSpecification withStartResponse(FulfillmentStartResponseSpecification startResponse) {
        setStartResponse(startResponse);
        return this;
    }

    /**
     * <p>
     * Provides configuration information for messages sent periodically to the user while the fulfillment Lambda
     * function is running.
     * </p>
     * 
     * @param updateResponse
     *        Provides configuration information for messages sent periodically to the user while the fulfillment Lambda
     *        function is running.
     */

    public void setUpdateResponse(FulfillmentUpdateResponseSpecification updateResponse) {
        this.updateResponse = updateResponse;
    }

    /**
     * <p>
     * Provides configuration information for messages sent periodically to the user while the fulfillment Lambda
     * function is running.
     * </p>
     * 
     * @return Provides configuration information for messages sent periodically to the user while the fulfillment
     *         Lambda function is running.
     */

    public FulfillmentUpdateResponseSpecification getUpdateResponse() {
        return this.updateResponse;
    }

    /**
     * <p>
     * Provides configuration information for messages sent periodically to the user while the fulfillment Lambda
     * function is running.
     * </p>
     * 
     * @param updateResponse
     *        Provides configuration information for messages sent periodically to the user while the fulfillment Lambda
     *        function is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentUpdatesSpecification withUpdateResponse(FulfillmentUpdateResponseSpecification updateResponse) {
        setUpdateResponse(updateResponse);
        return this;
    }

    /**
     * <p>
     * The length of time that the fulfillment Lambda function should run before it times out.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The length of time that the fulfillment Lambda function should run before it times out.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The length of time that the fulfillment Lambda function should run before it times out.
     * </p>
     * 
     * @return The length of time that the fulfillment Lambda function should run before it times out.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The length of time that the fulfillment Lambda function should run before it times out.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The length of time that the fulfillment Lambda function should run before it times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentUpdatesSpecification withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
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
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getStartResponse() != null)
            sb.append("StartResponse: ").append(getStartResponse()).append(",");
        if (getUpdateResponse() != null)
            sb.append("UpdateResponse: ").append(getUpdateResponse()).append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FulfillmentUpdatesSpecification == false)
            return false;
        FulfillmentUpdatesSpecification other = (FulfillmentUpdatesSpecification) obj;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getStartResponse() == null ^ this.getStartResponse() == null)
            return false;
        if (other.getStartResponse() != null && other.getStartResponse().equals(this.getStartResponse()) == false)
            return false;
        if (other.getUpdateResponse() == null ^ this.getUpdateResponse() == null)
            return false;
        if (other.getUpdateResponse() != null && other.getUpdateResponse().equals(this.getUpdateResponse()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getStartResponse() == null) ? 0 : getStartResponse().hashCode());
        hashCode = prime * hashCode + ((getUpdateResponse() == null) ? 0 : getUpdateResponse().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public FulfillmentUpdatesSpecification clone() {
        try {
            return (FulfillmentUpdatesSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.FulfillmentUpdatesSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
