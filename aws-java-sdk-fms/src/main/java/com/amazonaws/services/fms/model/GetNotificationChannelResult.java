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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetNotificationChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNotificationChannelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The SNS topic that records AWS Firewall Manager activity.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
     * </p>
     */
    private String snsRoleName;

    /**
     * <p>
     * The SNS topic that records AWS Firewall Manager activity.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic that records AWS Firewall Manager activity.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic that records AWS Firewall Manager activity.
     * </p>
     * 
     * @return The SNS topic that records AWS Firewall Manager activity.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic that records AWS Firewall Manager activity.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic that records AWS Firewall Manager activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNotificationChannelResult withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
     * </p>
     * 
     * @param snsRoleName
     *        The IAM role that is used by AWS Firewall Manager to record activity to SNS.
     */

    public void setSnsRoleName(String snsRoleName) {
        this.snsRoleName = snsRoleName;
    }

    /**
     * <p>
     * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
     * </p>
     * 
     * @return The IAM role that is used by AWS Firewall Manager to record activity to SNS.
     */

    public String getSnsRoleName() {
        return this.snsRoleName;
    }

    /**
     * <p>
     * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
     * </p>
     * 
     * @param snsRoleName
     *        The IAM role that is used by AWS Firewall Manager to record activity to SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNotificationChannelResult withSnsRoleName(String snsRoleName) {
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

        if (obj instanceof GetNotificationChannelResult == false)
            return false;
        GetNotificationChannelResult other = (GetNotificationChannelResult) obj;
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
    public GetNotificationChannelResult clone() {
        try {
            return (GetNotificationChannelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
