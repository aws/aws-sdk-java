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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The user-defined preferences that will be applied when updating a provisioned product. Not all preferences are
 * applicable to all provisioned product types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/UpdateProvisioningPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateProvisioningPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint. To get
     * the list of accounts in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     * </p>
     */
    private java.util.List<String> stackSetAccounts;
    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To get the
     * list of regions in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     * </p>
     */
    private java.util.List<String> stackSetRegions;
    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the
     * operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * The default value is <code>0</code> if no value is specified.
     * </p>
     */
    private Integer stackSetFailureToleranceCount;
    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops
     * the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the
     * next whole number.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     */
    private Integer stackSetFailureTolerancePercentage;
    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of
     * <code>StackSetFailureToleranceCount</code>. <code>StackSetMaxConcurrentCount</code> is at most one more than the
     * <code>StackSetFailureToleranceCount</code>.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     */
    private Integer stackSetMaxConcurrencyCount;
    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the
     * next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS
     * Service Catalog sets the number as <code>1</code> instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     */
    private Integer stackSetMaxConcurrencyPercentage;
    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     * provisioned product. The default value is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the provisioned product. In this case, only new
     * stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID are passed,
     * they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned product.
     * </p>
     * </dd>
     * </dl>
     */
    private String stackSetOperationType;

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint. To get
     * the list of accounts in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     * </p>
     * 
     * @return One or more AWS accounts that will have access to the provisioned product.</p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *         </p>
     *         <p>
     *         The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint.
     *         To get the list of accounts in the <code>STACKSET</code> constraint, use the
     *         <code>DescribeProvisioningParameters</code> operation.
     *         </p>
     *         <p>
     *         If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     */

    public java.util.List<String> getStackSetAccounts() {
        return stackSetAccounts;
    }

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint. To get
     * the list of accounts in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     * </p>
     * 
     * @param stackSetAccounts
     *        One or more AWS accounts that will have access to the provisioned product.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint.
     *        To get the list of accounts in the <code>STACKSET</code> constraint, use the
     *        <code>DescribeProvisioningParameters</code> operation.
     *        </p>
     *        <p>
     *        If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     */

    public void setStackSetAccounts(java.util.Collection<String> stackSetAccounts) {
        if (stackSetAccounts == null) {
            this.stackSetAccounts = null;
            return;
        }

        this.stackSetAccounts = new java.util.ArrayList<String>(stackSetAccounts);
    }

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint. To get
     * the list of accounts in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackSetAccounts(java.util.Collection)} or {@link #withStackSetAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stackSetAccounts
     *        One or more AWS accounts that will have access to the provisioned product.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint.
     *        To get the list of accounts in the <code>STACKSET</code> constraint, use the
     *        <code>DescribeProvisioningParameters</code> operation.
     *        </p>
     *        <p>
     *        If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningPreferences withStackSetAccounts(String... stackSetAccounts) {
        if (this.stackSetAccounts == null) {
            setStackSetAccounts(new java.util.ArrayList<String>(stackSetAccounts.length));
        }
        for (String ele : stackSetAccounts) {
            this.stackSetAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint. To get
     * the list of accounts in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     * </p>
     * 
     * @param stackSetAccounts
     *        One or more AWS accounts that will have access to the provisioned product.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        The AWS accounts specified should be within the list of accounts in the <code>STACKSET</code> constraint.
     *        To get the list of accounts in the <code>STACKSET</code> constraint, use the
     *        <code>DescribeProvisioningParameters</code> operation.
     *        </p>
     *        <p>
     *        If no values are specified, the default value is all accounts from the <code>STACKSET</code> constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningPreferences withStackSetAccounts(java.util.Collection<String> stackSetAccounts) {
        setStackSetAccounts(stackSetAccounts);
        return this;
    }

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To get the
     * list of regions in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     * </p>
     * 
     * @return One or more AWS Regions where the provisioned product will be available.</p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *         </p>
     *         <p>
     *         The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To
     *         get the list of regions in the <code>STACKSET</code> constraint, use the
     *         <code>DescribeProvisioningParameters</code> operation.
     *         </p>
     *         <p>
     *         If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     */

    public java.util.List<String> getStackSetRegions() {
        return stackSetRegions;
    }

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To get the
     * list of regions in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     * </p>
     * 
     * @param stackSetRegions
     *        One or more AWS Regions where the provisioned product will be available.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To
     *        get the list of regions in the <code>STACKSET</code> constraint, use the
     *        <code>DescribeProvisioningParameters</code> operation.
     *        </p>
     *        <p>
     *        If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     */

    public void setStackSetRegions(java.util.Collection<String> stackSetRegions) {
        if (stackSetRegions == null) {
            this.stackSetRegions = null;
            return;
        }

        this.stackSetRegions = new java.util.ArrayList<String>(stackSetRegions);
    }

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To get the
     * list of regions in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackSetRegions(java.util.Collection)} or {@link #withStackSetRegions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stackSetRegions
     *        One or more AWS Regions where the provisioned product will be available.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To
     *        get the list of regions in the <code>STACKSET</code> constraint, use the
     *        <code>DescribeProvisioningParameters</code> operation.
     *        </p>
     *        <p>
     *        If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningPreferences withStackSetRegions(String... stackSetRegions) {
        if (this.stackSetRegions == null) {
            setStackSetRegions(new java.util.ArrayList<String>(stackSetRegions.length));
        }
        for (String ele : stackSetRegions) {
            this.stackSetRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To get the
     * list of regions in the <code>STACKSET</code> constraint, use the <code>DescribeProvisioningParameters</code>
     * operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     * </p>
     * 
     * @param stackSetRegions
     *        One or more AWS Regions where the provisioned product will be available.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        The specified regions should be within the list of regions from the <code>STACKSET</code> constraint. To
     *        get the list of regions in the <code>STACKSET</code> constraint, use the
     *        <code>DescribeProvisioningParameters</code> operation.
     *        </p>
     *        <p>
     *        If no values are specified, the default value is all regions from the <code>STACKSET</code> constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningPreferences withStackSetRegions(java.util.Collection<String> stackSetRegions) {
        setStackSetRegions(stackSetRegions);
        return this;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the
     * operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * The default value is <code>0</code> if no value is specified.
     * </p>
     * 
     * @param stackSetFailureToleranceCount
     *        The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the
     *        operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     *        operation in any subsequent regions.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     *        <code>StackSetFailureTolerancePercentage</code>, but not both.
     *        </p>
     *        <p>
     *        The default value is <code>0</code> if no value is specified.
     */

    public void setStackSetFailureToleranceCount(Integer stackSetFailureToleranceCount) {
        this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the
     * operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * The default value is <code>0</code> if no value is specified.
     * </p>
     * 
     * @return The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops
     *         the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't
     *         attempt the operation in any subsequent regions.</p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     *         <code>StackSetFailureTolerancePercentage</code>, but not both.
     *         </p>
     *         <p>
     *         The default value is <code>0</code> if no value is specified.
     */

    public Integer getStackSetFailureToleranceCount() {
        return this.stackSetFailureToleranceCount;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the
     * operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * The default value is <code>0</code> if no value is specified.
     * </p>
     * 
     * @param stackSetFailureToleranceCount
     *        The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the
     *        operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     *        operation in any subsequent regions.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     *        <code>StackSetFailureTolerancePercentage</code>, but not both.
     *        </p>
     *        <p>
     *        The default value is <code>0</code> if no value is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningPreferences withStackSetFailureToleranceCount(Integer stackSetFailureToleranceCount) {
        setStackSetFailureToleranceCount(stackSetFailureToleranceCount);
        return this;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops
     * the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the
     * next whole number.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * 
     * @param stackSetFailureTolerancePercentage
     *        The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog
     *        stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't
     *        attempt the operation in any subsequent regions.</p>
     *        <p>
     *        When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down
     *        to the next whole number.
     *        </p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     *        <code>StackSetFailureTolerancePercentage</code>, but not both.
     */

    public void setStackSetFailureTolerancePercentage(Integer stackSetFailureTolerancePercentage) {
        this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops
     * the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the
     * next whole number.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * 
     * @return The percentage of accounts, per region, for which this stack operation can fail before AWS Service
     *         Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog
     *         doesn't attempt the operation in any subsequent regions.</p>
     *         <p>
     *         When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds
     *         down to the next whole number.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     *         <code>StackSetFailureTolerancePercentage</code>, but not both.
     */

    public Integer getStackSetFailureTolerancePercentage() {
        return this.stackSetFailureTolerancePercentage;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops
     * the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the
     * next whole number.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * 
     * @param stackSetFailureTolerancePercentage
     *        The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog
     *        stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't
     *        attempt the operation in any subsequent regions.</p>
     *        <p>
     *        When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down
     *        to the next whole number.
     *        </p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>StackSetFailureToleranceCount</code> or
     *        <code>StackSetFailureTolerancePercentage</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningPreferences withStackSetFailureTolerancePercentage(Integer stackSetFailureTolerancePercentage) {
        setStackSetFailureTolerancePercentage(stackSetFailureTolerancePercentage);
        return this;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of
     * <code>StackSetFailureToleranceCount</code>. <code>StackSetMaxConcurrentCount</code> is at most one more than the
     * <code>StackSetFailureToleranceCount</code>.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * 
     * @param stackSetMaxConcurrencyCount
     *        The maximum number of accounts in which to perform this operation at one time. This is dependent on the
     *        value of <code>StackSetFailureToleranceCount</code>. <code>StackSetMaxConcurrentCount</code> is at most
     *        one more than the <code>StackSetFailureToleranceCount</code>.</p>
     *        <p>
     *        Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     *        circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *        throttling.
     *        </p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     *        <code>StackSetMaxConcurrentPercentage</code>, but not both.
     */

    public void setStackSetMaxConcurrencyCount(Integer stackSetMaxConcurrencyCount) {
        this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of
     * <code>StackSetFailureToleranceCount</code>. <code>StackSetMaxConcurrentCount</code> is at most one more than the
     * <code>StackSetFailureToleranceCount</code>.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * 
     * @return The maximum number of accounts in which to perform this operation at one time. This is dependent on the
     *         value of <code>StackSetFailureToleranceCount</code>. <code>StackSetMaxConcurrentCount</code> is at most
     *         one more than the <code>StackSetFailureToleranceCount</code>.</p>
     *         <p>
     *         Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     *         circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *         throttling.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     *         <code>StackSetMaxConcurrentPercentage</code>, but not both.
     */

    public Integer getStackSetMaxConcurrencyCount() {
        return this.stackSetMaxConcurrencyCount;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of
     * <code>StackSetFailureToleranceCount</code>. <code>StackSetMaxConcurrentCount</code> is at most one more than the
     * <code>StackSetFailureToleranceCount</code>.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * 
     * @param stackSetMaxConcurrencyCount
     *        The maximum number of accounts in which to perform this operation at one time. This is dependent on the
     *        value of <code>StackSetFailureToleranceCount</code>. <code>StackSetMaxConcurrentCount</code> is at most
     *        one more than the <code>StackSetFailureToleranceCount</code>.</p>
     *        <p>
     *        Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     *        circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *        throttling.
     *        </p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     *        <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningPreferences withStackSetMaxConcurrencyCount(Integer stackSetMaxConcurrencyCount) {
        setStackSetMaxConcurrencyCount(stackSetMaxConcurrencyCount);
        return this;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the
     * next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS
     * Service Catalog sets the number as <code>1</code> instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * 
     * @param stackSetMaxConcurrencyPercentage
     *        The maximum percentage of accounts in which to perform this operation at one time.</p>
     *        <p>
     *        When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down
     *        to the next whole number. This is true except in cases where rounding down would result is zero. In this
     *        case, AWS Service Catalog sets the number as <code>1</code> instead.
     *        </p>
     *        <p>
     *        Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     *        circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *        throttling.
     *        </p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     *        <code>StackSetMaxConcurrentPercentage</code>, but not both.
     */

    public void setStackSetMaxConcurrencyPercentage(Integer stackSetMaxConcurrencyPercentage) {
        this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the
     * next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS
     * Service Catalog sets the number as <code>1</code> instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * 
     * @return The maximum percentage of accounts in which to perform this operation at one time.</p>
     *         <p>
     *         When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds
     *         down to the next whole number. This is true except in cases where rounding down would result is zero. In
     *         this case, AWS Service Catalog sets the number as <code>1</code> instead.
     *         </p>
     *         <p>
     *         Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     *         circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *         throttling.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     *         <code>StackSetMaxConcurrentPercentage</code>, but not both.
     */

    public Integer getStackSetMaxConcurrencyPercentage() {
        return this.stackSetMaxConcurrencyPercentage;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the
     * next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS
     * Service Catalog sets the number as <code>1</code> instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     * circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * 
     * @param stackSetMaxConcurrencyPercentage
     *        The maximum percentage of accounts in which to perform this operation at one time.</p>
     *        <p>
     *        When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down
     *        to the next whole number. This is true except in cases where rounding down would result is zero. In this
     *        case, AWS Service Catalog sets the number as <code>1</code> instead.
     *        </p>
     *        <p>
     *        Note that this setting lets you specify the maximum for operations. For large deployments, under certain
     *        circumstances the actual number of accounts acted upon concurrently may be lower due to service
     *        throttling.
     *        </p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <p>
     *        Conditional: You must specify either <code>StackSetMaxConcurrentCount</code> or
     *        <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateProvisioningPreferences withStackSetMaxConcurrencyPercentage(Integer stackSetMaxConcurrencyPercentage) {
        setStackSetMaxConcurrencyPercentage(stackSetMaxConcurrencyPercentage);
        return this;
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     * provisioned product. The default value is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the provisioned product. In this case, only new
     * stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID are passed,
     * they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned product.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param stackSetOperationType
     *        Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     *        provisioned product. The default value is <code>UPDATE</code> if nothing is specified.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <dl>
     *        <dt>CREATE</dt>
     *        <dd>
     *        <p>
     *        Creates a new stack instance in the stack set represented by the provisioned product. In this case, only
     *        new stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID
     *        are passed, they will be ignored.
     *        </p>
     *        </dd>
     *        <dt>UPDATE</dt>
     *        <dd>
     *        <p>
     *        Updates the stack set represented by the provisioned product and also its stack instances.
     *        </p>
     *        </dd>
     *        <dt>DELETE</dt>
     *        <dd>
     *        <p>
     *        Deletes a stack instance in the stack set represented by the provisioned product.
     *        </p>
     *        </dd>
     * @see StackSetOperationType
     */

    public void setStackSetOperationType(String stackSetOperationType) {
        this.stackSetOperationType = stackSetOperationType;
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     * provisioned product. The default value is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the provisioned product. In this case, only new
     * stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID are passed,
     * they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned product.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     *         provisioned product. The default value is <code>UPDATE</code> if nothing is specified.</p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *         </p>
     *         <dl>
     *         <dt>CREATE</dt>
     *         <dd>
     *         <p>
     *         Creates a new stack instance in the stack set represented by the provisioned product. In this case, only
     *         new stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID
     *         are passed, they will be ignored.
     *         </p>
     *         </dd>
     *         <dt>UPDATE</dt>
     *         <dd>
     *         <p>
     *         Updates the stack set represented by the provisioned product and also its stack instances.
     *         </p>
     *         </dd>
     *         <dt>DELETE</dt>
     *         <dd>
     *         <p>
     *         Deletes a stack instance in the stack set represented by the provisioned product.
     *         </p>
     *         </dd>
     * @see StackSetOperationType
     */

    public String getStackSetOperationType() {
        return this.stackSetOperationType;
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     * provisioned product. The default value is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the provisioned product. In this case, only new
     * stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID are passed,
     * they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned product.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param stackSetOperationType
     *        Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     *        provisioned product. The default value is <code>UPDATE</code> if nothing is specified.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <dl>
     *        <dt>CREATE</dt>
     *        <dd>
     *        <p>
     *        Creates a new stack instance in the stack set represented by the provisioned product. In this case, only
     *        new stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID
     *        are passed, they will be ignored.
     *        </p>
     *        </dd>
     *        <dt>UPDATE</dt>
     *        <dd>
     *        <p>
     *        Updates the stack set represented by the provisioned product and also its stack instances.
     *        </p>
     *        </dd>
     *        <dt>DELETE</dt>
     *        <dd>
     *        <p>
     *        Deletes a stack instance in the stack set represented by the provisioned product.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationType
     */

    public UpdateProvisioningPreferences withStackSetOperationType(String stackSetOperationType) {
        setStackSetOperationType(stackSetOperationType);
        return this;
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     * provisioned product. The default value is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the provisioned product. In this case, only new
     * stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID are passed,
     * they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned product.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param stackSetOperationType
     *        Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the
     *        provisioned product. The default value is <code>UPDATE</code> if nothing is specified.</p>
     *        <p>
     *        Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     *        </p>
     *        <dl>
     *        <dt>CREATE</dt>
     *        <dd>
     *        <p>
     *        Creates a new stack instance in the stack set represented by the provisioned product. In this case, only
     *        new stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID
     *        are passed, they will be ignored.
     *        </p>
     *        </dd>
     *        <dt>UPDATE</dt>
     *        <dd>
     *        <p>
     *        Updates the stack set represented by the provisioned product and also its stack instances.
     *        </p>
     *        </dd>
     *        <dt>DELETE</dt>
     *        <dd>
     *        <p>
     *        Deletes a stack instance in the stack set represented by the provisioned product.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationType
     */

    public UpdateProvisioningPreferences withStackSetOperationType(StackSetOperationType stackSetOperationType) {
        this.stackSetOperationType = stackSetOperationType.toString();
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
        if (getStackSetAccounts() != null)
            sb.append("StackSetAccounts: ").append(getStackSetAccounts()).append(",");
        if (getStackSetRegions() != null)
            sb.append("StackSetRegions: ").append(getStackSetRegions()).append(",");
        if (getStackSetFailureToleranceCount() != null)
            sb.append("StackSetFailureToleranceCount: ").append(getStackSetFailureToleranceCount()).append(",");
        if (getStackSetFailureTolerancePercentage() != null)
            sb.append("StackSetFailureTolerancePercentage: ").append(getStackSetFailureTolerancePercentage()).append(",");
        if (getStackSetMaxConcurrencyCount() != null)
            sb.append("StackSetMaxConcurrencyCount: ").append(getStackSetMaxConcurrencyCount()).append(",");
        if (getStackSetMaxConcurrencyPercentage() != null)
            sb.append("StackSetMaxConcurrencyPercentage: ").append(getStackSetMaxConcurrencyPercentage()).append(",");
        if (getStackSetOperationType() != null)
            sb.append("StackSetOperationType: ").append(getStackSetOperationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisioningPreferences == false)
            return false;
        UpdateProvisioningPreferences other = (UpdateProvisioningPreferences) obj;
        if (other.getStackSetAccounts() == null ^ this.getStackSetAccounts() == null)
            return false;
        if (other.getStackSetAccounts() != null && other.getStackSetAccounts().equals(this.getStackSetAccounts()) == false)
            return false;
        if (other.getStackSetRegions() == null ^ this.getStackSetRegions() == null)
            return false;
        if (other.getStackSetRegions() != null && other.getStackSetRegions().equals(this.getStackSetRegions()) == false)
            return false;
        if (other.getStackSetFailureToleranceCount() == null ^ this.getStackSetFailureToleranceCount() == null)
            return false;
        if (other.getStackSetFailureToleranceCount() != null
                && other.getStackSetFailureToleranceCount().equals(this.getStackSetFailureToleranceCount()) == false)
            return false;
        if (other.getStackSetFailureTolerancePercentage() == null ^ this.getStackSetFailureTolerancePercentage() == null)
            return false;
        if (other.getStackSetFailureTolerancePercentage() != null
                && other.getStackSetFailureTolerancePercentage().equals(this.getStackSetFailureTolerancePercentage()) == false)
            return false;
        if (other.getStackSetMaxConcurrencyCount() == null ^ this.getStackSetMaxConcurrencyCount() == null)
            return false;
        if (other.getStackSetMaxConcurrencyCount() != null && other.getStackSetMaxConcurrencyCount().equals(this.getStackSetMaxConcurrencyCount()) == false)
            return false;
        if (other.getStackSetMaxConcurrencyPercentage() == null ^ this.getStackSetMaxConcurrencyPercentage() == null)
            return false;
        if (other.getStackSetMaxConcurrencyPercentage() != null
                && other.getStackSetMaxConcurrencyPercentage().equals(this.getStackSetMaxConcurrencyPercentage()) == false)
            return false;
        if (other.getStackSetOperationType() == null ^ this.getStackSetOperationType() == null)
            return false;
        if (other.getStackSetOperationType() != null && other.getStackSetOperationType().equals(this.getStackSetOperationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetAccounts() == null) ? 0 : getStackSetAccounts().hashCode());
        hashCode = prime * hashCode + ((getStackSetRegions() == null) ? 0 : getStackSetRegions().hashCode());
        hashCode = prime * hashCode + ((getStackSetFailureToleranceCount() == null) ? 0 : getStackSetFailureToleranceCount().hashCode());
        hashCode = prime * hashCode + ((getStackSetFailureTolerancePercentage() == null) ? 0 : getStackSetFailureTolerancePercentage().hashCode());
        hashCode = prime * hashCode + ((getStackSetMaxConcurrencyCount() == null) ? 0 : getStackSetMaxConcurrencyCount().hashCode());
        hashCode = prime * hashCode + ((getStackSetMaxConcurrencyPercentage() == null) ? 0 : getStackSetMaxConcurrencyPercentage().hashCode());
        hashCode = prime * hashCode + ((getStackSetOperationType() == null) ? 0 : getStackSetOperationType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateProvisioningPreferences clone() {
        try {
            return (UpdateProvisioningPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.UpdateProvisioningPreferencesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
