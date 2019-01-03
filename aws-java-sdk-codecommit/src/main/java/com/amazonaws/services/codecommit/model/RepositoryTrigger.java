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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a trigger for a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/RepositoryTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryTrigger implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the trigger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple
     * Notification Service (SNS).
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * Any custom data associated with the trigger that will be included in the information sent to the target of the
     * trigger.
     * </p>
     */
    private String customData;
    /**
     * <p>
     * The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will
     * apply to all branches.
     * </p>
     * <note>
     * <p>
     * While no content is required in the array, you must include the array itself.
     * </p>
     * </note>
     */
    private java.util.List<String> branches;
    /**
     * <p>
     * The repository events that will cause the trigger to run actions in another service, such as sending a
     * notification through Amazon Simple Notification Service (SNS).
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * 
     * @param name
     *        The name of the trigger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * 
     * @return The name of the trigger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * 
     * @param name
     *        The name of the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryTrigger withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple
     * Notification Service (SNS).
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple
     *        Notification Service (SNS).
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple
     * Notification Service (SNS).
     * </p>
     * 
     * @return The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon
     *         Simple Notification Service (SNS).
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple
     * Notification Service (SNS).
     * </p>
     * 
     * @param destinationArn
     *        The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple
     *        Notification Service (SNS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryTrigger withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * Any custom data associated with the trigger that will be included in the information sent to the target of the
     * trigger.
     * </p>
     * 
     * @param customData
     *        Any custom data associated with the trigger that will be included in the information sent to the target of
     *        the trigger.
     */

    public void setCustomData(String customData) {
        this.customData = customData;
    }

    /**
     * <p>
     * Any custom data associated with the trigger that will be included in the information sent to the target of the
     * trigger.
     * </p>
     * 
     * @return Any custom data associated with the trigger that will be included in the information sent to the target
     *         of the trigger.
     */

    public String getCustomData() {
        return this.customData;
    }

    /**
     * <p>
     * Any custom data associated with the trigger that will be included in the information sent to the target of the
     * trigger.
     * </p>
     * 
     * @param customData
     *        Any custom data associated with the trigger that will be included in the information sent to the target of
     *        the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryTrigger withCustomData(String customData) {
        setCustomData(customData);
        return this;
    }

    /**
     * <p>
     * The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will
     * apply to all branches.
     * </p>
     * <note>
     * <p>
     * While no content is required in the array, you must include the array itself.
     * </p>
     * </note>
     * 
     * @return The branches that will be included in the trigger configuration. If you specify an empty array, the
     *         trigger will apply to all branches.</p> <note>
     *         <p>
     *         While no content is required in the array, you must include the array itself.
     *         </p>
     */

    public java.util.List<String> getBranches() {
        return branches;
    }

    /**
     * <p>
     * The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will
     * apply to all branches.
     * </p>
     * <note>
     * <p>
     * While no content is required in the array, you must include the array itself.
     * </p>
     * </note>
     * 
     * @param branches
     *        The branches that will be included in the trigger configuration. If you specify an empty array, the
     *        trigger will apply to all branches.</p> <note>
     *        <p>
     *        While no content is required in the array, you must include the array itself.
     *        </p>
     */

    public void setBranches(java.util.Collection<String> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<String>(branches);
    }

    /**
     * <p>
     * The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will
     * apply to all branches.
     * </p>
     * <note>
     * <p>
     * While no content is required in the array, you must include the array itself.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBranches(java.util.Collection)} or {@link #withBranches(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param branches
     *        The branches that will be included in the trigger configuration. If you specify an empty array, the
     *        trigger will apply to all branches.</p> <note>
     *        <p>
     *        While no content is required in the array, you must include the array itself.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryTrigger withBranches(String... branches) {
        if (this.branches == null) {
            setBranches(new java.util.ArrayList<String>(branches.length));
        }
        for (String ele : branches) {
            this.branches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The branches that will be included in the trigger configuration. If you specify an empty array, the trigger will
     * apply to all branches.
     * </p>
     * <note>
     * <p>
     * While no content is required in the array, you must include the array itself.
     * </p>
     * </note>
     * 
     * @param branches
     *        The branches that will be included in the trigger configuration. If you specify an empty array, the
     *        trigger will apply to all branches.</p> <note>
     *        <p>
     *        While no content is required in the array, you must include the array itself.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryTrigger withBranches(java.util.Collection<String> branches) {
        setBranches(branches);
        return this;
    }

    /**
     * <p>
     * The repository events that will cause the trigger to run actions in another service, such as sending a
     * notification through Amazon Simple Notification Service (SNS).
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     * 
     * @return The repository events that will cause the trigger to run actions in another service, such as sending a
     *         notification through Amazon Simple Notification Service (SNS). </p> <note>
     *         <p>
     *         The valid value "all" cannot be used with any other values.
     *         </p>
     * @see RepositoryTriggerEventEnum
     */

    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The repository events that will cause the trigger to run actions in another service, such as sending a
     * notification through Amazon Simple Notification Service (SNS).
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     * 
     * @param events
     *        The repository events that will cause the trigger to run actions in another service, such as sending a
     *        notification through Amazon Simple Notification Service (SNS). </p> <note>
     *        <p>
     *        The valid value "all" cannot be used with any other values.
     *        </p>
     * @see RepositoryTriggerEventEnum
     */

    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * The repository events that will cause the trigger to run actions in another service, such as sending a
     * notification through Amazon Simple Notification Service (SNS).
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The repository events that will cause the trigger to run actions in another service, such as sending a
     *        notification through Amazon Simple Notification Service (SNS). </p> <note>
     *        <p>
     *        The valid value "all" cannot be used with any other values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryTriggerEventEnum
     */

    public RepositoryTrigger withEvents(String... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<String>(events.length));
        }
        for (String ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The repository events that will cause the trigger to run actions in another service, such as sending a
     * notification through Amazon Simple Notification Service (SNS).
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     * 
     * @param events
     *        The repository events that will cause the trigger to run actions in another service, such as sending a
     *        notification through Amazon Simple Notification Service (SNS). </p> <note>
     *        <p>
     *        The valid value "all" cannot be used with any other values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryTriggerEventEnum
     */

    public RepositoryTrigger withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The repository events that will cause the trigger to run actions in another service, such as sending a
     * notification through Amazon Simple Notification Service (SNS).
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     * 
     * @param events
     *        The repository events that will cause the trigger to run actions in another service, such as sending a
     *        notification through Amazon Simple Notification Service (SNS). </p> <note>
     *        <p>
     *        The valid value "all" cannot be used with any other values.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryTriggerEventEnum
     */

    public RepositoryTrigger withEvents(RepositoryTriggerEventEnum... events) {
        java.util.ArrayList<String> eventsCopy = new java.util.ArrayList<String>(events.length);
        for (RepositoryTriggerEventEnum value : events) {
            eventsCopy.add(value.toString());
        }
        if (getEvents() == null) {
            setEvents(eventsCopy);
        } else {
            getEvents().addAll(eventsCopy);
        }
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getCustomData() != null)
            sb.append("CustomData: ").append(getCustomData()).append(",");
        if (getBranches() != null)
            sb.append("Branches: ").append(getBranches()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryTrigger == false)
            return false;
        RepositoryTrigger other = (RepositoryTrigger) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getCustomData() == null ^ this.getCustomData() == null)
            return false;
        if (other.getCustomData() != null && other.getCustomData().equals(this.getCustomData()) == false)
            return false;
        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getCustomData() == null) ? 0 : getCustomData().hashCode());
        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryTrigger clone() {
        try {
            return (RepositoryTrigger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.RepositoryTriggerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
