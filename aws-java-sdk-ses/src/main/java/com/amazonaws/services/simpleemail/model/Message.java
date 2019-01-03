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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the message to be sent, composed of a subject and a body.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/Message" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Message implements Serializable, Cloneable {

    /**
     * <p>
     * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
     * </p>
     */
    private Content subject;
    /**
     * <p>
     * The message body.
     * </p>
     */
    private Body body;

    /**
     * Default constructor for Message object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Message() {
    }

    /**
     * Constructs a new Message object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param subject
     *        The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
     * @param body
     *        The message body.
     */
    public Message(Content subject, Body body) {
        setSubject(subject);
        setBody(body);
    }

    /**
     * <p>
     * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
     * </p>
     * 
     * @param subject
     *        The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
     */

    public void setSubject(Content subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
     * </p>
     * 
     * @return The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
     */

    public Content getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
     * </p>
     * 
     * @param subject
     *        The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withSubject(Content subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The message body.
     * </p>
     * 
     * @param body
     *        The message body.
     */

    public void setBody(Body body) {
        this.body = body;
    }

    /**
     * <p>
     * The message body.
     * </p>
     * 
     * @return The message body.
     */

    public Body getBody() {
        return this.body;
    }

    /**
     * <p>
     * The message body.
     * </p>
     * 
     * @param body
     *        The message body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Message withBody(Body body) {
        setBody(body);
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
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Message == false)
            return false;
        Message other = (Message) obj;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        return hashCode;
    }

    @Override
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
