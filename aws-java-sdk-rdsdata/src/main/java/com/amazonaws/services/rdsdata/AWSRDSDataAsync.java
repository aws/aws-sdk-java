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
package com.amazonaws.services.rdsdata;

import javax.annotation.Generated;

import com.amazonaws.services.rdsdata.model.*;

/**
 * Interface for accessing AWS RDS DataService asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rdsdata.AbstractAWSRDSDataAsync} instead.
 * </p>
 * <p>
 * AWS RDS DataService provides Http Endpoint to query RDS databases.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRDSDataAsync extends AWSRDSData {

    /**
     * Executes any SQL statement on the target database synchronously
     * 
     * @param executeSqlRequest
     *        Execute SQL Request
     * @return A Java Future containing the result of the ExecuteSql operation returned by the service.
     * @sample AWSRDSDataAsync.ExecuteSql
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExecuteSqlResult> executeSqlAsync(ExecuteSqlRequest executeSqlRequest);

    /**
     * Executes any SQL statement on the target database synchronously
     * 
     * @param executeSqlRequest
     *        Execute SQL Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteSql operation returned by the service.
     * @sample AWSRDSDataAsyncHandler.ExecuteSql
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExecuteSqlResult> executeSqlAsync(ExecuteSqlRequest executeSqlRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteSqlRequest, ExecuteSqlResult> asyncHandler);

}
