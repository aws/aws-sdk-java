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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a DescribeEventTopic request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeEventTopics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventTopicsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of SNS topic names that receive status messages from the specified Directory ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventTopic> eventTopics;

    /**
     * <p>
     * A list of SNS topic names that receive status messages from the specified Directory ID.
     * </p>
     * 
     * @return A list of SNS topic names that receive status messages from the specified Directory ID.
     */

    public java.util.List<EventTopic> getEventTopics() {
        if (eventTopics == null) {
            eventTopics = new com.amazonaws.internal.SdkInternalList<EventTopic>();
        }
        return eventTopics;
    }

    /**
     * <p>
     * A list of SNS topic names that receive status messages from the specified Directory ID.
     * </p>
     * 
     * @param eventTopics
     *        A list of SNS topic names that receive status messages from the specified Directory ID.
     */

    public void setEventTopics(java.util.Collection<EventTopic> eventTopics) {
        if (eventTopics == null) {
            this.eventTopics = null;
            return;
        }

        this.eventTopics = new com.amazonaws.internal.SdkInternalList<EventTopic>(eventTopics);
    }

    /**
     * <p>
     * A list of SNS topic names that receive status messages from the specified Directory ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTopics(java.util.Collection)} or {@link #withEventTopics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventTopics
     *        A list of SNS topic names that receive status messages from the specified Directory ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventTopicsResult withEventTopics(EventTopic... eventTopics) {
        if (this.eventTopics == null) {
            setEventTopics(new com.amazonaws.internal.SdkInternalList<EventTopic>(eventTopics.length));
        }
        for (EventTopic ele : eventTopics) {
            this.eventTopics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of SNS topic names that receive status messages from the specified Directory ID.
     * </p>
     * 
     * @param eventTopics
     *        A list of SNS topic names that receive status messages from the specified Directory ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventTopicsResult withEventTopics(java.util.Collection<EventTopic> eventTopics) {
        setEventTopics(eventTopics);
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
        if (getEventTopics() != null)
            sb.append("EventTopics: ").append(getEventTopics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventTopicsResult == false)
            return false;
        DescribeEventTopicsResult other = (DescribeEventTopicsResult) obj;
        if (other.getEventTopics() == null ^ this.getEventTopics() == null)
            return false;
        if (other.getEventTopics() != null && other.getEventTopics().equals(this.getEventTopics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTopics() == null) ? 0 : getEventTopics().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventTopicsResult clone() {
        try {
            return (DescribeEventTopicsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
