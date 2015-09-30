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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * When included in a receipt rule, this action calls Amazon WorkMail
 * and, optionally, publishes a notification to Amazon Simple
 * Notification Service (Amazon SNS). You will typically not use this
 * action directly because Amazon WorkMail adds the rule automatically
 * during its setup procedure.
 * </p>
 * <p>
 * For information using a receipt rule to call Amazon WorkMail, see the
 * <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-workmail.html"> Amazon SES Developer Guide </a>
 * .
 * </p>
 */
public class WorkmailAction implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when
     * the WorkMail action is called. An example of an Amazon SNS topic ARN
     * is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     */
    private String topicArn;

    /**
     * The ARN of the Amazon WorkMail organization. An example of an Amazon
     * WorkMail organization ARN is
     * <code>arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7</code>.
     * For information about Amazon WorkMail organizations, see the <a
     * href="http://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html">Amazon
     * WorkMail Administrator Guide</a>.
     */
    private String organizationArn;

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when
     * the WorkMail action is called. An example of an Amazon SNS topic ARN
     * is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     *
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when
     *         the WorkMail action is called. An example of an Amazon SNS topic ARN
     *         is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *         information about Amazon SNS topics, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     *         SNS Developer Guide</a>.
     */
    public String getTopicArn() {
        return topicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when
     * the WorkMail action is called. An example of an Amazon SNS topic ARN
     * is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     *
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when
     *         the WorkMail action is called. An example of an Amazon SNS topic ARN
     *         is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *         information about Amazon SNS topics, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     *         SNS Developer Guide</a>.
     */
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when
     * the WorkMail action is called. An example of an Amazon SNS topic ARN
     * is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     * information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     * SNS Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when
     *         the WorkMail action is called. An example of an Amazon SNS topic ARN
     *         is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more
     *         information about Amazon SNS topics, see the <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon
     *         SNS Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkmailAction withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * The ARN of the Amazon WorkMail organization. An example of an Amazon
     * WorkMail organization ARN is
     * <code>arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7</code>.
     * For information about Amazon WorkMail organizations, see the <a
     * href="http://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html">Amazon
     * WorkMail Administrator Guide</a>.
     *
     * @return The ARN of the Amazon WorkMail organization. An example of an Amazon
     *         WorkMail organization ARN is
     *         <code>arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7</code>.
     *         For information about Amazon WorkMail organizations, see the <a
     *         href="http://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html">Amazon
     *         WorkMail Administrator Guide</a>.
     */
    public String getOrganizationArn() {
        return organizationArn;
    }
    
    /**
     * The ARN of the Amazon WorkMail organization. An example of an Amazon
     * WorkMail organization ARN is
     * <code>arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7</code>.
     * For information about Amazon WorkMail organizations, see the <a
     * href="http://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html">Amazon
     * WorkMail Administrator Guide</a>.
     *
     * @param organizationArn The ARN of the Amazon WorkMail organization. An example of an Amazon
     *         WorkMail organization ARN is
     *         <code>arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7</code>.
     *         For information about Amazon WorkMail organizations, see the <a
     *         href="http://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html">Amazon
     *         WorkMail Administrator Guide</a>.
     */
    public void setOrganizationArn(String organizationArn) {
        this.organizationArn = organizationArn;
    }
    
    /**
     * The ARN of the Amazon WorkMail organization. An example of an Amazon
     * WorkMail organization ARN is
     * <code>arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7</code>.
     * For information about Amazon WorkMail organizations, see the <a
     * href="http://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html">Amazon
     * WorkMail Administrator Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param organizationArn The ARN of the Amazon WorkMail organization. An example of an Amazon
     *         WorkMail organization ARN is
     *         <code>arn:aws:workmail:us-west-2:123456789012:organization/m-68755160c4cb4e29a2b2f8fb58f359d7</code>.
     *         For information about Amazon WorkMail organizations, see the <a
     *         href="http://docs.aws.amazon.com/workmail/latest/adminguide/organizations_overview.html">Amazon
     *         WorkMail Administrator Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkmailAction withOrganizationArn(String organizationArn) {
        this.organizationArn = organizationArn;
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
        if (getTopicArn() != null) sb.append("TopicArn: " + getTopicArn() + ",");
        if (getOrganizationArn() != null) sb.append("OrganizationArn: " + getOrganizationArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getOrganizationArn() == null) ? 0 : getOrganizationArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkmailAction == false) return false;
        WorkmailAction other = (WorkmailAction)obj;
        
        if (other.getTopicArn() == null ^ this.getTopicArn() == null) return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false) return false; 
        if (other.getOrganizationArn() == null ^ this.getOrganizationArn() == null) return false;
        if (other.getOrganizationArn() != null && other.getOrganizationArn().equals(this.getOrganizationArn()) == false) return false; 
        return true;
    }
    
    @Override
    public WorkmailAction clone() {
        try {
            return (WorkmailAction) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    