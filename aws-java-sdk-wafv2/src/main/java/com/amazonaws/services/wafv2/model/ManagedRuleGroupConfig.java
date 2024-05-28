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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional information that's used by a managed rule group. Many managed rule groups don't require this.
 * </p>
 * <p>
 * The rule groups used for intelligent threat mitigation require additional configuration:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the <code>AWSManagedRulesACFPRuleSet</code> configuration object to configure the account creation fraud
 * prevention managed rule group. The configuration includes the registration and sign-up pages of your application and
 * the locations in the account creation request payload of data, such as the user email and phone number fields.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the <code>AWSManagedRulesATPRuleSet</code> configuration object to configure the account takeover prevention
 * managed rule group. The configuration includes the sign-in page of your application and the locations in the login
 * request payload of data such as the username and password.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection level that you
 * want the Bot Control rule group to use.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For example specifications, see the examples section of <a>CreateWebACL</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ManagedRuleGroupConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleGroupConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under <code>AWSManagedRulesATPRuleSet</code>.
     * </p>
     * </note>
     */
    @Deprecated
    private String loginPath;
    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     */
    @Deprecated
    private String payloadType;
    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     */
    @Deprecated
    private UsernameField usernameField;
    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     */
    @Deprecated
    private PasswordField passwordField;
    /**
     * <p>
     * Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection level
     * that you want to use. For information about using the Bot Control managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a> and <a href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html">WAF Bot
     * Control</a> in the <i>WAF Developer Guide</i>.
     * </p>
     */
    private AWSManagedRulesBotControlRuleSet aWSManagedRulesBotControlRuleSet;
    /**
     * <p>
     * Additional configuration for using the account takeover prevention (ATP) managed rule group,
     * <code>AWSManagedRulesATPRuleSet</code>. Use this to provide login request information to the rule group. For web
     * ACLs that protect CloudFront distributions, use this to also provide the information about how your distribution
     * responds to login requests.
     * </p>
     * <p>
     * This configuration replaces the individual configuration fields in <code>ManagedRuleGroupConfig</code> and
     * provides additional feature configuration.
     * </p>
     * <p>
     * For information about using the ATP managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html">WAF Fraud Control
     * account takeover prevention (ATP) rule group</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html">WAF Fraud Control account takeover
     * prevention (ATP)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     */
    private AWSManagedRulesATPRuleSet aWSManagedRulesATPRuleSet;
    /**
     * <p>
     * Additional configuration for using the account creation fraud prevention (ACFP) managed rule group,
     * <code>AWSManagedRulesACFPRuleSet</code>. Use this to provide account creation request information to the rule
     * group. For web ACLs that protect CloudFront distributions, use this to also provide the information about how
     * your distribution responds to account creation requests.
     * </p>
     * <p>
     * For information about using the ACFP managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html">WAF Fraud Control
     * account creation fraud prevention (ACFP) rule group</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html">WAF Fraud Control account creation
     * fraud prevention (ACFP)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     */
    private AWSManagedRulesACFPRuleSet aWSManagedRulesACFPRuleSet;

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under <code>AWSManagedRulesATPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param loginPath
     *        <p>
     *        Instead of this setting, provide your configuration under <code>AWSManagedRulesATPRuleSet</code>.
     *        </p>
     */
    @Deprecated
    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under <code>AWSManagedRulesATPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @return <p>
     *         Instead of this setting, provide your configuration under <code>AWSManagedRulesATPRuleSet</code>.
     *         </p>
     */
    @Deprecated
    public String getLoginPath() {
        return this.loginPath;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under <code>AWSManagedRulesATPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param loginPath
     *        <p>
     *        Instead of this setting, provide your configuration under <code>AWSManagedRulesATPRuleSet</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ManagedRuleGroupConfig withLoginPath(String loginPath) {
        setLoginPath(loginPath);
        return this;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param payloadType
     *        <p>
     *        Instead of this setting, provide your configuration under the request inspection configuration for
     *        <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *        </p>
     * @see PayloadType
     */
    @Deprecated
    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @return <p>
     *         Instead of this setting, provide your configuration under the request inspection configuration for
     *         <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *         </p>
     * @see PayloadType
     */
    @Deprecated
    public String getPayloadType() {
        return this.payloadType;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param payloadType
     *        <p>
     *        Instead of this setting, provide your configuration under the request inspection configuration for
     *        <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */
    @Deprecated
    public ManagedRuleGroupConfig withPayloadType(String payloadType) {
        setPayloadType(payloadType);
        return this;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param payloadType
     *        <p>
     *        Instead of this setting, provide your configuration under the request inspection configuration for
     *        <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */
    @Deprecated
    public ManagedRuleGroupConfig withPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType.toString();
        return this;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param usernameField
     *        <p>
     *        Instead of this setting, provide your configuration under the request inspection configuration for
     *        <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *        </p>
     */
    @Deprecated
    public void setUsernameField(UsernameField usernameField) {
        this.usernameField = usernameField;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @return <p>
     *         Instead of this setting, provide your configuration under the request inspection configuration for
     *         <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *         </p>
     */
    @Deprecated
    public UsernameField getUsernameField() {
        return this.usernameField;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param usernameField
     *        <p>
     *        Instead of this setting, provide your configuration under the request inspection configuration for
     *        <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ManagedRuleGroupConfig withUsernameField(UsernameField usernameField) {
        setUsernameField(usernameField);
        return this;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param passwordField
     *        <p>
     *        Instead of this setting, provide your configuration under the request inspection configuration for
     *        <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *        </p>
     */
    @Deprecated
    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @return <p>
     *         Instead of this setting, provide your configuration under the request inspection configuration for
     *         <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *         </p>
     */
    @Deprecated
    public PasswordField getPasswordField() {
        return this.passwordField;
    }

    /**
     * <note>
     * <p>
     * Instead of this setting, provide your configuration under the request inspection configuration for
     * <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     * </p>
     * </note>
     * 
     * @param passwordField
     *        <p>
     *        Instead of this setting, provide your configuration under the request inspection configuration for
     *        <code>AWSManagedRulesATPRuleSet</code> or <code>AWSManagedRulesACFPRuleSet</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ManagedRuleGroupConfig withPasswordField(PasswordField passwordField) {
        setPasswordField(passwordField);
        return this;
    }

    /**
     * <p>
     * Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection level
     * that you want to use. For information about using the Bot Control managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a> and <a href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html">WAF Bot
     * Control</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param aWSManagedRulesBotControlRuleSet
     *        Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection
     *        level that you want to use. For information about using the Bot Control managed rule group, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot
     *        Control rule group</a> and <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html">WAF Bot Control</a> in
     *        the <i>WAF Developer Guide</i>.
     */

    public void setAWSManagedRulesBotControlRuleSet(AWSManagedRulesBotControlRuleSet aWSManagedRulesBotControlRuleSet) {
        this.aWSManagedRulesBotControlRuleSet = aWSManagedRulesBotControlRuleSet;
    }

    /**
     * <p>
     * Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection level
     * that you want to use. For information about using the Bot Control managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a> and <a href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html">WAF Bot
     * Control</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @return Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection
     *         level that you want to use. For information about using the Bot Control managed rule group, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot
     *         Control rule group</a> and <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html">WAF Bot Control</a> in
     *         the <i>WAF Developer Guide</i>.
     */

    public AWSManagedRulesBotControlRuleSet getAWSManagedRulesBotControlRuleSet() {
        return this.aWSManagedRulesBotControlRuleSet;
    }

    /**
     * <p>
     * Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection level
     * that you want to use. For information about using the Bot Control managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot Control
     * rule group</a> and <a href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html">WAF Bot
     * Control</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param aWSManagedRulesBotControlRuleSet
     *        Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection
     *        level that you want to use. For information about using the Bot Control managed rule group, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html">WAF Bot
     *        Control rule group</a> and <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-bot-control.html">WAF Bot Control</a> in
     *        the <i>WAF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupConfig withAWSManagedRulesBotControlRuleSet(AWSManagedRulesBotControlRuleSet aWSManagedRulesBotControlRuleSet) {
        setAWSManagedRulesBotControlRuleSet(aWSManagedRulesBotControlRuleSet);
        return this;
    }

    /**
     * <p>
     * Additional configuration for using the account takeover prevention (ATP) managed rule group,
     * <code>AWSManagedRulesATPRuleSet</code>. Use this to provide login request information to the rule group. For web
     * ACLs that protect CloudFront distributions, use this to also provide the information about how your distribution
     * responds to login requests.
     * </p>
     * <p>
     * This configuration replaces the individual configuration fields in <code>ManagedRuleGroupConfig</code> and
     * provides additional feature configuration.
     * </p>
     * <p>
     * For information about using the ATP managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html">WAF Fraud Control
     * account takeover prevention (ATP) rule group</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html">WAF Fraud Control account takeover
     * prevention (ATP)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param aWSManagedRulesATPRuleSet
     *        Additional configuration for using the account takeover prevention (ATP) managed rule group,
     *        <code>AWSManagedRulesATPRuleSet</code>. Use this to provide login request information to the rule group.
     *        For web ACLs that protect CloudFront distributions, use this to also provide the information about how
     *        your distribution responds to login requests. </p>
     *        <p>
     *        This configuration replaces the individual configuration fields in <code>ManagedRuleGroupConfig</code> and
     *        provides additional feature configuration.
     *        </p>
     *        <p>
     *        For information about using the ATP managed rule group, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html">WAF Fraud
     *        Control account takeover prevention (ATP) rule group</a> and <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html">WAF Fraud Control account
     *        takeover prevention (ATP)</a> in the <i>WAF Developer Guide</i>.
     */

    public void setAWSManagedRulesATPRuleSet(AWSManagedRulesATPRuleSet aWSManagedRulesATPRuleSet) {
        this.aWSManagedRulesATPRuleSet = aWSManagedRulesATPRuleSet;
    }

    /**
     * <p>
     * Additional configuration for using the account takeover prevention (ATP) managed rule group,
     * <code>AWSManagedRulesATPRuleSet</code>. Use this to provide login request information to the rule group. For web
     * ACLs that protect CloudFront distributions, use this to also provide the information about how your distribution
     * responds to login requests.
     * </p>
     * <p>
     * This configuration replaces the individual configuration fields in <code>ManagedRuleGroupConfig</code> and
     * provides additional feature configuration.
     * </p>
     * <p>
     * For information about using the ATP managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html">WAF Fraud Control
     * account takeover prevention (ATP) rule group</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html">WAF Fraud Control account takeover
     * prevention (ATP)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @return Additional configuration for using the account takeover prevention (ATP) managed rule group,
     *         <code>AWSManagedRulesATPRuleSet</code>. Use this to provide login request information to the rule group.
     *         For web ACLs that protect CloudFront distributions, use this to also provide the information about how
     *         your distribution responds to login requests. </p>
     *         <p>
     *         This configuration replaces the individual configuration fields in <code>ManagedRuleGroupConfig</code>
     *         and provides additional feature configuration.
     *         </p>
     *         <p>
     *         For information about using the ATP managed rule group, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html">WAF Fraud
     *         Control account takeover prevention (ATP) rule group</a> and <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html">WAF Fraud Control account
     *         takeover prevention (ATP)</a> in the <i>WAF Developer Guide</i>.
     */

    public AWSManagedRulesATPRuleSet getAWSManagedRulesATPRuleSet() {
        return this.aWSManagedRulesATPRuleSet;
    }

    /**
     * <p>
     * Additional configuration for using the account takeover prevention (ATP) managed rule group,
     * <code>AWSManagedRulesATPRuleSet</code>. Use this to provide login request information to the rule group. For web
     * ACLs that protect CloudFront distributions, use this to also provide the information about how your distribution
     * responds to login requests.
     * </p>
     * <p>
     * This configuration replaces the individual configuration fields in <code>ManagedRuleGroupConfig</code> and
     * provides additional feature configuration.
     * </p>
     * <p>
     * For information about using the ATP managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html">WAF Fraud Control
     * account takeover prevention (ATP) rule group</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html">WAF Fraud Control account takeover
     * prevention (ATP)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param aWSManagedRulesATPRuleSet
     *        Additional configuration for using the account takeover prevention (ATP) managed rule group,
     *        <code>AWSManagedRulesATPRuleSet</code>. Use this to provide login request information to the rule group.
     *        For web ACLs that protect CloudFront distributions, use this to also provide the information about how
     *        your distribution responds to login requests. </p>
     *        <p>
     *        This configuration replaces the individual configuration fields in <code>ManagedRuleGroupConfig</code> and
     *        provides additional feature configuration.
     *        </p>
     *        <p>
     *        For information about using the ATP managed rule group, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-atp.html">WAF Fraud
     *        Control account takeover prevention (ATP) rule group</a> and <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-atp.html">WAF Fraud Control account
     *        takeover prevention (ATP)</a> in the <i>WAF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupConfig withAWSManagedRulesATPRuleSet(AWSManagedRulesATPRuleSet aWSManagedRulesATPRuleSet) {
        setAWSManagedRulesATPRuleSet(aWSManagedRulesATPRuleSet);
        return this;
    }

    /**
     * <p>
     * Additional configuration for using the account creation fraud prevention (ACFP) managed rule group,
     * <code>AWSManagedRulesACFPRuleSet</code>. Use this to provide account creation request information to the rule
     * group. For web ACLs that protect CloudFront distributions, use this to also provide the information about how
     * your distribution responds to account creation requests.
     * </p>
     * <p>
     * For information about using the ACFP managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html">WAF Fraud Control
     * account creation fraud prevention (ACFP) rule group</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html">WAF Fraud Control account creation
     * fraud prevention (ACFP)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param aWSManagedRulesACFPRuleSet
     *        Additional configuration for using the account creation fraud prevention (ACFP) managed rule group,
     *        <code>AWSManagedRulesACFPRuleSet</code>. Use this to provide account creation request information to the
     *        rule group. For web ACLs that protect CloudFront distributions, use this to also provide the information
     *        about how your distribution responds to account creation requests. </p>
     *        <p>
     *        For information about using the ACFP managed rule group, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html">WAF Fraud
     *        Control account creation fraud prevention (ACFP) rule group</a> and <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html">WAF Fraud Control account
     *        creation fraud prevention (ACFP)</a> in the <i>WAF Developer Guide</i>.
     */

    public void setAWSManagedRulesACFPRuleSet(AWSManagedRulesACFPRuleSet aWSManagedRulesACFPRuleSet) {
        this.aWSManagedRulesACFPRuleSet = aWSManagedRulesACFPRuleSet;
    }

    /**
     * <p>
     * Additional configuration for using the account creation fraud prevention (ACFP) managed rule group,
     * <code>AWSManagedRulesACFPRuleSet</code>. Use this to provide account creation request information to the rule
     * group. For web ACLs that protect CloudFront distributions, use this to also provide the information about how
     * your distribution responds to account creation requests.
     * </p>
     * <p>
     * For information about using the ACFP managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html">WAF Fraud Control
     * account creation fraud prevention (ACFP) rule group</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html">WAF Fraud Control account creation
     * fraud prevention (ACFP)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @return Additional configuration for using the account creation fraud prevention (ACFP) managed rule group,
     *         <code>AWSManagedRulesACFPRuleSet</code>. Use this to provide account creation request information to the
     *         rule group. For web ACLs that protect CloudFront distributions, use this to also provide the information
     *         about how your distribution responds to account creation requests. </p>
     *         <p>
     *         For information about using the ACFP managed rule group, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html">WAF Fraud
     *         Control account creation fraud prevention (ACFP) rule group</a> and <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html">WAF Fraud Control account
     *         creation fraud prevention (ACFP)</a> in the <i>WAF Developer Guide</i>.
     */

    public AWSManagedRulesACFPRuleSet getAWSManagedRulesACFPRuleSet() {
        return this.aWSManagedRulesACFPRuleSet;
    }

    /**
     * <p>
     * Additional configuration for using the account creation fraud prevention (ACFP) managed rule group,
     * <code>AWSManagedRulesACFPRuleSet</code>. Use this to provide account creation request information to the rule
     * group. For web ACLs that protect CloudFront distributions, use this to also provide the information about how
     * your distribution responds to account creation requests.
     * </p>
     * <p>
     * For information about using the ACFP managed rule group, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html">WAF Fraud Control
     * account creation fraud prevention (ACFP) rule group</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html">WAF Fraud Control account creation
     * fraud prevention (ACFP)</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param aWSManagedRulesACFPRuleSet
     *        Additional configuration for using the account creation fraud prevention (ACFP) managed rule group,
     *        <code>AWSManagedRulesACFPRuleSet</code>. Use this to provide account creation request information to the
     *        rule group. For web ACLs that protect CloudFront distributions, use this to also provide the information
     *        about how your distribution responds to account creation requests. </p>
     *        <p>
     *        For information about using the ACFP managed rule group, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-acfp.html">WAF Fraud
     *        Control account creation fraud prevention (ACFP) rule group</a> and <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-acfp.html">WAF Fraud Control account
     *        creation fraud prevention (ACFP)</a> in the <i>WAF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupConfig withAWSManagedRulesACFPRuleSet(AWSManagedRulesACFPRuleSet aWSManagedRulesACFPRuleSet) {
        setAWSManagedRulesACFPRuleSet(aWSManagedRulesACFPRuleSet);
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
        if (getLoginPath() != null)
            sb.append("LoginPath: ").append(getLoginPath()).append(",");
        if (getPayloadType() != null)
            sb.append("PayloadType: ").append(getPayloadType()).append(",");
        if (getUsernameField() != null)
            sb.append("UsernameField: ").append(getUsernameField()).append(",");
        if (getPasswordField() != null)
            sb.append("PasswordField: ").append(getPasswordField()).append(",");
        if (getAWSManagedRulesBotControlRuleSet() != null)
            sb.append("AWSManagedRulesBotControlRuleSet: ").append(getAWSManagedRulesBotControlRuleSet()).append(",");
        if (getAWSManagedRulesATPRuleSet() != null)
            sb.append("AWSManagedRulesATPRuleSet: ").append(getAWSManagedRulesATPRuleSet()).append(",");
        if (getAWSManagedRulesACFPRuleSet() != null)
            sb.append("AWSManagedRulesACFPRuleSet: ").append(getAWSManagedRulesACFPRuleSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedRuleGroupConfig == false)
            return false;
        ManagedRuleGroupConfig other = (ManagedRuleGroupConfig) obj;
        if (other.getLoginPath() == null ^ this.getLoginPath() == null)
            return false;
        if (other.getLoginPath() != null && other.getLoginPath().equals(this.getLoginPath()) == false)
            return false;
        if (other.getPayloadType() == null ^ this.getPayloadType() == null)
            return false;
        if (other.getPayloadType() != null && other.getPayloadType().equals(this.getPayloadType()) == false)
            return false;
        if (other.getUsernameField() == null ^ this.getUsernameField() == null)
            return false;
        if (other.getUsernameField() != null && other.getUsernameField().equals(this.getUsernameField()) == false)
            return false;
        if (other.getPasswordField() == null ^ this.getPasswordField() == null)
            return false;
        if (other.getPasswordField() != null && other.getPasswordField().equals(this.getPasswordField()) == false)
            return false;
        if (other.getAWSManagedRulesBotControlRuleSet() == null ^ this.getAWSManagedRulesBotControlRuleSet() == null)
            return false;
        if (other.getAWSManagedRulesBotControlRuleSet() != null
                && other.getAWSManagedRulesBotControlRuleSet().equals(this.getAWSManagedRulesBotControlRuleSet()) == false)
            return false;
        if (other.getAWSManagedRulesATPRuleSet() == null ^ this.getAWSManagedRulesATPRuleSet() == null)
            return false;
        if (other.getAWSManagedRulesATPRuleSet() != null && other.getAWSManagedRulesATPRuleSet().equals(this.getAWSManagedRulesATPRuleSet()) == false)
            return false;
        if (other.getAWSManagedRulesACFPRuleSet() == null ^ this.getAWSManagedRulesACFPRuleSet() == null)
            return false;
        if (other.getAWSManagedRulesACFPRuleSet() != null && other.getAWSManagedRulesACFPRuleSet().equals(this.getAWSManagedRulesACFPRuleSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoginPath() == null) ? 0 : getLoginPath().hashCode());
        hashCode = prime * hashCode + ((getPayloadType() == null) ? 0 : getPayloadType().hashCode());
        hashCode = prime * hashCode + ((getUsernameField() == null) ? 0 : getUsernameField().hashCode());
        hashCode = prime * hashCode + ((getPasswordField() == null) ? 0 : getPasswordField().hashCode());
        hashCode = prime * hashCode + ((getAWSManagedRulesBotControlRuleSet() == null) ? 0 : getAWSManagedRulesBotControlRuleSet().hashCode());
        hashCode = prime * hashCode + ((getAWSManagedRulesATPRuleSet() == null) ? 0 : getAWSManagedRulesATPRuleSet().hashCode());
        hashCode = prime * hashCode + ((getAWSManagedRulesACFPRuleSet() == null) ? 0 : getAWSManagedRulesACFPRuleSet().hashCode());
        return hashCode;
    }

    @Override
    public ManagedRuleGroupConfig clone() {
        try {
            return (ManagedRuleGroupConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ManagedRuleGroupConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
