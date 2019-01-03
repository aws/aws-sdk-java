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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The output for a <a>DescribeStackEvents</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StackEvent> stackEvents;
    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page
     * exists, this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     * 
     * @return A list of <code>StackEvents</code> structures.
     */

    public java.util.List<StackEvent> getStackEvents() {
        if (stackEvents == null) {
            stackEvents = new com.amazonaws.internal.SdkInternalList<StackEvent>();
        }
        return stackEvents;
    }

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     * 
     * @param stackEvents
     *        A list of <code>StackEvents</code> structures.
     */

    public void setStackEvents(java.util.Collection<StackEvent> stackEvents) {
        if (stackEvents == null) {
            this.stackEvents = null;
            return;
        }

        this.stackEvents = new com.amazonaws.internal.SdkInternalList<StackEvent>(stackEvents);
    }

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackEvents(java.util.Collection)} or {@link #withStackEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stackEvents
     *        A list of <code>StackEvents</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackEventsResult withStackEvents(StackEvent... stackEvents) {
        if (this.stackEvents == null) {
            setStackEvents(new com.amazonaws.internal.SdkInternalList<StackEvent>(stackEvents.length));
        }
        for (StackEvent ele : stackEvents) {
            this.stackEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     * 
     * @param stackEvents
     *        A list of <code>StackEvents</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackEventsResult withStackEvents(java.util.Collection<StackEvent> stackEvents) {
        setStackEvents(stackEvents);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional
     *        page exists, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @return If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional
     *         page exists, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page
     * exists, this value is null.
     * </p>
     * 
     * @param nextToken
     *        If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional
     *        page exists, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackEventsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStackEvents() != null)
            sb.append("StackEvents: ").append(getStackEvents()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackEventsResult == false)
            return false;
        DescribeStackEventsResult other = (DescribeStackEventsResult) obj;
        if (other.getStackEvents() == null ^ this.getStackEvents() == null)
            return false;
        if (other.getStackEvents() != null && other.getStackEvents().equals(this.getStackEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackEvents() == null) ? 0 : getStackEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackEventsResult clone() {
        try {
            return (DescribeStackEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
