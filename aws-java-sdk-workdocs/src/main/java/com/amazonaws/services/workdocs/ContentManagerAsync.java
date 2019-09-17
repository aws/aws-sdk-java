/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.workdocs;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.services.workdocs.model.DocumentSourceType;
import com.amazonaws.services.workdocs.model.DocumentVersionStatus;
import com.amazonaws.services.workdocs.model.GetDocumentRequest;
import com.amazonaws.services.workdocs.model.GetDocumentResult;
import com.amazonaws.services.workdocs.model.GetDocumentVersionRequest;
import com.amazonaws.services.workdocs.model.GetDocumentVersionResult;
import com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadRequest;
import com.amazonaws.services.workdocs.model.InitiateDocumentVersionUploadResult;
import com.amazonaws.services.workdocs.model.UpdateDocumentVersionRequest;
import com.amazonaws.services.workdocs.model.UpdateDocumentVersionResult;
import com.amazonaws.services.workdocs.model.UploadMetadata;
import com.amazonaws.util.IOUtils;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * High level asynchronous utility for transferring content from and to Amazon WorkDocs.
 * <code>ContentManagerAsync</code> provides a simple API for uploading and downloading
 * documents to/from Amazon WorkDocs easily.
 * <code>ContentManagerAsync</code>, like all the client classes in the AWS SDK for Java, is thread safe.
 * Call <code>ContentManagerAsync.shutdownNow(true)</code> to release the resources once the
 * operation is complete. If you want to keep Amazon WorkDocs client open, then call <code>ContentManagerAsync.shutdownNow(false)</code>.
 * <p>
 * In order to use <code>ContentManager</code>:
 * <pre class="brush: java">
 * AWSStaticCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(new AnonymousAWSCredentials());
 * AmazonWorkDocs client = AmazonWorkDocsClient.builder().withCredentials(credentialsProvider).withRegion(Regions.REGION).build();
 * ContentManagerAsync contentManager = ContentManagerAsyncBuilder.standard().withWorkDocsClient(client).withAuthenticationToken(authenticationToken).build();
 * GetDocumentStreamRequest request = new GetDocumentStreamRequest();
 * request.setDocumentId("doc-id");
 * InputStream inputStream = contentManager.getDocumentStreamAsync(request).get().getStream();
 * contentManager.shutdownNow(true);
 * </pre>
 */
@ThreadSafe
@SdkInternalApi
public class ContentManagerAsync extends ContentManager {
    private final ExecutorService executorService;

    @SdkInternalApi
    ContentManagerAsync(ContentManagerAsyncBuilder contentManagerAsyncBuilder) {
        super(contentManagerAsyncBuilder);

        ExecutorService executorService = contentManagerAsyncBuilder.getExecutorService();
        if (executorService == null) {
            throw new IllegalArgumentException("ExecutorService must be specified.");
        }
        
        this.executorService = executorService;
    }

    /**
     * Asynchronously gets document stream of latest version of given document and version ID.
     * If version ID is null, it retrieves latest version of requested document ID.
     * Clients must close the stream once content is read.
     * 
     * @param getDocumentStreamRequest Request specifying parameters of the operation.
     * @return Result containing stream of requested document content.
     */
    public Future<GetDocumentStreamResult> getDocumentStreamAsync(
            final GetDocumentStreamRequest getDocumentStreamRequest) {
        Callable<GetDocumentStreamResult> task = new Callable<GetDocumentStreamResult>() {
            public GetDocumentStreamResult call() {
                return getDocumentStream(getDocumentStreamRequest);
            }
        };

        return executorService.submit(task);
    }


    /**
     * Asynchronously uploads stream to given folder and document name.
     * Client must close the input stream once upload operation is complete.
     * 
     * @param uploadDocumentStreamRequest Request specifying parameters of the operation.
     * @return Result containing metadata of the newly created document or version.
     */
    public Future<UploadDocumentStreamResult> uploadDocumentStreamAsync(
            final UploadDocumentStreamRequest uploadDocumentStreamRequest) throws IllegalArgumentException {
        Callable<UploadDocumentStreamResult> task = new Callable<UploadDocumentStreamResult>() {
            public UploadDocumentStreamResult call() {
                return uploadDocumentStream(uploadDocumentStreamRequest);
            }
        };

        return executorService.submit(task);
    }
    
    /**
     * Forcefully shuts down this ContentManager instance - currently executing
     * operations will not be allowed to finish. Callers should use this method
     * when they either:
     * <ul>
     * <li>have already verified that their operations have completed by checking
     * each transfer's state
     * <li>need to exit quickly and don't mind stopping operations before they
     * complete.
     * </ul>
     * <p>
     * Callers should also remember that uploaded parts from an interrupted
     * upload may not always be automatically cleaned up.
     *
     * @param shutdownWorkDocsClient
     *            Whether to shut down the underlying Amazon WorkDocs client.
     */
    public void shutdownNow(boolean shutdownWorkDocsClient) {
        executorService.shutdownNow();
        
        if (shutdownWorkDocsClient) {
            super.getWorkDocsClient().shutdown();
        }
    }
}
