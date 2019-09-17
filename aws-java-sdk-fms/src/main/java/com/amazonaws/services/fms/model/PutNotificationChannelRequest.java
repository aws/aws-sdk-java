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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutNotificationChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutNotificationChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity.
     * </p>
     */
    private String snsRoleName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutNotificationChannelRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity.
     * </p>
     * 
     * @param snsRoleName
     *        The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager
     *        activity.
     */

    public void setSnsRoleName(String snsRoleName) {
        this.snsRoleName = snsRoleName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager
     *         activity.
     */

    public String getSnsRoleName() {
        return this.snsRoleName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity.
     * </p>
     * 
     * @param snsRoleName
     *        The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager
     *        activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutNotificationChannelRequest withSnsRoleName(String snsRoleName) {
        setSnsRoleName(snsRoleName);
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
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSnsRoleName() != null)
            sb.append("SnsRoleName: ").append(getSnsRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutNotificationChannelRequest == false)
            return false;
        PutNotificationChannelRequest other = (PutNotificationChannelRequest) obj;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSnsRoleName() == null ^ this.getSnsRoleName() == null)
            return false;
        if (other.getSnsRoleName() != null && other.getSnsRoleName().equals(this.getSnsRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSnsRoleName() == null) ? 0 : getSnsRoleName().hashCode());
        return hashCode;
    }

    @Override
    public PutNotificationChannelRequest clone() {
        return (PutNotificationChannelRequest) super.clone();
    }

}
