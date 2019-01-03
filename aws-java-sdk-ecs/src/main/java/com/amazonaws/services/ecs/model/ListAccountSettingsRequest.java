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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListAccountSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the account settings with which to filter results. You must also specify an account setting name to
     * use this parameter.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the
     * account settings are listed only for the authenticated user.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>, the account settings for the root user
     * or the default setting for the <code>principalArn</code>. If <code>false</code>, the account settings for the
     * <code>principalArn</code> are returned if they are set. Otherwise, no account settings are returned.
     * </p>
     */
    private Boolean effectiveSettings;
    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAccountSettings</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of account setting results returned by <code>ListAccountSettings</code> in paginated output.
     * When this parameter is used, <code>ListAccountSettings</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListAccountSettings</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 10. If this parameter is not used, then <code>ListAccountSettings</code>
     * returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * 
     * @param name
     *        The resource name you want to list the account settings for.
     * @see SettingName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * 
     * @return The resource name you want to list the account settings for.
     * @see SettingName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * 
     * @param name
     *        The resource name you want to list the account settings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public ListAccountSettingsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The resource name you want to list the account settings for.
     * </p>
     * 
     * @param name
     *        The resource name you want to list the account settings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingName
     */

    public ListAccountSettingsRequest withName(SettingName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the account settings with which to filter results. You must also specify an account setting name to
     * use this parameter.
     * </p>
     * 
     * @param value
     *        The value of the account settings with which to filter results. You must also specify an account setting
     *        name to use this parameter.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the account settings with which to filter results. You must also specify an account setting name to
     * use this parameter.
     * </p>
     * 
     * @return The value of the account settings with which to filter results. You must also specify an account setting
     *         name to use this parameter.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the account settings with which to filter results. You must also specify an account setting name to
     * use this parameter.
     * </p>
     * 
     * @param value
     *        The value of the account settings with which to filter results. You must also specify an account setting
     *        name to use this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountSettingsRequest withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the
     * account settings are listed only for the authenticated user.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted,
     *        the account settings are listed only for the authenticated user.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the
     * account settings are listed only for the authenticated user.
     * </p>
     * 
     * @return The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted,
     *         the account settings are listed only for the authenticated user.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted, the
     * account settings are listed only for the authenticated user.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the principal, which can be an IAM user, IAM role, or the root user. If this field is omitted,
     *        the account settings are listed only for the authenticated user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountSettingsRequest withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>, the account settings for the root user
     * or the default setting for the <code>principalArn</code>. If <code>false</code>, the account settings for the
     * <code>principalArn</code> are returned if they are set. Otherwise, no account settings are returned.
     * </p>
     * 
     * @param effectiveSettings
     *        Specifies whether to return the effective settings. If <code>true</code>, the account settings for the
     *        root user or the default setting for the <code>principalArn</code>. If <code>false</code>, the account
     *        settings for the <code>principalArn</code> are returned if they are set. Otherwise, no account settings
     *        are returned.
     */

    public void setEffectiveSettings(Boolean effectiveSettings) {
        this.effectiveSettings = effectiveSettings;
    }

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>, the account settings for the root user
     * or the default setting for the <code>principalArn</code>. If <code>false</code>, the account settings for the
     * <code>principalArn</code> are returned if they are set. Otherwise, no account settings are returned.
     * </p>
     * 
     * @return Specifies whether to return the effective settings. If <code>true</code>, the account settings for the
     *         root user or the default setting for the <code>principalArn</code>. If <code>false</code>, the account
     *         settings for the <code>principalArn</code> are returned if they are set. Otherwise, no account settings
     *         are returned.
     */

    public Boolean getEffectiveSettings() {
        return this.effectiveSettings;
    }

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>, the account settings for the root user
     * or the default setting for the <code>principalArn</code>. If <code>false</code>, the account settings for the
     * <code>principalArn</code> are returned if they are set. Otherwise, no account settings are returned.
     * </p>
     * 
     * @param effectiveSettings
     *        Specifies whether to return the effective settings. If <code>true</code>, the account settings for the
     *        root user or the default setting for the <code>principalArn</code>. If <code>false</code>, the account
     *        settings for the <code>principalArn</code> are returned if they are set. Otherwise, no account settings
     *        are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountSettingsRequest withEffectiveSettings(Boolean effectiveSettings) {
        setEffectiveSettings(effectiveSettings);
        return this;
    }

    /**
     * <p>
     * Specifies whether to return the effective settings. If <code>true</code>, the account settings for the root user
     * or the default setting for the <code>principalArn</code>. If <code>false</code>, the account settings for the
     * <code>principalArn</code> are returned if they are set. Otherwise, no account settings are returned.
     * </p>
     * 
     * @return Specifies whether to return the effective settings. If <code>true</code>, the account settings for the
     *         root user or the default setting for the <code>principalArn</code>. If <code>false</code>, the account
     *         settings for the <code>principalArn</code> are returned if they are set. Otherwise, no account settings
     *         are returned.
     */

    public Boolean isEffectiveSettings() {
        return this.effectiveSettings;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAccountSettings</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListAccountSettings</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *        value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAccountSettings</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @return The <code>nextToken</code> value returned from a previous paginated <code>ListAccountSettings</code>
     *         request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *         value.</p> <note>
     *         <p>
     *         This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *         list and not for other programmatic purposes.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned from a previous paginated <code>ListAccountSettings</code> request
     * where <code>maxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>nextToken</code> value.
     * </p>
     * <note>
     * <p>
     * This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and
     * not for other programmatic purposes.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned from a previous paginated <code>ListAccountSettings</code>
     *        request where <code>maxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>nextToken</code>
     *        value.</p> <note>
     *        <p>
     *        This token should be treated as an opaque identifier that is only used to retrieve the next items in a
     *        list and not for other programmatic purposes.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountSettingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by <code>ListAccountSettings</code> in paginated output.
     * When this parameter is used, <code>ListAccountSettings</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListAccountSettings</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 10. If this parameter is not used, then <code>ListAccountSettings</code>
     * returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of account setting results returned by <code>ListAccountSettings</code> in paginated
     *        output. When this parameter is used, <code>ListAccountSettings</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListAccountSettings</code> request with the
     *        returned <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used,
     *        then <code>ListAccountSettings</code> returns up to 10 results and a <code>nextToken</code> value if
     *        applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by <code>ListAccountSettings</code> in paginated output.
     * When this parameter is used, <code>ListAccountSettings</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListAccountSettings</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 10. If this parameter is not used, then <code>ListAccountSettings</code>
     * returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @return The maximum number of account setting results returned by <code>ListAccountSettings</code> in paginated
     *         output. When this parameter is used, <code>ListAccountSettings</code> only returns
     *         <code>maxResults</code> results in a single page along with a <code>nextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>ListAccountSettings</code> request with the returned <code>nextToken</code> value. This value can
     *         be between 1 and 10. If this parameter is not used, then <code>ListAccountSettings</code> returns up to
     *         10 results and a <code>nextToken</code> value if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of account setting results returned by <code>ListAccountSettings</code> in paginated output.
     * When this parameter is used, <code>ListAccountSettings</code> only returns <code>maxResults</code> results in a
     * single page along with a <code>nextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>ListAccountSettings</code> request with the returned <code>nextToken</code>
     * value. This value can be between 1 and 10. If this parameter is not used, then <code>ListAccountSettings</code>
     * returns up to 10 results and a <code>nextToken</code> value if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of account setting results returned by <code>ListAccountSettings</code> in paginated
     *        output. When this parameter is used, <code>ListAccountSettings</code> only returns <code>maxResults</code>
     *        results in a single page along with a <code>nextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>ListAccountSettings</code> request with the
     *        returned <code>nextToken</code> value. This value can be between 1 and 10. If this parameter is not used,
     *        then <code>ListAccountSettings</code> returns up to 10 results and a <code>nextToken</code> value if
     *        applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountSettingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getEffectiveSettings() != null)
            sb.append("EffectiveSettings: ").append(getEffectiveSettings()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccountSettingsRequest == false)
            return false;
        ListAccountSettingsRequest other = (ListAccountSettingsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getEffectiveSettings() == null ^ this.getEffectiveSettings() == null)
            return false;
        if (other.getEffectiveSettings() != null && other.getEffectiveSettings().equals(this.getEffectiveSettings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getEffectiveSettings() == null) ? 0 : getEffectiveSettings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountSettingsRequest clone() {
        return (ListAccountSettingsRequest) super.clone();
    }

}
