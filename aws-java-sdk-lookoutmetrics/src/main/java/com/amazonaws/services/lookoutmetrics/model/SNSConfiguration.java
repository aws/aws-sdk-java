/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the SNS topic to which you want to send your alerts and the IAM role that has access to
 * that topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/SNSConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SNSConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM role that has access to the target SNS topic.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ARN of the target SNS topic.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The format of the SNS topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a link to
     * the anomaly detail page. We recommend this for email.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend this
     * for SMS.
     * </p>
     * </li>
     * </ul>
     */
    private String snsFormat;

    /**
     * <p>
     * The ARN of the IAM role that has access to the target SNS topic.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that has access to the target SNS topic.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has access to the target SNS topic.
     * </p>
     * 
     * @return The ARN of the IAM role that has access to the target SNS topic.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that has access to the target SNS topic.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that has access to the target SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNSConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the target SNS topic.
     * </p>
     * 
     * @param snsTopicArn
     *        The ARN of the target SNS topic.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The ARN of the target SNS topic.
     * </p>
     * 
     * @return The ARN of the target SNS topic.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The ARN of the target SNS topic.
     * </p>
     * 
     * @param snsTopicArn
     *        The ARN of the target SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNSConfiguration withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The format of the SNS topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a link to
     * the anomaly detail page. We recommend this for email.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend this
     * for SMS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snsFormat
     *        The format of the SNS topic.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the
     *        default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a
     *        link to the anomaly detail page. We recommend this for email.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend
     *        this for SMS.
     *        </p>
     *        </li>
     * @see SnsFormat
     */

    public void setSnsFormat(String snsFormat) {
        this.snsFormat = snsFormat;
    }

    /**
     * <p>
     * The format of the SNS topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a link to
     * the anomaly detail page. We recommend this for email.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend this
     * for SMS.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The format of the SNS topic.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is
     *         the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a
     *         link to the anomaly detail page. We recommend this for email.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend
     *         this for SMS.
     *         </p>
     *         </li>
     * @see SnsFormat
     */

    public String getSnsFormat() {
        return this.snsFormat;
    }

    /**
     * <p>
     * The format of the SNS topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a link to
     * the anomaly detail page. We recommend this for email.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend this
     * for SMS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snsFormat
     *        The format of the SNS topic.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the
     *        default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a
     *        link to the anomaly detail page. We recommend this for email.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend
     *        this for SMS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnsFormat
     */

    public SNSConfiguration withSnsFormat(String snsFormat) {
        setSnsFormat(snsFormat);
        return this;
    }

    /**
     * <p>
     * The format of the SNS topic.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the
     * default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a link to
     * the anomaly detail page. We recommend this for email.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend this
     * for SMS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snsFormat
     *        The format of the SNS topic.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>JSON</code> – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the
     *        default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LONG_TEXT</code> – Send human-readable alerts with information about the impacted timeseries and a
     *        link to the anomaly detail page. We recommend this for email.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SHORT_TEXT</code> – Send human-readable alerts with a link to the anomaly detail page. We recommend
     *        this for SMS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnsFormat
     */

    public SNSConfiguration withSnsFormat(SnsFormat snsFormat) {
        this.snsFormat = snsFormat.toString();
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSnsFormat() != null)
            sb.append("SnsFormat: ").append(getSnsFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SNSConfiguration == false)
            return false;
        SNSConfiguration other = (SNSConfiguration) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSnsFormat() == null ^ this.getSnsFormat() == null)
            return false;
        if (other.getSnsFormat() != null && other.getSnsFormat().equals(this.getSnsFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSnsFormat() == null) ? 0 : getSnsFormat().hashCode());
        return hashCode;
    }

    @Override
    public SNSConfiguration clone() {
        try {
            return (SNSConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.SNSConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
