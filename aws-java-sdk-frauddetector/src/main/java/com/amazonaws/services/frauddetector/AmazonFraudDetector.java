/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.frauddetector.model.*;

/**
 * Interface for accessing Amazon Fraud Detector.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.frauddetector.AbstractAmazonFraudDetector} instead.
 * </p>
 * <p>
 * <p>
 * This is the Amazon Fraud Detector API Reference. This guide is for developers who need detailed information about
 * Amazon Fraud Detector API actions, data types, and errors. For more information about Amazon Fraud Detector features,
 * see the <a href="https://docs.aws.amazon.com/frauddetector/latest/ug/">Amazon Fraud Detector User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonFraudDetector {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "frauddetector";

    /**
     * <p>
     * Creates a batch of variables.
     * </p>
     * 
     * @param batchCreateVariableRequest
     * @return Result of the BatchCreateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.BatchCreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchCreateVariable"
     *      target="_top">AWS API Documentation</a>
     */
    BatchCreateVariableResult batchCreateVariable(BatchCreateVariableRequest batchCreateVariableRequest);

    /**
     * <p>
     * Gets a batch of variables.
     * </p>
     * 
     * @param batchGetVariableRequest
     * @return Result of the BatchGetVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.BatchGetVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/BatchGetVariable" target="_top">AWS
     *      API Documentation</a>
     */
    BatchGetVariableResult batchGetVariable(BatchGetVariableRequest batchGetVariableRequest);

    /**
     * <p>
     * Creates a detector version. The detector version starts in a <code>DRAFT</code> status.
     * </p>
     * 
     * @param createDetectorVersionRequest
     * @return Result of the CreateDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDetectorVersionResult createDetectorVersion(CreateDetectorVersionRequest createDetectorVersionRequest);

    /**
     * <p>
     * Creates a model using the specified model type.
     * </p>
     * 
     * @param createModelRequest
     * @return Result of the CreateModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateModelResult createModel(CreateModelRequest createModelRequest);

    /**
     * <p>
     * Creates a version of the model using the specified model type and model id.
     * </p>
     * 
     * @param createModelVersionRequest
     * @return Result of the CreateModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @sample AmazonFraudDetector.CreateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateModelVersionResult createModelVersion(CreateModelVersionRequest createModelVersionRequest);

    /**
     * <p>
     * Creates a rule for use with the specified detector.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRuleResult createRule(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a variable.
     * </p>
     * 
     * @param createVariableRequest
     * @return Result of the CreateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.CreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVariableResult createVariable(CreateVariableRequest createVariableRequest);

    /**
     * <p>
     * Deletes the detector. Before deleting a detector, you must first delete all detector versions and rule versions
     * associated with the detector.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return Result of the DeleteDetector operation returned by the service.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetector" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDetectorResult deleteDetector(DeleteDetectorRequest deleteDetectorRequest);

    /**
     * <p>
     * Deletes the detector version. You cannot delete detector versions that are in <code>ACTIVE</code> status.
     * </p>
     * 
     * @param deleteDetectorVersionRequest
     * @return Result of the DeleteDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDetectorVersionResult deleteDetectorVersion(DeleteDetectorVersionRequest deleteDetectorVersionRequest);

    /**
     * <p>
     * Deletes the specified event.
     * </p>
     * 
     * @param deleteEventRequest
     * @return Result of the DeleteEvent operation returned by the service.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEvent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEventResult deleteEvent(DeleteEventRequest deleteEventRequest);

    /**
     * <p>
     * Deletes the rule. You cannot delete a rule if it is used by an <code>ACTIVE</code> or <code>INACTIVE</code>
     * detector version.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws ConflictException
     *         An exception indicating there was a conflict during a delete operation. The following delete operations
     *         can cause a conflict exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DeleteDetector: A conflict exception will occur if the detector has associated <code>Rules</code> or
     *         <code>DetectorVersions</code>. You can only delete a detector if it has no <code>Rules</code> or
     *         <code>DetectorVersions</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteDetectorVersion: A conflict exception will occur if the <code>DetectorVersion</code> status is
     *         <code>ACTIVE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DeleteRule: A conflict exception will occur if the <code>RuleVersion</code> is in use by an associated
     *         <code>ACTIVE</code> or <code>INACTIVE DetectorVersion</code>.
     *         </p>
     *         </li>
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Gets all versions for a specified detector.
     * </p>
     * 
     * @param describeDetectorRequest
     * @return Result of the DescribeDetector operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DescribeDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeDetector" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDetectorResult describeDetector(DescribeDetectorRequest describeDetectorRequest);

    /**
     * <p>
     * Gets all of the model versions for the specified model type or for the specified model type and model ID. You can
     * also get details for a single, specified model version.
     * </p>
     * 
     * @param describeModelVersionsRequest
     * @return Result of the DescribeModelVersions operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.DescribeModelVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeModelVersions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeModelVersionsResult describeModelVersions(DescribeModelVersionsRequest describeModelVersionsRequest);

    /**
     * <p>
     * Gets a particular detector version.
     * </p>
     * 
     * @param getDetectorVersionRequest
     * @return Result of the GetDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetDetectorVersionResult getDetectorVersion(GetDetectorVersionRequest getDetectorVersionRequest);

    /**
     * <p>
     * Gets all detectors or a single detector if a <code>detectorId</code> is specified. This is a paginated API. If
     * you provide a null <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you
     * provide a <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the
     * pagination token from the <code>GetDetectorsResponse</code> as part of your request. A null pagination token
     * fetches the records from the beginning.
     * </p>
     * 
     * @param getDetectorsRequest
     * @return Result of the GetDetectors operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    GetDetectorsResult getDetectors(GetDetectorsRequest getDetectorsRequest);

    /**
     * <p>
     * Gets all entity types or a specific entity type if a name is specified. This is a paginated API. If you provide a
     * null <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the pagination
     * token from the <code>GetEntityTypesResponse</code> as part of your request. A null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getEntityTypesRequest
     * @return Result of the GetEntityTypes operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetEntityTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEntityTypes" target="_top">AWS
     *      API Documentation</a>
     */
    GetEntityTypesResult getEntityTypes(GetEntityTypesRequest getEntityTypesRequest);

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (
     * <code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getEventPredictionRequest
     * @return Result of the GetEventPrediction operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetEventPrediction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventPrediction"
     *      target="_top">AWS API Documentation</a>
     */
    GetEventPredictionResult getEventPrediction(GetEventPredictionRequest getEventPredictionRequest);

    /**
     * <p>
     * Gets all event types or a specific event type if name is provided. This is a paginated API. If you provide a null
     * <code>maxResults</code>, this action retrieves a maximum of 10 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 5 and 10. To get the next page results, provide the pagination
     * token from the <code>GetEventTypesResponse</code> as part of your request. A null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getEventTypesRequest
     * @return Result of the GetEventTypes operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetEventTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventTypes" target="_top">AWS
     *      API Documentation</a>
     */
    GetEventTypesResult getEventTypes(GetEventTypesRequest getEventTypesRequest);

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a
     * paginated API. If you provide a null <code>maxResults</code>, this actions retrieves a maximum of 10 records per
     * page. If you provide a <code>maxResults</code>, the value must be between 5 and 10. To get the next page results,
     * provide the pagination token from the <code>GetExternalModelsResult</code> as part of your request. A null
     * pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getExternalModelsRequest
     * @return Result of the GetExternalModels operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetExternalModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetExternalModels"
     *      target="_top">AWS API Documentation</a>
     */
    GetExternalModelsResult getExternalModels(GetExternalModelsRequest getExternalModelsRequest);

    /**
     * <p>
     * Gets the encryption key if a Key Management Service (KMS) customer master key (CMK) has been specified to be used
     * to encrypt content in Amazon Fraud Detector.
     * </p>
     * 
     * @param getKMSEncryptionKeyRequest
     * @return Result of the GetKMSEncryptionKey operation returned by the service.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetKMSEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetKMSEncryptionKey"
     *      target="_top">AWS API Documentation</a>
     */
    GetKMSEncryptionKeyResult getKMSEncryptionKey(GetKMSEncryptionKeyRequest getKMSEncryptionKeyRequest);

    /**
     * <p>
     * Gets all labels or a specific label if name is provided. This is a paginated API. If you provide a null
     * <code>maxResults</code>, this action retrieves a maximum of 50 records per page. If you provide a
     * <code>maxResults</code>, the value must be between 10 and 50. To get the next page results, provide the
     * pagination token from the <code>GetGetLabelsResponse</code> as part of your request. A null pagination token
     * fetches the records from the beginning.
     * </p>
     * 
     * @param getLabelsRequest
     * @return Result of the GetLabels operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetLabels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetLabels" target="_top">AWS API
     *      Documentation</a>
     */
    GetLabelsResult getLabels(GetLabelsRequest getLabelsRequest);

    /**
     * <p>
     * Gets the details of the specified model version.
     * </p>
     * 
     * @param getModelVersionRequest
     * @return Result of the GetModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModelVersion" target="_top">AWS
     *      API Documentation</a>
     */
    GetModelVersionResult getModelVersion(GetModelVersionRequest getModelVersionRequest);

    /**
     * <p>
     * Gets one or more models. Gets all models for the AWS account if no model type and no model id provided. Gets all
     * models for the AWS account and model type, if the model type is specified but model id is not provided. Gets a
     * specific model if (model type, model id) tuple is specified.
     * </p>
     * <p>
     * This is a paginated API. If you provide a null <code>maxResults</code>, this action retrieves a maximum of 10
     * records per page. If you provide a <code>maxResults</code>, the value must be between 1 and 10. To get the next
     * page results, provide the pagination token from the response as part of your request. A null pagination token
     * fetches the records from the beginning.
     * </p>
     * 
     * @param getModelsRequest
     * @return Result of the GetModels operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModels" target="_top">AWS API
     *      Documentation</a>
     */
    GetModelsResult getModels(GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Gets one or more outcomes. This is a paginated API. If you provide a null <code>maxResults</code>, this actions
     * retrieves a maximum of 100 records per page. If you provide a <code>maxResults</code>, the value must be between
     * 50 and 100. To get the next page results, provide the pagination token from the <code>GetOutcomesResult</code> as
     * part of your request. A null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getOutcomesRequest
     * @return Result of the GetOutcomes operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetOutcomes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetOutcomes" target="_top">AWS API
     *      Documentation</a>
     */
    GetOutcomesResult getOutcomes(GetOutcomesRequest getOutcomesRequest);

    /**
     * <p>
     * Get all rules for a detector (paginated) if <code>ruleId</code> and <code>ruleVersion</code> are not specified.
     * Gets all rules for the detector and the <code>ruleId</code> if present (paginated). Gets a specific rule if both
     * the <code>ruleId</code> and the <code>ruleVersion</code> are specified.
     * </p>
     * <p>
     * This is a paginated API. Providing null maxResults results in retrieving maximum of 100 records per page. If you
     * provide maxResults the value must be between 50 and 100. To get the next page result, a provide a pagination
     * token from GetRulesResult as part of your request. Null pagination token fetches the records from the beginning.
     * </p>
     * 
     * @param getRulesRequest
     * @return Result of the GetRules operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetRules" target="_top">AWS API
     *      Documentation</a>
     */
    GetRulesResult getRules(GetRulesRequest getRulesRequest);

    /**
     * <p>
     * Gets all of the variables or the specific variable. This is a paginated API. Providing null
     * <code>maxSizePerPage</code> results in retrieving maximum of 100 records per page. If you provide
     * <code>maxSizePerPage</code> the value must be between 50 and 100. To get the next page result, a provide a
     * pagination token from <code>GetVariablesResult</code> as part of your request. Null pagination token fetches the
     * records from the beginning.
     * </p>
     * 
     * @param getVariablesRequest
     * @return Result of the GetVariables operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.GetVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetVariables" target="_top">AWS API
     *      Documentation</a>
     */
    GetVariablesResult getVariables(GetVariablesRequest getVariablesRequest);

    /**
     * <p>
     * Lists all tags associated with the resource. This is a paginated API. To get the next page results, provide the
     * pagination token from the response as part of your request. A null pagination token fetches the records from the
     * beginning.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates or updates a detector.
     * </p>
     * 
     * @param putDetectorRequest
     * @return Result of the PutDetector operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutDetector" target="_top">AWS API
     *      Documentation</a>
     */
    PutDetectorResult putDetector(PutDetectorRequest putDetectorRequest);

    /**
     * <p>
     * Creates or updates an entity type. An entity represents who is performing the event. As part of a fraud
     * prediction, you pass the entity ID to indicate the specific entity who performed the event. An entity type
     * classifies the entity. Example classifications include customer, merchant, or account.
     * </p>
     * 
     * @param putEntityTypeRequest
     * @return Result of the PutEntityType operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutEntityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEntityType" target="_top">AWS
     *      API Documentation</a>
     */
    PutEntityTypeResult putEntityType(PutEntityTypeRequest putEntityTypeRequest);

    /**
     * <p>
     * Creates or updates an event type. An event is a business activity that is evaluated for fraud risk. With Amazon
     * Fraud Detector, you generate fraud predictions for events. An event type defines the structure for an event sent
     * to Amazon Fraud Detector. This includes the variables sent as part of the event, the entity performing the event
     * (such as a customer), and the labels that classify the event. Example event types include online payment
     * transactions, account registrations, and authentications.
     * </p>
     * 
     * @param putEventTypeRequest
     * @return Result of the PutEventType operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutEventType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEventType" target="_top">AWS API
     *      Documentation</a>
     */
    PutEventTypeResult putEventType(PutEventTypeRequest putEventTypeRequest);

    /**
     * <p>
     * Creates or updates an Amazon SageMaker model endpoint. You can also use this action to update the configuration
     * of the model endpoint, including the IAM role and/or the mapped variables.
     * </p>
     * 
     * @param putExternalModelRequest
     * @return Result of the PutExternalModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutExternalModel" target="_top">AWS
     *      API Documentation</a>
     */
    PutExternalModelResult putExternalModel(PutExternalModelRequest putExternalModelRequest);

    /**
     * <p>
     * Specifies the Key Management Service (KMS) customer master key (CMK) to be used to encrypt content in Amazon
     * Fraud Detector.
     * </p>
     * 
     * @param putKMSEncryptionKeyRequest
     * @return Result of the PutKMSEncryptionKey operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutKMSEncryptionKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutKMSEncryptionKey"
     *      target="_top">AWS API Documentation</a>
     */
    PutKMSEncryptionKeyResult putKMSEncryptionKey(PutKMSEncryptionKeyRequest putKMSEncryptionKeyRequest);

    /**
     * <p>
     * Creates or updates label. A label classifies an event as fraudulent or legitimate. Labels are associated with
     * event types and used to train supervised machine learning models in Amazon Fraud Detector.
     * </p>
     * 
     * @param putLabelRequest
     * @return Result of the PutLabel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutLabel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutLabel" target="_top">AWS API
     *      Documentation</a>
     */
    PutLabelResult putLabel(PutLabelRequest putLabelRequest);

    /**
     * <p>
     * Creates or updates an outcome.
     * </p>
     * 
     * @param putOutcomeRequest
     * @return Result of the PutOutcome operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.PutOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutOutcome" target="_top">AWS API
     *      Documentation</a>
     */
    PutOutcomeResult putOutcome(PutOutcomeRequest putOutcomeRequest);

    /**
     * <p>
     * Assigns tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a detector version. The detector version attributes that you can update include models, external model
     * endpoints, rules, rule execution mode, and description. You can only update a <code>DRAFT</code> detector
     * version.
     * </p>
     * 
     * @param updateDetectorVersionRequest
     * @return Result of the UpdateDetectorVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDetectorVersionResult updateDetectorVersion(UpdateDetectorVersionRequest updateDetectorVersionRequest);

    /**
     * <p>
     * Updates the detector version's description. You can update the metadata for any detector version (
     * <code>DRAFT, ACTIVE,</code> or <code>INACTIVE</code>).
     * </p>
     * 
     * @param updateDetectorVersionMetadataRequest
     * @return Result of the UpdateDetectorVersionMetadata operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateDetectorVersionMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDetectorVersionMetadataResult updateDetectorVersionMetadata(UpdateDetectorVersionMetadataRequest updateDetectorVersionMetadataRequest);

    /**
     * <p>
     * Updates the detector version’s status. You can perform the following promotions or demotions using
     * <code>UpdateDetectorVersionStatus</code>: <code>DRAFT</code> to <code>ACTIVE</code>, <code>ACTIVE</code> to
     * <code>INACTIVE</code>, and <code>INACTIVE</code> to <code>ACTIVE</code>.
     * </p>
     * 
     * @param updateDetectorVersionStatusRequest
     * @return Result of the UpdateDetectorVersionStatus operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateDetectorVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDetectorVersionStatusResult updateDetectorVersionStatus(UpdateDetectorVersionStatusRequest updateDetectorVersionStatusRequest);

    /**
     * <p>
     * Updates a model. You can update the description attribute using this action.
     * </p>
     * 
     * @param updateModelRequest
     * @return Result of the UpdateModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateModelResult updateModel(UpdateModelRequest updateModelRequest);

    /**
     * <p>
     * Updates a model version. Updating a model version retrains an existing model version using updated training data
     * and produces a new minor version of the model. You can update the training data set location and data access role
     * attributes using this action. This action creates and trains a new minor version of the model, for example
     * version 1.01, 1.02, 1.03.
     * </p>
     * 
     * @param updateModelVersionRequest
     * @return Result of the UpdateModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @sample AmazonFraudDetector.UpdateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateModelVersionResult updateModelVersion(UpdateModelVersionRequest updateModelVersionRequest);

    /**
     * <p>
     * Updates the status of a model version.
     * </p>
     * <p>
     * You can perform the following status updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code>to <code>INACTIVE</code>.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionStatusRequest
     * @return Result of the UpdateModelVersionStatus operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateModelVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateModelVersionStatusResult updateModelVersionStatus(UpdateModelVersionStatusRequest updateModelVersionStatusRequest);

    /**
     * <p>
     * Updates a rule's metadata. The description attribute can be updated.
     * </p>
     * 
     * @param updateRuleMetadataRequest
     * @return Result of the UpdateRuleMetadata operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateRuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRuleMetadataResult updateRuleMetadata(UpdateRuleMetadataRequest updateRuleMetadataRequest);

    /**
     * <p>
     * Updates a rule version resulting in a new rule version. Updates a rule version resulting in a new rule version
     * (version 1, 2, 3 ...).
     * </p>
     * 
     * @param updateRuleVersionRequest
     * @return Result of the UpdateRuleVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateRuleVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRuleVersionResult updateRuleVersion(UpdateRuleVersionRequest updateRuleVersionRequest);

    /**
     * <p>
     * Updates a variable.
     * </p>
     * 
     * @param updateVariableRequest
     * @return Result of the UpdateVariable operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @throws AccessDeniedException
     *         An exception indicating Amazon Fraud Detector does not have the needed permissions. This can occur if you
     *         submit a request, such as <code>PutExternalModel</code>, that specifies a role that is not in your
     *         account.
     * @sample AmazonFraudDetector.UpdateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVariableResult updateVariable(UpdateVariableRequest updateVariableRequest);

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
