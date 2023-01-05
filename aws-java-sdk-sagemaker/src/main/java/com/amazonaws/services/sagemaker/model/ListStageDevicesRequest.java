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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListStageDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStageDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The response from the last list when returning a list large enough to neeed tokening.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of requests to select.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     */
    private String edgeDeploymentPlanName;
    /**
     * <p>
     * Toggle for excluding devices deployed in other stages.
     * </p>
     */
    private Boolean excludeDevicesDeployedInOtherStage;
    /**
     * <p>
     * The name of the stage in the deployment.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The response from the last list when returning a list large enough to neeed tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to neeed tokening.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to neeed tokening.
     * </p>
     * 
     * @return The response from the last list when returning a list large enough to neeed tokening.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to neeed tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to neeed tokening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDevicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of requests to select.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of requests to select.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of requests to select.
     * </p>
     * 
     * @return The maximum number of requests to select.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of requests to select.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of requests to select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDevicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the edge deployment plan.
     */

    public void setEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        this.edgeDeploymentPlanName = edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @return The name of the edge deployment plan.
     */

    public String getEdgeDeploymentPlanName() {
        return this.edgeDeploymentPlanName;
    }

    /**
     * <p>
     * The name of the edge deployment plan.
     * </p>
     * 
     * @param edgeDeploymentPlanName
     *        The name of the edge deployment plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDevicesRequest withEdgeDeploymentPlanName(String edgeDeploymentPlanName) {
        setEdgeDeploymentPlanName(edgeDeploymentPlanName);
        return this;
    }

    /**
     * <p>
     * Toggle for excluding devices deployed in other stages.
     * </p>
     * 
     * @param excludeDevicesDeployedInOtherStage
     *        Toggle for excluding devices deployed in other stages.
     */

    public void setExcludeDevicesDeployedInOtherStage(Boolean excludeDevicesDeployedInOtherStage) {
        this.excludeDevicesDeployedInOtherStage = excludeDevicesDeployedInOtherStage;
    }

    /**
     * <p>
     * Toggle for excluding devices deployed in other stages.
     * </p>
     * 
     * @return Toggle for excluding devices deployed in other stages.
     */

    public Boolean getExcludeDevicesDeployedInOtherStage() {
        return this.excludeDevicesDeployedInOtherStage;
    }

    /**
     * <p>
     * Toggle for excluding devices deployed in other stages.
     * </p>
     * 
     * @param excludeDevicesDeployedInOtherStage
     *        Toggle for excluding devices deployed in other stages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDevicesRequest withExcludeDevicesDeployedInOtherStage(Boolean excludeDevicesDeployedInOtherStage) {
        setExcludeDevicesDeployedInOtherStage(excludeDevicesDeployedInOtherStage);
        return this;
    }

    /**
     * <p>
     * Toggle for excluding devices deployed in other stages.
     * </p>
     * 
     * @return Toggle for excluding devices deployed in other stages.
     */

    public Boolean isExcludeDevicesDeployedInOtherStage() {
        return this.excludeDevicesDeployedInOtherStage;
    }

    /**
     * <p>
     * The name of the stage in the deployment.
     * </p>
     * 
     * @param stageName
     *        The name of the stage in the deployment.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage in the deployment.
     * </p>
     * 
     * @return The name of the stage in the deployment.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage in the deployment.
     * </p>
     * 
     * @param stageName
     *        The name of the stage in the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStageDevicesRequest withStageName(String stageName) {
        setStageName(stageName);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getEdgeDeploymentPlanName() != null)
            sb.append("EdgeDeploymentPlanName: ").append(getEdgeDeploymentPlanName()).append(",");
        if (getExcludeDevicesDeployedInOtherStage() != null)
            sb.append("ExcludeDevicesDeployedInOtherStage: ").append(getExcludeDevicesDeployedInOtherStage()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStageDevicesRequest == false)
            return false;
        ListStageDevicesRequest other = (ListStageDevicesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getEdgeDeploymentPlanName() == null ^ this.getEdgeDeploymentPlanName() == null)
            return false;
        if (other.getEdgeDeploymentPlanName() != null && other.getEdgeDeploymentPlanName().equals(this.getEdgeDeploymentPlanName()) == false)
            return false;
        if (other.getExcludeDevicesDeployedInOtherStage() == null ^ this.getExcludeDevicesDeployedInOtherStage() == null)
            return false;
        if (other.getExcludeDevicesDeployedInOtherStage() != null
                && other.getExcludeDevicesDeployedInOtherStage().equals(this.getExcludeDevicesDeployedInOtherStage()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getEdgeDeploymentPlanName() == null) ? 0 : getEdgeDeploymentPlanName().hashCode());
        hashCode = prime * hashCode + ((getExcludeDevicesDeployedInOtherStage() == null) ? 0 : getExcludeDevicesDeployedInOtherStage().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public ListStageDevicesRequest clone() {
        return (ListStageDevicesRequest) super.clone();
    }

}
