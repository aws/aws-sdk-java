/*
 * Copyright 2012-2019 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.glacier.transfer;

import static com.amazonaws.event.SDKProgressPublisher.publishProgress;
import static com.amazonaws.event.SDKProgressPublisher.publishResponseBytesDiscarded;
import static com.amazonaws.internal.ResettableInputStream.newResettableInputStream;
import static com.amazonaws.util.IOUtils.closeQuietly;
import static com.amazonaws.util.IOUtils.release;
import static com.amazonaws.util.Throwables.failure;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sqs.AmazonSQS;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.internal.ResettableInputStream;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.glacier.AmazonGlacier;
import com.amazonaws.services.glacier.AmazonGlacierClient;
import com.amazonaws.services.glacier.TreeHashGenerator;
import com.amazonaws.services.glacier.internal.TreeHashInputStream;
import com.amazonaws.services.glacier.model.AbortMultipartUploadRequest;
import com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.glacier.model.CompleteMultipartUploadResult;
import com.amazonaws.services.glacier.model.DescribeJobRequest;
import com.amazonaws.services.glacier.model.DescribeJobResult;
import com.amazonaws.services.glacier.model.GetJobOutputRequest;
import com.amazonaws.services.glacier.model.GetJobOutputResult;
import com.amazonaws.services.glacier.model.InitiateJobRequest;
import com.amazonaws.services.glacier.model.InitiateJobResult;
import com.amazonaws.services.glacier.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.glacier.model.InitiateMultipartUploadResult;
import com.amazonaws.services.glacier.model.JobParameters;
import com.amazonaws.services.glacier.model.UploadArchiveRequest;
import com.amazonaws.services.glacier.model.UploadArchiveResult;
import com.amazonaws.services.glacier.model.UploadMultipartPartRequest;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.util.BinaryUtils;

/**
 * Utilities for uploading and downloading data to and from AWS Glacier.
 */
public class ArchiveTransferManager {

    /** The maximum part size, in bytes, for a Glacier multipart upload. */
    private static final long MAXIMUM_UPLOAD_PART_SIZE = 1024L * 1024 * 1024 * 4;

    /** The default chunk size, in bytes, when downloading in multiple chunks using range retrieval. */
    private static final long DEFAULT_DOWNLOAD_CHUNK_SIZE = 1024L * 1024 * 128;

    /** The minimum part size, in bytes, for a Glacier multipart upload. */
    private static final long MINIMUM_PART_SIZE = 1024L * 1024;

    /** Threshold, in bytes, for when to use the multipart upload operations */
    private static final long MULTIPART_UPLOAD_SIZE_THRESHOLD = 1024L * 1024L * 100;

    /** Default retry time when downloading in multiple chunks using range retrieval */
    private static final int DEFAULT_MAX_RETRIES = 3;

    /** Glacier client used for making all requests. */
    private final AmazonGlacier glacier;

    private final AWSCredentialsProvider credentialsProvider;

    private final ClientConfiguration clientConfiguration;

    private final AmazonSQS sqs;

    private final AmazonSNS sns;

    private static final Log log = LogFactory.getLog(ArchiveTransferManager.class);

    /**
     * Constructs a new ArchiveTransferManager, using the specified AWS
     * credentials to authenticate requests.
     *
     * @param credentials
     *            The AWS credentials used to authenticate requests.
     * @deprecated Use {@link ArchiveTransferManagerBuilder}.
     */
    public ArchiveTransferManager(AWSCredentials credentials) {
        this(new StaticCredentialsProvider(credentials), new ClientConfiguration());
    }

    /**
     * Constructs a new ArchiveTransferManager, using the specified AWS credentials provider
     * and client configuration.
     *
     * @param credentialsProvider
     *            The AWS credentials provider used to authenticate requests.
     * @param clientConfiguration
     *            Client specific options, such as proxy settings, retries, and timeouts.
     * @deprecated Use {@link ArchiveTransferManagerBuilder}.
     */
    public ArchiveTransferManager(AWSCredentialsProvider credentialsProvider, ClientConfiguration clientConfiguration) {
        this(new AmazonGlacierClient(credentialsProvider, clientConfiguration), credentialsProvider, clientConfiguration);
    }

    /**
     * Constructs a new ArchiveTransferManager, using the specified Amazon
     * Glacier client and AWS credentials provider.
     *
     * @param glacier
     *            The client for working with Amazon Glacier.
     * @param credentialsProvider
     *            The AWS credentials provider used to authenticate requests.
     * @deprecated Use {@link ArchiveTransferManagerBuilder}.
     */
    public ArchiveTransferManager(AmazonGlacierClient glacier, AWSCredentialsProvider credentialsProvider) {
        this(glacier, credentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new ArchiveTransferManager, using the specified Amazon
     * Glacier client and AWS credentials.
     *
     * @param glacier
     *            The client for working with Amazon Glacier.
     * @param credentials
     *            The AWS credentials used to authenticate requests.
     * @deprecated Use {@link ArchiveTransferManagerBuilder}.
     */
    public ArchiveTransferManager(AmazonGlacierClient glacier, AWSCredentials credentials) {
        this(glacier, new StaticCredentialsProvider(credentials), new ClientConfiguration());
    }

    /**
     * Constructs a new ArchiveTransferManager, using the specified Amazon
     * Glacier client, AWS credentials provider and client configuration.
     *
     * @param glacier
     *            The client for working with Amazon Glacier.
     * @param credentialsProvider
     *            The AWS credentials provider used to authenticate requests.
     * @param clientConfiguration
     *            Client specific options, such as proxy settings, retries, and
     *            timeouts.
     * @deprecated Use {@link ArchiveTransferManagerBuilder}.
     */
    public ArchiveTransferManager(AmazonGlacierClient glacier, AWSCredentialsProvider credentialsProvider, ClientConfiguration clientConfiguration) {
        this.credentialsProvider = credentialsProvider;
        this.clientConfiguration = clientConfiguration;
        this.glacier = glacier;
        this.sns = null;
        this.sqs = null;
    }

    /**
     * Constructs a new ArchiveTransferManager, using the specified Amazon
     * Glacier client, and the specified Amazon SQS and Amazon SNS clients for
     * polling download job status.
     * <p>
     * This constructor form can be used to work with ArchiveTransferManager in
     * any AWS region where Amazon Glacier is supported. Just make sure to set
     * the correct endpoint on each individual client object so that they all
     * operate in the same region.
     *
     * @param glacier
     *            The client for working with Amazon Glacier.
     * @param sqs
     *            The client for working with Amazon SQS when polling archive
     *            retrieval job status.
     * @param sns
     *            The client for working with Amazon SNS when polling archive
     *            retrieval job status.
     * @deprecated Use {@link ArchiveTransferManagerBuilder}.
     */
    public ArchiveTransferManager(AmazonGlacierClient glacier, AmazonSQSClient sqs, AmazonSNSClient sns) {
        this.credentialsProvider = null;
        this.clientConfiguration = null;
        this.glacier = glacier;
        this.sqs = sqs;
        this.sns = sns;
    }

    @SdkInternalApi
    ArchiveTransferManager(ArchiveTransferManagerParams params) {
        this.credentialsProvider = null;
        this.clientConfiguration = null;
        this.glacier = params.getAmazonGlacier();
        this.sqs = params.getAmazonSQS();
        this.sns = params.getAmazonSNS();
    }

    /**
     * Uploads the specified file to Amazon Glacier for archival storage in the
     * specified vault for the user's current account. For small archives, this
     * method will upload the archive directly to Glacier. For larger archives,
     * this method will use Glacier's multipart upload API to split the upload
     * into multiple parts for better error recovery if any errors are
     * encountered while streaming the data to Amazon Glacier.
     *
     * @param vaultName
     *            The name of the vault to upload to.
     * @param archiveDescription
     *            The description of the new archive being uploaded.
     * @param file
     *            The file to upload to Amazon Glacier.
     *
     * @return The result of the upload, including the archive ID needed to
     *         access the upload later.
     *
     * @throws AmazonServiceException
     *             If any problems were encountered while communicating with
     *             AWS.
     * @throws AmazonClientException
     *             If any problems were encountered inside the AWS SDK for Java
     *             client code in making requests or processing responses from
     *             AWS.
     * @throws FileNotFoundException
     *             If the specified file to upload doesn't exist.
     */
    public UploadResult upload(final String vaultName, final String archiveDescription, final File file)
            throws AmazonServiceException, AmazonClientException, FileNotFoundException {
        return upload(null, vaultName, archiveDescription, file);
    }

    /**
     * Uploads the specified file to Amazon Glacier for archival storage in the
     * specified vault in the specified user's account. For small archives, this
     * method will upload the archive directly to Glacier. For larger archives,
     * this method will use Glacier's multipart upload API to split the upload
     * into multiple parts for better error recovery if any errors are
     * encountered while streaming the data to Amazon Glacier.
     *
     * @param accountId
     *            The ID for the account which owns the Glacier vault being
     *            uploaded to. To use the same account the developer is using to
     *            make requests to AWS, the value <code>"-"</code> can be used
     *            instead of the full account ID.
     * @param vaultName
     *            The name of the vault to upload to.
     * @param archiveDescription
     *            The description of the new archive being uploaded.
     * @param file
     *            The file to upload to Amazon Glacier.
     *
     * @return The result of the upload, including the archive ID needed to
     *         access the upload later.
     *
     * @throws AmazonServiceException
     *             If any problems were encountered while communicating with
     *             AWS.
     * @throws AmazonClientException
     *             If any problems were encountered inside the AWS SDK for Java
     *             client code in making requests or processing responses from
     *             AWS.
     * @throws FileNotFoundException
     *             If the specified file to upload doesn't exist.
     */
    public UploadResult upload(final String accountId, final String vaultName, final String archiveDescription, final File file)
            throws AmazonServiceException, AmazonClientException, FileNotFoundException {
        return upload(accountId, vaultName, archiveDescription, file, null);
    }

    /**
     * Uploads the specified file to Amazon Glacier for archival storage in the
     * specified vault in the specified user's account. For small archives, this
     * method will upload the archive directly to Glacier. For larger archives,
     * this method will use Glacier's multipart upload API to split the upload
     * into multiple parts for better error recovery if any errors are
     * encountered while streaming the data to Amazon Glacier. You can also add
     * an optional progress listener for receiving updates about the upload
     * status.
     *
     * @param accountId
     *            The ID for the account which owns the Glacier vault being
     *            uploaded to. To use the same account the developer is using to
     *            make requests to AWS, the value <code>"-"</code> can be used
     *            instead of the full account ID.
     * @param vaultName
     *            The name of the vault to upload to.
     * @param archiveDescription
     *            The description of the new archive being uploaded.
     * @param file
     *            The file to upload to Amazon Glacier.
     * @param progressListener
     *            The optional progress listener for receiving updates about
     *            the upload status.
     *
     * @return The result of the upload, including the archive ID needed to
     *         access the upload later.
     *
     * @throws AmazonServiceException
     *             If any problems were encountered while communicating with
     *             AWS.
     * @throws AmazonClientException
     *             If any problems were encountered inside the AWS SDK for Java
     *             client code in making requests or processing responses from
     *             AWS.
     */
    public UploadResult upload(final String accountId, final String vaultName,
            final String archiveDescription, final File file,
            ProgressListener progressListener) throws AmazonServiceException,
            AmazonClientException {
        if (file.length() > MULTIPART_UPLOAD_SIZE_THRESHOLD) {
            return uploadInMultipleParts(accountId, vaultName,
                    archiveDescription, file, progressListener);
        } else {
            return uploadInSinglePart(accountId, vaultName, archiveDescription,
                    file, progressListener);
        }
    }

    /**
     * Downloads an archive from Amazon Glacier in the specified vault for the
     * current user's account, and saves it to the specified file. Amazon
     * Glacier is optimized for long term storage of data that isn't needed
     * quickly. This method will first make a request to Amazon Glacier to
     * prepare the archive to be downloaded. Once Glacier has finished preparing
     * the archive to be downloaded, this method will start downloading the data
     * and storing it in the specified file. Also, this method will download the
     * archive in multiple chunks using range retrieval for better error
     * recovery if any errors are encountered while streaming the data from
     * Amazon Glacier.
     *
     * @param vaultName
     *            The name of the vault to download the archive from.
     * @param archiveId
     *            The unique ID of the archive to download.
     * @param file
     *            The file in which to save the archive.
     *
     * @throws AmazonServiceException
     *             If any problems were encountered while communicating with
     *             AWS.
     * @throws AmazonClientException
     *             If any problems were encountered inside the AWS SDK for Java
     *             client code in making requests or processing responses from
     *             AWS.
     */
    public void download(final String vaultName, final String archiveId, final File file)
            throws AmazonServiceException, AmazonClientException {
        download(null, vaultName, archiveId, file);
    }

    /**
     * Downloads an archive from Amazon Glacier in the specified vault in the
     * specified user's account, and saves it to the specified file. Amazon
     * Glacier is optimized for long term storage of data that isn't needed
     * quickly. This method will first make a request to Amazon Glacier to
     * prepare the archive to be downloaded. Once Glacier has finished preparing
     * the archive to be downloaded, this method will start downloading the data
     * and storing it in the specified file.
     *
     * @param accountId
     *            The ID for the account which owns the Glacier vault where the
     *            archive is being downloaded from. To use the same account the
     *            developer is using to make requests to AWS, the value
     *            <code>"-"</code> can be used instead of the full account ID.
     * @param vaultName
     *            The name of the vault to download the archive from.
     * @param archiveId
     *            The unique ID of the archive to download.
     * @param file
     *           The file in which to save the archive.
     *
     * @throws AmazonServiceException
     *             If any problems were encountered while communicating with
     *             AWS.
     * @throws AmazonClientException
     *             If any problems were encountered inside the AWS SDK for Java
     *             client code in making requests or processing responses from
     *             AWS.
     */
    public void download(final String accountId, final String vaultName, final String archiveId, final File file)
            throws AmazonServiceException, AmazonClientException {
        download(accountId, vaultName, archiveId, file, null);
    }

    /**
     * Downloads an archive from Amazon Glacier in the specified vault in the
     * specified user's account, and saves it to the specified file. Amazon
     * Glacier is optimized for long term storage of data that isn't needed
     * quickly. This method will first make a request to Amazon Glacier to
     * prepare the archive to be downloaded. Once Glacier has finished preparing
     * the archive to be downloaded, this method will start downloading the data
     * and storing it in the specified file. You can also add an optional
     * progress listener for receiving updates about the download status.
     *
     * @param accountId
     *            The ID for the account which owns the Glacier vault where the
     *            archive is being downloaded from. To use the same account the
     *            developer is using to make requests to AWS, the value
     *            <code>"-"</code> can be used instead of the full account ID.
     * @param vaultName
     *            The name of the vault to download the archive from.
     * @param archiveId
     *            The unique ID of the archive to download.
     * @param file
     *           The file in which to save the archive.
     * @param progressListener
     *            The optional progress listener for receiving updates about the
     *            download status.
     *
     * @throws AmazonServiceException
     *             If any problems were encountered while communicating with
     *             AWS.
     * @throws AmazonClientException
     *             If any problems were encountered inside the AWS SDK for Java
     *             client code in making requests or processing responses from
     *             AWS.
     */
    public void download(final String accountId, final String vaultName,
            final String archiveId, final File file,
            ProgressListener progressListener) throws AmazonServiceException,
            AmazonClientException {
        JobStatusMonitor jobStatusMonitor = null;
        String jobId = null;
        publishProgress(progressListener, ProgressEventType.TRANSFER_PREPARING_EVENT);

        try {
            if (credentialsProvider != null && clientConfiguration != null) {
                jobStatusMonitor = new JobStatusMonitor(credentialsProvider, clientConfiguration);
            } else {
                jobStatusMonitor = new JobStatusMonitor(sqs, sns);
            }

            JobParameters jobParameters = new JobParameters()
                .withArchiveId(archiveId)
                .withType("archive-retrieval")
                .withSNSTopic(jobStatusMonitor.getTopicArn());
            InitiateJobResult archiveRetrievalResult =
                glacier.initiateJob(new InitiateJobRequest()
                    .withAccountId(accountId)
                    .withVaultName(vaultName)
                    .withJobParameters(jobParameters));
            jobId = archiveRetrievalResult.getJobId();

            jobStatusMonitor.waitForJobToComplete(jobId);

        } catch (Throwable t) {
            publishProgress(progressListener, ProgressEventType.TRANSFER_FAILED_EVENT);
            throw failure(t);
        } finally {
            if (jobStatusMonitor != null) {
                jobStatusMonitor.shutdown();
            }
        }

        downloadJobOutput(accountId, vaultName, jobId, file, progressListener);
    }

    /**
     * Downloads the job output for the specified job (which must be ready to
     * download already, and must be a complete archive retrieval, not a partial
     * range retrieval), into the specified file. This method will request
     * individual chunks of the data, one at a time, in order to handle any
     * transient errors along the way.
     *
     * @param accountId
     *            The account ID containing the job output to download (or null
     *            if the current account should be used).
     * @param vaultName
     *            The name of the vault from where the job was initiated.
     * @param jobId
     *            The ID of the job whose output is to be downloaded. This job
     *            must be a complete archive retrieval, not a range retrieval.
     * @param file
     *            The file to download the job output into.
     */
    public void downloadJobOutput(String accountId, String vaultName, String jobId, File file) {
        downloadJobOutput(accountId, vaultName, jobId, file, null);
    }

    /**
     * Downloads the job output for the specified job (which must be ready to
     * download already, and must be a complete archive retrieval, not a partial
     * range retrieval), into the specified file. This method will request
     * individual chunks of the data, one at a time, in order to handle any
     * transient errors along the way. You can also add an optional progress
     * listener for receiving updates about the download status.
     *
     * @param accountId
     *            The account ID containing the job output to download (or null
     *            if the current account shoudl be used).
     * @param vaultName
     *            The name of the vault from where the job was initiated.
     * @param jobId
     *            The ID of the job whose output is to be downloaded. This job
     *            must be a complete archive retrieval, not a range retrieval.
     * @param file
     *            The file to download the job output into.
     * @param progressListener
     *            The optional progress listener for receiving updates about the
     *            download status.
     */
    public void downloadJobOutput(String accountId, String vaultName,
            String jobId, File file, ProgressListener progressListener) {
        long archiveSize = 0;
        long chunkSize = DEFAULT_DOWNLOAD_CHUNK_SIZE;
        long currentPosition = 0;
        long endPosition = 0;

        RandomAccessFile output = null;
        String customizedChunkSize = null;
        customizedChunkSize = System.getProperty("com.amazonaws.services.glacier.transfer.downloadChunkSizeInMB");

        DescribeJobResult describeJobResult = glacier.describeJob(new DescribeJobRequest(accountId, vaultName, jobId));
        archiveSize = describeJobResult.getArchiveSizeInBytes();

        if (customizedChunkSize != null) {
            try {
                chunkSize = Long.parseLong(customizedChunkSize) * 1024 * 1024;
            } catch (NumberFormatException e) {
                publishProgress(progressListener, ProgressEventType.TRANSFER_FAILED_EVENT);
                throw new AmazonClientException("Invalid chunk size: " + e.getMessage());
            }
            validateChunkSize(chunkSize);
        }

        try {
            output = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            publishProgress(progressListener, ProgressEventType.TRANSFER_FAILED_EVENT);
            throw new AmazonClientException("Unable to open the output file " + file.getPath(), e);
        }

        try {
            publishProgress(progressListener, ProgressEventType.TRANSFER_STARTED_EVENT);
            while (currentPosition < archiveSize) {
                if (currentPosition + chunkSize > archiveSize) {
                    endPosition = archiveSize - 1;
                } else {
                    endPosition = currentPosition + chunkSize - 1;
                }
    
                // Download the chunk
                try {
                    downloadOneChunk(accountId, vaultName, jobId, output,
                            currentPosition, endPosition, progressListener);
                } catch (Throwable t) {
                    publishProgress(progressListener, ProgressEventType.TRANSFER_FAILED_EVENT);
                    throw failure(t);
                }
                currentPosition += chunkSize;
            }
            publishProgress(progressListener, ProgressEventType.TRANSFER_COMPLETED_EVENT);
        } finally {
            closeQuietly(output, log);
        }
    }

    private void validateChunkSize(long chunkSize) {
        if (chunkSize <= 0) {
            throw new AmazonClientException("Invalid chunk size, chunk size must be great than 0");
        }

        // Chunk size must be aligned on 2^n MB boundaries
        if ((chunkSize & (chunkSize - 1)) != 0) {
            throw new AmazonClientException("Invalid chunk size, chunk size must be aligned on 2^n MB boundaries");
        }
    }

    /**
     * Download one chunk from Amazon Glacier. It will do the retry if any
     * errors are encountered while streaming the data from Amazon Glacier.
     */
    private void downloadOneChunk(String accountId, String vaultName,
            String jobId, RandomAccessFile output, long currentPosition,
            long endPosition, ProgressListener progressListener) {
        final long chunkSize = endPosition - currentPosition + 1;
        TreeHashInputStream input = null;
        int retries = 0;
        while (true) {
            try {
                GetJobOutputRequest req = new GetJobOutputRequest()
                    .withAccountId(accountId)
                    .withVaultName(vaultName)
                    .withRange("bytes=" + currentPosition + "-" + endPosition)
                    .withJobId(jobId)
                    .withGeneralProgressListener(progressListener)
                    ;
                GetJobOutputResult jobOutputResult = glacier.getJobOutput(req);
                try {
                    input = new TreeHashInputStream(new BufferedInputStream(jobOutputResult.getBody()));
                    appendToFile(output, input);
                } catch (NoSuchAlgorithmException e) {
                    throw failure(e, "Unable to compute hash for data integrity");
                } finally {
                    closeQuietly(input, log);
                }

                // Only do tree-hash check when the output checksum is returned from Glacier
                if (null != jobOutputResult.getChecksum()) {
                    // Checksum does not match
                    if (!input.getTreeHash().equalsIgnoreCase(jobOutputResult.getChecksum())) {
                        // Discard the chunk of bytes received 
                        publishResponseBytesDiscarded(progressListener, chunkSize);
                        if (log.isDebugEnabled())
                            log.debug("reverting " + chunkSize);
                        throw new IOException("Client side computed hash doesn't match server side hash; possible data corruption");
                    }
                } else {
                    log.warn("Cannot validate the downloaded output since no tree-hash checksum is returned from Glacier. "
                            + "Make sure the InitiateJob and GetJobOutput requests use tree-hash-aligned ranges.");
                }
                // Successfully download
                return;
                // We will retry IO exception
            } catch (IOException ioe) {
                if (retries < DEFAULT_MAX_RETRIES) {
                    retries++;
                    if (log.isDebugEnabled()) {
                        log.debug(retries
                                + " retry downloadOneChunk accountId="
                                + accountId + ", vaultName=" + vaultName
                                + ", jobId=" + jobId + ", currentPosition="
                                + currentPosition + " endPosition="
                                + endPosition);
                    }
                    try {
                        output.seek(currentPosition);
                    } catch (IOException e) {
                        throw new AmazonClientException("Unable to download the archive: " + ioe.getMessage(), e);
                    }
                } else {
                    throw new AmazonClientException("Unable to download the archive: " + ioe.getMessage(), ioe);
                }
            }
        }
    }

    /**
     * Writes the data from the given input stream to the given output stream.
     */
    private void appendToFile(RandomAccessFile output, InputStream input)
            throws IOException {
        byte[] buffer = new byte[1024 * 1024];
        int bytesRead = 0;
        do {
            bytesRead = input.read(buffer);
            if (bytesRead < 0)
                break;
            output.write(buffer, 0, bytesRead);
        } while (bytesRead > 0);
        return;
    }

    /**
     * Calculates the part size to use when uploading an archive of the
     * specified size using Glacier's multipart upload APIs. Because of the tree
     * hashing algorithm, part sizes must be aligned on 2^n MB boundaries (ex:
     * 1MB, 2MB, 4MB, 8MB, etc). All parts must be the same size, except for the
     * last part.
     *
     * @param fileSize
     *            The size of the file being uploaded.
     *
     * @return The part size to use in the multipart upload.
     */
    private long calculatePartSize(long fileSize) {
        long partSize = MINIMUM_PART_SIZE;
        int approxNumParts = 1;
        while (partSize * approxNumParts < fileSize && partSize*2 <= MAXIMUM_UPLOAD_PART_SIZE) {
            partSize *= 2;
            approxNumParts *= 2;
        }
        return partSize;
    }

    private UploadResult uploadInMultipleParts(final String accountId,
            final String vaultName, final String archiveDescription,
            final File file, ProgressListener progressListener) {
        final long partSize = calculatePartSize(file.length());
        String partSizeString = Long.toString(partSize);

        publishProgress(progressListener, ProgressEventType.TRANSFER_PREPARING_EVENT);
        String uploadId = null;
        try {
            InitiateMultipartUploadResult initiateResult = glacier.initiateMultipartUpload(new InitiateMultipartUploadRequest()
                .withAccountId(accountId)
                .withArchiveDescription(archiveDescription)
                .withVaultName(vaultName)
                .withPartSize(partSizeString));
            uploadId = initiateResult.getUploadId();
        } catch (Throwable t) {
            publishProgress(progressListener, ProgressEventType.TRANSFER_FAILED_EVENT);
            throw failure(t);
        }
        publishProgress(progressListener, ProgressEventType.TRANSFER_STARTED_EVENT);
        final String fileNotFoundMsg = "Unable to find file '"
                + file.getAbsolutePath() + "'";
        try {
            List<byte[]> binaryChecksums = new LinkedList<byte[]>();

            long currentPosition = 0;
            while (currentPosition < file.length()) {
                long length = partSize;
                if (currentPosition + partSize > file.length()) {
                    length = file.length() - currentPosition;
                }

                Exception failedException = null;
                boolean completed = false;
                int tries = 0;
                    while (!completed && tries < 5){
                        tries++;
                        InputSubstream inputSubStream = null;
                        try {
                            inputSubStream = new InputSubstream(
                                    newResettableInputStream(file, fileNotFoundMsg)
                                        .disableClose(), // requires explicit release
                                    currentPosition, length, true);
                            String checksum = TreeHashGenerator.calculateTreeHash(inputSubStream);
                            byte[] binaryChecksum = BinaryUtils.fromHex(checksum);
                            inputSubStream.reset();
                            UploadMultipartPartRequest req = new UploadMultipartPartRequest()
                                .withAccountId(accountId)
                                .withChecksum(checksum)
                                .withBody(inputSubStream)
                                .withRange("bytes " + currentPosition + "-" + (currentPosition + length - 1) + "/*")
                                .withUploadId(uploadId)
                                .withVaultName(vaultName)
                                .withGeneralProgressListener(progressListener)
                                ;
                            
                            glacier.uploadMultipartPart(req);
                            completed = true;
                            binaryChecksums.add(binaryChecksum);
                        } catch (Exception e){
                            failedException = e;
                        } finally {
                            // We opened the file underneath; so need to release it
                            release(inputSubStream, log);
                        }
                    } // end inner while
                if (!completed && failedException!=null)
                    throw failedException;
                currentPosition += partSize;
            } // end outer while

            String checksum = TreeHashGenerator.calculateTreeHash(binaryChecksums);

            String archiveSize = Long.toString(file.length());
            CompleteMultipartUploadResult completeMultipartUploadResult =
                glacier.completeMultipartUpload(new CompleteMultipartUploadRequest()
                    .withAccountId(accountId)
                    .withArchiveSize(archiveSize)
                    .withVaultName(vaultName)
                    .withChecksum(checksum)
                    .withUploadId(uploadId));

            String artifactId = completeMultipartUploadResult.getArchiveId();
            publishProgress(progressListener, ProgressEventType.TRANSFER_COMPLETED_EVENT);
            return new UploadResult(artifactId);
        } catch (Throwable t) {
            publishProgress(progressListener, ProgressEventType.TRANSFER_FAILED_EVENT);
            glacier.abortMultipartUpload(new AbortMultipartUploadRequest(accountId, vaultName, uploadId));
            throw failure(t, "Unable to finish the upload");
        }
    }

    private UploadResult uploadInSinglePart(final String accountId,
            final String vaultName, final String archiveDescription,
            final File file, ProgressListener progressListener) {
        String checksum = TreeHashGenerator.calculateTreeHash(file);
        ResettableInputStream is = newResettableInputStream(file);
        try {
            publishProgress(progressListener, ProgressEventType.TRANSFER_STARTED_EVENT);
            final UploadArchiveRequest req = new UploadArchiveRequest()
                .withAccountId(accountId)
                .withArchiveDescription(archiveDescription)
                .withVaultName(vaultName)
                .withChecksum(checksum)
                .withBody(is)
                .withContentLength(file.length())
                // capture the bytes transferred
                .withGeneralProgressListener(progressListener)
                ;
            UploadArchiveResult uploadArchiveResult = glacier.uploadArchive(req);
            String artifactId = uploadArchiveResult.getArchiveId();
            publishProgress(progressListener, ProgressEventType.TRANSFER_COMPLETED_EVENT);
            return new UploadResult(artifactId);
        } catch (Throwable t) {
            publishProgress(progressListener, ProgressEventType.TRANSFER_FAILED_EVENT);
            throw failure(t);
        } finally {
            is.release();
        }
    }
}
