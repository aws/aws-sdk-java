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
package com.amazonaws.services.simplesystemsmanagement;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.services.simplesystemsmanagement.model.transform.*;

/**
 * Client for accessing Amazon SSM. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <fullname>AWS Systems Manager</fullname>
 * <p>
 * AWS Systems Manager is a collection of capabilities that helps you automate management tasks such as collecting
 * system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images (AMIs),
 * and configuring operating systems (OSs) and applications at scale. Systems Manager lets you remotely and securely
 * manage the configuration of your managed instances. A <i>managed instance</i> is any Amazon EC2 instance or
 * on-premises machine in your hybrid environment that has been configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/">AWS Systems Manager User Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For more information, see <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html">Systems Manager
 * Prerequisites</a> in the <i>AWS Systems Manager User Guide</i>.
 * </p>
 * <p>
 * For information about other API actions you can perform on Amazon EC2 instances, see the <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon EC2 API Reference</a>. For information about how
 * to use a Query API, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html">Making API Requests</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSimpleSystemsManagementClient extends AmazonWebServiceClient implements AWSSimpleSystemsManagement {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSSimpleSystemsManagement.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ssm";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TargetNotConnected").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.TargetNotConnectedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ItemSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ItemSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidParameters").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidParametersException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterMaxVersionLimitExceeded").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ParameterMaxVersionLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PoliciesLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.PoliciesLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidKeyId").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidKeyIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFilter").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociationExecutionDoesNotExist").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AssociationExecutionDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSchedule").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidScheduleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedInventorySchemaVersionException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.UnsupportedInventorySchemaVersionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceDataSyncAlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ResourceDataSyncAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPluginName").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidPluginNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("HierarchyTypeMismatchException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.HierarchyTypeMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FeatureNotAvailableException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.FeatureNotAvailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextToken").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidNextTokenException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceDataSyncInvalidConfigurationException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ResourceDataSyncInvalidConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidActivationId").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidActivationIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvocationDoesNotExist").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvocationDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SubTypeCountLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.SubTypeCountLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceId").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterVersionNotFound").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ParameterVersionNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceSettingNotFound").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ServiceSettingNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDocument").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDocumentVersion").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentVersionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOptionException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidOptionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDocumentOperation").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceDataSyncCountExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ResourceDataSyncCountExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ComplianceTypeCountLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ComplianceTypeCountLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResourceType").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidResourceTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AutomationDefinitionNotFoundException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AutomationDefinitionNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInstanceId").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ItemContentMismatchException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ItemContentMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceDataSyncNotFoundException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ResourceDataSyncNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateInstanceId").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.DuplicateInstanceIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDocumentContent").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentContentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AutomationExecutionNotFoundException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociationLimitExceeded").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AssociationLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInventoryGroupException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidInventoryGroupException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociationVersionLimitExceeded").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AssociationVersionLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTarget").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidTargetException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AutomationStepNotFoundException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AutomationStepNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFilterValue").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DocumentVersionLimitExceeded").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.DocumentVersionLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidItemContentException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidItemContentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyTagsError").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.TooManyTagsErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedParameterType").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.UnsupportedParameterTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAggregatorException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidAggregatorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedInventoryItemContextException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.UnsupportedInventoryItemContextException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPolicyAttributeException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidPolicyAttributeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatiblePolicyException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.IncompatiblePolicyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidUpdate").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidUpdateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociationAlreadyExists").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AssociationAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateDocumentContent").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.DuplicateDocumentContentException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDocumentSchemaVersion").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidDocumentSchemaVersionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInventoryItemContextException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidInventoryItemContextException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAssociation").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidAssociationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAutomationSignalException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidAutomationSignalException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IdempotentParameterMismatch").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.IdempotentParameterMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInventoryRequestException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidInventoryRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidResultAttributeException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidResultAttributeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AutomationDefinitionVersionNotFoundException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AutomationDefinitionVersionNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAutomationExecutionParametersException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidAutomationExecutionParametersException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ResourceLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAllowedPatternException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidAllowedPatternException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeleteInventoryParametersException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidDeleteInventoryParametersException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPermissionType").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidPermissionTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperatingSystem").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.UnsupportedOperatingSystemException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOutputFolder").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidOutputFolderException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AutomationExecutionLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AutomationExecutionLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DuplicateDocumentVersionName").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.DuplicateDocumentVersionNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNotificationConfig").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidNotificationConfigException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCommandId").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidCommandIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterNotFound").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ParameterNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterVersionLabelLimitExceeded").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ParameterVersionLabelLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DocumentPermissionLimit").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.DocumentPermissionLimitException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DocumentLimitExceeded").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.DocumentLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("HierarchyLevelLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.HierarchyLevelLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TotalSizeLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.TotalSizeLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidActivation").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidActivationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TooManyUpdates").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.TooManyUpdatesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DocumentAlreadyExists").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.DocumentAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInstanceInformationFilterValue").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidInstanceInformationFilterValueException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAssociationVersion").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidAssociationVersionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StatusUnchanged").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.StatusUnchangedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("TargetInUseException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.TargetInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociationDoesNotExist").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AssociationDoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedPlatformType").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.UnsupportedPlatformTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MaxDocumentSizeExceeded").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.MaxDocumentSizeExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRole").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidRoleException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeletionIdException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidDeletionIdException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AssociatedInstances").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.AssociatedInstancesException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidOutputLocation").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidOutputLocationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPolicyTypeException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidPolicyTypeException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterLimitExceeded").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ParameterLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidTypeNameException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidTypeNameException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidAutomationStatusUpdateException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidAutomationStatusUpdateException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DoesNotExistException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.DoesNotExistException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFilterOption").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterOptionException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("CustomSchemaCountLimitExceededException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.CustomSchemaCountLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterPatternMismatchException").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ParameterPatternMismatchException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ParameterAlreadyExists").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.ParameterAlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidFilterKey").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InvalidFilterKeyException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.simplesystemsmanagement.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.simplesystemsmanagement.model.AWSSimpleSystemsManagementException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon SSM. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSSimpleSystemsManagementClientBuilder#defaultClient()}
     */
    @Deprecated
    public AWSSimpleSystemsManagementClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM. A credentials provider chain will be used that
     * searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SSM (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AWSSimpleSystemsManagementClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AWSSimpleSystemsManagementClientBuilder#withCredentials(AWSCredentialsProvider)} for
     *             example:
     *             {@code AWSSimpleSystemsManagementClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AWSSimpleSystemsManagementClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the specified AWS account credentials and
     * client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SSM (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSSimpleSystemsManagementClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSimpleSystemsManagementClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AWSSimpleSystemsManagementClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SSM (ex: proxy settings,
     *        retry counts, etc.).
     * @deprecated use {@link AWSSimpleSystemsManagementClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSimpleSystemsManagementClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon SSM (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AWSSimpleSystemsManagementClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AWSSimpleSystemsManagementClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AWSSimpleSystemsManagementClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AWSSimpleSystemsManagementClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        this.advancedConfig = AdvancedConfig.EMPTY;
        init();
    }

    public static AWSSimpleSystemsManagementClientBuilder builder() {
        return AWSSimpleSystemsManagementClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSimpleSystemsManagementClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon SSM using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSSimpleSystemsManagementClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://ssm.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/simplesystemsmanagement/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/simplesystemsmanagement/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified resource. Tags are metadata that you can assign to your
     * documents, managed instances, Maintenance Windows, Parameter Store parameters, and patch baselines. Tags enable
     * you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag
     * consists of a key and an optional value, both of which you define. For example, you could define a set of tags
     * for your account's managed instances that helps you track each instance's owner and stack level. For example:
     * Key=Owner and Value=DbAdmin, SysAdmin, or Dev. Or Key=Stack and Value=Production, Pre-Production, or Test.
     * </p>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent
     * set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based
     * on the tags you add. Tags don't have any semantic meaning to Amazon EC2 and are interpreted strictly as a string
     * of characters.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging Your Amazon EC2 Resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyTagsErrorException
     *         The Targets parameter includes too many tags. Remove one or more tags and try the command again.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAddTagsToResource(request);
    }

    @SdkInternalApi
    final AddTagsToResourceResult executeAddTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AddTagsToResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddTagsToResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AddTagsToResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to cancel the command specified by the Command ID. There is no guarantee that the command will be
     * terminated and the underlying process stopped.
     * </p>
     * 
     * @param cancelCommandRequest
     * @return Result of the CancelCommand operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @sample AWSSimpleSystemsManagement.CancelCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelCommand" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CancelCommandResult cancelCommand(CancelCommandRequest request) {
        request = beforeClientExecution(request);
        return executeCancelCommand(request);
    }

    @SdkInternalApi
    final CancelCommandResult executeCancelCommand(CancelCommandRequest cancelCommandRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelCommandRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelCommandRequest> request = null;
        Response<CancelCommandResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelCommandRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(cancelCommandRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelCommand");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelCommandResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CancelCommandResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a Maintenance Window execution that is already in progress and cancels any tasks in the window that have
     * not already starting running. (Tasks already in progress will continue to completion.)
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return Result of the CancelMaintenanceWindowExecution operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @sample AWSSimpleSystemsManagement.CancelMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CancelMaintenanceWindowExecutionResult cancelMaintenanceWindowExecution(CancelMaintenanceWindowExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeCancelMaintenanceWindowExecution(request);
    }

    @SdkInternalApi
    final CancelMaintenanceWindowExecutionResult executeCancelMaintenanceWindowExecution(
            CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelMaintenanceWindowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelMaintenanceWindowExecutionRequest> request = null;
        Response<CancelMaintenanceWindowExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelMaintenanceWindowExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelMaintenanceWindowExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelMaintenanceWindowExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelMaintenanceWindowExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelMaintenanceWindowExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers your on-premises server or virtual machine with Amazon EC2 so that you can manage these resources using
     * Run Command. An on-premises server or virtual machine that has been registered with EC2 is called a managed
     * instance. For more information about activations, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html">Setting
     * Up Systems Manager in Hybrid Environments</a>.
     * </p>
     * 
     * @param createActivationRequest
     * @return Result of the CreateActivation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreateActivation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateActivation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateActivationResult createActivation(CreateActivationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateActivation(request);
    }

    @SdkInternalApi
    final CreateActivationResult executeCreateActivation(CreateActivationRequest createActivationRequest) {

        ExecutionContext executionContext = createExecutionContext(createActivationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateActivationRequest> request = null;
        Response<CreateActivationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateActivationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createActivationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateActivation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateActivationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateActivationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
     * instance processes the document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an associated document, the system returns the
     * AssociationAlreadyExists exception.
     * </p>
     * 
     * @param createAssociationRequest
     * @return Result of the CreateAssociation operation returned by the service.
     * @throws AssociationAlreadyExistsException
     *         The specified association already exists.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws InvalidOutputLocationException
     *         The output location is not valid or does not exist.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Systems Manager document. You can only supply
     *         values to parameters defined in the Systems Manager document.
     * @throws InvalidTargetException
     *         The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you
     *         might not have permission to perform the operation.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @sample AWSSimpleSystemsManagement.CreateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAssociationResult createAssociation(CreateAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssociation(request);
    }

    @SdkInternalApi
    final CreateAssociationResult executeCreateAssociation(CreateAssociationRequest createAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationRequest> request = null;
        Response<CreateAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified Systems Manager document with the specified instances or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance IDs or tags, SSM Agent running on the
     * instance processes the document and configures the instance as specified.
     * </p>
     * <p>
     * If you associate a document with an instance that already has an associated document, the system returns the
     * AssociationAlreadyExists exception.
     * </p>
     * 
     * @param createAssociationBatchRequest
     * @return Result of the CreateAssociationBatch operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Systems Manager document. You can only supply
     *         values to parameters defined in the Systems Manager document.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws InvalidOutputLocationException
     *         The output location is not valid or does not exist.
     * @throws InvalidTargetException
     *         The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you
     *         might not have permission to perform the operation.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @sample AWSSimpleSystemsManagement.CreateAssociationBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociationBatch" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateAssociationBatchResult createAssociationBatch(CreateAssociationBatchRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAssociationBatch(request);
    }

    @SdkInternalApi
    final CreateAssociationBatchResult executeCreateAssociationBatch(CreateAssociationBatchRequest createAssociationBatchRequest) {

        ExecutionContext executionContext = createExecutionContext(createAssociationBatchRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssociationBatchRequest> request = null;
        Response<CreateAssociationBatchResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssociationBatchRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssociationBatchRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAssociationBatch");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssociationBatchResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAssociationBatchResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Systems Manager document.
     * </p>
     * <p>
     * After you create a document, you can use CreateAssociation to associate it with one or more running instances.
     * </p>
     * 
     * @param createDocumentRequest
     * @return Result of the CreateDocument operation returned by the service.
     * @throws DocumentAlreadyExistsException
     *         The specified document already exists.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a document is 64 KB.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentContentException
     *         The content for the document is not valid.
     * @throws DocumentLimitExceededException
     *         You can have at most 200 active Systems Manager documents.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema is not supported.
     * @sample AWSSimpleSystemsManagement.CreateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDocumentResult createDocument(CreateDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDocument(request);
    }

    @SdkInternalApi
    final CreateDocumentResult executeCreateDocument(CreateDocumentRequest createDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(createDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDocumentRequest> request = null;
        Response<CreateDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Maintenance Window.
     * </p>
     * 
     * @param createMaintenanceWindowRequest
     * @return Result of the CreateMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateMaintenanceWindowResult createMaintenanceWindow(CreateMaintenanceWindowRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMaintenanceWindow(request);
    }

    @SdkInternalApi
    final CreateMaintenanceWindowResult executeCreateMaintenanceWindow(CreateMaintenanceWindowRequest createMaintenanceWindowRequest) {

        ExecutionContext executionContext = createExecutionContext(createMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMaintenanceWindowRequest> request = null;
        Response<CreateMaintenanceWindowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMaintenanceWindowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createMaintenanceWindowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMaintenanceWindow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMaintenanceWindowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateMaintenanceWindowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html">PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @return Result of the CreatePatchBaseline operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePatchBaselineResult createPatchBaseline(CreatePatchBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePatchBaseline(request);
    }

    @SdkInternalApi
    final CreatePatchBaselineResult executeCreatePatchBaseline(CreatePatchBaselineRequest createPatchBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(createPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePatchBaselineRequest> request = null;
        Response<CreatePatchBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePatchBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPatchBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePatchBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePatchBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePatchBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a resource data sync configuration to a single bucket in Amazon S3. This is an asynchronous operation
     * that returns immediately. After a successful initial sync is completed, the system continuously syncs data to the
     * Amazon S3 bucket. To check the status of the sync, use the <a>ListResourceDataSync</a>.
     * </p>
     * <p>
     * By default, data is not encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to
     * ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a
     * restrictive bucket policy. For more information, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html">Configuring
     * Resource Data Sync for Inventory</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * 
     * @param createResourceDataSyncRequest
     * @return Result of the CreateResourceDataSync operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ResourceDataSyncCountExceededException
     *         You have exceeded the allowed maximum sync configurations.
     * @throws ResourceDataSyncAlreadyExistsException
     *         A sync configuration with the same name already exists.
     * @throws ResourceDataSyncInvalidConfigurationException
     *         The specified sync configuration is invalid.
     * @sample AWSSimpleSystemsManagement.CreateResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateResourceDataSyncResult createResourceDataSync(CreateResourceDataSyncRequest request) {
        request = beforeClientExecution(request);
        return executeCreateResourceDataSync(request);
    }

    @SdkInternalApi
    final CreateResourceDataSyncResult executeCreateResourceDataSync(CreateResourceDataSyncRequest createResourceDataSyncRequest) {

        ExecutionContext executionContext = createExecutionContext(createResourceDataSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceDataSyncRequest> request = null;
        Response<CreateResourceDataSyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceDataSyncRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceDataSyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateResourceDataSync");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceDataSyncResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateResourceDataSyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an activation. You are not required to delete an activation. If you delete an activation, you can no
     * longer use it to register additional managed instances. Deleting an activation does not de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return Result of the DeleteActivation operation returned by the service.
     * @throws InvalidActivationIdException
     *         The activation ID is not valid. Verify the you entered the correct ActivationId or ActivationCode and try
     *         again.
     * @throws InvalidActivationException
     *         The activation is not valid. The activation might have been deleted, or the ActivationId and the
     *         ActivationCode do not match.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.DeleteActivation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteActivation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteActivationResult deleteActivation(DeleteActivationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteActivation(request);
    }

    @SdkInternalApi
    final DeleteActivationResult executeDeleteActivation(DeleteActivationRequest deleteActivationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteActivationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteActivationRequest> request = null;
        Response<DeleteActivationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteActivationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteActivationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteActivation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteActivationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteActivationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates the specified Systems Manager document from the specified instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it does not change the configuration of the instance. To
     * change the configuration state of an instance after you disassociate a document, you must create a new document
     * with the desired configuration and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return Result of the DeleteAssociation operation returned by the service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.DeleteAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteAssociationResult deleteAssociation(DeleteAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAssociation(request);
    }

    @SdkInternalApi
    final DeleteAssociationResult executeDeleteAssociation(DeleteAssociationRequest deleteAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssociationRequest> request = null;
        Response<DeleteAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssociationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the Systems Manager document and all instance associations to the document.
     * </p>
     * <p>
     * Before you delete the document, we recommend that you use <a>DeleteAssociation</a> to disassociate all instances
     * that are associated with the document.
     * </p>
     * 
     * @param deleteDocumentRequest
     * @return Result of the DeleteDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentOperationException
     *         You attempted to delete a document while it is still shared. You must stop sharing the document before
     *         you can delete it.
     * @throws AssociatedInstancesException
     *         You must disassociate a document from all instances before you can delete it.
     * @sample AWSSimpleSystemsManagement.DeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDocumentResult deleteDocument(DeleteDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDocument(request);
    }

    @SdkInternalApi
    final DeleteDocumentResult executeDeleteDocument(DeleteDocumentRequest deleteDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDocumentRequest> request = null;
        Response<DeleteDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a custom inventory type, or the data associated with a custom Inventory type. Deleting a custom inventory
     * type is also referred to as deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return Result of the DeleteInventory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidOptionException
     *         The delete inventory option specified is not valid. Verify the option and try again.
     * @throws InvalidDeleteInventoryParametersException
     *         One or more of the parameters specified for the delete operation is not valid. Verify all parameters and
     *         try again.
     * @throws InvalidInventoryRequestException
     *         The request is not valid.
     * @sample AWSSimpleSystemsManagement.DeleteInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteInventory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInventoryResult deleteInventory(DeleteInventoryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInventory(request);
    }

    @SdkInternalApi
    final DeleteInventoryResult executeDeleteInventory(DeleteInventoryRequest deleteInventoryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInventoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInventoryRequest> request = null;
        Response<DeleteInventoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInventoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInventoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteInventory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInventoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInventoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Maintenance Window.
     * </p>
     * 
     * @param deleteMaintenanceWindowRequest
     * @return Result of the DeleteMaintenanceWindow operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeleteMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteMaintenanceWindowResult deleteMaintenanceWindow(DeleteMaintenanceWindowRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMaintenanceWindow(request);
    }

    @SdkInternalApi
    final DeleteMaintenanceWindowResult executeDeleteMaintenanceWindow(DeleteMaintenanceWindowRequest deleteMaintenanceWindowRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMaintenanceWindowRequest> request = null;
        Response<DeleteMaintenanceWindowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMaintenanceWindowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteMaintenanceWindowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMaintenanceWindow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMaintenanceWindowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteMaintenanceWindowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a parameter from the system.
     * </p>
     * 
     * @param deleteParameterRequest
     * @return Result of the DeleteParameter operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ParameterNotFoundException
     *         The parameter could not be found. Verify the name and try again.
     * @sample AWSSimpleSystemsManagement.DeleteParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteParameterResult deleteParameter(DeleteParameterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteParameter(request);
    }

    @SdkInternalApi
    final DeleteParameterResult executeDeleteParameter(DeleteParameterRequest deleteParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteParameterRequest> request = null;
        Response<DeleteParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteParameterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteParameter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteParameterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Delete a list of parameters. This API is used to delete parameters by using the Amazon EC2 console.
     * </p>
     * 
     * @param deleteParametersRequest
     * @return Result of the DeleteParameters operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeleteParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteParametersResult deleteParameters(DeleteParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteParameters(request);
    }

    @SdkInternalApi
    final DeleteParametersResult executeDeleteParameters(DeleteParametersRequest deleteParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteParametersRequest> request = null;
        Response<DeleteParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteParametersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a patch baseline.
     * </p>
     * 
     * @param deletePatchBaselineRequest
     * @return Result of the DeletePatchBaseline operation returned by the service.
     * @throws ResourceInUseException
     *         Error returned if an attempt is made to delete a patch baseline that is registered for a patch group.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeletePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeletePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePatchBaselineResult deletePatchBaseline(DeletePatchBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePatchBaseline(request);
    }

    @SdkInternalApi
    final DeletePatchBaselineResult executeDeletePatchBaseline(DeletePatchBaselineRequest deletePatchBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePatchBaselineRequest> request = null;
        Response<DeletePatchBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePatchBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePatchBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePatchBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePatchBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePatchBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a Resource Data Sync configuration. After the configuration is deleted, changes to inventory data on
     * managed instances are no longer synced with the target Amazon S3 bucket. Deleting a sync configuration does not
     * delete data in the target Amazon S3 bucket.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return Result of the DeleteResourceDataSync operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ResourceDataSyncNotFoundException
     *         The specified sync name was not found.
     * @sample AWSSimpleSystemsManagement.DeleteResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteResourceDataSyncResult deleteResourceDataSync(DeleteResourceDataSyncRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourceDataSync(request);
    }

    @SdkInternalApi
    final DeleteResourceDataSyncResult executeDeleteResourceDataSync(DeleteResourceDataSyncRequest deleteResourceDataSyncRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceDataSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceDataSyncRequest> request = null;
        Response<DeleteResourceDataSyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceDataSyncRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceDataSyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourceDataSync");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceDataSyncResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteResourceDataSyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the server or virtual machine from the list of registered servers. You can reregister the instance again
     * at any time. If you don't plan to use Run Command on the server, we suggest uninstalling SSM Agent first.
     * </p>
     * 
     * @param deregisterManagedInstanceRequest
     * @return Result of the DeregisterManagedInstance operation returned by the service.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeregisterManagedInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterManagedInstance" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeregisterManagedInstanceResult deregisterManagedInstance(DeregisterManagedInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterManagedInstance(request);
    }

    @SdkInternalApi
    final DeregisterManagedInstanceResult executeDeregisterManagedInstance(DeregisterManagedInstanceRequest deregisterManagedInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterManagedInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterManagedInstanceRequest> request = null;
        Response<DeregisterManagedInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterManagedInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterManagedInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterManagedInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterManagedInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterManagedInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a patch group from a patch baseline.
     * </p>
     * 
     * @param deregisterPatchBaselineForPatchGroupRequest
     * @return Result of the DeregisterPatchBaselineForPatchGroup operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeregisterPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterPatchBaselineForPatchGroupResult deregisterPatchBaselineForPatchGroup(DeregisterPatchBaselineForPatchGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterPatchBaselineForPatchGroup(request);
    }

    @SdkInternalApi
    final DeregisterPatchBaselineForPatchGroupResult executeDeregisterPatchBaselineForPatchGroup(
            DeregisterPatchBaselineForPatchGroupRequest deregisterPatchBaselineForPatchGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterPatchBaselineForPatchGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterPatchBaselineForPatchGroupRequest> request = null;
        Response<DeregisterPatchBaselineForPatchGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterPatchBaselineForPatchGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterPatchBaselineForPatchGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterPatchBaselineForPatchGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterPatchBaselineForPatchGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterPatchBaselineForPatchGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a target from a Maintenance Window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return Result of the DeregisterTargetFromMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TargetInUseException
     *         You specified the <code>Safe</code> option for the DeregisterTargetFromMaintenanceWindow operation, but
     *         the target is still referenced in a task.
     * @sample AWSSimpleSystemsManagement.DeregisterTargetFromMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTargetFromMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterTargetFromMaintenanceWindowResult deregisterTargetFromMaintenanceWindow(DeregisterTargetFromMaintenanceWindowRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterTargetFromMaintenanceWindow(request);
    }

    @SdkInternalApi
    final DeregisterTargetFromMaintenanceWindowResult executeDeregisterTargetFromMaintenanceWindow(
            DeregisterTargetFromMaintenanceWindowRequest deregisterTargetFromMaintenanceWindowRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterTargetFromMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTargetFromMaintenanceWindowRequest> request = null;
        Response<DeregisterTargetFromMaintenanceWindowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTargetFromMaintenanceWindowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterTargetFromMaintenanceWindowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterTargetFromMaintenanceWindow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterTargetFromMaintenanceWindowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterTargetFromMaintenanceWindowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a task from a Maintenance Window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return Result of the DeregisterTaskFromMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeregisterTaskFromMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeregisterTaskFromMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeregisterTaskFromMaintenanceWindowResult deregisterTaskFromMaintenanceWindow(DeregisterTaskFromMaintenanceWindowRequest request) {
        request = beforeClientExecution(request);
        return executeDeregisterTaskFromMaintenanceWindow(request);
    }

    @SdkInternalApi
    final DeregisterTaskFromMaintenanceWindowResult executeDeregisterTaskFromMaintenanceWindow(
            DeregisterTaskFromMaintenanceWindowRequest deregisterTaskFromMaintenanceWindowRequest) {

        ExecutionContext executionContext = createExecutionContext(deregisterTaskFromMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterTaskFromMaintenanceWindowRequest> request = null;
        Response<DeregisterTaskFromMaintenanceWindowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterTaskFromMaintenanceWindowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deregisterTaskFromMaintenanceWindowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeregisterTaskFromMaintenanceWindow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeregisterTaskFromMaintenanceWindowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeregisterTaskFromMaintenanceWindowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Details about the activation, including: the date and time the activation was created, the expiration date, the
     * IAM role assigned to the instances in the activation, and the number of instances activated by this registration.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return Result of the DescribeActivations operation returned by the service.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeActivations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeActivations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeActivationsResult describeActivations(DescribeActivationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeActivations(request);
    }

    @SdkInternalApi
    final DescribeActivationsResult executeDescribeActivations(DescribeActivationsRequest describeActivationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeActivationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeActivationsRequest> request = null;
        Response<DescribeActivationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeActivationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeActivationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeActivations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeActivationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeActivationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the association for the specified target or instance. If you created the association by using the
     * <code>Targets</code> parameter, then you must retrieve the association by using the association ID. If you
     * created the association by specifying an instance ID and a Systems Manager document, then you retrieve the
     * association by specifying the document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return Result of the DescribeAssociation operation returned by the service.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InvalidAssociationVersionException
     *         The version you specified is not valid. Use ListAssociationVersions to view all versions of an
     *         association according to the association ID. Or, use the <code>$LATEST</code> parameter to view the
     *         latest version of the association.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @sample AWSSimpleSystemsManagement.DescribeAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeAssociationResult describeAssociation(DescribeAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAssociation(request);
    }

    @SdkInternalApi
    final DescribeAssociationResult executeDescribeAssociation(DescribeAssociationRequest describeAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationRequest> request = null;
        Response<DescribeAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this API action to view information about a specific execution of a specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return Result of the DescribeAssociationExecutionTargets operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws AssociationExecutionDoesNotExistException
     *         The specified execution ID does not exist. Verify the ID number and try again.
     * @sample AWSSimpleSystemsManagement.DescribeAssociationExecutionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAssociationExecutionTargetsResult describeAssociationExecutionTargets(DescribeAssociationExecutionTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAssociationExecutionTargets(request);
    }

    @SdkInternalApi
    final DescribeAssociationExecutionTargetsResult executeDescribeAssociationExecutionTargets(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssociationExecutionTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationExecutionTargetsRequest> request = null;
        Response<DescribeAssociationExecutionTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationExecutionTargetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAssociationExecutionTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAssociationExecutionTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssociationExecutionTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAssociationExecutionTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this API action to view all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return Result of the DescribeAssociationExecutions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeAssociationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAssociationExecutionsResult describeAssociationExecutions(DescribeAssociationExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAssociationExecutions(request);
    }

    @SdkInternalApi
    final DescribeAssociationExecutionsResult executeDescribeAssociationExecutions(DescribeAssociationExecutionsRequest describeAssociationExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAssociationExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssociationExecutionsRequest> request = null;
        Response<DescribeAssociationExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssociationExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAssociationExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAssociationExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssociationExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAssociationExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides details about all active and terminated Automation executions.
     * </p>
     * 
     * @param describeAutomationExecutionsRequest
     * @return Result of the DescribeAutomationExecutions operation returned by the service.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidFilterValueException
     *         The filter value is not valid. Verify the value and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeAutomationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAutomationExecutionsResult describeAutomationExecutions(DescribeAutomationExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAutomationExecutions(request);
    }

    @SdkInternalApi
    final DescribeAutomationExecutionsResult executeDescribeAutomationExecutions(DescribeAutomationExecutionsRequest describeAutomationExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAutomationExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutomationExecutionsRequest> request = null;
        Response<DescribeAutomationExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutomationExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAutomationExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAutomationExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAutomationExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAutomationExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Information about all active and terminated step executions in an Automation workflow.
     * </p>
     * 
     * @param describeAutomationStepExecutionsRequest
     * @return Result of the DescribeAutomationStepExecutions operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidFilterValueException
     *         The filter value is not valid. Verify the value and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeAutomationStepExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationStepExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeAutomationStepExecutionsResult describeAutomationStepExecutions(DescribeAutomationStepExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAutomationStepExecutions(request);
    }

    @SdkInternalApi
    final DescribeAutomationStepExecutionsResult executeDescribeAutomationStepExecutions(
            DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAutomationStepExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutomationStepExecutionsRequest> request = null;
        Response<DescribeAutomationStepExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutomationStepExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAutomationStepExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAutomationStepExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAutomationStepExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAutomationStepExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all patches that could possibly be included in a patch baseline.
     * </p>
     * 
     * @param describeAvailablePatchesRequest
     * @return Result of the DescribeAvailablePatches operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeAvailablePatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAvailablePatches" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAvailablePatchesResult describeAvailablePatches(DescribeAvailablePatchesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAvailablePatches(request);
    }

    @SdkInternalApi
    final DescribeAvailablePatchesResult executeDescribeAvailablePatches(DescribeAvailablePatchesRequest describeAvailablePatchesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAvailablePatchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAvailablePatchesRequest> request = null;
        Response<DescribeAvailablePatchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAvailablePatchesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAvailablePatchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAvailablePatches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAvailablePatchesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAvailablePatchesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the specified Systems Manager document.
     * </p>
     * 
     * @param describeDocumentRequest
     * @return Result of the DescribeDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @sample AWSSimpleSystemsManagement.DescribeDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeDocumentResult describeDocument(DescribeDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDocument(request);
    }

    @SdkInternalApi
    final DescribeDocumentResult executeDescribeDocument(DescribeDocumentRequest describeDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentRequest> request = null;
        Response<DescribeDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the permissions for a Systems Manager document. If you created the document, you are the owner. If a
     * document is shared, it can either be shared privately (by specifying a user's AWS account ID) or publicly
     * (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return Result of the DescribeDocumentPermission operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidPermissionTypeException
     *         The permission type is not supported. <i>Share</i> is the only supported permission type.
     * @sample AWSSimpleSystemsManagement.DescribeDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDocumentPermissionResult describeDocumentPermission(DescribeDocumentPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDocumentPermission(request);
    }

    @SdkInternalApi
    final DescribeDocumentPermissionResult executeDescribeDocumentPermission(DescribeDocumentPermissionRequest describeDocumentPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDocumentPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDocumentPermissionRequest> request = null;
        Response<DescribeDocumentPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDocumentPermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDocumentPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDocumentPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDocumentPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDocumentPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * All associations for the instance(s).
     * </p>
     * 
     * @param describeEffectiveInstanceAssociationsRequest
     * @return Result of the DescribeEffectiveInstanceAssociations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeEffectiveInstanceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectiveInstanceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEffectiveInstanceAssociationsResult describeEffectiveInstanceAssociations(DescribeEffectiveInstanceAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEffectiveInstanceAssociations(request);
    }

    @SdkInternalApi
    final DescribeEffectiveInstanceAssociationsResult executeDescribeEffectiveInstanceAssociations(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEffectiveInstanceAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEffectiveInstanceAssociationsRequest> request = null;
        Response<DescribeEffectiveInstanceAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEffectiveInstanceAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEffectiveInstanceAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEffectiveInstanceAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEffectiveInstanceAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeEffectiveInstanceAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline. Note
     * that this API applies only to Windows patch baselines.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return Result of the DescribeEffectivePatchesForPatchBaseline operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws UnsupportedOperatingSystemException
     *         The operating systems you specified is not supported, or the operation is not supported for the operating
     *         system. Valid operating systems include: Windows, AmazonLinux, RedhatEnterpriseLinux, and Ubuntu.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeEffectivePatchesForPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectivePatchesForPatchBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEffectivePatchesForPatchBaselineResult describeEffectivePatchesForPatchBaseline(DescribeEffectivePatchesForPatchBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEffectivePatchesForPatchBaseline(request);
    }

    @SdkInternalApi
    final DescribeEffectivePatchesForPatchBaselineResult executeDescribeEffectivePatchesForPatchBaseline(
            DescribeEffectivePatchesForPatchBaselineRequest describeEffectivePatchesForPatchBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEffectivePatchesForPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEffectivePatchesForPatchBaselineRequest> request = null;
        Response<DescribeEffectivePatchesForPatchBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEffectivePatchesForPatchBaselineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeEffectivePatchesForPatchBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEffectivePatchesForPatchBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEffectivePatchesForPatchBaselineResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeEffectivePatchesForPatchBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The status of the associations for the instance(s).
     * </p>
     * 
     * @param describeInstanceAssociationsStatusRequest
     * @return Result of the DescribeInstanceAssociationsStatus operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstanceAssociationsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceAssociationsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstanceAssociationsStatusResult describeInstanceAssociationsStatus(DescribeInstanceAssociationsStatusRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceAssociationsStatus(request);
    }

    @SdkInternalApi
    final DescribeInstanceAssociationsStatusResult executeDescribeInstanceAssociationsStatus(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceAssociationsStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceAssociationsStatusRequest> request = null;
        Response<DescribeInstanceAssociationsStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceAssociationsStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceAssociationsStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceAssociationsStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceAssociationsStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstanceAssociationsStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your instances. You can use this to get information about instances like the operating
     * system platform, the SSM Agent version (Linux), status etc. If you specify one or more instance IDs, it returns
     * information for those instances. If you do not specify instance IDs, it returns information for all your
     * instances. If you specify an instance ID that is not valid or an instance that you do not own, you receive an
     * error.
     * </p>
     * <note>
     * <p>
     * The IamRole field for this API action is the Amazon Identity and Access Management (IAM) role assigned to
     * on-premises instances. This call does not return the IAM role for Amazon EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return Result of the DescribeInstanceInformation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidInstanceInformationFilterValueException
     *         The specified filter value is not valid.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstanceInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceInformation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstanceInformationResult describeInstanceInformation(DescribeInstanceInformationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstanceInformation(request);
    }

    @SdkInternalApi
    final DescribeInstanceInformationResult executeDescribeInstanceInformation(DescribeInstanceInformationRequest describeInstanceInformationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstanceInformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstanceInformationRequest> request = null;
        Response<DescribeInstanceInformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstanceInformationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstanceInformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstanceInformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstanceInformationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstanceInformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the high-level patch state of one or more instances.
     * </p>
     * 
     * @param describeInstancePatchStatesRequest
     * @return Result of the DescribeInstancePatchStates operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstancePatchStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstancePatchStatesResult describeInstancePatchStates(DescribeInstancePatchStatesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstancePatchStates(request);
    }

    @SdkInternalApi
    final DescribeInstancePatchStatesResult executeDescribeInstancePatchStates(DescribeInstancePatchStatesRequest describeInstancePatchStatesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstancePatchStatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancePatchStatesRequest> request = null;
        Response<DescribeInstancePatchStatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancePatchStatesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstancePatchStatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstancePatchStates");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstancePatchStatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstancePatchStatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the high-level patch state for the instances in the specified patch group.
     * </p>
     * 
     * @param describeInstancePatchStatesForPatchGroupRequest
     * @return Result of the DescribeInstancePatchStatesForPatchGroup operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstancePatchStatesForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatchStatesForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeInstancePatchStatesForPatchGroupResult describeInstancePatchStatesForPatchGroup(DescribeInstancePatchStatesForPatchGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstancePatchStatesForPatchGroup(request);
    }

    @SdkInternalApi
    final DescribeInstancePatchStatesForPatchGroupResult executeDescribeInstancePatchStatesForPatchGroup(
            DescribeInstancePatchStatesForPatchGroupRequest describeInstancePatchStatesForPatchGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstancePatchStatesForPatchGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancePatchStatesForPatchGroupRequest> request = null;
        Response<DescribeInstancePatchStatesForPatchGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancePatchStatesForPatchGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstancePatchStatesForPatchGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstancePatchStatesForPatchGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstancePatchStatesForPatchGroupResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeInstancePatchStatesForPatchGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the patches on the specified instance and their state relative to the patch baseline
     * being used for the instance.
     * </p>
     * 
     * @param describeInstancePatchesRequest
     * @return Result of the DescribeInstancePatches operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstancePatches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstancePatches" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeInstancePatchesResult describeInstancePatches(DescribeInstancePatchesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInstancePatches(request);
    }

    @SdkInternalApi
    final DescribeInstancePatchesResult executeDescribeInstancePatches(DescribeInstancePatchesRequest describeInstancePatchesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInstancePatchesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInstancePatchesRequest> request = null;
        Response<DescribeInstancePatchesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInstancePatchesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInstancePatchesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInstancePatches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInstancePatchesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInstancePatchesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a specific delete inventory operation.
     * </p>
     * 
     * @param describeInventoryDeletionsRequest
     * @return Result of the DescribeInventoryDeletions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDeletionIdException
     *         The ID specified for the delete operation does not exist or is not valide. Verify the ID and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeInventoryDeletions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInventoryDeletions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeInventoryDeletionsResult describeInventoryDeletions(DescribeInventoryDeletionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeInventoryDeletions(request);
    }

    @SdkInternalApi
    final DescribeInventoryDeletionsResult executeDescribeInventoryDeletions(DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeInventoryDeletionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeInventoryDeletionsRequest> request = null;
        Response<DescribeInventoryDeletionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeInventoryDeletionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeInventoryDeletionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeInventoryDeletions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeInventoryDeletionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeInventoryDeletionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a particular task run as part of a Maintenance
     * Window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return Result of the DescribeMaintenanceWindowExecutionTaskInvocations operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowExecutionTaskInvocations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTaskInvocations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMaintenanceWindowExecutionTaskInvocationsResult describeMaintenanceWindowExecutionTaskInvocations(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceWindowExecutionTaskInvocations(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceWindowExecutionTaskInvocationsResult executeDescribeMaintenanceWindowExecutionTaskInvocations(
            DescribeMaintenanceWindowExecutionTaskInvocationsRequest describeMaintenanceWindowExecutionTaskInvocationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowExecutionTaskInvocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowExecutionTaskInvocationsRequest> request = null;
        Response<DescribeMaintenanceWindowExecutionTaskInvocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowExecutionTaskInvocationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceWindowExecutionTaskInvocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceWindowExecutionTaskInvocations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceWindowExecutionTaskInvocationsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeMaintenanceWindowExecutionTaskInvocationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a given Maintenance Window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return Result of the DescribeMaintenanceWindowExecutionTasks operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowExecutionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutionTasks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMaintenanceWindowExecutionTasksResult describeMaintenanceWindowExecutionTasks(DescribeMaintenanceWindowExecutionTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceWindowExecutionTasks(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceWindowExecutionTasksResult executeDescribeMaintenanceWindowExecutionTasks(
            DescribeMaintenanceWindowExecutionTasksRequest describeMaintenanceWindowExecutionTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowExecutionTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowExecutionTasksRequest> request = null;
        Response<DescribeMaintenanceWindowExecutionTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowExecutionTasksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceWindowExecutionTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceWindowExecutionTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceWindowExecutionTasksResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeMaintenanceWindowExecutionTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the executions of a Maintenance Window. This includes information about when the Maintenance Window was
     * scheduled to be active, and information about tasks registered and run with the Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionsRequest
     * @return Result of the DescribeMaintenanceWindowExecutions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMaintenanceWindowExecutionsResult describeMaintenanceWindowExecutions(DescribeMaintenanceWindowExecutionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceWindowExecutions(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceWindowExecutionsResult executeDescribeMaintenanceWindowExecutions(
            DescribeMaintenanceWindowExecutionsRequest describeMaintenanceWindowExecutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowExecutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowExecutionsRequest> request = null;
        Response<DescribeMaintenanceWindowExecutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowExecutionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceWindowExecutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceWindowExecutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceWindowExecutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMaintenanceWindowExecutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about upcoming executions of a Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return Result of the DescribeMaintenanceWindowSchedule operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMaintenanceWindowScheduleResult describeMaintenanceWindowSchedule(DescribeMaintenanceWindowScheduleRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceWindowSchedule(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceWindowScheduleResult executeDescribeMaintenanceWindowSchedule(
            DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowScheduleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowScheduleRequest> request = null;
        Response<DescribeMaintenanceWindowScheduleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowScheduleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceWindowScheduleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceWindowSchedule");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceWindowScheduleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMaintenanceWindowScheduleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the targets registered with the Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return Result of the DescribeMaintenanceWindowTargets operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTargets"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMaintenanceWindowTargetsResult describeMaintenanceWindowTargets(DescribeMaintenanceWindowTargetsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceWindowTargets(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceWindowTargetsResult executeDescribeMaintenanceWindowTargets(
            DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowTargetsRequest> request = null;
        Response<DescribeMaintenanceWindowTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowTargetsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceWindowTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceWindowTargets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceWindowTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMaintenanceWindowTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tasks in a Maintenance Window.
     * </p>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return Result of the DescribeMaintenanceWindowTasks operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTasks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMaintenanceWindowTasksResult describeMaintenanceWindowTasks(DescribeMaintenanceWindowTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceWindowTasks(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceWindowTasksResult executeDescribeMaintenanceWindowTasks(DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowTasksRequest> request = null;
        Response<DescribeMaintenanceWindowTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowTasksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceWindowTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceWindowTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceWindowTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMaintenanceWindowTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Maintenance Windows in an AWS account.
     * </p>
     * 
     * @param describeMaintenanceWindowsRequest
     * @return Result of the DescribeMaintenanceWindows operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindows" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeMaintenanceWindowsResult describeMaintenanceWindows(DescribeMaintenanceWindowsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceWindows(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceWindowsResult executeDescribeMaintenanceWindows(DescribeMaintenanceWindowsRequest describeMaintenanceWindowsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowsRequest> request = null;
        Response<DescribeMaintenanceWindowsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceWindowsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceWindows");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceWindowsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMaintenanceWindowsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about the Maintenance Windows targets or tasks that an instance is associated with.
     * </p>
     * 
     * @param describeMaintenanceWindowsForTargetRequest
     * @return Result of the DescribeMaintenanceWindowsForTarget operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowsForTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowsForTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMaintenanceWindowsForTargetResult describeMaintenanceWindowsForTarget(DescribeMaintenanceWindowsForTargetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMaintenanceWindowsForTarget(request);
    }

    @SdkInternalApi
    final DescribeMaintenanceWindowsForTargetResult executeDescribeMaintenanceWindowsForTarget(
            DescribeMaintenanceWindowsForTargetRequest describeMaintenanceWindowsForTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMaintenanceWindowsForTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMaintenanceWindowsForTargetRequest> request = null;
        Response<DescribeMaintenanceWindowsForTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMaintenanceWindowsForTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeMaintenanceWindowsForTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMaintenanceWindowsForTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMaintenanceWindowsForTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeMaintenanceWindowsForTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about a parameter.
     * </p>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * 
     * @param describeParametersRequest
     * @return Result of the DescribeParameters operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidFilterOptionException
     *         The specified filter option is not valid. Valid options are Equals and BeginsWith. For Path filter, valid
     *         options are Recursive and OneLevel.
     * @throws InvalidFilterValueException
     *         The filter value is not valid. Verify the value and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeParametersResult describeParameters(DescribeParametersRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeParameters(request);
    }

    @SdkInternalApi
    final DescribeParametersResult executeDescribeParameters(DescribeParametersRequest describeParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(describeParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeParametersRequest> request = null;
        Response<DescribeParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeParametersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the patch baselines in your AWS account.
     * </p>
     * 
     * @param describePatchBaselinesRequest
     * @return Result of the DescribePatchBaselines operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribePatchBaselines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchBaselines" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribePatchBaselinesResult describePatchBaselines(DescribePatchBaselinesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePatchBaselines(request);
    }

    @SdkInternalApi
    final DescribePatchBaselinesResult executeDescribePatchBaselines(DescribePatchBaselinesRequest describePatchBaselinesRequest) {

        ExecutionContext executionContext = createExecutionContext(describePatchBaselinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePatchBaselinesRequest> request = null;
        Response<DescribePatchBaselinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePatchBaselinesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePatchBaselinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePatchBaselines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePatchBaselinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePatchBaselinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns high-level aggregated patch compliance state for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return Result of the DescribePatchGroupState operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribePatchGroupState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroupState" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribePatchGroupStateResult describePatchGroupState(DescribePatchGroupStateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePatchGroupState(request);
    }

    @SdkInternalApi
    final DescribePatchGroupStateResult executeDescribePatchGroupState(DescribePatchGroupStateRequest describePatchGroupStateRequest) {

        ExecutionContext executionContext = createExecutionContext(describePatchGroupStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePatchGroupStateRequest> request = null;
        Response<DescribePatchGroupStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePatchGroupStateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePatchGroupStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePatchGroupState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePatchGroupStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePatchGroupStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all patch groups that have been registered with patch baselines.
     * </p>
     * 
     * @param describePatchGroupsRequest
     * @return Result of the DescribePatchGroups operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribePatchGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchGroups" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribePatchGroupsResult describePatchGroups(DescribePatchGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePatchGroups(request);
    }

    @SdkInternalApi
    final DescribePatchGroupsResult executeDescribePatchGroups(DescribePatchGroupsRequest describePatchGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describePatchGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePatchGroupsRequest> request = null;
        Response<DescribePatchGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePatchGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePatchGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePatchGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePatchGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePatchGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all active sessions (both connected and disconnected) or terminated sessions from the past 30
     * days.
     * </p>
     * 
     * @param describeSessionsRequest
     * @return Result of the DescribeSessions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSessionsResult describeSessions(DescribeSessionsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSessions(request);
    }

    @SdkInternalApi
    final DescribeSessionsResult executeDescribeSessions(DescribeSessionsRequest describeSessionsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSessionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSessionsRequest> request = null;
        Response<DescribeSessionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSessionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSessionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSessions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSessionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSessionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get detailed information about a particular Automation execution.
     * </p>
     * 
     * @param getAutomationExecutionRequest
     * @return Result of the GetAutomationExecution operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetAutomationExecution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetAutomationExecutionResult getAutomationExecution(GetAutomationExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeGetAutomationExecution(request);
    }

    @SdkInternalApi
    final GetAutomationExecutionResult executeGetAutomationExecution(GetAutomationExecutionRequest getAutomationExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(getAutomationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAutomationExecutionRequest> request = null;
        Response<GetAutomationExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAutomationExecutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAutomationExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAutomationExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAutomationExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetAutomationExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or plugin.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return Result of the GetCommandInvocation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidPluginNameException
     *         The plugin name is not valid.
     * @throws InvocationDoesNotExistException
     *         The command ID and instance ID you specified did not match any invocations. Verify the command ID adn the
     *         instance ID and try again.
     * @sample AWSSimpleSystemsManagement.GetCommandInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCommandInvocation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetCommandInvocationResult getCommandInvocation(GetCommandInvocationRequest request) {
        request = beforeClientExecution(request);
        return executeGetCommandInvocation(request);
    }

    @SdkInternalApi
    final GetCommandInvocationResult executeGetCommandInvocation(GetCommandInvocationRequest getCommandInvocationRequest) {

        ExecutionContext executionContext = createExecutionContext(getCommandInvocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetCommandInvocationRequest> request = null;
        Response<GetCommandInvocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetCommandInvocationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getCommandInvocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetCommandInvocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetCommandInvocationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetCommandInvocationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to determine whether it is connected and ready to
     * receive Session Manager connections.
     * </p>
     * 
     * @param getConnectionStatusRequest
     * @return Result of the GetConnectionStatus operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetConnectionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetConnectionStatusResult getConnectionStatus(GetConnectionStatusRequest request) {
        request = beforeClientExecution(request);
        return executeGetConnectionStatus(request);
    }

    @SdkInternalApi
    final GetConnectionStatusResult executeGetConnectionStatus(GetConnectionStatusRequest getConnectionStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(getConnectionStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConnectionStatusRequest> request = null;
        Response<GetConnectionStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConnectionStatusRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConnectionStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConnectionStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetConnectionStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetConnectionStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the default patch baseline. Note that Systems Manager supports creating multiple default patch
     * baselines. For example, you can create a default patch baseline for each operating system.
     * </p>
     * <p>
     * If you do not specify an operating system value, the default patch baseline for Windows is returned.
     * </p>
     * 
     * @param getDefaultPatchBaselineRequest
     * @return Result of the GetDefaultPatchBaseline operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetDefaultPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDefaultPatchBaseline" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetDefaultPatchBaselineResult getDefaultPatchBaseline(GetDefaultPatchBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeGetDefaultPatchBaseline(request);
    }

    @SdkInternalApi
    final GetDefaultPatchBaselineResult executeGetDefaultPatchBaseline(GetDefaultPatchBaselineRequest getDefaultPatchBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(getDefaultPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDefaultPatchBaselineRequest> request = null;
        Response<GetDefaultPatchBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDefaultPatchBaselineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDefaultPatchBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDefaultPatchBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDefaultPatchBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDefaultPatchBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the current snapshot for the patch baseline the instance uses. This API is primarily used by the
     * AWS-RunPatchBaseline Systems Manager document.
     * </p>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return Result of the GetDeployablePatchSnapshotForInstance operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws UnsupportedOperatingSystemException
     *         The operating systems you specified is not supported, or the operation is not supported for the operating
     *         system. Valid operating systems include: Windows, AmazonLinux, RedhatEnterpriseLinux, and Ubuntu.
     * @sample AWSSimpleSystemsManagement.GetDeployablePatchSnapshotForInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDeployablePatchSnapshotForInstance"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetDeployablePatchSnapshotForInstanceResult getDeployablePatchSnapshotForInstance(GetDeployablePatchSnapshotForInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDeployablePatchSnapshotForInstance(request);
    }

    @SdkInternalApi
    final GetDeployablePatchSnapshotForInstanceResult executeGetDeployablePatchSnapshotForInstance(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeployablePatchSnapshotForInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeployablePatchSnapshotForInstanceRequest> request = null;
        Response<GetDeployablePatchSnapshotForInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeployablePatchSnapshotForInstanceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getDeployablePatchSnapshotForInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDeployablePatchSnapshotForInstance");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDeployablePatchSnapshotForInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetDeployablePatchSnapshotForInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the contents of the specified Systems Manager document.
     * </p>
     * 
     * @param getDocumentRequest
     * @return Result of the GetDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @sample AWSSimpleSystemsManagement.GetDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDocumentResult getDocument(GetDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeGetDocument(request);
    }

    @SdkInternalApi
    final GetDocumentResult executeGetDocument(GetDocumentRequest getDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(getDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDocumentRequest> request = null;
        Response<GetDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Query inventory information.
     * </p>
     * 
     * @param getInventoryRequest
     * @return Result of the GetInventory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidInventoryGroupException
     *         The specified inventory group is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidAggregatorException
     *         The specified aggregator is not valid for inventory groups. Verify that the aggregator uses a valid
     *         inventory type such as <code>AWS:Application</code> or <code>AWS:InstanceInformation</code>.
     * @throws InvalidResultAttributeException
     *         The specified inventory item result attribute is not valid.
     * @sample AWSSimpleSystemsManagement.GetInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInventoryResult getInventory(GetInventoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetInventory(request);
    }

    @SdkInternalApi
    final GetInventoryResult executeGetInventory(GetInventoryRequest getInventoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getInventoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInventoryRequest> request = null;
        Response<GetInventoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInventoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInventoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInventory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInventoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInventoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Return a list of inventory type names for the account, or return a list of attribute names for a specific
     * Inventory item type.
     * </p>
     * 
     * @param getInventorySchemaRequest
     * @return Result of the GetInventorySchema operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.GetInventorySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventorySchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInventorySchemaResult getInventorySchema(GetInventorySchemaRequest request) {
        request = beforeClientExecution(request);
        return executeGetInventorySchema(request);
    }

    @SdkInternalApi
    final GetInventorySchemaResult executeGetInventorySchema(GetInventorySchemaRequest getInventorySchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(getInventorySchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInventorySchemaRequest> request = null;
        Response<GetInventorySchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInventorySchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInventorySchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetInventorySchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInventorySchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInventorySchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a Maintenance Window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return Result of the GetMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindow" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetMaintenanceWindowResult getMaintenanceWindow(GetMaintenanceWindowRequest request) {
        request = beforeClientExecution(request);
        return executeGetMaintenanceWindow(request);
    }

    @SdkInternalApi
    final GetMaintenanceWindowResult executeGetMaintenanceWindow(GetMaintenanceWindowRequest getMaintenanceWindowRequest) {

        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowRequest> request = null;
        Response<GetMaintenanceWindowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getMaintenanceWindowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMaintenanceWindow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMaintenanceWindowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetMaintenanceWindowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves details about a specific task run as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return Result of the GetMaintenanceWindowExecution operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMaintenanceWindowExecutionResult getMaintenanceWindowExecution(GetMaintenanceWindowExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeGetMaintenanceWindowExecution(request);
    }

    @SdkInternalApi
    final GetMaintenanceWindowExecutionResult executeGetMaintenanceWindowExecution(GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowExecutionRequest> request = null;
        Response<GetMaintenanceWindowExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMaintenanceWindowExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMaintenanceWindowExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMaintenanceWindowExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMaintenanceWindowExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a Maintenance Window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return Result of the GetMaintenanceWindowExecutionTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecutionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMaintenanceWindowExecutionTaskResult getMaintenanceWindowExecutionTask(GetMaintenanceWindowExecutionTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetMaintenanceWindowExecutionTask(request);
    }

    @SdkInternalApi
    final GetMaintenanceWindowExecutionTaskResult executeGetMaintenanceWindowExecutionTask(
            GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowExecutionTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowExecutionTaskRequest> request = null;
        Response<GetMaintenanceWindowExecutionTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowExecutionTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMaintenanceWindowExecutionTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMaintenanceWindowExecutionTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMaintenanceWindowExecutionTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a task invocation. A task invocation is a specific task running on a specific target. Maintenance
     * Windows report status for all invocations.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return Result of the GetMaintenanceWindowExecutionTaskInvocation operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecutionTaskInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTaskInvocation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetMaintenanceWindowExecutionTaskInvocationResult getMaintenanceWindowExecutionTaskInvocation(
            GetMaintenanceWindowExecutionTaskInvocationRequest request) {
        request = beforeClientExecution(request);
        return executeGetMaintenanceWindowExecutionTaskInvocation(request);
    }

    @SdkInternalApi
    final GetMaintenanceWindowExecutionTaskInvocationResult executeGetMaintenanceWindowExecutionTaskInvocation(
            GetMaintenanceWindowExecutionTaskInvocationRequest getMaintenanceWindowExecutionTaskInvocationRequest) {

        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowExecutionTaskInvocationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowExecutionTaskInvocationRequest> request = null;
        Response<GetMaintenanceWindowExecutionTaskInvocationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowExecutionTaskInvocationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMaintenanceWindowExecutionTaskInvocationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMaintenanceWindowExecutionTaskInvocation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMaintenanceWindowExecutionTaskInvocationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetMaintenanceWindowExecutionTaskInvocationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tasks in a Maintenance Window.
     * </p>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return Result of the GetMaintenanceWindowTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetMaintenanceWindowTaskResult getMaintenanceWindowTask(GetMaintenanceWindowTaskRequest request) {
        request = beforeClientExecution(request);
        return executeGetMaintenanceWindowTask(request);
    }

    @SdkInternalApi
    final GetMaintenanceWindowTaskResult executeGetMaintenanceWindowTask(GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(getMaintenanceWindowTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMaintenanceWindowTaskRequest> request = null;
        Response<GetMaintenanceWindowTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMaintenanceWindowTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getMaintenanceWindowTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetMaintenanceWindowTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetMaintenanceWindowTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetMaintenanceWindowTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't confuse this API action with the
     * <a>GetParameters</a> API action.
     * </p>
     * 
     * @param getParameterRequest
     * @return Result of the GetParameter operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @throws ParameterNotFoundException
     *         The parameter could not be found. Verify the name and try again.
     * @throws ParameterVersionNotFoundException
     *         The specified parameter version was not found. Verify the parameter name and version, and try again.
     * @sample AWSSimpleSystemsManagement.GetParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetParameterResult getParameter(GetParameterRequest request) {
        request = beforeClientExecution(request);
        return executeGetParameter(request);
    }

    @SdkInternalApi
    final GetParameterResult executeGetParameter(GetParameterRequest getParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(getParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParameterRequest> request = null;
        Response<GetParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParameterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetParameter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetParameterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Query a list of all parameters used by the AWS account.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return Result of the GetParameterHistory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ParameterNotFoundException
     *         The parameter could not be found. Verify the name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @sample AWSSimpleSystemsManagement.GetParameterHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameterHistory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetParameterHistoryResult getParameterHistory(GetParameterHistoryRequest request) {
        request = beforeClientExecution(request);
        return executeGetParameterHistory(request);
    }

    @SdkInternalApi
    final GetParameterHistoryResult executeGetParameterHistory(GetParameterHistoryRequest getParameterHistoryRequest) {

        ExecutionContext executionContext = createExecutionContext(getParameterHistoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParameterHistoryRequest> request = null;
        Response<GetParameterHistoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParameterHistoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getParameterHistoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetParameterHistory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetParameterHistoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetParameterHistoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API action with the <a>GetParameter</a> API action.
     * </p>
     * 
     * @param getParametersRequest
     * @return Result of the GetParameters operation returned by the service.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameters" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetParametersResult getParameters(GetParametersRequest request) {
        request = beforeClientExecution(request);
        return executeGetParameters(request);
    }

    @SdkInternalApi
    final GetParametersResult executeGetParameters(GetParametersRequest getParametersRequest) {

        ExecutionContext executionContext = createExecutionContext(getParametersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParametersRequest> request = null;
        Response<GetParametersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParametersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getParametersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetParameters");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetParametersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetParametersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieve parameters in a specific hierarchy. For more information, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-working.html">Working with
     * Systems Manager Parameters</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * <note>
     * <p>
     * This API action doesn't support filtering by tags.
     * </p>
     * </note>
     * 
     * @param getParametersByPathRequest
     * @return Result of the GetParametersByPath operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidFilterOptionException
     *         The specified filter option is not valid. Valid options are Equals and BeginsWith. For Path filter, valid
     *         options are Recursive and OneLevel.
     * @throws InvalidFilterValueException
     *         The filter value is not valid. Verify the value and try again.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.GetParametersByPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParametersByPath" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetParametersByPathResult getParametersByPath(GetParametersByPathRequest request) {
        request = beforeClientExecution(request);
        return executeGetParametersByPath(request);
    }

    @SdkInternalApi
    final GetParametersByPathResult executeGetParametersByPath(GetParametersByPathRequest getParametersByPathRequest) {

        ExecutionContext executionContext = createExecutionContext(getParametersByPathRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetParametersByPathRequest> request = null;
        Response<GetParametersByPathResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetParametersByPathRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getParametersByPathRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetParametersByPath");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetParametersByPathResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetParametersByPathResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves information about a patch baseline.
     * </p>
     * 
     * @param getPatchBaselineRequest
     * @return Result of the GetPatchBaseline operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetPatchBaselineResult getPatchBaseline(GetPatchBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeGetPatchBaseline(request);
    }

    @SdkInternalApi
    final GetPatchBaselineResult executeGetPatchBaseline(GetPatchBaselineRequest getPatchBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(getPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPatchBaselineRequest> request = null;
        Response<GetPatchBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPatchBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getPatchBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPatchBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPatchBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetPatchBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the patch baseline that should be used for the specified patch group.
     * </p>
     * 
     * @param getPatchBaselineForPatchGroupRequest
     * @return Result of the GetPatchBaselineForPatchGroup operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetPatchBaselineForPatchGroupResult getPatchBaselineForPatchGroup(GetPatchBaselineForPatchGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetPatchBaselineForPatchGroup(request);
    }

    @SdkInternalApi
    final GetPatchBaselineForPatchGroupResult executeGetPatchBaselineForPatchGroup(GetPatchBaselineForPatchGroupRequest getPatchBaselineForPatchGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getPatchBaselineForPatchGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPatchBaselineForPatchGroupRequest> request = null;
        Response<GetPatchBaselineForPatchGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPatchBaselineForPatchGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getPatchBaselineForPatchGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetPatchBaselineForPatchGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetPatchBaselineForPatchGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetPatchBaselineForPatchGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>UpdateServiceSetting</a> API action to change the default setting. Or use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the AWS service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest
     *        The request body of the GetServiceSetting API action.
     * @return Result of the GetServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting was not found. Either the service name or the setting has not been
     *         provisioned by the AWS service team.
     * @sample AWSSimpleSystemsManagement.GetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetServiceSettingResult getServiceSetting(GetServiceSettingRequest request) {
        request = beforeClientExecution(request);
        return executeGetServiceSetting(request);
    }

    @SdkInternalApi
    final GetServiceSettingResult executeGetServiceSetting(GetServiceSettingRequest getServiceSettingRequest) {

        ExecutionContext executionContext = createExecutionContext(getServiceSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetServiceSettingRequest> request = null;
        Response<GetServiceSettingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetServiceSettingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getServiceSettingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetServiceSetting");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetServiceSettingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetServiceSettingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a
     * parameter, Systems Manager automatically saves a new version and increments the version number by one. A label
     * can help you remember the purpose of a parameter when there are multiple versions.
     * </p>
     * <p>
     * Parameter labels have the following requirements and restrictions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * A version of a parameter can have a maximum of 10 labels.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't attach the same label to different versions of the same parameter. For example, if version 1 has the
     * label Production, then you can't attach Production to version 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can move a label from one version of a parameter to another.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't create a label when you create a new parameter. You must attach a label to a specific version of a
     * parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a parameter label. If you no longer want to use a parameter label, then you must move it to a
     * different version of a parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * A label can have a maximum of 100 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can contain letters (case sensitive), numbers, periods (.), hyphens (-), or underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Labels can't begin with a number, "aws," or "ssm" (not case sensitive). If a label fails to meet these
     * requirements, then the label is not associated with a parameter and the system displays it in the list of
     * InvalidLabels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param labelParameterVersionRequest
     * @return Result of the LabelParameterVersion operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws ParameterNotFoundException
     *         The parameter could not be found. Verify the name and try again.
     * @throws ParameterVersionNotFoundException
     *         The specified parameter version was not found. Verify the parameter name and version, and try again.
     * @throws ParameterVersionLabelLimitExceededException
     *         A parameter version can have a maximum of ten labels.
     * @sample AWSSimpleSystemsManagement.LabelParameterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/LabelParameterVersion" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public LabelParameterVersionResult labelParameterVersion(LabelParameterVersionRequest request) {
        request = beforeClientExecution(request);
        return executeLabelParameterVersion(request);
    }

    @SdkInternalApi
    final LabelParameterVersionResult executeLabelParameterVersion(LabelParameterVersionRequest labelParameterVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(labelParameterVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LabelParameterVersionRequest> request = null;
        Response<LabelParameterVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LabelParameterVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(labelParameterVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "LabelParameterVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<LabelParameterVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new LabelParameterVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves all versions of an association for a specific association ID.
     * </p>
     * 
     * @param listAssociationVersionsRequest
     * @return Result of the ListAssociationVersions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @sample AWSSimpleSystemsManagement.ListAssociationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociationVersions" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListAssociationVersionsResult listAssociationVersions(ListAssociationVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociationVersions(request);
    }

    @SdkInternalApi
    final ListAssociationVersionsResult executeListAssociationVersions(ListAssociationVersionsRequest listAssociationVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociationVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationVersionsRequest> request = null;
        Response<ListAssociationVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationVersionsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listAssociationVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociationVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociationVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssociationVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the associations for the specified Systems Manager document or instance.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return Result of the ListAssociations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListAssociationsResult listAssociations(ListAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeListAssociations(request);
    }

    @SdkInternalApi
    final ListAssociationsResult executeListAssociations(ListAssociationsRequest listAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssociationsRequest> request = null;
        Response<ListAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
     * command invocation applies to one instance. For example, if a user runs SendCommand against three instances, then
     * a command invocation is created for each requested instance ID. ListCommandInvocations provide status about
     * command execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return Result of the ListCommandInvocations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListCommandInvocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommandInvocations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCommandInvocationsResult listCommandInvocations(ListCommandInvocationsRequest request) {
        request = beforeClientExecution(request);
        return executeListCommandInvocations(request);
    }

    @SdkInternalApi
    final ListCommandInvocationsResult executeListCommandInvocations(ListCommandInvocationsRequest listCommandInvocationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCommandInvocationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCommandInvocationsRequest> request = null;
        Response<ListCommandInvocationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCommandInvocationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCommandInvocationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCommandInvocations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCommandInvocationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListCommandInvocationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the commands requested by users of the AWS account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return Result of the ListCommands operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListCommands
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommands" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCommandsResult listCommands(ListCommandsRequest request) {
        request = beforeClientExecution(request);
        return executeListCommands(request);
    }

    @SdkInternalApi
    final ListCommandsResult executeListCommands(ListCommandsRequest listCommandsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCommandsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCommandsRequest> request = null;
        Response<ListCommandsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCommandsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCommandsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCommands");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCommandsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCommandsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * For a specified resource ID, this API action returns a list of compliance statuses for different resource types.
     * Currently, you can only specify one resource ID per call. List results depend on the criteria specified in the
     * filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return Result of the ListComplianceItems operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListComplianceItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceItems" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListComplianceItemsResult listComplianceItems(ListComplianceItemsRequest request) {
        request = beforeClientExecution(request);
        return executeListComplianceItems(request);
    }

    @SdkInternalApi
    final ListComplianceItemsResult executeListComplianceItems(ListComplianceItemsRequest listComplianceItemsRequest) {

        ExecutionContext executionContext = createExecutionContext(listComplianceItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComplianceItemsRequest> request = null;
        Response<ListComplianceItemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComplianceItemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listComplianceItemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComplianceItems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComplianceItemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListComplianceItemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a summary count of compliant and non-compliant resources for a compliance type. For example, this call
     * can return State Manager associations, patches, or custom compliance types according to the filter criteria that
     * you specify.
     * </p>
     * 
     * @param listComplianceSummariesRequest
     * @return Result of the ListComplianceSummaries operation returned by the service.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceSummaries" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListComplianceSummariesResult listComplianceSummaries(ListComplianceSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeListComplianceSummaries(request);
    }

    @SdkInternalApi
    final ListComplianceSummariesResult executeListComplianceSummaries(ListComplianceSummariesRequest listComplianceSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listComplianceSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListComplianceSummariesRequest> request = null;
        Response<ListComplianceSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListComplianceSummariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listComplianceSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListComplianceSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListComplianceSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListComplianceSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * List all versions for a document.
     * </p>
     * 
     * @param listDocumentVersionsRequest
     * @return Result of the ListDocumentVersions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @sample AWSSimpleSystemsManagement.ListDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocumentVersions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDocumentVersionsResult listDocumentVersions(ListDocumentVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListDocumentVersions(request);
    }

    @SdkInternalApi
    final ListDocumentVersionsResult executeListDocumentVersions(ListDocumentVersionsRequest listDocumentVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDocumentVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentVersionsRequest> request = null;
        Response<ListDocumentVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDocumentVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDocumentVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDocumentVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDocumentVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more of your Systems Manager documents.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return Result of the ListDocuments operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InvalidFilterKeyException
     *         The specified key is not valid.
     * @sample AWSSimpleSystemsManagement.ListDocuments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocuments" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDocumentsResult listDocuments(ListDocumentsRequest request) {
        request = beforeClientExecution(request);
        return executeListDocuments(request);
    }

    @SdkInternalApi
    final ListDocumentsResult executeListDocuments(ListDocumentsRequest listDocumentsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDocumentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDocumentsRequest> request = null;
        Response<ListDocumentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDocumentsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDocumentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDocuments");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDocumentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDocumentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListDocumentsResult listDocuments() {
        return listDocuments(new ListDocumentsRequest());
    }

    /**
     * <p>
     * A list of inventory items returned by the request.
     * </p>
     * 
     * @param listInventoryEntriesRequest
     * @return Result of the ListInventoryEntries operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListInventoryEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListInventoryEntries" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListInventoryEntriesResult listInventoryEntries(ListInventoryEntriesRequest request) {
        request = beforeClientExecution(request);
        return executeListInventoryEntries(request);
    }

    @SdkInternalApi
    final ListInventoryEntriesResult executeListInventoryEntries(ListInventoryEntriesRequest listInventoryEntriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listInventoryEntriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListInventoryEntriesRequest> request = null;
        Response<ListInventoryEntriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListInventoryEntriesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listInventoryEntriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListInventoryEntries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListInventoryEntriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListInventoryEntriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information about compliant and non-compliant
     * statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return Result of the ListResourceComplianceSummaries operation returned by the service.
     * @throws InvalidFilterException
     *         The filter name is not valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListResourceComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceComplianceSummaries"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListResourceComplianceSummariesResult listResourceComplianceSummaries(ListResourceComplianceSummariesRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceComplianceSummaries(request);
    }

    @SdkInternalApi
    final ListResourceComplianceSummariesResult executeListResourceComplianceSummaries(
            ListResourceComplianceSummariesRequest listResourceComplianceSummariesRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceComplianceSummariesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceComplianceSummariesRequest> request = null;
        Response<ListResourceComplianceSummariesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceComplianceSummariesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listResourceComplianceSummariesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceComplianceSummaries");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceComplianceSummariesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListResourceComplianceSummariesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists your resource data sync configurations. Includes information about the last time a sync attempted to start,
     * the last sync status, and the last time a sync successfully completed.
     * </p>
     * <p>
     * The number of sync configurations might be too large to return using a single call to
     * <code>ListResourceDataSync</code>. You can limit the number of sync configurations returned by using the
     * <code>MaxResults</code> parameter. To determine whether there are more sync configurations to list, check the
     * value of <code>NextToken</code> in the output. If there are more sync configurations to list, you can request
     * them by specifying the <code>NextToken</code> returned in the call to the parameter of a subsequent call.
     * </p>
     * 
     * @param listResourceDataSyncRequest
     * @return Result of the ListResourceDataSync operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token is not valid.
     * @sample AWSSimpleSystemsManagement.ListResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListResourceDataSyncResult listResourceDataSync(ListResourceDataSyncRequest request) {
        request = beforeClientExecution(request);
        return executeListResourceDataSync(request);
    }

    @SdkInternalApi
    final ListResourceDataSyncResult executeListResourceDataSync(ListResourceDataSyncRequest listResourceDataSyncRequest) {

        ExecutionContext executionContext = createExecutionContext(listResourceDataSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListResourceDataSyncRequest> request = null;
        Response<ListResourceDataSyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListResourceDataSyncRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listResourceDataSyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListResourceDataSync");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListResourceDataSyncResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListResourceDataSyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Shares a Systems Manager document publicly or privately. If you share a document privately, you must specify the
     * AWS user account IDs for those people who can use the document. If you share a document publicly, you must
     * specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return Result of the ModifyDocumentPermission operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidPermissionTypeException
     *         The permission type is not supported. <i>Share</i> is the only supported permission type.
     * @throws DocumentPermissionLimitException
     *         The document cannot be shared with more AWS user accounts. You can share a document with a maximum of 20
     *         accounts. You can publicly share up to five documents. If you need to increase this limit, contact AWS
     *         Support.
     * @throws DocumentLimitExceededException
     *         You can have at most 200 active Systems Manager documents.
     * @sample AWSSimpleSystemsManagement.ModifyDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ModifyDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ModifyDocumentPermissionResult modifyDocumentPermission(ModifyDocumentPermissionRequest request) {
        request = beforeClientExecution(request);
        return executeModifyDocumentPermission(request);
    }

    @SdkInternalApi
    final ModifyDocumentPermissionResult executeModifyDocumentPermission(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest) {

        ExecutionContext executionContext = createExecutionContext(modifyDocumentPermissionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyDocumentPermissionRequest> request = null;
        Response<ModifyDocumentPermissionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyDocumentPermissionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(modifyDocumentPermissionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ModifyDocumentPermission");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ModifyDocumentPermissionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ModifyDocumentPermissionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated resource. This action lets you register
     * custom compliance details with a resource. This call overwrites existing compliance information on the resource,
     * so you must provide a full list of compliance items each time that you send the request.
     * </p>
     * <p>
     * ComplianceType can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ExecutionId: The execution ID when the patch, association, or custom compliance item was applied.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionType: Specify patch, association, or Custom:<code>string</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ExecutionTime. The time the patch, association, or custom compliance item was applied to the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Id: The patch, association, or custom compliance ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Title: A title.
     * </p>
     * </li>
     * <li>
     * <p>
     * Status: The status of the compliance item. For example, <code>approved</code> for patches, or <code>Failed</code>
     * for associations.
     * </p>
     * </li>
     * <li>
     * <p>
     * Severity: A patch severity. For example, <code>critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentName: A SSM document name. For example, AWS-RunPatchBaseline.
     * </p>
     * </li>
     * <li>
     * <p>
     * DocumentVersion: An SSM document version number. For example, 4.
     * </p>
     * </li>
     * <li>
     * <p>
     * Classification: A patch classification. For example, <code>security updates</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchBaselineId: A patch baseline ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchSeverity: A patch severity. For example, <code>Critical</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchState: A patch state. For example, <code>InstancesWithFailedPatches</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * PatchGroup: The name of a patch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * InstalledTime: The time the association, patch, or custom compliance item was applied to the resource. Specify
     * the time by using the following format: yyyy-MM-dd'T'HH:mm:ss'Z'
     * </p>
     * </li>
     * </ul>
     * 
     * @param putComplianceItemsRequest
     * @return Result of the PutComplianceItems operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidItemContentException
     *         One or more content items is not valid.
     * @throws TotalSizeLimitExceededException
     *         The size of inventory data has exceeded the total size limit for the resource.
     * @throws ItemSizeLimitExceededException
     *         The inventory item size has exceeded the size limit.
     * @throws ComplianceTypeCountLimitExceededException
     *         You specified too many custom compliance types. You can specify a maximum of 10 different types.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @sample AWSSimpleSystemsManagement.PutComplianceItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutComplianceItems" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutComplianceItemsResult putComplianceItems(PutComplianceItemsRequest request) {
        request = beforeClientExecution(request);
        return executePutComplianceItems(request);
    }

    @SdkInternalApi
    final PutComplianceItemsResult executePutComplianceItems(PutComplianceItemsRequest putComplianceItemsRequest) {

        ExecutionContext executionContext = createExecutionContext(putComplianceItemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutComplianceItemsRequest> request = null;
        Response<PutComplianceItemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutComplianceItemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putComplianceItemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutComplianceItems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutComplianceItemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutComplianceItemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Bulk update custom inventory items on one more instance. The request adds an inventory item, if it doesn't
     * already exist, or updates an inventory item, if it does exist.
     * </p>
     * 
     * @param putInventoryRequest
     * @return Result of the PutInventory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidTypeNameException
     *         The parameter type name is not valid.
     * @throws InvalidItemContentException
     *         One or more content items is not valid.
     * @throws TotalSizeLimitExceededException
     *         The size of inventory data has exceeded the total size limit for the resource.
     * @throws ItemSizeLimitExceededException
     *         The inventory item size has exceeded the size limit.
     * @throws ItemContentMismatchException
     *         The inventory item has invalid content.
     * @throws CustomSchemaCountLimitExceededException
     *         You have exceeded the limit for custom schemas. Delete one or more custom schemas and try again.
     * @throws UnsupportedInventorySchemaVersionException
     *         Inventory item type schema version has to match supported versions in the service. Check output of
     *         GetInventorySchema to see the available schema version for each type.
     * @throws UnsupportedInventoryItemContextException
     *         The <code>Context</code> attribute that you specified for the <code>InventoryItem</code> is not allowed
     *         for this inventory type. You can only use the <code>Context</code> attribute with inventory types like
     *         <code>AWS:ComplianceItem</code>.
     * @throws InvalidInventoryItemContextException
     *         You specified invalid keys or values in the <code>Context</code> attribute for <code>InventoryItem</code>
     *         . Verify the keys and values, and try again.
     * @throws SubTypeCountLimitExceededException
     *         The sub-type count exceeded the limit for the inventory type.
     * @sample AWSSimpleSystemsManagement.PutInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutInventory" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutInventoryResult putInventory(PutInventoryRequest request) {
        request = beforeClientExecution(request);
        return executePutInventory(request);
    }

    @SdkInternalApi
    final PutInventoryResult executePutInventory(PutInventoryRequest putInventoryRequest) {

        ExecutionContext executionContext = createExecutionContext(putInventoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutInventoryRequest> request = null;
        Response<PutInventoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutInventoryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putInventoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutInventory");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutInventoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutInventoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Add a parameter to the system.
     * </p>
     * 
     * @param putParameterRequest
     * @return Result of the PutParameter operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidKeyIdException
     *         The query key ID is not valid.
     * @throws ParameterLimitExceededException
     *         You have exceeded the number of parameters for this AWS account. Delete one or more parameters and try
     *         again.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws ParameterAlreadyExistsException
     *         The parameter already exists. You can't create duplicate parameters.
     * @throws HierarchyLevelLimitExceededException
     *         A hierarchy can have a maximum of 15 levels. For more information, see <a href=
     *         "http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     *         >Requirements and Constraints for Parameter Names</a> in the <i>AWS Systems Manager User Guide</i>.
     * @throws HierarchyTypeMismatchException
     *         Parameter Store does not support changing a parameter type in a hierarchy. For example, you can't change
     *         a parameter from a String type to a SecureString type. You must create a new, unique parameter.
     * @throws InvalidAllowedPatternException
     *         The request does not meet the regular expression requirement.
     * @throws ParameterMaxVersionLimitExceededException
     *         The parameter exceeded the maximum number of allowed versions.
     * @throws ParameterPatternMismatchException
     *         The parameter name is not valid.
     * @throws UnsupportedParameterTypeException
     *         The parameter type is not supported.
     * @throws PoliciesLimitExceededException
     *         You specified more than the maximum number of allowed policies for the parameter. The maximum is 10.
     * @throws InvalidPolicyTypeException
     *         The policy type is not supported. Parameter Store supports the following policy types: Expiration,
     *         ExpirationNotification, and NoChangeNotification.
     * @throws InvalidPolicyAttributeException
     *         A policy attribute or its value is invalid.
     * @throws IncompatiblePolicyException
     *         There is a conflict in the policies specified for this parameter. You can't, for example, specify two
     *         Expiration policies for a parameter. Review your policies, and try again.
     * @sample AWSSimpleSystemsManagement.PutParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/PutParameter" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PutParameterResult putParameter(PutParameterRequest request) {
        request = beforeClientExecution(request);
        return executePutParameter(request);
    }

    @SdkInternalApi
    final PutParameterResult executePutParameter(PutParameterRequest putParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(putParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutParameterRequest> request = null;
        Response<PutParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutParameterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutParameter");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutParameterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Defines the default patch baseline.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @return Result of the RegisterDefaultPatchBaseline operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterDefaultPatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterDefaultPatchBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterDefaultPatchBaselineResult registerDefaultPatchBaseline(RegisterDefaultPatchBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterDefaultPatchBaseline(request);
    }

    @SdkInternalApi
    final RegisterDefaultPatchBaselineResult executeRegisterDefaultPatchBaseline(RegisterDefaultPatchBaselineRequest registerDefaultPatchBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(registerDefaultPatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterDefaultPatchBaselineRequest> request = null;
        Response<RegisterDefaultPatchBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterDefaultPatchBaselineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerDefaultPatchBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterDefaultPatchBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterDefaultPatchBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterDefaultPatchBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a patch baseline for a patch group.
     * </p>
     * 
     * @param registerPatchBaselineForPatchGroupRequest
     * @return Result of the RegisterPatchBaselineForPatchGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         Error returned if an attempt is made to register a patch group with a patch baseline that is already
     *         registered with a different patch baseline.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterPatchBaselineForPatchGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterPatchBaselineForPatchGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterPatchBaselineForPatchGroupResult registerPatchBaselineForPatchGroup(RegisterPatchBaselineForPatchGroupRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterPatchBaselineForPatchGroup(request);
    }

    @SdkInternalApi
    final RegisterPatchBaselineForPatchGroupResult executeRegisterPatchBaselineForPatchGroup(
            RegisterPatchBaselineForPatchGroupRequest registerPatchBaselineForPatchGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(registerPatchBaselineForPatchGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterPatchBaselineForPatchGroupRequest> request = null;
        Response<RegisterPatchBaselineForPatchGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterPatchBaselineForPatchGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerPatchBaselineForPatchGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterPatchBaselineForPatchGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterPatchBaselineForPatchGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterPatchBaselineForPatchGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a target with a Maintenance Window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return Result of the RegisterTargetWithMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterTargetWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTargetWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterTargetWithMaintenanceWindowResult registerTargetWithMaintenanceWindow(RegisterTargetWithMaintenanceWindowRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterTargetWithMaintenanceWindow(request);
    }

    @SdkInternalApi
    final RegisterTargetWithMaintenanceWindowResult executeRegisterTargetWithMaintenanceWindow(
            RegisterTargetWithMaintenanceWindowRequest registerTargetWithMaintenanceWindowRequest) {

        ExecutionContext executionContext = createExecutionContext(registerTargetWithMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTargetWithMaintenanceWindowRequest> request = null;
        Response<RegisterTargetWithMaintenanceWindowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTargetWithMaintenanceWindowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerTargetWithMaintenanceWindowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterTargetWithMaintenanceWindow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterTargetWithMaintenanceWindowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterTargetWithMaintenanceWindowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new task to a Maintenance Window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return Result of the RegisterTaskWithMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource limits. For example, too many
     *         Maintenance Windows or Patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws FeatureNotAvailableException
     *         You attempted to register a LAMBDA or STEP_FUNCTION task in a region where the corresponding service is
     *         not available.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterTaskWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTaskWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterTaskWithMaintenanceWindowResult registerTaskWithMaintenanceWindow(RegisterTaskWithMaintenanceWindowRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterTaskWithMaintenanceWindow(request);
    }

    @SdkInternalApi
    final RegisterTaskWithMaintenanceWindowResult executeRegisterTaskWithMaintenanceWindow(
            RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest) {

        ExecutionContext executionContext = createExecutionContext(registerTaskWithMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterTaskWithMaintenanceWindowRequest> request = null;
        Response<RegisterTaskWithMaintenanceWindowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterTaskWithMaintenanceWindowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerTaskWithMaintenanceWindowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterTaskWithMaintenanceWindow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterTaskWithMaintenanceWindowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterTaskWithMaintenanceWindowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes all tags from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type is not valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID is not valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        request = beforeClientExecution(request);
        return executeRemoveTagsFromResource(request);
    }

    @SdkInternalApi
    final RemoveTagsFromResourceResult executeRemoveTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RemoveTagsFromResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveTagsFromResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveTagsFromResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API action to view the current value. Use the <a>UpdateServiceSetting</a> API action to
     * change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as provisioned by the AWS service team.
     * </p>
     * 
     * @param resetServiceSettingRequest
     *        The request body of the ResetServiceSetting API action.
     * @return Result of the ResetServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting was not found. Either the service name or the setting has not been
     *         provisioned by the AWS service team.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.ResetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResetServiceSettingResult resetServiceSetting(ResetServiceSettingRequest request) {
        request = beforeClientExecution(request);
        return executeResetServiceSetting(request);
    }

    @SdkInternalApi
    final ResetServiceSettingResult executeResetServiceSetting(ResetServiceSettingRequest resetServiceSettingRequest) {

        ExecutionContext executionContext = createExecutionContext(resetServiceSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResetServiceSettingRequest> request = null;
        Response<ResetServiceSettingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResetServiceSettingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resetServiceSettingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResetServiceSetting");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResetServiceSettingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResetServiceSettingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Reconnects a session to an instance after it has been disconnected. Connections can be resumed for disconnected
     * sessions, but not terminated sessions.
     * </p>
     * <note>
     * <p>
     * This command is primarily for use by client machines to automatically reconnect during intermittent network
     * issues. It is not intended for any other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @return Result of the ResumeSession operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ResumeSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResumeSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResumeSessionResult resumeSession(ResumeSessionRequest request) {
        request = beforeClientExecution(request);
        return executeResumeSession(request);
    }

    @SdkInternalApi
    final ResumeSessionResult executeResumeSession(ResumeSessionRequest resumeSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(resumeSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeSessionRequest> request = null;
        Response<ResumeSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResumeSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resumeSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResumeSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResumeSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResumeSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends a signal to an Automation execution to change the current behavior or status of the execution.
     * </p>
     * 
     * @param sendAutomationSignalRequest
     * @return Result of the SendAutomationSignal operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws AutomationStepNotFoundException
     *         The specified step name and execution ID don't exist. Verify the information and try again.
     * @throws InvalidAutomationSignalException
     *         The signal is not valid for the current Automation execution.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.SendAutomationSignal
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendAutomationSignal" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendAutomationSignalResult sendAutomationSignal(SendAutomationSignalRequest request) {
        request = beforeClientExecution(request);
        return executeSendAutomationSignal(request);
    }

    @SdkInternalApi
    final SendAutomationSignalResult executeSendAutomationSignal(SendAutomationSignalRequest sendAutomationSignalRequest) {

        ExecutionContext executionContext = createExecutionContext(sendAutomationSignalRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendAutomationSignalRequest> request = null;
        Response<SendAutomationSignalResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendAutomationSignalRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendAutomationSignalRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendAutomationSignal");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendAutomationSignalResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendAutomationSignalResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Runs commands on one or more managed instances.
     * </p>
     * 
     * @param sendCommandRequest
     * @return Result of the SendCommand operation returned by the service.
     * @throws DuplicateInstanceIdException
     *         You cannot specify an instance ID in more than one association.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidOutputFolderException
     *         The S3 bucket does not exist.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Systems Manager document. You can only supply
     *         values to parameters defined in the Systems Manager document.
     * @throws UnsupportedPlatformTypeException
     *         The document does not support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a document is 64 KB.
     * @throws InvalidRoleException
     *         The role name can't contain invalid characters. Also verify that you specified an IAM role for
     *         notifications that includes the required trust policy. For information about configuring the IAM role for
     *         Run Command notifications, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *         Amazon SNS Notifications for Run Command</a> in the <i>AWS Systems Manager User Guide</i>.
     * @throws InvalidNotificationConfigException
     *         One or more configuration items is not valid. Verify that a valid Amazon Resource Name (ARN) was provided
     *         for an Amazon SNS topic.
     * @sample AWSSimpleSystemsManagement.SendCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendCommand" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public SendCommandResult sendCommand(SendCommandRequest request) {
        request = beforeClientExecution(request);
        return executeSendCommand(request);
    }

    @SdkInternalApi
    final SendCommandResult executeSendCommand(SendCommandRequest sendCommandRequest) {

        ExecutionContext executionContext = createExecutionContext(sendCommandRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendCommandRequest> request = null;
        Response<SendCommandResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendCommandRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendCommandRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendCommand");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SendCommandResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendCommandResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this API action to run an association immediately and only one time. This action can be helpful when
     * troubleshooting associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return Result of the StartAssociationsOnce operation returned by the service.
     * @throws InvalidAssociationException
     *         The association is not valid or does not exist.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @sample AWSSimpleSystemsManagement.StartAssociationsOnce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAssociationsOnce" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartAssociationsOnceResult startAssociationsOnce(StartAssociationsOnceRequest request) {
        request = beforeClientExecution(request);
        return executeStartAssociationsOnce(request);
    }

    @SdkInternalApi
    final StartAssociationsOnceResult executeStartAssociationsOnce(StartAssociationsOnceRequest startAssociationsOnceRequest) {

        ExecutionContext executionContext = createExecutionContext(startAssociationsOnceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAssociationsOnceRequest> request = null;
        Response<StartAssociationsOnceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAssociationsOnceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAssociationsOnceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAssociationsOnce");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAssociationsOnceResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new StartAssociationsOnceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates execution of an Automation document.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return Result of the StartAutomationExecution operation returned by the service.
     * @throws AutomationDefinitionNotFoundException
     *         An Automation document with the specified name could not be found.
     * @throws InvalidAutomationExecutionParametersException
     *         The supplied parameters for invoking the specified Automation document are incorrect. For example, they
     *         may not match the set of parameters permitted for the specified Automation document.
     * @throws AutomationExecutionLimitExceededException
     *         The number of simultaneously running Automation executions exceeded the allowable limit.
     * @throws AutomationDefinitionVersionNotFoundException
     *         An Automation document with the specified name and version could not be found.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws InvalidTargetException
     *         The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you
     *         might not have permission to perform the operation.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StartAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StartAutomationExecutionResult startAutomationExecution(StartAutomationExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStartAutomationExecution(request);
    }

    @SdkInternalApi
    final StartAutomationExecutionResult executeStartAutomationExecution(StartAutomationExecutionRequest startAutomationExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(startAutomationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAutomationExecutionRequest> request = null;
        Response<StartAutomationExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAutomationExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startAutomationExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartAutomationExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAutomationExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartAutomationExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and
     * token that can be used to open a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * AWS CLI usage: <code>start-session</code> is an interactive command that requires the Session Manager plugin to
     * be installed on the client machine making the call. For information, see <a href=
     * "http://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html">
     * Install the Session Manager Plugin for the AWS CLI</a> in the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return Result of the StartSession operation returned by the service.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws TargetNotConnectedException
     *         The specified target instance for the session is not fully configured for use with Session Manager. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-getting-started.html"
     *         >Getting Started with Session Manager</a> in the <i>AWS Systems Manager User Guide</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StartSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartSessionResult startSession(StartSessionRequest request) {
        request = beforeClientExecution(request);
        return executeStartSession(request);
    }

    @SdkInternalApi
    final StartSessionResult executeStartSession(StartSessionRequest startSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(startSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSessionRequest> request = null;
        Response<StartSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop an Automation that is currently running.
     * </p>
     * 
     * @param stopAutomationExecutionRequest
     * @return Result of the StopAutomationExecution operation returned by the service.
     * @throws AutomationExecutionNotFoundException
     *         There is no automation execution information for the requested automation execution ID.
     * @throws InvalidAutomationStatusUpdateException
     *         The specified update status operation is not valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StopAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StopAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public StopAutomationExecutionResult stopAutomationExecution(StopAutomationExecutionRequest request) {
        request = beforeClientExecution(request);
        return executeStopAutomationExecution(request);
    }

    @SdkInternalApi
    final StopAutomationExecutionResult executeStopAutomationExecution(StopAutomationExecutionRequest stopAutomationExecutionRequest) {

        ExecutionContext executionContext = createExecutionContext(stopAutomationExecutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAutomationExecutionRequest> request = null;
        Response<StopAutomationExecutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAutomationExecutionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(stopAutomationExecutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopAutomationExecution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopAutomationExecutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StopAutomationExecutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Permanently ends a session and closes the data connection between the Session Manager client and SSM Agent on the
     * instance. A terminated session cannot be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return Result of the TerminateSession operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public TerminateSessionResult terminateSession(TerminateSessionRequest request) {
        request = beforeClientExecution(request);
        return executeTerminateSession(request);
    }

    @SdkInternalApi
    final TerminateSessionResult executeTerminateSession(TerminateSessionRequest terminateSessionRequest) {

        ExecutionContext executionContext = createExecutionContext(terminateSessionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TerminateSessionRequest> request = null;
        Response<TerminateSessionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TerminateSessionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(terminateSessionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TerminateSession");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TerminateSessionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TerminateSessionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an association. You can update the association name and version, the document version, schedule,
     * parameters, and Amazon S3 output.
     * </p>
     * <important>
     * <p>
     * When you update an association, the association immediately runs against the specified targets.
     * </p>
     * </important>
     * 
     * @param updateAssociationRequest
     * @return Result of the UpdateAssociation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Systems Manager document. You can only supply
     *         values to parameters defined in the Systems Manager document.
     * @throws InvalidOutputLocationException
     *         The output location is not valid or does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws InvalidUpdateException
     *         The update is not valid.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidTargetException
     *         The target is not valid or does not exist. It might not be configured for EC2 Systems Manager or you
     *         might not have permission to perform the operation.
     * @throws InvalidAssociationVersionException
     *         The version you specified is not valid. Use ListAssociationVersions to view all versions of an
     *         association according to the association ID. Or, use the <code>$LATEST</code> parameter to view the
     *         latest version of the association.
     * @throws AssociationVersionLimitExceededException
     *         You have reached the maximum number versions allowed for an association. Each association has a limit of
     *         1,000 versions.
     * @sample AWSSimpleSystemsManagement.UpdateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateAssociationResult updateAssociation(UpdateAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssociation(request);
    }

    @SdkInternalApi
    final UpdateAssociationResult executeUpdateAssociation(UpdateAssociationRequest updateAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssociationRequest> request = null;
        Response<UpdateAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssociationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the status of the Systems Manager document associated with the specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return Result of the UpdateAssociationStatus operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws AssociationDoesNotExistException
     *         The specified association does not exist.
     * @throws StatusUnchangedException
     *         The updated status is the same as the current status.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.UpdateAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociationStatus" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateAssociationStatusResult updateAssociationStatus(UpdateAssociationStatusRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAssociationStatus(request);
    }

    @SdkInternalApi
    final UpdateAssociationStatusResult executeUpdateAssociationStatus(UpdateAssociationStatusRequest updateAssociationStatusRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAssociationStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssociationStatusRequest> request = null;
        Response<UpdateAssociationStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssociationStatusRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateAssociationStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAssociationStatus");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssociationStatusResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAssociationStatusResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * The document you want to update.
     * </p>
     * 
     * @param updateDocumentRequest
     * @return Result of the UpdateDocument operation returned by the service.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a document is 64 KB.
     * @throws DocumentVersionLimitExceededException
     *         The document has too many versions. Delete one or more document versions and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws DuplicateDocumentContentException
     *         The content of the association document matches another document. Change the content of the document and
     *         try again.
     * @throws DuplicateDocumentVersionNameException
     *         The version name has already been used in this document. Specify a different version name, and then try
     *         again.
     * @throws InvalidDocumentContentException
     *         The content for the document is not valid.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema is not supported.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentOperationException
     *         You attempted to delete a document while it is still shared. You must stop sharing the document before
     *         you can delete it.
     * @sample AWSSimpleSystemsManagement.UpdateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateDocumentResult updateDocument(UpdateDocumentRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDocument(request);
    }

    @SdkInternalApi
    final UpdateDocumentResult executeUpdateDocument(UpdateDocumentRequest updateDocumentRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDocumentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentRequest> request = null;
        Response<UpdateDocumentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDocumentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDocument");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDocumentResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDocumentResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Set the default version of a document.
     * </p>
     * 
     * @param updateDocumentDefaultVersionRequest
     * @return Result of the UpdateDocumentDefaultVersion operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified document does not exist.
     * @throws InvalidDocumentVersionException
     *         The document version is not valid or does not exist.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema is not supported.
     * @sample AWSSimpleSystemsManagement.UpdateDocumentDefaultVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentDefaultVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDocumentDefaultVersionResult updateDocumentDefaultVersion(UpdateDocumentDefaultVersionRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDocumentDefaultVersion(request);
    }

    @SdkInternalApi
    final UpdateDocumentDefaultVersionResult executeUpdateDocumentDefaultVersion(UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDocumentDefaultVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDocumentDefaultVersionRequest> request = null;
        Response<UpdateDocumentDefaultVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDocumentDefaultVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDocumentDefaultVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDocumentDefaultVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDocumentDefaultVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDocumentDefaultVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing Maintenance Window. Only specified parameters are modified.
     * </p>
     * 
     * @param updateMaintenanceWindowRequest
     * @return Result of the UpdateMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateMaintenanceWindowResult updateMaintenanceWindow(UpdateMaintenanceWindowRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMaintenanceWindow(request);
    }

    @SdkInternalApi
    final UpdateMaintenanceWindowResult executeUpdateMaintenanceWindow(UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMaintenanceWindowRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceWindowRequest> request = null;
        Response<UpdateMaintenanceWindowResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceWindowRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMaintenanceWindowRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMaintenanceWindow");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMaintenanceWindowResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMaintenanceWindowResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the target of an existing Maintenance Window. You can't change the target type, but you can change the
     * following:
     * </p>
     * <p>
     * The target from being an ID target to a Tag target, or a Tag target to an ID target.
     * </p>
     * <p>
     * IDs for an ID target.
     * </p>
     * <p>
     * Tags for a Tag target.
     * </p>
     * <p>
     * Owner.
     * </p>
     * <p>
     * Name.
     * </p>
     * <p>
     * Description.
     * </p>
     * <p>
     * If a parameter is null, then the corresponding field is not modified.
     * </p>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @return Result of the UpdateMaintenanceWindowTarget operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindowTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTarget"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMaintenanceWindowTargetResult updateMaintenanceWindowTarget(UpdateMaintenanceWindowTargetRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMaintenanceWindowTarget(request);
    }

    @SdkInternalApi
    final UpdateMaintenanceWindowTargetResult executeUpdateMaintenanceWindowTarget(UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMaintenanceWindowTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceWindowTargetRequest> request = null;
        Response<UpdateMaintenanceWindowTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceWindowTargetRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMaintenanceWindowTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMaintenanceWindowTarget");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMaintenanceWindowTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMaintenanceWindowTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies a task assigned to a Maintenance Window. You can't change the task type, but you can change the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TaskARN. For example, you can change a RUN_COMMAND task from AWS-RunPowerShellScript to AWS-RunShellScript.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRoleArn
     * </p>
     * </li>
     * <li>
     * <p>
     * TaskInvocationParameters
     * </p>
     * </li>
     * <li>
     * <p>
     * Priority
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxConcurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * MaxErrors
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a parameter is null, then the corresponding field is not modified. Also, if you set Replace to true, then all
     * fields required by the <a>RegisterTaskWithMaintenanceWindow</a> action are required for this request. Optional
     * fields that aren't specified are set to null.
     * </p>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @return Result of the UpdateMaintenanceWindowTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateMaintenanceWindowTaskResult updateMaintenanceWindowTask(UpdateMaintenanceWindowTaskRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateMaintenanceWindowTask(request);
    }

    @SdkInternalApi
    final UpdateMaintenanceWindowTaskResult executeUpdateMaintenanceWindowTask(UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(updateMaintenanceWindowTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMaintenanceWindowTaskRequest> request = null;
        Response<UpdateMaintenanceWindowTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMaintenanceWindowTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateMaintenanceWindowTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateMaintenanceWindowTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateMaintenanceWindowTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateMaintenanceWindowTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Assigns or changes an Amazon Identity and Access Management (IAM) role to the managed instance.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return Result of the UpdateManagedInstanceRole operation returned by the service.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <p>
     *         You do not have permission to access the instance.
     *         </p>
     *         <p>
     *         SSM Agent is not running. On managed instances and Linux instances, verify that the SSM Agent is running.
     *         On EC2 Windows instances, verify that the EC2Config service is running.
     *         </p>
     *         <p>
     *         SSM Agent or EC2Config service is not registered to the SSM endpoint. Try reinstalling SSM Agent or
     *         EC2Config service.
     *         </p>
     *         <p>
     *         The instance is not in valid state. Valid states are: Running, Pending, Stopped, Stopping. Invalid states
     *         are: Shutting-down and Terminated.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateManagedInstanceRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateManagedInstanceRole" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateManagedInstanceRoleResult updateManagedInstanceRole(UpdateManagedInstanceRoleRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateManagedInstanceRole(request);
    }

    @SdkInternalApi
    final UpdateManagedInstanceRoleResult executeUpdateManagedInstanceRole(UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest) {

        ExecutionContext executionContext = createExecutionContext(updateManagedInstanceRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateManagedInstanceRoleRequest> request = null;
        Response<UpdateManagedInstanceRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateManagedInstanceRoleRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateManagedInstanceRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateManagedInstanceRole");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateManagedInstanceRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateManagedInstanceRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key and value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a
     * href="http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html">PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @return Result of the UpdatePatchBaseline operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a Maintenance Window or Patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource limits in Systems Manager, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_ssm">AWS Systems
     *         Manager Limits</a>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdatePatchBaselineResult updatePatchBaseline(UpdatePatchBaselineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdatePatchBaseline(request);
    }

    @SdkInternalApi
    final UpdatePatchBaselineResult executeUpdatePatchBaseline(UpdatePatchBaselineRequest updatePatchBaselineRequest) {

        ExecutionContext executionContext = createExecutionContext(updatePatchBaselineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdatePatchBaselineRequest> request = null;
        Response<UpdatePatchBaselineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdatePatchBaselineRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updatePatchBaselineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdatePatchBaseline");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdatePatchBaselineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdatePatchBaselineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an AWS service. This setting defines how a user
     * interacts with or uses a service or a feature of a service. For example, if an AWS service charges money to the
     * account based on feature or service usage, then the AWS service team might create a default setting of "false".
     * This means the user can't use this feature unless they change the setting to "true" and intentionally opt in for
     * a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. AWS services teams define the default value for
     * a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite the default value
     * if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API action to view the current value. Or, use the <a>ResetServiceSetting</a> to change
     * the value back to the original value defined by the AWS service team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest
     *        The request body of the UpdateServiceSetting API action.
     * @return Result of the UpdateServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting was not found. Either the service name or the setting has not been
     *         provisioned by the AWS service team.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.UpdateServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateServiceSettingResult updateServiceSetting(UpdateServiceSettingRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateServiceSetting(request);
    }

    @SdkInternalApi
    final UpdateServiceSettingResult executeUpdateServiceSetting(UpdateServiceSettingRequest updateServiceSettingRequest) {

        ExecutionContext executionContext = createExecutionContext(updateServiceSettingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateServiceSettingRequest> request = null;
        Response<UpdateServiceSettingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateServiceSettingRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateServiceSettingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "SSM");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateServiceSetting");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateServiceSettingResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateServiceSettingResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
