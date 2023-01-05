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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeLogGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLogGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the list of
     * accounts to search. You can specify as many as 20 account IDs in the array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accountIdentifiers;
    /**
     * <p>
     * The prefix to match.
     * </p>
     * <note>
     * <p>
     * <code>logGroupNamePrefix</code> and <code>logGroupNamePattern</code> are mutually exclusive. Only one of these
     * parameters can be passed.
     * </p>
     * </note>
     */
    private String logGroupNamePrefix;
    /**
     * <p>
     * If you specify a string for this parameter, the operation returns only log groups that have names that match the
     * string based on a case-sensitive substring search. For example, if you specify <code>Foo</code>, log groups named
     * <code>FooBar</code>, <code>aws/Foo</code>, and <code>GroupFoo</code> would match, but <code>foo</code>,
     * <code>F/o/o</code> and <code>Froo</code> would not match.
     * </p>
     * <note>
     * <p>
     * <code>logGroupNamePattern</code> and <code>logGroupNamePrefix</code> are mutually exclusive. Only one of these
     * parameters can be passed.
     * </p>
     * </note>
     */
    private String logGroupNamePattern;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If you are using a monitoring account, set this to <code>True</code> to have the operation return log groups in
     * the accounts listed in <code>accountIdentifiers</code>.
     * </p>
     * <p>
     * If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value, the
     * operation returns all log groups in the monitoring account and all log groups in all source accounts that are
     * linked to the monitoring account.
     * </p>
     * <note>
     * <p>
     * If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     * <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     * </p>
     * </note>
     */
    private Boolean includeLinkedAccounts;

    /**
     * <p>
     * When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the list of
     * accounts to search. You can specify as many as 20 account IDs in the array.
     * </p>
     * 
     * @return When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the
     *         list of accounts to search. You can specify as many as 20 account IDs in the array.
     */

    public java.util.List<String> getAccountIdentifiers() {
        if (accountIdentifiers == null) {
            accountIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accountIdentifiers;
    }

    /**
     * <p>
     * When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the list of
     * accounts to search. You can specify as many as 20 account IDs in the array.
     * </p>
     * 
     * @param accountIdentifiers
     *        When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the
     *        list of accounts to search. You can specify as many as 20 account IDs in the array.
     */

    public void setAccountIdentifiers(java.util.Collection<String> accountIdentifiers) {
        if (accountIdentifiers == null) {
            this.accountIdentifiers = null;
            return;
        }

        this.accountIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(accountIdentifiers);
    }

    /**
     * <p>
     * When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the list of
     * accounts to search. You can specify as many as 20 account IDs in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIdentifiers(java.util.Collection)} or {@link #withAccountIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accountIdentifiers
     *        When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the
     *        list of accounts to search. You can specify as many as 20 account IDs in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withAccountIdentifiers(String... accountIdentifiers) {
        if (this.accountIdentifiers == null) {
            setAccountIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(accountIdentifiers.length));
        }
        for (String ele : accountIdentifiers) {
            this.accountIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the list of
     * accounts to search. You can specify as many as 20 account IDs in the array.
     * </p>
     * 
     * @param accountIdentifiers
     *        When <code>includeLinkedAccounts</code> is set to <code>True</code>, use this parameter to specify the
     *        list of accounts to search. You can specify as many as 20 account IDs in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withAccountIdentifiers(java.util.Collection<String> accountIdentifiers) {
        setAccountIdentifiers(accountIdentifiers);
        return this;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <note>
     * <p>
     * <code>logGroupNamePrefix</code> and <code>logGroupNamePattern</code> are mutually exclusive. Only one of these
     * parameters can be passed.
     * </p>
     * </note>
     * 
     * @param logGroupNamePrefix
     *        The prefix to match.</p> <note>
     *        <p>
     *        <code>logGroupNamePrefix</code> and <code>logGroupNamePattern</code> are mutually exclusive. Only one of
     *        these parameters can be passed.
     *        </p>
     */

    public void setLogGroupNamePrefix(String logGroupNamePrefix) {
        this.logGroupNamePrefix = logGroupNamePrefix;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <note>
     * <p>
     * <code>logGroupNamePrefix</code> and <code>logGroupNamePattern</code> are mutually exclusive. Only one of these
     * parameters can be passed.
     * </p>
     * </note>
     * 
     * @return The prefix to match.</p> <note>
     *         <p>
     *         <code>logGroupNamePrefix</code> and <code>logGroupNamePattern</code> are mutually exclusive. Only one of
     *         these parameters can be passed.
     *         </p>
     */

    public String getLogGroupNamePrefix() {
        return this.logGroupNamePrefix;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <note>
     * <p>
     * <code>logGroupNamePrefix</code> and <code>logGroupNamePattern</code> are mutually exclusive. Only one of these
     * parameters can be passed.
     * </p>
     * </note>
     * 
     * @param logGroupNamePrefix
     *        The prefix to match.</p> <note>
     *        <p>
     *        <code>logGroupNamePrefix</code> and <code>logGroupNamePattern</code> are mutually exclusive. Only one of
     *        these parameters can be passed.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withLogGroupNamePrefix(String logGroupNamePrefix) {
        setLogGroupNamePrefix(logGroupNamePrefix);
        return this;
    }

    /**
     * <p>
     * If you specify a string for this parameter, the operation returns only log groups that have names that match the
     * string based on a case-sensitive substring search. For example, if you specify <code>Foo</code>, log groups named
     * <code>FooBar</code>, <code>aws/Foo</code>, and <code>GroupFoo</code> would match, but <code>foo</code>,
     * <code>F/o/o</code> and <code>Froo</code> would not match.
     * </p>
     * <note>
     * <p>
     * <code>logGroupNamePattern</code> and <code>logGroupNamePrefix</code> are mutually exclusive. Only one of these
     * parameters can be passed.
     * </p>
     * </note>
     * 
     * @param logGroupNamePattern
     *        If you specify a string for this parameter, the operation returns only log groups that have names that
     *        match the string based on a case-sensitive substring search. For example, if you specify <code>Foo</code>,
     *        log groups named <code>FooBar</code>, <code>aws/Foo</code>, and <code>GroupFoo</code> would match, but
     *        <code>foo</code>, <code>F/o/o</code> and <code>Froo</code> would not match.</p> <note>
     *        <p>
     *        <code>logGroupNamePattern</code> and <code>logGroupNamePrefix</code> are mutually exclusive. Only one of
     *        these parameters can be passed.
     *        </p>
     */

    public void setLogGroupNamePattern(String logGroupNamePattern) {
        this.logGroupNamePattern = logGroupNamePattern;
    }

    /**
     * <p>
     * If you specify a string for this parameter, the operation returns only log groups that have names that match the
     * string based on a case-sensitive substring search. For example, if you specify <code>Foo</code>, log groups named
     * <code>FooBar</code>, <code>aws/Foo</code>, and <code>GroupFoo</code> would match, but <code>foo</code>,
     * <code>F/o/o</code> and <code>Froo</code> would not match.
     * </p>
     * <note>
     * <p>
     * <code>logGroupNamePattern</code> and <code>logGroupNamePrefix</code> are mutually exclusive. Only one of these
     * parameters can be passed.
     * </p>
     * </note>
     * 
     * @return If you specify a string for this parameter, the operation returns only log groups that have names that
     *         match the string based on a case-sensitive substring search. For example, if you specify <code>Foo</code>
     *         , log groups named <code>FooBar</code>, <code>aws/Foo</code>, and <code>GroupFoo</code> would match, but
     *         <code>foo</code>, <code>F/o/o</code> and <code>Froo</code> would not match.</p> <note>
     *         <p>
     *         <code>logGroupNamePattern</code> and <code>logGroupNamePrefix</code> are mutually exclusive. Only one of
     *         these parameters can be passed.
     *         </p>
     */

    public String getLogGroupNamePattern() {
        return this.logGroupNamePattern;
    }

    /**
     * <p>
     * If you specify a string for this parameter, the operation returns only log groups that have names that match the
     * string based on a case-sensitive substring search. For example, if you specify <code>Foo</code>, log groups named
     * <code>FooBar</code>, <code>aws/Foo</code>, and <code>GroupFoo</code> would match, but <code>foo</code>,
     * <code>F/o/o</code> and <code>Froo</code> would not match.
     * </p>
     * <note>
     * <p>
     * <code>logGroupNamePattern</code> and <code>logGroupNamePrefix</code> are mutually exclusive. Only one of these
     * parameters can be passed.
     * </p>
     * </note>
     * 
     * @param logGroupNamePattern
     *        If you specify a string for this parameter, the operation returns only log groups that have names that
     *        match the string based on a case-sensitive substring search. For example, if you specify <code>Foo</code>,
     *        log groups named <code>FooBar</code>, <code>aws/Foo</code>, and <code>GroupFoo</code> would match, but
     *        <code>foo</code>, <code>F/o/o</code> and <code>Froo</code> would not match.</p> <note>
     *        <p>
     *        <code>logGroupNamePattern</code> and <code>logGroupNamePrefix</code> are mutually exclusive. Only one of
     *        these parameters can be passed.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withLogGroupNamePattern(String logGroupNamePattern) {
        setLogGroupNamePattern(logGroupNamePattern);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @return The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * If you are using a monitoring account, set this to <code>True</code> to have the operation return log groups in
     * the accounts listed in <code>accountIdentifiers</code>.
     * </p>
     * <p>
     * If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value, the
     * operation returns all log groups in the monitoring account and all log groups in all source accounts that are
     * linked to the monitoring account.
     * </p>
     * <note>
     * <p>
     * If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     * <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     * </p>
     * </note>
     * 
     * @param includeLinkedAccounts
     *        If you are using a monitoring account, set this to <code>True</code> to have the operation return log
     *        groups in the accounts listed in <code>accountIdentifiers</code>.</p>
     *        <p>
     *        If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value,
     *        the operation returns all log groups in the monitoring account and all log groups in all source accounts
     *        that are linked to the monitoring account.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     *        <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     *        </p>
     */

    public void setIncludeLinkedAccounts(Boolean includeLinkedAccounts) {
        this.includeLinkedAccounts = includeLinkedAccounts;
    }

    /**
     * <p>
     * If you are using a monitoring account, set this to <code>True</code> to have the operation return log groups in
     * the accounts listed in <code>accountIdentifiers</code>.
     * </p>
     * <p>
     * If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value, the
     * operation returns all log groups in the monitoring account and all log groups in all source accounts that are
     * linked to the monitoring account.
     * </p>
     * <note>
     * <p>
     * If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     * <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     * </p>
     * </note>
     * 
     * @return If you are using a monitoring account, set this to <code>True</code> to have the operation return log
     *         groups in the accounts listed in <code>accountIdentifiers</code>.</p>
     *         <p>
     *         If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value,
     *         the operation returns all log groups in the monitoring account and all log groups in all source accounts
     *         that are linked to the monitoring account.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     *         <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     *         </p>
     */

    public Boolean getIncludeLinkedAccounts() {
        return this.includeLinkedAccounts;
    }

    /**
     * <p>
     * If you are using a monitoring account, set this to <code>True</code> to have the operation return log groups in
     * the accounts listed in <code>accountIdentifiers</code>.
     * </p>
     * <p>
     * If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value, the
     * operation returns all log groups in the monitoring account and all log groups in all source accounts that are
     * linked to the monitoring account.
     * </p>
     * <note>
     * <p>
     * If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     * <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     * </p>
     * </note>
     * 
     * @param includeLinkedAccounts
     *        If you are using a monitoring account, set this to <code>True</code> to have the operation return log
     *        groups in the accounts listed in <code>accountIdentifiers</code>.</p>
     *        <p>
     *        If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value,
     *        the operation returns all log groups in the monitoring account and all log groups in all source accounts
     *        that are linked to the monitoring account.
     *        </p>
     *        <note>
     *        <p>
     *        If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     *        <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withIncludeLinkedAccounts(Boolean includeLinkedAccounts) {
        setIncludeLinkedAccounts(includeLinkedAccounts);
        return this;
    }

    /**
     * <p>
     * If you are using a monitoring account, set this to <code>True</code> to have the operation return log groups in
     * the accounts listed in <code>accountIdentifiers</code>.
     * </p>
     * <p>
     * If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value, the
     * operation returns all log groups in the monitoring account and all log groups in all source accounts that are
     * linked to the monitoring account.
     * </p>
     * <note>
     * <p>
     * If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     * <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     * </p>
     * </note>
     * 
     * @return If you are using a monitoring account, set this to <code>True</code> to have the operation return log
     *         groups in the accounts listed in <code>accountIdentifiers</code>.</p>
     *         <p>
     *         If this parameter is set to <code>true</code> and <code>accountIdentifiers</code> contains a null value,
     *         the operation returns all log groups in the monitoring account and all log groups in all source accounts
     *         that are linked to the monitoring account.
     *         </p>
     *         <note>
     *         <p>
     *         If you specify <code>includeLinkedAccounts</code> in your request, then <code>metricFilterCount</code>,
     *         <code>retentionInDays</code>, and <code>storedBytes</code> are not included in the response.
     *         </p>
     */

    public Boolean isIncludeLinkedAccounts() {
        return this.includeLinkedAccounts;
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
        if (getAccountIdentifiers() != null)
            sb.append("AccountIdentifiers: ").append(getAccountIdentifiers()).append(",");
        if (getLogGroupNamePrefix() != null)
            sb.append("LogGroupNamePrefix: ").append(getLogGroupNamePrefix()).append(",");
        if (getLogGroupNamePattern() != null)
            sb.append("LogGroupNamePattern: ").append(getLogGroupNamePattern()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getIncludeLinkedAccounts() != null)
            sb.append("IncludeLinkedAccounts: ").append(getIncludeLinkedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLogGroupsRequest == false)
            return false;
        DescribeLogGroupsRequest other = (DescribeLogGroupsRequest) obj;
        if (other.getAccountIdentifiers() == null ^ this.getAccountIdentifiers() == null)
            return false;
        if (other.getAccountIdentifiers() != null && other.getAccountIdentifiers().equals(this.getAccountIdentifiers()) == false)
            return false;
        if (other.getLogGroupNamePrefix() == null ^ this.getLogGroupNamePrefix() == null)
            return false;
        if (other.getLogGroupNamePrefix() != null && other.getLogGroupNamePrefix().equals(this.getLogGroupNamePrefix()) == false)
            return false;
        if (other.getLogGroupNamePattern() == null ^ this.getLogGroupNamePattern() == null)
            return false;
        if (other.getLogGroupNamePattern() != null && other.getLogGroupNamePattern().equals(this.getLogGroupNamePattern()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getIncludeLinkedAccounts() == null ^ this.getIncludeLinkedAccounts() == null)
            return false;
        if (other.getIncludeLinkedAccounts() != null && other.getIncludeLinkedAccounts().equals(this.getIncludeLinkedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIdentifiers() == null) ? 0 : getAccountIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getLogGroupNamePrefix() == null) ? 0 : getLogGroupNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getLogGroupNamePattern() == null) ? 0 : getLogGroupNamePattern().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getIncludeLinkedAccounts() == null) ? 0 : getIncludeLinkedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLogGroupsRequest clone() {
        return (DescribeLogGroupsRequest) super.clone();
    }

}
