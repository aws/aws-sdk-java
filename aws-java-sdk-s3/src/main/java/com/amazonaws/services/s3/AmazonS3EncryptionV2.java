/*
 * Copyright 2013-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3;

import com.amazonaws.services.s3.internal.MultiFileOutputStream;
import com.amazonaws.services.s3.internal.PartCreationEvent;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.UploadObjectRequest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Interface for an S3 client that performs encryption, V2. This interface provides some
 * extra methods specific for encryption.
 */
public interface AmazonS3EncryptionV2 extends AmazonS3 {

    /**
     * Creates a new crypto instruction file by re-encrypting the CEK of an
     * existing encrypted S3 object with a new encryption material identifiable
     * via a new set of material description.
     *<p>
     * User of this method is responsible for explicitly deleting/updating the
     * instruction file so created should the corresponding S3 object is
     * deleted/created.
     *
     * @return the result of the put (instruction file) operation.
     */
    PutObjectResult putInstructionFile(PutInstructionFileRequest req);

    /**
     * Used to encrypt data first to disk with pipelined concurrent multi-part
     * uploads to S3. This method enables significant speed-up of encrypting and
     * uploading large payloads to Amazon S3 via pipelining and parallel uploads
     * by consuming temporary disk space.
     * <p>
     * There are many ways you can customize the behavior of this method,
     * including
     * <ul>
     * <li>the configuration of your own custom thread pool</li>
     * <li>the part size of each multi-part upload request; By default, a
     * temporary ciphertext file is generated per part and gets uploaded
     * immediately to S3</li>
     * <li>the maximum temporary disk space that must not be exceeded by
     * execution of this request; By default, the encryption will block upon
     * hitting the limit and will only resume when the in-flight uploads catch
     * up by releasing the temporary disk space upon successful uploads of the
     * completed parts</li>
     * <li>the configuration of your own {@link MultiFileOutputStream} for
     * custom pipeline behavior</li>
     * <li>the configuration of your own {@link UploadObjectObserver} for custom
     * multi-part upload behavior</li>
     * </ul>
     * <p>
     * A request is handled with the following life cycle, calling the necessary
     * Service Provider Interface:
     * <ol>
     * <li>A thread pool is constructed (or retrieved from the request) for the
     * execution of concurrent upload tasks to be submitted by the
     * <code>UploadObjectObserver</code></li>
     * <li>An {@link UploadObjectObserver} is constructed (or retrieved from the
     * request) for execution of concurrent uploads to S3</li>
     * <li>Initialize the <code>UploadObjectObserver</code></li>
     * <li>Initialize a multi-part upload request to S3 by calling
     * {@link UploadObjectObserver#onUploadInitiation(UploadObjectRequest)}</li>
     * <li>A {@link MultiFileOutputStream} is constructed (or retrieved from the
     * request) which serves as the pipeline for incremental (but serial)
     * encryption to disk with concurrent multipart uploads to S3 whenever the
     * parts on the disk are ready</li>
     * <li>Initialize the <code>MultiFileOutputStream</code></li>
     * <li>Kicks off the pipeline for incremental encryption to disk with
     * pipelined concurrent multi-part uploads to S3</li>
     * <li>For every part encrypted into a temporary file on disk, it is
     * uploaded by calling
     * {@link UploadObjectObserver#onPartCreate(PartCreationEvent)}</li>
     * <li>Finally, clean up and complete the multi-part upload by calling
     * {@link UploadObjectObserver#onCompletion(List)}.</li>
     * </ol>
     *
     * @return the result of the completed muti-part uploads
     *
     * @throws IOException
     *             if the encryption to disk failed
     * @throws InterruptedException
     *             if the current thread was interrupted while waiting
     * @throws ExecutionException
     *             if the concurrent uploads threw an exception
     */
    CompleteMultipartUploadResult uploadObject(final UploadObjectRequest req)
            throws IOException, InterruptedException, ExecutionException;

}
