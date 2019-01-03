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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the dimension configuration to use when you send Amazon Pinpoint email events to Amazon
 * CloudWatch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/CloudWatchDimensionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchDimensionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet the
     * following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can contain no more than 256 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String dimensionName;
    /**
     * <p>
     * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want
     * Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the
     * SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email
     * headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose
     * <code>linkTags</code>.
     * </p>
     */
    private String dimensionValueSource;
    /**
     * <p>
     * The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value of the
     * dimension when you send an email. This value has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can contain no more than 256 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String defaultDimensionValue;

    /**
     * <p>
     * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet the
     * following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can contain no more than 256 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dimensionName
     *        The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet
     *        the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can contain no more than 256 characters.
     *        </p>
     *        </li>
     */

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet the
     * following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can contain no more than 256 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet
     *         the following criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It can contain no more than 256 characters.
     *         </p>
     *         </li>
     */

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * <p>
     * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet the
     * following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can contain no more than 256 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dimensionName
     *        The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet
     *        the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can contain no more than 256 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchDimensionConfiguration withDimensionName(String dimensionName) {
        setDimensionName(dimensionName);
        return this;
    }

    /**
     * <p>
     * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want
     * Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the
     * SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email
     * headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose
     * <code>linkTags</code>.
     * </p>
     * 
     * @param dimensionValueSource
     *        The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you
     *        want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a
     *        parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint
     *        to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link
     *        tags, choose <code>linkTags</code>.
     * @see DimensionValueSource
     */

    public void setDimensionValueSource(String dimensionValueSource) {
        this.dimensionValueSource = dimensionValueSource;
    }

    /**
     * <p>
     * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want
     * Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the
     * SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email
     * headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose
     * <code>linkTags</code>.
     * </p>
     * 
     * @return The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you
     *         want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a
     *         parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint
     *         to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link
     *         tags, choose <code>linkTags</code>.
     * @see DimensionValueSource
     */

    public String getDimensionValueSource() {
        return this.dimensionValueSource;
    }

    /**
     * <p>
     * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want
     * Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the
     * SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email
     * headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose
     * <code>linkTags</code>.
     * </p>
     * 
     * @param dimensionValueSource
     *        The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you
     *        want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a
     *        parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint
     *        to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link
     *        tags, choose <code>linkTags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionValueSource
     */

    public CloudWatchDimensionConfiguration withDimensionValueSource(String dimensionValueSource) {
        setDimensionValueSource(dimensionValueSource);
        return this;
    }

    /**
     * <p>
     * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want
     * Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the
     * SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint to use your own email
     * headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link tags, choose
     * <code>linkTags</code>.
     * </p>
     * 
     * @param dimensionValueSource
     *        The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you
     *        want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a
     *        parameter to the SendEmail/SendRawEmail API, choose <code>messageTag</code>. If you want Amazon Pinpoint
     *        to use your own email headers, choose <code>emailHeader</code>. If you want Amazon Pinpoint to use link
     *        tags, choose <code>linkTags</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DimensionValueSource
     */

    public CloudWatchDimensionConfiguration withDimensionValueSource(DimensionValueSource dimensionValueSource) {
        this.dimensionValueSource = dimensionValueSource.toString();
        return this;
    }

    /**
     * <p>
     * The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value of the
     * dimension when you send an email. This value has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can contain no more than 256 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultDimensionValue
     *        The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value
     *        of the dimension when you send an email. This value has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can contain no more than 256 characters.
     *        </p>
     *        </li>
     */

    public void setDefaultDimensionValue(String defaultDimensionValue) {
        this.defaultDimensionValue = defaultDimensionValue;
    }

    /**
     * <p>
     * The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value of the
     * dimension when you send an email. This value has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can contain no more than 256 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value
     *         of the dimension when you send an email. This value has to meet the following criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It can contain no more than 256 characters.
     *         </p>
     *         </li>
     */

    public String getDefaultDimensionValue() {
        return this.defaultDimensionValue;
    }

    /**
     * <p>
     * The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value of the
     * dimension when you send an email. This value has to meet the following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can contain no more than 256 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param defaultDimensionValue
     *        The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value
     *        of the dimension when you send an email. This value has to meet the following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can contain no more than 256 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchDimensionConfiguration withDefaultDimensionValue(String defaultDimensionValue) {
        setDefaultDimensionValue(defaultDimensionValue);
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
        if (getDimensionName() != null)
            sb.append("DimensionName: ").append(getDimensionName()).append(",");
        if (getDimensionValueSource() != null)
            sb.append("DimensionValueSource: ").append(getDimensionValueSource()).append(",");
        if (getDefaultDimensionValue() != null)
            sb.append("DefaultDimensionValue: ").append(getDefaultDimensionValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchDimensionConfiguration == false)
            return false;
        CloudWatchDimensionConfiguration other = (CloudWatchDimensionConfiguration) obj;
        if (other.getDimensionName() == null ^ this.getDimensionName() == null)
            return false;
        if (other.getDimensionName() != null && other.getDimensionName().equals(this.getDimensionName()) == false)
            return false;
        if (other.getDimensionValueSource() == null ^ this.getDimensionValueSource() == null)
            return false;
        if (other.getDimensionValueSource() != null && other.getDimensionValueSource().equals(this.getDimensionValueSource()) == false)
            return false;
        if (other.getDefaultDimensionValue() == null ^ this.getDefaultDimensionValue() == null)
            return false;
        if (other.getDefaultDimensionValue() != null && other.getDefaultDimensionValue().equals(this.getDefaultDimensionValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionName() == null) ? 0 : getDimensionName().hashCode());
        hashCode = prime * hashCode + ((getDimensionValueSource() == null) ? 0 : getDimensionValueSource().hashCode());
        hashCode = prime * hashCode + ((getDefaultDimensionValue() == null) ? 0 : getDefaultDimensionValue().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchDimensionConfiguration clone() {
        try {
            return (CloudWatchDimensionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.CloudWatchDimensionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
