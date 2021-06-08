/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQuerySuggestionsConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code> mode.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions for your
     * users. You can change the mode using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> operation.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * Shows whether the status of query suggestions settings is currently Active or Updating.
     * </p>
     * <p>
     * Active means the current settings apply and Updating means your changed settings are in the process of applying.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Shows how recent your queries are in your query log time window (in days).
     * </p>
     */
    private Integer queryLogLookBackWindowInDays;
    /**
     * <p>
     * Shows whether Amazon Kendra uses all queries or only uses queries that include user information to generate query
     * suggestions.
     * </p>
     */
    private Boolean includeQueriesWithoutUserInformation;
    /**
     * <p>
     * Shows the minimum number of unique users who must search a query in order for the query to be eligible to suggest
     * to your users.
     * </p>
     */
    private Integer minimumNumberOfQueryingUsers;
    /**
     * <p>
     * Shows the minimum number of times a query must be searched in order for the query to be eligible to suggest to
     * your users.
     * </p>
     */
    private Integer minimumQueryCount;
    /**
     * <p>
     * Shows the date-time query suggestions for an index was last updated.
     * </p>
     */
    private java.util.Date lastSuggestionsBuildTime;
    /**
     * <p>
     * Shows the date-time query suggestions for an index was last cleared.
     * </p>
     * <p>
     * After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query log
     * from the time you cleared suggestions. Amazon Kendra only considers re-occurences of a query from the time you
     * cleared suggestions.
     * </p>
     */
    private java.util.Date lastClearTime;
    /**
     * <p>
     * Shows the current total count of query suggestions for an index.
     * </p>
     * <p>
     * This count can change when you update your query suggestions settings, if you filter out certain queries from
     * suggestions using a block list, and as the query log accumulates more queries for Amazon Kendra to learn from.
     * </p>
     */
    private Integer totalSuggestionsCount;

    /**
     * <p>
     * Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code> mode.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions for your
     * users. You can change the mode using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> operation.
     * </p>
     * 
     * @param mode
     *        Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code>
     *        mode.</p>
     *        <p>
     *        By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions
     *        for your users. You can change the mode using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     *        >UpdateQuerySuggestionsConfig</a> operation.
     * @see Mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code> mode.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions for your
     * users. You can change the mode using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> operation.
     * </p>
     * 
     * @return Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code>
     *         mode.</p>
     *         <p>
     *         By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions
     *         for your users. You can change the mode using the <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     *         >UpdateQuerySuggestionsConfig</a> operation.
     * @see Mode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code> mode.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions for your
     * users. You can change the mode using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> operation.
     * </p>
     * 
     * @param mode
     *        Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code>
     *        mode.</p>
     *        <p>
     *        By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions
     *        for your users. You can change the mode using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     *        >UpdateQuerySuggestionsConfig</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public DescribeQuerySuggestionsConfigResult withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code> mode.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions for your
     * users. You can change the mode using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     * >UpdateQuerySuggestionsConfig</a> operation.
     * </p>
     * 
     * @param mode
     *        Shows whether query suggestions are currently in <code>ENABLED</code> mode or <code>LEARN_ONLY</code>
     *        mode.</p>
     *        <p>
     *        By default, Amazon Kendra enables query suggestions.<code>LEARN_ONLY</code> turns off query suggestions
     *        for your users. You can change the mode using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateQuerySuggestionsConfig.html"
     *        >UpdateQuerySuggestionsConfig</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public DescribeQuerySuggestionsConfigResult withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * Shows whether the status of query suggestions settings is currently Active or Updating.
     * </p>
     * <p>
     * Active means the current settings apply and Updating means your changed settings are in the process of applying.
     * </p>
     * 
     * @param status
     *        Shows whether the status of query suggestions settings is currently Active or Updating.</p>
     *        <p>
     *        Active means the current settings apply and Updating means your changed settings are in the process of
     *        applying.
     * @see QuerySuggestionsStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Shows whether the status of query suggestions settings is currently Active or Updating.
     * </p>
     * <p>
     * Active means the current settings apply and Updating means your changed settings are in the process of applying.
     * </p>
     * 
     * @return Shows whether the status of query suggestions settings is currently Active or Updating.</p>
     *         <p>
     *         Active means the current settings apply and Updating means your changed settings are in the process of
     *         applying.
     * @see QuerySuggestionsStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Shows whether the status of query suggestions settings is currently Active or Updating.
     * </p>
     * <p>
     * Active means the current settings apply and Updating means your changed settings are in the process of applying.
     * </p>
     * 
     * @param status
     *        Shows whether the status of query suggestions settings is currently Active or Updating.</p>
     *        <p>
     *        Active means the current settings apply and Updating means your changed settings are in the process of
     *        applying.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuerySuggestionsStatus
     */

    public DescribeQuerySuggestionsConfigResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Shows whether the status of query suggestions settings is currently Active or Updating.
     * </p>
     * <p>
     * Active means the current settings apply and Updating means your changed settings are in the process of applying.
     * </p>
     * 
     * @param status
     *        Shows whether the status of query suggestions settings is currently Active or Updating.</p>
     *        <p>
     *        Active means the current settings apply and Updating means your changed settings are in the process of
     *        applying.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuerySuggestionsStatus
     */

    public DescribeQuerySuggestionsConfigResult withStatus(QuerySuggestionsStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Shows how recent your queries are in your query log time window (in days).
     * </p>
     * 
     * @param queryLogLookBackWindowInDays
     *        Shows how recent your queries are in your query log time window (in days).
     */

    public void setQueryLogLookBackWindowInDays(Integer queryLogLookBackWindowInDays) {
        this.queryLogLookBackWindowInDays = queryLogLookBackWindowInDays;
    }

    /**
     * <p>
     * Shows how recent your queries are in your query log time window (in days).
     * </p>
     * 
     * @return Shows how recent your queries are in your query log time window (in days).
     */

    public Integer getQueryLogLookBackWindowInDays() {
        return this.queryLogLookBackWindowInDays;
    }

    /**
     * <p>
     * Shows how recent your queries are in your query log time window (in days).
     * </p>
     * 
     * @param queryLogLookBackWindowInDays
     *        Shows how recent your queries are in your query log time window (in days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsConfigResult withQueryLogLookBackWindowInDays(Integer queryLogLookBackWindowInDays) {
        setQueryLogLookBackWindowInDays(queryLogLookBackWindowInDays);
        return this;
    }

    /**
     * <p>
     * Shows whether Amazon Kendra uses all queries or only uses queries that include user information to generate query
     * suggestions.
     * </p>
     * 
     * @param includeQueriesWithoutUserInformation
     *        Shows whether Amazon Kendra uses all queries or only uses queries that include user information to
     *        generate query suggestions.
     */

    public void setIncludeQueriesWithoutUserInformation(Boolean includeQueriesWithoutUserInformation) {
        this.includeQueriesWithoutUserInformation = includeQueriesWithoutUserInformation;
    }

    /**
     * <p>
     * Shows whether Amazon Kendra uses all queries or only uses queries that include user information to generate query
     * suggestions.
     * </p>
     * 
     * @return Shows whether Amazon Kendra uses all queries or only uses queries that include user information to
     *         generate query suggestions.
     */

    public Boolean getIncludeQueriesWithoutUserInformation() {
        return this.includeQueriesWithoutUserInformation;
    }

    /**
     * <p>
     * Shows whether Amazon Kendra uses all queries or only uses queries that include user information to generate query
     * suggestions.
     * </p>
     * 
     * @param includeQueriesWithoutUserInformation
     *        Shows whether Amazon Kendra uses all queries or only uses queries that include user information to
     *        generate query suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsConfigResult withIncludeQueriesWithoutUserInformation(Boolean includeQueriesWithoutUserInformation) {
        setIncludeQueriesWithoutUserInformation(includeQueriesWithoutUserInformation);
        return this;
    }

    /**
     * <p>
     * Shows whether Amazon Kendra uses all queries or only uses queries that include user information to generate query
     * suggestions.
     * </p>
     * 
     * @return Shows whether Amazon Kendra uses all queries or only uses queries that include user information to
     *         generate query suggestions.
     */

    public Boolean isIncludeQueriesWithoutUserInformation() {
        return this.includeQueriesWithoutUserInformation;
    }

    /**
     * <p>
     * Shows the minimum number of unique users who must search a query in order for the query to be eligible to suggest
     * to your users.
     * </p>
     * 
     * @param minimumNumberOfQueryingUsers
     *        Shows the minimum number of unique users who must search a query in order for the query to be eligible to
     *        suggest to your users.
     */

    public void setMinimumNumberOfQueryingUsers(Integer minimumNumberOfQueryingUsers) {
        this.minimumNumberOfQueryingUsers = minimumNumberOfQueryingUsers;
    }

    /**
     * <p>
     * Shows the minimum number of unique users who must search a query in order for the query to be eligible to suggest
     * to your users.
     * </p>
     * 
     * @return Shows the minimum number of unique users who must search a query in order for the query to be eligible to
     *         suggest to your users.
     */

    public Integer getMinimumNumberOfQueryingUsers() {
        return this.minimumNumberOfQueryingUsers;
    }

    /**
     * <p>
     * Shows the minimum number of unique users who must search a query in order for the query to be eligible to suggest
     * to your users.
     * </p>
     * 
     * @param minimumNumberOfQueryingUsers
     *        Shows the minimum number of unique users who must search a query in order for the query to be eligible to
     *        suggest to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsConfigResult withMinimumNumberOfQueryingUsers(Integer minimumNumberOfQueryingUsers) {
        setMinimumNumberOfQueryingUsers(minimumNumberOfQueryingUsers);
        return this;
    }

    /**
     * <p>
     * Shows the minimum number of times a query must be searched in order for the query to be eligible to suggest to
     * your users.
     * </p>
     * 
     * @param minimumQueryCount
     *        Shows the minimum number of times a query must be searched in order for the query to be eligible to
     *        suggest to your users.
     */

    public void setMinimumQueryCount(Integer minimumQueryCount) {
        this.minimumQueryCount = minimumQueryCount;
    }

    /**
     * <p>
     * Shows the minimum number of times a query must be searched in order for the query to be eligible to suggest to
     * your users.
     * </p>
     * 
     * @return Shows the minimum number of times a query must be searched in order for the query to be eligible to
     *         suggest to your users.
     */

    public Integer getMinimumQueryCount() {
        return this.minimumQueryCount;
    }

    /**
     * <p>
     * Shows the minimum number of times a query must be searched in order for the query to be eligible to suggest to
     * your users.
     * </p>
     * 
     * @param minimumQueryCount
     *        Shows the minimum number of times a query must be searched in order for the query to be eligible to
     *        suggest to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsConfigResult withMinimumQueryCount(Integer minimumQueryCount) {
        setMinimumQueryCount(minimumQueryCount);
        return this;
    }

    /**
     * <p>
     * Shows the date-time query suggestions for an index was last updated.
     * </p>
     * 
     * @param lastSuggestionsBuildTime
     *        Shows the date-time query suggestions for an index was last updated.
     */

    public void setLastSuggestionsBuildTime(java.util.Date lastSuggestionsBuildTime) {
        this.lastSuggestionsBuildTime = lastSuggestionsBuildTime;
    }

    /**
     * <p>
     * Shows the date-time query suggestions for an index was last updated.
     * </p>
     * 
     * @return Shows the date-time query suggestions for an index was last updated.
     */

    public java.util.Date getLastSuggestionsBuildTime() {
        return this.lastSuggestionsBuildTime;
    }

    /**
     * <p>
     * Shows the date-time query suggestions for an index was last updated.
     * </p>
     * 
     * @param lastSuggestionsBuildTime
     *        Shows the date-time query suggestions for an index was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsConfigResult withLastSuggestionsBuildTime(java.util.Date lastSuggestionsBuildTime) {
        setLastSuggestionsBuildTime(lastSuggestionsBuildTime);
        return this;
    }

    /**
     * <p>
     * Shows the date-time query suggestions for an index was last cleared.
     * </p>
     * <p>
     * After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query log
     * from the time you cleared suggestions. Amazon Kendra only considers re-occurences of a query from the time you
     * cleared suggestions.
     * </p>
     * 
     * @param lastClearTime
     *        Shows the date-time query suggestions for an index was last cleared.</p>
     *        <p>
     *        After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query
     *        log from the time you cleared suggestions. Amazon Kendra only considers re-occurences of a query from the
     *        time you cleared suggestions.
     */

    public void setLastClearTime(java.util.Date lastClearTime) {
        this.lastClearTime = lastClearTime;
    }

    /**
     * <p>
     * Shows the date-time query suggestions for an index was last cleared.
     * </p>
     * <p>
     * After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query log
     * from the time you cleared suggestions. Amazon Kendra only considers re-occurences of a query from the time you
     * cleared suggestions.
     * </p>
     * 
     * @return Shows the date-time query suggestions for an index was last cleared.</p>
     *         <p>
     *         After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query
     *         log from the time you cleared suggestions. Amazon Kendra only considers re-occurences of a query from the
     *         time you cleared suggestions.
     */

    public java.util.Date getLastClearTime() {
        return this.lastClearTime;
    }

    /**
     * <p>
     * Shows the date-time query suggestions for an index was last cleared.
     * </p>
     * <p>
     * After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query log
     * from the time you cleared suggestions. Amazon Kendra only considers re-occurences of a query from the time you
     * cleared suggestions.
     * </p>
     * 
     * @param lastClearTime
     *        Shows the date-time query suggestions for an index was last cleared.</p>
     *        <p>
     *        After you clear suggestions, Amazon Kendra learns new suggestions based on new queries added to the query
     *        log from the time you cleared suggestions. Amazon Kendra only considers re-occurences of a query from the
     *        time you cleared suggestions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsConfigResult withLastClearTime(java.util.Date lastClearTime) {
        setLastClearTime(lastClearTime);
        return this;
    }

    /**
     * <p>
     * Shows the current total count of query suggestions for an index.
     * </p>
     * <p>
     * This count can change when you update your query suggestions settings, if you filter out certain queries from
     * suggestions using a block list, and as the query log accumulates more queries for Amazon Kendra to learn from.
     * </p>
     * 
     * @param totalSuggestionsCount
     *        Shows the current total count of query suggestions for an index.</p>
     *        <p>
     *        This count can change when you update your query suggestions settings, if you filter out certain queries
     *        from suggestions using a block list, and as the query log accumulates more queries for Amazon Kendra to
     *        learn from.
     */

    public void setTotalSuggestionsCount(Integer totalSuggestionsCount) {
        this.totalSuggestionsCount = totalSuggestionsCount;
    }

    /**
     * <p>
     * Shows the current total count of query suggestions for an index.
     * </p>
     * <p>
     * This count can change when you update your query suggestions settings, if you filter out certain queries from
     * suggestions using a block list, and as the query log accumulates more queries for Amazon Kendra to learn from.
     * </p>
     * 
     * @return Shows the current total count of query suggestions for an index.</p>
     *         <p>
     *         This count can change when you update your query suggestions settings, if you filter out certain queries
     *         from suggestions using a block list, and as the query log accumulates more queries for Amazon Kendra to
     *         learn from.
     */

    public Integer getTotalSuggestionsCount() {
        return this.totalSuggestionsCount;
    }

    /**
     * <p>
     * Shows the current total count of query suggestions for an index.
     * </p>
     * <p>
     * This count can change when you update your query suggestions settings, if you filter out certain queries from
     * suggestions using a block list, and as the query log accumulates more queries for Amazon Kendra to learn from.
     * </p>
     * 
     * @param totalSuggestionsCount
     *        Shows the current total count of query suggestions for an index.</p>
     *        <p>
     *        This count can change when you update your query suggestions settings, if you filter out certain queries
     *        from suggestions using a block list, and as the query log accumulates more queries for Amazon Kendra to
     *        learn from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsConfigResult withTotalSuggestionsCount(Integer totalSuggestionsCount) {
        setTotalSuggestionsCount(totalSuggestionsCount);
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
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getQueryLogLookBackWindowInDays() != null)
            sb.append("QueryLogLookBackWindowInDays: ").append(getQueryLogLookBackWindowInDays()).append(",");
        if (getIncludeQueriesWithoutUserInformation() != null)
            sb.append("IncludeQueriesWithoutUserInformation: ").append(getIncludeQueriesWithoutUserInformation()).append(",");
        if (getMinimumNumberOfQueryingUsers() != null)
            sb.append("MinimumNumberOfQueryingUsers: ").append(getMinimumNumberOfQueryingUsers()).append(",");
        if (getMinimumQueryCount() != null)
            sb.append("MinimumQueryCount: ").append(getMinimumQueryCount()).append(",");
        if (getLastSuggestionsBuildTime() != null)
            sb.append("LastSuggestionsBuildTime: ").append(getLastSuggestionsBuildTime()).append(",");
        if (getLastClearTime() != null)
            sb.append("LastClearTime: ").append(getLastClearTime()).append(",");
        if (getTotalSuggestionsCount() != null)
            sb.append("TotalSuggestionsCount: ").append(getTotalSuggestionsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeQuerySuggestionsConfigResult == false)
            return false;
        DescribeQuerySuggestionsConfigResult other = (DescribeQuerySuggestionsConfigResult) obj;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getQueryLogLookBackWindowInDays() == null ^ this.getQueryLogLookBackWindowInDays() == null)
            return false;
        if (other.getQueryLogLookBackWindowInDays() != null && other.getQueryLogLookBackWindowInDays().equals(this.getQueryLogLookBackWindowInDays()) == false)
            return false;
        if (other.getIncludeQueriesWithoutUserInformation() == null ^ this.getIncludeQueriesWithoutUserInformation() == null)
            return false;
        if (other.getIncludeQueriesWithoutUserInformation() != null
                && other.getIncludeQueriesWithoutUserInformation().equals(this.getIncludeQueriesWithoutUserInformation()) == false)
            return false;
        if (other.getMinimumNumberOfQueryingUsers() == null ^ this.getMinimumNumberOfQueryingUsers() == null)
            return false;
        if (other.getMinimumNumberOfQueryingUsers() != null && other.getMinimumNumberOfQueryingUsers().equals(this.getMinimumNumberOfQueryingUsers()) == false)
            return false;
        if (other.getMinimumQueryCount() == null ^ this.getMinimumQueryCount() == null)
            return false;
        if (other.getMinimumQueryCount() != null && other.getMinimumQueryCount().equals(this.getMinimumQueryCount()) == false)
            return false;
        if (other.getLastSuggestionsBuildTime() == null ^ this.getLastSuggestionsBuildTime() == null)
            return false;
        if (other.getLastSuggestionsBuildTime() != null && other.getLastSuggestionsBuildTime().equals(this.getLastSuggestionsBuildTime()) == false)
            return false;
        if (other.getLastClearTime() == null ^ this.getLastClearTime() == null)
            return false;
        if (other.getLastClearTime() != null && other.getLastClearTime().equals(this.getLastClearTime()) == false)
            return false;
        if (other.getTotalSuggestionsCount() == null ^ this.getTotalSuggestionsCount() == null)
            return false;
        if (other.getTotalSuggestionsCount() != null && other.getTotalSuggestionsCount().equals(this.getTotalSuggestionsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getQueryLogLookBackWindowInDays() == null) ? 0 : getQueryLogLookBackWindowInDays().hashCode());
        hashCode = prime * hashCode + ((getIncludeQueriesWithoutUserInformation() == null) ? 0 : getIncludeQueriesWithoutUserInformation().hashCode());
        hashCode = prime * hashCode + ((getMinimumNumberOfQueryingUsers() == null) ? 0 : getMinimumNumberOfQueryingUsers().hashCode());
        hashCode = prime * hashCode + ((getMinimumQueryCount() == null) ? 0 : getMinimumQueryCount().hashCode());
        hashCode = prime * hashCode + ((getLastSuggestionsBuildTime() == null) ? 0 : getLastSuggestionsBuildTime().hashCode());
        hashCode = prime * hashCode + ((getLastClearTime() == null) ? 0 : getLastClearTime().hashCode());
        hashCode = prime * hashCode + ((getTotalSuggestionsCount() == null) ? 0 : getTotalSuggestionsCount().hashCode());
        return hashCode;
    }

    @Override
    public DescribeQuerySuggestionsConfigResult clone() {
        try {
            return (DescribeQuerySuggestionsConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
