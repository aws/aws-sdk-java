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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on SNS that are required to send the notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/SnsConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * SNS topic ARN that the scheduled query status notifications will be sent to.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * SNS topic ARN that the scheduled query status notifications will be sent to.
     * </p>
     * 
     * @param topicArn
     *        SNS topic ARN that the scheduled query status notifications will be sent to.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * SNS topic ARN that the scheduled query status notifications will be sent to.
     * </p>
     * 
     * @return SNS topic ARN that the scheduled query status notifications will be sent to.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * SNS topic ARN that the scheduled query status notifications will be sent to.
     * </p>
     * 
     * @param topicArn
     *        SNS topic ARN that the scheduled query status notifications will be sent to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnsConfiguration withTopicArn(String topicArn) {
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

        if (obj instanceof SnsConfiguration == false)
            return false;
        SnsConfiguration other = (SnsConfiguration) obj;
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
    public SnsConfiguration clone() {
        try {
            return (SnsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.SnsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
