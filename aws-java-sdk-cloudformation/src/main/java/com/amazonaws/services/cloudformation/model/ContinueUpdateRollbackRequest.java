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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>ContinueUpdateRollback</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ContinueUpdateRollback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinueUpdateRollbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique ID of the stack that you want to continue rolling back.
     * </p>
     * <note>
     * <p>
     * Don't specify the name of a nested stack (a stack that was created by using the
     * <code>AWS::CloudFormation::Stack</code> resource). Instead, use this operation on the parent stack (the stack
     * that contains the <code>AWS::CloudFormation::Stack</code> resource).
     * </p>
     * </note>
     */
    private String stackName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS
     * CloudFormation always uses this role for all future operations on the stack. As long as users have permission to
     * operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it.
     * Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update rollback
     * operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state because a rollback
     * failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state for other reasons, for
     * example, because an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified resources
     * to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is complete, the state
     * of the skipped resources will be inconsistent with the state of the resources in the stack template. Before
     * performing another stack update, you must update the stack or resources to be consistent with each other. If you
     * don't, subsequent stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll back your stack. For example, a failed
     * resource update might cause dependent resources to fail. In this case, it might not be necessary to skip the
     * dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following format:
     * <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its corresponding
     * embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an example
     * of a continue update rollback operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourcesToSkip;
    /**
     * <p>
     * A unique identifier for this <code>ContinueUpdateRollback</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to a stack with the
     * same name. You might retry <code>ContinueUpdateRollback</code> requests to ensure that AWS CloudFormation
     * successfully received them.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name or the unique ID of the stack that you want to continue rolling back.
     * </p>
     * <note>
     * <p>
     * Don't specify the name of a nested stack (a stack that was created by using the
     * <code>AWS::CloudFormation::Stack</code> resource). Instead, use this operation on the parent stack (the stack
     * that contains the <code>AWS::CloudFormation::Stack</code> resource).
     * </p>
     * </note>
     * 
     * @param stackName
     *        The name or the unique ID of the stack that you want to continue rolling back.</p> <note>
     *        <p>
     *        Don't specify the name of a nested stack (a stack that was created by using the
     *        <code>AWS::CloudFormation::Stack</code> resource). Instead, use this operation on the parent stack (the
     *        stack that contains the <code>AWS::CloudFormation::Stack</code> resource).
     *        </p>
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique ID of the stack that you want to continue rolling back.
     * </p>
     * <note>
     * <p>
     * Don't specify the name of a nested stack (a stack that was created by using the
     * <code>AWS::CloudFormation::Stack</code> resource). Instead, use this operation on the parent stack (the stack
     * that contains the <code>AWS::CloudFormation::Stack</code> resource).
     * </p>
     * </note>
     * 
     * @return The name or the unique ID of the stack that you want to continue rolling back.</p> <note>
     *         <p>
     *         Don't specify the name of a nested stack (a stack that was created by using the
     *         <code>AWS::CloudFormation::Stack</code> resource). Instead, use this operation on the parent stack (the
     *         stack that contains the <code>AWS::CloudFormation::Stack</code> resource).
     *         </p>
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the unique ID of the stack that you want to continue rolling back.
     * </p>
     * <note>
     * <p>
     * Don't specify the name of a nested stack (a stack that was created by using the
     * <code>AWS::CloudFormation::Stack</code> resource). Instead, use this operation on the parent stack (the stack
     * that contains the <code>AWS::CloudFormation::Stack</code> resource).
     * </p>
     * </note>
     * 
     * @param stackName
     *        The name or the unique ID of the stack that you want to continue rolling back.</p> <note>
     *        <p>
     *        Don't specify the name of a nested stack (a stack that was created by using the
     *        <code>AWS::CloudFormation::Stack</code> resource). Instead, use this operation on the parent stack (the
     *        stack that contains the <code>AWS::CloudFormation::Stack</code> resource).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinueUpdateRollbackRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS
     * CloudFormation always uses this role for all future operations on the stack. As long as users have permission to
     * operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it.
     * Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     *        assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make calls on your
     *        behalf. AWS CloudFormation always uses this role for all future operations on the stack. As long as users
     *        have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have
     *        permission to pass it. Ensure that the role grants least privilege.</p>
     *        <p>
     *        If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *        stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *        user credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS
     * CloudFormation always uses this role for all future operations on the stack. As long as users have permission to
     * operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it.
     * Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS
     *         CloudFormation assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make
     *         calls on your behalf. AWS CloudFormation always uses this role for all future operations on the stack. As
     *         long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the
     *         users don't have permission to pass it. Ensure that the role grants least privilege.</p>
     *         <p>
     *         If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *         stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *         user credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     * assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS
     * CloudFormation always uses this role for all future operations on the stack. As long as users have permission to
     * operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it.
     * Ensure that the role grants least privilege.
     * </p>
     * <p>
     * If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If
     * no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation
     *        assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make calls on your
     *        behalf. AWS CloudFormation always uses this role for all future operations on the stack. As long as users
     *        have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have
     *        permission to pass it. Ensure that the role grants least privilege.</p>
     *        <p>
     *        If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the
     *        stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your
     *        user credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinueUpdateRollbackRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update rollback
     * operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state because a rollback
     * failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state for other reasons, for
     * example, because an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified resources
     * to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is complete, the state
     * of the skipped resources will be inconsistent with the state of the resources in the stack template. Before
     * performing another stack update, you must update the stack or resources to be consistent with each other. If you
     * don't, subsequent stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll back your stack. For example, a failed
     * resource update might cause dependent resources to fail. In this case, it might not be necessary to skip the
     * dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following format:
     * <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its corresponding
     * embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an example
     * of a continue update rollback operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     * 
     * @return A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update
     *         rollback operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state
     *         because a rollback failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state
     *         for other reasons, for example, because an update was cancelled. To check why a resource update failed,
     *         use the <a>DescribeStackResources</a> action, and view the resource status reason. </p> <important>
     *         <p>
     *         Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll
     *         back. We recommend that you <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     *         > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified
     *         resources to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is
     *         complete, the state of the skipped resources will be inconsistent with the state of the resources in the
     *         stack template. Before performing another stack update, you must update the stack or resources to be
     *         consistent with each other. If you don't, subsequent stack updates might fail, and the stack will become
     *         unrecoverable.
     *         </p>
     *         </important>
     *         <p>
     *         Specify the minimum number of resources required to successfully roll back your stack. For example, a
     *         failed resource update might cause dependent resources to fail. In this case, it might not be necessary
     *         to skip the dependent resources.
     *         </p>
     *         <p>
     *         To skip resources that are part of nested stacks, use the following format:
     *         <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource
     *         (<code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its
     *         corresponding embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     *         <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an
     *         example of a continue update rollback operation with nested stacks, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     *         >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     *         </p>
     */

    public java.util.List<String> getResourcesToSkip() {
        if (resourcesToSkip == null) {
            resourcesToSkip = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourcesToSkip;
    }

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update rollback
     * operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state because a rollback
     * failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state for other reasons, for
     * example, because an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified resources
     * to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is complete, the state
     * of the skipped resources will be inconsistent with the state of the resources in the stack template. Before
     * performing another stack update, you must update the stack or resources to be consistent with each other. If you
     * don't, subsequent stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll back your stack. For example, a failed
     * resource update might cause dependent resources to fail. In this case, it might not be necessary to skip the
     * dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following format:
     * <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its corresponding
     * embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an example
     * of a continue update rollback operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     * 
     * @param resourcesToSkip
     *        A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update
     *        rollback operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state
     *        because a rollback failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state
     *        for other reasons, for example, because an update was cancelled. To check why a resource update failed,
     *        use the <a>DescribeStackResources</a> action, and view the resource status reason. </p> <important>
     *        <p>
     *        Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back.
     *        We recommend that you <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     *        > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified
     *        resources to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is
     *        complete, the state of the skipped resources will be inconsistent with the state of the resources in the
     *        stack template. Before performing another stack update, you must update the stack or resources to be
     *        consistent with each other. If you don't, subsequent stack updates might fail, and the stack will become
     *        unrecoverable.
     *        </p>
     *        </important>
     *        <p>
     *        Specify the minimum number of resources required to successfully roll back your stack. For example, a
     *        failed resource update might cause dependent resources to fail. In this case, it might not be necessary to
     *        skip the dependent resources.
     *        </p>
     *        <p>
     *        To skip resources that are part of nested stacks, use the following format:
     *        <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource
     *        (<code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its
     *        corresponding embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     *        <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an
     *        example of a continue update rollback operation with nested stacks, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     *        >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     *        </p>
     */

    public void setResourcesToSkip(java.util.Collection<String> resourcesToSkip) {
        if (resourcesToSkip == null) {
            this.resourcesToSkip = null;
            return;
        }

        this.resourcesToSkip = new com.amazonaws.internal.SdkInternalList<String>(resourcesToSkip);
    }

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update rollback
     * operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state because a rollback
     * failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state for other reasons, for
     * example, because an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified resources
     * to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is complete, the state
     * of the skipped resources will be inconsistent with the state of the resources in the stack template. Before
     * performing another stack update, you must update the stack or resources to be consistent with each other. If you
     * don't, subsequent stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll back your stack. For example, a failed
     * resource update might cause dependent resources to fail. In this case, it might not be necessary to skip the
     * dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following format:
     * <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its corresponding
     * embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an example
     * of a continue update rollback operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcesToSkip(java.util.Collection)} or {@link #withResourcesToSkip(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourcesToSkip
     *        A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update
     *        rollback operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state
     *        because a rollback failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state
     *        for other reasons, for example, because an update was cancelled. To check why a resource update failed,
     *        use the <a>DescribeStackResources</a> action, and view the resource status reason. </p> <important>
     *        <p>
     *        Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back.
     *        We recommend that you <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     *        > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified
     *        resources to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is
     *        complete, the state of the skipped resources will be inconsistent with the state of the resources in the
     *        stack template. Before performing another stack update, you must update the stack or resources to be
     *        consistent with each other. If you don't, subsequent stack updates might fail, and the stack will become
     *        unrecoverable.
     *        </p>
     *        </important>
     *        <p>
     *        Specify the minimum number of resources required to successfully roll back your stack. For example, a
     *        failed resource update might cause dependent resources to fail. In this case, it might not be necessary to
     *        skip the dependent resources.
     *        </p>
     *        <p>
     *        To skip resources that are part of nested stacks, use the following format:
     *        <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource
     *        (<code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its
     *        corresponding embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     *        <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an
     *        example of a continue update rollback operation with nested stacks, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     *        >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinueUpdateRollbackRequest withResourcesToSkip(String... resourcesToSkip) {
        if (this.resourcesToSkip == null) {
            setResourcesToSkip(new com.amazonaws.internal.SdkInternalList<String>(resourcesToSkip.length));
        }
        for (String ele : resourcesToSkip) {
            this.resourcesToSkip.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update rollback
     * operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state because a rollback
     * failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state for other reasons, for
     * example, because an update was cancelled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified resources
     * to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is complete, the state
     * of the skipped resources will be inconsistent with the state of the resources in the stack template. Before
     * performing another stack update, you must update the stack or resources to be consistent with each other. If you
     * don't, subsequent stack updates might fail, and the stack will become unrecoverable.
     * </p>
     * </important>
     * <p>
     * Specify the minimum number of resources required to successfully roll back your stack. For example, a failed
     * resource update might cause dependent resources to fail. In this case, it might not be necessary to skip the
     * dependent resources.
     * </p>
     * <p>
     * To skip resources that are part of nested stacks, use the following format:
     * <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource (
     * <code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its corresponding
     * embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     * <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * </p>
     * <note>
     * <p>
     * Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an example
     * of a continue update rollback operation with nested stacks, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     * >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     * </p>
     * </note>
     * 
     * @param resourcesToSkip
     *        A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update
     *        rollback operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state
     *        because a rollback failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state
     *        for other reasons, for example, because an update was cancelled. To check why a resource update failed,
     *        use the <a>DescribeStackResources</a> action, and view the resource status reason. </p> <important>
     *        <p>
     *        Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back.
     *        We recommend that you <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     *        > troubleshoot</a> resources before skipping them. AWS CloudFormation sets the status of the specified
     *        resources to <code>UPDATE_COMPLETE</code> and continues to roll back the stack. After the rollback is
     *        complete, the state of the skipped resources will be inconsistent with the state of the resources in the
     *        stack template. Before performing another stack update, you must update the stack or resources to be
     *        consistent with each other. If you don't, subsequent stack updates might fail, and the stack will become
     *        unrecoverable.
     *        </p>
     *        </important>
     *        <p>
     *        Specify the minimum number of resources required to successfully roll back your stack. For example, a
     *        failed resource update might cause dependent resources to fail. In this case, it might not be necessary to
     *        skip the dependent resources.
     *        </p>
     *        <p>
     *        To skip resources that are part of nested stacks, use the following format:
     *        <code>NestedStackName.ResourceLogicalID</code>. If you want to specify the logical ID of a stack resource
     *        (<code>Type: AWS::CloudFormation::Stack</code>) in the <code>ResourcesToSkip</code> list, then its
     *        corresponding embedded stack must be in one of the following states: <code>DELETE_IN_PROGRESS</code>,
     *        <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an
     *        example of a continue update rollback operation with nested stacks, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html#nested-stacks"
     *        >Using ResourcesToSkip to recover a nested stacks hierarchy</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinueUpdateRollbackRequest withResourcesToSkip(java.util.Collection<String> resourcesToSkip) {
        setResourcesToSkip(resourcesToSkip);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this <code>ContinueUpdateRollback</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to a stack with the
     * same name. You might retry <code>ContinueUpdateRollback</code> requests to ensure that AWS CloudFormation
     * successfully received them.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>ContinueUpdateRollback</code> request. Specify this token if you plan
     *        to retry requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to
     *        a stack with the same name. You might retry <code>ContinueUpdateRollback</code> requests to ensure that
     *        AWS CloudFormation successfully received them.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>ContinueUpdateRollback</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to a stack with the
     * same name. You might retry <code>ContinueUpdateRollback</code> requests to ensure that AWS CloudFormation
     * successfully received them.
     * </p>
     * 
     * @return A unique identifier for this <code>ContinueUpdateRollback</code> request. Specify this token if you plan
     *         to retry requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to
     *         a stack with the same name. You might retry <code>ContinueUpdateRollback</code> requests to ensure that
     *         AWS CloudFormation successfully received them.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique identifier for this <code>ContinueUpdateRollback</code> request. Specify this token if you plan to retry
     * requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to a stack with the
     * same name. You might retry <code>ContinueUpdateRollback</code> requests to ensure that AWS CloudFormation
     * successfully received them.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique identifier for this <code>ContinueUpdateRollback</code> request. Specify this token if you plan
     *        to retry requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to
     *        a stack with the same name. You might retry <code>ContinueUpdateRollback</code> requests to ensure that
     *        AWS CloudFormation successfully received them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinueUpdateRollbackRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getResourcesToSkip() != null)
            sb.append("ResourcesToSkip: ").append(getResourcesToSkip()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinueUpdateRollbackRequest == false)
            return false;
        ContinueUpdateRollbackRequest other = (ContinueUpdateRollbackRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getResourcesToSkip() == null ^ this.getResourcesToSkip() == null)
            return false;
        if (other.getResourcesToSkip() != null && other.getResourcesToSkip().equals(this.getResourcesToSkip()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getResourcesToSkip() == null) ? 0 : getResourcesToSkip().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public ContinueUpdateRollbackRequest clone() {
        return (ContinueUpdateRollbackRequest) super.clone();
    }

}
