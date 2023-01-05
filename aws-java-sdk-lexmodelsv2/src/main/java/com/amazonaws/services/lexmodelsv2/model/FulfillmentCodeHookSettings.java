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
 * Determines if a Lambda function should be invoked for a specific intent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/FulfillmentCodeHookSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FulfillmentCodeHookSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Provides settings for messages sent to the user for after the Lambda fulfillment function completes.
     * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
     * </p>
     */
    private PostFulfillmentStatusSpecification postFulfillmentStatusSpecification;
    /**
     * <p>
     * Provides settings for update messages sent to the user for long-running Lambda fulfillment functions. Fulfillment
     * updates can be used only with streaming conversations.
     * </p>
     */
    private FulfillmentUpdatesSpecification fulfillmentUpdatesSpecification;
    /**
     * <p>
     * Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook doesn't
     * run.
     * </p>
     */
    private Boolean active;

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     * </p>
     * 
     * @param enabled
     *        Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     * </p>
     * 
     * @return Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     * </p>
     * 
     * @param enabled
     *        Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentCodeHookSettings withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     * </p>
     * 
     * @return Indicates whether a Lambda function should be invoked to fulfill a specific intent.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Provides settings for messages sent to the user for after the Lambda fulfillment function completes.
     * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
     * </p>
     * 
     * @param postFulfillmentStatusSpecification
     *        Provides settings for messages sent to the user for after the Lambda fulfillment function completes.
     *        Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
     */

    public void setPostFulfillmentStatusSpecification(PostFulfillmentStatusSpecification postFulfillmentStatusSpecification) {
        this.postFulfillmentStatusSpecification = postFulfillmentStatusSpecification;
    }

    /**
     * <p>
     * Provides settings for messages sent to the user for after the Lambda fulfillment function completes.
     * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
     * </p>
     * 
     * @return Provides settings for messages sent to the user for after the Lambda fulfillment function completes.
     *         Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
     */

    public PostFulfillmentStatusSpecification getPostFulfillmentStatusSpecification() {
        return this.postFulfillmentStatusSpecification;
    }

    /**
     * <p>
     * Provides settings for messages sent to the user for after the Lambda fulfillment function completes.
     * Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
     * </p>
     * 
     * @param postFulfillmentStatusSpecification
     *        Provides settings for messages sent to the user for after the Lambda fulfillment function completes.
     *        Post-fulfillment messages can be sent for both streaming and non-streaming conversations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentCodeHookSettings withPostFulfillmentStatusSpecification(PostFulfillmentStatusSpecification postFulfillmentStatusSpecification) {
        setPostFulfillmentStatusSpecification(postFulfillmentStatusSpecification);
        return this;
    }

    /**
     * <p>
     * Provides settings for update messages sent to the user for long-running Lambda fulfillment functions. Fulfillment
     * updates can be used only with streaming conversations.
     * </p>
     * 
     * @param fulfillmentUpdatesSpecification
     *        Provides settings for update messages sent to the user for long-running Lambda fulfillment functions.
     *        Fulfillment updates can be used only with streaming conversations.
     */

    public void setFulfillmentUpdatesSpecification(FulfillmentUpdatesSpecification fulfillmentUpdatesSpecification) {
        this.fulfillmentUpdatesSpecification = fulfillmentUpdatesSpecification;
    }

    /**
     * <p>
     * Provides settings for update messages sent to the user for long-running Lambda fulfillment functions. Fulfillment
     * updates can be used only with streaming conversations.
     * </p>
     * 
     * @return Provides settings for update messages sent to the user for long-running Lambda fulfillment functions.
     *         Fulfillment updates can be used only with streaming conversations.
     */

    public FulfillmentUpdatesSpecification getFulfillmentUpdatesSpecification() {
        return this.fulfillmentUpdatesSpecification;
    }

    /**
     * <p>
     * Provides settings for update messages sent to the user for long-running Lambda fulfillment functions. Fulfillment
     * updates can be used only with streaming conversations.
     * </p>
     * 
     * @param fulfillmentUpdatesSpecification
     *        Provides settings for update messages sent to the user for long-running Lambda fulfillment functions.
     *        Fulfillment updates can be used only with streaming conversations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentCodeHookSettings withFulfillmentUpdatesSpecification(FulfillmentUpdatesSpecification fulfillmentUpdatesSpecification) {
        setFulfillmentUpdatesSpecification(fulfillmentUpdatesSpecification);
        return this;
    }

    /**
     * <p>
     * Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook doesn't
     * run.
     * </p>
     * 
     * @param active
     *        Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook
     *        doesn't run.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook doesn't
     * run.
     * </p>
     * 
     * @return Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook
     *         doesn't run.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook doesn't
     * run.
     * </p>
     * 
     * @param active
     *        Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook
     *        doesn't run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentCodeHookSettings withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook doesn't
     * run.
     * </p>
     * 
     * @return Determines whether the fulfillment code hook is used. When <code>active</code> is false, the code hook
     *         doesn't run.
     */

    public Boolean isActive() {
        return this.active;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getPostFulfillmentStatusSpecification() != null)
            sb.append("PostFulfillmentStatusSpecification: ").append(getPostFulfillmentStatusSpecification()).append(",");
        if (getFulfillmentUpdatesSpecification() != null)
            sb.append("FulfillmentUpdatesSpecification: ").append(getFulfillmentUpdatesSpecification()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FulfillmentCodeHookSettings == false)
            return false;
        FulfillmentCodeHookSettings other = (FulfillmentCodeHookSettings) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPostFulfillmentStatusSpecification() == null ^ this.getPostFulfillmentStatusSpecification() == null)
            return false;
        if (other.getPostFulfillmentStatusSpecification() != null
                && other.getPostFulfillmentStatusSpecification().equals(this.getPostFulfillmentStatusSpecification()) == false)
            return false;
        if (other.getFulfillmentUpdatesSpecification() == null ^ this.getFulfillmentUpdatesSpecification() == null)
            return false;
        if (other.getFulfillmentUpdatesSpecification() != null
                && other.getFulfillmentUpdatesSpecification().equals(this.getFulfillmentUpdatesSpecification()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPostFulfillmentStatusSpecification() == null) ? 0 : getPostFulfillmentStatusSpecification().hashCode());
        hashCode = prime * hashCode + ((getFulfillmentUpdatesSpecification() == null) ? 0 : getFulfillmentUpdatesSpecification().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        return hashCode;
    }

    @Override
    public FulfillmentCodeHookSettings clone() {
        try {
            return (FulfillmentCodeHookSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.FulfillmentCodeHookSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
