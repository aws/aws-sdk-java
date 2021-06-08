/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the <code>putPermissionRequest</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PutPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies an action group that contains permissions to add to a profiling group resource. One action group is
     * supported, <code>agentPermissions</code>, which grants permission to perform actions required by the profiling
     * agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * </p>
     */
    private String actionGroup;
    /**
     * <p>
     * A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are
     * supported in the ARNs.
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * The name of the profiling group to grant access to.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling group. Do
     * not specify this when you add permissions to a profiling group for the first time. If a policy already exists on
     * the profiling group, you must specify the <code>revisionId</code>.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * Specifies an action group that contains permissions to add to a profiling group resource. One action group is
     * supported, <code>agentPermissions</code>, which grants permission to perform actions required by the profiling
     * agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * </p>
     * 
     * @param actionGroup
     *        Specifies an action group that contains permissions to add to a profiling group resource. One action group
     *        is supported, <code>agentPermissions</code>, which grants permission to perform actions required by the
     *        profiling agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * @see ActionGroup
     */

    public void setActionGroup(String actionGroup) {
        this.actionGroup = actionGroup;
    }

    /**
     * <p>
     * Specifies an action group that contains permissions to add to a profiling group resource. One action group is
     * supported, <code>agentPermissions</code>, which grants permission to perform actions required by the profiling
     * agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * </p>
     * 
     * @return Specifies an action group that contains permissions to add to a profiling group resource. One action
     *         group is supported, <code>agentPermissions</code>, which grants permission to perform actions required by
     *         the profiling agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * @see ActionGroup
     */

    public String getActionGroup() {
        return this.actionGroup;
    }

    /**
     * <p>
     * Specifies an action group that contains permissions to add to a profiling group resource. One action group is
     * supported, <code>agentPermissions</code>, which grants permission to perform actions required by the profiling
     * agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * </p>
     * 
     * @param actionGroup
     *        Specifies an action group that contains permissions to add to a profiling group resource. One action group
     *        is supported, <code>agentPermissions</code>, which grants permission to perform actions required by the
     *        profiling agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroup
     */

    public PutPermissionRequest withActionGroup(String actionGroup) {
        setActionGroup(actionGroup);
        return this;
    }

    /**
     * <p>
     * Specifies an action group that contains permissions to add to a profiling group resource. One action group is
     * supported, <code>agentPermissions</code>, which grants permission to perform actions required by the profiling
     * agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * </p>
     * 
     * @param actionGroup
     *        Specifies an action group that contains permissions to add to a profiling group resource. One action group
     *        is supported, <code>agentPermissions</code>, which grants permission to perform actions required by the
     *        profiling agent, <code>ConfigureAgent</code> and <code>PostAgentProfile</code> permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroup
     */

    public PutPermissionRequest withActionGroup(ActionGroup actionGroup) {
        this.actionGroup = actionGroup.toString();
        return this;
    }

    /**
     * <p>
     * A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are
     * supported in the ARNs.
     * </p>
     * 
     * @return A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not
     *         are supported in the ARNs.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are
     * supported in the ARNs.
     * </p>
     * 
     * @param principals
     *        A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are
     *        supported in the ARNs.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are
     * supported in the ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are
     *        supported in the ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are
     * supported in the ARNs.
     * </p>
     * 
     * @param principals
     *        A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are
     *        supported in the ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group to grant access to.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group to grant access to.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group to grant access to.
     * </p>
     * 
     * @return The name of the profiling group to grant access to.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group to grant access to.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group to grant access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling group. Do
     * not specify this when you add permissions to a profiling group for the first time. If a policy already exists on
     * the profiling group, you must specify the <code>revisionId</code>.
     * </p>
     * 
     * @param revisionId
     *        A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling
     *        group. Do not specify this when you add permissions to a profiling group for the first time. If a policy
     *        already exists on the profiling group, you must specify the <code>revisionId</code>.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling group. Do
     * not specify this when you add permissions to a profiling group for the first time. If a policy already exists on
     * the profiling group, you must specify the <code>revisionId</code>.
     * </p>
     * 
     * @return A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling
     *         group. Do not specify this when you add permissions to a profiling group for the first time. If a policy
     *         already exists on the profiling group, you must specify the <code>revisionId</code>.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling group. Do
     * not specify this when you add permissions to a profiling group for the first time. If a policy already exists on
     * the profiling group, you must specify the <code>revisionId</code>.
     * </p>
     * 
     * @param revisionId
     *        A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling
     *        group. Do not specify this when you add permissions to a profiling group for the first time. If a policy
     *        already exists on the profiling group, you must specify the <code>revisionId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getActionGroup() != null)
            sb.append("ActionGroup: ").append(getActionGroup()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPermissionRequest == false)
            return false;
        PutPermissionRequest other = (PutPermissionRequest) obj;
        if (other.getActionGroup() == null ^ this.getActionGroup() == null)
            return false;
        if (other.getActionGroup() != null && other.getActionGroup().equals(this.getActionGroup()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionGroup() == null) ? 0 : getActionGroup().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public PutPermissionRequest clone() {
        return (PutPermissionRequest) super.clone();
    }

}
