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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentTargets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentTargetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> targetIds;
    /**
     * <p>
     * If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent
     * <code>ListDeploymentTargets</code> call to return the next set of deployment targets in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     * 
     * @return The unique IDs of deployment targets.
     */

    public java.util.List<String> getTargetIds() {
        if (targetIds == null) {
            targetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return targetIds;
    }

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     * 
     * @param targetIds
     *        The unique IDs of deployment targets.
     */

    public void setTargetIds(java.util.Collection<String> targetIds) {
        if (targetIds == null) {
            this.targetIds = null;
            return;
        }

        this.targetIds = new com.amazonaws.internal.SdkInternalList<String>(targetIds);
    }

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIds(java.util.Collection)} or {@link #withTargetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetIds
     *        The unique IDs of deployment targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentTargetsResult withTargetIds(String... targetIds) {
        if (this.targetIds == null) {
            setTargetIds(new com.amazonaws.internal.SdkInternalList<String>(targetIds.length));
        }
        for (String ele : targetIds) {
            this.targetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique IDs of deployment targets.
     * </p>
     * 
     * @param targetIds
     *        The unique IDs of deployment targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentTargetsResult withTargetIds(java.util.Collection<String> targetIds) {
        setTargetIds(targetIds);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent
     * <code>ListDeploymentTargets</code> call to return the next set of deployment targets in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, a token identifier is also returned. It can be used in a
     *        subsequent <code>ListDeploymentTargets</code> call to return the next set of deployment targets in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent
     * <code>ListDeploymentTargets</code> call to return the next set of deployment targets in the list.
     * </p>
     * 
     * @return If a large amount of information is returned, a token identifier is also returned. It can be used in a
     *         subsequent <code>ListDeploymentTargets</code> call to return the next set of deployment targets in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent
     * <code>ListDeploymentTargets</code> call to return the next set of deployment targets in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, a token identifier is also returned. It can be used in a
     *        subsequent <code>ListDeploymentTargets</code> call to return the next set of deployment targets in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentTargetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTargetIds() != null)
            sb.append("TargetIds: ").append(getTargetIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentTargetsResult == false)
            return false;
        ListDeploymentTargetsResult other = (ListDeploymentTargetsResult) obj;
        if (other.getTargetIds() == null ^ this.getTargetIds() == null)
            return false;
        if (other.getTargetIds() != null && other.getTargetIds().equals(this.getTargetIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetIds() == null) ? 0 : getTargetIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentTargetsResult clone() {
        try {
            return (ListDeploymentTargetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
