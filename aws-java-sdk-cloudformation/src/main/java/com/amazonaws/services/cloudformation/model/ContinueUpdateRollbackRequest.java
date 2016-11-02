/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>ContinueUpdateRollback</a> action.
 * </p>
 */
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
     * example, because an update was canceled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     * To specify resources in a nested stack, use the following format: <code>NestedStackName.ResourceLogicalID</code>.
     * You can specify a nested stack resource (the logical ID of an <code>AWS::CloudFormation::Stack</code> resource)
     * only if it's in one of the following states: <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or
     * <code>DELETE_FAILED</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourcesToSkip;

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
     * example, because an update was canceled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     * To specify resources in a nested stack, use the following format: <code>NestedStackName.ResourceLogicalID</code>.
     * You can specify a nested stack resource (the logical ID of an <code>AWS::CloudFormation::Stack</code> resource)
     * only if it's in one of the following states: <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or
     * <code>DELETE_FAILED</code>.
     * </p>
     * 
     * @return A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update
     *         rollback operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state
     *         because a rollback failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state
     *         for other reasons, for example, because an update was canceled. To check why a resource update failed,
     *         use the <a>DescribeStackResources</a> action, and view the resource status reason. </p> <important>
     *         <p>
     *         Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll
     *         back. We recommend that you <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     *         To specify resources in a nested stack, use the following format:
     *         <code>NestedStackName.ResourceLogicalID</code>. You can specify a nested stack resource (the logical ID
     *         of an <code>AWS::CloudFormation::Stack</code> resource) only if it's in one of the following states:
     *         <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
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
     * example, because an update was canceled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     * To specify resources in a nested stack, use the following format: <code>NestedStackName.ResourceLogicalID</code>.
     * You can specify a nested stack resource (the logical ID of an <code>AWS::CloudFormation::Stack</code> resource)
     * only if it's in one of the following states: <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or
     * <code>DELETE_FAILED</code>.
     * </p>
     * 
     * @param resourcesToSkip
     *        A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update
     *        rollback operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state
     *        because a rollback failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state
     *        for other reasons, for example, because an update was canceled. To check why a resource update failed, use
     *        the <a>DescribeStackResources</a> action, and view the resource status reason. </p> <important>
     *        <p>
     *        Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back.
     *        We recommend that you <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     *        To specify resources in a nested stack, use the following format:
     *        <code>NestedStackName.ResourceLogicalID</code>. You can specify a nested stack resource (the logical ID of
     *        an <code>AWS::CloudFormation::Stack</code> resource) only if it's in one of the following states:
     *        <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
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
     * example, because an update was canceled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     * To specify resources in a nested stack, use the following format: <code>NestedStackName.ResourceLogicalID</code>.
     * You can specify a nested stack resource (the logical ID of an <code>AWS::CloudFormation::Stack</code> resource)
     * only if it's in one of the following states: <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or
     * <code>DELETE_FAILED</code>.
     * </p>
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
     *        for other reasons, for example, because an update was canceled. To check why a resource update failed, use
     *        the <a>DescribeStackResources</a> action, and view the resource status reason. </p> <important>
     *        <p>
     *        Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back.
     *        We recommend that you <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     *        To specify resources in a nested stack, use the following format:
     *        <code>NestedStackName.ResourceLogicalID</code>. You can specify a nested stack resource (the logical ID of
     *        an <code>AWS::CloudFormation::Stack</code> resource) only if it's in one of the following states:
     *        <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
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
     * example, because an update was canceled. To check why a resource update failed, use the
     * <a>DescribeStackResources</a> action, and view the resource status reason.
     * </p>
     * <important>
     * <p>
     * Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We
     * recommend that you <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     * To specify resources in a nested stack, use the following format: <code>NestedStackName.ResourceLogicalID</code>.
     * You can specify a nested stack resource (the logical ID of an <code>AWS::CloudFormation::Stack</code> resource)
     * only if it's in one of the following states: <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or
     * <code>DELETE_FAILED</code>.
     * </p>
     * 
     * @param resourcesToSkip
     *        A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update
     *        rollback operation. You can specify only resources that are in the <code>UPDATE_FAILED</code> state
     *        because a rollback failed. You can't specify resources that are in the <code>UPDATE_FAILED</code> state
     *        for other reasons, for example, because an update was canceled. To check why a resource update failed, use
     *        the <a>DescribeStackResources</a> action, and view the resource status reason. </p> <important>
     *        <p>
     *        Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back.
     *        We recommend that you <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
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
     *        To specify resources in a nested stack, use the following format:
     *        <code>NestedStackName.ResourceLogicalID</code>. You can specify a nested stack resource (the logical ID of
     *        an <code>AWS::CloudFormation::Stack</code> resource) only if it's in one of the following states:
     *        <code>DELETE_IN_PROGRESS</code>, <code>DELETE_COMPLETE</code>, or <code>DELETE_FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinueUpdateRollbackRequest withResourcesToSkip(java.util.Collection<String> resourcesToSkip) {
        setResourcesToSkip(resourcesToSkip);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("StackName: " + getStackName() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getResourcesToSkip() != null)
            sb.append("ResourcesToSkip: " + getResourcesToSkip());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getResourcesToSkip() == null) ? 0 : getResourcesToSkip().hashCode());
        return hashCode;
    }

    @Override
    public ContinueUpdateRollbackRequest clone() {
        return (ContinueUpdateRollbackRequest) super.clone();
    }
}
