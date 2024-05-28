/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information about the <code>AttributeTypesSelector </code>where the rule-based identity resolution uses
 * to match profiles. You can choose how profiles are compared across attribute types and which attribute to use for
 * matching from each type. There are three attribute types you can configure:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Email type
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can choose from <code>Email</code>, <code>BusinessEmail</code>, and <code>PersonalEmail</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Phone number type
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can choose from <code>Phone</code>, <code>HomePhone</code>, and <code>MobilePhone</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Address type
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can choose from <code>Address</code>, <code>BusinessAddress</code>, <code>MaillingAddress</code>, and
 * <code>ShippingAddress</code>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * You can either choose <code>ONE_TO_ONE</code> or <code>MANY_TO_MANY</code> as the <code>AttributeMatchingModel</code>
 * . When choosing <code>MANY_TO_MANY</code>, the system can match attribute across the sub-types of an attribute type.
 * For example, if the value of the <code>Email</code> field of Profile A and the value of <code>BusinessEmail</code>
 * field of Profile B matches, the two profiles are matched on the Email type. When choosing <code>ONE_TO_ONE</code> the
 * system can only match if the sub-types are exact matches. For example, only when the value of the <code>Email</code>
 * field of Profile A and the value of the <code>Email</code> field of Profile B matches, the two profiles are matched
 * on the Email type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AttributeTypesSelector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeTypesSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     * <code>MANY_TO_MANY</code>.
     * </p>
     */
    private String attributeMatchingModel;
    /**
     * <p>
     * The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     * <code>MaillingAddress</code>, and <code>ShippingAddress</code>.
     * </p>
     * <p>
     * You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match profile
     * based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to choose the
     * <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address type and specify the
     * <code>Address.City</code> on the matching rule.
     * </p>
     */
    private java.util.List<String> address;
    /**
     * <p>
     * The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>, <code>HomePhoneNumber</code>,
     * and <code>MobilePhoneNumber</code>.
     * </p>
     * <p>
     * You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the <code>Phone</code>
     * and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only specify the
     * <code>PhoneNumber</code> on the matching rule.
     * </p>
     */
    private java.util.List<String> phoneNumber;
    /**
     * <p>
     * The <code>Email</code> type. You can choose from <code>EmailAddress</code>, <code>BusinessEmailAddress</code> and
     * <code>PersonalEmailAddress</code>.
     * </p>
     * <p>
     * You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>, you need to choose
     * the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to represent the
     * <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the matching rule.
     * </p>
     */
    private java.util.List<String> emailAddress;

    /**
     * <p>
     * Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     * <code>MANY_TO_MANY</code>.
     * </p>
     * 
     * @param attributeMatchingModel
     *        Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     *        <code>MANY_TO_MANY</code>.
     * @see AttributeMatchingModel
     */

    public void setAttributeMatchingModel(String attributeMatchingModel) {
        this.attributeMatchingModel = attributeMatchingModel;
    }

    /**
     * <p>
     * Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     * <code>MANY_TO_MANY</code>.
     * </p>
     * 
     * @return Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     *         <code>MANY_TO_MANY</code>.
     * @see AttributeMatchingModel
     */

    public String getAttributeMatchingModel() {
        return this.attributeMatchingModel;
    }

    /**
     * <p>
     * Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     * <code>MANY_TO_MANY</code>.
     * </p>
     * 
     * @param attributeMatchingModel
     *        Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     *        <code>MANY_TO_MANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeMatchingModel
     */

    public AttributeTypesSelector withAttributeMatchingModel(String attributeMatchingModel) {
        setAttributeMatchingModel(attributeMatchingModel);
        return this;
    }

    /**
     * <p>
     * Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     * <code>MANY_TO_MANY</code>.
     * </p>
     * 
     * @param attributeMatchingModel
     *        Configures the <code>AttributeMatchingModel</code>, you can either choose <code>ONE_TO_ONE</code> or
     *        <code>MANY_TO_MANY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttributeMatchingModel
     */

    public AttributeTypesSelector withAttributeMatchingModel(AttributeMatchingModel attributeMatchingModel) {
        this.attributeMatchingModel = attributeMatchingModel.toString();
        return this;
    }

    /**
     * <p>
     * The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     * <code>MaillingAddress</code>, and <code>ShippingAddress</code>.
     * </p>
     * <p>
     * You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match profile
     * based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to choose the
     * <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address type and specify the
     * <code>Address.City</code> on the matching rule.
     * </p>
     * 
     * @return The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     *         <code>MaillingAddress</code>, and <code>ShippingAddress</code>.</p>
     *         <p>
     *         You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match
     *         profile based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to
     *         choose the <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address
     *         type and specify the <code>Address.City</code> on the matching rule.
     */

    public java.util.List<String> getAddress() {
        return address;
    }

    /**
     * <p>
     * The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     * <code>MaillingAddress</code>, and <code>ShippingAddress</code>.
     * </p>
     * <p>
     * You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match profile
     * based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to choose the
     * <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address type and specify the
     * <code>Address.City</code> on the matching rule.
     * </p>
     * 
     * @param address
     *        The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     *        <code>MaillingAddress</code>, and <code>ShippingAddress</code>.</p>
     *        <p>
     *        You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match
     *        profile based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to
     *        choose the <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address type
     *        and specify the <code>Address.City</code> on the matching rule.
     */

    public void setAddress(java.util.Collection<String> address) {
        if (address == null) {
            this.address = null;
            return;
        }

        this.address = new java.util.ArrayList<String>(address);
    }

    /**
     * <p>
     * The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     * <code>MaillingAddress</code>, and <code>ShippingAddress</code>.
     * </p>
     * <p>
     * You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match profile
     * based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to choose the
     * <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address type and specify the
     * <code>Address.City</code> on the matching rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddress(java.util.Collection)} or {@link #withAddress(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param address
     *        The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     *        <code>MaillingAddress</code>, and <code>ShippingAddress</code>.</p>
     *        <p>
     *        You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match
     *        profile based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to
     *        choose the <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address type
     *        and specify the <code>Address.City</code> on the matching rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeTypesSelector withAddress(String... address) {
        if (this.address == null) {
            setAddress(new java.util.ArrayList<String>(address.length));
        }
        for (String ele : address) {
            this.address.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     * <code>MaillingAddress</code>, and <code>ShippingAddress</code>.
     * </p>
     * <p>
     * You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match profile
     * based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to choose the
     * <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address type and specify the
     * <code>Address.City</code> on the matching rule.
     * </p>
     * 
     * @param address
     *        The <code>Address</code> type. You can choose from <code>Address</code>, <code>BusinessAddress</code>,
     *        <code>MaillingAddress</code>, and <code>ShippingAddress</code>.</p>
     *        <p>
     *        You only can use the Address type in the <code>MatchingRule</code>. For example, if you want to match
     *        profile based on <code>BusinessAddress.City</code> or <code>MaillingAddress.City</code>, you need to
     *        choose the <code>BusinessAddress</code> and the <code>MaillingAddress</code> to represent the Address type
     *        and specify the <code>Address.City</code> on the matching rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeTypesSelector withAddress(java.util.Collection<String> address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>, <code>HomePhoneNumber</code>,
     * and <code>MobilePhoneNumber</code>.
     * </p>
     * <p>
     * You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the <code>Phone</code>
     * and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only specify the
     * <code>PhoneNumber</code> on the matching rule.
     * </p>
     * 
     * @return The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>,
     *         <code>HomePhoneNumber</code>, and <code>MobilePhoneNumber</code>.</p>
     *         <p>
     *         You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you
     *         want to match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the
     *         <code>Phone</code> and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only
     *         specify the <code>PhoneNumber</code> on the matching rule.
     */

    public java.util.List<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * <p>
     * The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>, <code>HomePhoneNumber</code>,
     * and <code>MobilePhoneNumber</code>.
     * </p>
     * <p>
     * You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the <code>Phone</code>
     * and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only specify the
     * <code>PhoneNumber</code> on the matching rule.
     * </p>
     * 
     * @param phoneNumber
     *        The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>,
     *        <code>HomePhoneNumber</code>, and <code>MobilePhoneNumber</code>.</p>
     *        <p>
     *        You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you
     *        want to match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the
     *        <code>Phone</code> and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only
     *        specify the <code>PhoneNumber</code> on the matching rule.
     */

    public void setPhoneNumber(java.util.Collection<String> phoneNumber) {
        if (phoneNumber == null) {
            this.phoneNumber = null;
            return;
        }

        this.phoneNumber = new java.util.ArrayList<String>(phoneNumber);
    }

    /**
     * <p>
     * The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>, <code>HomePhoneNumber</code>,
     * and <code>MobilePhoneNumber</code>.
     * </p>
     * <p>
     * You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the <code>Phone</code>
     * and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only specify the
     * <code>PhoneNumber</code> on the matching rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumber(java.util.Collection)} or {@link #withPhoneNumber(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param phoneNumber
     *        The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>,
     *        <code>HomePhoneNumber</code>, and <code>MobilePhoneNumber</code>.</p>
     *        <p>
     *        You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you
     *        want to match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the
     *        <code>Phone</code> and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only
     *        specify the <code>PhoneNumber</code> on the matching rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeTypesSelector withPhoneNumber(String... phoneNumber) {
        if (this.phoneNumber == null) {
            setPhoneNumber(new java.util.ArrayList<String>(phoneNumber.length));
        }
        for (String ele : phoneNumber) {
            this.phoneNumber.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>, <code>HomePhoneNumber</code>,
     * and <code>MobilePhoneNumber</code>.
     * </p>
     * <p>
     * You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the <code>Phone</code>
     * and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only specify the
     * <code>PhoneNumber</code> on the matching rule.
     * </p>
     * 
     * @param phoneNumber
     *        The <code>PhoneNumber</code> type. You can choose from <code>PhoneNumber</code>,
     *        <code>HomePhoneNumber</code>, and <code>MobilePhoneNumber</code>.</p>
     *        <p>
     *        You only can use the <code>PhoneNumber</code> type in the <code>MatchingRule</code>. For example, if you
     *        want to match a profile based on <code>Phone</code> or <code>HomePhone</code>, you need to choose the
     *        <code>Phone</code> and the <code>HomePhone</code> to represent the <code>PhoneNumber</code> type and only
     *        specify the <code>PhoneNumber</code> on the matching rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeTypesSelector withPhoneNumber(java.util.Collection<String> phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The <code>Email</code> type. You can choose from <code>EmailAddress</code>, <code>BusinessEmailAddress</code> and
     * <code>PersonalEmailAddress</code>.
     * </p>
     * <p>
     * You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>, you need to choose
     * the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to represent the
     * <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the matching rule.
     * </p>
     * 
     * @return The <code>Email</code> type. You can choose from <code>EmailAddress</code>,
     *         <code>BusinessEmailAddress</code> and <code>PersonalEmailAddress</code>.</p>
     *         <p>
     *         You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you
     *         want to match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>,
     *         you need to choose the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to
     *         represent the <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the
     *         matching rule.
     */

    public java.util.List<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * <p>
     * The <code>Email</code> type. You can choose from <code>EmailAddress</code>, <code>BusinessEmailAddress</code> and
     * <code>PersonalEmailAddress</code>.
     * </p>
     * <p>
     * You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>, you need to choose
     * the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to represent the
     * <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the matching rule.
     * </p>
     * 
     * @param emailAddress
     *        The <code>Email</code> type. You can choose from <code>EmailAddress</code>,
     *        <code>BusinessEmailAddress</code> and <code>PersonalEmailAddress</code>.</p>
     *        <p>
     *        You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you
     *        want to match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>, you
     *        need to choose the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to
     *        represent the <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the
     *        matching rule.
     */

    public void setEmailAddress(java.util.Collection<String> emailAddress) {
        if (emailAddress == null) {
            this.emailAddress = null;
            return;
        }

        this.emailAddress = new java.util.ArrayList<String>(emailAddress);
    }

    /**
     * <p>
     * The <code>Email</code> type. You can choose from <code>EmailAddress</code>, <code>BusinessEmailAddress</code> and
     * <code>PersonalEmailAddress</code>.
     * </p>
     * <p>
     * You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>, you need to choose
     * the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to represent the
     * <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the matching rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEmailAddress(java.util.Collection)} or {@link #withEmailAddress(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param emailAddress
     *        The <code>Email</code> type. You can choose from <code>EmailAddress</code>,
     *        <code>BusinessEmailAddress</code> and <code>PersonalEmailAddress</code>.</p>
     *        <p>
     *        You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you
     *        want to match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>, you
     *        need to choose the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to
     *        represent the <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the
     *        matching rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeTypesSelector withEmailAddress(String... emailAddress) {
        if (this.emailAddress == null) {
            setEmailAddress(new java.util.ArrayList<String>(emailAddress.length));
        }
        for (String ele : emailAddress) {
            this.emailAddress.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>Email</code> type. You can choose from <code>EmailAddress</code>, <code>BusinessEmailAddress</code> and
     * <code>PersonalEmailAddress</code>.
     * </p>
     * <p>
     * You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you want to
     * match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>, you need to choose
     * the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to represent the
     * <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the matching rule.
     * </p>
     * 
     * @param emailAddress
     *        The <code>Email</code> type. You can choose from <code>EmailAddress</code>,
     *        <code>BusinessEmailAddress</code> and <code>PersonalEmailAddress</code>.</p>
     *        <p>
     *        You only can use the <code>EmailAddress</code> type in the <code>MatchingRule</code>. For example, if you
     *        want to match profile based on <code>PersonalEmailAddress</code> or <code>BusinessEmailAddress</code>, you
     *        need to choose the <code>PersonalEmailAddress</code> and the <code>BusinessEmailAddress</code> to
     *        represent the <code>EmailAddress</code> type and only specify the <code>EmailAddress</code> on the
     *        matching rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeTypesSelector withEmailAddress(java.util.Collection<String> emailAddress) {
        setEmailAddress(emailAddress);
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
        if (getAttributeMatchingModel() != null)
            sb.append("AttributeMatchingModel: ").append(getAttributeMatchingModel()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeTypesSelector == false)
            return false;
        AttributeTypesSelector other = (AttributeTypesSelector) obj;
        if (other.getAttributeMatchingModel() == null ^ this.getAttributeMatchingModel() == null)
            return false;
        if (other.getAttributeMatchingModel() != null && other.getAttributeMatchingModel().equals(this.getAttributeMatchingModel()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeMatchingModel() == null) ? 0 : getAttributeMatchingModel().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        return hashCode;
    }

    @Override
    public AttributeTypesSelector clone() {
        try {
            return (AttributeTypesSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.AttributeTypesSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
