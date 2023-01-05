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
package com.amazonaws.services.omics.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.omics.AmazonOmics;
import com.amazonaws.services.omics.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOmicsWaiters {

    /**
     * Represents the service client
     */
    private final AmazonOmics client;

    private final ExecutorService executorService = WaiterExecutorServiceFactory.buildExecutorServiceForWaiter("AmazonOmicsWaiters");

    /**
     * Constructs a new AmazonOmicsWaiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonOmicsWaiters(AmazonOmics client) {
        this.client = client;
    }

    /**
     * Builds a RunRunning waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetRunRequest> runRunning() {

        return new WaiterBuilder<GetRunRequest, GetRunResult>()
                .withSdkFunction(new GetRunFunction(client))
                .withAcceptors(new RunRunning.IsRUNNINGMatcher(), new RunRunning.IsPENDINGMatcher(), new RunRunning.IsSTARTINGMatcher(),
                        new RunRunning.IsFAILEDMatcher(), new RunRunning.IsCANCELLEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReadSetImportJobCompleted waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetReadSetImportJobRequest> readSetImportJobCompleted() {

        return new WaiterBuilder<GetReadSetImportJobRequest, GetReadSetImportJobResult>()
                .withSdkFunction(new GetReadSetImportJobFunction(client))
                .withAcceptors(new ReadSetImportJobCompleted.IsCOMPLETEDMatcher(), new ReadSetImportJobCompleted.IsSUBMITTEDMatcher(),
                        new ReadSetImportJobCompleted.IsIN_PROGRESSMatcher(), new ReadSetImportJobCompleted.IsCANCELLINGMatcher(),
                        new ReadSetImportJobCompleted.IsCANCELLEDMatcher(), new ReadSetImportJobCompleted.IsFAILEDMatcher(),
                        new ReadSetImportJobCompleted.IsCOMPLETED_WITH_FAILURESMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AnnotationStoreDeleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetAnnotationStoreRequest> annotationStoreDeleted() {

        return new WaiterBuilder<GetAnnotationStoreRequest, GetAnnotationStoreResult>()
                .withSdkFunction(new GetAnnotationStoreFunction(client))
                .withAcceptors(new AnnotationStoreDeleted.IsDELETEDMatcher(), new AnnotationStoreDeleted.IsResourceNotFoundExceptionMatcher(),
                        new AnnotationStoreDeleted.IsDELETINGMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a WorkflowActive waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetWorkflowRequest> workflowActive() {

        return new WaiterBuilder<GetWorkflowRequest, GetWorkflowResult>()
                .withSdkFunction(new GetWorkflowFunction(client))
                .withAcceptors(new WorkflowActive.IsACTIVEMatcher(), new WorkflowActive.IsCREATINGMatcher(), new WorkflowActive.IsUPDATINGMatcher(),
                        new WorkflowActive.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(10), new FixedDelayStrategy(3)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AnnotationImportJobCreated waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetAnnotationImportJobRequest> annotationImportJobCreated() {

        return new WaiterBuilder<GetAnnotationImportJobRequest, GetAnnotationImportJobResult>()
                .withSdkFunction(new GetAnnotationImportJobFunction(client))
                .withAcceptors(new AnnotationImportJobCreated.IsSUBMITTEDMatcher(), new AnnotationImportJobCreated.IsIN_PROGRESSMatcher(),
                        new AnnotationImportJobCreated.IsFAILEDMatcher(), new AnnotationImportJobCreated.IsCANCELLEDMatcher(),
                        new AnnotationImportJobCreated.IsCOMPLETEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TaskCompleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetRunTaskRequest> taskCompleted() {

        return new WaiterBuilder<GetRunTaskRequest, GetRunTaskResult>()
                .withSdkFunction(new GetRunTaskFunction(client))
                .withAcceptors(new TaskCompleted.IsCOMPLETEDMatcher(), new TaskCompleted.IsPENDINGMatcher(), new TaskCompleted.IsSTARTINGMatcher(),
                        new TaskCompleted.IsRUNNINGMatcher(), new TaskCompleted.IsSTOPPINGMatcher(), new TaskCompleted.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReadSetActivationJobCompleted waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetReadSetActivationJobRequest> readSetActivationJobCompleted() {

        return new WaiterBuilder<GetReadSetActivationJobRequest, GetReadSetActivationJobResult>()
                .withSdkFunction(new GetReadSetActivationJobFunction(client))
                .withAcceptors(new ReadSetActivationJobCompleted.IsCOMPLETEDMatcher(), new ReadSetActivationJobCompleted.IsSUBMITTEDMatcher(),
                        new ReadSetActivationJobCompleted.IsIN_PROGRESSMatcher(), new ReadSetActivationJobCompleted.IsCANCELLINGMatcher(),
                        new ReadSetActivationJobCompleted.IsCANCELLEDMatcher(), new ReadSetActivationJobCompleted.IsFAILEDMatcher(),
                        new ReadSetActivationJobCompleted.IsCOMPLETED_WITH_FAILURESMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReadSetExportJobCompleted waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetReadSetExportJobRequest> readSetExportJobCompleted() {

        return new WaiterBuilder<GetReadSetExportJobRequest, GetReadSetExportJobResult>()
                .withSdkFunction(new GetReadSetExportJobFunction(client))
                .withAcceptors(new ReadSetExportJobCompleted.IsCOMPLETEDMatcher(), new ReadSetExportJobCompleted.IsSUBMITTEDMatcher(),
                        new ReadSetExportJobCompleted.IsIN_PROGRESSMatcher(), new ReadSetExportJobCompleted.IsCANCELLINGMatcher(),
                        new ReadSetExportJobCompleted.IsCANCELLEDMatcher(), new ReadSetExportJobCompleted.IsFAILEDMatcher(),
                        new ReadSetExportJobCompleted.IsCOMPLETED_WITH_FAILURESMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a RunCompleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetRunRequest> runCompleted() {

        return new WaiterBuilder<GetRunRequest, GetRunResult>()
                .withSdkFunction(new GetRunFunction(client))
                .withAcceptors(new RunCompleted.IsCOMPLETEDMatcher(), new RunCompleted.IsPENDINGMatcher(), new RunCompleted.IsSTARTINGMatcher(),
                        new RunCompleted.IsRUNNINGMatcher(), new RunCompleted.IsSTOPPINGMatcher(), new RunCompleted.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a AnnotationStoreCreated waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetAnnotationStoreRequest> annotationStoreCreated() {

        return new WaiterBuilder<GetAnnotationStoreRequest, GetAnnotationStoreResult>()
                .withSdkFunction(new GetAnnotationStoreFunction(client))
                .withAcceptors(new AnnotationStoreCreated.IsACTIVEMatcher(), new AnnotationStoreCreated.IsCREATINGMatcher(),
                        new AnnotationStoreCreated.IsUPDATINGMatcher(), new AnnotationStoreCreated.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VariantImportJobCreated waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetVariantImportJobRequest> variantImportJobCreated() {

        return new WaiterBuilder<GetVariantImportJobRequest, GetVariantImportJobResult>()
                .withSdkFunction(new GetVariantImportJobFunction(client))
                .withAcceptors(new VariantImportJobCreated.IsSUBMITTEDMatcher(), new VariantImportJobCreated.IsIN_PROGRESSMatcher(),
                        new VariantImportJobCreated.IsFAILEDMatcher(), new VariantImportJobCreated.IsCANCELLEDMatcher(),
                        new VariantImportJobCreated.IsCOMPLETEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VariantStoreDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetVariantStoreRequest> variantStoreDeleted() {

        return new WaiterBuilder<GetVariantStoreRequest, GetVariantStoreResult>()
                .withSdkFunction(new GetVariantStoreFunction(client))
                .withAcceptors(new VariantStoreDeleted.IsDELETEDMatcher(), new VariantStoreDeleted.IsResourceNotFoundExceptionMatcher(),
                        new VariantStoreDeleted.IsDELETINGMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ReferenceImportJobCompleted waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetReferenceImportJobRequest> referenceImportJobCompleted() {

        return new WaiterBuilder<GetReferenceImportJobRequest, GetReferenceImportJobResult>()
                .withSdkFunction(new GetReferenceImportJobFunction(client))
                .withAcceptors(new ReferenceImportJobCompleted.IsCOMPLETEDMatcher(), new ReferenceImportJobCompleted.IsSUBMITTEDMatcher(),
                        new ReferenceImportJobCompleted.IsIN_PROGRESSMatcher(), new ReferenceImportJobCompleted.IsCANCELLINGMatcher(),
                        new ReferenceImportJobCompleted.IsCANCELLEDMatcher(), new ReferenceImportJobCompleted.IsFAILEDMatcher(),
                        new ReferenceImportJobCompleted.IsCOMPLETED_WITH_FAILURESMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VariantStoreCreated waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetVariantStoreRequest> variantStoreCreated() {

        return new WaiterBuilder<GetVariantStoreRequest, GetVariantStoreResult>()
                .withSdkFunction(new GetVariantStoreFunction(client))
                .withAcceptors(new VariantStoreCreated.IsACTIVEMatcher(), new VariantStoreCreated.IsCREATINGMatcher(),
                        new VariantStoreCreated.IsUPDATINGMatcher(), new VariantStoreCreated.IsFAILEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a TaskRunning waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetRunTaskRequest> taskRunning() {

        return new WaiterBuilder<GetRunTaskRequest, GetRunTaskResult>()
                .withSdkFunction(new GetRunTaskFunction(client))
                .withAcceptors(new TaskRunning.IsRUNNINGMatcher(), new TaskRunning.IsPENDINGMatcher(), new TaskRunning.IsSTARTINGMatcher(),
                        new TaskRunning.IsFAILEDMatcher(), new TaskRunning.IsCANCELLEDMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(20), new FixedDelayStrategy(30)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
