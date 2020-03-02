/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContactMethod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContactMethodRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS text
     * messaging is supported, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions and
     * Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The destination of the contact method, such as an email address or a mobile phone number.
     * </p>
     * <p>
     * Use the E.164 format when specifying a mobile phone number. E.164 is a standard for the phone number structure
     * used for international telecommunication. Phone numbers that follow this format can have a maximum of 15 digits,
     * and they are prefixed with the plus character (+) and the country code. For example, a U.S. phone number in E.164
     * format would be specified as +1XXX5550100. For more information, see <a
     * href="https://en.wikipedia.org/wiki/E.164">E.164</a> in Wikipedia.
     * </p>
     */
    private String contactEndpoint;

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS text
     * messaging is supported, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions and
     * Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param protocol
     *        The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).</p>
     *        <p>
     *        The <code>SMS</code> protocol is supported only in the following AWS Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (<code>us-east-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (<code>us-west-2</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Ireland) (<code>eu-west-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS
     *        text messaging is supported, see <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions
     *        and Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about notifications in Amazon Lightsail, see <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *        >Notifications in Amazon Lightsail</a>.
     * @see ContactProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS text
     * messaging is supported, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions and
     * Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @return The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).</p>
     *         <p>
     *         The <code>SMS</code> protocol is supported only in the following AWS Regions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         US East (N. Virginia) (<code>us-east-1</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         US West (Oregon) (<code>us-west-2</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Europe (Ireland) (<code>eu-west-1</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS
     *         text messaging is supported, see <a
     *         href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions
     *         and Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     *         </p>
     *         <p>
     *         For more information about notifications in Amazon Lightsail, see <a
     *         href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *         >Notifications in Amazon Lightsail</a>.
     * @see ContactProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS text
     * messaging is supported, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions and
     * Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param protocol
     *        The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).</p>
     *        <p>
     *        The <code>SMS</code> protocol is supported only in the following AWS Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (<code>us-east-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (<code>us-west-2</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Ireland) (<code>eu-west-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS
     *        text messaging is supported, see <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions
     *        and Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about notifications in Amazon Lightsail, see <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *        >Notifications in Amazon Lightsail</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public CreateContactMethodRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * The <code>SMS</code> protocol is supported only in the following AWS Regions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * US East (N. Virginia) (<code>us-east-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * US West (Oregon) (<code>us-west-2</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Europe (Ireland) (<code>eu-west-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS text
     * messaging is supported, see <a
     * href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions and
     * Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     * </p>
     * <p>
     * For more information about notifications in Amazon Lightsail, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications">Notifications in
     * Amazon Lightsail</a>.
     * </p>
     * 
     * @param protocol
     *        The protocol of the contact method, such as <code>Email</code> or <code>SMS</code> (text messaging).</p>
     *        <p>
     *        The <code>SMS</code> protocol is supported only in the following AWS Regions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        US East (N. Virginia) (<code>us-east-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        US West (Oregon) (<code>us-west-2</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Europe (Ireland) (<code>eu-west-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Tokyo) (<code>ap-northeast-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Singapore) (<code>ap-southeast-1</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Asia Pacific (Sydney) (<code>ap-southeast-2</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For a list of countries/regions where SMS text messages can be sent, and the latest AWS Regions where SMS
     *        text messaging is supported, see <a
     *        href="https://docs.aws.amazon.com/sns/latest/dg/sns-supported-regions-countries.html">Supported Regions
     *        and Countries</a> in the <i>Amazon SNS Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about notifications in Amazon Lightsail, see <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-notifications"
     *        >Notifications in Amazon Lightsail</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public CreateContactMethodRequest withProtocol(ContactProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a mobile phone number.
     * </p>
     * <p>
     * Use the E.164 format when specifying a mobile phone number. E.164 is a standard for the phone number structure
     * used for international telecommunication. Phone numbers that follow this format can have a maximum of 15 digits,
     * and they are prefixed with the plus character (+) and the country code. For example, a U.S. phone number in E.164
     * format would be specified as +1XXX5550100. For more information, see <a
     * href="https://en.wikipedia.org/wiki/E.164">E.164</a> in Wikipedia.
     * </p>
     * 
     * @param contactEndpoint
     *        The destination of the contact method, such as an email address or a mobile phone number.</p>
     *        <p>
     *        Use the E.164 format when specifying a mobile phone number. E.164 is a standard for the phone number
     *        structure used for international telecommunication. Phone numbers that follow this format can have a
     *        maximum of 15 digits, and they are prefixed with the plus character (+) and the country code. For example,
     *        a U.S. phone number in E.164 format would be specified as +1XXX5550100. For more information, see <a
     *        href="https://en.wikipedia.org/wiki/E.164">E.164</a> in Wikipedia.
     */

    public void setContactEndpoint(String contactEndpoint) {
        this.contactEndpoint = contactEndpoint;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a mobile phone number.
     * </p>
     * <p>
     * Use the E.164 format when specifying a mobile phone number. E.164 is a standard for the phone number structure
     * used for international telecommunication. Phone numbers that follow this format can have a maximum of 15 digits,
     * and they are prefixed with the plus character (+) and the country code. For example, a U.S. phone number in E.164
     * format would be specified as +1XXX5550100. For more information, see <a
     * href="https://en.wikipedia.org/wiki/E.164">E.164</a> in Wikipedia.
     * </p>
     * 
     * @return The destination of the contact method, such as an email address or a mobile phone number.</p>
     *         <p>
     *         Use the E.164 format when specifying a mobile phone number. E.164 is a standard for the phone number
     *         structure used for international telecommunication. Phone numbers that follow this format can have a
     *         maximum of 15 digits, and they are prefixed with the plus character (+) and the country code. For
     *         example, a U.S. phone number in E.164 format would be specified as +1XXX5550100. For more information,
     *         see <a href="https://en.wikipedia.org/wiki/E.164">E.164</a> in Wikipedia.
     */

    public String getContactEndpoint() {
        return this.contactEndpoint;
    }

    /**
     * <p>
     * The destination of the contact method, such as an email address or a mobile phone number.
     * </p>
     * <p>
     * Use the E.164 format when specifying a mobile phone number. E.164 is a standard for the phone number structure
     * used for international telecommunication. Phone numbers that follow this format can have a maximum of 15 digits,
     * and they are prefixed with the plus character (+) and the country code. For example, a U.S. phone number in E.164
     * format would be specified as +1XXX5550100. For more information, see <a
     * href="https://en.wikipedia.org/wiki/E.164">E.164</a> in Wikipedia.
     * </p>
     * 
     * @param contactEndpoint
     *        The destination of the contact method, such as an email address or a mobile phone number.</p>
     *        <p>
     *        Use the E.164 format when specifying a mobile phone number. E.164 is a standard for the phone number
     *        structure used for international telecommunication. Phone numbers that follow this format can have a
     *        maximum of 15 digits, and they are prefixed with the plus character (+) and the country code. For example,
     *        a U.S. phone number in E.164 format would be specified as +1XXX5550100. For more information, see <a
     *        href="https://en.wikipedia.org/wiki/E.164">E.164</a> in Wikipedia.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactMethodRequest withContactEndpoint(String contactEndpoint) {
        setContactEndpoint(contactEndpoint);
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
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getContactEndpoint() != null)
            sb.append("ContactEndpoint: ").append(getContactEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContactMethodRequest == false)
            return false;
        CreateContactMethodRequest other = (CreateContactMethodRequest) obj;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getContactEndpoint() == null ^ this.getContactEndpoint() == null)
            return false;
        if (other.getContactEndpoint() != null && other.getContactEndpoint().equals(this.getContactEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getContactEndpoint() == null) ? 0 : getContactEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public CreateContactMethodRequest clone() {
        return (CreateContactMethodRequest) super.clone();
    }

}
