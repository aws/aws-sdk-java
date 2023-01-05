/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ImportStacksToStackSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportStacksToStackSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stack set. The name must be unique in the Region where you create your stack set.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a time.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stackIds;
    /**
     * <p>
     * The Amazon S3 URL which contains list of stack ids to be inputted.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     */
    private String stackIdsUrl;
    /**
     * <p>
     * The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> organizationalUnitIds;

    private StackSetOperationPreferences operationPreferences;
    /**
     * <p>
     * A unique, user defined, identifier for the stack set operation.
     * </p>
     */
    private String operationId;
    /**
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
     * For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String callAs;

    /**
     * <p>
     * The name of the stack set. The name must be unique in the Region where you create your stack set.
     * </p>
     * 
     * @param stackSetName
     *        The name of the stack set. The name must be unique in the Region where you create your stack set.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name of the stack set. The name must be unique in the Region where you create your stack set.
     * </p>
     * 
     * @return The name of the stack set. The name must be unique in the Region where you create your stack set.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name of the stack set. The name must be unique in the Region where you create your stack set.
     * </p>
     * 
     * @param stackSetName
     *        The name of the stack set. The name must be unique in the Region where you create your stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStacksToStackSetRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a time.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     * 
     * @return The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a
     *         time.</p>
     *         <p>
     *         Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     */

    public java.util.List<String> getStackIds() {
        if (stackIds == null) {
            stackIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stackIds;
    }

    /**
     * <p>
     * The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a time.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     * 
     * @param stackIds
     *        The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a
     *        time.</p>
     *        <p>
     *        Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     */

    public void setStackIds(java.util.Collection<String> stackIds) {
        if (stackIds == null) {
            this.stackIds = null;
            return;
        }

        this.stackIds = new com.amazonaws.internal.SdkInternalList<String>(stackIds);
    }

    /**
     * <p>
     * The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a time.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStackIds(java.util.Collection)} or {@link #withStackIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param stackIds
     *        The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a
     *        time.</p>
     *        <p>
     *        Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStacksToStackSetRequest withStackIds(String... stackIds) {
        if (this.stackIds == null) {
            setStackIds(new com.amazonaws.internal.SdkInternalList<String>(stackIds.length));
        }
        for (String ele : stackIds) {
            this.stackIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a time.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     * 
     * @param stackIds
     *        The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a
     *        time.</p>
     *        <p>
     *        Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStacksToStackSetRequest withStackIds(java.util.Collection<String> stackIds) {
        setStackIds(stackIds);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URL which contains list of stack ids to be inputted.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     * 
     * @param stackIdsUrl
     *        The Amazon S3 URL which contains list of stack ids to be inputted.</p>
     *        <p>
     *        Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     */

    public void setStackIdsUrl(String stackIdsUrl) {
        this.stackIdsUrl = stackIdsUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL which contains list of stack ids to be inputted.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     * 
     * @return The Amazon S3 URL which contains list of stack ids to be inputted.</p>
     *         <p>
     *         Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     */

    public String getStackIdsUrl() {
        return this.stackIdsUrl;
    }

    /**
     * <p>
     * The Amazon S3 URL which contains list of stack ids to be inputted.
     * </p>
     * <p>
     * Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * </p>
     * 
     * @param stackIdsUrl
     *        The Amazon S3 URL which contains list of stack ids to be inputted.</p>
     *        <p>
     *        Specify either <code>StackIds</code> or <code>StackIdsUrl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStacksToStackSetRequest withStackIdsUrl(String stackIdsUrl) {
        setStackIdsUrl(stackIdsUrl);
        return this;
    }

    /**
     * <p>
     * The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     * </p>
     * 
     * @return The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     */

    public java.util.List<String> getOrganizationalUnitIds() {
        if (organizationalUnitIds == null) {
            organizationalUnitIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return organizationalUnitIds;
    }

    /**
     * <p>
     * The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     */

    public void setOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        if (organizationalUnitIds == null) {
            this.organizationalUnitIds = null;
            return;
        }

        this.organizationalUnitIds = new com.amazonaws.internal.SdkInternalList<String>(organizationalUnitIds);
    }

    /**
     * <p>
     * The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationalUnitIds(java.util.Collection)} or
     * {@link #withOrganizationalUnitIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStacksToStackSetRequest withOrganizationalUnitIds(String... organizationalUnitIds) {
        if (this.organizationalUnitIds == null) {
            setOrganizationalUnitIds(new com.amazonaws.internal.SdkInternalList<String>(organizationalUnitIds.length));
        }
        for (String ele : organizationalUnitIds) {
            this.organizationalUnitIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     * </p>
     * 
     * @param organizationalUnitIds
     *        The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStacksToStackSetRequest withOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        setOrganizationalUnitIds(organizationalUnitIds);
        return this;
    }

    /**
     * @param operationPreferences
     */

    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * @return
     */

    public StackSetOperationPreferences getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * @param operationPreferences
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStacksToStackSetRequest withOperationPreferences(StackSetOperationPreferences operationPreferences) {
        setOperationPreferences(operationPreferences);
        return this;
    }

    /**
     * <p>
     * A unique, user defined, identifier for the stack set operation.
     * </p>
     * 
     * @param operationId
     *        A unique, user defined, identifier for the stack set operation.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * A unique, user defined, identifier for the stack set operation.
     * </p>
     * 
     * @return A unique, user defined, identifier for the stack set operation.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * A unique, user defined, identifier for the stack set operation.
     * </p>
     * 
     * @param operationId
     *        A unique, user defined, identifier for the stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportStacksToStackSetRequest withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
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
     * For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        </li>
     * @see CallAs
     */

    public void setCallAs(String callAs) {
        this.callAs = callAs;
    }

    /**
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
     * For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *         permissions.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are signed in to the management account, specify <code>SELF</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     *         </p>
     *         </li>
     * @see CallAs
     */

    public String getCallAs() {
        return this.callAs;
    }

    /**
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
     * For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public ImportStacksToStackSetRequest withCallAs(String callAs) {
        setCallAs(callAs);
        return this;
    }

    /**
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
     * For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param callAs
     *        By default, <code>SELF</code> is specified. Use <code>SELF</code> for stack sets with self-managed
     *        permissions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are signed in to the management account, specify <code>SELF</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For service managed stack sets, specify <code>DELEGATED_ADMIN</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CallAs
     */

    public ImportStacksToStackSetRequest withCallAs(CallAs callAs) {
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
        if (getStackIds() != null)
            sb.append("StackIds: ").append(getStackIds()).append(",");
        if (getStackIdsUrl() != null)
            sb.append("StackIdsUrl: ").append(getStackIdsUrl()).append(",");
        if (getOrganizationalUnitIds() != null)
            sb.append("OrganizationalUnitIds: ").append(getOrganizationalUnitIds()).append(",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: ").append(getOperationPreferences()).append(",");
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

        if (obj instanceof ImportStacksToStackSetRequest == false)
            return false;
        ImportStacksToStackSetRequest other = (ImportStacksToStackSetRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getStackIds() == null ^ this.getStackIds() == null)
            return false;
        if (other.getStackIds() != null && other.getStackIds().equals(this.getStackIds()) == false)
            return false;
        if (other.getStackIdsUrl() == null ^ this.getStackIdsUrl() == null)
            return false;
        if (other.getStackIdsUrl() != null && other.getStackIdsUrl().equals(this.getStackIdsUrl()) == false)
            return false;
        if (other.getOrganizationalUnitIds() == null ^ this.getOrganizationalUnitIds() == null)
            return false;
        if (other.getOrganizationalUnitIds() != null && other.getOrganizationalUnitIds().equals(this.getOrganizationalUnitIds()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
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
        hashCode = prime * hashCode + ((getStackIds() == null) ? 0 : getStackIds().hashCode());
        hashCode = prime * hashCode + ((getStackIdsUrl() == null) ? 0 : getStackIdsUrl().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitIds() == null) ? 0 : getOrganizationalUnitIds().hashCode());
        hashCode = prime * hashCode + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getCallAs() == null) ? 0 : getCallAs().hashCode());
        return hashCode;
    }

    @Override
    public ImportStacksToStackSetRequest clone() {
        return (ImportStacksToStackSetRequest) super.clone();
    }

}
