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
package com.amazonaws.services.acmpca.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.acmpca.AWSACMPCA;
import com.amazonaws.services.acmpca.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSACMPCAWaiters {

    /**
     * Represents the service client
     */
    private final AWSACMPCA client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AWSACMPCAWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AWSACMPCAWaiters(AWSACMPCA client) {
        this.client = client;
    }

    /**
     * Builds a CertificateIssued waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetCertificateRequest> certificateIssued() {

        return new WaiterBuilder<GetCertificateRequest, GetCertificateResult>().withSdkFunction(new GetCertificateFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new CertificateIssued.IsRequestInProgressExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AuditReportCreated waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeCertificateAuthorityAuditReportRequest> auditReportCreated() {

        return new WaiterBuilder<DescribeCertificateAuthorityAuditReportRequest, DescribeCertificateAuthorityAuditReportResult>()
                .withSdkFunction(new DescribeCertificateAuthorityAuditReportFunction(client))
                .withAcceptors(new AuditReportCreated.IsSUCCESSMatcher(), new AuditReportCreated.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a CertificateAuthorityCSRCreated waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetCertificateAuthorityCsrRequest> certificateAuthorityCSRCreated() {

        return new WaiterBuilder<GetCertificateAuthorityCsrRequest, GetCertificateAuthorityCsrResult>()
                .withSdkFunction(new GetCertificateAuthorityCsrFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new CertificateAuthorityCSRCreated.IsRequestInProgressExceptionMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(60), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
