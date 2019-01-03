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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The container for the <a>EventTriggerDefinition$EventResourceARN</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/EventTriggerDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventTriggerDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event trigger
     * associated with this job.
     * </p>
     */
    private String eventResourceARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event trigger
     * associated with this job.
     * </p>
     * 
     * @param eventResourceARN
     *        The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event
     *        trigger associated with this job.
     */

    public void setEventResourceARN(String eventResourceARN) {
        this.eventResourceARN = eventResourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event trigger
     * associated with this job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event
     *         trigger associated with this job.
     */

    public String getEventResourceARN() {
        return this.eventResourceARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event trigger
     * associated with this job.
     * </p>
     * 
     * @param eventResourceARN
     *        The Amazon Resource Name (ARN) for any local Amazon S3 resource that is an AWS Lambda function's event
     *        trigger associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventTriggerDefinition withEventResourceARN(String eventResourceARN) {
        setEventResourceARN(eventResourceARN);
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
        if (getEventResourceARN() != null)
            sb.append("EventResourceARN: ").append(getEventResourceARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventTriggerDefinition == false)
            return false;
        EventTriggerDefinition other = (EventTriggerDefinition) obj;
        if (other.getEventResourceARN() == null ^ this.getEventResourceARN() == null)
            return false;
        if (other.getEventResourceARN() != null && other.getEventResourceARN().equals(this.getEventResourceARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventResourceARN() == null) ? 0 : getEventResourceARN().hashCode());
        return hashCode;
    }

    @Override
    public EventTriggerDefinition clone() {
        try {
            return (EventTriggerDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.EventTriggerDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
