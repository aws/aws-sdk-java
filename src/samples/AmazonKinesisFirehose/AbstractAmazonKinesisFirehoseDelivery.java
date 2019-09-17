/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder;
import com.amazonaws.services.identitymanagement.model.CreateRoleRequest;
import com.amazonaws.services.identitymanagement.model.EntityAlreadyExistsException;
import com.amazonaws.services.identitymanagement.model.GetRoleRequest;
import com.amazonaws.services.identitymanagement.model.MalformedPolicyDocumentException;
import com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClientBuilder;
import com.amazonaws.services.kinesisfirehose.model.DeliveryStreamDescription;
import com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamRequest;
import com.amazonaws.services.kinesisfirehose.model.DescribeDeliveryStreamResult;
import com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsRequest;
import com.amazonaws.services.kinesisfirehose.model.ListDeliveryStreamsResult;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult;
import com.amazonaws.services.kinesisfirehose.model.PutRecordRequest;
import com.amazonaws.services.kinesisfirehose.model.Record;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.StringUtils;

/**
 * Abstract class that contains all the common methods used in samples for
 * Amazon S3 and Amazon Redshift destination.
 */
public abstract class AbstractAmazonKinesisFirehoseDelivery {
    // S3 properties
    protected static AmazonS3 s3Client;
    protected static boolean createS3Bucket;
    protected static String s3BucketARN;
    protected static String s3BucketName;
    protected static String s3ObjectPrefix;
    protected static String s3RegionName;

    // DeliveryStream properties
    protected static AmazonKinesisFirehose firehoseClient;
    protected static String accountId;
    protected static String deliveryStreamName;
    protected static String firehoseRegion;
    protected static boolean enableUpdateDestination;

    // S3Destination Properties
    protected static String iamRoleName;
    protected static String s3DestinationAWSKMSKeyId;
    protected static Integer s3DestinationSizeInMBs;
    protected static Integer s3DestinationIntervalInSeconds;

    // Properties Reader
    protected static Properties properties;

    // IAM Permissions Policy Document with KMS Resources. If KMS key ARN is
    // specified, role will be created with KMS resources permission
    private static final String IAM_ROLE_PERMISSIONS_POLICY_WITH_KMS_RESOURCES_DOCUMENT =
            "permissionsPolicyDocument.json";
    // IAM Permissions Policy Document without KMS Resources.
    private static final String IAM_ROLE_PERMISSIONS_POLICY_WITHOUT_KMS_RESOURCES_DOCUMENT =
            "permissionsPolicyWithoutKMSResourcesDocument.json";
    // IAM Trust Policy Document
    private static final String IAM_ROLE_TRUST_POLICY_DOCUMENT = "trustPolicyDocument.json";
    // IAM Role Policy Name
    private static final String FIREHOSE_ROLE_POLICY_NAME = "Firehose_Delivery_Permissions_Policy";

    // Put Data Source File
    private static final String PUT_RECORD_STREAM_SOURCE = "putRecordInput.txt";
    private static final String BATCH_PUT_STREAM_SOURCE = "batchPutInput.txt";
    private static final int BATCH_PUT_MAX_SIZE = 500;

    // Default wait interval for data to be delivered in specified destination.
    protected static final int DEFAULT_WAIT_INTERVAL_FOR_DATA_DELIVERY_SECS = 300;

    // S3 Bucket ARN
    private static final String S3_ARN_PREFIX = "arn:aws:s3:::";

    // IAM Role
    protected static String iamRegion;
    protected static AmazonIdentityManagement iamClient;

    // Logger
    private static final Log LOG = LogFactory.getLog(AbstractAmazonKinesisFirehoseDelivery.class);

    /**
     * Method to initialize the clients using the specified AWSCredentials.
     *
     * @param Exception
     */
    protected static void initClients() throws Exception {
        /*
         * The ProfileCredentialsProvider will return your [default] credential
         * profile by reading from the credentials file located at
         * (~/.aws/credentials).
         */
        ProfileCredentialsProvider credentialsProvider = new ProfileCredentialsProvider();
        try {
            credentialsProvider.getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException("Cannot load the credentials from the credential profiles file. "
                    + "Please make sure that your credentials file is at the correct "
                    + "location (~/.aws/credentials), and is in valid format.", e);
        }

        // S3 client
        s3Client = AmazonS3ClientBuilder.standard()
            .withCredentials(credentialsProvider)
            .withRegion(s3RegionName)
            .build();


        // Firehose client
        firehoseClient = AmazonKinesisFirehoseClientBuilder.standard()
            .withCredentials(credentialsProvider)
            .withRegion(firehoseRegion)
            .build();

        // IAM client
        iamClient = AmazonIdentityManagementClientBuilder.standard()
            .withCredentials(credentialsProvider)
            .withRegion(iamRegion)
            .build();
    }

    /**
     * Method to create the S3 bucket in specified region.
     *
     * @throws Exception
     */
    protected static void createS3Bucket() throws Exception {
        if (StringUtils.isNullOrEmpty(s3BucketName.trim())) {
            throw new IllegalArgumentException("Bucket name is empty. Please enter a bucket name "
                    + "in firehosetos3sample.properties file");
        }

        // Create S3 bucket if specified in the properties
        if (createS3Bucket) {
            s3Client.createBucket(s3BucketName);
            LOG.info("Created bucket " + s3BucketName + " in S3 to deliver Firehose records");
        }
    }

    /**
     * Method to print all the delivery streams in the customer account.
     */
    protected static void printDeliveryStreams() {
        // list all of my DeliveryStreams
        List<String> deliveryStreamNames = listDeliveryStreams();
        LOG.info("Printing my list of DeliveryStreams : ");
        if (deliveryStreamNames.isEmpty()) {
            LOG.info("There are no DeliveryStreams for account: " + accountId);
        } else {
            LOG.info("List of my DeliveryStreams: ");
        }

        for (int i = 0; i < deliveryStreamNames.size(); i++) {
            LOG.info(deliveryStreamNames.get(i));
        }
    }

    /**
     * Method to list all the delivery streams in the customer account.
     *
     * @return the collection of delivery streams
     */
    protected static List<String> listDeliveryStreams() {
        ListDeliveryStreamsRequest listDeliveryStreamsRequest = new ListDeliveryStreamsRequest();
        ListDeliveryStreamsResult listDeliveryStreamsResult =
                firehoseClient.listDeliveryStreams(listDeliveryStreamsRequest);
        List<String> deliveryStreamNames = listDeliveryStreamsResult.getDeliveryStreamNames();
        while (listDeliveryStreamsResult.isHasMoreDeliveryStreams()) {
            if (deliveryStreamNames.size() > 0) {
                listDeliveryStreamsRequest.setExclusiveStartDeliveryStreamName(deliveryStreamNames.get(deliveryStreamNames.size() - 1));
            }

            listDeliveryStreamsResult = firehoseClient.listDeliveryStreams(listDeliveryStreamsRequest);
            deliveryStreamNames.addAll(listDeliveryStreamsResult.getDeliveryStreamNames());

        }
        return deliveryStreamNames;
    }

    /**
     * Method to put records in the specified delivery stream by reading
     * contents from sample input file using PutRecord API.
     *
     * @throws IOException
     */
    protected static void putRecordIntoDeliveryStream() throws IOException {
        try (InputStream inputStream =
                Thread.currentThread().getContextClassLoader().getResourceAsStream(PUT_RECORD_STREAM_SOURCE)) {
            if (inputStream == null) {
                throw new FileNotFoundException("Could not find file " + PUT_RECORD_STREAM_SOURCE);
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    PutRecordRequest putRecordRequest = new PutRecordRequest();
                    putRecordRequest.setDeliveryStreamName(deliveryStreamName);

                    String data = line + "\n";
                    Record record = createRecord(data);
                    putRecordRequest.setRecord(record);

                    // Put record into the DeliveryStream
                    firehoseClient.putRecord(putRecordRequest);
                }
            }
        }
    }

    /**
     * Method to put records in the specified delivery stream by reading
     * contents from sample input file using PutRecordBatch API.
     *
     * @throws IOException
     */
    protected static void putRecordBatchIntoDeliveryStream() throws IOException {
        try (InputStream inputStream =
                Thread.currentThread().getContextClassLoader().getResourceAsStream(BATCH_PUT_STREAM_SOURCE)) {
            if (inputStream == null) {
                throw new FileNotFoundException("Could not find file " + BATCH_PUT_STREAM_SOURCE);
            }

            List<Record> recordList = new ArrayList<Record>();
            int batchSize = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    String data = line + "\n";
                    Record record = createRecord(data);
                    recordList.add(record);
                    batchSize++;

                    if (batchSize == BATCH_PUT_MAX_SIZE) {
                        putRecordBatch(recordList);

                        recordList.clear();
                        batchSize = 0;
                    }
                }

                if (batchSize > 0) {
                    putRecordBatch(recordList);
                }
            }
        }
    }

    /**
     * Method to create the IAM role.
     *
     * @param s3Prefix the s3Prefix to be specified in role policy (only when KMS key ARN is specified)
     * @return the role ARN
     * @throws InterruptedException
     */
    protected static String createIamRole(String s3Prefix) throws InterruptedException {
        try {
            //set trust policy for the role
            iamClient.createRole(new CreateRoleRequest()
                    .withRoleName(iamRoleName)
                    .withAssumeRolePolicyDocument(getTrustPolicy()));
        } catch (EntityAlreadyExistsException e) {
            LOG.info("IAM role with name " + iamRoleName + " already exists");
        } catch (MalformedPolicyDocumentException policyDocumentException){
			LOG.error(String.format("Please check the trust policy document for malformation: %s",
					IAM_ROLE_TRUST_POLICY_DOCUMENT));
            throw policyDocumentException;
        }

        // Update the role policy with permissions so that principal can access the resources
        // with necessary conditions
        putRolePolicy(s3Prefix);

        String roleARN = iamClient.getRole(new GetRoleRequest().withRoleName(iamRoleName)).getRole().getArn();
        // Sleep for 5 seconds because IAM role creation takes some time to propagate
        Thread.sleep(5000);
        return roleARN;
    }

    /**
     * Method to wait until the delivery stream becomes active.
     *
     * @param deliveryStreamName the delivery stream
     * @throws Exception
     */
    protected static void waitForDeliveryStreamToBecomeAvailable(String deliveryStreamName) throws Exception {

        LOG.info("Waiting for " + deliveryStreamName + " to become ACTIVE...");

        long startTime = System.currentTimeMillis();
        long endTime = startTime + (10 * 60 * 1000);
        while (System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1000 * 20);
            } catch (InterruptedException e) {
                // Ignore interruption (doesn't impact deliveryStream creation)
            }

            DeliveryStreamDescription deliveryStreamDescription = describeDeliveryStream(deliveryStreamName);
            String deliveryStreamStatus = deliveryStreamDescription.getDeliveryStreamStatus();
            LOG.info("  - current state: " + deliveryStreamStatus);
            if (deliveryStreamStatus.equals("ACTIVE")) {
                return;
            }
        }

        throw new AmazonServiceException("DeliveryStream " + deliveryStreamName + " never went active");
    }

    /**
     * Method to describe the delivery stream.
     *
     * @param deliveryStreamName the delivery stream
     * @return the delivery description
     */
    protected static DeliveryStreamDescription describeDeliveryStream(String deliveryStreamName) {
        DescribeDeliveryStreamRequest describeDeliveryStreamRequest = new DescribeDeliveryStreamRequest();
        describeDeliveryStreamRequest.withDeliveryStreamName(deliveryStreamName);
        DescribeDeliveryStreamResult describeDeliveryStreamResponse =
                firehoseClient.describeDeliveryStream(describeDeliveryStreamRequest);
        return describeDeliveryStreamResponse.getDeliveryStreamDescription();
    }

    /**
     * Method to wait for the specified buffering interval seconds so that data
     * will be delivered to corresponding destination.
     *
     * @param waitTimeSecs the buffering interval seconds to wait upon
     * @throws InterruptedException
     */
    protected static void waitForDataDelivery(int waitTimeSecs) throws InterruptedException {
        LOG.info("Since the Buffering Hints IntervalInSeconds parameter is specified as: " + waitTimeSecs
                + " seconds. Waiting for " + waitTimeSecs + " seconds for the data to be written to S3 bucket");
        TimeUnit.SECONDS.sleep(waitTimeSecs);

        LOG.info("Data delivery to S3 bucket " + s3BucketName + " is complete");
    }

    /**
     * Method to return the bucket ARN.
     *
     * @param bucketName the bucket name to be formulated as ARN
     * @return the bucket ARN
     * @throws IllegalArgumentException
     */
    protected static String getBucketARN(String bucketName) throws IllegalArgumentException {
        return new StringBuilder().append(S3_ARN_PREFIX).append(bucketName).toString();
    }

    /**
     * Method to perform PutRecordBatch operation with the given record list.
     *
     * @param recordList the collection of records
     * @return the output of PutRecordBatch
     */
    private static PutRecordBatchResult putRecordBatch(List<Record> recordList) {
        PutRecordBatchRequest putRecordBatchRequest = new PutRecordBatchRequest();
        putRecordBatchRequest.setDeliveryStreamName(deliveryStreamName);
        putRecordBatchRequest.setRecords(recordList);

        // Put Record Batch records. Max No.Of Records we can put in a
        // single put record batch request is 500
        return firehoseClient.putRecordBatch(putRecordBatchRequest);
    }

    /**
     * Method to put the role policy with permissions document. Permission document would change
     * based on KMS Key ARN specified in properties file. If KMS Key ARN is specified, permissions
     * document will contain KMS resource.
     *
     * @param s3Prefix the s3Prefix which will be included in KMS Condition (only if KMS Key is provided)
     */
    protected static void putRolePolicy(String s3Prefix) {
        try {
            // set permissions policy for the role
            String permissionsPolicyDocument =
                    containsKMSKeyARN() ? getPermissionsPolicyWithKMSResources(s3Prefix)
                            : getPermissionsPolicyWithoutKMSResources();
            iamClient.putRolePolicy(new PutRolePolicyRequest()
                    .withRoleName(iamRoleName)
                    .withPolicyName(FIREHOSE_ROLE_POLICY_NAME)
                    .withPolicyDocument(permissionsPolicyDocument));
        } catch (MalformedPolicyDocumentException policyDocumentException){
            LOG.error(String.format("Please check the permissions policy document for malformation: %s",
                    containsKMSKeyARN() ? IAM_ROLE_PERMISSIONS_POLICY_WITH_KMS_RESOURCES_DOCUMENT
                            : IAM_ROLE_PERMISSIONS_POLICY_WITHOUT_KMS_RESOURCES_DOCUMENT));
            throw policyDocumentException;
        }
    }

    /**
     * Method to return the trust policy document to create a role.
     *
     * @return the trust policy document
     */
    private static String getTrustPolicy() {
        return readResource(IAM_ROLE_TRUST_POLICY_DOCUMENT)
                .replace("{{CUSTOMER_ACCOUNT_ID}}", accountId);
    }

    /**
     * Method to return the permissions policy document with KMS resource.
     *
     * @param s3Prefix the s3Prefix to be specified in KMS Condition
     * @return the permissions policy document
     */
    private static String getPermissionsPolicyWithKMSResources(String s3Prefix) {
        return readResource(IAM_ROLE_PERMISSIONS_POLICY_WITH_KMS_RESOURCES_DOCUMENT)
                .replace("{{S3_BUCKET_NAME}}", s3BucketName)
                .replace("{{KMS_KEY_ARN}}", s3DestinationAWSKMSKeyId)
                .replace("{{S3_REGION}}", s3RegionName)
                .replace("{{S3_PREFIX}}", s3Prefix);
    }

    /**
     * Method to return the permissions policy document without KMS resource.
     *
     * @return the permissions policy document
     */
    private static String getPermissionsPolicyWithoutKMSResources() {
        return readResource(IAM_ROLE_PERMISSIONS_POLICY_WITHOUT_KMS_RESOURCES_DOCUMENT)
                .replace("{{S3_BUCKET_NAME}}", s3BucketName);
    }

    /**
     * Method to read the resource for the given filename.
     *
     * @param name the file name
     * @return the input stream as string
     */
    private static String readResource(String name) {
        try {
            return IOUtils.toString(AmazonKinesisFirehoseToRedshiftSample.class.getResourceAsStream(name));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read document resource: " + name, e);
        }
    }

    /**
     * Returns true if the KMS Key ARN is specified in properties file.
     *
     * @return true, if KMS Key is specified
     */
    private static boolean containsKMSKeyARN() {
        return !StringUtils.isNullOrEmpty(s3DestinationAWSKMSKeyId);
    }

    /**
     * Method to create the record object for given data.
     *
     * @param data the content data
     * @return the Record object
     */
    private static Record createRecord(String data) {
        return new Record().withData(ByteBuffer.wrap(data.getBytes()));
    }
}
