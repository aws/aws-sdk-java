/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing;

import java.io.File;
import java.io.IOException;

import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DecisionContextProviderImpl;
import com.amazonaws.services.simpleworkflow.flow.WorkflowContext;
import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Settable;
import com.amazonaws.services.simpleworkflow.flow.core.TryCatchFinally;

/**
 * This implementation of FileProcessingWorkflow downloads the file, zips it and
 * uploads it back to S3
 */
public class FileProcessingWorkflowZipImpl implements FileProcessingWorkflow {

    private final SimpleStoreActivitiesClient store;

    private final FileProcessingActivitiesClient processor;

    private final WorkflowContext workflowContext;

    private String state = "Started";

    public FileProcessingWorkflowZipImpl() {
        // Create activity clients
        this.store = new SimpleStoreActivitiesClientImpl();
        processor = new FileProcessingActivitiesClientImpl();
        workflowContext = (new DecisionContextProviderImpl()).getDecisionContext().getWorkflowContext();
    }

    /**
     * Constructor used for unit testing or when Spring is used to configure
     * workflow
     */
    public FileProcessingWorkflowZipImpl(SimpleStoreActivitiesClient store, FileProcessingActivitiesClient processor,
            WorkflowContext workflowContext) {
        this.store = store;
        this.processor = processor;
        this.workflowContext = workflowContext;
    }

    @Override
    public void processFile(final String sourceBucketName, final String sourceFilename, final String targetBucketName,
            final String targetFilename) throws IOException {
        // Settable to store the worker specific task list returned by the activity
        final Settable<String> taskList = new Settable<String>();

        // Use runId as a way to ensure that downloaded files do not get name collisions
        String workflowRunId = workflowContext.getWorkflowExecution().getRunId();
        File localSource = new File(sourceFilename);
        final String localSourceFilename = workflowRunId + "_" + localSource.getName();
        File localTarget = new File(targetFilename);
        final String localTargetFilename = workflowRunId + "_" + localTarget.getName();
        new TryCatchFinally() {

            @Override
            protected void doTry() throws Throwable {
                Promise<String> activityWorkerTaskList = store.download(sourceBucketName, sourceFilename, localSourceFilename);
                // chaining is a way for one promise get assigned value of another 
                taskList.chain(activityWorkerTaskList);
                // Call processFile activity to zip the file
                Promise<Void> fileProcessed = processFileOnHost(localSourceFilename, localTargetFilename, activityWorkerTaskList);
                // Call upload activity to upload zipped file
                upload(targetBucketName, targetFilename, localTargetFilename, taskList, fileProcessed);
            }

            @Override
            protected void doCatch(Throwable e) throws Throwable {
                state = "Failed: " + e.getMessage();
                throw e;
            }

            @Override
            protected void doFinally() throws Throwable {
                if (taskList.isReady()) { // File was downloaded

                    // Set option to schedule activity in worker specific task list
                    ActivitySchedulingOptions options = new ActivitySchedulingOptions().withTaskList(taskList.get());

                    // Call deleteLocalFile activity using the host specific task list
                    store.deleteLocalFile(localSourceFilename, options);
                    store.deleteLocalFile(localTargetFilename, options);
                }
                if (!state.startsWith("Failed:")) {
                    state = "Completed";
                }
            }

        };
    }

    @Asynchronous
    private Promise<Void> processFileOnHost(String fileToProcess, String fileToUpload, Promise<String> taskList) {
        state = "Downloaded to " + taskList.get();
        // Call the activity to process the file using worker specific task list
        ActivitySchedulingOptions options = new ActivitySchedulingOptions().withTaskList(taskList.get());
        return processor.processFile(fileToProcess, fileToUpload, options);
    }

    @Asynchronous
    private void upload(final String targetBucketName, final String targetFilename, final String localTargetFilename,
            Promise<String> taskList, Promise<Void> fileProcessed) {
        state = "Processed at " + taskList.get();
        ActivitySchedulingOptions options = new ActivitySchedulingOptions().withTaskList(taskList.get());
        store.upload(targetBucketName, localTargetFilename, targetFilename, options);
    }

    @Override
    public String getState() {
        return state;
    }

}
