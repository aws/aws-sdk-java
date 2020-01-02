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
     * @sample AmazonFraudDetector.CreateDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDetectorVersionResult createDetectorVersion(CreateDetectorVersionRequest createDetectorVersionRequest);

    /**
     * <p>
     * Creates a version of the model using the specified model type.
     * </p>
     * 
     * @param createModelVersionRequest
     * @return Result of the CreateModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
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
     * @sample AmazonFraudDetector.CreateVariable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateVariable" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVariableResult createVariable(CreateVariableRequest createVariableRequest);

    /**
     * <p>
     * Deletes the detector version.
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
     * @sample AmazonFraudDetector.DeleteEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DeleteEvent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEventResult deleteEvent(DeleteEventRequest deleteEventRequest);

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
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
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
     * @sample AmazonFraudDetector.GetDetectorVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectorVersion"
     *      target="_top">AWS API Documentation</a>
     */
    GetDetectorVersionResult getDetectorVersion(GetDetectorVersionRequest getDetectorVersionRequest);

    /**
     * <p>
     * Gets all of detectors. This is a paginated API. If you provide a null <code>maxSizePerPage</code>, this actions
     * retrieves a maximum of 10 records per page. If you provide a <code>maxSizePerPage</code>, the value must be
     * between 5 and 10. To get the next page results, provide the pagination token from the
     * <code>GetEventTypesResponse</code> as part of your request. A null pagination token fetches the records from the
     * beginning.
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
     * @sample AmazonFraudDetector.GetDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    GetDetectorsResult getDetectors(GetDetectorsRequest getDetectorsRequest);

    /**
     * <p>
     * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a
     * paginated API. If you provide a null <code>maxSizePerPage</code>, this actions retrieves a maximum of 10 records
     * per page. If you provide a <code>maxSizePerPage</code>, the value must be between 5 and 10. To get the next page
     * results, provide the pagination token from the <code>GetExternalModelsResult</code> as part of your request. A
     * null pagination token fetches the records from the beginning.
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
     * @sample AmazonFraudDetector.GetExternalModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetExternalModels"
     *      target="_top">AWS API Documentation</a>
     */
    GetExternalModelsResult getExternalModels(GetExternalModelsRequest getExternalModelsRequest);

    /**
     * <p>
     * Gets a model version.
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
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModelVersion" target="_top">AWS
     *      API Documentation</a>
     */
    GetModelVersionResult getModelVersion(GetModelVersionRequest getModelVersionRequest);

    /**
     * <p>
     * Gets all of the models for the AWS account, or the specified model type, or gets a single model for the specified
     * model type, model ID combination.
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
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetModels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetModels" target="_top">AWS API
     *      Documentation</a>
     */
    GetModelsResult getModels(GetModelsRequest getModelsRequest);

    /**
     * <p>
     * Gets one or more outcomes. This is a paginated API. If you provide a null <code>maxSizePerPage</code>, this
     * actions retrieves a maximum of 10 records per page. If you provide a <code>maxSizePerPage</code>, the value must
     * be between 50 and 100. To get the next page results, provide the pagination token from the
     * <code>GetOutcomesResult</code> as part of your request. A null pagination token fetches the records from the
     * beginning.
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
     * @sample AmazonFraudDetector.GetOutcomes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetOutcomes" target="_top">AWS API
     *      Documentation</a>
     */
    GetOutcomesResult getOutcomes(GetOutcomesRequest getOutcomesRequest);

    /**
     * <p>
     * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (
     * <code>ACTIVE</code>) version is used.
     * </p>
     * 
     * @param getPredictionRequest
     * @return Result of the GetPrediction operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.GetPrediction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetPrediction" target="_top">AWS
     *      API Documentation</a>
     */
    GetPredictionResult getPrediction(GetPredictionRequest getPredictionRequest);

    /**
     * <p>
     * Gets all rules available for the specified detector.
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
     * @sample AmazonFraudDetector.GetVariables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetVariables" target="_top">AWS API
     *      Documentation</a>
     */
    GetVariablesResult getVariables(GetVariablesRequest getVariablesRequest);

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
     * @sample AmazonFraudDetector.PutDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutDetector" target="_top">AWS API
     *      Documentation</a>
     */
    PutDetectorResult putDetector(PutDetectorRequest putDetectorRequest);

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
     * @sample AmazonFraudDetector.PutExternalModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutExternalModel" target="_top">AWS
     *      API Documentation</a>
     */
    PutExternalModelResult putExternalModel(PutExternalModelRequest putExternalModelRequest);

    /**
     * <p>
     * Creates or updates a model.
     * </p>
     * 
     * @param putModelRequest
     * @return Result of the PutModel operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.PutModel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutModel" target="_top">AWS API
     *      Documentation</a>
     */
    PutModelResult putModel(PutModelRequest putModelRequest);

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
     * @sample AmazonFraudDetector.PutOutcome
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutOutcome" target="_top">AWS API
     *      Documentation</a>
     */
    PutOutcomeResult putOutcome(PutOutcomeRequest putOutcomeRequest);

    /**
     * <p>
     * Updates a detector version. The detector version attributes that you can update include models, external model
     * endpoints, rules, and description. You can only update a <code>DRAFT</code> detector version.
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
     * @sample AmazonFraudDetector.UpdateDetectorVersionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateDetectorVersionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDetectorVersionStatusResult updateDetectorVersionStatus(UpdateDetectorVersionStatusRequest updateDetectorVersionStatusRequest);

    /**
     * <p>
     * Updates a model version. You can update the description and status attributes using this action. You can perform
     * the following status updates:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Change the <code>TRAINING_COMPLETE</code> status to <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Change <code>ACTIVE</code> back to <code>TRAINING_COMPLETE</code>
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateModelVersionRequest
     * @return Result of the UpdateModelVersion operation returned by the service.
     * @throws ValidationException
     *         An exception indicating a specified value is not allowed.
     * @throws ResourceNotFoundException
     *         An exception indicating the specified resource was not found.
     * @throws InternalServerException
     *         An exception indicating an internal server error.
     * @throws ThrottlingException
     *         An exception indicating a throttling error.
     * @sample AmazonFraudDetector.UpdateModelVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateModelVersionResult updateModelVersion(UpdateModelVersionRequest updateModelVersionRequest);

    /**
     * <p>
     * Updates a rule's metadata.
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
     * @sample AmazonFraudDetector.UpdateRuleMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateRuleMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRuleMetadataResult updateRuleMetadata(UpdateRuleMetadataRequest updateRuleMetadataRequest);

    /**
     * <p>
     * Updates a rule version resulting in a new rule version.
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
