/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the source and type of the event that triggers AWS Config to
 * evaluate your AWS resources against a rule.
 * </p>
 */
public class SourceDetail implements Serializable, Cloneable {

    /**
     * The source of the event, such as an AWS service, that triggers AWS
     * Config to evaluate your AWS resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws.config
     */
    private String eventSource;

    /**
     * The type of SNS message that triggers AWS Config to run an evaluation.
     * For evaluations that are initiated when AWS Config delivers a
     * configuration item change notification, you must use
     * <code>ConfigurationItemChangeNotification</code>. For evaluations that
     * are initiated when AWS Config delivers a configuration snapshot, you
     * must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted
     */
    private String messageType;

    /**
     * The source of the event, such as an AWS service, that triggers AWS
     * Config to evaluate your AWS resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws.config
     *
     * @return The source of the event, such as an AWS service, that triggers AWS
     *         Config to evaluate your AWS resources.
     *
     * @see EventSource
     */
    public String getEventSource() {
        return eventSource;
    }
    
    /**
     * The source of the event, such as an AWS service, that triggers AWS
     * Config to evaluate your AWS resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws.config
     *
     * @param eventSource The source of the event, such as an AWS service, that triggers AWS
     *         Config to evaluate your AWS resources.
     *
     * @see EventSource
     */
    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }
    
    /**
     * The source of the event, such as an AWS service, that triggers AWS
     * Config to evaluate your AWS resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws.config
     *
     * @param eventSource The source of the event, such as an AWS service, that triggers AWS
     *         Config to evaluate your AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EventSource
     */
    public SourceDetail withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * The source of the event, such as an AWS service, that triggers AWS
     * Config to evaluate your AWS resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws.config
     *
     * @param eventSource The source of the event, such as an AWS service, that triggers AWS
     *         Config to evaluate your AWS resources.
     *
     * @see EventSource
     */
    public void setEventSource(EventSource eventSource) {
        this.eventSource = eventSource.toString();
    }
    
    /**
     * The source of the event, such as an AWS service, that triggers AWS
     * Config to evaluate your AWS resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws.config
     *
     * @param eventSource The source of the event, such as an AWS service, that triggers AWS
     *         Config to evaluate your AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see EventSource
     */
    public SourceDetail withEventSource(EventSource eventSource) {
        this.eventSource = eventSource.toString();
        return this;
    }

    /**
     * The type of SNS message that triggers AWS Config to run an evaluation.
     * For evaluations that are initiated when AWS Config delivers a
     * configuration item change notification, you must use
     * <code>ConfigurationItemChangeNotification</code>. For evaluations that
     * are initiated when AWS Config delivers a configuration snapshot, you
     * must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted
     *
     * @return The type of SNS message that triggers AWS Config to run an evaluation.
     *         For evaluations that are initiated when AWS Config delivers a
     *         configuration item change notification, you must use
     *         <code>ConfigurationItemChangeNotification</code>. For evaluations that
     *         are initiated when AWS Config delivers a configuration snapshot, you
     *         must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     *
     * @see MessageType
     */
    public String getMessageType() {
        return messageType;
    }
    
    /**
     * The type of SNS message that triggers AWS Config to run an evaluation.
     * For evaluations that are initiated when AWS Config delivers a
     * configuration item change notification, you must use
     * <code>ConfigurationItemChangeNotification</code>. For evaluations that
     * are initiated when AWS Config delivers a configuration snapshot, you
     * must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted
     *
     * @param messageType The type of SNS message that triggers AWS Config to run an evaluation.
     *         For evaluations that are initiated when AWS Config delivers a
     *         configuration item change notification, you must use
     *         <code>ConfigurationItemChangeNotification</code>. For evaluations that
     *         are initiated when AWS Config delivers a configuration snapshot, you
     *         must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     *
     * @see MessageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    
    /**
     * The type of SNS message that triggers AWS Config to run an evaluation.
     * For evaluations that are initiated when AWS Config delivers a
     * configuration item change notification, you must use
     * <code>ConfigurationItemChangeNotification</code>. For evaluations that
     * are initiated when AWS Config delivers a configuration snapshot, you
     * must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted
     *
     * @param messageType The type of SNS message that triggers AWS Config to run an evaluation.
     *         For evaluations that are initiated when AWS Config delivers a
     *         configuration item change notification, you must use
     *         <code>ConfigurationItemChangeNotification</code>. For evaluations that
     *         are initiated when AWS Config delivers a configuration snapshot, you
     *         must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MessageType
     */
    public SourceDetail withMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * The type of SNS message that triggers AWS Config to run an evaluation.
     * For evaluations that are initiated when AWS Config delivers a
     * configuration item change notification, you must use
     * <code>ConfigurationItemChangeNotification</code>. For evaluations that
     * are initiated when AWS Config delivers a configuration snapshot, you
     * must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted
     *
     * @param messageType The type of SNS message that triggers AWS Config to run an evaluation.
     *         For evaluations that are initiated when AWS Config delivers a
     *         configuration item change notification, you must use
     *         <code>ConfigurationItemChangeNotification</code>. For evaluations that
     *         are initiated when AWS Config delivers a configuration snapshot, you
     *         must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     *
     * @see MessageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
    }
    
    /**
     * The type of SNS message that triggers AWS Config to run an evaluation.
     * For evaluations that are initiated when AWS Config delivers a
     * configuration item change notification, you must use
     * <code>ConfigurationItemChangeNotification</code>. For evaluations that
     * are initiated when AWS Config delivers a configuration snapshot, you
     * must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ConfigurationItemChangeNotification, ConfigurationSnapshotDeliveryCompleted
     *
     * @param messageType The type of SNS message that triggers AWS Config to run an evaluation.
     *         For evaluations that are initiated when AWS Config delivers a
     *         configuration item change notification, you must use
     *         <code>ConfigurationItemChangeNotification</code>. For evaluations that
     *         are initiated when AWS Config delivers a configuration snapshot, you
     *         must use <code>ConfigurationSnapshotDeliveryCompleted</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see MessageType
     */
    public SourceDetail withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
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
        if (getEventSource() != null) sb.append("EventSource: " + getEventSource() + ",");
        if (getMessageType() != null) sb.append("MessageType: " + getMessageType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode()); 
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SourceDetail == false) return false;
        SourceDetail other = (SourceDetail)obj;
        
        if (other.getEventSource() == null ^ this.getEventSource() == null) return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false) return false; 
        if (other.getMessageType() == null ^ this.getMessageType() == null) return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false) return false; 
        return true;
    }
    
    @Override
    public SourceDetail clone() {
        try {
            return (SourceDetail) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    