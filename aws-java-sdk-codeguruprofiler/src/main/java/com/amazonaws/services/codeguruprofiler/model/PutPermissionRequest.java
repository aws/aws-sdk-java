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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the putPermissionRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/PutPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPermissionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of actions that the users and roles can perform on the profiling group.
     * </p>
     */
    private String actionGroup;
    /**
     * <p>
     * The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * The name of the profiling group.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * A unique identifier for the current revision of the policy. This is required, if a policy exists for the
     * profiling group. This is not required when creating the policy for the first time.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The list of actions that the users and roles can perform on the profiling group.
     * </p>
     * 
     * @param actionGroup
     *        The list of actions that the users and roles can perform on the profiling group.
     * @see ActionGroup
     */

    public void setActionGroup(String actionGroup) {
        this.actionGroup = actionGroup;
    }

    /**
     * <p>
     * The list of actions that the users and roles can perform on the profiling group.
     * </p>
     * 
     * @return The list of actions that the users and roles can perform on the profiling group.
     * @see ActionGroup
     */

    public String getActionGroup() {
        return this.actionGroup;
    }

    /**
     * <p>
     * The list of actions that the users and roles can perform on the profiling group.
     * </p>
     * 
     * @param actionGroup
     *        The list of actions that the users and roles can perform on the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroup
     */

    public PutPermissionRequest withActionGroup(String actionGroup) {
        setActionGroup(actionGroup);
        return this;
    }

    /**
     * <p>
     * The list of actions that the users and roles can perform on the profiling group.
     * </p>
     * 
     * @param actionGroup
     *        The list of actions that the users and roles can perform on the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroup
     */

    public PutPermissionRequest withActionGroup(ActionGroup actionGroup) {
        this.actionGroup = actionGroup.toString();
        return this;
    }

    /**
     * <p>
     * The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
     * </p>
     * 
     * @return The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
     * </p>
     * 
     * @param principals
     *        The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
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
     * The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
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
     * The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
     * </p>
     * 
     * @param principals
     *        The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @return The name of the profiling group.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy. This is required, if a policy exists for the
     * profiling group. This is not required when creating the policy for the first time.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier for the current revision of the policy. This is required, if a policy exists for the
     *        profiling group. This is not required when creating the policy for the first time.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy. This is required, if a policy exists for the
     * profiling group. This is not required when creating the policy for the first time.
     * </p>
     * 
     * @return A unique identifier for the current revision of the policy. This is required, if a policy exists for the
     *         profiling group. This is not required when creating the policy for the first time.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * A unique identifier for the current revision of the policy. This is required, if a policy exists for the
     * profiling group. This is not required when creating the policy for the first time.
     * </p>
     * 
     * @param revisionId
     *        A unique identifier for the current revision of the policy. This is required, if a policy exists for the
     *        profiling group. This is not required when creating the policy for the first time.
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
