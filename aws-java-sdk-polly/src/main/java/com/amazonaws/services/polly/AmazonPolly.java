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
package com.amazonaws.services.polly;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.polly.model.*;

/**
 * Interface for accessing Amazon Polly.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.polly.AbstractAmazonPolly} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Polly is a web service that makes it easy to synthesize speech from text.
 * </p>
 * <p>
 * The Amazon Polly service provides API operations for synthesizing high-quality speech from plain text and Speech
 * Synthesis Markup Language (SSML), along with managing pronunciations lexicons that enable you to get the best results
 * for your application domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPolly {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "polly";

    /**
     * Overrides the default endpoint for this client ("polly.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "polly.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "polly.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "polly.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "polly.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonPolly#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Deletes the specified pronunciation lexicon stored in an AWS Region. A lexicon which has been deleted is not
     * available for speech synthesis, nor is it possible to retrieve it using either the <code>GetLexicon</code> or
     * <code>ListLexicon</code> APIs.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing
     * Lexicons</a>.
     * </p>
     * 
     * @param deleteLexiconRequest
     * @return Result of the DeleteLexicon operation returned by the service.
     * @throws LexiconNotFoundException
     *         Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its
     *         name is misspelled or specifying a lexicon that is in a different region.</p>
     *         <p>
     *         Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name
     *         is spelled correctly. Then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.DeleteLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DeleteLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLexiconResult deleteLexicon(DeleteLexiconRequest deleteLexiconRequest);

    /**
     * <p>
     * Returns the list of voices that are available for use when requesting speech synthesis. Each voice speaks a
     * specified language, is either male or female, and is identified by an ID, which is the ASCII version of the voice
     * name.
     * </p>
     * <p>
     * When synthesizing speech ( <code>SynthesizeSpeech</code> ), you provide the voice ID for the voice you want from
     * the list of voices returned by <code>DescribeVoices</code>.
     * </p>
     * <p>
     * For example, you want your news reader application to read news in a specific language, but giving a user the
     * option to choose the voice. Using the <code>DescribeVoices</code> operation you can provide the user with a list
     * of available voices to select from.
     * </p>
     * <p>
     * You can optionally specify a language code to filter the available voices. For example, if you specify
     * <code>en-US</code>, the operation returns a list of all available US English voices.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>polly:DescribeVoices</code> action.
     * </p>
     * 
     * @param describeVoicesRequest
     * @return Result of the DescribeVoices operation returned by the service.
     * @throws InvalidNextTokenException
     *         The NextToken is invalid. Verify that it's spelled correctly, and then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.DescribeVoices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DescribeVoices" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeVoicesResult describeVoices(DescribeVoicesRequest describeVoicesRequest);

    /**
     * <p>
     * Returns the content of the specified pronunciation lexicon stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param getLexiconRequest
     * @return Result of the GetLexicon operation returned by the service.
     * @throws LexiconNotFoundException
     *         Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its
     *         name is misspelled or specifying a lexicon that is in a different region.</p>
     *         <p>
     *         Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name
     *         is spelled correctly. Then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.GetLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/GetLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    GetLexiconResult getLexicon(GetLexiconRequest getLexiconRequest);

    /**
     * <p>
     * Retrieves a specific SpeechSynthesisTask object based on its TaskID. This object contains information about the
     * given speech synthesis task, including the status of the task, and a link to the S3 bucket containing the output
     * of the task.
     * </p>
     * 
     * @param getSpeechSynthesisTaskRequest
     * @return Result of the GetSpeechSynthesisTask operation returned by the service.
     * @throws InvalidTaskIdException
     *         The provided Task ID is not valid. Please provide a valid Task ID and try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @throws SynthesisTaskNotFoundException
     *         The Speech Synthesis task with requested Task ID cannot be found.
     * @sample AmazonPolly.GetSpeechSynthesisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/GetSpeechSynthesisTask" target="_top">AWS
     *      API Documentation</a>
     */
    GetSpeechSynthesisTaskResult getSpeechSynthesisTask(GetSpeechSynthesisTaskRequest getSpeechSynthesisTaskRequest);

    /**
     * <p>
     * Returns a list of pronunciation lexicons stored in an AWS Region. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing Lexicons</a>.
     * </p>
     * 
     * @param listLexiconsRequest
     * @return Result of the ListLexicons operation returned by the service.
     * @throws InvalidNextTokenException
     *         The NextToken is invalid. Verify that it's spelled correctly, and then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.ListLexicons
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListLexicons" target="_top">AWS API
     *      Documentation</a>
     */
    ListLexiconsResult listLexicons(ListLexiconsRequest listLexiconsRequest);

    /**
     * <p>
     * Returns a list of SpeechSynthesisTask objects ordered by their creation date. This operation can filter the tasks
     * by their status, for example, allowing users to list only tasks that are completed.
     * </p>
     * 
     * @param listSpeechSynthesisTasksRequest
     * @return Result of the ListSpeechSynthesisTasks operation returned by the service.
     * @throws InvalidNextTokenException
     *         The NextToken is invalid. Verify that it's spelled correctly, and then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.ListSpeechSynthesisTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/ListSpeechSynthesisTasks" target="_top">AWS
     *      API Documentation</a>
     */
    ListSpeechSynthesisTasksResult listSpeechSynthesisTasks(ListSpeechSynthesisTasksRequest listSpeechSynthesisTasksRequest);

    /**
     * <p>
     * Stores a pronunciation lexicon in an AWS Region. If a lexicon with the same name already exists in the region, it
     * is overwritten by the new lexicon. Lexicon operations have eventual consistency, therefore, it might take some
     * time before the lexicon is available to the SynthesizeSpeech operation.
     * </p>
     * <p>
     * For more information, see <a href="http://docs.aws.amazon.com/polly/latest/dg/managing-lexicons.html">Managing
     * Lexicons</a>.
     * </p>
     * 
     * @param putLexiconRequest
     * @return Result of the PutLexicon operation returned by the service.
     * @throws InvalidLexiconException
     *         Amazon Polly can't find the specified lexicon. Verify that the lexicon's name is spelled correctly, and
     *         then try again.
     * @throws UnsupportedPlsAlphabetException
     *         The alphabet specified by the lexicon is not a supported alphabet. Valid values are <code>x-sampa</code>
     *         and <code>ipa</code>.
     * @throws UnsupportedPlsLanguageException
     *         The language specified in the lexicon is unsupported. For a list of supported languages, see <a
     *         href="http://docs.aws.amazon.com/polly/latest/dg/API_LexiconAttributes.html">Lexicon Attributes</a>.
     * @throws LexiconSizeExceededException
     *         The maximum size of the specified lexicon would be exceeded by this operation.
     * @throws MaxLexemeLengthExceededException
     *         The maximum size of the lexeme would be exceeded by this operation.
     * @throws MaxLexiconsNumberExceededException
     *         The maximum number of lexicons would be exceeded by this operation.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @sample AmazonPolly.PutLexicon
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/PutLexicon" target="_top">AWS API
     *      Documentation</a>
     */
    PutLexiconResult putLexicon(PutLexiconRequest putLexiconRequest);

    /**
     * <p>
     * Allows the creation of an asynchronous synthesis task, by starting a new <code>SpeechSynthesisTask</code>. This
     * operation requires all the standard information needed for speech synthesis, plus the name of an Amazon S3 bucket
     * for the service to store the output of the synthesis task and two optional parameters (OutputS3KeyPrefix and
     * SnsTopicArn). Once the synthesis task is created, this operation will return a SpeechSynthesisTask object, which
     * will include an identifier of this task as well as the current status.
     * </p>
     * 
     * @param startSpeechSynthesisTaskRequest
     * @return Result of the StartSpeechSynthesisTask operation returned by the service.
     * @throws TextLengthExceededException
     *         The value of the "Text" parameter is longer than the accepted limits. For the
     *         <code>SynthesizeSpeech</code> API, the limit for input text is a maximum of 6000 characters total, of
     *         which no more than 3000 can be billed characters. For the <code>StartSpeechSynthesisTask</code> API, the
     *         maximum is 200,000 characters, of which no more than 100,000 can be billed characters. SSML tags are not
     *         counted as billed characters.
     * @throws InvalidS3BucketException
     *         The provided Amazon S3 bucket name is invalid. Please check your input with S3 bucket naming requirements
     *         and try again.
     * @throws InvalidS3KeyException
     *         The provided Amazon S3 key prefix is invalid. Please provide a valid S3 object key name.
     * @throws InvalidSampleRateException
     *         The specified sample rate is not valid.
     * @throws InvalidSnsTopicArnException
     *         The provided SNS topic ARN is invalid. Please provide a valid SNS topic ARN and try again.
     * @throws InvalidSsmlException
     *         The SSML you provided is invalid. Verify the SSML syntax, spelling of tags and values, and then try
     *         again.
     * @throws LexiconNotFoundException
     *         Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its
     *         name is misspelled or specifying a lexicon that is in a different region.</p>
     *         <p>
     *         Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name
     *         is spelled correctly. Then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @throws MarksNotSupportedForFormatException
     *         Speech marks are not supported for the <code>OutputFormat</code> selected. Speech marks are only
     *         available for content in <code>json</code> format.
     * @throws SsmlMarksNotSupportedForTextTypeException
     *         SSML speech marks are not supported for plain text-type input.
     * @throws LanguageNotSupportedException
     *         The language specified is not currently supported by Amazon Polly in this capacity.
     * @sample AmazonPolly.StartSpeechSynthesisTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/StartSpeechSynthesisTask" target="_top">AWS
     *      API Documentation</a>
     */
    StartSpeechSynthesisTaskResult startSpeechSynthesisTask(StartSpeechSynthesisTaskRequest startSpeechSynthesisTaskRequest);

    /**
     * <p>
     * Synthesizes UTF-8 input, plain text or SSML, to a stream of bytes. SSML input must be valid, well-formed SSML.
     * Some alphabets might not be available with all the voices (for example, Cyrillic might not be read at all by
     * English voices) unless phoneme mapping is used. For more information, see <a
     * href="http://docs.aws.amazon.com/polly/latest/dg/how-text-to-speech-works.html">How it Works</a>.
     * </p>
     * 
     * @param synthesizeSpeechRequest
     * @return Result of the SynthesizeSpeech operation returned by the service.
     * @throws TextLengthExceededException
     *         The value of the "Text" parameter is longer than the accepted limits. For the
     *         <code>SynthesizeSpeech</code> API, the limit for input text is a maximum of 6000 characters total, of
     *         which no more than 3000 can be billed characters. For the <code>StartSpeechSynthesisTask</code> API, the
     *         maximum is 200,000 characters, of which no more than 100,000 can be billed characters. SSML tags are not
     *         counted as billed characters.
     * @throws InvalidSampleRateException
     *         The specified sample rate is not valid.
     * @throws InvalidSsmlException
     *         The SSML you provided is invalid. Verify the SSML syntax, spelling of tags and values, and then try
     *         again.
     * @throws LexiconNotFoundException
     *         Amazon Polly can't find the specified lexicon. This could be caused by a lexicon that is missing, its
     *         name is misspelled or specifying a lexicon that is in a different region.</p>
     *         <p>
     *         Verify that the lexicon exists, is in the region (see <a>ListLexicons</a>) and that you spelled its name
     *         is spelled correctly. Then try again.
     * @throws ServiceFailureException
     *         An unknown condition has caused a service failure.
     * @throws MarksNotSupportedForFormatException
     *         Speech marks are not supported for the <code>OutputFormat</code> selected. Speech marks are only
     *         available for content in <code>json</code> format.
     * @throws SsmlMarksNotSupportedForTextTypeException
     *         SSML speech marks are not supported for plain text-type input.
     * @throws LanguageNotSupportedException
     *         The language specified is not currently supported by Amazon Polly in this capacity.
     * @sample AmazonPolly.SynthesizeSpeech
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/SynthesizeSpeech" target="_top">AWS API
     *      Documentation</a>
     */
    SynthesizeSpeechResult synthesizeSpeech(SynthesizeSpeechRequest synthesizeSpeechRequest);

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

    /**
     * {@link com.amazonaws.services.polly.presign.AmazonPollyPresigners} contains extension methods for presigning
     * certain requests. The presigner will use the endpoint and credentials currently configured in the client.
     *
     * @return Presigners utility object.
     */
    com.amazonaws.services.polly.presign.AmazonPollyPresigners presigners();
}
