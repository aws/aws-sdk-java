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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateQuerySuggestionsConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index you want to update query suggestions settings for.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off query
     * suggestions. You can to update this at any time.
     * </p>
     * <p>
     * In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up to date
     * for when you are ready to switch to ENABLED mode again.
     * </p>
     */
    private String mode;
    /**
     * <p>
     * How recent your queries are in your query log time window.
     * </p>
     * <p>
     * The time window is the number of days from current day to past days.
     * </p>
     * <p>
     * By default, Amazon Kendra sets this to 180.
     * </p>
     */
    private Integer queryLogLookBackWindowInDays;
    /**
     * <p>
     * <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the user),
     * otherwise <code>FALSE</code> to only include queries with user information.
     * </p>
     * <p>
     * If you pass user information to Amazon Kendra along with the queries, you can set this flag to <code>FALSE</code>
     * and instruct Amazon Kendra to only consider queries with user information.
     * </p>
     * <p>
     * If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     * <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     * suggestions.
     * </p>
     * <p>
     * If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     * </p>
     */
    private Boolean includeQueriesWithoutUserInformation;
    /**
     * <p>
     * The minimum number of unique users who must search a query in order for the query to be eligible to suggest to
     * your users.
     * </p>
     * <p>
     * Increasing this number might decrease the number of suggestions. However, this ensures a query is searched by
     * many users and is truly popular to suggest to users.
     * </p>
     * <p>
     * How you tune this setting depends on your specific needs.
     * </p>
     */
    private Integer minimumNumberOfQueryingUsers;
    /**
     * <p>
     * The the minimum number of times a query must be searched in order to be eligible to suggest to your users.
     * </p>
     * <p>
     * Decreasing this number increases the number of suggestions. However, this affects the quality of suggestions as
     * it sets a low bar for a query to be considered popular to suggest to users.
     * </p>
     * <p>
     * How you tune this setting depends on your specific needs.
     * </p>
     */
    private Integer minimumQueryCount;

    /**
     * <p>
     * The identifier of the index you want to update query suggestions settings for.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to update query suggestions settings for.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to update query suggestions settings for.
     * </p>
     * 
     * @return The identifier of the index you want to update query suggestions settings for.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index you want to update query suggestions settings for.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index you want to update query suggestions settings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsConfigRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off query
     * suggestions. You can to update this at any time.
     * </p>
     * <p>
     * In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up to date
     * for when you are ready to switch to ENABLED mode again.
     * </p>
     * 
     * @param mode
     *        Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.</p>
     *        <p>
     *        By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off
     *        query suggestions. You can to update this at any time.
     *        </p>
     *        <p>
     *        In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up
     *        to date for when you are ready to switch to ENABLED mode again.
     * @see Mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off query
     * suggestions. You can to update this at any time.
     * </p>
     * <p>
     * In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up to date
     * for when you are ready to switch to ENABLED mode again.
     * </p>
     * 
     * @return Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.</p>
     *         <p>
     *         By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off
     *         query suggestions. You can to update this at any time.
     *         </p>
     *         <p>
     *         In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up
     *         to date for when you are ready to switch to ENABLED mode again.
     * @see Mode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off query
     * suggestions. You can to update this at any time.
     * </p>
     * <p>
     * In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up to date
     * for when you are ready to switch to ENABLED mode again.
     * </p>
     * 
     * @param mode
     *        Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.</p>
     *        <p>
     *        By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off
     *        query suggestions. You can to update this at any time.
     *        </p>
     *        <p>
     *        In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up
     *        to date for when you are ready to switch to ENABLED mode again.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public UpdateQuerySuggestionsConfigRequest withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.
     * </p>
     * <p>
     * By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off query
     * suggestions. You can to update this at any time.
     * </p>
     * <p>
     * In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up to date
     * for when you are ready to switch to ENABLED mode again.
     * </p>
     * 
     * @param mode
     *        Set the mode to <code>ENABLED</code> or <code>LEARN_ONLY</code>.</p>
     *        <p>
     *        By default, Amazon Kendra enables query suggestions. <code>LEARN_ONLY</code> mode allows you to turn off
     *        query suggestions. You can to update this at any time.
     *        </p>
     *        <p>
     *        In <code>LEARN_ONLY</code> mode, Amazon Kendra continues to learn from new queries to keep suggestions up
     *        to date for when you are ready to switch to ENABLED mode again.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mode
     */

    public UpdateQuerySuggestionsConfigRequest withMode(Mode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * <p>
     * How recent your queries are in your query log time window.
     * </p>
     * <p>
     * The time window is the number of days from current day to past days.
     * </p>
     * <p>
     * By default, Amazon Kendra sets this to 180.
     * </p>
     * 
     * @param queryLogLookBackWindowInDays
     *        How recent your queries are in your query log time window.</p>
     *        <p>
     *        The time window is the number of days from current day to past days.
     *        </p>
     *        <p>
     *        By default, Amazon Kendra sets this to 180.
     */

    public void setQueryLogLookBackWindowInDays(Integer queryLogLookBackWindowInDays) {
        this.queryLogLookBackWindowInDays = queryLogLookBackWindowInDays;
    }

    /**
     * <p>
     * How recent your queries are in your query log time window.
     * </p>
     * <p>
     * The time window is the number of days from current day to past days.
     * </p>
     * <p>
     * By default, Amazon Kendra sets this to 180.
     * </p>
     * 
     * @return How recent your queries are in your query log time window.</p>
     *         <p>
     *         The time window is the number of days from current day to past days.
     *         </p>
     *         <p>
     *         By default, Amazon Kendra sets this to 180.
     */

    public Integer getQueryLogLookBackWindowInDays() {
        return this.queryLogLookBackWindowInDays;
    }

    /**
     * <p>
     * How recent your queries are in your query log time window.
     * </p>
     * <p>
     * The time window is the number of days from current day to past days.
     * </p>
     * <p>
     * By default, Amazon Kendra sets this to 180.
     * </p>
     * 
     * @param queryLogLookBackWindowInDays
     *        How recent your queries are in your query log time window.</p>
     *        <p>
     *        The time window is the number of days from current day to past days.
     *        </p>
     *        <p>
     *        By default, Amazon Kendra sets this to 180.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsConfigRequest withQueryLogLookBackWindowInDays(Integer queryLogLookBackWindowInDays) {
        setQueryLogLookBackWindowInDays(queryLogLookBackWindowInDays);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the user),
     * otherwise <code>FALSE</code> to only include queries with user information.
     * </p>
     * <p>
     * If you pass user information to Amazon Kendra along with the queries, you can set this flag to <code>FALSE</code>
     * and instruct Amazon Kendra to only consider queries with user information.
     * </p>
     * <p>
     * If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     * <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     * suggestions.
     * </p>
     * <p>
     * If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     * </p>
     * 
     * @param includeQueriesWithoutUserInformation
     *        <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the
     *        user), otherwise <code>FALSE</code> to only include queries with user information.</p>
     *        <p>
     *        If you pass user information to Amazon Kendra along with the queries, you can set this flag to
     *        <code>FALSE</code> and instruct Amazon Kendra to only consider queries with user information.
     *        </p>
     *        <p>
     *        If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     *        <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     *        suggestions.
     *        </p>
     *        <p>
     *        If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     */

    public void setIncludeQueriesWithoutUserInformation(Boolean includeQueriesWithoutUserInformation) {
        this.includeQueriesWithoutUserInformation = includeQueriesWithoutUserInformation;
    }

    /**
     * <p>
     * <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the user),
     * otherwise <code>FALSE</code> to only include queries with user information.
     * </p>
     * <p>
     * If you pass user information to Amazon Kendra along with the queries, you can set this flag to <code>FALSE</code>
     * and instruct Amazon Kendra to only consider queries with user information.
     * </p>
     * <p>
     * If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     * <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     * suggestions.
     * </p>
     * <p>
     * If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     * </p>
     * 
     * @return <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the
     *         user), otherwise <code>FALSE</code> to only include queries with user information.</p>
     *         <p>
     *         If you pass user information to Amazon Kendra along with the queries, you can set this flag to
     *         <code>FALSE</code> and instruct Amazon Kendra to only consider queries with user information.
     *         </p>
     *         <p>
     *         If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     *         <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     *         suggestions.
     *         </p>
     *         <p>
     *         If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     */

    public Boolean getIncludeQueriesWithoutUserInformation() {
        return this.includeQueriesWithoutUserInformation;
    }

    /**
     * <p>
     * <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the user),
     * otherwise <code>FALSE</code> to only include queries with user information.
     * </p>
     * <p>
     * If you pass user information to Amazon Kendra along with the queries, you can set this flag to <code>FALSE</code>
     * and instruct Amazon Kendra to only consider queries with user information.
     * </p>
     * <p>
     * If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     * <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     * suggestions.
     * </p>
     * <p>
     * If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     * </p>
     * 
     * @param includeQueriesWithoutUserInformation
     *        <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the
     *        user), otherwise <code>FALSE</code> to only include queries with user information.</p>
     *        <p>
     *        If you pass user information to Amazon Kendra along with the queries, you can set this flag to
     *        <code>FALSE</code> and instruct Amazon Kendra to only consider queries with user information.
     *        </p>
     *        <p>
     *        If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     *        <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     *        suggestions.
     *        </p>
     *        <p>
     *        If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsConfigRequest withIncludeQueriesWithoutUserInformation(Boolean includeQueriesWithoutUserInformation) {
        setIncludeQueriesWithoutUserInformation(includeQueriesWithoutUserInformation);
        return this;
    }

    /**
     * <p>
     * <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the user),
     * otherwise <code>FALSE</code> to only include queries with user information.
     * </p>
     * <p>
     * If you pass user information to Amazon Kendra along with the queries, you can set this flag to <code>FALSE</code>
     * and instruct Amazon Kendra to only consider queries with user information.
     * </p>
     * <p>
     * If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     * <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     * suggestions.
     * </p>
     * <p>
     * If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     * </p>
     * 
     * @return <code>TRUE</code> to include queries without user information (i.e. all queries, irrespective of the
     *         user), otherwise <code>FALSE</code> to only include queries with user information.</p>
     *         <p>
     *         If you pass user information to Amazon Kendra along with the queries, you can set this flag to
     *         <code>FALSE</code> and instruct Amazon Kendra to only consider queries with user information.
     *         </p>
     *         <p>
     *         If you set to <code>FALSE</code>, Amazon Kendra only considers queries searched at least
     *         <code>MinimumQueryCount</code> times across <code>MinimumNumberOfQueryingUsers</code> unique users for
     *         suggestions.
     *         </p>
     *         <p>
     *         If you set to <code>TRUE</code>, Amazon Kendra ignores all user information and learns from all queries.
     */

    public Boolean isIncludeQueriesWithoutUserInformation() {
        return this.includeQueriesWithoutUserInformation;
    }

    /**
     * <p>
     * The minimum number of unique users who must search a query in order for the query to be eligible to suggest to
     * your users.
     * </p>
     * <p>
     * Increasing this number might decrease the number of suggestions. However, this ensures a query is searched by
     * many users and is truly popular to suggest to users.
     * </p>
     * <p>
     * How you tune this setting depends on your specific needs.
     * </p>
     * 
     * @param minimumNumberOfQueryingUsers
     *        The minimum number of unique users who must search a query in order for the query to be eligible to
     *        suggest to your users.</p>
     *        <p>
     *        Increasing this number might decrease the number of suggestions. However, this ensures a query is searched
     *        by many users and is truly popular to suggest to users.
     *        </p>
     *        <p>
     *        How you tune this setting depends on your specific needs.
     */

    public void setMinimumNumberOfQueryingUsers(Integer minimumNumberOfQueryingUsers) {
        this.minimumNumberOfQueryingUsers = minimumNumberOfQueryingUsers;
    }

    /**
     * <p>
     * The minimum number of unique users who must search a query in order for the query to be eligible to suggest to
     * your users.
     * </p>
     * <p>
     * Increasing this number might decrease the number of suggestions. However, this ensures a query is searched by
     * many users and is truly popular to suggest to users.
     * </p>
     * <p>
     * How you tune this setting depends on your specific needs.
     * </p>
     * 
     * @return The minimum number of unique users who must search a query in order for the query to be eligible to
     *         suggest to your users.</p>
     *         <p>
     *         Increasing this number might decrease the number of suggestions. However, this ensures a query is
     *         searched by many users and is truly popular to suggest to users.
     *         </p>
     *         <p>
     *         How you tune this setting depends on your specific needs.
     */

    public Integer getMinimumNumberOfQueryingUsers() {
        return this.minimumNumberOfQueryingUsers;
    }

    /**
     * <p>
     * The minimum number of unique users who must search a query in order for the query to be eligible to suggest to
     * your users.
     * </p>
     * <p>
     * Increasing this number might decrease the number of suggestions. However, this ensures a query is searched by
     * many users and is truly popular to suggest to users.
     * </p>
     * <p>
     * How you tune this setting depends on your specific needs.
     * </p>
     * 
     * @param minimumNumberOfQueryingUsers
     *        The minimum number of unique users who must search a query in order for the query to be eligible to
     *        suggest to your users.</p>
     *        <p>
     *        Increasing this number might decrease the number of suggestions. However, this ensures a query is searched
     *        by many users and is truly popular to suggest to users.
     *        </p>
     *        <p>
     *        How you tune this setting depends on your specific needs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsConfigRequest withMinimumNumberOfQueryingUsers(Integer minimumNumberOfQueryingUsers) {
        setMinimumNumberOfQueryingUsers(minimumNumberOfQueryingUsers);
        return this;
    }

    /**
     * <p>
     * The the minimum number of times a query must be searched in order to be eligible to suggest to your users.
     * </p>
     * <p>
     * Decreasing this number increases the number of suggestions. However, this affects the quality of suggestions as
     * it sets a low bar for a query to be considered popular to suggest to users.
     * </p>
     * <p>
     * How you tune this setting depends on your specific needs.
     * </p>
     * 
     * @param minimumQueryCount
     *        The the minimum number of times a query must be searched in order to be eligible to suggest to your
     *        users.</p>
     *        <p>
     *        Decreasing this number increases the number of suggestions. However, this affects the quality of
     *        suggestions as it sets a low bar for a query to be considered popular to suggest to users.
     *        </p>
     *        <p>
     *        How you tune this setting depends on your specific needs.
     */

    public void setMinimumQueryCount(Integer minimumQueryCount) {
        this.minimumQueryCount = minimumQueryCount;
    }

    /**
     * <p>
     * The the minimum number of times a query must be searched in order to be eligible to suggest to your users.
     * </p>
     * <p>
     * Decreasing this number increases the number of suggestions. However, this affects the quality of suggestions as
     * it sets a low bar for a query to be considered popular to suggest to users.
     * </p>
     * <p>
     * How you tune this setting depends on your specific needs.
     * </p>
     * 
     * @return The the minimum number of times a query must be searched in order to be eligible to suggest to your
     *         users.</p>
     *         <p>
     *         Decreasing this number increases the number of suggestions. However, this affects the quality of
     *         suggestions as it sets a low bar for a query to be considered popular to suggest to users.
     *         </p>
     *         <p>
     *         How you tune this setting depends on your specific needs.
     */

    public Integer getMinimumQueryCount() {
        return this.minimumQueryCount;
    }

    /**
     * <p>
     * The the minimum number of times a query must be searched in order to be eligible to suggest to your users.
     * </p>
     * <p>
     * Decreasing this number increases the number of suggestions. However, this affects the quality of suggestions as
     * it sets a low bar for a query to be considered popular to suggest to users.
     * </p>
     * <p>
     * How you tune this setting depends on your specific needs.
     * </p>
     * 
     * @param minimumQueryCount
     *        The the minimum number of times a query must be searched in order to be eligible to suggest to your
     *        users.</p>
     *        <p>
     *        Decreasing this number increases the number of suggestions. However, this affects the quality of
     *        suggestions as it sets a low bar for a query to be considered popular to suggest to users.
     *        </p>
     *        <p>
     *        How you tune this setting depends on your specific needs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQuerySuggestionsConfigRequest withMinimumQueryCount(Integer minimumQueryCount) {
        setMinimumQueryCount(minimumQueryCount);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode()).append(",");
        if (getQueryLogLookBackWindowInDays() != null)
            sb.append("QueryLogLookBackWindowInDays: ").append(getQueryLogLookBackWindowInDays()).append(",");
        if (getIncludeQueriesWithoutUserInformation() != null)
            sb.append("IncludeQueriesWithoutUserInformation: ").append(getIncludeQueriesWithoutUserInformation()).append(",");
        if (getMinimumNumberOfQueryingUsers() != null)
            sb.append("MinimumNumberOfQueryingUsers: ").append(getMinimumNumberOfQueryingUsers()).append(",");
        if (getMinimumQueryCount() != null)
            sb.append("MinimumQueryCount: ").append(getMinimumQueryCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQuerySuggestionsConfigRequest == false)
            return false;
        UpdateQuerySuggestionsConfigRequest other = (UpdateQuerySuggestionsConfigRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        hashCode = prime * hashCode + ((getQueryLogLookBackWindowInDays() == null) ? 0 : getQueryLogLookBackWindowInDays().hashCode());
        hashCode = prime * hashCode + ((getIncludeQueriesWithoutUserInformation() == null) ? 0 : getIncludeQueriesWithoutUserInformation().hashCode());
        hashCode = prime * hashCode + ((getMinimumNumberOfQueryingUsers() == null) ? 0 : getMinimumNumberOfQueryingUsers().hashCode());
        hashCode = prime * hashCode + ((getMinimumQueryCount() == null) ? 0 : getMinimumQueryCount().hashCode());
        return hashCode;
    }

    @Override
    public UpdateQuerySuggestionsConfigRequest clone() {
        return (UpdateQuerySuggestionsConfigRequest) super.clone();
    }

}
