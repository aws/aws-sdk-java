/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.glacier.model;

import java.io.Serializable;


/**
 * <p>
 * Represents a vault's notification configuration.
 * </p>
 */
public class VaultNotificationConfig implements Serializable {

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic Amazon
     * Resource Name (ARN).
     */
    private String sNSTopic;

    /**
     * A list of one or more events for which Amazon Glacier will send a
     * notification to the specified Amazon SNS topic.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> events;

    /**
     * Default constructor for a new VaultNotificationConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public VaultNotificationConfig() {}
    
    /**
     * Constructs a new VaultNotificationConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param sNSTopic The Amazon Simple Notification Service (Amazon SNS)
     * topic Amazon Resource Name (ARN).
     * @param events A list of one or more events for which Amazon Glacier
     * will send a notification to the specified Amazon SNS topic.
     */
    public VaultNotificationConfig(String sNSTopic, java.util.List<String> events) {
        setSNSTopic(sNSTopic);
        setEvents(events);
    }

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic Amazon
     * Resource Name (ARN).
     *
     * @return The Amazon Simple Notification Service (Amazon SNS) topic Amazon
     *         Resource Name (ARN).
     */
    public String getSNSTopic() {
        return sNSTopic;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic Amazon
     * Resource Name (ARN).
     *
     * @param sNSTopic The Amazon Simple Notification Service (Amazon SNS) topic Amazon
     *         Resource Name (ARN).
     */
    public void setSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
    }
    
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic Amazon
     * Resource Name (ARN).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sNSTopic The Amazon Simple Notification Service (Amazon SNS) topic Amazon
     *         Resource Name (ARN).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VaultNotificationConfig withSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
        return this;
    }

    /**
     * A list of one or more events for which Amazon Glacier will send a
     * notification to the specified Amazon SNS topic.
     *
     * @return A list of one or more events for which Amazon Glacier will send a
     *         notification to the specified Amazon SNS topic.
     */
    public java.util.List<String> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * A list of one or more events for which Amazon Glacier will send a
     * notification to the specified Amazon SNS topic.
     *
     * @param events A list of one or more events for which Amazon Glacier will send a
     *         notification to the specified Amazon SNS topic.
     */
    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * A list of one or more events for which Amazon Glacier will send a
     * notification to the specified Amazon SNS topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of one or more events for which Amazon Glacier will send a
     *         notification to the specified Amazon SNS topic.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VaultNotificationConfig withEvents(String... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<String>(events.length));
        for (String value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of one or more events for which Amazon Glacier will send a
     * notification to the specified Amazon SNS topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of one or more events for which Amazon Glacier will send a
     *         notification to the specified Amazon SNS topic.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VaultNotificationConfig withEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSNSTopic() != null) sb.append("SNSTopic: " + getSNSTopic() + ",");
        if (getEvents() != null) sb.append("Events: " + getEvents() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSNSTopic() == null) ? 0 : getSNSTopic().hashCode()); 
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VaultNotificationConfig == false) return false;
        VaultNotificationConfig other = (VaultNotificationConfig)obj;
        
        if (other.getSNSTopic() == null ^ this.getSNSTopic() == null) return false;
        if (other.getSNSTopic() != null && other.getSNSTopic().equals(this.getSNSTopic()) == false) return false; 
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        return true;
    }
    
}
    