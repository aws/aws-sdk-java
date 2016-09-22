/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * The email configuration type.
 * </p>
 */
public class EmailConfigurationType implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the email source.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The REPLY-TO email address.
     * </p>
     */
    private String replyToEmailAddress;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the email source.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the email source.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the email source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the email source.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the email source.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the email source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfigurationType withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The REPLY-TO email address.
     * </p>
     * 
     * @param replyToEmailAddress
     *        The REPLY-TO email address.
     */

    public void setReplyToEmailAddress(String replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
    }

    /**
     * <p>
     * The REPLY-TO email address.
     * </p>
     * 
     * @return The REPLY-TO email address.
     */

    public String getReplyToEmailAddress() {
        return this.replyToEmailAddress;
    }

    /**
     * <p>
     * The REPLY-TO email address.
     * </p>
     * 
     * @param replyToEmailAddress
     *        The REPLY-TO email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfigurationType withReplyToEmailAddress(String replyToEmailAddress) {
        setReplyToEmailAddress(replyToEmailAddress);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: " + getSourceArn() + ",");
        if (getReplyToEmailAddress() != null)
            sb.append("ReplyToEmailAddress: " + getReplyToEmailAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailConfigurationType == false)
            return false;
        EmailConfigurationType other = (EmailConfigurationType) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getReplyToEmailAddress() == null ^ this.getReplyToEmailAddress() == null)
            return false;
        if (other.getReplyToEmailAddress() != null && other.getReplyToEmailAddress().equals(this.getReplyToEmailAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getReplyToEmailAddress() == null) ? 0 : getReplyToEmailAddress().hashCode());
        return hashCode;
    }

    @Override
    public EmailConfigurationType clone() {
        try {
            return (EmailConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
