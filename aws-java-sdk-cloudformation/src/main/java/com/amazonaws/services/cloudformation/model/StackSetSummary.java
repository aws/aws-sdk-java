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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The structures that contain summary information about the specified stack set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack set.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The ID of the stack set.
     * </p>
     */
    private String stackSetId;
    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the stack set.
     * </p>
     */
    private String status;
    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organizational unit (OU).
     * </p>
     */
    private AutoDeployment autoDeployment;
    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String permissionModel;
    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A
     * stack set is considered to have drifted if one or more of its stack instances have drifted from their expected
     * template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     * expected template and parameter configuration. A stack instance is considered to have drifted if one or more of
     * the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     * template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     */
    private String driftStatus;
    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be
     * <code>NULL</code> for any stack set on which drift detection has not yet been performed.
     * </p>
     */
    private java.util.Date lastDriftCheckTimestamp;

    /**
     * <p>
     * The name of the stack set.
     * </p>
     * 
     * @param stackSetName
     *        The name of the stack set.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name of the stack set.
     * </p>
     * 
     * @return The name of the stack set.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name of the stack set.
     * </p>
     * 
     * @param stackSetName
     *        The name of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetSummary withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @param stackSetId
     *        The ID of the stack set.
     */

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @return The ID of the stack set.
     */

    public String getStackSetId() {
        return this.stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @param stackSetId
     *        The ID of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetSummary withStackSetId(String stackSetId) {
        setStackSetId(stackSetId);
        return this;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @param description
     *        A description of the stack set that you specify when the stack set is created or updated.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @return A description of the stack set that you specify when the stack set is created or updated.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the stack set that you specify when the stack set is created or updated.
     * </p>
     * 
     * @param description
     *        A description of the stack set that you specify when the stack set is created or updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @see StackSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @return The status of the stack set.
     * @see StackSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetStatus
     */

    public StackSetSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @see StackSetStatus
     */

    public void setStatus(StackSetStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the stack set.
     * </p>
     * 
     * @param status
     *        The status of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetStatus
     */

    public StackSetSummary withStatus(StackSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organizational unit (OU).
     * </p>
     * 
     * @param autoDeployment
     *        [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS
     *        Organizations accounts that are added to a target organizational unit (OU).
     */

    public void setAutoDeployment(AutoDeployment autoDeployment) {
        this.autoDeployment = autoDeployment;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organizational unit (OU).
     * </p>
     * 
     * @return [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS
     *         Organizations accounts that are added to a target organizational unit (OU).
     */

    public AutoDeployment getAutoDeployment() {
        return this.autoDeployment;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS Organizations
     * accounts that are added to a target organizational unit (OU).
     * </p>
     * 
     * @param autoDeployment
     *        [<code>Service-managed</code> permissions] Describes whether StackSets automatically deploys to AWS
     *        Organizations accounts that are added to a target organizational unit (OU).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetSummary withAutoDeployment(AutoDeployment autoDeployment) {
        setAutoDeployment(autoDeployment);
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionModel
     *        Describes how the IAM roles required for stack set operations are created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        With <code>self-managed</code> permissions, you must create the administrator and execution roles required
     *        to deploy to target accounts. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     *        Self-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *        deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *        >Grant Service-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     * @see PermissionModels
     */

    public void setPermissionModel(String permissionModel) {
        this.permissionModel = permissionModel;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes how the IAM roles required for stack set operations are created.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         With <code>self-managed</code> permissions, you must create the administrator and execution roles
     *         required to deploy to target accounts. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html"
     *         >Grant Self-Managed Stack Set Permissions</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *         deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *         >Grant Service-Managed Stack Set Permissions</a>.
     *         </p>
     *         </li>
     * @see PermissionModels
     */

    public String getPermissionModel() {
        return this.permissionModel;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionModel
     *        Describes how the IAM roles required for stack set operations are created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        With <code>self-managed</code> permissions, you must create the administrator and execution roles required
     *        to deploy to target accounts. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     *        Self-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *        deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *        >Grant Service-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionModels
     */

    public StackSetSummary withPermissionModel(String permissionModel) {
        setPermissionModel(permissionModel);
        return this;
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionModel
     *        Describes how the IAM roles required for stack set operations are created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        With <code>self-managed</code> permissions, you must create the administrator and execution roles required
     *        to deploy to target accounts. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     *        Self-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *        deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *        >Grant Service-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     * @see PermissionModels
     */

    public void setPermissionModel(PermissionModels permissionModel) {
        withPermissionModel(permissionModel);
    }

    /**
     * <p>
     * Describes how the IAM roles required for stack set operations are created.
     * </p>
     * <ul>
     * <li>
     * <p>
     * With <code>self-managed</code> permissions, you must create the administrator and execution roles required to
     * deploy to target accounts. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     * Self-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to deploy
     * to accounts managed by AWS Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     * >Grant Service-Managed Stack Set Permissions</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param permissionModel
     *        Describes how the IAM roles required for stack set operations are created.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        With <code>self-managed</code> permissions, you must create the administrator and execution roles required
     *        to deploy to target accounts. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html">Grant
     *        Self-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        With <code>service-managed</code> permissions, StackSets automatically creates the IAM roles required to
     *        deploy to accounts managed by AWS Organizations. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-service-managed.html"
     *        >Grant Service-Managed Stack Set Permissions</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionModels
     */

    public StackSetSummary withPermissionModel(PermissionModels permissionModel) {
        this.permissionModel = permissionModel.toString();
        return this;
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A
     * stack set is considered to have drifted if one or more of its stack instances have drifted from their expected
     * template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     * expected template and parameter configuration. A stack instance is considered to have drifted if one or more of
     * the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     * template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param driftStatus
     *        Status of the stack set's actual configuration compared to its expected template and parameter
     *        configuration. A stack set is considered to have drifted if one or more of its stack instances have
     *        drifted from their expected template and parameter configuration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     *        expected template and parameter configuration. A stack instance is considered to have drifted if one or
     *        more of the resources in the associated stack have drifted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     *        template and parameter configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: This value is reserved for future use.
     *        </p>
     *        </li>
     * @see StackDriftStatus
     */

    public void setDriftStatus(String driftStatus) {
        this.driftStatus = driftStatus;
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A
     * stack set is considered to have drifted if one or more of its stack instances have drifted from their expected
     * template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     * expected template and parameter configuration. A stack instance is considered to have drifted if one or more of
     * the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     * template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Status of the stack set's actual configuration compared to its expected template and parameter
     *         configuration. A stack set is considered to have drifted if one or more of its stack instances have
     *         drifted from their expected template and parameter configuration.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from
     *         the expected template and parameter configuration. A stack instance is considered to have drifted if one
     *         or more of the resources in the associated stack have drifted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     *         template and parameter configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN</code>: This value is reserved for future use.
     *         </p>
     *         </li>
     * @see StackDriftStatus
     */

    public String getDriftStatus() {
        return this.driftStatus;
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A
     * stack set is considered to have drifted if one or more of its stack instances have drifted from their expected
     * template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     * expected template and parameter configuration. A stack instance is considered to have drifted if one or more of
     * the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     * template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param driftStatus
     *        Status of the stack set's actual configuration compared to its expected template and parameter
     *        configuration. A stack set is considered to have drifted if one or more of its stack instances have
     *        drifted from their expected template and parameter configuration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     *        expected template and parameter configuration. A stack instance is considered to have drifted if one or
     *        more of the resources in the associated stack have drifted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     *        template and parameter configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: This value is reserved for future use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackDriftStatus
     */

    public StackSetSummary withDriftStatus(String driftStatus) {
        setDriftStatus(driftStatus);
        return this;
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A
     * stack set is considered to have drifted if one or more of its stack instances have drifted from their expected
     * template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     * expected template and parameter configuration. A stack instance is considered to have drifted if one or more of
     * the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     * template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param driftStatus
     *        Status of the stack set's actual configuration compared to its expected template and parameter
     *        configuration. A stack set is considered to have drifted if one or more of its stack instances have
     *        drifted from their expected template and parameter configuration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     *        expected template and parameter configuration. A stack instance is considered to have drifted if one or
     *        more of the resources in the associated stack have drifted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     *        template and parameter configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: This value is reserved for future use.
     *        </p>
     *        </li>
     * @see StackDriftStatus
     */

    public void setDriftStatus(StackDriftStatus driftStatus) {
        withDriftStatus(driftStatus);
    }

    /**
     * <p>
     * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A
     * stack set is considered to have drifted if one or more of its stack instances have drifted from their expected
     * template and parameter configuration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     * expected template and parameter configuration. A stack instance is considered to have drifted if one or more of
     * the resources in the associated stack have drifted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     * template and parameter configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN</code>: This value is reserved for future use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param driftStatus
     *        Status of the stack set's actual configuration compared to its expected template and parameter
     *        configuration. A stack set is considered to have drifted if one or more of its stack instances have
     *        drifted from their expected template and parameter configuration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRIFTED</code>: One or more of the stack instances belonging to the stack set stack differs from the
     *        expected template and parameter configuration. A stack instance is considered to have drifted if one or
     *        more of the resources in the associated stack have drifted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: AWS CloudFormation has not checked the stack set for drift.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: All of the stack instances belonging to the stack set stack match from the expected
     *        template and parameter configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNKNOWN</code>: This value is reserved for future use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackDriftStatus
     */

    public StackSetSummary withDriftStatus(StackDriftStatus driftStatus) {
        this.driftStatus = driftStatus.toString();
        return this;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be
     * <code>NULL</code> for any stack set on which drift detection has not yet been performed.
     * </p>
     * 
     * @param lastDriftCheckTimestamp
     *        Most recent time when CloudFormation performed a drift detection operation on the stack set. This value
     *        will be <code>NULL</code> for any stack set on which drift detection has not yet been performed.
     */

    public void setLastDriftCheckTimestamp(java.util.Date lastDriftCheckTimestamp) {
        this.lastDriftCheckTimestamp = lastDriftCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be
     * <code>NULL</code> for any stack set on which drift detection has not yet been performed.
     * </p>
     * 
     * @return Most recent time when CloudFormation performed a drift detection operation on the stack set. This value
     *         will be <code>NULL</code> for any stack set on which drift detection has not yet been performed.
     */

    public java.util.Date getLastDriftCheckTimestamp() {
        return this.lastDriftCheckTimestamp;
    }

    /**
     * <p>
     * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be
     * <code>NULL</code> for any stack set on which drift detection has not yet been performed.
     * </p>
     * 
     * @param lastDriftCheckTimestamp
     *        Most recent time when CloudFormation performed a drift detection operation on the stack set. This value
     *        will be <code>NULL</code> for any stack set on which drift detection has not yet been performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetSummary withLastDriftCheckTimestamp(java.util.Date lastDriftCheckTimestamp) {
        setLastDriftCheckTimestamp(lastDriftCheckTimestamp);
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getStackSetId() != null)
            sb.append("StackSetId: ").append(getStackSetId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAutoDeployment() != null)
            sb.append("AutoDeployment: ").append(getAutoDeployment()).append(",");
        if (getPermissionModel() != null)
            sb.append("PermissionModel: ").append(getPermissionModel()).append(",");
        if (getDriftStatus() != null)
            sb.append("DriftStatus: ").append(getDriftStatus()).append(",");
        if (getLastDriftCheckTimestamp() != null)
            sb.append("LastDriftCheckTimestamp: ").append(getLastDriftCheckTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetSummary == false)
            return false;
        StackSetSummary other = (StackSetSummary) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAutoDeployment() == null ^ this.getAutoDeployment() == null)
            return false;
        if (other.getAutoDeployment() != null && other.getAutoDeployment().equals(this.getAutoDeployment()) == false)
            return false;
        if (other.getPermissionModel() == null ^ this.getPermissionModel() == null)
            return false;
        if (other.getPermissionModel() != null && other.getPermissionModel().equals(this.getPermissionModel()) == false)
            return false;
        if (other.getDriftStatus() == null ^ this.getDriftStatus() == null)
            return false;
        if (other.getDriftStatus() != null && other.getDriftStatus().equals(this.getDriftStatus()) == false)
            return false;
        if (other.getLastDriftCheckTimestamp() == null ^ this.getLastDriftCheckTimestamp() == null)
            return false;
        if (other.getLastDriftCheckTimestamp() != null && other.getLastDriftCheckTimestamp().equals(this.getLastDriftCheckTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAutoDeployment() == null) ? 0 : getAutoDeployment().hashCode());
        hashCode = prime * hashCode + ((getPermissionModel() == null) ? 0 : getPermissionModel().hashCode());
        hashCode = prime * hashCode + ((getDriftStatus() == null) ? 0 : getDriftStatus().hashCode());
        hashCode = prime * hashCode + ((getLastDriftCheckTimestamp() == null) ? 0 : getLastDriftCheckTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StackSetSummary clone() {
        try {
            return (StackSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
