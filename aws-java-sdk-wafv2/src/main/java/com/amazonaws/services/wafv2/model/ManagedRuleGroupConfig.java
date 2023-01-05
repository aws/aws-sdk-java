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
 * Use the <code>AWSManagedRulesBotControlRuleSet</code> configuration object to configure the protection level that you
 * want the Bot Control rule group to use.
 * </p>
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
     * <p>
     * The path of the login endpoint for your application. For example, for the URL
     * <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>.
     * </p>
     */
    private String loginPath;
    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     */
    private String payloadType;
    /**
     * <p>
     * Details about your login page username field.
     * </p>
     */
    private UsernameField usernameField;
    /**
     * <p>
     * Details about your login page password field.
     * </p>
     */
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
     * The path of the login endpoint for your application. For example, for the URL
     * <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>.
     * </p>
     * 
     * @param loginPath
     *        The path of the login endpoint for your application. For example, for the URL
     *        <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>.
     */

    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath;
    }

    /**
     * <p>
     * The path of the login endpoint for your application. For example, for the URL
     * <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>.
     * </p>
     * 
     * @return The path of the login endpoint for your application. For example, for the URL
     *         <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>.
     */

    public String getLoginPath() {
        return this.loginPath;
    }

    /**
     * <p>
     * The path of the login endpoint for your application. For example, for the URL
     * <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>.
     * </p>
     * 
     * @param loginPath
     *        The path of the login endpoint for your application. For example, for the URL
     *        <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupConfig withLoginPath(String loginPath) {
        setLoginPath(loginPath);
        return this;
    }

    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your login endpoint, either JSON or form encoded.
     * @see PayloadType
     */

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     * 
     * @return The payload type for your login endpoint, either JSON or form encoded.
     * @see PayloadType
     */

    public String getPayloadType() {
        return this.payloadType;
    }

    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your login endpoint, either JSON or form encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */

    public ManagedRuleGroupConfig withPayloadType(String payloadType) {
        setPayloadType(payloadType);
        return this;
    }

    /**
     * <p>
     * The payload type for your login endpoint, either JSON or form encoded.
     * </p>
     * 
     * @param payloadType
     *        The payload type for your login endpoint, either JSON or form encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayloadType
     */

    public ManagedRuleGroupConfig withPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType.toString();
        return this;
    }

    /**
     * <p>
     * Details about your login page username field.
     * </p>
     * 
     * @param usernameField
     *        Details about your login page username field.
     */

    public void setUsernameField(UsernameField usernameField) {
        this.usernameField = usernameField;
    }

    /**
     * <p>
     * Details about your login page username field.
     * </p>
     * 
     * @return Details about your login page username field.
     */

    public UsernameField getUsernameField() {
        return this.usernameField;
    }

    /**
     * <p>
     * Details about your login page username field.
     * </p>
     * 
     * @param usernameField
     *        Details about your login page username field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedRuleGroupConfig withUsernameField(UsernameField usernameField) {
        setUsernameField(usernameField);
        return this;
    }

    /**
     * <p>
     * Details about your login page password field.
     * </p>
     * 
     * @param passwordField
     *        Details about your login page password field.
     */

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    /**
     * <p>
     * Details about your login page password field.
     * </p>
     * 
     * @return Details about your login page password field.
     */

    public PasswordField getPasswordField() {
        return this.passwordField;
    }

    /**
     * <p>
     * Details about your login page password field.
     * </p>
     * 
     * @param passwordField
     *        Details about your login page password field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

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
            sb.append("AWSManagedRulesBotControlRuleSet: ").append(getAWSManagedRulesBotControlRuleSet());
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
