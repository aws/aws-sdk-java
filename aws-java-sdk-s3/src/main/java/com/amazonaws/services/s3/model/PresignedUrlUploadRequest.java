/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.http.HttpMethodName;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;

/**
 * Request class to upload a object to S3 using presigned urls. Upload content can be provided through a file or input stream.
 *
 * The behavior is similar to using {@link PutObjectRequest}. Depending on whether a file or input stream is being uploaded,
 * this request has slightly different behavior.
 * </p>
 * <p>
 * When uploading a file:
 * </p>
 * <ul>
 * <li>
 * The client automatically computes a checksum of the file. Amazon S3 uses
 * checksums to validate the data in each file.</li>
 * <li>
 * Using the file extension, Amazon S3 attempts to determine the correct content
 * type and content disposition to use for the object with some exceptions. See below.
 * </li>
 * <li>
 * If the given presigned url is created using <b>SigV2 signer</b> and content type is not provided,
 * then SDK will not attempt to determine the content type and instead sends an empty string for content type.
 * This is because content type is signed header in SigV2 and so the content type can only be sent
 * if it is used in creating presigned url.
 * </li>
 * <li>
 * If the given presigned url is created using <b>SigV4 signer</b>, then SDK attempts to determine
 * the correct content type and sends it with the request if not provided. Note that this only works
 * if you have not used content type while creating the presigned url. If you have used content type while
 * creating the url, then you should set the same content type while making this API call through
 * {@link PresignedUrlUploadRequest#setMetadata(ObjectMetadata)} or
 * {@link PresignedUrlUploadRequest#putCustomRequestHeader(String, String)}
 * </li>
 * </ul>
 * <p>
 * Amazon S3 is a distributed system. If Amazon S3 receives multiple write
 * requests for the same object nearly simultaneously, all of the objects might
 * be stored. However, only one object will obtain the key.
 * </p>
 *
 * If custom headers are used in generating the url, you can set them through {@link #putCustomRequestHeader(String, String)}
 * method. If any signed headers or parameters are missing from the request, a Signature mismatch error will be thrown from S3.
 * Ensure you set all the custom headers/parameters that are used for creating the presigned url.
 */
public class PresignedUrlUploadRequest extends AmazonWebServiceRequest implements S3DataSource, Serializable {
    private static final long serialVersionUID = 1L;

    private URL presignedUrl;

    private HttpMethodName httpMethodName = HttpMethodName.PUT;

    /**
     * The file containing the data to be uploaded to Amazon S3. You must either
     * specify a file or an InputStream containing the data to be uploaded to
     * Amazon S3.
     */
    private File file;

    /**
     * The InputStream containing the data to be uploaded to Amazon S3. You must
     * either specify a file or an InputStream containing the data to be
     * uploaded to Amazon S3.
     */
    private transient InputStream inputStream;

    /**
     * Optional metadata instructing Amazon S3 how to handle the uploaded data
     * (e.g. custom user metadata, hooks for specifying content type, etc.). If
     * you are uploading from an InputStream, you <bold>should always</bold>
     * specify metadata with the content size set, otherwise the contents of the
     * InputStream will have to be buffered in memory before they can be sent to
     * Amazon S3, which can have very negative performance impacts.
     */
    private ObjectMetadata metadata;

    public PresignedUrlUploadRequest(URL presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    /**
     * @return The presigned url to which the request will be sent
     */
    public URL getPresignedUrl() {
        return presignedUrl;
    }

    /**
     * @param presignedUrl sets the presigned url to send the request to
     */
    public void setPresignedUrl(URL presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    /**
     * @param presignedUrl sets the presigned url to send the request to
     * @return This object for method chaining
     */
    public PresignedUrlUploadRequest withPresignedUrl(URL presignedUrl) {
        setPresignedUrl(presignedUrl);
        return this;
    }

    /**
     * @return The HTTP method (PUT, POST) to be used in this request. The default value is PUT.
     */
    public HttpMethodName getHttpMethodName() {
        return httpMethodName;
    }

    /**
     * @param httpMethodName Sets the HTTP method (PUT, POST) to be used in this request. The default value is PUT.
     */
    public void setHttpMethodName(HttpMethodName httpMethodName) {
        this.httpMethodName = httpMethodName;
    }

    /**
     * @param httpMethodName Sets the HTTP method (PUT, POST) to be used in this request. The default value is PUT.
     * @return This object for method chaining
     */
    public PresignedUrlUploadRequest withHttpMethodName(HttpMethodName httpMethodName) {
        setHttpMethodName(httpMethodName);
        return this;
    }

    /**
     * @return the file to upload
     */
    @Override
    public File getFile() {
        return file;
    }

    /**
     * @param file Sets the file to upload
     */
    @Override
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @param file Sets the file to upload
     * @return This object for method chaining
     */
    public PresignedUrlUploadRequest withFile(File file) {
        setFile(file);
        return this;
    }

    /**
     * @return the data stream used for the upload
     */
    @Override
    public InputStream getInputStream() {
        return inputStream;
    }

    /**
     * @param inputStream the data stream to upload
     */
    @Override
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    /**
     * @param inputStream the data stream to upload
     * @return This object for method chaining
     */
    public PresignedUrlUploadRequest withInputStream(InputStream inputStream) {
        setInputStream(inputStream);
        return this;
    }

    /**
     * Gets the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (e.g. custom user metadata, hooks for specifying content
     * type, etc.).
     * <p>
     * If uploading from an input stream,
     * <b>always</b> specify metadata with the content size set. Otherwise the
     * contents of the input stream have to be buffered in memory before
     * being sent to Amazon S3. This can cause very negative performance
     * impacts.
     * </p>
     *
     * @return The optional metadata instructing Amazon S3 how to handle the
     *         uploaded data (e.g. custom user metadata, hooks for specifying
     *         content type, etc.).
     */
    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (e.g. custom user metadata, hooks for specifying content
     * type, etc.).
     * <p>
     * If uploading from an input stream,
     * <b>always</b> specify metadata with the content size set. Otherwise the
     * contents of the input stream have to be buffered in memory before
     * being sent to Amazon S3. This can cause very negative performance
     * impacts.
     * </p>
     *
     * @param metadata
     *            The optional metadata instructing Amazon S3 how to handle the
     *            uploaded data (e.g. custom user metadata, hooks for specifying
     *            content type, etc.).
     */
    public void setMetadata(ObjectMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Sets the optional metadata instructing Amazon S3 how to handle the
     * uploaded data (e.g. custom user metadata, hooks for specifying content
     * type, etc.).
     * <p>
     * If uploading from an input stream,
     * <b>always</b> specify metadata with the content size set. Otherwise the
     * contents of the input stream have to be buffered in memory before
     * being sent to Amazon S3. This can cause very negative performance
     * impacts.
     * </p>
     *
     * @param metadata
     *            The optional metadata instructing Amazon S3 how to handle the
     *            uploaded data (e.g. custom user metadata, hooks for specifying
     *            content type, etc.).
     *
     * @return This object for method chaining
     */
    public PresignedUrlUploadRequest withMetadata(ObjectMetadata metadata) {
        setMetadata(metadata);
        return this;
    }
}
