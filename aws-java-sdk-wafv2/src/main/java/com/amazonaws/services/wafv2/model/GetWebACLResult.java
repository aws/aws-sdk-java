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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetWebACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWebACLResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The web ACL specification. You can modify the settings in this web ACL and use it to update this web ACL or
     * create a new one.
     * </p>
     */
    private WebACL webACL;
    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     */
    private String lockToken;
    /**
     * <p>
     * The URL to use in SDK integrations with Amazon Web Services managed rule groups. For example, you can use the
     * integration SDKs with the account takeover prevention managed rule group <code>AWSManagedRulesATPRuleSet</code>.
     * This is only populated if you are using a rule group in your web ACL that integrates with your applications in
     * this way. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     */
    private String applicationIntegrationURL;

    /**
     * <p>
     * The web ACL specification. You can modify the settings in this web ACL and use it to update this web ACL or
     * create a new one.
     * </p>
     * 
     * @param webACL
     *        The web ACL specification. You can modify the settings in this web ACL and use it to update this web ACL
     *        or create a new one.
     */

    public void setWebACL(WebACL webACL) {
        this.webACL = webACL;
    }

    /**
     * <p>
     * The web ACL specification. You can modify the settings in this web ACL and use it to update this web ACL or
     * create a new one.
     * </p>
     * 
     * @return The web ACL specification. You can modify the settings in this web ACL and use it to update this web ACL
     *         or create a new one.
     */

    public WebACL getWebACL() {
        return this.webACL;
    }

    /**
     * <p>
     * The web ACL specification. You can modify the settings in this web ACL and use it to update this web ACL or
     * create a new one.
     * </p>
     * 
     * @param webACL
     *        The web ACL specification. You can modify the settings in this web ACL and use it to update this web ACL
     *        or create a new one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebACLResult withWebACL(WebACL webACL) {
        setWebACL(webACL);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *        requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *        associated with the token, you provide the token to operations like <code>update</code> and
     *        <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *        last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *        new token returned by that operation.
     */

    public void setLockToken(String lockToken) {
        this.lockToken = lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *         requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *         associated with the token, you provide the token to operations like <code>update</code> and
     *         <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *         last retrieved it. If a change has been made, the update fails with a
     *         <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *         new token returned by that operation.
     */

    public String getLockToken() {
        return this.lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *        requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *        associated with the token, you provide the token to operations like <code>update</code> and
     *        <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *        last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebACLResult withLockToken(String lockToken) {
        setLockToken(lockToken);
        return this;
    }

    /**
     * <p>
     * The URL to use in SDK integrations with Amazon Web Services managed rule groups. For example, you can use the
     * integration SDKs with the account takeover prevention managed rule group <code>AWSManagedRulesATPRuleSet</code>.
     * This is only populated if you are using a rule group in your web ACL that integrates with your applications in
     * this way. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param applicationIntegrationURL
     *        The URL to use in SDK integrations with Amazon Web Services managed rule groups. For example, you can use
     *        the integration SDKs with the account takeover prevention managed rule group
     *        <code>AWSManagedRulesATPRuleSet</code>. This is only populated if you are using a rule group in your web
     *        ACL that integrates with your applications in this way. For more information, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     *        application integration</a> in the <i>WAF Developer Guide</i>.
     */

    public void setApplicationIntegrationURL(String applicationIntegrationURL) {
        this.applicationIntegrationURL = applicationIntegrationURL;
    }

    /**
     * <p>
     * The URL to use in SDK integrations with Amazon Web Services managed rule groups. For example, you can use the
     * integration SDKs with the account takeover prevention managed rule group <code>AWSManagedRulesATPRuleSet</code>.
     * This is only populated if you are using a rule group in your web ACL that integrates with your applications in
     * this way. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @return The URL to use in SDK integrations with Amazon Web Services managed rule groups. For example, you can use
     *         the integration SDKs with the account takeover prevention managed rule group
     *         <code>AWSManagedRulesATPRuleSet</code>. This is only populated if you are using a rule group in your web
     *         ACL that integrates with your applications in this way. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     *         application integration</a> in the <i>WAF Developer Guide</i>.
     */

    public String getApplicationIntegrationURL() {
        return this.applicationIntegrationURL;
    }

    /**
     * <p>
     * The URL to use in SDK integrations with Amazon Web Services managed rule groups. For example, you can use the
     * integration SDKs with the account takeover prevention managed rule group <code>AWSManagedRulesATPRuleSet</code>.
     * This is only populated if you are using a rule group in your web ACL that integrates with your applications in
     * this way. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     * application integration</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param applicationIntegrationURL
     *        The URL to use in SDK integrations with Amazon Web Services managed rule groups. For example, you can use
     *        the integration SDKs with the account takeover prevention managed rule group
     *        <code>AWSManagedRulesATPRuleSet</code>. This is only populated if you are using a rule group in your web
     *        ACL that integrates with your applications in this way. For more information, see <a
     *        href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-application-integration.html">WAF client
     *        application integration</a> in the <i>WAF Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWebACLResult withApplicationIntegrationURL(String applicationIntegrationURL) {
        setApplicationIntegrationURL(applicationIntegrationURL);
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
        if (getWebACL() != null)
            sb.append("WebACL: ").append(getWebACL()).append(",");
        if (getLockToken() != null)
            sb.append("LockToken: ").append(getLockToken()).append(",");
        if (getApplicationIntegrationURL() != null)
            sb.append("ApplicationIntegrationURL: ").append(getApplicationIntegrationURL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebACLResult == false)
            return false;
        GetWebACLResult other = (GetWebACLResult) obj;
        if (other.getWebACL() == null ^ this.getWebACL() == null)
            return false;
        if (other.getWebACL() != null && other.getWebACL().equals(this.getWebACL()) == false)
            return false;
        if (other.getLockToken() == null ^ this.getLockToken() == null)
            return false;
        if (other.getLockToken() != null && other.getLockToken().equals(this.getLockToken()) == false)
            return false;
        if (other.getApplicationIntegrationURL() == null ^ this.getApplicationIntegrationURL() == null)
            return false;
        if (other.getApplicationIntegrationURL() != null && other.getApplicationIntegrationURL().equals(this.getApplicationIntegrationURL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACL() == null) ? 0 : getWebACL().hashCode());
        hashCode = prime * hashCode + ((getLockToken() == null) ? 0 : getLockToken().hashCode());
        hashCode = prime * hashCode + ((getApplicationIntegrationURL() == null) ? 0 : getApplicationIntegrationURL().hashCode());
        return hashCode;
    }

    @Override
    public GetWebACLResult clone() {
        try {
            return (GetWebACLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
