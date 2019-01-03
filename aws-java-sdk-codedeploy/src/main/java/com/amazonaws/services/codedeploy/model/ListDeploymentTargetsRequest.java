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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentTargets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * A token identifier returned from the previous <code>ListDeploymentTargets</code> call. It can be used to return
     * the next set of deployment targets in the list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A key used to filter the returned targets.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> targetFilters;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentTargetsRequest withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * A token identifier returned from the previous <code>ListDeploymentTargets</code> call. It can be used to return
     * the next set of deployment targets in the list.
     * </p>
     * 
     * @param nextToken
     *        A token identifier returned from the previous <code>ListDeploymentTargets</code> call. It can be used to
     *        return the next set of deployment targets in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token identifier returned from the previous <code>ListDeploymentTargets</code> call. It can be used to return
     * the next set of deployment targets in the list.
     * </p>
     * 
     * @return A token identifier returned from the previous <code>ListDeploymentTargets</code> call. It can be used to
     *         return the next set of deployment targets in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token identifier returned from the previous <code>ListDeploymentTargets</code> call. It can be used to return
     * the next set of deployment targets in the list.
     * </p>
     * 
     * @param nextToken
     *        A token identifier returned from the previous <code>ListDeploymentTargets</code> call. It can be used to
     *        return the next set of deployment targets in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentTargetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A key used to filter the returned targets.
     * </p>
     * 
     * @return A key used to filter the returned targets.
     */

    public java.util.Map<String, java.util.List<String>> getTargetFilters() {
        return targetFilters;
    }

    /**
     * <p>
     * A key used to filter the returned targets.
     * </p>
     * 
     * @param targetFilters
     *        A key used to filter the returned targets.
     */

    public void setTargetFilters(java.util.Map<String, java.util.List<String>> targetFilters) {
        this.targetFilters = targetFilters;
    }

    /**
     * <p>
     * A key used to filter the returned targets.
     * </p>
     * 
     * @param targetFilters
     *        A key used to filter the returned targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentTargetsRequest withTargetFilters(java.util.Map<String, java.util.List<String>> targetFilters) {
        setTargetFilters(targetFilters);
        return this;
    }

    public ListDeploymentTargetsRequest addTargetFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.targetFilters) {
            this.targetFilters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.targetFilters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.targetFilters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TargetFilters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentTargetsRequest clearTargetFiltersEntries() {
        this.targetFilters = null;
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
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTargetFilters() != null)
            sb.append("TargetFilters: ").append(getTargetFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDeploymentTargetsRequest == false)
            return false;
        ListDeploymentTargetsRequest other = (ListDeploymentTargetsRequest) obj;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTargetFilters() == null ^ this.getTargetFilters() == null)
            return false;
        if (other.getTargetFilters() != null && other.getTargetFilters().equals(this.getTargetFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTargetFilters() == null) ? 0 : getTargetFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentTargetsRequest clone() {
        return (ListDeploymentTargetsRequest) super.clone();
    }

}
