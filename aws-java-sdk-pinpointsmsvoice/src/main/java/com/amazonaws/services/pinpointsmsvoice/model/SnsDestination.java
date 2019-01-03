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
package com.amazonaws.services.pinpointsmsvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An object that contains information about an event destination that sends data to Amazon SNS.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-2018-09-05/SnsDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnsDestination implements Serializable, Cloneable, StructuredPojo {

    /** The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to. */
    private String topicArn;

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnsDestination withTopicArn(String topicArn) {
        setTopicArn(topicArn);
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnsDestination == false)
            return false;
        SnsDestination other = (SnsDestination) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public SnsDestination clone() {
        try {
            return (SnsDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoice.model.transform.SnsDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
