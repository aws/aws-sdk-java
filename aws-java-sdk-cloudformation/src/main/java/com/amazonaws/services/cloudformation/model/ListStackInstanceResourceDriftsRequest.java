/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListStackInstanceResourceDrifts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStackInstanceResourceDriftsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list drifted resources for.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The resource drift status of the stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> stackInstanceResourceDriftStatuses;
    /**
     * <p>
     * The name of the Amazon Web Services account that you want to list resource drifts for.
     * </p>
     */
    private String stackInstanceAccount;
    /**
     * <p>
     * The name of the Region where you want to list resource drifts.
     * </p>
     */
    private String stackInstanceRegion;
    /**
     * <p>
     * The unique ID of the drift operation.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your Amazon Web Services account must be registered as a delegated administrator in the management account. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     * >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String callAs;

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list drifted resources for.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you want to list drifted resources for.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list drifted resources for.
     * </p>
     * 
     * @return The name or unique ID of the stack set that you want to list drifted resources for.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to list drifted resources for.
     * </p>
     * 
     * @param stackSetName
     *        The name or unique ID of the stack set that you want to list drifted resources for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstanceResourceDriftsRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request didn't return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *        action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *        no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *        <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @return If the previous paginated request didn't return all of the remaining results, the response object's
     *         <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *         action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *         no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *         <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous paginated request didn't return all of the remaining results, the response object's
     * <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this action
     * again and assign that token to the request object's <code>NextToken</code> parameter. If there are no remaining
     * results, the previous response object's <code>NextToken</code> parameter is set to <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If the previous paginated request didn't return all of the remaining results, the response object's
     *        <code>NextToken</code> parameter value is set to a token. To retrieve the next set of results, call this
     *        action again and assign that token to the request object's <code>NextToken</code> parameter. If there are
     *        no remaining results, the previous response object's <code>NextToken</code> parameter is set to
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstanceResourceDriftsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @return The maximum number of results to be returned with a single call. If the number of available results
     *         exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *         <code>NextToken</code> request parameter to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned with a single call. If the number of available results exceeds this
     * maximum, the response includes a <code>NextToken</code> value that you can assign to the <code>NextToken</code>
     * request parameter to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned with a single call. If the number of available results
     *        exceeds this maximum, the response includes a <code>NextToken</code> value that you can assign to the
     *        <code>NextToken</code> request parameter to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstanceResourceDriftsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The resource drift status of the stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resource drift status of the stack instance. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *         has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *         </p>
     *         </li>
     * @see StackResourceDriftStatus
     */

    public java.util.List<String> getStackInstanceResourceDriftStatuses() {
        if (stackInstanceResourceDriftStatuses == null) {
            stackInstanceResourceDriftStatuses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stackInstanceResourceDriftStatuses;
    }

    /**
     * <p>
     * The resource drift status of the stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackInstanceResourceDriftStatuses
     *        The resource drift status of the stack instance. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *        </p>
     *        </li>
     * @see StackResourceDriftStatus
     */

    public void setStackInstanceResourceDriftStatuses(java.util.Collection<String> stackInstanceResourceDriftStatuses) {
        if (stackInstanceResourceDriftStatuses == null) {
            this.stackInstanceResourceDriftStatuses = null;
            return;
        }

        this.stackInstanceResourceDriftStatuses = new com.amazonaws.internal.SdkInternalList<String>(stackInstanceResourceDriftStatuses);
    }

    /**
     * <p>
     * The resource drift status of the stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackInstanceResourceDriftStatuses(java.util.Collection)} or
     * {@link #withStackInstanceResourceDriftStatuses(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param stackInstanceResourceDriftStatuses
     *        The resource drift status of the stack instance. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public ListStackInstanceResourceDriftsRequest withStackInstanceResourceDriftStatuses(String... stackInstanceResourceDriftStatuses) {
        if (this.stackInstanceResourceDriftStatuses == null) {
            setStackInstanceResourceDriftStatuses(new com.amazonaws.internal.SdkInternalList<String>(stackInstanceResourceDriftStatuses.length));
        }
        for (String ele : stackInstanceResourceDriftStatuses) {
            this.stackInstanceResourceDriftStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource drift status of the stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackInstanceResourceDriftStatuses
     *        The resource drift status of the stack instance. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public ListStackInstanceResourceDriftsRequest withStackInstanceResourceDriftStatuses(java.util.Collection<String> stackInstanceResourceDriftStatuses) {
        setStackInstanceResourceDriftStatuses(stackInstanceResourceDriftStatuses);
        return this;
    }

    /**
     * <p>
     * The resource drift status of the stack instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DELETED</code>: The resource differs from its expected template configuration in that the resource has been
     * deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param stackInstanceResourceDriftStatuses
     *        The resource drift status of the stack instance. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DELETED</code>: The resource differs from its expected template configuration in that the resource
     *        has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFIED</code>: One or more resource properties differ from their expected template values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_SYNC</code>: The resource's actual configuration matches its expected template configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_CHECKED</code>: CloudFormation doesn't currently return this value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackResourceDriftStatus
     */

    public ListStackInstanceResourceDriftsRequest withStackInstanceResourceDriftStatuses(StackResourceDriftStatus... stackInstanceResourceDriftStatuses) {
        com.amazonaws.internal.SdkInternalList<String> stackInstanceResourceDriftStatusesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                stackInstanceResourceDriftStatuses.length);
        for (StackResourceDriftStatus value : stackInstanceResourceDriftStatuses) {
            stackInstanceResourceDriftStatusesCopy.add(value.toString());
        }
        if (getStackInstanceResourceDriftStatuses() == null) {
            setStackInstanceResourceDriftStatuses(stackInstanceResourceDriftStatusesCopy);
        } else {
            getStackInstanceResourceDriftStatuses().addAll(stackInstanceResourceDriftStatusesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services account that you want to list resource drifts for.
     * </p>
     * 
     * @param stackInstanceAccount
     *        The name of the Amazon Web Services account that you want to list resource drifts for.
     */

    public void setStackInstanceAccount(String stackInstanceAccount) {
        this.stackInstanceAccount = stackInstanceAccount;
    }

    /**
     * <p>
     * The name of the Amazon Web Services account that you want to list resource drifts for.
     * </p>
     * 
     * @return The name of the Amazon Web Services account that you want to list resource drifts for.
     */

    public String getStackInstanceAccount() {
        return this.stackInstanceAccount;
    }

    /**
     * <p>
     * The name of the Amazon Web Services account that you want to list resource drifts for.
     * </p>
     * 
     * @param stackInstanceAccount
     *        The name of the Amazon Web Services account that you want to list resource drifts for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstanceResourceDriftsRequest withStackInstanceAccount(String stackInstanceAccount) {
        setStackInstanceAccount(stackInstanceAccount);
        return this;
    }

    /**
     * <p>
     * The name of the Region where you want to list resource drifts.
     * </p>
     * 
     * @param stackInstanceRegion
     *        The name of the Region where you want to list resource drifts.
     */

    public void setStackInstanceRegion(String stackInstanceRegion) {
        this.stackInstanceRegion = stackInstanceRegion;
    }

    /**
     * <p>
     * The name of the Region where you want to list resource drifts.
     * </p>
     * 
     * @return The name of the Region where you want to list resource drifts.
     */

    public String getStackInstanceRegion() {
        return this.stackInstanceRegion;
    }

    /**
     * <p>
     * The name of the Region where you want to list resource drifts.
     * </p>
     * 
     * @param stackInstanceRegion
     *        The name of the Region where you want to list resource drifts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstanceResourceDriftsRequest withStackInstanceRegion(String stackInstanceRegion) {
        setStackInstanceRegion(stackInstanceRegion);
        return this;
    }

    /**
     * <p>
     * The unique ID of the drift operation.
     * </p>
     * 
     * @param operationId
     *        The unique ID of the drift operation.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID of the drift operation.
     * </p>
     * 
     * @return The unique ID of the drift operation.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The unique ID of the drift operation.
     * </p>
     * 
     * @param operationId
     *        The unique ID of the drift operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStackInstanceResourceDriftsRequest withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your Amazon Web Services account must be registered as a delegated administrator in the management account. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     * >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your Amazon Web Services account must be registered as a delegated administrator in the management
     *        account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @see CallAs
     */

    public void setCallAs(String callAs) {
        this.callAs = callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your Amazon Web Services account must be registered as a delegated administrator in the management account. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     * >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *         organization's management account or as a delegated administrator in a member account.</p>
     *         <p>
     *         By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *         permissions.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are signed in to the management account, specify <code>SELF</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *         </p>
     *         <p>
     *         Your Amazon Web Services account must be registered as a delegated administrator in the management
     *         account. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *         >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     *         </p>
     *         </li>
     * @see CallAs
     */

    public String getCallAs() {
        return this.callAs;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your Amazon Web Services account must be registered as a delegated administrator in the management account. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     * >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your Amazon Web Services account must be registered as a delegated administrator in the management
     *        account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public ListStackInstanceResourceDriftsRequest withCallAs(String callAs) {
        setCallAs(callAs);
        return this;
    }

    /**
     * <p>
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's
     * management account or as a delegated administrator in a member account.
     * </p>
     * <p>
     * By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed permissions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are signed in to the management account, specify <code>SELF</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * <p>
     * Your Amazon Web Services account must be registered as a delegated administrator in the management account. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     * >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        [Service-managed permissions] Specifies whether you are acting as an account administrator in the
     *        organization's management account or as a delegated administrator in a member account.</p>
     *        <p>
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you are signed in to a delegated administrator account, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        <p>
     *        Your Amazon Web Services account must be registered as a delegated administrator in the management
     *        account. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html"
     *        >Register a delegated administrator</a> in the <i>CloudFormation User Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public ListStackInstanceResourceDriftsRequest withCallAs(CallAs callAs) {
        this.callAs = callAs.toString();
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStackInstanceResourceDriftStatuses() != null)
            sb.append("StackInstanceResourceDriftStatuses: ").append(getStackInstanceResourceDriftStatuses()).append(",");
        if (getStackInstanceAccount() != null)
            sb.append("StackInstanceAccount: ").append(getStackInstanceAccount()).append(",");
        if (getStackInstanceRegion() != null)
            sb.append("StackInstanceRegion: ").append(getStackInstanceRegion()).append(",");
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getCallAs() != null)
            sb.append("CallAs: ").append(getCallAs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStackInstanceResourceDriftsRequest == false)
            return false;
        ListStackInstanceResourceDriftsRequest other = (ListStackInstanceResourceDriftsRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStackInstanceResourceDriftStatuses() == null ^ this.getStackInstanceResourceDriftStatuses() == null)
            return false;
        if (other.getStackInstanceResourceDriftStatuses() != null
                && other.getStackInstanceResourceDriftStatuses().equals(this.getStackInstanceResourceDriftStatuses()) == false)
            return false;
        if (other.getStackInstanceAccount() == null ^ this.getStackInstanceAccount() == null)
            return false;
        if (other.getStackInstanceAccount() != null && other.getStackInstanceAccount().equals(this.getStackInstanceAccount()) == false)
            return false;
        if (other.getStackInstanceRegion() == null ^ this.getStackInstanceRegion() == null)
            return false;
        if (other.getStackInstanceRegion() != null && other.getStackInstanceRegion().equals(this.getStackInstanceRegion()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getCallAs() == null ^ this.getCallAs() == null)
            return false;
        if (other.getCallAs() != null && other.getCallAs().equals(this.getCallAs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStackInstanceResourceDriftStatuses() == null) ? 0 : getStackInstanceResourceDriftStatuses().hashCode());
        hashCode = prime * hashCode + ((getStackInstanceAccount() == null) ? 0 : getStackInstanceAccount().hashCode());
        hashCode = prime * hashCode + ((getStackInstanceRegion() == null) ? 0 : getStackInstanceRegion().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getCallAs() == null) ? 0 : getCallAs().hashCode());
        return hashCode;
    }

    @Override
    public ListStackInstanceResourceDriftsRequest clone() {
        return (ListStackInstanceResourceDriftsRequest) super.clone();
    }

}
