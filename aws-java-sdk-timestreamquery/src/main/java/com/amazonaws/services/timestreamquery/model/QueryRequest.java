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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/Query" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The query to be run by Timestream.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * Unique, case-sensitive string of up to 64 ASCII characters specified when a <code>Query</code> request is made.
     * Providing a <code>ClientToken</code> makes the call to <code>Query</code> <i>idempotent</i>. This means that
     * running the same query repeatedly will produce the same result. In other words, making multiple identical
     * <code>Query</code> requests has the same effect as making a single request. When using <code>ClientToken</code>
     * in a query, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the Query API is instantiated without a <code>ClientToken</code>, the Query SDK generates a
     * <code>ClientToken</code> on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>Query</code> invocation only contains the <code>ClientToken</code> but does not include a
     * <code>NextToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the invocation contains <code>NextToken</code>, that particular invocation is assumed to be a subsequent
     * invocation of a prior call to the Query API, and a result set is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * After 4 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     * </p>
     * </li>
     * </ul>
     */
    private String clientToken;
    /**
     * <p>
     * A pagination token used to return a set of results. When the <code>Query</code> API is invoked using
     * <code>NextToken</code>, that particular invocation is assumed to be a subsequent invocation of a prior call to
     * <code>Query</code>, and a result set is returned. However, if the <code>Query</code> invocation only contains the
     * <code>ClientToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     * </p>
     * <p>
     * Note the following when using NextToken in a query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pagination token can be used for up to five <code>Query</code> invocations, OR for a duration of up to 1 hour –
     * whichever comes first.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using the same <code>NextToken</code> will return the same set of records. To keep paginating through the result
     * set, you must to use the most recent <code>nextToken</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose a <code>Query</code> invocation returns two <code>NextToken</code> values, <code>TokenA</code> and
     * <code>TokenB</code>. If <code>TokenB</code> is used in a subsequent <code>Query</code> invocation, then
     * <code>TokenA</code> is invalidated and cannot be reused.
     * </p>
     * </li>
     * <li>
     * <p>
     * To request a previous result set from a query after pagination has begun, you must re-invoke the Query API.
     * </p>
     * </li>
     * <li>
     * <p>
     * The latest <code>NextToken</code> should be used to paginate until <code>null</code> is returned, at which point
     * a new <code>NextToken</code> should be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and
     * the result reader do not have the same query string in the query requests, the query will fail with an
     * <code>Invalid pagination token</code> error.
     * </p>
     * </li>
     * </ul>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of rows to be returned in the <code>Query</code> output. The initial run of <code>Query</code>
     * with a <code>MaxRows</code> value specified will return the result set of the query in two cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The size of the result is less than <code>1MB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of rows in the result set is less than the value of <code>maxRows</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, the initial invocation of <code>Query</code> only returns a <code>NextToken</code>, which can then be
     * used in subsequent calls to fetch the result set. To resume pagination, provide the <code>NextToken</code> value
     * in the subsequent command.
     * </p>
     * <p>
     * If the row size is large (e.g. a row has many columns), Timestream may return fewer rows to keep the response
     * size from exceeding the 1 MB limit. If <code>MaxRows</code> is not provided, Timestream will send the necessary
     * number of rows to meet the 1 MB limit.
     * </p>
     */
    private Integer maxRows;

    /**
     * <p>
     * The query to be run by Timestream.
     * </p>
     * 
     * @param queryString
     *        The query to be run by Timestream.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query to be run by Timestream.
     * </p>
     * 
     * @return The query to be run by Timestream.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query to be run by Timestream.
     * </p>
     * 
     * @param queryString
     *        The query to be run by Timestream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive string of up to 64 ASCII characters specified when a <code>Query</code> request is made.
     * Providing a <code>ClientToken</code> makes the call to <code>Query</code> <i>idempotent</i>. This means that
     * running the same query repeatedly will produce the same result. In other words, making multiple identical
     * <code>Query</code> requests has the same effect as making a single request. When using <code>ClientToken</code>
     * in a query, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the Query API is instantiated without a <code>ClientToken</code>, the Query SDK generates a
     * <code>ClientToken</code> on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>Query</code> invocation only contains the <code>ClientToken</code> but does not include a
     * <code>NextToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the invocation contains <code>NextToken</code>, that particular invocation is assumed to be a subsequent
     * invocation of a prior call to the Query API, and a result set is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * After 4 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clientToken
     *        Unique, case-sensitive string of up to 64 ASCII characters specified when a <code>Query</code> request is
     *        made. Providing a <code>ClientToken</code> makes the call to <code>Query</code> <i>idempotent</i>. This
     *        means that running the same query repeatedly will produce the same result. In other words, making multiple
     *        identical <code>Query</code> requests has the same effect as making a single request. When using
     *        <code>ClientToken</code> in a query, note the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the Query API is instantiated without a <code>ClientToken</code>, the Query SDK generates a
     *        <code>ClientToken</code> on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>Query</code> invocation only contains the <code>ClientToken</code> but does not include a
     *        <code>NextToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the invocation contains <code>NextToken</code>, that particular invocation is assumed to be a
     *        subsequent invocation of a prior call to the Query API, and a result set is returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        After 4 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     *        </p>
     *        </li>
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive string of up to 64 ASCII characters specified when a <code>Query</code> request is made.
     * Providing a <code>ClientToken</code> makes the call to <code>Query</code> <i>idempotent</i>. This means that
     * running the same query repeatedly will produce the same result. In other words, making multiple identical
     * <code>Query</code> requests has the same effect as making a single request. When using <code>ClientToken</code>
     * in a query, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the Query API is instantiated without a <code>ClientToken</code>, the Query SDK generates a
     * <code>ClientToken</code> on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>Query</code> invocation only contains the <code>ClientToken</code> but does not include a
     * <code>NextToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the invocation contains <code>NextToken</code>, that particular invocation is assumed to be a subsequent
     * invocation of a prior call to the Query API, and a result set is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * After 4 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Unique, case-sensitive string of up to 64 ASCII characters specified when a <code>Query</code> request is
     *         made. Providing a <code>ClientToken</code> makes the call to <code>Query</code> <i>idempotent</i>. This
     *         means that running the same query repeatedly will produce the same result. In other words, making
     *         multiple identical <code>Query</code> requests has the same effect as making a single request. When using
     *         <code>ClientToken</code> in a query, note the following: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the Query API is instantiated without a <code>ClientToken</code>, the Query SDK generates a
     *         <code>ClientToken</code> on your behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the <code>Query</code> invocation only contains the <code>ClientToken</code> but does not include a
     *         <code>NextToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the invocation contains <code>NextToken</code>, that particular invocation is assumed to be a
     *         subsequent invocation of a prior call to the Query API, and a result set is returned.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         After 4 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     *         </p>
     *         </li>
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive string of up to 64 ASCII characters specified when a <code>Query</code> request is made.
     * Providing a <code>ClientToken</code> makes the call to <code>Query</code> <i>idempotent</i>. This means that
     * running the same query repeatedly will produce the same result. In other words, making multiple identical
     * <code>Query</code> requests has the same effect as making a single request. When using <code>ClientToken</code>
     * in a query, note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the Query API is instantiated without a <code>ClientToken</code>, the Query SDK generates a
     * <code>ClientToken</code> on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>Query</code> invocation only contains the <code>ClientToken</code> but does not include a
     * <code>NextToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the invocation contains <code>NextToken</code>, that particular invocation is assumed to be a subsequent
     * invocation of a prior call to the Query API, and a result set is returned.
     * </p>
     * </li>
     * <li>
     * <p>
     * After 4 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clientToken
     *        Unique, case-sensitive string of up to 64 ASCII characters specified when a <code>Query</code> request is
     *        made. Providing a <code>ClientToken</code> makes the call to <code>Query</code> <i>idempotent</i>. This
     *        means that running the same query repeatedly will produce the same result. In other words, making multiple
     *        identical <code>Query</code> requests has the same effect as making a single request. When using
     *        <code>ClientToken</code> in a query, note the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the Query API is instantiated without a <code>ClientToken</code>, the Query SDK generates a
     *        <code>ClientToken</code> on your behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>Query</code> invocation only contains the <code>ClientToken</code> but does not include a
     *        <code>NextToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the invocation contains <code>NextToken</code>, that particular invocation is assumed to be a
     *        subsequent invocation of a prior call to the Query API, and a result set is returned.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        After 4 hours, any request with the same <code>ClientToken</code> is treated as a new request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A pagination token used to return a set of results. When the <code>Query</code> API is invoked using
     * <code>NextToken</code>, that particular invocation is assumed to be a subsequent invocation of a prior call to
     * <code>Query</code>, and a result set is returned. However, if the <code>Query</code> invocation only contains the
     * <code>ClientToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     * </p>
     * <p>
     * Note the following when using NextToken in a query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pagination token can be used for up to five <code>Query</code> invocations, OR for a duration of up to 1 hour –
     * whichever comes first.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using the same <code>NextToken</code> will return the same set of records. To keep paginating through the result
     * set, you must to use the most recent <code>nextToken</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose a <code>Query</code> invocation returns two <code>NextToken</code> values, <code>TokenA</code> and
     * <code>TokenB</code>. If <code>TokenB</code> is used in a subsequent <code>Query</code> invocation, then
     * <code>TokenA</code> is invalidated and cannot be reused.
     * </p>
     * </li>
     * <li>
     * <p>
     * To request a previous result set from a query after pagination has begun, you must re-invoke the Query API.
     * </p>
     * </li>
     * <li>
     * <p>
     * The latest <code>NextToken</code> should be used to paginate until <code>null</code> is returned, at which point
     * a new <code>NextToken</code> should be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and
     * the result reader do not have the same query string in the query requests, the query will fail with an
     * <code>Invalid pagination token</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nextToken
     *        A pagination token used to return a set of results. When the <code>Query</code> API is invoked using
     *        <code>NextToken</code>, that particular invocation is assumed to be a subsequent invocation of a prior
     *        call to <code>Query</code>, and a result set is returned. However, if the <code>Query</code> invocation
     *        only contains the <code>ClientToken</code>, that invocation of <code>Query</code> is assumed to be a new
     *        query run. </p>
     *        <p>
     *        Note the following when using NextToken in a query:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A pagination token can be used for up to five <code>Query</code> invocations, OR for a duration of up to 1
     *        hour – whichever comes first.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Using the same <code>NextToken</code> will return the same set of records. To keep paginating through the
     *        result set, you must to use the most recent <code>nextToken</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Suppose a <code>Query</code> invocation returns two <code>NextToken</code> values, <code>TokenA</code> and
     *        <code>TokenB</code>. If <code>TokenB</code> is used in a subsequent <code>Query</code> invocation, then
     *        <code>TokenA</code> is invalidated and cannot be reused.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To request a previous result set from a query after pagination has begun, you must re-invoke the Query
     *        API.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The latest <code>NextToken</code> should be used to paginate until <code>null</code> is returned, at which
     *        point a new <code>NextToken</code> should be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the IAM principal of the query initiator and the result reader are not the same and/or the query
     *        initiator and the result reader do not have the same query string in the query requests, the query will
     *        fail with an <code>Invalid pagination token</code> error.
     *        </p>
     *        </li>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token used to return a set of results. When the <code>Query</code> API is invoked using
     * <code>NextToken</code>, that particular invocation is assumed to be a subsequent invocation of a prior call to
     * <code>Query</code>, and a result set is returned. However, if the <code>Query</code> invocation only contains the
     * <code>ClientToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     * </p>
     * <p>
     * Note the following when using NextToken in a query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pagination token can be used for up to five <code>Query</code> invocations, OR for a duration of up to 1 hour –
     * whichever comes first.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using the same <code>NextToken</code> will return the same set of records. To keep paginating through the result
     * set, you must to use the most recent <code>nextToken</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose a <code>Query</code> invocation returns two <code>NextToken</code> values, <code>TokenA</code> and
     * <code>TokenB</code>. If <code>TokenB</code> is used in a subsequent <code>Query</code> invocation, then
     * <code>TokenA</code> is invalidated and cannot be reused.
     * </p>
     * </li>
     * <li>
     * <p>
     * To request a previous result set from a query after pagination has begun, you must re-invoke the Query API.
     * </p>
     * </li>
     * <li>
     * <p>
     * The latest <code>NextToken</code> should be used to paginate until <code>null</code> is returned, at which point
     * a new <code>NextToken</code> should be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and
     * the result reader do not have the same query string in the query requests, the query will fail with an
     * <code>Invalid pagination token</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A pagination token used to return a set of results. When the <code>Query</code> API is invoked using
     *         <code>NextToken</code>, that particular invocation is assumed to be a subsequent invocation of a prior
     *         call to <code>Query</code>, and a result set is returned. However, if the <code>Query</code> invocation
     *         only contains the <code>ClientToken</code>, that invocation of <code>Query</code> is assumed to be a new
     *         query run. </p>
     *         <p>
     *         Note the following when using NextToken in a query:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         A pagination token can be used for up to five <code>Query</code> invocations, OR for a duration of up to
     *         1 hour – whichever comes first.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Using the same <code>NextToken</code> will return the same set of records. To keep paginating through the
     *         result set, you must to use the most recent <code>nextToken</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Suppose a <code>Query</code> invocation returns two <code>NextToken</code> values, <code>TokenA</code>
     *         and <code>TokenB</code>. If <code>TokenB</code> is used in a subsequent <code>Query</code> invocation,
     *         then <code>TokenA</code> is invalidated and cannot be reused.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To request a previous result set from a query after pagination has begun, you must re-invoke the Query
     *         API.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The latest <code>NextToken</code> should be used to paginate until <code>null</code> is returned, at
     *         which point a new <code>NextToken</code> should be used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the IAM principal of the query initiator and the result reader are not the same and/or the query
     *         initiator and the result reader do not have the same query string in the query requests, the query will
     *         fail with an <code>Invalid pagination token</code> error.
     *         </p>
     *         </li>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token used to return a set of results. When the <code>Query</code> API is invoked using
     * <code>NextToken</code>, that particular invocation is assumed to be a subsequent invocation of a prior call to
     * <code>Query</code>, and a result set is returned. However, if the <code>Query</code> invocation only contains the
     * <code>ClientToken</code>, that invocation of <code>Query</code> is assumed to be a new query run.
     * </p>
     * <p>
     * Note the following when using NextToken in a query:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A pagination token can be used for up to five <code>Query</code> invocations, OR for a duration of up to 1 hour –
     * whichever comes first.
     * </p>
     * </li>
     * <li>
     * <p>
     * Using the same <code>NextToken</code> will return the same set of records. To keep paginating through the result
     * set, you must to use the most recent <code>nextToken</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Suppose a <code>Query</code> invocation returns two <code>NextToken</code> values, <code>TokenA</code> and
     * <code>TokenB</code>. If <code>TokenB</code> is used in a subsequent <code>Query</code> invocation, then
     * <code>TokenA</code> is invalidated and cannot be reused.
     * </p>
     * </li>
     * <li>
     * <p>
     * To request a previous result set from a query after pagination has begun, you must re-invoke the Query API.
     * </p>
     * </li>
     * <li>
     * <p>
     * The latest <code>NextToken</code> should be used to paginate until <code>null</code> is returned, at which point
     * a new <code>NextToken</code> should be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the IAM principal of the query initiator and the result reader are not the same and/or the query initiator and
     * the result reader do not have the same query string in the query requests, the query will fail with an
     * <code>Invalid pagination token</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nextToken
     *        A pagination token used to return a set of results. When the <code>Query</code> API is invoked using
     *        <code>NextToken</code>, that particular invocation is assumed to be a subsequent invocation of a prior
     *        call to <code>Query</code>, and a result set is returned. However, if the <code>Query</code> invocation
     *        only contains the <code>ClientToken</code>, that invocation of <code>Query</code> is assumed to be a new
     *        query run. </p>
     *        <p>
     *        Note the following when using NextToken in a query:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        A pagination token can be used for up to five <code>Query</code> invocations, OR for a duration of up to 1
     *        hour – whichever comes first.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Using the same <code>NextToken</code> will return the same set of records. To keep paginating through the
     *        result set, you must to use the most recent <code>nextToken</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Suppose a <code>Query</code> invocation returns two <code>NextToken</code> values, <code>TokenA</code> and
     *        <code>TokenB</code>. If <code>TokenB</code> is used in a subsequent <code>Query</code> invocation, then
     *        <code>TokenA</code> is invalidated and cannot be reused.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To request a previous result set from a query after pagination has begun, you must re-invoke the Query
     *        API.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The latest <code>NextToken</code> should be used to paginate until <code>null</code> is returned, at which
     *        point a new <code>NextToken</code> should be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the IAM principal of the query initiator and the result reader are not the same and/or the query
     *        initiator and the result reader do not have the same query string in the query requests, the query will
     *        fail with an <code>Invalid pagination token</code> error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of rows to be returned in the <code>Query</code> output. The initial run of <code>Query</code>
     * with a <code>MaxRows</code> value specified will return the result set of the query in two cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The size of the result is less than <code>1MB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of rows in the result set is less than the value of <code>maxRows</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, the initial invocation of <code>Query</code> only returns a <code>NextToken</code>, which can then be
     * used in subsequent calls to fetch the result set. To resume pagination, provide the <code>NextToken</code> value
     * in the subsequent command.
     * </p>
     * <p>
     * If the row size is large (e.g. a row has many columns), Timestream may return fewer rows to keep the response
     * size from exceeding the 1 MB limit. If <code>MaxRows</code> is not provided, Timestream will send the necessary
     * number of rows to meet the 1 MB limit.
     * </p>
     * 
     * @param maxRows
     *        The total number of rows to be returned in the <code>Query</code> output. The initial run of
     *        <code>Query</code> with a <code>MaxRows</code> value specified will return the result set of the query in
     *        two cases: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The size of the result is less than <code>1MB</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The number of rows in the result set is less than the value of <code>maxRows</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Otherwise, the initial invocation of <code>Query</code> only returns a <code>NextToken</code>, which can
     *        then be used in subsequent calls to fetch the result set. To resume pagination, provide the
     *        <code>NextToken</code> value in the subsequent command.
     *        </p>
     *        <p>
     *        If the row size is large (e.g. a row has many columns), Timestream may return fewer rows to keep the
     *        response size from exceeding the 1 MB limit. If <code>MaxRows</code> is not provided, Timestream will send
     *        the necessary number of rows to meet the 1 MB limit.
     */

    public void setMaxRows(Integer maxRows) {
        this.maxRows = maxRows;
    }

    /**
     * <p>
     * The total number of rows to be returned in the <code>Query</code> output. The initial run of <code>Query</code>
     * with a <code>MaxRows</code> value specified will return the result set of the query in two cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The size of the result is less than <code>1MB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of rows in the result set is less than the value of <code>maxRows</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, the initial invocation of <code>Query</code> only returns a <code>NextToken</code>, which can then be
     * used in subsequent calls to fetch the result set. To resume pagination, provide the <code>NextToken</code> value
     * in the subsequent command.
     * </p>
     * <p>
     * If the row size is large (e.g. a row has many columns), Timestream may return fewer rows to keep the response
     * size from exceeding the 1 MB limit. If <code>MaxRows</code> is not provided, Timestream will send the necessary
     * number of rows to meet the 1 MB limit.
     * </p>
     * 
     * @return The total number of rows to be returned in the <code>Query</code> output. The initial run of
     *         <code>Query</code> with a <code>MaxRows</code> value specified will return the result set of the query in
     *         two cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The size of the result is less than <code>1MB</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The number of rows in the result set is less than the value of <code>maxRows</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Otherwise, the initial invocation of <code>Query</code> only returns a <code>NextToken</code>, which can
     *         then be used in subsequent calls to fetch the result set. To resume pagination, provide the
     *         <code>NextToken</code> value in the subsequent command.
     *         </p>
     *         <p>
     *         If the row size is large (e.g. a row has many columns), Timestream may return fewer rows to keep the
     *         response size from exceeding the 1 MB limit. If <code>MaxRows</code> is not provided, Timestream will
     *         send the necessary number of rows to meet the 1 MB limit.
     */

    public Integer getMaxRows() {
        return this.maxRows;
    }

    /**
     * <p>
     * The total number of rows to be returned in the <code>Query</code> output. The initial run of <code>Query</code>
     * with a <code>MaxRows</code> value specified will return the result set of the query in two cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The size of the result is less than <code>1MB</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The number of rows in the result set is less than the value of <code>maxRows</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Otherwise, the initial invocation of <code>Query</code> only returns a <code>NextToken</code>, which can then be
     * used in subsequent calls to fetch the result set. To resume pagination, provide the <code>NextToken</code> value
     * in the subsequent command.
     * </p>
     * <p>
     * If the row size is large (e.g. a row has many columns), Timestream may return fewer rows to keep the response
     * size from exceeding the 1 MB limit. If <code>MaxRows</code> is not provided, Timestream will send the necessary
     * number of rows to meet the 1 MB limit.
     * </p>
     * 
     * @param maxRows
     *        The total number of rows to be returned in the <code>Query</code> output. The initial run of
     *        <code>Query</code> with a <code>MaxRows</code> value specified will return the result set of the query in
     *        two cases: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The size of the result is less than <code>1MB</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The number of rows in the result set is less than the value of <code>maxRows</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Otherwise, the initial invocation of <code>Query</code> only returns a <code>NextToken</code>, which can
     *        then be used in subsequent calls to fetch the result set. To resume pagination, provide the
     *        <code>NextToken</code> value in the subsequent command.
     *        </p>
     *        <p>
     *        If the row size is large (e.g. a row has many columns), Timestream may return fewer rows to keep the
     *        response size from exceeding the 1 MB limit. If <code>MaxRows</code> is not provided, Timestream will send
     *        the necessary number of rows to meet the 1 MB limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withMaxRows(Integer maxRows) {
        setMaxRows(maxRows);
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
        if (getQueryString() != null)
            sb.append("QueryString: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxRows() != null)
            sb.append("MaxRows: ").append(getMaxRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRequest == false)
            return false;
        QueryRequest other = (QueryRequest) obj;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRows() == null ^ this.getMaxRows() == null)
            return false;
        if (other.getMaxRows() != null && other.getMaxRows().equals(this.getMaxRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRows() == null) ? 0 : getMaxRows().hashCode());
        return hashCode;
    }

    @Override
    public QueryRequest clone() {
        return (QueryRequest) super.clone();
    }

}
