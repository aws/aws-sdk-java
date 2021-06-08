/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an AWS Lambda function to manage alarm notifications. You can create one or use the <a
 * href="https://docs.aws.amazon.com/iotevents/latest/developerguide/lambda-support.html">AWS Lambda function provided
 * by AWS IoT Events</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/NotificationTargetActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationTargetActions implements Serializable, Cloneable, StructuredPojo {

    private LambdaAction lambdaAction;

    /**
     * @param lambdaAction
     */

    public void setLambdaAction(LambdaAction lambdaAction) {
        this.lambdaAction = lambdaAction;
    }

    /**
     * @return
     */

    public LambdaAction getLambdaAction() {
        return this.lambdaAction;
    }

    /**
     * @param lambdaAction
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationTargetActions withLambdaAction(LambdaAction lambdaAction) {
        setLambdaAction(lambdaAction);
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
        if (getLambdaAction() != null)
            sb.append("LambdaAction: ").append(getLambdaAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationTargetActions == false)
            return false;
        NotificationTargetActions other = (NotificationTargetActions) obj;
        if (other.getLambdaAction() == null ^ this.getLambdaAction() == null)
            return false;
        if (other.getLambdaAction() != null && other.getLambdaAction().equals(this.getLambdaAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaAction() == null) ? 0 : getLambdaAction().hashCode());
        return hashCode;
    }

    @Override
    public NotificationTargetActions clone() {
        try {
            return (NotificationTargetActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.NotificationTargetActionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
