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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A CloudFront function that is associated with a cache behavior in a CloudFront distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/FunctionAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function.
     * </p>
     */
    private String functionARN;
    /**
     * <p>
     * The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You cannot
     * use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with a CloudFront
     * function.
     * </p>
     */
    private String eventType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function.
     * </p>
     * 
     * @param functionARN
     *        The Amazon Resource Name (ARN) of the function.
     */

    public void setFunctionARN(String functionARN) {
        this.functionARN = functionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the function.
     */

    public String getFunctionARN() {
        return this.functionARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function.
     * </p>
     * 
     * @param functionARN
     *        The Amazon Resource Name (ARN) of the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionAssociation withFunctionARN(String functionARN) {
        setFunctionARN(functionARN);
        return this;
    }

    /**
     * <p>
     * The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You cannot
     * use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with a CloudFront
     * function.
     * </p>
     * 
     * @param eventType
     *        The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You
     *        cannot use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with a
     *        CloudFront function.
     * @see EventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You cannot
     * use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with a CloudFront
     * function.
     * </p>
     * 
     * @return The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You
     *         cannot use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with
     *         a CloudFront function.
     * @see EventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You cannot
     * use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with a CloudFront
     * function.
     * </p>
     * 
     * @param eventType
     *        The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You
     *        cannot use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with a
     *        CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public FunctionAssociation withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You cannot
     * use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with a CloudFront
     * function.
     * </p>
     * 
     * @param eventType
     *        The event type of the function, either <code>viewer-request</code> or <code>viewer-response</code>. You
     *        cannot use origin-facing event types (<code>origin-request</code> and <code>origin-response</code>) with a
     *        CloudFront function.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public FunctionAssociation withEventType(EventType eventType) {
        this.eventType = eventType.toString();
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
        if (getFunctionARN() != null)
            sb.append("FunctionARN: ").append(getFunctionARN()).append(",");
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

        if (obj instanceof FunctionAssociation == false)
            return false;
        FunctionAssociation other = (FunctionAssociation) obj;
        if (other.getFunctionARN() == null ^ this.getFunctionARN() == null)
            return false;
        if (other.getFunctionARN() != null && other.getFunctionARN().equals(this.getFunctionARN()) == false)
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

        hashCode = prime * hashCode + ((getFunctionARN() == null) ? 0 : getFunctionARN().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        return hashCode;
    }

    @Override
    public FunctionAssociation clone() {
        try {
            return (FunctionAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
