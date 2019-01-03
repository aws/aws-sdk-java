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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPartitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPartitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * An expression filtering the partitions to be returned.
     * </p>
     * <p>
     * The expression uses SQL syntax similar to the SQL <code>WHERE</code> filter clause. The SQL statement parser <a
     * href="http://jsqlparser.sourceforge.net/home.php">JSQLParser</a> parses the expression.
     * </p>
     * <p>
     * <i>Operators</i>: The following are the operators that you can use in the <code>Expression</code> API call:
     * </p>
     * <dl>
     * <dt>=</dt>
     * <dd>
     * <p>
     * Checks if the values of the two operands are equal or not; if yes, then the condition becomes true.
     * </p>
     * <p>
     * Example: Assume 'variable a' holds 10 and 'variable b' holds 20.
     * </p>
     * <p>
     * (a = b) is not true.
     * </p>
     * </dd>
     * <dt>&lt; &gt;</dt>
     * <dd>
     * <p>
     * Checks if the values of two operands are equal or not; if the values are not equal, then the condition becomes
     * true.
     * </p>
     * <p>
     * Example: (a &lt; &gt; b) is true.
     * </p>
     * </dd>
     * <dt>&gt;</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is greater than the value of the right operand; if yes, then the
     * condition becomes true.
     * </p>
     * <p>
     * Example: (a &gt; b) is not true.
     * </p>
     * </dd>
     * <dt>&lt;</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is less than the value of the right operand; if yes, then the condition
     * becomes true.
     * </p>
     * <p>
     * Example: (a &lt; b) is true.
     * </p>
     * </dd>
     * <dt>&gt;=</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is greater than or equal to the value of the right operand; if yes, then
     * the condition becomes true.
     * </p>
     * <p>
     * Example: (a &gt;= b) is not true.
     * </p>
     * </dd>
     * <dt>&lt;=</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is less than or equal to the value of the right operand; if yes, then the
     * condition becomes true.
     * </p>
     * <p>
     * Example: (a &lt;= b) is true.
     * </p>
     * </dd>
     * <dt>AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL</dt>
     * <dd>
     * <p>
     * Logical operators.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <i>Supported Partition Key Types</i>: The following are the the supported partition keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>date</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>int</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bigint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>long</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tinyint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>smallint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>decimal</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If an invalid type is encountered, an exception is thrown.
     * </p>
     * <p>
     * The following list shows the valid operators on each type. When you define a crawler, the
     * <code>partitionKey</code> type is created as a <code>STRING</code>, to be compatible with the catalog partitions.
     * </p>
     * <p>
     * <i>Sample API Call</i>:
     * </p>
     */
    private String expression;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these partitions.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The segment of the table's partitions to scan in this request.
     * </p>
     */
    private Segment segment;
    /**
     * <p>
     * The maximum number of partitions to return in a single response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account
     *        ID is used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account
     *         ID is used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is
     * used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account
     *        ID is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the partitions reside.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @return The name of the catalog database where the partitions reside.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the catalog database where the partitions reside.
     * </p>
     * 
     * @param databaseName
     *        The name of the catalog database where the partitions reside.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @param tableName
     *        The name of the partitions' table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @return The name of the partitions' table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the partitions' table.
     * </p>
     * 
     * @param tableName
     *        The name of the partitions' table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * An expression filtering the partitions to be returned.
     * </p>
     * <p>
     * The expression uses SQL syntax similar to the SQL <code>WHERE</code> filter clause. The SQL statement parser <a
     * href="http://jsqlparser.sourceforge.net/home.php">JSQLParser</a> parses the expression.
     * </p>
     * <p>
     * <i>Operators</i>: The following are the operators that you can use in the <code>Expression</code> API call:
     * </p>
     * <dl>
     * <dt>=</dt>
     * <dd>
     * <p>
     * Checks if the values of the two operands are equal or not; if yes, then the condition becomes true.
     * </p>
     * <p>
     * Example: Assume 'variable a' holds 10 and 'variable b' holds 20.
     * </p>
     * <p>
     * (a = b) is not true.
     * </p>
     * </dd>
     * <dt>&lt; &gt;</dt>
     * <dd>
     * <p>
     * Checks if the values of two operands are equal or not; if the values are not equal, then the condition becomes
     * true.
     * </p>
     * <p>
     * Example: (a &lt; &gt; b) is true.
     * </p>
     * </dd>
     * <dt>&gt;</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is greater than the value of the right operand; if yes, then the
     * condition becomes true.
     * </p>
     * <p>
     * Example: (a &gt; b) is not true.
     * </p>
     * </dd>
     * <dt>&lt;</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is less than the value of the right operand; if yes, then the condition
     * becomes true.
     * </p>
     * <p>
     * Example: (a &lt; b) is true.
     * </p>
     * </dd>
     * <dt>&gt;=</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is greater than or equal to the value of the right operand; if yes, then
     * the condition becomes true.
     * </p>
     * <p>
     * Example: (a &gt;= b) is not true.
     * </p>
     * </dd>
     * <dt>&lt;=</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is less than or equal to the value of the right operand; if yes, then the
     * condition becomes true.
     * </p>
     * <p>
     * Example: (a &lt;= b) is true.
     * </p>
     * </dd>
     * <dt>AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL</dt>
     * <dd>
     * <p>
     * Logical operators.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <i>Supported Partition Key Types</i>: The following are the the supported partition keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>date</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>int</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bigint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>long</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tinyint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>smallint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>decimal</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If an invalid type is encountered, an exception is thrown.
     * </p>
     * <p>
     * The following list shows the valid operators on each type. When you define a crawler, the
     * <code>partitionKey</code> type is created as a <code>STRING</code>, to be compatible with the catalog partitions.
     * </p>
     * <p>
     * <i>Sample API Call</i>:
     * </p>
     * 
     * @param expression
     *        An expression filtering the partitions to be returned.</p>
     *        <p>
     *        The expression uses SQL syntax similar to the SQL <code>WHERE</code> filter clause. The SQL statement
     *        parser <a href="http://jsqlparser.sourceforge.net/home.php">JSQLParser</a> parses the expression.
     *        </p>
     *        <p>
     *        <i>Operators</i>: The following are the operators that you can use in the <code>Expression</code> API
     *        call:
     *        </p>
     *        <dl>
     *        <dt>=</dt>
     *        <dd>
     *        <p>
     *        Checks if the values of the two operands are equal or not; if yes, then the condition becomes true.
     *        </p>
     *        <p>
     *        Example: Assume 'variable a' holds 10 and 'variable b' holds 20.
     *        </p>
     *        <p>
     *        (a = b) is not true.
     *        </p>
     *        </dd>
     *        <dt>&lt; &gt;</dt>
     *        <dd>
     *        <p>
     *        Checks if the values of two operands are equal or not; if the values are not equal, then the condition
     *        becomes true.
     *        </p>
     *        <p>
     *        Example: (a &lt; &gt; b) is true.
     *        </p>
     *        </dd>
     *        <dt>&gt;</dt>
     *        <dd>
     *        <p>
     *        Checks if the value of the left operand is greater than the value of the right operand; if yes, then the
     *        condition becomes true.
     *        </p>
     *        <p>
     *        Example: (a &gt; b) is not true.
     *        </p>
     *        </dd>
     *        <dt>&lt;</dt>
     *        <dd>
     *        <p>
     *        Checks if the value of the left operand is less than the value of the right operand; if yes, then the
     *        condition becomes true.
     *        </p>
     *        <p>
     *        Example: (a &lt; b) is true.
     *        </p>
     *        </dd>
     *        <dt>&gt;=</dt>
     *        <dd>
     *        <p>
     *        Checks if the value of the left operand is greater than or equal to the value of the right operand; if
     *        yes, then the condition becomes true.
     *        </p>
     *        <p>
     *        Example: (a &gt;= b) is not true.
     *        </p>
     *        </dd>
     *        <dt>&lt;=</dt>
     *        <dd>
     *        <p>
     *        Checks if the value of the left operand is less than or equal to the value of the right operand; if yes,
     *        then the condition becomes true.
     *        </p>
     *        <p>
     *        Example: (a &lt;= b) is true.
     *        </p>
     *        </dd>
     *        <dt>AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL</dt>
     *        <dd>
     *        <p>
     *        Logical operators.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        <i>Supported Partition Key Types</i>: The following are the the supported partition keys.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>string</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>date</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>timestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>int</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bigint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>long</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tinyint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>smallint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>decimal</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If an invalid type is encountered, an exception is thrown.
     *        </p>
     *        <p>
     *        The following list shows the valid operators on each type. When you define a crawler, the
     *        <code>partitionKey</code> type is created as a <code>STRING</code>, to be compatible with the catalog
     *        partitions.
     *        </p>
     *        <p>
     *        <i>Sample API Call</i>:
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * An expression filtering the partitions to be returned.
     * </p>
     * <p>
     * The expression uses SQL syntax similar to the SQL <code>WHERE</code> filter clause. The SQL statement parser <a
     * href="http://jsqlparser.sourceforge.net/home.php">JSQLParser</a> parses the expression.
     * </p>
     * <p>
     * <i>Operators</i>: The following are the operators that you can use in the <code>Expression</code> API call:
     * </p>
     * <dl>
     * <dt>=</dt>
     * <dd>
     * <p>
     * Checks if the values of the two operands are equal or not; if yes, then the condition becomes true.
     * </p>
     * <p>
     * Example: Assume 'variable a' holds 10 and 'variable b' holds 20.
     * </p>
     * <p>
     * (a = b) is not true.
     * </p>
     * </dd>
     * <dt>&lt; &gt;</dt>
     * <dd>
     * <p>
     * Checks if the values of two operands are equal or not; if the values are not equal, then the condition becomes
     * true.
     * </p>
     * <p>
     * Example: (a &lt; &gt; b) is true.
     * </p>
     * </dd>
     * <dt>&gt;</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is greater than the value of the right operand; if yes, then the
     * condition becomes true.
     * </p>
     * <p>
     * Example: (a &gt; b) is not true.
     * </p>
     * </dd>
     * <dt>&lt;</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is less than the value of the right operand; if yes, then the condition
     * becomes true.
     * </p>
     * <p>
     * Example: (a &lt; b) is true.
     * </p>
     * </dd>
     * <dt>&gt;=</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is greater than or equal to the value of the right operand; if yes, then
     * the condition becomes true.
     * </p>
     * <p>
     * Example: (a &gt;= b) is not true.
     * </p>
     * </dd>
     * <dt>&lt;=</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is less than or equal to the value of the right operand; if yes, then the
     * condition becomes true.
     * </p>
     * <p>
     * Example: (a &lt;= b) is true.
     * </p>
     * </dd>
     * <dt>AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL</dt>
     * <dd>
     * <p>
     * Logical operators.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <i>Supported Partition Key Types</i>: The following are the the supported partition keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>date</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>int</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bigint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>long</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tinyint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>smallint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>decimal</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If an invalid type is encountered, an exception is thrown.
     * </p>
     * <p>
     * The following list shows the valid operators on each type. When you define a crawler, the
     * <code>partitionKey</code> type is created as a <code>STRING</code>, to be compatible with the catalog partitions.
     * </p>
     * <p>
     * <i>Sample API Call</i>:
     * </p>
     * 
     * @return An expression filtering the partitions to be returned.</p>
     *         <p>
     *         The expression uses SQL syntax similar to the SQL <code>WHERE</code> filter clause. The SQL statement
     *         parser <a href="http://jsqlparser.sourceforge.net/home.php">JSQLParser</a> parses the expression.
     *         </p>
     *         <p>
     *         <i>Operators</i>: The following are the operators that you can use in the <code>Expression</code> API
     *         call:
     *         </p>
     *         <dl>
     *         <dt>=</dt>
     *         <dd>
     *         <p>
     *         Checks if the values of the two operands are equal or not; if yes, then the condition becomes true.
     *         </p>
     *         <p>
     *         Example: Assume 'variable a' holds 10 and 'variable b' holds 20.
     *         </p>
     *         <p>
     *         (a = b) is not true.
     *         </p>
     *         </dd>
     *         <dt>&lt; &gt;</dt>
     *         <dd>
     *         <p>
     *         Checks if the values of two operands are equal or not; if the values are not equal, then the condition
     *         becomes true.
     *         </p>
     *         <p>
     *         Example: (a &lt; &gt; b) is true.
     *         </p>
     *         </dd>
     *         <dt>&gt;</dt>
     *         <dd>
     *         <p>
     *         Checks if the value of the left operand is greater than the value of the right operand; if yes, then the
     *         condition becomes true.
     *         </p>
     *         <p>
     *         Example: (a &gt; b) is not true.
     *         </p>
     *         </dd>
     *         <dt>&lt;</dt>
     *         <dd>
     *         <p>
     *         Checks if the value of the left operand is less than the value of the right operand; if yes, then the
     *         condition becomes true.
     *         </p>
     *         <p>
     *         Example: (a &lt; b) is true.
     *         </p>
     *         </dd>
     *         <dt>&gt;=</dt>
     *         <dd>
     *         <p>
     *         Checks if the value of the left operand is greater than or equal to the value of the right operand; if
     *         yes, then the condition becomes true.
     *         </p>
     *         <p>
     *         Example: (a &gt;= b) is not true.
     *         </p>
     *         </dd>
     *         <dt>&lt;=</dt>
     *         <dd>
     *         <p>
     *         Checks if the value of the left operand is less than or equal to the value of the right operand; if yes,
     *         then the condition becomes true.
     *         </p>
     *         <p>
     *         Example: (a &lt;= b) is true.
     *         </p>
     *         </dd>
     *         <dt>AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL</dt>
     *         <dd>
     *         <p>
     *         Logical operators.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         <i>Supported Partition Key Types</i>: The following are the the supported partition keys.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>string</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>date</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>timestamp</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>int</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bigint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>long</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tinyint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>smallint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>decimal</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If an invalid type is encountered, an exception is thrown.
     *         </p>
     *         <p>
     *         The following list shows the valid operators on each type. When you define a crawler, the
     *         <code>partitionKey</code> type is created as a <code>STRING</code>, to be compatible with the catalog
     *         partitions.
     *         </p>
     *         <p>
     *         <i>Sample API Call</i>:
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * An expression filtering the partitions to be returned.
     * </p>
     * <p>
     * The expression uses SQL syntax similar to the SQL <code>WHERE</code> filter clause. The SQL statement parser <a
     * href="http://jsqlparser.sourceforge.net/home.php">JSQLParser</a> parses the expression.
     * </p>
     * <p>
     * <i>Operators</i>: The following are the operators that you can use in the <code>Expression</code> API call:
     * </p>
     * <dl>
     * <dt>=</dt>
     * <dd>
     * <p>
     * Checks if the values of the two operands are equal or not; if yes, then the condition becomes true.
     * </p>
     * <p>
     * Example: Assume 'variable a' holds 10 and 'variable b' holds 20.
     * </p>
     * <p>
     * (a = b) is not true.
     * </p>
     * </dd>
     * <dt>&lt; &gt;</dt>
     * <dd>
     * <p>
     * Checks if the values of two operands are equal or not; if the values are not equal, then the condition becomes
     * true.
     * </p>
     * <p>
     * Example: (a &lt; &gt; b) is true.
     * </p>
     * </dd>
     * <dt>&gt;</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is greater than the value of the right operand; if yes, then the
     * condition becomes true.
     * </p>
     * <p>
     * Example: (a &gt; b) is not true.
     * </p>
     * </dd>
     * <dt>&lt;</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is less than the value of the right operand; if yes, then the condition
     * becomes true.
     * </p>
     * <p>
     * Example: (a &lt; b) is true.
     * </p>
     * </dd>
     * <dt>&gt;=</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is greater than or equal to the value of the right operand; if yes, then
     * the condition becomes true.
     * </p>
     * <p>
     * Example: (a &gt;= b) is not true.
     * </p>
     * </dd>
     * <dt>&lt;=</dt>
     * <dd>
     * <p>
     * Checks if the value of the left operand is less than or equal to the value of the right operand; if yes, then the
     * condition becomes true.
     * </p>
     * <p>
     * Example: (a &lt;= b) is true.
     * </p>
     * </dd>
     * <dt>AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL</dt>
     * <dd>
     * <p>
     * Logical operators.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <i>Supported Partition Key Types</i>: The following are the the supported partition keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>string</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>date</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>timestamp</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>int</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bigint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>long</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tinyint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>smallint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>decimal</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If an invalid type is encountered, an exception is thrown.
     * </p>
     * <p>
     * The following list shows the valid operators on each type. When you define a crawler, the
     * <code>partitionKey</code> type is created as a <code>STRING</code>, to be compatible with the catalog partitions.
     * </p>
     * <p>
     * <i>Sample API Call</i>:
     * </p>
     * 
     * @param expression
     *        An expression filtering the partitions to be returned.</p>
     *        <p>
     *        The expression uses SQL syntax similar to the SQL <code>WHERE</code> filter clause. The SQL statement
     *        parser <a href="http://jsqlparser.sourceforge.net/home.php">JSQLParser</a> parses the expression.
     *        </p>
     *        <p>
     *        <i>Operators</i>: The following are the operators that you can use in the <code>Expression</code> API
     *        call:
     *        </p>
     *        <dl>
     *        <dt>=</dt>
     *        <dd>
     *        <p>
     *        Checks if the values of the two operands are equal or not; if yes, then the condition becomes true.
     *        </p>
     *        <p>
     *        Example: Assume 'variable a' holds 10 and 'variable b' holds 20.
     *        </p>
     *        <p>
     *        (a = b) is not true.
     *        </p>
     *        </dd>
     *        <dt>&lt; &gt;</dt>
     *        <dd>
     *        <p>
     *        Checks if the values of two operands are equal or not; if the values are not equal, then the condition
     *        becomes true.
     *        </p>
     *        <p>
     *        Example: (a &lt; &gt; b) is true.
     *        </p>
     *        </dd>
     *        <dt>&gt;</dt>
     *        <dd>
     *        <p>
     *        Checks if the value of the left operand is greater than the value of the right operand; if yes, then the
     *        condition becomes true.
     *        </p>
     *        <p>
     *        Example: (a &gt; b) is not true.
     *        </p>
     *        </dd>
     *        <dt>&lt;</dt>
     *        <dd>
     *        <p>
     *        Checks if the value of the left operand is less than the value of the right operand; if yes, then the
     *        condition becomes true.
     *        </p>
     *        <p>
     *        Example: (a &lt; b) is true.
     *        </p>
     *        </dd>
     *        <dt>&gt;=</dt>
     *        <dd>
     *        <p>
     *        Checks if the value of the left operand is greater than or equal to the value of the right operand; if
     *        yes, then the condition becomes true.
     *        </p>
     *        <p>
     *        Example: (a &gt;= b) is not true.
     *        </p>
     *        </dd>
     *        <dt>&lt;=</dt>
     *        <dd>
     *        <p>
     *        Checks if the value of the left operand is less than or equal to the value of the right operand; if yes,
     *        then the condition becomes true.
     *        </p>
     *        <p>
     *        Example: (a &lt;= b) is true.
     *        </p>
     *        </dd>
     *        <dt>AND, OR, IN, BETWEEN, LIKE, NOT, IS NULL</dt>
     *        <dd>
     *        <p>
     *        Logical operators.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        <i>Supported Partition Key Types</i>: The following are the the supported partition keys.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>string</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>date</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>timestamp</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>int</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bigint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>long</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tinyint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>smallint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>decimal</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If an invalid type is encountered, an exception is thrown.
     *        </p>
     *        <p>
     *        The following list shows the valid operators on each type. When you define a crawler, the
     *        <code>partitionKey</code> type is created as a <code>STRING</code>, to be compatible with the catalog
     *        partitions.
     *        </p>
     *        <p>
     *        <i>Sample API Call</i>:
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsRequest withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these partitions.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve these partitions.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these partitions.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve these partitions.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these partitions.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve these partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The segment of the table's partitions to scan in this request.
     * </p>
     * 
     * @param segment
     *        The segment of the table's partitions to scan in this request.
     */

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * The segment of the table's partitions to scan in this request.
     * </p>
     * 
     * @return The segment of the table's partitions to scan in this request.
     */

    public Segment getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * The segment of the table's partitions to scan in this request.
     * </p>
     * 
     * @param segment
     *        The segment of the table's partitions to scan in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsRequest withSegment(Segment segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * The maximum number of partitions to return in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of partitions to return in a single response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of partitions to return in a single response.
     * </p>
     * 
     * @return The maximum number of partitions to return in a single response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of partitions to return in a single response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of partitions to return in a single response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPartitionsRequest withMaxResults(Integer maxResults) {
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment()).append(",");
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

        if (obj instanceof GetPartitionsRequest == false)
            return false;
        GetPartitionsRequest other = (GetPartitionsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
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

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetPartitionsRequest clone() {
        return (GetPartitionsRequest) super.clone();
    }

}
