/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshiftdataapi;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.redshiftdataapi.model.*;

/**
 * Interface for accessing Redshift Data API Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.redshiftdataapi.AbstractAWSRedshiftDataAPI} instead.
 * </p>
 * <p>
 * <p>
 * You can use the Amazon Redshift Data API to run queries on Amazon Redshift tables. You can run individual SQL
 * statements, which are committed if the statement succeeds.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRedshiftDataAPI {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "redshift-data";

    /**
     * <p>
     * Cancels a running query. To be canceled, a query must be running.
     * </p>
     * 
     * @param cancelStatementRequest
     * @return Result of the CancelStatement operation returned by the service.
     * @throws ResourceNotFoundException
     *         The Amazon Redshift Data API operation failed due to a missing resource.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.CancelStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/CancelStatement" target="_top">AWS
     *      API Documentation</a>
     */
    CancelStatementResult cancelStatement(CancelStatementRequest cancelStatementRequest);

    /**
     * <p>
     * Describes the details about a specific instance when a query was run by the Amazon Redshift Data API. The
     * information includes when the query started, when it finished, the query status, the number of rows returned, and
     * the SQL statement.
     * </p>
     * 
     * @param describeStatementRequest
     * @return Result of the DescribeStatement operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws ResourceNotFoundException
     *         The Amazon Redshift Data API operation failed due to a missing resource.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.DescribeStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeStatement"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeStatementResult describeStatement(DescribeStatementRequest describeStatementRequest);

    /**
     * <p>
     * Describes the detailed information about a table from metadata in the cluster. The information includes its
     * columns. A token is returned to page through the column list. Depending on the authorization method, use one of
     * the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeTableRequest
     * @return Result of the DescribeTable operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeTable" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTableResult describeTable(DescribeTableRequest describeTableRequest);

    /**
     * <p>
     * Runs an SQL statement, which can be data manipulation language (DML) or data definition language (DDL). This
     * statement must be a single SQL statement. Depending on the authorization method, use one of the following
     * combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param executeStatementRequest
     * @return Result of the ExecuteStatement operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws ExecuteStatementException
     *         The SQL statement encountered an environmental error while running.
     * @sample AWSRedshiftDataAPI.ExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ExecuteStatement" target="_top">AWS
     *      API Documentation</a>
     */
    ExecuteStatementResult executeStatement(ExecuteStatementRequest executeStatementRequest);

    /**
     * <p>
     * Fetches the temporarily cached result of an SQL statement. A token is returned to page through the statement
     * results.
     * </p>
     * 
     * @param getStatementResultRequest
     * @return Result of the GetStatementResult operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws ResourceNotFoundException
     *         The Amazon Redshift Data API operation failed due to a missing resource.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.GetStatementResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/GetStatementResult"
     *      target="_top">AWS API Documentation</a>
     */
    GetStatementResultResult getStatementResult(GetStatementResultRequest getStatementResultRequest);

    /**
     * <p>
     * List the databases in a cluster. A token is returned to page through the database list. Depending on the
     * authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    ListDatabasesResult listDatabases(ListDatabasesRequest listDatabasesRequest);

    /**
     * <p>
     * Lists the schemas in a database. A token is returned to page through the schema list. Depending on the
     * authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    ListSchemasResult listSchemas(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * List of SQL statements. By default, only finished statements are shown. A token is returned to page through the
     * statement list.
     * </p>
     * 
     * @param listStatementsRequest
     * @return Result of the ListStatements operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.ListStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListStatements" target="_top">AWS
     *      API Documentation</a>
     */
    ListStatementsResult listStatements(ListStatementsRequest listStatementsRequest);

    /**
     * <p>
     * List the tables in a database. If neither <code>SchemaPattern</code> nor <code>TablePattern</code> are specified,
     * then all tables in the database are returned. A token is returned to page through the table list. Depending on
     * the authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTablesRequest
     * @return Result of the ListTables operation returned by the service.
     * @throws ValidationException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @throws InternalServerException
     *         The Amazon Redshift Data API operation failed due to invalid input.
     * @sample AWSRedshiftDataAPI.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    ListTablesResult listTables(ListTablesRequest listTablesRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
