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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the endpoint.
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
     * The name of the endpoint configuration associated with this endpoint.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     * </p>
     */
    private java.util.List<ProductionVariantSummary> productionVariants;
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
     */
    private String endpointStatus;
    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, the reason why it failed.
     * </p>
     */
    private String failureReason;
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
     * Name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        Name of the endpoint.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * Name of the endpoint.
     * </p>
     * 
     * @return Name of the endpoint.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * Name of the endpoint.
     * </p>
     * 
     * @param endpointName
     *        Name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withEndpointName(String endpointName) {
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

    public DescribeEndpointResult withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint configuration associated with this endpoint.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration associated with this endpoint.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration associated with this endpoint.
     * </p>
     * 
     * @return The name of the endpoint configuration associated with this endpoint.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration associated with this endpoint.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration associated with this endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     * </p>
     * 
     * @return An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     */

    public java.util.List<ProductionVariantSummary> getProductionVariants() {
        return productionVariants;
    }

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     * </p>
     * 
     * @param productionVariants
     *        An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     */

    public void setProductionVariants(java.util.Collection<ProductionVariantSummary> productionVariants) {
        if (productionVariants == null) {
            this.productionVariants = null;
            return;
        }

        this.productionVariants = new java.util.ArrayList<ProductionVariantSummary>(productionVariants);
    }

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductionVariants(java.util.Collection)} or {@link #withProductionVariants(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param productionVariants
     *        An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withProductionVariants(ProductionVariantSummary... productionVariants) {
        if (this.productionVariants == null) {
            setProductionVariants(new java.util.ArrayList<ProductionVariantSummary>(productionVariants.length));
        }
        for (ProductionVariantSummary ele : productionVariants) {
            this.productionVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     * </p>
     * 
     * @param productionVariants
     *        An array of <a>ProductionVariantSummary</a> objects, one for each model hosted behind this endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withProductionVariants(java.util.Collection<ProductionVariantSummary> productionVariants) {
        setProductionVariants(productionVariants);
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public DescribeEndpointResult withEndpointStatus(String endpointStatus) {
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
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public DescribeEndpointResult withEndpointStatus(EndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, the reason why it failed.
     * </p>
     * 
     * @param failureReason
     *        If the status of the endpoint is <code>Failed</code>, the reason why it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, the reason why it failed.
     * </p>
     * 
     * @return If the status of the endpoint is <code>Failed</code>, the reason why it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the status of the endpoint is <code>Failed</code>, the reason why it failed.
     * </p>
     * 
     * @param failureReason
     *        If the status of the endpoint is <code>Failed</code>, the reason why it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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

    public DescribeEndpointResult withCreationTime(java.util.Date creationTime) {
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

    public DescribeEndpointResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getProductionVariants() != null)
            sb.append("ProductionVariants: ").append(getProductionVariants()).append(",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: ").append(getEndpointStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointResult == false)
            return false;
        DescribeEndpointResult other = (DescribeEndpointResult) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getProductionVariants() == null ^ this.getProductionVariants() == null)
            return false;
        if (other.getProductionVariants() != null && other.getProductionVariants().equals(this.getProductionVariants()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getProductionVariants() == null) ? 0 : getProductionVariants().hashCode());
        hashCode = prime * hashCode + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointResult clone() {
        try {
            return (DescribeEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
