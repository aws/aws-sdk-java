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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint notifications through
 * email. For information about email feedback forwarding, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-email.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityFeedbackForwardingEnabled"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIdentityFeedbackForwardingEnabledRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity for which to set bounce and complaint notification forwarding. Examples:
     * <code>user@example.com</code>, <code>example.com</code>.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code> specifies
     * that Amazon SES will forward bounce and complaint notifications as email, in addition to any Amazon SNS topic
     * publishing otherwise specified. <code>false</code> specifies that Amazon SES will publish bounce and complaint
     * notifications only through Amazon SNS. This value can only be set to <code>false</code> when Amazon SNS topics
     * are set for both <code>Bounce</code> and <code>Complaint</code> notification types.
     * </p>
     */
    private Boolean forwardingEnabled;

    /**
     * <p>
     * The identity for which to set bounce and complaint notification forwarding. Examples:
     * <code>user@example.com</code>, <code>example.com</code>.
     * </p>
     * 
     * @param identity
     *        The identity for which to set bounce and complaint notification forwarding. Examples:
     *        <code>user@example.com</code>, <code>example.com</code>.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity for which to set bounce and complaint notification forwarding. Examples:
     * <code>user@example.com</code>, <code>example.com</code>.
     * </p>
     * 
     * @return The identity for which to set bounce and complaint notification forwarding. Examples:
     *         <code>user@example.com</code>, <code>example.com</code>.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The identity for which to set bounce and complaint notification forwarding. Examples:
     * <code>user@example.com</code>, <code>example.com</code>.
     * </p>
     * 
     * @param identity
     *        The identity for which to set bounce and complaint notification forwarding. Examples:
     *        <code>user@example.com</code>, <code>example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityFeedbackForwardingEnabledRequest withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code> specifies
     * that Amazon SES will forward bounce and complaint notifications as email, in addition to any Amazon SNS topic
     * publishing otherwise specified. <code>false</code> specifies that Amazon SES will publish bounce and complaint
     * notifications only through Amazon SNS. This value can only be set to <code>false</code> when Amazon SNS topics
     * are set for both <code>Bounce</code> and <code>Complaint</code> notification types.
     * </p>
     * 
     * @param forwardingEnabled
     *        Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code>
     *        specifies that Amazon SES will forward bounce and complaint notifications as email, in addition to any
     *        Amazon SNS topic publishing otherwise specified. <code>false</code> specifies that Amazon SES will publish
     *        bounce and complaint notifications only through Amazon SNS. This value can only be set to
     *        <code>false</code> when Amazon SNS topics are set for both <code>Bounce</code> and <code>Complaint</code>
     *        notification types.
     */

    public void setForwardingEnabled(Boolean forwardingEnabled) {
        this.forwardingEnabled = forwardingEnabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code> specifies
     * that Amazon SES will forward bounce and complaint notifications as email, in addition to any Amazon SNS topic
     * publishing otherwise specified. <code>false</code> specifies that Amazon SES will publish bounce and complaint
     * notifications only through Amazon SNS. This value can only be set to <code>false</code> when Amazon SNS topics
     * are set for both <code>Bounce</code> and <code>Complaint</code> notification types.
     * </p>
     * 
     * @return Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code>
     *         specifies that Amazon SES will forward bounce and complaint notifications as email, in addition to any
     *         Amazon SNS topic publishing otherwise specified. <code>false</code> specifies that Amazon SES will
     *         publish bounce and complaint notifications only through Amazon SNS. This value can only be set to
     *         <code>false</code> when Amazon SNS topics are set for both <code>Bounce</code> and <code>Complaint</code>
     *         notification types.
     */

    public Boolean getForwardingEnabled() {
        return this.forwardingEnabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code> specifies
     * that Amazon SES will forward bounce and complaint notifications as email, in addition to any Amazon SNS topic
     * publishing otherwise specified. <code>false</code> specifies that Amazon SES will publish bounce and complaint
     * notifications only through Amazon SNS. This value can only be set to <code>false</code> when Amazon SNS topics
     * are set for both <code>Bounce</code> and <code>Complaint</code> notification types.
     * </p>
     * 
     * @param forwardingEnabled
     *        Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code>
     *        specifies that Amazon SES will forward bounce and complaint notifications as email, in addition to any
     *        Amazon SNS topic publishing otherwise specified. <code>false</code> specifies that Amazon SES will publish
     *        bounce and complaint notifications only through Amazon SNS. This value can only be set to
     *        <code>false</code> when Amazon SNS topics are set for both <code>Bounce</code> and <code>Complaint</code>
     *        notification types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityFeedbackForwardingEnabledRequest withForwardingEnabled(Boolean forwardingEnabled) {
        setForwardingEnabled(forwardingEnabled);
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code> specifies
     * that Amazon SES will forward bounce and complaint notifications as email, in addition to any Amazon SNS topic
     * publishing otherwise specified. <code>false</code> specifies that Amazon SES will publish bounce and complaint
     * notifications only through Amazon SNS. This value can only be set to <code>false</code> when Amazon SNS topics
     * are set for both <code>Bounce</code> and <code>Complaint</code> notification types.
     * </p>
     * 
     * @return Sets whether Amazon SES will forward bounce and complaint notifications as email. <code>true</code>
     *         specifies that Amazon SES will forward bounce and complaint notifications as email, in addition to any
     *         Amazon SNS topic publishing otherwise specified. <code>false</code> specifies that Amazon SES will
     *         publish bounce and complaint notifications only through Amazon SNS. This value can only be set to
     *         <code>false</code> when Amazon SNS topics are set for both <code>Bounce</code> and <code>Complaint</code>
     *         notification types.
     */

    public Boolean isForwardingEnabled() {
        return this.forwardingEnabled;
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getForwardingEnabled() != null)
            sb.append("ForwardingEnabled: ").append(getForwardingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityFeedbackForwardingEnabledRequest == false)
            return false;
        SetIdentityFeedbackForwardingEnabledRequest other = (SetIdentityFeedbackForwardingEnabledRequest) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getForwardingEnabled() == null ^ this.getForwardingEnabled() == null)
            return false;
        if (other.getForwardingEnabled() != null && other.getForwardingEnabled().equals(this.getForwardingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getForwardingEnabled() == null) ? 0 : getForwardingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public SetIdentityFeedbackForwardingEnabledRequest clone() {
        return (SetIdentityFeedbackForwardingEnabledRequest) super.clone();
    }

}
