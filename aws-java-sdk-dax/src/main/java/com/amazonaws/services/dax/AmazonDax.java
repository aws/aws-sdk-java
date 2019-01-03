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
package com.amazonaws.services.dax;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.dax.model.*;

/**
 * Interface for accessing Amazon DAX.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.dax.AbstractAmazonDax} instead.
 * </p>
 * <p>
 * <p>
 * DAX is a managed caching service engineered for Amazon DynamoDB. DAX dramatically speeds up database reads by caching
 * frequently-accessed data from DynamoDB, so applications can access that data with sub-millisecond latency. You can
 * create a DAX cluster easily, using the AWS Management Console. With a few simple modifications to your code, your
 * application can begin taking advantage of the DAX cluster and realize significant improvements in read performance.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDax {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "dax";

    /**
     * <p>
     * Creates a DAX cluster. All nodes in the cluster run the same DAX caching software.
     * </p>
     * 
     * @param createClusterRequest
     * @return Result of the CreateCluster operation returned by the service.
     * @throws ClusterAlreadyExistsException
     *         You already have a DAX cluster with the given identifier.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws InsufficientClusterCapacityException
     *         There are not enough system resources to create the cluster you requested (or to resize an
     *         already-existing cluster).
     * @throws SubnetGroupNotFoundException
     *         The requested subnet group name does not refer to an existing subnet group.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ClusterQuotaForCustomerExceededException
     *         You have attempted to exceed the maximum number of DAX clusters for your AWS account.
     * @throws NodeQuotaForClusterExceededException
     *         You have attempted to exceed the maximum number of nodes for a DAX cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         You have attempted to exceed the maximum number of nodes for your AWS account.
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws TagQuotaPerResourceExceededException
     *         You have exceeded the maximum number of tags for this DAX cluster.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.CreateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    CreateClusterResult createCluster(CreateClusterRequest createClusterRequest);

    /**
     * <p>
     * Creates a new parameter group. A parameter group is a collection of parameters that you apply to all of the nodes
     * in a DAX cluster.
     * </p>
     * 
     * @param createParameterGroupRequest
     * @return Result of the CreateParameterGroup operation returned by the service.
     * @throws ParameterGroupQuotaExceededException
     *         You have attempted to exceed the maximum number of parameter groups.
     * @throws ParameterGroupAlreadyExistsException
     *         The specified parameter group already exists.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.CreateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateParameterGroupResult createParameterGroup(CreateParameterGroupRequest createParameterGroupRequest);

    /**
     * <p>
     * Creates a new subnet group.
     * </p>
     * 
     * @param createSubnetGroupRequest
     * @return Result of the CreateSubnetGroup operation returned by the service.
     * @throws SubnetGroupAlreadyExistsException
     *         The specified subnet group already exists.
     * @throws SubnetGroupQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a subnet group.
     * @throws SubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonDax.CreateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/CreateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSubnetGroupResult createSubnetGroup(CreateSubnetGroupRequest createSubnetGroupRequest);

    /**
     * <p>
     * Removes one or more nodes from a DAX cluster.
     * </p>
     * <note>
     * <p>
     * You cannot use <code>DecreaseReplicationFactor</code> to remove the last node in a DAX cluster. If you need to do
     * this, use <code>DeleteCluster</code> instead.
     * </p>
     * </note>
     * 
     * @param decreaseReplicationFactorRequest
     * @return Result of the DecreaseReplicationFactor operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws NodeNotFoundException
     *         None of the nodes in the cluster have the given node ID.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DecreaseReplicationFactor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DecreaseReplicationFactor" target="_top">AWS
     *      API Documentation</a>
     */
    DecreaseReplicationFactorResult decreaseReplicationFactor(DecreaseReplicationFactorRequest decreaseReplicationFactorRequest);

    /**
     * <p>
     * Deletes a previously provisioned DAX cluster. <i>DeleteCluster</i> deletes all associated nodes, node endpoints
     * and the DAX cluster itself. When you receive a successful response from this action, DAX immediately begins
     * deleting the cluster; you cannot cancel or revert this action.
     * </p>
     * 
     * @param deleteClusterRequest
     * @return Result of the DeleteCluster operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DeleteCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteCluster" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteClusterResult deleteCluster(DeleteClusterRequest deleteClusterRequest);

    /**
     * <p>
     * Deletes the specified parameter group. You cannot delete a parameter group if it is associated with any DAX
     * clusters.
     * </p>
     * 
     * @param deleteParameterGroupRequest
     * @return Result of the DeleteParameterGroup operation returned by the service.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DeleteParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteParameterGroupResult deleteParameterGroup(DeleteParameterGroupRequest deleteParameterGroupRequest);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * <note>
     * <p>
     * You cannot delete a subnet group if it is associated with any DAX clusters.
     * </p>
     * </note>
     * 
     * @param deleteSubnetGroupRequest
     * @return Result of the DeleteSubnetGroup operation returned by the service.
     * @throws SubnetGroupInUseException
     *         The specified subnet group is currently in use.
     * @throws SubnetGroupNotFoundException
     *         The requested subnet group name does not refer to an existing subnet group.
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonDax.DeleteSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DeleteSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSubnetGroupResult deleteSubnetGroup(DeleteSubnetGroupRequest deleteSubnetGroupRequest);

    /**
     * <p>
     * Returns information about all provisioned DAX clusters if no cluster identifier is specified, or about a specific
     * DAX cluster if a cluster identifier is supplied.
     * </p>
     * <p>
     * If the cluster is in the CREATING state, only cluster level information will be displayed until all of the nodes
     * are successfully provisioned.
     * </p>
     * <p>
     * If the cluster is in the DELETING state, only cluster level information will be displayed.
     * </p>
     * <p>
     * If nodes are currently being added to the DAX cluster, node endpoint information and creation time for the
     * additional nodes will not be displayed until they are completely provisioned. When the DAX cluster state is
     * <i>available</i>, the cluster is ready for use.
     * </p>
     * <p>
     * If nodes are currently being removed from the DAX cluster, no endpoint information for the removed nodes is
     * displayed.
     * </p>
     * 
     * @param describeClustersRequest
     * @return Result of the DescribeClusters operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeClusters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeClustersResult describeClusters(DescribeClustersRequest describeClustersRequest);

    /**
     * <p>
     * Returns the default system parameter information for the DAX caching software.
     * </p>
     * 
     * @param describeDefaultParametersRequest
     * @return Result of the DescribeDefaultParameters operation returned by the service.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeDefaultParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeDefaultParameters" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeDefaultParametersResult describeDefaultParameters(DescribeDefaultParametersRequest describeDefaultParametersRequest);

    /**
     * <p>
     * Returns events related to DAX clusters and parameter groups. You can obtain events specific to a particular DAX
     * cluster or parameter group by providing the name as a parameter.
     * </p>
     * <p>
     * By default, only the events occurring within the last hour are returned; however, you can retrieve up to 14 days'
     * worth of events if necessary.
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns a list of parameter group descriptions. If a parameter group name is specified, the list will contain
     * only the descriptions for that group.
     * </p>
     * 
     * @param describeParameterGroupsRequest
     * @return Result of the DescribeParameterGroups operation returned by the service.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeParameterGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameterGroups" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeParameterGroupsResult describeParameterGroups(DescribeParameterGroupsRequest describeParameterGroupsRequest);

    /**
     * <p>
     * Returns the detailed parameter list for a particular parameter group.
     * </p>
     * 
     * @param describeParametersRequest
     * @return Result of the DescribeParameters operation returned by the service.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeParametersResult describeParameters(DescribeParametersRequest describeParametersRequest);

    /**
     * <p>
     * Returns a list of subnet group descriptions. If a subnet group name is specified, the list will contain only the
     * description of that group.
     * </p>
     * 
     * @param describeSubnetGroupsRequest
     * @return Result of the DescribeSubnetGroups operation returned by the service.
     * @throws SubnetGroupNotFoundException
     *         The requested subnet group name does not refer to an existing subnet group.
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonDax.DescribeSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeSubnetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSubnetGroupsResult describeSubnetGroups(DescribeSubnetGroupsRequest describeSubnetGroupsRequest);

    /**
     * <p>
     * Adds one or more nodes to a DAX cluster.
     * </p>
     * 
     * @param increaseReplicationFactorRequest
     * @return Result of the IncreaseReplicationFactor operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws InsufficientClusterCapacityException
     *         There are not enough system resources to create the cluster you requested (or to resize an
     *         already-existing cluster).
     * @throws InvalidVPCNetworkStateException
     *         The VPC network is in an invalid state.
     * @throws NodeQuotaForClusterExceededException
     *         You have attempted to exceed the maximum number of nodes for a DAX cluster.
     * @throws NodeQuotaForCustomerExceededException
     *         You have attempted to exceed the maximum number of nodes for your AWS account.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.IncreaseReplicationFactor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/IncreaseReplicationFactor" target="_top">AWS
     *      API Documentation</a>
     */
    IncreaseReplicationFactorResult increaseReplicationFactor(IncreaseReplicationFactorRequest increaseReplicationFactorRequest);

    /**
     * <p>
     * List all of the tags for a DAX cluster. You can call <code>ListTags</code> up to 10 times per second, per
     * account.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidARNException
     *         The Amazon Resource Name (ARN) supplied in the request is not valid.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Reboots a single node of a DAX cluster. The reboot action takes place as soon as possible. During the reboot, the
     * node status is set to REBOOTING.
     * </p>
     * 
     * @param rebootNodeRequest
     * @return Result of the RebootNode operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws NodeNotFoundException
     *         None of the nodes in the cluster have the given node ID.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.RebootNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/RebootNode" target="_top">AWS API
     *      Documentation</a>
     */
    RebootNodeResult rebootNode(RebootNodeRequest rebootNodeRequest);

    /**
     * <p>
     * Associates a set of tags with a DAX resource. You can call <code>TagResource</code> up to 5 times per second, per
     * account.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws TagQuotaPerResourceExceededException
     *         You have exceeded the maximum number of tags for this DAX cluster.
     * @throws InvalidARNException
     *         The Amazon Resource Name (ARN) supplied in the request is not valid.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from a DAX resource. You can call <code>UntagResource</code> up to 5 times per
     * second, per account.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidARNException
     *         The Amazon Resource Name (ARN) supplied in the request is not valid.
     * @throws TagNotFoundException
     *         The tag does not exist.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies the settings for a DAX cluster. You can use this action to change one or more cluster configuration
     * parameters by specifying the parameters and the new values.
     * </p>
     * 
     * @param updateClusterRequest
     * @return Result of the UpdateCluster operation returned by the service.
     * @throws InvalidClusterStateException
     *         The requested DAX cluster is not in the <i>available</i> state.
     * @throws ClusterNotFoundException
     *         The requested cluster ID does not refer to an existing DAX cluster.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.UpdateCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateCluster" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateClusterResult updateCluster(UpdateClusterRequest updateClusterRequest);

    /**
     * <p>
     * Modifies the parameters of a parameter group. You can modify up to 20 parameters in a single request by
     * submitting a list parameter name and value pairs.
     * </p>
     * 
     * @param updateParameterGroupRequest
     * @return Result of the UpdateParameterGroup operation returned by the service.
     * @throws InvalidParameterGroupStateException
     *         One or more parameters in a parameter group are in an invalid state.
     * @throws ParameterGroupNotFoundException
     *         The specified parameter group does not exist.
     * @throws ServiceLinkedRoleNotFoundException
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidParameterCombinationException
     *         Two or more incompatible parameters were specified.
     * @sample AmazonDax.UpdateParameterGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateParameterGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateParameterGroupResult updateParameterGroup(UpdateParameterGroupRequest updateParameterGroupRequest);

    /**
     * <p>
     * Modifies an existing subnet group.
     * </p>
     * 
     * @param updateSubnetGroupRequest
     * @return Result of the UpdateSubnetGroup operation returned by the service.
     * @throws SubnetGroupNotFoundException
     *         The requested subnet group name does not refer to an existing subnet group.
     * @throws SubnetQuotaExceededException
     *         The request cannot be processed because it would exceed the allowed number of subnets in a subnet group.
     * @throws SubnetInUseException
     *         The requested subnet is being used by another subnet group.
     * @throws InvalidSubnetException
     *         An invalid subnet identifier was specified.
     * @throws ServiceLinkedRoleNotFoundException
     * @sample AmazonDax.UpdateSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateSubnetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSubnetGroupResult updateSubnetGroup(UpdateSubnetGroupRequest updateSubnetGroupRequest);

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
