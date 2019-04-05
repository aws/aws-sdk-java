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
package com.amazonaws.services.ec2.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.waiters.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEC2Waiters {

    /**
     * Represents the service client
     */
    private final AmazonEC2 client;

    private final ExecutorService executorService = Executors.newFixedThreadPool(50);

    /**
     * Constructs a new AmazonEC2Waiters with the given client
     * 
     * @param client
     *        Service client
     */
    @SdkInternalApi
    public AmazonEC2Waiters(AmazonEC2 client) {
        this.client = client;
    }

    /**
     * Builds a PasswordDataAvailable waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<GetPasswordDataRequest> passwordDataAvailable() {

        return new WaiterBuilder<GetPasswordDataRequest, GetPasswordDataResult>().withSdkFunction(new GetPasswordDataFunction(client))
                .withAcceptors(new PasswordDataAvailable.IsTrueMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VolumeInUse waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVolumesRequest> volumeInUse() {

        return new WaiterBuilder<DescribeVolumesRequest, DescribeVolumesResult>().withSdkFunction(new DescribeVolumesFunction(client))
                .withAcceptors(new VolumeInUse.IsInuseMatcher(), new VolumeInUse.IsDeletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ImageAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeImagesRequest> imageAvailable() {

        return new WaiterBuilder<DescribeImagesRequest, DescribeImagesResult>().withSdkFunction(new DescribeImagesFunction(client))
                .withAcceptors(new ImageAvailable.IsAvailableMatcher(), new ImageAvailable.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NetworkInterfaceAvailable waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNetworkInterfacesRequest> networkInterfaceAvailable() {

        return new WaiterBuilder<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult>()
                .withSdkFunction(new DescribeNetworkInterfacesFunction(client))
                .withAcceptors(new NetworkInterfaceAvailable.IsAvailableMatcher(), new NetworkInterfaceAvailable.IsInvalidNetworkInterfaceIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(10), new FixedDelayStrategy(20)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a SystemStatusOk waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstanceStatusRequest> systemStatusOk() {

        return new WaiterBuilder<DescribeInstanceStatusRequest, DescribeInstanceStatusResult>().withSdkFunction(new DescribeInstanceStatusFunction(client))
                .withAcceptors(new SystemStatusOk.IsOkMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VpcPeeringConnectionExists waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVpcPeeringConnectionsRequest> vpcPeeringConnectionExists() {

        return new WaiterBuilder<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult>()
                .withSdkFunction(new DescribeVpcPeeringConnectionsFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS),
                        new VpcPeeringConnectionExists.IsInvalidVpcPeeringConnectionIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VolumeAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVolumesRequest> volumeAvailable() {

        return new WaiterBuilder<DescribeVolumesRequest, DescribeVolumesResult>().withSdkFunction(new DescribeVolumesFunction(client))
                .withAcceptors(new VolumeAvailable.IsAvailableMatcher(), new VolumeAvailable.IsDeletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceStatusOk waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstanceStatusRequest> instanceStatusOk() {

        return new WaiterBuilder<DescribeInstanceStatusRequest, DescribeInstanceStatusResult>().withSdkFunction(new DescribeInstanceStatusFunction(client))
                .withAcceptors(new InstanceStatusOk.IsOkMatcher(), new InstanceStatusOk.IsInvalidInstanceIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VolumeDeleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVolumesRequest> volumeDeleted() {

        return new WaiterBuilder<DescribeVolumesRequest, DescribeVolumesResult>().withSdkFunction(new DescribeVolumesFunction(client))
                .withAcceptors(new VolumeDeleted.IsDeletedMatcher(), new VolumeDeleted.IsInvalidVolumeNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a CustomerGatewayAvailable waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeCustomerGatewaysRequest> customerGatewayAvailable() {

        return new WaiterBuilder<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult>()
                .withSdkFunction(new DescribeCustomerGatewaysFunction(client))
                .withAcceptors(new CustomerGatewayAvailable.IsAvailableMatcher(), new CustomerGatewayAvailable.IsDeletedMatcher(),
                        new CustomerGatewayAvailable.IsDeletingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a NatGatewayAvailable waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeNatGatewaysRequest> natGatewayAvailable() {

        return new WaiterBuilder<DescribeNatGatewaysRequest, DescribeNatGatewaysResult>()
                .withSdkFunction(new DescribeNatGatewaysFunction(client))
                .withAcceptors(new NatGatewayAvailable.IsAvailableMatcher(), new NatGatewayAvailable.IsFailedMatcher(),
                        new NatGatewayAvailable.IsDeletingMatcher(), new NatGatewayAvailable.IsDeletedMatcher(),
                        new NatGatewayAvailable.IsNatGatewayNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VpcExists waiter by using custom parameters waiterParameters and other parameters defined in the waiters
     * specification, and then polls until it determines whether the resource entered the desired state or not, where
     * polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVpcsRequest> vpcExists() {

        return new WaiterBuilder<DescribeVpcsRequest, DescribeVpcsResult>().withSdkFunction(new DescribeVpcsFunction(client))
                .withAcceptors(new HttpSuccessStatusAcceptor(WaiterState.SUCCESS), new VpcExists.IsInvalidVpcIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(5), new FixedDelayStrategy(1)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ConversionTaskDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeConversionTasksRequest> conversionTaskDeleted() {

        return new WaiterBuilder<DescribeConversionTasksRequest, DescribeConversionTasksResult>().withSdkFunction(new DescribeConversionTasksFunction(client))
                .withAcceptors(new ConversionTaskDeleted.IsDeletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ImageExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeImagesRequest> imageExists() {

        return new WaiterBuilder<DescribeImagesRequest, DescribeImagesResult>().withSdkFunction(new DescribeImagesFunction(client))
                .withAcceptors(new ImageExists.IsTrueMatcher(), new ImageExists.IsInvalidAMIIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VpcAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVpcsRequest> vpcAvailable() {

        return new WaiterBuilder<DescribeVpcsRequest, DescribeVpcsResult>().withSdkFunction(new DescribeVpcsFunction(client))
                .withAcceptors(new VpcAvailable.IsAvailableMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VpcPeeringConnectionDeleted waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVpcPeeringConnectionsRequest> vpcPeeringConnectionDeleted() {

        return new WaiterBuilder<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult>()
                .withSdkFunction(new DescribeVpcPeeringConnectionsFunction(client))
                .withAcceptors(new VpcPeeringConnectionDeleted.IsDeletedMatcher(),
                        new VpcPeeringConnectionDeleted.IsInvalidVpcPeeringConnectionIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ConversionTaskCancelled waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeConversionTasksRequest> conversionTaskCancelled() {

        return new WaiterBuilder<DescribeConversionTasksRequest, DescribeConversionTasksResult>().withSdkFunction(new DescribeConversionTasksFunction(client))
                .withAcceptors(new ConversionTaskCancelled.IsCancelledMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstancesRequest> instanceExists() {

        return new WaiterBuilder<DescribeInstancesRequest, DescribeInstancesResult>().withSdkFunction(new DescribeInstancesFunction(client))
                .withAcceptors(new InstanceExists.IsTrueMatcher(), new InstanceExists.IsInvalidInstanceIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceTerminated waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstancesRequest> instanceTerminated() {

        return new WaiterBuilder<DescribeInstancesRequest, DescribeInstancesResult>()
                .withSdkFunction(new DescribeInstancesFunction(client))
                .withAcceptors(new InstanceTerminated.IsTerminatedMatcher(), new InstanceTerminated.IsPendingMatcher(),
                        new InstanceTerminated.IsStoppingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ConversionTaskCompleted waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeConversionTasksRequest> conversionTaskCompleted() {

        return new WaiterBuilder<DescribeConversionTasksRequest, DescribeConversionTasksResult>()
                .withSdkFunction(new DescribeConversionTasksFunction(client))
                .withAcceptors(new ConversionTaskCompleted.IsCompletedMatcher(), new ConversionTaskCompleted.IsCancelledMatcher(),
                        new ConversionTaskCompleted.IsCancellingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a KeyPairExists waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeKeyPairsRequest> keyPairExists() {

        return new WaiterBuilder<DescribeKeyPairsRequest, DescribeKeyPairsResult>().withSdkFunction(new DescribeKeyPairsFunction(client))
                .withAcceptors(new KeyPairExists.IsTrueMatcher(), new KeyPairExists.IsInvalidKeyPairNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(6), new FixedDelayStrategy(5)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a SpotInstanceRequestFulfilled waiter by using custom parameters waiterParameters and other parameters
     * defined in the waiters specification, and then polls until it determines whether the resource entered the desired
     * state or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeSpotInstanceRequestsRequest> spotInstanceRequestFulfilled() {

        return new WaiterBuilder<DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult>()
                .withSdkFunction(new DescribeSpotInstanceRequestsFunction(client))
                .withAcceptors(new SpotInstanceRequestFulfilled.IsFulfilledMatcher(),
                        new SpotInstanceRequestFulfilled.IsRequestcanceledandinstancerunningMatcher(),
                        new SpotInstanceRequestFulfilled.IsScheduleexpiredMatcher(), new SpotInstanceRequestFulfilled.IsCanceledbeforefulfillmentMatcher(),
                        new SpotInstanceRequestFulfilled.IsBadparametersMatcher(), new SpotInstanceRequestFulfilled.IsSystemerrorMatcher(),
                        new SpotInstanceRequestFulfilled.IsInvalidSpotInstanceRequestIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a BundleTaskComplete waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeBundleTasksRequest> bundleTaskComplete() {

        return new WaiterBuilder<DescribeBundleTasksRequest, DescribeBundleTasksResult>().withSdkFunction(new DescribeBundleTasksFunction(client))
                .withAcceptors(new BundleTaskComplete.IsCompleteMatcher(), new BundleTaskComplete.IsFailedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceRunning waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstancesRequest> instanceRunning() {

        return new WaiterBuilder<DescribeInstancesRequest, DescribeInstancesResult>()
                .withSdkFunction(new DescribeInstancesFunction(client))
                .withAcceptors(new InstanceRunning.IsRunningMatcher(), new InstanceRunning.IsShuttingdownMatcher(), new InstanceRunning.IsTerminatedMatcher(),
                        new InstanceRunning.IsStoppingMatcher(), new InstanceRunning.IsInvalidInstanceIDNotFoundMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ExportTaskCompleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeExportTasksRequest> exportTaskCompleted() {

        return new WaiterBuilder<DescribeExportTasksRequest, DescribeExportTasksResult>().withSdkFunction(new DescribeExportTasksFunction(client))
                .withAcceptors(new ExportTaskCompleted.IsCompletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a SnapshotCompleted waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeSnapshotsRequest> snapshotCompleted() {

        return new WaiterBuilder<DescribeSnapshotsRequest, DescribeSnapshotsResult>().withSdkFunction(new DescribeSnapshotsFunction(client))
                .withAcceptors(new SnapshotCompleted.IsCompletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a ExportTaskCancelled waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeExportTasksRequest> exportTaskCancelled() {

        return new WaiterBuilder<DescribeExportTasksRequest, DescribeExportTasksResult>().withSdkFunction(new DescribeExportTasksFunction(client))
                .withAcceptors(new ExportTaskCancelled.IsCancelledMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VpnConnectionDeleted waiter by using custom parameters waiterParameters and other parameters defined in
     * the waiters specification, and then polls until it determines whether the resource entered the desired state or
     * not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVpnConnectionsRequest> vpnConnectionDeleted() {

        return new WaiterBuilder<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult>().withSdkFunction(new DescribeVpnConnectionsFunction(client))
                .withAcceptors(new VpnConnectionDeleted.IsDeletedMatcher(), new VpnConnectionDeleted.IsPendingMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a VpnConnectionAvailable waiter by using custom parameters waiterParameters and other parameters defined
     * in the waiters specification, and then polls until it determines whether the resource entered the desired state
     * or not, where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeVpnConnectionsRequest> vpnConnectionAvailable() {

        return new WaiterBuilder<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult>()
                .withSdkFunction(new DescribeVpnConnectionsFunction(client))
                .withAcceptors(new VpnConnectionAvailable.IsAvailableMatcher(), new VpnConnectionAvailable.IsDeletingMatcher(),
                        new VpnConnectionAvailable.IsDeletedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a InstanceStopped waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeInstancesRequest> instanceStopped() {

        return new WaiterBuilder<DescribeInstancesRequest, DescribeInstancesResult>().withSdkFunction(new DescribeInstancesFunction(client))
                .withAcceptors(new InstanceStopped.IsStoppedMatcher(), new InstanceStopped.IsPendingMatcher(), new InstanceStopped.IsTerminatedMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    /**
     * Builds a SubnetAvailable waiter by using custom parameters waiterParameters and other parameters defined in the
     * waiters specification, and then polls until it determines whether the resource entered the desired state or not,
     * where polling criteria is bound by either default polling strategy or custom polling strategy.
     */
    public Waiter<DescribeSubnetsRequest> subnetAvailable() {

        return new WaiterBuilder<DescribeSubnetsRequest, DescribeSubnetsResult>().withSdkFunction(new DescribeSubnetsFunction(client))
                .withAcceptors(new SubnetAvailable.IsAvailableMatcher())
                .withDefaultPollingStrategy(new PollingStrategy(new MaxAttemptsRetryStrategy(40), new FixedDelayStrategy(15)))
                .withExecutorService(executorService).build();
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
