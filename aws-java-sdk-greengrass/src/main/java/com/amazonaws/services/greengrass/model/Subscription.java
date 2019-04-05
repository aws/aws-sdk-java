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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a subscription.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Subscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription definition
     * version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */
    private String id;
    /**
     * The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     * represents the AWS IoT cloud), or 'GGShadowService'.
     */
    private String source;
    /** The MQTT topic used to route the message. */
    private String subject;
    /**
     * Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     * represents the AWS IoT cloud), or 'GGShadowService'.
     */
    private String target;

    /**
     * A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription definition
     * version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription
     *        definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription definition
     * version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @return A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription
     *         definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */

    public String getId() {
        return this.id;
    }

    /**
     * A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription definition
     * version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription
     *        definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     * represents the AWS IoT cloud), or 'GGShadowService'.
     * 
     * @param source
     *        The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     *        represents the AWS IoT cloud), or 'GGShadowService'.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     * represents the AWS IoT cloud), or 'GGShadowService'.
     * 
     * @return The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud'
     *         (which represents the AWS IoT cloud), or 'GGShadowService'.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     * represents the AWS IoT cloud), or 'GGShadowService'.
     * 
     * @param source
     *        The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     *        represents the AWS IoT cloud), or 'GGShadowService'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * The MQTT topic used to route the message.
     * 
     * @param subject
     *        The MQTT topic used to route the message.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * The MQTT topic used to route the message.
     * 
     * @return The MQTT topic used to route the message.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * The MQTT topic used to route the message.
     * 
     * @param subject
     *        The MQTT topic used to route the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     * represents the AWS IoT cloud), or 'GGShadowService'.
     * 
     * @param target
     *        Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     *        represents the AWS IoT cloud), or 'GGShadowService'.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     * represents the AWS IoT cloud), or 'GGShadowService'.
     * 
     * @return Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     *         represents the AWS IoT cloud), or 'GGShadowService'.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     * represents the AWS IoT cloud), or 'GGShadowService'.
     * 
     * @param target
     *        Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which
     *        represents the AWS IoT cloud), or 'GGShadowService'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withTarget(String target) {
        setTarget(target);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public Subscription clone() {
        try {
            return (Subscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.SubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
