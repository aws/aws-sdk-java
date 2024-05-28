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
 * Details for your use of the account takeover prevention managed rule group, <code>AWSManagedRulesATPRuleSet</code>.
 * This configuration is used in <code>ManagedRuleGroupConfig</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AWSManagedRulesATPRuleSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSManagedRulesATPRuleSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the login endpoint for your application. For example, for the URL
     * <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>. Login paths that
     * start with the path that you provide are considered a match. For example <code>/web/login</code> matches the
     * login paths <code>/web/login</code>, <code>/web/login/</code>, <code>/web/loginPage</code>, and
     * <code>/web/login/thisPage</code>, but doesn't match the login path <code>/home/web/login</code> or
     * <code>/website/login</code>.
     * </p>
     * <p>
     * The rule group inspects only HTTP <code>POST</code> requests to your specified login endpoint.
     * </p>
     */
    private String loginPath;
    /**
     * <p>
     * The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage.
     * </p>
     */
    private RequestInspection requestInspection;
    /**
     * <p>
     * The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure rates.
     * </p>
     * <note>
     * <p>
     * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     * </p>
     * </note>
     * <p>
     * The ATP rule group evaluates the responses that your protected resources send back to client login attempts,
     * keeping count of successful and failed attempts for each IP address and client session. Using this information,
     * the rule group labels and mitigates requests from client sessions and IP addresses that have had too many failed
     * login attempts in a short amount of time.
     * </p>
     */
    private ResponseInspection responseInspection;
    /**
     * <p>
     * Allow the use of regular expressions in the login page path.
     * </p>
     */
    private Boolean enableRegexInPath;

    /**
     * <p>
     * The path of the login endpoint for your application. For example, for the URL
     * <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>. Login paths that
     * start with the path that you provide are considered a match. For example <code>/web/login</code> matches the
     * login paths <code>/web/login</code>, <code>/web/login/</code>, <code>/web/loginPage</code>, and
     * <code>/web/login/thisPage</code>, but doesn't match the login path <code>/home/web/login</code> or
     * <code>/website/login</code>.
     * </p>
     * <p>
     * The rule group inspects only HTTP <code>POST</code> requests to your specified login endpoint.
     * </p>
     * 
     * @param loginPath
     *        The path of the login endpoint for your application. For example, for the URL
     *        <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>. Login
     *        paths that start with the path that you provide are considered a match. For example
     *        <code>/web/login</code> matches the login paths <code>/web/login</code>, <code>/web/login/</code>,
     *        <code>/web/loginPage</code>, and <code>/web/login/thisPage</code>, but doesn't match the login path
     *        <code>/home/web/login</code> or <code>/website/login</code>.</p>
     *        <p>
     *        The rule group inspects only HTTP <code>POST</code> requests to your specified login endpoint.
     */

    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath;
    }

    /**
     * <p>
     * The path of the login endpoint for your application. For example, for the URL
     * <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>. Login paths that
     * start with the path that you provide are considered a match. For example <code>/web/login</code> matches the
     * login paths <code>/web/login</code>, <code>/web/login/</code>, <code>/web/loginPage</code>, and
     * <code>/web/login/thisPage</code>, but doesn't match the login path <code>/home/web/login</code> or
     * <code>/website/login</code>.
     * </p>
     * <p>
     * The rule group inspects only HTTP <code>POST</code> requests to your specified login endpoint.
     * </p>
     * 
     * @return The path of the login endpoint for your application. For example, for the URL
     *         <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>. Login
     *         paths that start with the path that you provide are considered a match. For example
     *         <code>/web/login</code> matches the login paths <code>/web/login</code>, <code>/web/login/</code>,
     *         <code>/web/loginPage</code>, and <code>/web/login/thisPage</code>, but doesn't match the login path
     *         <code>/home/web/login</code> or <code>/website/login</code>.</p>
     *         <p>
     *         The rule group inspects only HTTP <code>POST</code> requests to your specified login endpoint.
     */

    public String getLoginPath() {
        return this.loginPath;
    }

    /**
     * <p>
     * The path of the login endpoint for your application. For example, for the URL
     * <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>. Login paths that
     * start with the path that you provide are considered a match. For example <code>/web/login</code> matches the
     * login paths <code>/web/login</code>, <code>/web/login/</code>, <code>/web/loginPage</code>, and
     * <code>/web/login/thisPage</code>, but doesn't match the login path <code>/home/web/login</code> or
     * <code>/website/login</code>.
     * </p>
     * <p>
     * The rule group inspects only HTTP <code>POST</code> requests to your specified login endpoint.
     * </p>
     * 
     * @param loginPath
     *        The path of the login endpoint for your application. For example, for the URL
     *        <code>https://example.com/web/login</code>, you would provide the path <code>/web/login</code>. Login
     *        paths that start with the path that you provide are considered a match. For example
     *        <code>/web/login</code> matches the login paths <code>/web/login</code>, <code>/web/login/</code>,
     *        <code>/web/loginPage</code>, and <code>/web/login/thisPage</code>, but doesn't match the login path
     *        <code>/home/web/login</code> or <code>/website/login</code>.</p>
     *        <p>
     *        The rule group inspects only HTTP <code>POST</code> requests to your specified login endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesATPRuleSet withLoginPath(String loginPath) {
        setLoginPath(loginPath);
        return this;
    }

    /**
     * <p>
     * The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage.
     * </p>
     * 
     * @param requestInspection
     *        The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage.
     */

    public void setRequestInspection(RequestInspection requestInspection) {
        this.requestInspection = requestInspection;
    }

    /**
     * <p>
     * The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage.
     * </p>
     * 
     * @return The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage.
     */

    public RequestInspection getRequestInspection() {
        return this.requestInspection;
    }

    /**
     * <p>
     * The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage.
     * </p>
     * 
     * @param requestInspection
     *        The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesATPRuleSet withRequestInspection(RequestInspection requestInspection) {
        setRequestInspection(requestInspection);
        return this;
    }

    /**
     * <p>
     * The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure rates.
     * </p>
     * <note>
     * <p>
     * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     * </p>
     * </note>
     * <p>
     * The ATP rule group evaluates the responses that your protected resources send back to client login attempts,
     * keeping count of successful and failed attempts for each IP address and client session. Using this information,
     * the rule group labels and mitigates requests from client sessions and IP addresses that have had too many failed
     * login attempts in a short amount of time.
     * </p>
     * 
     * @param responseInspection
     *        The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure
     *        rates. </p> <note>
     *        <p>
     *        Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     *        </p>
     *        </note>
     *        <p>
     *        The ATP rule group evaluates the responses that your protected resources send back to client login
     *        attempts, keeping count of successful and failed attempts for each IP address and client session. Using
     *        this information, the rule group labels and mitigates requests from client sessions and IP addresses that
     *        have had too many failed login attempts in a short amount of time.
     */

    public void setResponseInspection(ResponseInspection responseInspection) {
        this.responseInspection = responseInspection;
    }

    /**
     * <p>
     * The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure rates.
     * </p>
     * <note>
     * <p>
     * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     * </p>
     * </note>
     * <p>
     * The ATP rule group evaluates the responses that your protected resources send back to client login attempts,
     * keeping count of successful and failed attempts for each IP address and client session. Using this information,
     * the rule group labels and mitigates requests from client sessions and IP addresses that have had too many failed
     * login attempts in a short amount of time.
     * </p>
     * 
     * @return The criteria for inspecting responses to login requests, used by the ATP rule group to track login
     *         failure rates. </p> <note>
     *         <p>
     *         Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     *         </p>
     *         </note>
     *         <p>
     *         The ATP rule group evaluates the responses that your protected resources send back to client login
     *         attempts, keeping count of successful and failed attempts for each IP address and client session. Using
     *         this information, the rule group labels and mitigates requests from client sessions and IP addresses that
     *         have had too many failed login attempts in a short amount of time.
     */

    public ResponseInspection getResponseInspection() {
        return this.responseInspection;
    }

    /**
     * <p>
     * The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure rates.
     * </p>
     * <note>
     * <p>
     * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     * </p>
     * </note>
     * <p>
     * The ATP rule group evaluates the responses that your protected resources send back to client login attempts,
     * keeping count of successful and failed attempts for each IP address and client session. Using this information,
     * the rule group labels and mitigates requests from client sessions and IP addresses that have had too many failed
     * login attempts in a short amount of time.
     * </p>
     * 
     * @param responseInspection
     *        The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure
     *        rates. </p> <note>
     *        <p>
     *        Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     *        </p>
     *        </note>
     *        <p>
     *        The ATP rule group evaluates the responses that your protected resources send back to client login
     *        attempts, keeping count of successful and failed attempts for each IP address and client session. Using
     *        this information, the rule group labels and mitigates requests from client sessions and IP addresses that
     *        have had too many failed login attempts in a short amount of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesATPRuleSet withResponseInspection(ResponseInspection responseInspection) {
        setResponseInspection(responseInspection);
        return this;
    }

    /**
     * <p>
     * Allow the use of regular expressions in the login page path.
     * </p>
     * 
     * @param enableRegexInPath
     *        Allow the use of regular expressions in the login page path.
     */

    public void setEnableRegexInPath(Boolean enableRegexInPath) {
        this.enableRegexInPath = enableRegexInPath;
    }

    /**
     * <p>
     * Allow the use of regular expressions in the login page path.
     * </p>
     * 
     * @return Allow the use of regular expressions in the login page path.
     */

    public Boolean getEnableRegexInPath() {
        return this.enableRegexInPath;
    }

    /**
     * <p>
     * Allow the use of regular expressions in the login page path.
     * </p>
     * 
     * @param enableRegexInPath
     *        Allow the use of regular expressions in the login page path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesATPRuleSet withEnableRegexInPath(Boolean enableRegexInPath) {
        setEnableRegexInPath(enableRegexInPath);
        return this;
    }

    /**
     * <p>
     * Allow the use of regular expressions in the login page path.
     * </p>
     * 
     * @return Allow the use of regular expressions in the login page path.
     */

    public Boolean isEnableRegexInPath() {
        return this.enableRegexInPath;
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
        if (getRequestInspection() != null)
            sb.append("RequestInspection: ").append(getRequestInspection()).append(",");
        if (getResponseInspection() != null)
            sb.append("ResponseInspection: ").append(getResponseInspection()).append(",");
        if (getEnableRegexInPath() != null)
            sb.append("EnableRegexInPath: ").append(getEnableRegexInPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AWSManagedRulesATPRuleSet == false)
            return false;
        AWSManagedRulesATPRuleSet other = (AWSManagedRulesATPRuleSet) obj;
        if (other.getLoginPath() == null ^ this.getLoginPath() == null)
            return false;
        if (other.getLoginPath() != null && other.getLoginPath().equals(this.getLoginPath()) == false)
            return false;
        if (other.getRequestInspection() == null ^ this.getRequestInspection() == null)
            return false;
        if (other.getRequestInspection() != null && other.getRequestInspection().equals(this.getRequestInspection()) == false)
            return false;
        if (other.getResponseInspection() == null ^ this.getResponseInspection() == null)
            return false;
        if (other.getResponseInspection() != null && other.getResponseInspection().equals(this.getResponseInspection()) == false)
            return false;
        if (other.getEnableRegexInPath() == null ^ this.getEnableRegexInPath() == null)
            return false;
        if (other.getEnableRegexInPath() != null && other.getEnableRegexInPath().equals(this.getEnableRegexInPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoginPath() == null) ? 0 : getLoginPath().hashCode());
        hashCode = prime * hashCode + ((getRequestInspection() == null) ? 0 : getRequestInspection().hashCode());
        hashCode = prime * hashCode + ((getResponseInspection() == null) ? 0 : getResponseInspection().hashCode());
        hashCode = prime * hashCode + ((getEnableRegexInPath() == null) ? 0 : getEnableRegexInPath().hashCode());
        return hashCode;
    }

    @Override
    public AWSManagedRulesATPRuleSet clone() {
        try {
            return (AWSManagedRulesATPRuleSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.AWSManagedRulesATPRuleSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
