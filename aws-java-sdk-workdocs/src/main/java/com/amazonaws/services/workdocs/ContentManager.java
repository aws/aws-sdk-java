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

/**
 * High level synchronous utility for transferring content from and to Amazon WorkDocs.
 * <code>ContentManager</code> provides a simple API for uploading and downloading
 * documents to/from Amazon WorkDocs easily.
 * <code>ContentManager</code>, like all the client classes in the AWS SDK for Java, is thread safe.
 *
 * <p>
 * In order to use <code>ContentManager</code>:
 * <pre class="brush: java">
 * AWSStaticCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(new AnonymousAWSCredentials());
 * AmazonWorkDocs client = AmazonWorkDocsClient.builder().withCredentials(credentialsProvider).withRegion(Regions.REGION).build();
 * ContentManager contentManager = ContentManagerBuilder.standard().withWorkDocsClient(client).withAuthenticationToken(authenticationToken).build();
 * GetDocumentStreamRequest request = new GetDocumentStreamRequest();
 * request.setDocumentId("doc-id");
 * InputStream inputStream = contentManager.getDocumentStream(request).getStream();
 * </pre>
 */
@ThreadSafe
@SdkInternalApi
public class ContentManager {
    private final String authenticationToken;
    private final AmazonWorkDocs client;

    @SdkInternalApi
    ContentManager(final ContentManagerBuilder contentManagerBuilder) {
        if (contentManagerBuilder == null) {
            throw new IllegalArgumentException();
        }

        AmazonWorkDocs client = contentManagerBuilder.getWorkDocsClient();
 
        if (client == null) {
            throw new IllegalArgumentException("AmazonWorkDocs client must be specified.");
        }

        this.client = client;
        this.authenticationToken = contentManagerBuilder.getAuthenticationToken();
    }
    
    @SdkInternalApi
    protected AmazonWorkDocs getWorkDocsClient() {
        return client;
    }

    /**
     * Gets document stream from WorkDocs.
     * If VersionId of GetDocumentStreamRequest is not specified,
     * then the latest version of specified document is retrieved.
     * Clients must close the stream once content is read.
     * 
     * @param getDocumentStreamRequest Request specifying parameters of the operation.
     * @return Result containing stream of requested document content.
     */
    public GetDocumentStreamResult getDocumentStream(final GetDocumentStreamRequest getDocumentStreamRequest) {
        String versionId = getDocumentStreamRequest.getVersionId();
        if (versionId == null) {
            GetDocumentRequest getDocumentRequest = new GetDocumentRequest();
            getDocumentRequest.setDocumentId(getDocumentStreamRequest.getDocumentId());
            
            String requestAuthenticationToken = getDocumentStreamRequest.getAuthenticationToken();
            if (requestAuthenticationToken != null) {
                getDocumentRequest.setAuthenticationToken(requestAuthenticationToken);
            } else {
                getDocumentRequest.setAuthenticationToken(authenticationToken);
            }

            GetDocumentResult result = client.getDocument(getDocumentRequest);
            versionId = result.getMetadata().getLatestVersionMetadata().getId();
        }

        GetDocumentStreamResult getDocumentStreamResult = new GetDocumentStreamResult(getDocumentStreamRequest);
        getDocumentStreamResult.setVersionId(versionId);
        InputStream stream = getDocumentVersionStream(getDocumentStreamRequest.getDocumentId(), versionId);
        getDocumentStreamResult.setStream(stream);

        return getDocumentStreamResult;
    }

    private InputStream getDocumentVersionStream(String documentId, String versionId) {
        GetDocumentVersionRequest getDocumentVersionRequest = new GetDocumentVersionRequest();
        getDocumentVersionRequest.setDocumentId(documentId);
        getDocumentVersionRequest.setVersionId(versionId);
        getDocumentVersionRequest.setFields("SOURCE");
        getDocumentVersionRequest.setAuthenticationToken(authenticationToken);

        GetDocumentVersionResult result = client.getDocumentVersion(getDocumentVersionRequest);
        String downloadUrl = result.getMetadata().getSource().get(DocumentSourceType.ORIGINAL.name());
        try {
            URL documentUrl = new URL(downloadUrl);
            return documentUrl.openStream();
        } catch (IOException e) {
            throw new SdkClientException(e);
        }
    }

    /**
     * Uploads document stream to WorkDocs.
     * If document ID is specified, then it creates a new version under this document.
     * If document ID is not specified, then it creates a new document and uploads content to its only version.\
     * Client must close the input stream once upload operation is complete.
     * 
     * @param uploadDocumentStreamRequest Request specifying parameters of the operation.
     * @return Result containing metadata of the newly created document or version.
     */
    public UploadDocumentStreamResult uploadDocumentStream(UploadDocumentStreamRequest uploadDocumentStreamRequest) {
        InputStream stream = uploadDocumentStreamRequest.getStream();
        if (stream == null) {
            throw new IllegalArgumentException("InputStream must be specified.");
        }
        
        InitiateDocumentVersionUploadRequest initiateDocumentVersionUploadRequest = new InitiateDocumentVersionUploadRequest();
        initiateDocumentVersionUploadRequest.setParentFolderId(uploadDocumentStreamRequest.getParentFolderId());
        initiateDocumentVersionUploadRequest.setName(uploadDocumentStreamRequest.getDocumentName());
        initiateDocumentVersionUploadRequest.setContentType(uploadDocumentStreamRequest.getContentType());
        initiateDocumentVersionUploadRequest.setContentCreatedTimestamp(uploadDocumentStreamRequest.getContentCreatedTimestamp());
        initiateDocumentVersionUploadRequest.setContentModifiedTimestamp(uploadDocumentStreamRequest.getContentModifiedTimestamp());
        initiateDocumentVersionUploadRequest.setDocumentSizeInBytes(uploadDocumentStreamRequest.getDocumentSizeInBytes());
        initiateDocumentVersionUploadRequest.setId(uploadDocumentStreamRequest.getDocumentId());

        String requestAuthenticationToken = uploadDocumentStreamRequest.getAuthenticationToken();
        if (requestAuthenticationToken != null) {
            initiateDocumentVersionUploadRequest.setAuthenticationToken(requestAuthenticationToken);
        } else {
            initiateDocumentVersionUploadRequest.setAuthenticationToken(authenticationToken);
        }

        InitiateDocumentVersionUploadResult result = client.initiateDocumentVersionUpload(initiateDocumentVersionUploadRequest);

        UploadMetadata uploadMetadata = result.getUploadMetadata();
        String documentId = result.getMetadata().getId();
        String versionId = result.getMetadata().getLatestVersionMetadata().getId();
        String uploadUrl = uploadMetadata.getUploadUrl();

        try {
            URL url = new URL(uploadUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Content-Type", uploadDocumentStreamRequest.getContentType());
            connection.setRequestProperty("x-amz-server-side-encryption", "AES256");
            OutputStream outputStream = connection.getOutputStream();
            IOUtils.copy(stream, outputStream);
            connection.getResponseCode();
        } catch (MalformedURLException e) {
            throw new SdkClientException(e);
        } catch (IOException e) {
            throw new SdkClientException(e);
        }

        UpdateDocumentVersionRequest updateDocumentVersionRequest = new UpdateDocumentVersionRequest();
        updateDocumentVersionRequest.setDocumentId(documentId);
        updateDocumentVersionRequest.setVersionId(versionId);
        updateDocumentVersionRequest.setVersionStatus(DocumentVersionStatus.ACTIVE);
        if (authenticationToken != null) {
            updateDocumentVersionRequest.setAuthenticationToken(authenticationToken);
        }

        UpdateDocumentVersionResult updateDocumentVersionResult = client.updateDocumentVersion(updateDocumentVersionRequest);

        UploadDocumentStreamResult uploadDocumentStreamResult = new UploadDocumentStreamResult(
                uploadDocumentStreamRequest);
        uploadDocumentStreamResult.setDocumentId(documentId);
        uploadDocumentStreamResult.setVersionId(versionId);

        return uploadDocumentStreamResult;
    }
}
