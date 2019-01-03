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
 * Identifies
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/LambdaResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions on the
     * associated local Amazon S3 resource.
     * </p>
     */
    private String lambdaArn;
    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated with this
     * job.
     * </p>
     */
    private java.util.List<EventTriggerDefinition> eventTriggers;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions on the
     * associated local Amazon S3 resource.
     * </p>
     * 
     * @param lambdaArn
     *        An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions
     *        on the associated local Amazon S3 resource.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions on the
     * associated local Amazon S3 resource.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object
     *         actions on the associated local Amazon S3 resource.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions on the
     * associated local Amazon S3 resource.
     * </p>
     * 
     * @param lambdaArn
     *        An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions
     *        on the associated local Amazon S3 resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaResource withLambdaArn(String lambdaArn) {
        setLambdaArn(lambdaArn);
        return this;
    }

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated with this
     * job.
     * </p>
     * 
     * @return The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated
     *         with this job.
     */

    public java.util.List<EventTriggerDefinition> getEventTriggers() {
        return eventTriggers;
    }

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated with this
     * job.
     * </p>
     * 
     * @param eventTriggers
     *        The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated
     *        with this job.
     */

    public void setEventTriggers(java.util.Collection<EventTriggerDefinition> eventTriggers) {
        if (eventTriggers == null) {
            this.eventTriggers = null;
            return;
        }

        this.eventTriggers = new java.util.ArrayList<EventTriggerDefinition>(eventTriggers);
    }

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated with this
     * job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTriggers(java.util.Collection)} or {@link #withEventTriggers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventTriggers
     *        The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated
     *        with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaResource withEventTriggers(EventTriggerDefinition... eventTriggers) {
        if (this.eventTriggers == null) {
            setEventTriggers(new java.util.ArrayList<EventTriggerDefinition>(eventTriggers.length));
        }
        for (EventTriggerDefinition ele : eventTriggers) {
            this.eventTriggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated with this
     * job.
     * </p>
     * 
     * @param eventTriggers
     *        The array of ARNs for <a>S3Resource</a> objects to trigger the <a>LambdaResource</a> objects associated
     *        with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaResource withEventTriggers(java.util.Collection<EventTriggerDefinition> eventTriggers) {
        setEventTriggers(eventTriggers);
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
        if (getLambdaArn() != null)
            sb.append("LambdaArn: ").append(getLambdaArn()).append(",");
        if (getEventTriggers() != null)
            sb.append("EventTriggers: ").append(getEventTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaResource == false)
            return false;
        LambdaResource other = (LambdaResource) obj;
        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        if (other.getEventTriggers() == null ^ this.getEventTriggers() == null)
            return false;
        if (other.getEventTriggers() != null && other.getEventTriggers().equals(this.getEventTriggers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        hashCode = prime * hashCode + ((getEventTriggers() == null) ? 0 : getEventTriggers().hashCode());
        return hashCode;
    }

    @Override
    public LambdaResource clone() {
        try {
            return (LambdaResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.LambdaResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
