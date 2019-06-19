/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.comprehend.model.*;

/**
 * Interface for accessing Amazon Comprehend.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.comprehend.AbstractAmazonComprehend} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Comprehend is an AWS service for gaining insight into the content of documents. Use these actions to determine
 * the topics contained in your documents, the topics they discuss, the predominant sentiment expressed in them, the
 * predominant language used, and more.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonComprehend {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "comprehend";

    /**
     * <p>
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon
     * Comprehend can detect, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon
     * Comprehend Supported Languages</a>.
     * </p>
     * 
     * @param batchDetectDominantLanguageRequest
     * @return Result of the BatchDetectDominantLanguage operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDetectDominantLanguageResult batchDetectDominantLanguage(BatchDetectDominantLanguageRequest batchDetectDominantLanguageRequest);

    /**
     * <p>
     * Inspects the text of a batch of documents for named entities and returns information about them. For more
     * information about named entities, see <a>how-entities</a>
     * </p>
     * 
     * @param batchDetectEntitiesRequest
     * @return Result of the BatchDetectEntities operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntities" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDetectEntitiesResult batchDetectEntities(BatchDetectEntitiesRequest batchDetectEntitiesRequest);

    /**
     * <p>
     * Detects the key noun phrases found in a batch of documents.
     * </p>
     * 
     * @param batchDetectKeyPhrasesRequest
     * @return Result of the BatchDetectKeyPhrases operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectKeyPhrases"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDetectKeyPhrasesResult batchDetectKeyPhrases(BatchDetectKeyPhrasesRequest batchDetectKeyPhrasesRequest);

    /**
     * <p>
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, <code>POSITIVE</code>,
     * <code>NEUTRAL</code>, <code>MIXED</code>, or <code>NEGATIVE</code>, in each one.
     * </p>
     * 
     * @param batchDetectSentimentRequest
     * @return Result of the BatchDetectSentiment operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSentiment"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDetectSentimentResult batchDetectSentiment(BatchDetectSentimentRequest batchDetectSentimentRequest);

    /**
     * <p>
     * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and
     * returns information about them. For more information, see <a>how-syntax</a>.
     * </p>
     * 
     * @param batchDetectSyntaxRequest
     * @return Result of the BatchDetectSyntax operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws BatchSizeLimitExceededException
     *         The number of documents in the request exceeds the limit of 25. Try your request again with fewer
     *         documents.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.BatchDetectSyntax
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSyntax" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDetectSyntaxResult batchDetectSyntax(BatchDetectSyntaxRequest batchDetectSyntaxRequest);

    /**
     * <p>
     * Creates a new document classifier that you can use to categorize documents. To create a classifier you provide a
     * set of training documents that labeled with the categories that you want to use. After the classifier is trained
     * you can use it to categorize a set of labeled documents into the categories. For more information, see
     * <a>how-document-classification</a>.
     * </p>
     * 
     * @param createDocumentClassifierRequest
     * @return Result of the CreateDocumentClassifier operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceInUseException
     *         The specified name is already in use. Use a different name and try your request again.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceLimitExceededException
     *         The maximum number of recognizers per account has been exceeded. Review the recognizers, perform cleanup,
     *         and then try your request again.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.CreateDocumentClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateDocumentClassifier"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDocumentClassifierResult createDocumentClassifier(CreateDocumentClassifierRequest createDocumentClassifierRequest);

    /**
     * <p>
     * Creates an entity recognizer using submitted files. After your <code>CreateEntityRecognizer</code> request is
     * submitted, you can check job status using the API.
     * </p>
     * 
     * @param createEntityRecognizerRequest
     * @return Result of the CreateEntityRecognizer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceInUseException
     *         The specified name is already in use. Use a different name and try your request again.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceLimitExceededException
     *         The maximum number of recognizers per account has been exceeded. Review the recognizers, perform cleanup,
     *         and then try your request again.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.CreateEntityRecognizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/CreateEntityRecognizer"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEntityRecognizerResult createEntityRecognizer(CreateEntityRecognizerRequest createEntityRecognizerRequest);

    /**
     * <p>
     * Deletes a previously created document classifier
     * </p>
     * <p>
     * Only those classifiers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
     * job is using the model, a <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the classifier into a DELETING state, and it is then removed by a
     * background job. Once removed, the classifier disappears from your account and is no longer available for use.
     * </p>
     * 
     * @param deleteDocumentClassifierRequest
     * @return Result of the DeleteDocumentClassifier operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ResourceUnavailableException
     *         The specified resource is not available. Check to see if the resource is in the <code>TRAINED</code>
     *         state and try your request again.
     * @throws ResourceInUseException
     *         The specified name is already in use. Use a different name and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DeleteDocumentClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DeleteDocumentClassifier"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDocumentClassifierResult deleteDocumentClassifier(DeleteDocumentClassifierRequest deleteDocumentClassifierRequest);

    /**
     * <p>
     * Deletes an entity recognizer.
     * </p>
     * <p>
     * Only those recognizers that are in terminated states (IN_ERROR, TRAINED) will be deleted. If an active inference
     * job is using the model, a <code>ResourceInUseException</code> will be returned.
     * </p>
     * <p>
     * This is an asynchronous action that puts the recognizer into a DELETING state, and it is then removed by a
     * background job. Once removed, the recognizer disappears from your account and is no longer available for use.
     * </p>
     * 
     * @param deleteEntityRecognizerRequest
     * @return Result of the DeleteEntityRecognizer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ResourceUnavailableException
     *         The specified resource is not available. Check to see if the resource is in the <code>TRAINED</code>
     *         state and try your request again.
     * @throws ResourceInUseException
     *         The specified name is already in use. Use a different name and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DeleteEntityRecognizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DeleteEntityRecognizer"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEntityRecognizerResult deleteEntityRecognizer(DeleteEntityRecognizerRequest deleteEntityRecognizerRequest);

    /**
     * <p>
     * Gets the properties associated with a document classification job. Use this operation to get the status of a
     * classification job.
     * </p>
     * 
     * @param describeDocumentClassificationJobRequest
     * @return Result of the DescribeDocumentClassificationJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeDocumentClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDocumentClassificationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDocumentClassificationJobResult describeDocumentClassificationJob(DescribeDocumentClassificationJobRequest describeDocumentClassificationJobRequest);

    /**
     * <p>
     * Gets the properties associated with a document classifier.
     * </p>
     * 
     * @param describeDocumentClassifierRequest
     * @return Result of the DescribeDocumentClassifier operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeDocumentClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDocumentClassifier"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDocumentClassifierResult describeDocumentClassifier(DescribeDocumentClassifierRequest describeDocumentClassifierRequest);

    /**
     * <p>
     * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeDominantLanguageDetectionJobRequest
     * @return Result of the DescribeDominantLanguageDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDominantLanguageDetectionJobResult describeDominantLanguageDetectionJob(
            DescribeDominantLanguageDetectionJobRequest describeDominantLanguageDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with an entities detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeEntitiesDetectionJobRequest
     * @return Result of the DescribeEntitiesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEntitiesDetectionJobResult describeEntitiesDetectionJob(DescribeEntitiesDetectionJobRequest describeEntitiesDetectionJobRequest);

    /**
     * <p>
     * Provides details about an entity recognizer including status, S3 buckets containing training data, recognizer
     * metadata, metrics, and so on.
     * </p>
     * 
     * @param describeEntityRecognizerRequest
     * @return Result of the DescribeEntityRecognizer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeEntityRecognizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeEntityRecognizer"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEntityRecognizerResult describeEntityRecognizer(DescribeEntityRecognizerRequest describeEntityRecognizerRequest);

    /**
     * <p>
     * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeKeyPhrasesDetectionJobRequest
     * @return Result of the DescribeKeyPhrasesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeKeyPhrasesDetectionJobResult describeKeyPhrasesDetectionJob(DescribeKeyPhrasesDetectionJobRequest describeKeyPhrasesDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a
     * detection job.
     * </p>
     * 
     * @param describeSentimentDetectionJobRequest
     * @return Result of the DescribeSentimentDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSentimentDetectionJobResult describeSentimentDetectionJob(DescribeSentimentDetectionJobRequest describeSentimentDetectionJobRequest);

    /**
     * <p>
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection
     * job.
     * </p>
     * 
     * @param describeTopicsDetectionJobRequest
     * @return Result of the DescribeTopicsDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DescribeTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTopicsDetectionJobResult describeTopicsDetectionJob(DescribeTopicsDetectionJobRequest describeTopicsDetectionJobRequest);

    /**
     * <p>
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect,
     * see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/how-languages.html">Amazon Comprehend Supported
     * Languages</a>.
     * </p>
     * 
     * @param detectDominantLanguageRequest
     * @return Result of the DetectDominantLanguage operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectDominantLanguage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectDominantLanguage"
     *      target="_top">AWS API Documentation</a>
     */
    DetectDominantLanguageResult detectDominantLanguage(DetectDominantLanguageRequest detectDominantLanguageRequest);

    /**
     * <p>
     * Inspects text for named entities, and returns information about them. For more information, about named entities,
     * see <a>how-entities</a>.
     * </p>
     * 
     * @param detectEntitiesRequest
     * @return Result of the DetectEntities operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
     *      Documentation</a>
     */
    DetectEntitiesResult detectEntities(DetectEntitiesRequest detectEntitiesRequest);

    /**
     * <p>
     * Detects the key noun phrases found in the text.
     * </p>
     * 
     * @param detectKeyPhrasesRequest
     * @return Result of the DetectKeyPhrases operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectKeyPhrases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS
     *      API Documentation</a>
     */
    DetectKeyPhrasesResult detectKeyPhrases(DetectKeyPhrasesRequest detectKeyPhrasesRequest);

    /**
     * <p>
     * Inspects text and returns an inference of the prevailing sentiment (<code>POSITIVE</code>, <code>NEUTRAL</code>,
     * <code>MIXED</code>, or <code>NEGATIVE</code>).
     * </p>
     * 
     * @param detectSentimentRequest
     * @return Result of the DetectSentiment operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectSentiment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSentiment" target="_top">AWS API
     *      Documentation</a>
     */
    DetectSentimentResult detectSentiment(DetectSentimentRequest detectSentimentRequest);

    /**
     * <p>
     * Inspects text for syntax and the part of speech of words in the document. For more information,
     * <a>how-syntax</a>.
     * </p>
     * 
     * @param detectSyntaxRequest
     * @return Result of the DetectSyntax operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TextSizeLimitExceededException
     *         The size of the input text exceeds the limit. Use a smaller document.
     * @throws UnsupportedLanguageException
     *         Amazon Comprehend can't process the language of the input text. For all custom entity recognition APIs
     *         (such as <code>CreateEntityRecognizer</code>), only English is accepted. For most other APIs, Amazon
     *         Comprehend accepts only English or Spanish text.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.DetectSyntax
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectSyntax" target="_top">AWS API
     *      Documentation</a>
     */
    DetectSyntaxResult detectSyntax(DetectSyntaxRequest detectSyntaxRequest);

    /**
     * <p>
     * Gets a list of the documentation classification jobs that you have submitted.
     * </p>
     * 
     * @param listDocumentClassificationJobsRequest
     * @return Result of the ListDocumentClassificationJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListDocumentClassificationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDocumentClassificationJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListDocumentClassificationJobsResult listDocumentClassificationJobs(ListDocumentClassificationJobsRequest listDocumentClassificationJobsRequest);

    /**
     * <p>
     * Gets a list of the document classifiers that you have created.
     * </p>
     * 
     * @param listDocumentClassifiersRequest
     * @return Result of the ListDocumentClassifiers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListDocumentClassifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDocumentClassifiers"
     *      target="_top">AWS API Documentation</a>
     */
    ListDocumentClassifiersResult listDocumentClassifiers(ListDocumentClassifiersRequest listDocumentClassifiersRequest);

    /**
     * <p>
     * Gets a list of the dominant language detection jobs that you have submitted.
     * </p>
     * 
     * @param listDominantLanguageDetectionJobsRequest
     * @return Result of the ListDominantLanguageDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListDominantLanguageDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListDominantLanguageDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListDominantLanguageDetectionJobsResult listDominantLanguageDetectionJobs(ListDominantLanguageDetectionJobsRequest listDominantLanguageDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of the entity detection jobs that you have submitted.
     * </p>
     * 
     * @param listEntitiesDetectionJobsRequest
     * @return Result of the ListEntitiesDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListEntitiesDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListEntitiesDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListEntitiesDetectionJobsResult listEntitiesDetectionJobs(ListEntitiesDetectionJobsRequest listEntitiesDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of the properties of all entity recognizers that you created, including recognizers currently in
     * training. Allows you to filter the list of recognizers based on criteria such as status and submission time. This
     * call returns up to 500 entity recognizers in the list, with a default number of 100 recognizers in the list.
     * </p>
     * <p>
     * The results of this list are not in any particular order. Please get the list and sort locally if needed.
     * </p>
     * 
     * @param listEntityRecognizersRequest
     * @return Result of the ListEntityRecognizers operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListEntityRecognizers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListEntityRecognizers"
     *      target="_top">AWS API Documentation</a>
     */
    ListEntityRecognizersResult listEntityRecognizers(ListEntityRecognizersRequest listEntityRecognizersRequest);

    /**
     * <p>
     * Get a list of key phrase detection jobs that you have submitted.
     * </p>
     * 
     * @param listKeyPhrasesDetectionJobsRequest
     * @return Result of the ListKeyPhrasesDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListKeyPhrasesDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListKeyPhrasesDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListKeyPhrasesDetectionJobsResult listKeyPhrasesDetectionJobs(ListKeyPhrasesDetectionJobsRequest listKeyPhrasesDetectionJobsRequest);

    /**
     * <p>
     * Gets a list of sentiment detection jobs that you have submitted.
     * </p>
     * 
     * @param listSentimentDetectionJobsRequest
     * @return Result of the ListSentimentDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListSentimentDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListSentimentDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListSentimentDetectionJobsResult listSentimentDetectionJobs(ListSentimentDetectionJobsRequest listSentimentDetectionJobsRequest);

    /**
     * <p>
     * Lists all tags associated with a given Amazon Comprehend resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets a list of the topic detection jobs that you have submitted.
     * </p>
     * 
     * @param listTopicsDetectionJobsRequest
     * @return Result of the ListTopicsDetectionJobs operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws InvalidFilterException
     *         The filter specified for the <code>ListDocumentClassificationJobs</code> operation is invalid. Specify a
     *         different filter.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.ListTopicsDetectionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ListTopicsDetectionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListTopicsDetectionJobsResult listTopicsDetectionJobs(ListTopicsDetectionJobsRequest listTopicsDetectionJobsRequest);

    /**
     * <p>
     * Starts an asynchronous document classification job. Use the operation to track the progress of the job.
     * </p>
     * 
     * @param startDocumentClassificationJobRequest
     * @return Result of the StartDocumentClassificationJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ResourceUnavailableException
     *         The specified resource is not available. Check to see if the resource is in the <code>TRAINED</code>
     *         state and try your request again.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartDocumentClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartDocumentClassificationJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartDocumentClassificationJobResult startDocumentClassificationJob(StartDocumentClassificationJobRequest startDocumentClassificationJobRequest);

    /**
     * <p>
     * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track
     * the status of a job.
     * </p>
     * 
     * @param startDominantLanguageDetectionJobRequest
     * @return Result of the StartDominantLanguageDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartDominantLanguageDetectionJobResult startDominantLanguageDetectionJob(StartDominantLanguageDetectionJobRequest startDominantLanguageDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status
     * of a job.
     * </p>
     * <p>
     * This API can be used for either standard entity detection or custom entity recognition. In order to be used for
     * custom entity recognition, the optional <code>EntityRecognizerArn</code> must be used in order to provide access
     * to the recognizer being used to detect the custom entity.
     * </p>
     * 
     * @param startEntitiesDetectionJobRequest
     * @return Result of the StartEntitiesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws ResourceUnavailableException
     *         The specified resource is not available. Check to see if the resource is in the <code>TRAINED</code>
     *         state and try your request again.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartEntitiesDetectionJobResult startEntitiesDetectionJob(StartEntitiesDetectionJobRequest startEntitiesDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the
     * status of a job.
     * </p>
     * 
     * @param startKeyPhrasesDetectionJobRequest
     * @return Result of the StartKeyPhrasesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartKeyPhrasesDetectionJobResult startKeyPhrasesDetectionJob(StartKeyPhrasesDetectionJobRequest startKeyPhrasesDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the
     * status of a job.
     * </p>
     * 
     * @param startSentimentDetectionJobRequest
     * @return Result of the StartSentimentDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartSentimentDetectionJobResult startSentimentDetectionJob(StartSentimentDetectionJobRequest startSentimentDetectionJobRequest);

    /**
     * <p>
     * Starts an asynchronous topic detection job. Use the <code>DescribeTopicDetectionJob</code> operation to track the
     * status of a job.
     * </p>
     * 
     * @param startTopicsDetectionJobRequest
     * @return Result of the StartTopicsDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws KmsKeyValidationException
     *         The KMS customer managed key (CMK) entered cannot be validated. Verify the key and re-enter it.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StartTopicsDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StartTopicsDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartTopicsDetectionJobResult startTopicsDetectionJob(StartTopicsDetectionJobRequest startTopicsDetectionJobRequest);

    /**
     * <p>
     * Stops a dominant language detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopDominantLanguageDetectionJobRequest
     * @return Result of the StopDominantLanguageDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopDominantLanguageDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopDominantLanguageDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopDominantLanguageDetectionJobResult stopDominantLanguageDetectionJob(StopDominantLanguageDetectionJobRequest stopDominantLanguageDetectionJobRequest);

    /**
     * <p>
     * Stops an entities detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopEntitiesDetectionJobRequest
     * @return Result of the StopEntitiesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopEntitiesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopEntitiesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopEntitiesDetectionJobResult stopEntitiesDetectionJob(StopEntitiesDetectionJobRequest stopEntitiesDetectionJobRequest);

    /**
     * <p>
     * Stops a key phrases detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopKeyPhrasesDetectionJobRequest
     * @return Result of the StopKeyPhrasesDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopKeyPhrasesDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopKeyPhrasesDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopKeyPhrasesDetectionJobResult stopKeyPhrasesDetectionJob(StopKeyPhrasesDetectionJobRequest stopKeyPhrasesDetectionJobRequest);

    /**
     * <p>
     * Stops a sentiment detection job in progress.
     * </p>
     * <p>
     * If the job state is <code>IN_PROGRESS</code> the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the job completes before it can be stopped, it is put into the
     * <code>COMPLETED</code> state; otherwise the job is be stopped and put into the <code>STOPPED</code> state.
     * </p>
     * <p>
     * If the job is in the <code>COMPLETED</code> or <code>FAILED</code> state when you call the
     * <code>StopDominantLanguageDetectionJob</code> operation, the operation returns a 400 Internal Request Exception.
     * </p>
     * <p>
     * When a job is stopped, any documents already processed are written to the output location.
     * </p>
     * 
     * @param stopSentimentDetectionJobRequest
     * @return Result of the StopSentimentDetectionJob operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws JobNotFoundException
     *         The specified job was not found. Check the job ID and try again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopSentimentDetectionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopSentimentDetectionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopSentimentDetectionJobResult stopSentimentDetectionJob(StopSentimentDetectionJobRequest stopSentimentDetectionJobRequest);

    /**
     * <p>
     * Stops a document classifier training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and put into the <code>STOPPED</code> state and the
     * service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingDocumentClassifierRequest
     * @return Result of the StopTrainingDocumentClassifier operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopTrainingDocumentClassifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopTrainingDocumentClassifier"
     *      target="_top">AWS API Documentation</a>
     */
    StopTrainingDocumentClassifierResult stopTrainingDocumentClassifier(StopTrainingDocumentClassifierRequest stopTrainingDocumentClassifierRequest);

    /**
     * <p>
     * Stops an entity recognizer training job while in progress.
     * </p>
     * <p>
     * If the training job state is <code>TRAINING</code>, the job is marked for termination and put into the
     * <code>STOP_REQUESTED</code> state. If the training job completes before it can be stopped, it is put into the
     * <code>TRAINED</code>; otherwise the training job is stopped and putted into the <code>STOPPED</code> state and
     * the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * 
     * @param stopTrainingEntityRecognizerRequest
     * @return Result of the StopTrainingEntityRecognizer operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws TooManyRequestsException
     *         The number of requests exceeds the limit. Resubmit your request later.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.StopTrainingEntityRecognizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/StopTrainingEntityRecognizer"
     *      target="_top">AWS API Documentation</a>
     */
    StopTrainingEntityRecognizerResult stopTrainingEntityRecognizer(StopTrainingEntityRecognizerRequest stopTrainingEntityRecognizerRequest);

    /**
     * <p>
     * Associates a specific tag with an Amazon Comprehend resource. A tag is a key-value pair that adds as a metadata
     * to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource
     * to indicate its use by the sales department.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ConcurrentModificationException
     *         Concurrent modification of the tags associated with an Amazon Comprehend resource is not supported.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws TooManyTagsException
     *         The request contains more tags than can be associated with a resource (50 tags per resource). The maximum
     *         number of tags includes both existing tags and those included in your current request.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a specific tag associated with an Amazon Comprehend resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws TooManyTagKeysException
     *         The request contains more tag keys than can be associated with a resource (50 tag keys per resource).
     * @throws InvalidRequestException
     *         The request is invalid.
     * @throws ConcurrentModificationException
     *         Concurrent modification of the tags associated with an Amazon Comprehend resource is not supported.
     * @throws ResourceNotFoundException
     *         The specified resource ARN was not found. Check the ARN and try your request again.
     * @throws InternalServerException
     *         An internal server error occurred. Retry your request.
     * @sample AmazonComprehend.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
