/*
 * Copyright 2012 Amazon Technologies, Inc.
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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.glacier.AmazonGlacier;
import com.amazonaws.services.glacier.AmazonGlacierClient;
import com.amazonaws.services.glacier.TreeHashGenerator;
import com.amazonaws.services.glacier.internal.TreeHashInputStream;
import com.amazonaws.services.glacier.model.AbortMultipartUploadRequest;
import com.amazonaws.services.glacier.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.glacier.model.CompleteMultipartUploadResult;
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
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.util.BinaryUtils;

/**
 * Utilities for uploading and downloading data to and from AWS Glacier.
 */
public class ArchiveTransferManager {

    /** The maximum part size, in bytes, for a Glacier multipart upload. */
    private static final long MAXIMUM_PART_SIZE = 1024L * 1024 * 1024 * 4;

    /** The minimum part size, in bytes, for a Glacier multipart upload. */
    private static final long MINIMUM_PART_SIZE = 1024L * 1024;

    /** Threshold, in bytes, for when to use the multipart upload operations */
    private static final long MULTIPART_UPLOAD_SIZE_THRESHOLD = 1024L * 1024L * 100;

    /** Glacier client used for making all requests. */
    private final AmazonGlacier glacier;

	private final AWSCredentialsProvider credentialsProvider;

	private final ClientConfiguration clientConfiguration;

	private final AmazonSQSClient sqs;

	private final AmazonSNSClient sns;

	/**
	 * Constructs a new ArchiveTransferManager, using the specified AWS
	 * credentials to authenticate requests.
	 *
	 * @param credentials
	 *            The AWS credentials used to authenticate requests.
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
	 */
    public ArchiveTransferManager(AmazonGlacierClient glacier, AmazonSQSClient sqs, AmazonSNSClient sns) {
    	this.credentialsProvider = null;
    	this.clientConfiguration = null;
    	this.glacier = glacier;
		this.sqs = sqs;
		this.sns = sns;
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
        if (file.length() > MULTIPART_UPLOAD_SIZE_THRESHOLD) {
            return uploadInMultipleParts(accountId, vaultName, archiveDescription, file);
        } else {
            return uploadInSinglePart(accountId, vaultName, archiveDescription, file);
        }
    }

	/**
	 * Downloads an archive from Amazon Glacier in the specified vault for the
	 * current user's account, and saves it to the specified file. Amazon
	 * Glacier is optimized for long term storage of data that isn't needed
	 * quickly. This method will first make a request to Amazon Glacier to
	 * prepare the archive to be downloaded. Once Glacier has finished preparing
	 * the archive to be downloaded, this method will start downloading the data
	 * and storing it in the specified file.
	 *
	 * @param vaultName
	 *            The name of the vault to download the archive from.
	 * @param archiveId
	 *            The unique ID of the archive to download.
	 * @param file
	 *            The file save the archive to.
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
	 *            The file save the archive to.
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

    	JobStatusMonitor jobStatusMonitor = null;
    	GetJobOutputResult jobOutputResult = null;
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
    		String jobId = archiveRetrievalResult.getJobId();

    		jobStatusMonitor.waitForJobToComplete(jobId);
    		jobOutputResult = glacier.getJobOutput(new GetJobOutputRequest()
    			.withAccountId(accountId)
    			.withVaultName(vaultName)
    			.withJobId(jobId));
    	} finally {
            if ( jobStatusMonitor != null ) {
                jobStatusMonitor.shutdown();
            }
    	}

    	downloadJobOutput(jobOutputResult, file);
    }

    private void downloadJobOutput(GetJobOutputResult jobOutputResult, File file) {
        TreeHashInputStream input;
        OutputStream output = null;
        byte[] buffer = new byte[1024 * 1024];
		try {
			input = new TreeHashInputStream(new BufferedInputStream(jobOutputResult.getBody()));
		} catch (NoSuchAlgorithmException e) {
			throw new AmazonClientException("Unable to compute hash for data integrity", e);
		}

        try {
            output = new BufferedOutputStream(new FileOutputStream(file));

            int bytesRead = 0;
            do {
            	bytesRead = input.read(buffer);
            	if (bytesRead <= 0) break;
            	output.write(buffer, 0, bytesRead);
            } while (bytesRead > 0);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to save archive to disk", e);
        } finally {
            try {input.close();}  catch (Exception e) {}
            try {output.close();} catch (Exception e) {}

            try {
				String clientSideTreeHash = input.getTreeHash();
				String serverSideTreeHash = jobOutputResult.getChecksum();
				if (!clientSideTreeHash.equalsIgnoreCase(serverSideTreeHash)) {
					throw new AmazonClientException("Client side computed hash doesn't match server side hash; possible data corruption");
				}
			} catch (IOException e) {
				throw new AmazonClientException("Error while trying to confirm data integrity for archive download", e);
			}
        }
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
        while (partSize * approxNumParts < fileSize && partSize*2 <= MAXIMUM_PART_SIZE) {
            partSize *= 2;
            approxNumParts *= 2;
        }
        return partSize;
    }

    private InputSubstream newInputSubstream(File file, long startingPosition, long length) {
        try {
            return new InputSubstream(new RepeatableFileInputStream(file), startingPosition, length, true);
        } catch (FileNotFoundException e) {
            throw new AmazonClientException("Unable to find file '" + file.getAbsolutePath() + "'", e);
        }
    }

    private UploadResult uploadInMultipleParts(final String accountId, final String vaultName, final String archiveDescription, final File file) {
        long partSize = calculatePartSize(file.length());
        String partSizeString = Long.toString(partSize);
        InitiateMultipartUploadResult initiateResult = glacier.initiateMultipartUpload(new InitiateMultipartUploadRequest()
            .withAccountId(accountId)
            .withArchiveDescription(archiveDescription)
            .withVaultName(vaultName)
            .withPartSize(partSizeString));
        String uploadId = initiateResult.getUploadId();

        try {
	        List<byte[]> binaryChecksums = new LinkedList<byte[]>();

	        long currentPosition = 0;
	        while (currentPosition < file.length()) {
	            long length = partSize;
	            if (currentPosition + partSize > file.length()) {
	                length = file.length() - currentPosition;
	            }

				InputStream inputSubStream = newInputSubstream(file, currentPosition, length);
				inputSubStream.mark(-1);
				String checksum = TreeHashGenerator.calculateTreeHash(inputSubStream);
				byte[] binaryChecksum = BinaryUtils.fromHex(checksum);
				binaryChecksums.add(binaryChecksum);
				inputSubStream.reset();
				
	            try {
	                glacier.uploadMultipartPart(new UploadMultipartPartRequest()
	                    .withAccountId(accountId)
	                    .withChecksum(checksum)
	                    .withBody(inputSubStream)
	                    .withRange("bytes " + currentPosition + "-" + (currentPosition + length - 1) + "/*")
	                    .withUploadId(uploadId)
	                    .withVaultName(vaultName));
	            } finally {
	                try {inputSubStream.close();} catch (Exception e) {}
	            }

	            currentPosition += partSize;
	        }

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
	        return new UploadResult(artifactId);
		} catch (Exception e) {
			glacier.abortMultipartUpload(new AbortMultipartUploadRequest(accountId, vaultName, uploadId));
			throw new AmazonClientException("Unable to finish the upload", e);
		}
    }


    private UploadResult uploadInSinglePart(final String accountId, final String vaultName, final String archiveDescription, final File file)
            throws AmazonServiceException, AmazonClientException, FileNotFoundException {
        String checksum = TreeHashGenerator.calculateTreeHash(file);

        RepeatableFileInputStream input = new RepeatableFileInputStream(file);
        try {
            UploadArchiveResult uploadArchiveResult =
                glacier.uploadArchive(new UploadArchiveRequest()
                    .withAccountId(accountId)
                    .withArchiveDescription(archiveDescription)
                    .withVaultName(vaultName)
                    .withChecksum(checksum)
                    .withBody(input)
                    .withContentLength(file.length())
                    );
            String artifactId = uploadArchiveResult.getArchiveId();
            return new UploadResult(artifactId);
        } finally {
            try {input.close();} catch (Exception e) {}
        }
    }

}
