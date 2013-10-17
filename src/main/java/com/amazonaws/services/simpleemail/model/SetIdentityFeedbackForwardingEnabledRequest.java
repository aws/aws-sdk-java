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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#setIdentityFeedbackForwardingEnabled(SetIdentityFeedbackForwardingEnabledRequest) SetIdentityFeedbackForwardingEnabled operation}.
 * <p>
 * Given an identity (email address or domain), enables or disables whether Amazon SES forwards feedback notifications as email. Feedback forwarding may
 * only be disabled when both complaint and bounce topics are set. For more information about feedback notification, see the <a
 * href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide"> Amazon SES Developer Guide </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#setIdentityFeedbackForwardingEnabled(SetIdentityFeedbackForwardingEnabledRequest)
 */
public class SetIdentityFeedbackForwardingEnabledRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identity for which to set feedback notification forwarding.
     * Examples: <code>user@example.com</code>, <code>example.com</code>.
     */
    private String identity;

    /**
     * Sets whether Amazon SES will forward feedback notifications as email.
     * <code>true</code> specifies that Amazon SES will forward feedback
     * notifications as email, in addition to any Amazon SNS topic publishing
     * otherwise specified. <code>false</code> specifies that Amazon SES will
     * publish feedback notifications only through Amazon SNS. This value can
     * only be set to <code>false</code> when topics are specified for both
     * <code>Bounce</code> and <code>Complaint</code> topic types.
     */
    private Boolean forwardingEnabled;

    /**
     * The identity for which to set feedback notification forwarding.
     * Examples: <code>user@example.com</code>, <code>example.com</code>.
     *
     * @return The identity for which to set feedback notification forwarding.
     *         Examples: <code>user@example.com</code>, <code>example.com</code>.
     */
    public String getIdentity() {
        return identity;
    }
    
    /**
     * The identity for which to set feedback notification forwarding.
     * Examples: <code>user@example.com</code>, <code>example.com</code>.
     *
     * @param identity The identity for which to set feedback notification forwarding.
     *         Examples: <code>user@example.com</code>, <code>example.com</code>.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
    /**
     * The identity for which to set feedback notification forwarding.
     * Examples: <code>user@example.com</code>, <code>example.com</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identity The identity for which to set feedback notification forwarding.
     *         Examples: <code>user@example.com</code>, <code>example.com</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetIdentityFeedbackForwardingEnabledRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Sets whether Amazon SES will forward feedback notifications as email.
     * <code>true</code> specifies that Amazon SES will forward feedback
     * notifications as email, in addition to any Amazon SNS topic publishing
     * otherwise specified. <code>false</code> specifies that Amazon SES will
     * publish feedback notifications only through Amazon SNS. This value can
     * only be set to <code>false</code> when topics are specified for both
     * <code>Bounce</code> and <code>Complaint</code> topic types.
     *
     * @return Sets whether Amazon SES will forward feedback notifications as email.
     *         <code>true</code> specifies that Amazon SES will forward feedback
     *         notifications as email, in addition to any Amazon SNS topic publishing
     *         otherwise specified. <code>false</code> specifies that Amazon SES will
     *         publish feedback notifications only through Amazon SNS. This value can
     *         only be set to <code>false</code> when topics are specified for both
     *         <code>Bounce</code> and <code>Complaint</code> topic types.
     */
    public Boolean isForwardingEnabled() {
        return forwardingEnabled;
    }
    
    /**
     * Sets whether Amazon SES will forward feedback notifications as email.
     * <code>true</code> specifies that Amazon SES will forward feedback
     * notifications as email, in addition to any Amazon SNS topic publishing
     * otherwise specified. <code>false</code> specifies that Amazon SES will
     * publish feedback notifications only through Amazon SNS. This value can
     * only be set to <code>false</code> when topics are specified for both
     * <code>Bounce</code> and <code>Complaint</code> topic types.
     *
     * @param forwardingEnabled Sets whether Amazon SES will forward feedback notifications as email.
     *         <code>true</code> specifies that Amazon SES will forward feedback
     *         notifications as email, in addition to any Amazon SNS topic publishing
     *         otherwise specified. <code>false</code> specifies that Amazon SES will
     *         publish feedback notifications only through Amazon SNS. This value can
     *         only be set to <code>false</code> when topics are specified for both
     *         <code>Bounce</code> and <code>Complaint</code> topic types.
     */
    public void setForwardingEnabled(Boolean forwardingEnabled) {
        this.forwardingEnabled = forwardingEnabled;
    }
    
    /**
     * Sets whether Amazon SES will forward feedback notifications as email.
     * <code>true</code> specifies that Amazon SES will forward feedback
     * notifications as email, in addition to any Amazon SNS topic publishing
     * otherwise specified. <code>false</code> specifies that Amazon SES will
     * publish feedback notifications only through Amazon SNS. This value can
     * only be set to <code>false</code> when topics are specified for both
     * <code>Bounce</code> and <code>Complaint</code> topic types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forwardingEnabled Sets whether Amazon SES will forward feedback notifications as email.
     *         <code>true</code> specifies that Amazon SES will forward feedback
     *         notifications as email, in addition to any Amazon SNS topic publishing
     *         otherwise specified. <code>false</code> specifies that Amazon SES will
     *         publish feedback notifications only through Amazon SNS. This value can
     *         only be set to <code>false</code> when topics are specified for both
     *         <code>Bounce</code> and <code>Complaint</code> topic types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetIdentityFeedbackForwardingEnabledRequest withForwardingEnabled(Boolean forwardingEnabled) {
        this.forwardingEnabled = forwardingEnabled;
        return this;
    }

    /**
     * Sets whether Amazon SES will forward feedback notifications as email.
     * <code>true</code> specifies that Amazon SES will forward feedback
     * notifications as email, in addition to any Amazon SNS topic publishing
     * otherwise specified. <code>false</code> specifies that Amazon SES will
     * publish feedback notifications only through Amazon SNS. This value can
     * only be set to <code>false</code> when topics are specified for both
     * <code>Bounce</code> and <code>Complaint</code> topic types.
     *
     * @return Sets whether Amazon SES will forward feedback notifications as email.
     *         <code>true</code> specifies that Amazon SES will forward feedback
     *         notifications as email, in addition to any Amazon SNS topic publishing
     *         otherwise specified. <code>false</code> specifies that Amazon SES will
     *         publish feedback notifications only through Amazon SNS. This value can
     *         only be set to <code>false</code> when topics are specified for both
     *         <code>Bounce</code> and <code>Complaint</code> topic types.
     */
    public Boolean getForwardingEnabled() {
        return forwardingEnabled;
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
        if (getIdentity() != null) sb.append("Identity: " + getIdentity() + ",");
        if (isForwardingEnabled() != null) sb.append("ForwardingEnabled: " + isForwardingEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode()); 
        hashCode = prime * hashCode + ((isForwardingEnabled() == null) ? 0 : isForwardingEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetIdentityFeedbackForwardingEnabledRequest == false) return false;
        SetIdentityFeedbackForwardingEnabledRequest other = (SetIdentityFeedbackForwardingEnabledRequest)obj;
        
        if (other.getIdentity() == null ^ this.getIdentity() == null) return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false) return false; 
        if (other.isForwardingEnabled() == null ^ this.isForwardingEnabled() == null) return false;
        if (other.isForwardingEnabled() != null && other.isForwardingEnabled().equals(this.isForwardingEnabled()) == false) return false; 
        return true;
    }
    
}
    