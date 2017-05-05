/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains a Lambda function association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2017-03-25/LambdaFunctionAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaFunctionAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     */
    private String lambdaFunctionARN;
    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>
     * </p>
     * </li>
     * </ul>
     */
    private String eventType;

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @param lambdaFunctionARN
     *        The ARN of the Lambda function.
     */

    public void setLambdaFunctionARN(String lambdaFunctionARN) {
        this.lambdaFunctionARN = lambdaFunctionARN;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @return The ARN of the Lambda function.
     */

    public String getLambdaFunctionARN() {
        return this.lambdaFunctionARN;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * 
     * @param lambdaFunctionARN
     *        The ARN of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaFunctionAssociation withLambdaFunctionARN(String lambdaFunctionARN) {
        setLambdaFunctionARN(lambdaFunctionARN);
        return this;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        Specifies the event type that triggers a Lambda function invocation. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>viewer-request</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-request</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>viewer-response</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-response</code>
     *        </p>
     *        </li>
     * @see EventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the event type that triggers a Lambda function invocation. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>viewer-request</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>origin-request</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>viewer-response</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>origin-response</code>
     *         </p>
     *         </li>
     * @see EventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        Specifies the event type that triggers a Lambda function invocation. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>viewer-request</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-request</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>viewer-response</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-response</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public LambdaFunctionAssociation withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        Specifies the event type that triggers a Lambda function invocation. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>viewer-request</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-request</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>viewer-response</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-response</code>
     *        </p>
     *        </li>
     * @see EventType
     */

    public void setEventType(EventType eventType) {
        this.eventType = eventType.toString();
    }

    /**
     * <p>
     * Specifies the event type that triggers a Lambda function invocation. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>viewer-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-request</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>viewer-response</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>origin-response</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventType
     *        Specifies the event type that triggers a Lambda function invocation. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>viewer-request</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-request</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>viewer-response</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>origin-response</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public LambdaFunctionAssociation withEventType(EventType eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLambdaFunctionARN() != null)
            sb.append("LambdaFunctionARN: ").append(getLambdaFunctionARN()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaFunctionAssociation == false)
            return false;
        LambdaFunctionAssociation other = (LambdaFunctionAssociation) obj;
        if (other.getLambdaFunctionARN() == null ^ this.getLambdaFunctionARN() == null)
            return false;
        if (other.getLambdaFunctionARN() != null && other.getLambdaFunctionARN().equals(this.getLambdaFunctionARN()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaFunctionARN() == null) ? 0 : getLambdaFunctionARN().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        return hashCode;
    }

    @Override
    public LambdaFunctionAssociation clone() {
        try {
            return (LambdaFunctionAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
