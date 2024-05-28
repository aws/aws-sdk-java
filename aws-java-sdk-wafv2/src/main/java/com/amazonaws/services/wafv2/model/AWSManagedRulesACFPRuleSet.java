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
 * Details for your use of the account creation fraud prevention managed rule group,
 * <code>AWSManagedRulesACFPRuleSet</code>. This configuration is used in <code>ManagedRuleGroupConfig</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AWSManagedRulesACFPRuleSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSManagedRulesACFPRuleSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the account creation endpoint for your application. This is the page on your website that accepts the
     * completed registration form for a new user. This page must accept <code>POST</code> requests.
     * </p>
     * <p>
     * For example, for the URL <code>https://example.com/web/newaccount</code>, you would provide the path
     * <code>/web/newaccount</code>. Account creation page paths that start with the path that you provide are
     * considered a match. For example <code>/web/newaccount</code> matches the account creation paths
     * <code>/web/newaccount</code>, <code>/web/newaccount/</code>, <code>/web/newaccountPage</code>, and
     * <code>/web/newaccount/thisPage</code>, but doesn't match the path <code>/home/web/newaccount</code> or
     * <code>/website/newaccount</code>.
     * </p>
     */
    private String creationPath;
    /**
     * <p>
     * The path of the account registration endpoint for your application. This is the page on your website that
     * presents the registration form to new users.
     * </p>
     * <note>
     * <p>
     * This page must accept <code>GET</code> text/html requests.
     * </p>
     * </note>
     * <p>
     * For example, for the URL <code>https://example.com/web/registration</code>, you would provide the path
     * <code>/web/registration</code>. Registration page paths that start with the path that you provide are considered
     * a match. For example <code>/web/registration</code> matches the registration paths <code>/web/registration</code>, <code>/web/registration/</code>, <code>/web/registrationPage</code>, and
     * <code>/web/registration/thisPage</code>, but doesn't match the path <code>/home/web/registration</code> or
     * <code>/website/registration</code>.
     * </p>
     */
    private String registrationPagePath;
    /**
     * <p>
     * The criteria for inspecting account creation requests, used by the ACFP rule group to validate and track account
     * creation attempts.
     * </p>
     */
    private RequestInspectionACFP requestInspection;
    /**
     * <p>
     * The criteria for inspecting responses to account creation requests, used by the ACFP rule group to track account
     * creation success rates.
     * </p>
     * <note>
     * <p>
     * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     * </p>
     * </note>
     * <p>
     * The ACFP rule group evaluates the responses that your protected resources send back to client account creation
     * attempts, keeping count of successful and failed attempts from each IP address and client session. Using this
     * information, the rule group labels and mitigates requests from client sessions and IP addresses that have had too
     * many successful account creation attempts in a short amount of time.
     * </p>
     */
    private ResponseInspection responseInspection;
    /**
     * <p>
     * Allow the use of regular expressions in the registration page path and the account creation path.
     * </p>
     */
    private Boolean enableRegexInPath;

    /**
     * <p>
     * The path of the account creation endpoint for your application. This is the page on your website that accepts the
     * completed registration form for a new user. This page must accept <code>POST</code> requests.
     * </p>
     * <p>
     * For example, for the URL <code>https://example.com/web/newaccount</code>, you would provide the path
     * <code>/web/newaccount</code>. Account creation page paths that start with the path that you provide are
     * considered a match. For example <code>/web/newaccount</code> matches the account creation paths
     * <code>/web/newaccount</code>, <code>/web/newaccount/</code>, <code>/web/newaccountPage</code>, and
     * <code>/web/newaccount/thisPage</code>, but doesn't match the path <code>/home/web/newaccount</code> or
     * <code>/website/newaccount</code>.
     * </p>
     * 
     * @param creationPath
     *        The path of the account creation endpoint for your application. This is the page on your website that
     *        accepts the completed registration form for a new user. This page must accept <code>POST</code>
     *        requests.</p>
     *        <p>
     *        For example, for the URL <code>https://example.com/web/newaccount</code>, you would provide the path
     *        <code>/web/newaccount</code>. Account creation page paths that start with the path that you provide are
     *        considered a match. For example <code>/web/newaccount</code> matches the account creation paths
     *        <code>/web/newaccount</code>, <code>/web/newaccount/</code>, <code>/web/newaccountPage</code>, and
     *        <code>/web/newaccount/thisPage</code>, but doesn't match the path <code>/home/web/newaccount</code> or
     *        <code>/website/newaccount</code>.
     */

    public void setCreationPath(String creationPath) {
        this.creationPath = creationPath;
    }

    /**
     * <p>
     * The path of the account creation endpoint for your application. This is the page on your website that accepts the
     * completed registration form for a new user. This page must accept <code>POST</code> requests.
     * </p>
     * <p>
     * For example, for the URL <code>https://example.com/web/newaccount</code>, you would provide the path
     * <code>/web/newaccount</code>. Account creation page paths that start with the path that you provide are
     * considered a match. For example <code>/web/newaccount</code> matches the account creation paths
     * <code>/web/newaccount</code>, <code>/web/newaccount/</code>, <code>/web/newaccountPage</code>, and
     * <code>/web/newaccount/thisPage</code>, but doesn't match the path <code>/home/web/newaccount</code> or
     * <code>/website/newaccount</code>.
     * </p>
     * 
     * @return The path of the account creation endpoint for your application. This is the page on your website that
     *         accepts the completed registration form for a new user. This page must accept <code>POST</code>
     *         requests.</p>
     *         <p>
     *         For example, for the URL <code>https://example.com/web/newaccount</code>, you would provide the path
     *         <code>/web/newaccount</code>. Account creation page paths that start with the path that you provide are
     *         considered a match. For example <code>/web/newaccount</code> matches the account creation paths
     *         <code>/web/newaccount</code>, <code>/web/newaccount/</code>, <code>/web/newaccountPage</code>, and
     *         <code>/web/newaccount/thisPage</code>, but doesn't match the path <code>/home/web/newaccount</code> or
     *         <code>/website/newaccount</code>.
     */

    public String getCreationPath() {
        return this.creationPath;
    }

    /**
     * <p>
     * The path of the account creation endpoint for your application. This is the page on your website that accepts the
     * completed registration form for a new user. This page must accept <code>POST</code> requests.
     * </p>
     * <p>
     * For example, for the URL <code>https://example.com/web/newaccount</code>, you would provide the path
     * <code>/web/newaccount</code>. Account creation page paths that start with the path that you provide are
     * considered a match. For example <code>/web/newaccount</code> matches the account creation paths
     * <code>/web/newaccount</code>, <code>/web/newaccount/</code>, <code>/web/newaccountPage</code>, and
     * <code>/web/newaccount/thisPage</code>, but doesn't match the path <code>/home/web/newaccount</code> or
     * <code>/website/newaccount</code>.
     * </p>
     * 
     * @param creationPath
     *        The path of the account creation endpoint for your application. This is the page on your website that
     *        accepts the completed registration form for a new user. This page must accept <code>POST</code>
     *        requests.</p>
     *        <p>
     *        For example, for the URL <code>https://example.com/web/newaccount</code>, you would provide the path
     *        <code>/web/newaccount</code>. Account creation page paths that start with the path that you provide are
     *        considered a match. For example <code>/web/newaccount</code> matches the account creation paths
     *        <code>/web/newaccount</code>, <code>/web/newaccount/</code>, <code>/web/newaccountPage</code>, and
     *        <code>/web/newaccount/thisPage</code>, but doesn't match the path <code>/home/web/newaccount</code> or
     *        <code>/website/newaccount</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesACFPRuleSet withCreationPath(String creationPath) {
        setCreationPath(creationPath);
        return this;
    }

    /**
     * <p>
     * The path of the account registration endpoint for your application. This is the page on your website that
     * presents the registration form to new users.
     * </p>
     * <note>
     * <p>
     * This page must accept <code>GET</code> text/html requests.
     * </p>
     * </note>
     * <p>
     * For example, for the URL <code>https://example.com/web/registration</code>, you would provide the path
     * <code>/web/registration</code>. Registration page paths that start with the path that you provide are considered
     * a match. For example <code>/web/registration</code> matches the registration paths <code>/web/registration</code>, <code>/web/registration/</code>, <code>/web/registrationPage</code>, and
     * <code>/web/registration/thisPage</code>, but doesn't match the path <code>/home/web/registration</code> or
     * <code>/website/registration</code>.
     * </p>
     * 
     * @param registrationPagePath
     *        The path of the account registration endpoint for your application. This is the page on your website that
     *        presents the registration form to new users. </p> <note>
     *        <p>
     *        This page must accept <code>GET</code> text/html requests.
     *        </p>
     *        </note>
     *        <p>
     *        For example, for the URL <code>https://example.com/web/registration</code>, you would provide the path
     *        <code>/web/registration</code>. Registration page paths that start with the path that you provide are
     *        considered a match. For example <code>/web/registration</code> matches the registration paths
     *        <code>/web/registration</code>, <code>/web/registration/</code>, <code>/web/registrationPage</code>, and
     *        <code>/web/registration/thisPage</code>, but doesn't match the path <code>/home/web/registration</code> or
     *        <code>/website/registration</code>.
     */

    public void setRegistrationPagePath(String registrationPagePath) {
        this.registrationPagePath = registrationPagePath;
    }

    /**
     * <p>
     * The path of the account registration endpoint for your application. This is the page on your website that
     * presents the registration form to new users.
     * </p>
     * <note>
     * <p>
     * This page must accept <code>GET</code> text/html requests.
     * </p>
     * </note>
     * <p>
     * For example, for the URL <code>https://example.com/web/registration</code>, you would provide the path
     * <code>/web/registration</code>. Registration page paths that start with the path that you provide are considered
     * a match. For example <code>/web/registration</code> matches the registration paths <code>/web/registration</code>, <code>/web/registration/</code>, <code>/web/registrationPage</code>, and
     * <code>/web/registration/thisPage</code>, but doesn't match the path <code>/home/web/registration</code> or
     * <code>/website/registration</code>.
     * </p>
     * 
     * @return The path of the account registration endpoint for your application. This is the page on your website that
     *         presents the registration form to new users. </p> <note>
     *         <p>
     *         This page must accept <code>GET</code> text/html requests.
     *         </p>
     *         </note>
     *         <p>
     *         For example, for the URL <code>https://example.com/web/registration</code>, you would provide the path
     *         <code>/web/registration</code>. Registration page paths that start with the path that you provide are
     *         considered a match. For example <code>/web/registration</code> matches the registration paths
     *         <code>/web/registration</code>, <code>/web/registration/</code>, <code>/web/registrationPage</code>, and
     *         <code>/web/registration/thisPage</code>, but doesn't match the path <code>/home/web/registration</code>
     *         or <code>/website/registration</code>.
     */

    public String getRegistrationPagePath() {
        return this.registrationPagePath;
    }

    /**
     * <p>
     * The path of the account registration endpoint for your application. This is the page on your website that
     * presents the registration form to new users.
     * </p>
     * <note>
     * <p>
     * This page must accept <code>GET</code> text/html requests.
     * </p>
     * </note>
     * <p>
     * For example, for the URL <code>https://example.com/web/registration</code>, you would provide the path
     * <code>/web/registration</code>. Registration page paths that start with the path that you provide are considered
     * a match. For example <code>/web/registration</code> matches the registration paths <code>/web/registration</code>, <code>/web/registration/</code>, <code>/web/registrationPage</code>, and
     * <code>/web/registration/thisPage</code>, but doesn't match the path <code>/home/web/registration</code> or
     * <code>/website/registration</code>.
     * </p>
     * 
     * @param registrationPagePath
     *        The path of the account registration endpoint for your application. This is the page on your website that
     *        presents the registration form to new users. </p> <note>
     *        <p>
     *        This page must accept <code>GET</code> text/html requests.
     *        </p>
     *        </note>
     *        <p>
     *        For example, for the URL <code>https://example.com/web/registration</code>, you would provide the path
     *        <code>/web/registration</code>. Registration page paths that start with the path that you provide are
     *        considered a match. For example <code>/web/registration</code> matches the registration paths
     *        <code>/web/registration</code>, <code>/web/registration/</code>, <code>/web/registrationPage</code>, and
     *        <code>/web/registration/thisPage</code>, but doesn't match the path <code>/home/web/registration</code> or
     *        <code>/website/registration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesACFPRuleSet withRegistrationPagePath(String registrationPagePath) {
        setRegistrationPagePath(registrationPagePath);
        return this;
    }

    /**
     * <p>
     * The criteria for inspecting account creation requests, used by the ACFP rule group to validate and track account
     * creation attempts.
     * </p>
     * 
     * @param requestInspection
     *        The criteria for inspecting account creation requests, used by the ACFP rule group to validate and track
     *        account creation attempts.
     */

    public void setRequestInspection(RequestInspectionACFP requestInspection) {
        this.requestInspection = requestInspection;
    }

    /**
     * <p>
     * The criteria for inspecting account creation requests, used by the ACFP rule group to validate and track account
     * creation attempts.
     * </p>
     * 
     * @return The criteria for inspecting account creation requests, used by the ACFP rule group to validate and track
     *         account creation attempts.
     */

    public RequestInspectionACFP getRequestInspection() {
        return this.requestInspection;
    }

    /**
     * <p>
     * The criteria for inspecting account creation requests, used by the ACFP rule group to validate and track account
     * creation attempts.
     * </p>
     * 
     * @param requestInspection
     *        The criteria for inspecting account creation requests, used by the ACFP rule group to validate and track
     *        account creation attempts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesACFPRuleSet withRequestInspection(RequestInspectionACFP requestInspection) {
        setRequestInspection(requestInspection);
        return this;
    }

    /**
     * <p>
     * The criteria for inspecting responses to account creation requests, used by the ACFP rule group to track account
     * creation success rates.
     * </p>
     * <note>
     * <p>
     * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     * </p>
     * </note>
     * <p>
     * The ACFP rule group evaluates the responses that your protected resources send back to client account creation
     * attempts, keeping count of successful and failed attempts from each IP address and client session. Using this
     * information, the rule group labels and mitigates requests from client sessions and IP addresses that have had too
     * many successful account creation attempts in a short amount of time.
     * </p>
     * 
     * @param responseInspection
     *        The criteria for inspecting responses to account creation requests, used by the ACFP rule group to track
     *        account creation success rates. </p> <note>
     *        <p>
     *        Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     *        </p>
     *        </note>
     *        <p>
     *        The ACFP rule group evaluates the responses that your protected resources send back to client account
     *        creation attempts, keeping count of successful and failed attempts from each IP address and client
     *        session. Using this information, the rule group labels and mitigates requests from client sessions and IP
     *        addresses that have had too many successful account creation attempts in a short amount of time.
     */

    public void setResponseInspection(ResponseInspection responseInspection) {
        this.responseInspection = responseInspection;
    }

    /**
     * <p>
     * The criteria for inspecting responses to account creation requests, used by the ACFP rule group to track account
     * creation success rates.
     * </p>
     * <note>
     * <p>
     * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     * </p>
     * </note>
     * <p>
     * The ACFP rule group evaluates the responses that your protected resources send back to client account creation
     * attempts, keeping count of successful and failed attempts from each IP address and client session. Using this
     * information, the rule group labels and mitigates requests from client sessions and IP addresses that have had too
     * many successful account creation attempts in a short amount of time.
     * </p>
     * 
     * @return The criteria for inspecting responses to account creation requests, used by the ACFP rule group to track
     *         account creation success rates. </p> <note>
     *         <p>
     *         Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     *         </p>
     *         </note>
     *         <p>
     *         The ACFP rule group evaluates the responses that your protected resources send back to client account
     *         creation attempts, keeping count of successful and failed attempts from each IP address and client
     *         session. Using this information, the rule group labels and mitigates requests from client sessions and IP
     *         addresses that have had too many successful account creation attempts in a short amount of time.
     */

    public ResponseInspection getResponseInspection() {
        return this.responseInspection;
    }

    /**
     * <p>
     * The criteria for inspecting responses to account creation requests, used by the ACFP rule group to track account
     * creation success rates.
     * </p>
     * <note>
     * <p>
     * Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     * </p>
     * </note>
     * <p>
     * The ACFP rule group evaluates the responses that your protected resources send back to client account creation
     * attempts, keeping count of successful and failed attempts from each IP address and client session. Using this
     * information, the rule group labels and mitigates requests from client sessions and IP addresses that have had too
     * many successful account creation attempts in a short amount of time.
     * </p>
     * 
     * @param responseInspection
     *        The criteria for inspecting responses to account creation requests, used by the ACFP rule group to track
     *        account creation success rates. </p> <note>
     *        <p>
     *        Response inspection is available only in web ACLs that protect Amazon CloudFront distributions.
     *        </p>
     *        </note>
     *        <p>
     *        The ACFP rule group evaluates the responses that your protected resources send back to client account
     *        creation attempts, keeping count of successful and failed attempts from each IP address and client
     *        session. Using this information, the rule group labels and mitigates requests from client sessions and IP
     *        addresses that have had too many successful account creation attempts in a short amount of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesACFPRuleSet withResponseInspection(ResponseInspection responseInspection) {
        setResponseInspection(responseInspection);
        return this;
    }

    /**
     * <p>
     * Allow the use of regular expressions in the registration page path and the account creation path.
     * </p>
     * 
     * @param enableRegexInPath
     *        Allow the use of regular expressions in the registration page path and the account creation path.
     */

    public void setEnableRegexInPath(Boolean enableRegexInPath) {
        this.enableRegexInPath = enableRegexInPath;
    }

    /**
     * <p>
     * Allow the use of regular expressions in the registration page path and the account creation path.
     * </p>
     * 
     * @return Allow the use of regular expressions in the registration page path and the account creation path.
     */

    public Boolean getEnableRegexInPath() {
        return this.enableRegexInPath;
    }

    /**
     * <p>
     * Allow the use of regular expressions in the registration page path and the account creation path.
     * </p>
     * 
     * @param enableRegexInPath
     *        Allow the use of regular expressions in the registration page path and the account creation path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSManagedRulesACFPRuleSet withEnableRegexInPath(Boolean enableRegexInPath) {
        setEnableRegexInPath(enableRegexInPath);
        return this;
    }

    /**
     * <p>
     * Allow the use of regular expressions in the registration page path and the account creation path.
     * </p>
     * 
     * @return Allow the use of regular expressions in the registration page path and the account creation path.
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
        if (getCreationPath() != null)
            sb.append("CreationPath: ").append(getCreationPath()).append(",");
        if (getRegistrationPagePath() != null)
            sb.append("RegistrationPagePath: ").append(getRegistrationPagePath()).append(",");
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

        if (obj instanceof AWSManagedRulesACFPRuleSet == false)
            return false;
        AWSManagedRulesACFPRuleSet other = (AWSManagedRulesACFPRuleSet) obj;
        if (other.getCreationPath() == null ^ this.getCreationPath() == null)
            return false;
        if (other.getCreationPath() != null && other.getCreationPath().equals(this.getCreationPath()) == false)
            return false;
        if (other.getRegistrationPagePath() == null ^ this.getRegistrationPagePath() == null)
            return false;
        if (other.getRegistrationPagePath() != null && other.getRegistrationPagePath().equals(this.getRegistrationPagePath()) == false)
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

        hashCode = prime * hashCode + ((getCreationPath() == null) ? 0 : getCreationPath().hashCode());
        hashCode = prime * hashCode + ((getRegistrationPagePath() == null) ? 0 : getRegistrationPagePath().hashCode());
        hashCode = prime * hashCode + ((getRequestInspection() == null) ? 0 : getRequestInspection().hashCode());
        hashCode = prime * hashCode + ((getResponseInspection() == null) ? 0 : getResponseInspection().hashCode());
        hashCode = prime * hashCode + ((getEnableRegexInPath() == null) ? 0 : getEnableRegexInPath().hashCode());
        return hashCode;
    }

    @Override
    public AWSManagedRulesACFPRuleSet clone() {
        try {
            return (AWSManagedRulesACFPRuleSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.AWSManagedRulesACFPRuleSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
