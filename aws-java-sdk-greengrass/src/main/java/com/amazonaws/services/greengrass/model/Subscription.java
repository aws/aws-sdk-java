/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information on subscription
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Subscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscription implements Serializable, Cloneable, StructuredPojo {

    /** Element Id for this entry in the list. */
    private String id;
    /** Source of the subscription. Can be a thing arn, lambda arn or word 'cloud' */
    private String source;
    /** Subject of the message. */
    private String subject;
    /** Where the message is sent to. Can be a thing arn, lambda arn or word 'cloud'. */
    private String target;

    /**
     * Element Id for this entry in the list.
     * 
     * @param id
     *        Element Id for this entry in the list.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Element Id for this entry in the list.
     * 
     * @return Element Id for this entry in the list.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Element Id for this entry in the list.
     * 
     * @param id
     *        Element Id for this entry in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Source of the subscription. Can be a thing arn, lambda arn or word 'cloud'
     * 
     * @param source
     *        Source of the subscription. Can be a thing arn, lambda arn or word 'cloud'
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Source of the subscription. Can be a thing arn, lambda arn or word 'cloud'
     * 
     * @return Source of the subscription. Can be a thing arn, lambda arn or word 'cloud'
     */

    public String getSource() {
        return this.source;
    }

    /**
     * Source of the subscription. Can be a thing arn, lambda arn or word 'cloud'
     * 
     * @param source
     *        Source of the subscription. Can be a thing arn, lambda arn or word 'cloud'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * Subject of the message.
     * 
     * @param subject
     *        Subject of the message.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Subject of the message.
     * 
     * @return Subject of the message.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * Subject of the message.
     * 
     * @param subject
     *        Subject of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * Where the message is sent to. Can be a thing arn, lambda arn or word 'cloud'.
     * 
     * @param target
     *        Where the message is sent to. Can be a thing arn, lambda arn or word 'cloud'.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * Where the message is sent to. Can be a thing arn, lambda arn or word 'cloud'.
     * 
     * @return Where the message is sent to. Can be a thing arn, lambda arn or word 'cloud'.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * Where the message is sent to. Can be a thing arn, lambda arn or word 'cloud'.
     * 
     * @param target
     *        Where the message is sent to. Can be a thing arn, lambda arn or word 'cloud'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withTarget(String target) {
        setTarget(target);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public Subscription clone() {
        try {
            return (Subscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.SubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
