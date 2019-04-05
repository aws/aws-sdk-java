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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information for an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EndpointSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * A timestamp that shows when the endpoint was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the endpoint was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled
     * until it has completed. This maintenance operation does not change any customer-specified values such as VPC
     * config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the process
     * of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to an endpoint that has autoscaling enabled
     * and is undergoing variant weight or capacity changes as part of an <a>UpdateEndpointWeightsAndCapacities</a> call
     * or when the <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     * <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a> filter.
     * </p>
     */
    private String endpointStatus;

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSummary withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSummary withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the endpoint was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was created.
     * </p>
     * 
     * @return A timestamp that shows when the endpoint was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that shows when the endpoint was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was last modified.
     * </p>
     * 
     * @return A timestamp that shows when the endpoint was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * A timestamp that shows when the endpoint was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        A timestamp that shows when the endpoint was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled
     * until it has completed. This maintenance operation does not change any customer-specified values such as VPC
     * config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the process
     * of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to an endpoint that has autoscaling enabled
     * and is undergoing variant weight or capacity changes as part of an <a>UpdateEndpointWeightsAndCapacities</a> call
     * or when the <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     * <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a> filter.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or
     *        re-scaled until it has completed. This maintenance operation does not change any customer-specified values
     *        such as VPC config, KMS encryption, model, instance type, or instance count.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the
     *        process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an
     *        <code>InService</code> status. This transitional status only applies to an endpoint that has autoscaling
     *        enabled and is undergoing variant weight or capacity changes as part of an
     *        <a>UpdateEndpointWeightsAndCapacities</a> call or when the <a>UpdateEndpointWeightsAndCapacities</a>
     *        operation is called explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code>: Endpoint is available to process incoming requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     *        <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is
     *        the only operation that can be performed on a failed endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a> filter.
     * @see EndpointStatus
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled
     * until it has completed. This maintenance operation does not change any customer-specified values such as VPC
     * config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the process
     * of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to an endpoint that has autoscaling enabled
     * and is undergoing variant weight or capacity changes as part of an <a>UpdateEndpointWeightsAndCapacities</a> call
     * or when the <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     * <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a> filter.
     * </p>
     * 
     * @return The status of the endpoint.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or
     *         re-scaled until it has completed. This maintenance operation does not change any customer-specified
     *         values such as VPC config, KMS encryption, model, instance type, or instance count.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the
     *         process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to
     *         an <code>InService</code> status. This transitional status only applies to an endpoint that has
     *         autoscaling enabled and is undergoing variant weight or capacity changes as part of an
     *         <a>UpdateEndpointWeightsAndCapacities</a> call or when the <a>UpdateEndpointWeightsAndCapacities</a>
     *         operation is called explicitly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InService</code>: Endpoint is available to process incoming requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     *         <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is
     *         the only operation that can be performed on a failed endpoint.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a>
     *         filter.
     * @see EndpointStatus
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled
     * until it has completed. This maintenance operation does not change any customer-specified values such as VPC
     * config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the process
     * of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to an endpoint that has autoscaling enabled
     * and is undergoing variant weight or capacity changes as part of an <a>UpdateEndpointWeightsAndCapacities</a> call
     * or when the <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     * <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a> filter.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or
     *        re-scaled until it has completed. This maintenance operation does not change any customer-specified values
     *        such as VPC config, KMS encryption, model, instance type, or instance count.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the
     *        process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an
     *        <code>InService</code> status. This transitional status only applies to an endpoint that has autoscaling
     *        enabled and is undergoing variant weight or capacity changes as part of an
     *        <a>UpdateEndpointWeightsAndCapacities</a> call or when the <a>UpdateEndpointWeightsAndCapacities</a>
     *        operation is called explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code>: Endpoint is available to process incoming requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     *        <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is
     *        the only operation that can be performed on a failed endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a> filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointSummary withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled
     * until it has completed. This maintenance operation does not change any customer-specified values such as VPC
     * config, KMS encryption, model, instance type, or instance count.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the process
     * of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an
     * <code>InService</code> status. This transitional status only applies to an endpoint that has autoscaling enabled
     * and is undergoing variant weight or capacity changes as part of an <a>UpdateEndpointWeightsAndCapacities</a> call
     * or when the <a>UpdateEndpointWeightsAndCapacities</a> operation is called explicitly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code>: Endpoint is available to process incoming requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     * <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is the only
     * operation that can be performed on a failed endpoint.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a> filter.
     * </p>
     * 
     * @param endpointStatus
     *        The status of the endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>OutOfService</code>: Endpoint is not available to take incoming requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Creating</code>: <a>CreateEndpoint</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code>: <a>UpdateEndpoint</a> or <a>UpdateEndpointWeightsAndCapacities</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SystemUpdating</code>: Endpoint is undergoing maintenance and cannot be updated or deleted or
     *        re-scaled until it has completed. This maintenance operation does not change any customer-specified values
     *        such as VPC config, KMS encryption, model, instance type, or instance count.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RollingBack</code>: Endpoint fails to scale up or down or change its variant weight and is in the
     *        process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an
     *        <code>InService</code> status. This transitional status only applies to an endpoint that has autoscaling
     *        enabled and is undergoing variant weight or capacity changes as part of an
     *        <a>UpdateEndpointWeightsAndCapacities</a> call or when the <a>UpdateEndpointWeightsAndCapacities</a>
     *        operation is called explicitly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code>: Endpoint is available to process incoming requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: <a>DeleteEndpoint</a> is executing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: Endpoint could not be created, updated, or re-scaled. Use
     *        <a>DescribeEndpointOutput$FailureReason</a> for information about the failure. <a>DeleteEndpoint</a> is
     *        the only operation that can be performed on a failed endpoint.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get a list of endpoints with a specified status, use the <a>ListEndpointsInput$StatusEquals</a> filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointSummary withEndpointStatus(EndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: ").append(getEndpointStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointSummary == false)
            return false;
        EndpointSummary other = (EndpointSummary) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        return hashCode;
    }

    @Override
    public EndpointSummary clone() {
        try {
            return (EndpointSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
