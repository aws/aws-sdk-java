/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupgateway;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.backupgateway.model.*;

/**
 * Interface for accessing AWS Backup Gateway.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.backupgateway.AbstractAWSBackupGateway} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>Backup gateway</fullname>
 * <p>
 * Backup gateway connects Backup to your hypervisor, so you can create, store, and restore backups of your virtual
 * machines (VMs) anywhere, whether on-premises or in the VMware Cloud (VMC) on Amazon Web Services.
 * </p>
 * <p>
 * Add on-premises resources by connecting to a hypervisor through a gateway. Backup will automatically discover the
 * resources in your hypervisor.
 * </p>
 * <p>
 * Use Backup to assign virtual or on-premises resources to a backup plan, or run on-demand backups. Once you have
 * backed up your resources, you can view them and restore them like any resource supported by Backup.
 * </p>
 * <p>
 * To download the Amazon Web Services software to get started, navigate to the Backup console, choose <b>Gateways</b>,
 * then choose <b>Create gateway</b>.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBackupGateway {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "backup-gateway";

    /**
     * <p>
     * Associates a backup gateway with your server. After you complete the association process, you can back up and
     * restore your VMs through the gateway.
     * </p>
     * 
     * @param associateGatewayToServerRequest
     * @return Result of the AssociateGatewayToServer operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.AssociateGatewayToServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/AssociateGatewayToServer"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateGatewayToServerResult associateGatewayToServer(AssociateGatewayToServerRequest associateGatewayToServerRequest);

    /**
     * <p>
     * Creates a backup gateway. After you create a gateway, you can associate it with a server using the
     * <code>AssociateGatewayToServer</code> operation.
     * </p>
     * 
     * @param createGatewayRequest
     * @return Result of the CreateGateway operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.CreateGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/CreateGateway" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGatewayResult createGateway(CreateGatewayRequest createGatewayRequest);

    /**
     * <p>
     * Deletes a backup gateway.
     * </p>
     * 
     * @param deleteGatewayRequest
     * @return Result of the DeleteGateway operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.DeleteGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DeleteGateway" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteGatewayResult deleteGateway(DeleteGatewayRequest deleteGatewayRequest);

    /**
     * <p>
     * Deletes a hypervisor.
     * </p>
     * 
     * @param deleteHypervisorRequest
     * @return Result of the DeleteHypervisor operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws AccessDeniedException
     *         The operation cannot proceed because you have insufficient permissions.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.DeleteHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DeleteHypervisor"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteHypervisorResult deleteHypervisor(DeleteHypervisorRequest deleteHypervisorRequest);

    /**
     * <p>
     * Disassociates a backup gateway from the specified server. After the disassociation process finishes, the gateway
     * can no longer access the virtual machines on the server.
     * </p>
     * 
     * @param disassociateGatewayFromServerRequest
     * @return Result of the DisassociateGatewayFromServer operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.DisassociateGatewayFromServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/DisassociateGatewayFromServer"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateGatewayFromServerResult disassociateGatewayFromServer(DisassociateGatewayFromServerRequest disassociateGatewayFromServerRequest);

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the gateway.
     * </p>
     * 
     * @param getGatewayRequest
     * @return Result of the GetGateway operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.GetGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetGateway" target="_top">AWS API
     *      Documentation</a>
     */
    GetGatewayResult getGateway(GetGatewayRequest getGatewayRequest);

    /**
     * <p>
     * By providing the ARN (Amazon Resource Name), this API returns the virtual machine.
     * </p>
     * 
     * @param getVirtualMachineRequest
     * @return Result of the GetVirtualMachine operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.GetVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/GetVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    GetVirtualMachineResult getVirtualMachine(GetVirtualMachineRequest getVirtualMachineRequest);

    /**
     * <p>
     * Connect to a hypervisor by importing its configuration.
     * </p>
     * 
     * @param importHypervisorConfigurationRequest
     * @return Result of the ImportHypervisorConfiguration operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws AccessDeniedException
     *         The operation cannot proceed because you have insufficient permissions.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ImportHypervisorConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ImportHypervisorConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ImportHypervisorConfigurationResult importHypervisorConfiguration(ImportHypervisorConfigurationRequest importHypervisorConfigurationRequest);

    /**
     * <p>
     * Lists backup gateways owned by an Amazon Web Services account in an Amazon Web Services Region. The returned list
     * is ordered by gateway Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listGatewaysRequest
     * @return Result of the ListGateways operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ListGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListGateways" target="_top">AWS
     *      API Documentation</a>
     */
    ListGatewaysResult listGateways(ListGatewaysRequest listGatewaysRequest);

    /**
     * <p>
     * Lists your hypervisors.
     * </p>
     * 
     * @param listHypervisorsRequest
     * @return Result of the ListHypervisors operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ListHypervisors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListHypervisors" target="_top">AWS
     *      API Documentation</a>
     */
    ListHypervisorsResult listHypervisors(ListHypervisorsRequest listHypervisorsRequest);

    /**
     * <p>
     * Lists the tags applied to the resource identified by its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists your virtual machines.
     * </p>
     * 
     * @param listVirtualMachinesRequest
     * @return Result of the ListVirtualMachines operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.ListVirtualMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/ListVirtualMachines"
     *      target="_top">AWS API Documentation</a>
     */
    ListVirtualMachinesResult listVirtualMachines(ListVirtualMachinesRequest listVirtualMachinesRequest);

    /**
     * <p>
     * Set the maintenance start time for a gateway.
     * </p>
     * 
     * @param putMaintenanceStartTimeRequest
     * @return Result of the PutMaintenanceStartTime operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.PutMaintenanceStartTime
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/PutMaintenanceStartTime"
     *      target="_top">AWS API Documentation</a>
     */
    PutMaintenanceStartTimeResult putMaintenanceStartTime(PutMaintenanceStartTimeRequest putMaintenanceStartTimeRequest);

    /**
     * <p>
     * Tag the resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tests your hypervisor configuration to validate that backup gateway can connect with the hypervisor and its
     * resources.
     * </p>
     * 
     * @param testHypervisorConfigurationRequest
     * @return Result of the TestHypervisorConfiguration operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.TestHypervisorConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/TestHypervisorConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    TestHypervisorConfigurationResult testHypervisorConfiguration(TestHypervisorConfigurationRequest testHypervisorConfigurationRequest);

    /**
     * <p>
     * Removes tags from the resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a gateway's name. Specify which gateway to update using the Amazon Resource Name (ARN) of the gateway in
     * your request.
     * </p>
     * 
     * @param updateGatewayInformationRequest
     * @return Result of the UpdateGatewayInformation operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws ConflictException
     *         The operation cannot proceed because it is not supported.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.UpdateGatewayInformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewayInformation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGatewayInformationResult updateGatewayInformation(UpdateGatewayInformationRequest updateGatewayInformationRequest);

    /**
     * <p>
     * Updates the gateway virtual machine (VM) software. The request immediately triggers the software update.
     * </p>
     * <note>
     * <p>
     * When you make this request, you get a <code>200 OK</code> success response immediately. However, it might take
     * some time for the update to complete.
     * </p>
     * </note>
     * 
     * @param updateGatewaySoftwareNowRequest
     * @return Result of the UpdateGatewaySoftwareNow operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.UpdateGatewaySoftwareNow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateGatewaySoftwareNow"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGatewaySoftwareNowResult updateGatewaySoftwareNow(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest);

    /**
     * <p>
     * Updates a hypervisor metadata, including its host, username, and password. Specify which hypervisor to update
     * using the Amazon Resource Name (ARN) of the hypervisor in your request.
     * </p>
     * 
     * @param updateHypervisorRequest
     * @return Result of the UpdateHypervisor operation returned by the service.
     * @throws ValidationException
     *         The operation did not succeed because a validation error occurred.
     * @throws InternalServerException
     *         The operation did not succeed because an internal error occurred. Try again later.
     * @throws AccessDeniedException
     *         The operation cannot proceed because you have insufficient permissions.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action wasn't found.
     * @throws ThrottlingException
     *         TPS has been limited to protect against intentional or unintentional high request volumes.
     * @sample AWSBackupGateway.UpdateHypervisor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-gateway-2021-01-01/UpdateHypervisor"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateHypervisorResult updateHypervisor(UpdateHypervisorRequest updateHypervisorRequest);

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
