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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.kinesisfirehose.model.BufferingHints;
import com.amazonaws.services.kinesisfirehose.model.CompressionFormat;
import com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest;
import com.amazonaws.services.kinesisfirehose.model.DeliveryStreamDescription;
import com.amazonaws.services.kinesisfirehose.model.EncryptionConfiguration;
import com.amazonaws.services.kinesisfirehose.model.KMSEncryptionConfig;
import com.amazonaws.services.kinesisfirehose.model.NoEncryptionConfig;
import com.amazonaws.services.kinesisfirehose.model.S3DestinationConfiguration;
import com.amazonaws.services.kinesisfirehose.model.S3DestinationUpdate;
import com.amazonaws.services.kinesisfirehose.model.UpdateDestinationRequest;
import com.amazonaws.util.StringUtils;

/**
 * Amazon Kinesis Firehose is a fully managed service for real-time streaming data delivery
 * to destinations such as Amazon S3 and Amazon Redshift. Firehose is part of the Amazon Kinesis
 * streaming data family, along with Amazon Kinesis Streams. With Firehose, you do not need to
 * write any applications or manage any resources. You configure your data producers to send data
 * to Firehose and it automatically delivers the data to the destination that you specified.
 *
 * Detailed Amazon Kinesis Firehose documentation can be found here:
 * https://aws.amazon.com/documentation/firehose/
 *
 * This is a sample java application to deliver data to Amazon S3 destination.
 */
public class AmazonKinesisFirehoseToS3Sample extends AbstractAmazonKinesisFirehoseDelivery {

    /*
     * Before running the code:
     *
     * Step 1: Please check you have AWS access credentials set under
     * (~/.aws/credentials). If not, fill in your AWS access credentials in the
     * provided credentials file template, and be sure to move the file to the
     * default location (~/.aws/credentials) where the sample code will load the
     * credentials from.
     * https://console.aws.amazon.com/iam/home?#security_credential
     *
     * WARNING: To avoid accidental leakage of your credentials, DO NOT keep the
     * credentials file in your source directory.
     *
     * Step 2: Update the firehosetos3sample.properties file with the required parameters.
     */

    // DeliveryStream properties
    private static String updateS3ObjectPrefix;
    private static Integer updateSizeInMBs;
    private static Integer updateIntervalInSeconds;

    // Properties File
    private static final String CONFIG_FILE = "firehosetos3sample.properties";

    // Logger
    private static final Log LOG = LogFactory.getLog(AmazonKinesisFirehoseToS3Sample.class);

    /**
     * Initialize the parameters.
     *
     * @throws Exception
     */
    private static void init() throws Exception {
        // Load the parameters from properties file
        loadConfig();

        // Initialize the clients
        initClients();

        // Validate AccountId parameter is set
        if (StringUtils.isNullOrEmpty(accountId)) {
            throw new IllegalArgumentException("AccountId is empty. Please enter the accountId in "
                    + CONFIG_FILE + " file");
        }
    }

    /**
     * Load the input parameters from properties file.
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void loadConfig() throws FileNotFoundException, IOException {
        try (InputStream configStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (configStream == null) {
                throw new FileNotFoundException();
            }

            properties = new Properties();
            properties.load(configStream);
        }

        // Read properties
        accountId = properties.getProperty("customerAccountId");
        createS3Bucket = Boolean.valueOf(properties.getProperty("createS3Bucket"));
        s3RegionName = properties.getProperty("s3RegionName");
        s3BucketName = properties.getProperty("s3BucketName").trim();
        s3BucketARN = getBucketARN(s3BucketName);
        s3ObjectPrefix = properties.getProperty("s3ObjectPrefix").trim();

        String sizeInMBsProperty = properties.getProperty("destinationSizeInMBs");
        s3DestinationSizeInMBs = StringUtils.isNullOrEmpty(sizeInMBsProperty) ? null : Integer.parseInt(sizeInMBsProperty.trim());
        String intervalInSecondsProperty = properties.getProperty("destinationIntervalInSeconds");
        s3DestinationIntervalInSeconds = StringUtils.isNullOrEmpty(intervalInSecondsProperty) ? null : Integer.parseInt(intervalInSecondsProperty.trim());

        deliveryStreamName = properties.getProperty("deliveryStreamName");
        s3DestinationAWSKMSKeyId = properties.getProperty("destinationAWSKMSKeyId");
        firehoseRegion = properties.getProperty("firehoseRegion");
        iamRoleName = properties.getProperty("iamRoleName");
        iamRegion = properties.getProperty("iamRegion");

        // Update Delivery Stream Destination related properties
        enableUpdateDestination = Boolean.valueOf(properties.getProperty("updateDestination"));
        updateS3ObjectPrefix = properties.getProperty("updateS3ObjectPrefix").trim();
        String updateSizeInMBsProperty = properties.getProperty("updateSizeInMBs");
        updateSizeInMBs = StringUtils.isNullOrEmpty(updateSizeInMBsProperty) ? null : Integer.parseInt(updateSizeInMBsProperty.trim());
        String updateIntervalInSecondsProperty = properties.getProperty("updateIntervalInSeconds");
        updateIntervalInSeconds = StringUtils.isNullOrEmpty(updateIntervalInSecondsProperty) ? null : Integer.parseInt(updateIntervalInSecondsProperty.trim());
    }

    public static void main(String[] args) throws Exception {
        init();

        try {
            // Create S3 bucket for deliveryStream to deliver data
            createS3Bucket();

            // Create the DeliveryStream
            createDeliveryStream();

            // Print the list of delivery streams
            printDeliveryStreams();

            // Put records into deliveryStream
            LOG.info("Putting records in deliveryStream : " + deliveryStreamName + " via Put Record method.");
            putRecordIntoDeliveryStream();

            // Batch Put records into deliveryStream
            LOG.info("Putting records in deliveryStream : " + deliveryStreamName
                    + " via Put Record Batch method. Now you can check your S3 bucket " + s3BucketName
                    + " for the data delivered by deliveryStream.");
            putRecordBatchIntoDeliveryStream();

            // Wait for some interval for the firehose to write data to the S3 bucket
            int waitTimeSecs = s3DestinationIntervalInSeconds == null ? DEFAULT_WAIT_INTERVAL_FOR_DATA_DELIVERY_SECS : s3DestinationIntervalInSeconds;
            waitForDataDelivery(waitTimeSecs);

            // Update the deliveryStream and Put records into updated deliveryStream, only if the flag is set
            if (enableUpdateDestination) {
                // Update the deliveryStream
                updateDeliveryStream();

                // Wait for some interval to propagate the updated configuration options before ingesting data
                LOG.info("Waiting for few seconds to propagate the updated configuration options.");
                TimeUnit.SECONDS.sleep(60);

                // Put records into updated deliveryStream. Records will be delivered to new S3 prefix location
                LOG.info("Putting records in updated deliveryStream : " + deliveryStreamName + " via Put Record method.");
                putRecordIntoDeliveryStream();

                // Batch Put records into updated deliveryStream. Records will be delivered to new S3 prefix location
                LOG.info("Putting records in updated deliveryStream : " + deliveryStreamName + " via Put Record Batch method.");
                putRecordBatchIntoDeliveryStream();

                // Wait for some interval for the deliveryStream to write data to new prefix location in S3 bucket
                waitTimeSecs = updateIntervalInSeconds == null ? waitTimeSecs : updateIntervalInSeconds;
                waitForDataDelivery(waitTimeSecs);
            }
        } catch (AmazonServiceException ase) {
            LOG.error("Caught Amazon Service Exception");
            LOG.error("Status Code " + ase.getErrorCode());
            LOG.error("Message: " + ase.getErrorMessage(), ase);
        } catch (AmazonClientException ace) {
            LOG.error("Caught Amazon Client Exception");
            LOG.error("Exception Message " + ace.getMessage(), ace);
        }
    }

    /**
     * Method to create delivery stream for S3 destination configuration.
     *
     * @throws Exception
     */
    private static void createDeliveryStream() throws Exception {

        boolean deliveryStreamExists = false;

        LOG.info("Checking if " + deliveryStreamName + " already exits");
        List<String> deliveryStreamNames = listDeliveryStreams();
        if (deliveryStreamNames != null && deliveryStreamNames.contains(deliveryStreamName)) {
            deliveryStreamExists = true;
            LOG.info("DeliveryStream " + deliveryStreamName + " already exists. Not creating the new delivery stream");
        } else {
            LOG.info("DeliveryStream " + deliveryStreamName + " does not exist");
        }

        if (!deliveryStreamExists) {
            // Create deliveryStream
            CreateDeliveryStreamRequest createDeliveryStreamRequest = new CreateDeliveryStreamRequest();
            createDeliveryStreamRequest.setDeliveryStreamName(deliveryStreamName);

            S3DestinationConfiguration s3DestinationConfiguration = new S3DestinationConfiguration();
            s3DestinationConfiguration.setBucketARN(s3BucketARN);
            s3DestinationConfiguration.setPrefix(s3ObjectPrefix);
            // Could also specify GZIP or ZIP
            s3DestinationConfiguration.setCompressionFormat(CompressionFormat.UNCOMPRESSED);

            // Encryption configuration is optional
            EncryptionConfiguration encryptionConfiguration = new EncryptionConfiguration();
            if (!StringUtils.isNullOrEmpty(s3DestinationAWSKMSKeyId)) {
                encryptionConfiguration.setKMSEncryptionConfig(new KMSEncryptionConfig()
                        .withAWSKMSKeyARN(s3DestinationAWSKMSKeyId));
            } else {
                encryptionConfiguration.setNoEncryptionConfig(NoEncryptionConfig.NoEncryption);
            }
            s3DestinationConfiguration.setEncryptionConfiguration(encryptionConfiguration);

            BufferingHints bufferingHints = null;
            if (s3DestinationSizeInMBs != null || s3DestinationIntervalInSeconds != null) {
                bufferingHints = new BufferingHints();
                bufferingHints.setSizeInMBs(s3DestinationSizeInMBs);
                bufferingHints.setIntervalInSeconds(s3DestinationIntervalInSeconds);
            }
            s3DestinationConfiguration.setBufferingHints(bufferingHints);

            // Create and set IAM role so that firehose service has access to the S3Buckets to put data 
            // and KMS keys (if provided) to encrypt data. Please check the trustPolicyDocument.json and 
            // permissionsPolicyDocument.json files for the trust and permissions policies set for the role.
            String iamRoleArn = createIamRole(s3ObjectPrefix);
            s3DestinationConfiguration.setRoleARN(iamRoleArn);
            
            createDeliveryStreamRequest.setS3DestinationConfiguration(s3DestinationConfiguration);

            firehoseClient.createDeliveryStream(createDeliveryStreamRequest);

            // The Delivery Stream is now being created.
            LOG.info("Creating DeliveryStream : " + deliveryStreamName);
            waitForDeliveryStreamToBecomeAvailable(deliveryStreamName);
        }
    }

    /**
     * Method to update s3 destination with updated s3Prefix, and buffering hints values.
     *
     * @throws Exception
     */
    private static void updateDeliveryStream() throws Exception {
        DeliveryStreamDescription deliveryStreamDescription = describeDeliveryStream(deliveryStreamName);
        
        LOG.info("Updating DeliveryStream Destination: " + deliveryStreamName + " with new configuration options");
        // get(0) -> DeliveryStream currently supports only one destination per DeliveryStream
        UpdateDestinationRequest updateDestinationRequest = 
                new UpdateDestinationRequest()
                    .withDeliveryStreamName(deliveryStreamName)
                    .withCurrentDeliveryStreamVersionId(deliveryStreamDescription.getVersionId())
                    .withDestinationId(deliveryStreamDescription.getDestinations().get(0).getDestinationId());
        
        S3DestinationUpdate s3DestinationUpdate = new S3DestinationUpdate();
        s3DestinationUpdate.withPrefix(updateS3ObjectPrefix);

        BufferingHints bufferingHints = null;
        if (updateSizeInMBs != null || updateIntervalInSeconds != null) {
            bufferingHints = new BufferingHints();
            bufferingHints.setSizeInMBs(updateSizeInMBs);
            bufferingHints.setIntervalInSeconds(updateIntervalInSeconds);
        }
        s3DestinationUpdate.setBufferingHints(bufferingHints);

        // Update the role policy with new s3Prefix configuration
        putRolePolicy(updateS3ObjectPrefix);

        updateDestinationRequest.setS3DestinationUpdate(s3DestinationUpdate);

        // Update deliveryStream destination with new configuration options such as s3Prefix and Buffering Hints.
        // Can also update Compression format, KMS key values and IAM Role.
        firehoseClient.updateDestination(updateDestinationRequest);
    }
}
