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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SearchGameSessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchGameSessionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet to search for active game sessions. Each request must reference either a fleet ID
     * or alias ID, but not both.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for an alias associated with the fleet to search for active game sessions. Each request must
     * reference either a fleet ID or alias ID, but not both.
     * </p>
     */
    private String aliasId;
    /**
     * <p>
     * String containing the search criteria for the session search. If no filter expression is included, the request
     * returns results for all game sessions in the fleet that are in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * A filter expression can contain one or multiple conditions. Each condition consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     * <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     * <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Comparator</b> -- Valid comparators are: <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>,
     * <code>&gt;</code>, <code>&lt;=</code>, <code>&gt;=</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Value</b> -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings depending
     * on the operand. String values are case sensitive and must be enclosed in single quotes. Special characters must
     * be escaped. Boolean and string values can only be used with the comparators <code>=</code> and
     * <code>&lt;&gt;</code>. For example, the following filter expression searches on <code>gameSessionName</code>: "
     * <code>FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'"</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To chain multiple conditions in a single expression, use the logical keywords <code>AND</code>, <code>OR</code>,
     * and <code>NOT</code> and parentheses as needed. For example: <code>x AND y AND NOT z</code>,
     * <code>NOT (x OR y)</code>.
     * </p>
     * <p>
     * Session search evaluates conditions from left to right using the following precedence rules:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>&lt;=</code>,
     * <code>&gt;=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Parentheses
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT
     * </p>
     * </li>
     * <li>
     * <p>
     * AND
     * </p>
     * </li>
     * <li>
     * <p>
     * OR
     * </p>
     * </li>
     * </ol>
     * <p>
     * For example, this filter expression retrieves game sessions hosting at least ten players that have an open player
     * slot: <code>"maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true"</code>.
     * </p>
     */
    private String filterExpression;
    /**
     * <p>
     * Instructions on how to sort the search results. If no sort expression is included, the request returns results in
     * random order. A sort expression consists of the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     * <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     * <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Order</b> -- Valid sort orders are <code>ASC</code> (ascending) and <code>DESC</code> (descending).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, this sort expression returns the oldest active sessions first:
     * <code>"SortExpression": "creationTimeMillis ASC"</code>. Results with a null value for the sort operand are
     * returned at the end of the list.
     * </p>
     */
    private String sortExpression;
    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages. The maximum number of results returned is 20, even if this value is not set or is set higher
     * than 20.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for a fleet to search for active game sessions. Each request must reference either a fleet ID
     * or alias ID, but not both.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to search for active game sessions. Each request must reference either a
     *        fleet ID or alias ID, but not both.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to search for active game sessions. Each request must reference either a fleet ID
     * or alias ID, but not both.
     * </p>
     * 
     * @return Unique identifier for a fleet to search for active game sessions. Each request must reference either a
     *         fleet ID or alias ID, but not both.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to search for active game sessions. Each request must reference either a fleet ID
     * or alias ID, but not both.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to search for active game sessions. Each request must reference either a
     *        fleet ID or alias ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for an alias associated with the fleet to search for active game sessions. Each request must
     * reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for an alias associated with the fleet to search for active game sessions. Each request
     *        must reference either a fleet ID or alias ID, but not both.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * Unique identifier for an alias associated with the fleet to search for active game sessions. Each request must
     * reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @return Unique identifier for an alias associated with the fleet to search for active game sessions. Each request
     *         must reference either a fleet ID or alias ID, but not both.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * Unique identifier for an alias associated with the fleet to search for active game sessions. Each request must
     * reference either a fleet ID or alias ID, but not both.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for an alias associated with the fleet to search for active game sessions. Each request
     *        must reference either a fleet ID or alias ID, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * <p>
     * String containing the search criteria for the session search. If no filter expression is included, the request
     * returns results for all game sessions in the fleet that are in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * A filter expression can contain one or multiple conditions. Each condition consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     * <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     * <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Comparator</b> -- Valid comparators are: <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>,
     * <code>&gt;</code>, <code>&lt;=</code>, <code>&gt;=</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Value</b> -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings depending
     * on the operand. String values are case sensitive and must be enclosed in single quotes. Special characters must
     * be escaped. Boolean and string values can only be used with the comparators <code>=</code> and
     * <code>&lt;&gt;</code>. For example, the following filter expression searches on <code>gameSessionName</code>: "
     * <code>FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'"</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To chain multiple conditions in a single expression, use the logical keywords <code>AND</code>, <code>OR</code>,
     * and <code>NOT</code> and parentheses as needed. For example: <code>x AND y AND NOT z</code>,
     * <code>NOT (x OR y)</code>.
     * </p>
     * <p>
     * Session search evaluates conditions from left to right using the following precedence rules:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>&lt;=</code>,
     * <code>&gt;=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Parentheses
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT
     * </p>
     * </li>
     * <li>
     * <p>
     * AND
     * </p>
     * </li>
     * <li>
     * <p>
     * OR
     * </p>
     * </li>
     * </ol>
     * <p>
     * For example, this filter expression retrieves game sessions hosting at least ten players that have an open player
     * slot: <code>"maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true"</code>.
     * </p>
     * 
     * @param filterExpression
     *        String containing the search criteria for the session search. If no filter expression is included, the
     *        request returns results for all game sessions in the fleet that are in <code>ACTIVE</code> status.</p>
     *        <p>
     *        A filter expression can contain one or multiple conditions. Each condition consists of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     *        <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     *        <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Comparator</b> -- Valid comparators are: <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>,
     *        <code>&gt;</code>, <code>&lt;=</code>, <code>&gt;=</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Value</b> -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings
     *        depending on the operand. String values are case sensitive and must be enclosed in single quotes. Special
     *        characters must be escaped. Boolean and string values can only be used with the comparators <code>=</code>
     *        and <code>&lt;&gt;</code>. For example, the following filter expression searches on
     *        <code>gameSessionName</code>: "
     *        <code>FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'"</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To chain multiple conditions in a single expression, use the logical keywords <code>AND</code>,
     *        <code>OR</code>, and <code>NOT</code> and parentheses as needed. For example:
     *        <code>x AND y AND NOT z</code>, <code>NOT (x OR y)</code>.
     *        </p>
     *        <p>
     *        Session search evaluates conditions from left to right using the following precedence rules:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>&lt;=</code>,
     *        <code>&gt;=</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Parentheses
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OR
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For example, this filter expression retrieves game sessions hosting at least ten players that have an open
     *        player slot: <code>"maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true"</code>.
     */

    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * <p>
     * String containing the search criteria for the session search. If no filter expression is included, the request
     * returns results for all game sessions in the fleet that are in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * A filter expression can contain one or multiple conditions. Each condition consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     * <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     * <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Comparator</b> -- Valid comparators are: <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>,
     * <code>&gt;</code>, <code>&lt;=</code>, <code>&gt;=</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Value</b> -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings depending
     * on the operand. String values are case sensitive and must be enclosed in single quotes. Special characters must
     * be escaped. Boolean and string values can only be used with the comparators <code>=</code> and
     * <code>&lt;&gt;</code>. For example, the following filter expression searches on <code>gameSessionName</code>: "
     * <code>FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'"</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To chain multiple conditions in a single expression, use the logical keywords <code>AND</code>, <code>OR</code>,
     * and <code>NOT</code> and parentheses as needed. For example: <code>x AND y AND NOT z</code>,
     * <code>NOT (x OR y)</code>.
     * </p>
     * <p>
     * Session search evaluates conditions from left to right using the following precedence rules:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>&lt;=</code>,
     * <code>&gt;=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Parentheses
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT
     * </p>
     * </li>
     * <li>
     * <p>
     * AND
     * </p>
     * </li>
     * <li>
     * <p>
     * OR
     * </p>
     * </li>
     * </ol>
     * <p>
     * For example, this filter expression retrieves game sessions hosting at least ten players that have an open player
     * slot: <code>"maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true"</code>.
     * </p>
     * 
     * @return String containing the search criteria for the session search. If no filter expression is included, the
     *         request returns results for all game sessions in the fleet that are in <code>ACTIVE</code> status.</p>
     *         <p>
     *         A filter expression can contain one or multiple conditions. Each condition consists of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     *         <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     *         <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Comparator</b> -- Valid comparators are: <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>,
     *         <code>&gt;</code>, <code>&lt;=</code>, <code>&gt;=</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Value</b> -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings
     *         depending on the operand. String values are case sensitive and must be enclosed in single quotes. Special
     *         characters must be escaped. Boolean and string values can only be used with the comparators
     *         <code>=</code> and <code>&lt;&gt;</code>. For example, the following filter expression searches on
     *         <code>gameSessionName</code>: "
     *         <code>FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'"</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To chain multiple conditions in a single expression, use the logical keywords <code>AND</code>,
     *         <code>OR</code>, and <code>NOT</code> and parentheses as needed. For example:
     *         <code>x AND y AND NOT z</code>, <code>NOT (x OR y)</code>.
     *         </p>
     *         <p>
     *         Session search evaluates conditions from left to right using the following precedence rules:
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>&lt;=</code>,
     *         <code>&gt;=</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Parentheses
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NOT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AND
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OR
     *         </p>
     *         </li>
     *         </ol>
     *         <p>
     *         For example, this filter expression retrieves game sessions hosting at least ten players that have an
     *         open player slot: <code>"maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true"</code>.
     */

    public String getFilterExpression() {
        return this.filterExpression;
    }

    /**
     * <p>
     * String containing the search criteria for the session search. If no filter expression is included, the request
     * returns results for all game sessions in the fleet that are in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * A filter expression can contain one or multiple conditions. Each condition consists of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     * <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     * <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Comparator</b> -- Valid comparators are: <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>,
     * <code>&gt;</code>, <code>&lt;=</code>, <code>&gt;=</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Value</b> -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings depending
     * on the operand. String values are case sensitive and must be enclosed in single quotes. Special characters must
     * be escaped. Boolean and string values can only be used with the comparators <code>=</code> and
     * <code>&lt;&gt;</code>. For example, the following filter expression searches on <code>gameSessionName</code>: "
     * <code>FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'"</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To chain multiple conditions in a single expression, use the logical keywords <code>AND</code>, <code>OR</code>,
     * and <code>NOT</code> and parentheses as needed. For example: <code>x AND y AND NOT z</code>,
     * <code>NOT (x OR y)</code>.
     * </p>
     * <p>
     * Session search evaluates conditions from left to right using the following precedence rules:
     * </p>
     * <ol>
     * <li>
     * <p>
     * <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>&lt;=</code>,
     * <code>&gt;=</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Parentheses
     * </p>
     * </li>
     * <li>
     * <p>
     * NOT
     * </p>
     * </li>
     * <li>
     * <p>
     * AND
     * </p>
     * </li>
     * <li>
     * <p>
     * OR
     * </p>
     * </li>
     * </ol>
     * <p>
     * For example, this filter expression retrieves game sessions hosting at least ten players that have an open player
     * slot: <code>"maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true"</code>.
     * </p>
     * 
     * @param filterExpression
     *        String containing the search criteria for the session search. If no filter expression is included, the
     *        request returns results for all game sessions in the fleet that are in <code>ACTIVE</code> status.</p>
     *        <p>
     *        A filter expression can contain one or multiple conditions. Each condition consists of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     *        <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     *        <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Comparator</b> -- Valid comparators are: <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>,
     *        <code>&gt;</code>, <code>&lt;=</code>, <code>&gt;=</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Value</b> -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings
     *        depending on the operand. String values are case sensitive and must be enclosed in single quotes. Special
     *        characters must be escaped. Boolean and string values can only be used with the comparators <code>=</code>
     *        and <code>&lt;&gt;</code>. For example, the following filter expression searches on
     *        <code>gameSessionName</code>: "
     *        <code>FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'"</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To chain multiple conditions in a single expression, use the logical keywords <code>AND</code>,
     *        <code>OR</code>, and <code>NOT</code> and parentheses as needed. For example:
     *        <code>x AND y AND NOT z</code>, <code>NOT (x OR y)</code>.
     *        </p>
     *        <p>
     *        Session search evaluates conditions from left to right using the following precedence rules:
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        <code>=</code>, <code>&lt;&gt;</code>, <code>&lt;</code>, <code>&gt;</code>, <code>&lt;=</code>,
     *        <code>&gt;=</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Parentheses
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NOT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AND
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OR
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For example, this filter expression retrieves game sessions hosting at least ten players that have an open
     *        player slot: <code>"maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsRequest withFilterExpression(String filterExpression) {
        setFilterExpression(filterExpression);
        return this;
    }

    /**
     * <p>
     * Instructions on how to sort the search results. If no sort expression is included, the request returns results in
     * random order. A sort expression consists of the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     * <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     * <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Order</b> -- Valid sort orders are <code>ASC</code> (ascending) and <code>DESC</code> (descending).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, this sort expression returns the oldest active sessions first:
     * <code>"SortExpression": "creationTimeMillis ASC"</code>. Results with a null value for the sort operand are
     * returned at the end of the list.
     * </p>
     * 
     * @param sortExpression
     *        Instructions on how to sort the search results. If no sort expression is included, the request returns
     *        results in random order. A sort expression consists of the following elements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     *        <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     *        <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Order</b> -- Valid sort orders are <code>ASC</code> (ascending) and <code>DESC</code> (descending).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, this sort expression returns the oldest active sessions first:
     *        <code>"SortExpression": "creationTimeMillis ASC"</code>. Results with a null value for the sort operand
     *        are returned at the end of the list.
     */

    public void setSortExpression(String sortExpression) {
        this.sortExpression = sortExpression;
    }

    /**
     * <p>
     * Instructions on how to sort the search results. If no sort expression is included, the request returns results in
     * random order. A sort expression consists of the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     * <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     * <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Order</b> -- Valid sort orders are <code>ASC</code> (ascending) and <code>DESC</code> (descending).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, this sort expression returns the oldest active sessions first:
     * <code>"SortExpression": "creationTimeMillis ASC"</code>. Results with a null value for the sort operand are
     * returned at the end of the list.
     * </p>
     * 
     * @return Instructions on how to sort the search results. If no sort expression is included, the request returns
     *         results in random order. A sort expression consists of the following elements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     *         <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     *         <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Order</b> -- Valid sort orders are <code>ASC</code> (ascending) and <code>DESC</code> (descending).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, this sort expression returns the oldest active sessions first:
     *         <code>"SortExpression": "creationTimeMillis ASC"</code>. Results with a null value for the sort operand
     *         are returned at the end of the list.
     */

    public String getSortExpression() {
        return this.sortExpression;
    }

    /**
     * <p>
     * Instructions on how to sort the search results. If no sort expression is included, the request returns results in
     * random order. A sort expression consists of the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     * <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     * <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Order</b> -- Valid sort orders are <code>ASC</code> (ascending) and <code>DESC</code> (descending).
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, this sort expression returns the oldest active sessions first:
     * <code>"SortExpression": "creationTimeMillis ASC"</code>. Results with a null value for the sort operand are
     * returned at the end of the list.
     * </p>
     * 
     * @param sortExpression
     *        Instructions on how to sort the search results. If no sort expression is included, the request returns
     *        results in random order. A sort expression consists of the following elements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Operand</b> -- Name of a game session attribute. Valid values are <code>gameSessionName</code>,
     *        <code>gameSessionId</code>, <code>gameSessionProperties</code>, <code>maximumSessions</code>,
     *        <code>creationTimeMillis</code>, <code>playerSessionCount</code>, <code>hasAvailablePlayerSessions</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Order</b> -- Valid sort orders are <code>ASC</code> (ascending) and <code>DESC</code> (descending).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, this sort expression returns the oldest active sessions first:
     *        <code>"SortExpression": "creationTimeMillis ASC"</code>. Results with a null value for the sort operand
     *        are returned at the end of the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsRequest withSortExpression(String sortExpression) {
        setSortExpression(sortExpression);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages. The maximum number of results returned is 20, even if this value is not set or is set higher
     * than 20.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages. The maximum number of results returned is 20, even if this value is not set or is
     *        set higher than 20.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages. The maximum number of results returned is 20, even if this value is not set or is set higher
     * than 20.
     * </p>
     * 
     * @return Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *         set of sequential pages. The maximum number of results returned is 20, even if this value is not set or
     *         is set higher than 20.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a set of
     * sequential pages. The maximum number of results returned is 20, even if this value is not set or is set higher
     * than 20.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. Use this parameter with <code>NextToken</code> to get results as a
     *        set of sequential pages. The maximum number of results returned is 20, even if this value is not set or is
     *        set higher than 20.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates the start of the next sequential page of results. Use the token that is returned with
     *        a previous call to this action. To start at the beginning of the result set, do not specify a value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @return Token that indicates the start of the next sequential page of results. Use the token that is returned
     *         with a previous call to this action. To start at the beginning of the result set, do not specify a value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token that indicates the start of the next sequential page of results. Use the token that is returned with a
     * previous call to this action. To start at the beginning of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token that indicates the start of the next sequential page of results. Use the token that is returned with
     *        a previous call to this action. To start at the beginning of the result set, do not specify a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGameSessionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId()).append(",");
        if (getFilterExpression() != null)
            sb.append("FilterExpression: ").append(getFilterExpression()).append(",");
        if (getSortExpression() != null)
            sb.append("SortExpression: ").append(getSortExpression()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchGameSessionsRequest == false)
            return false;
        SearchGameSessionsRequest other = (SearchGameSessionsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        if (other.getFilterExpression() == null ^ this.getFilterExpression() == null)
            return false;
        if (other.getFilterExpression() != null && other.getFilterExpression().equals(this.getFilterExpression()) == false)
            return false;
        if (other.getSortExpression() == null ^ this.getSortExpression() == null)
            return false;
        if (other.getSortExpression() != null && other.getSortExpression().equals(this.getSortExpression()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        hashCode = prime * hashCode + ((getFilterExpression() == null) ? 0 : getFilterExpression().hashCode());
        hashCode = prime * hashCode + ((getSortExpression() == null) ? 0 : getSortExpression().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchGameSessionsRequest clone() {
        return (SearchGameSessionsRequest) super.clone();
    }

}
