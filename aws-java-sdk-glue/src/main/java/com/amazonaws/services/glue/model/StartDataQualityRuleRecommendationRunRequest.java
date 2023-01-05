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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartDataQualityRuleRecommendationRun"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDataQualityRuleRecommendationRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The data source (Glue table) associated with this run.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * An IAM role supplied to encrypt the results of the run.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * </p>
     */
    private Integer numberOfWorkers;
    /**
     * <p>
     * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * A name for the ruleset.
     * </p>
     */
    private String createdRulesetName;
    /**
     * <p>
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting
     * multiple instances of the same resource.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The data source (Glue table) associated with this run.
     * </p>
     * 
     * @param dataSource
     *        The data source (Glue table) associated with this run.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source (Glue table) associated with this run.
     * </p>
     * 
     * @return The data source (Glue table) associated with this run.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data source (Glue table) associated with this run.
     * </p>
     * 
     * @param dataSource
     *        The data source (Glue table) associated with this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataQualityRuleRecommendationRunRequest withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * An IAM role supplied to encrypt the results of the run.
     * </p>
     * 
     * @param role
     *        An IAM role supplied to encrypt the results of the run.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * An IAM role supplied to encrypt the results of the run.
     * </p>
     * 
     * @return An IAM role supplied to encrypt the results of the run.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * An IAM role supplied to encrypt the results of the run.
     * </p>
     * 
     * @param role
     *        An IAM role supplied to encrypt the results of the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataQualityRuleRecommendationRunRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     */

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    /**
     * <p>
     * The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * </p>
     * 
     * @return The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     */

    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * <p>
     * The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * </p>
     * 
     * @param numberOfWorkers
     *        The number of <code>G.1X</code> workers to be used in the run. The default is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataQualityRuleRecommendationRunRequest withNumberOfWorkers(Integer numberOfWorkers) {
        setNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * <p>
     * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @return The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     *         terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     * terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * </p>
     * 
     * @param timeout
     *        The timeout for a run in minutes. This is the maximum time that a run can consume resources before it is
     *        terminated and enters <code>TIMEOUT</code> status. The default is 2,880 minutes (48 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataQualityRuleRecommendationRunRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * A name for the ruleset.
     * </p>
     * 
     * @param createdRulesetName
     *        A name for the ruleset.
     */

    public void setCreatedRulesetName(String createdRulesetName) {
        this.createdRulesetName = createdRulesetName;
    }

    /**
     * <p>
     * A name for the ruleset.
     * </p>
     * 
     * @return A name for the ruleset.
     */

    public String getCreatedRulesetName() {
        return this.createdRulesetName;
    }

    /**
     * <p>
     * A name for the ruleset.
     * </p>
     * 
     * @param createdRulesetName
     *        A name for the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataQualityRuleRecommendationRunRequest withCreatedRulesetName(String createdRulesetName) {
        setCreatedRulesetName(createdRulesetName);
        return this;
    }

    /**
     * <p>
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting
     * multiple instances of the same resource.
     * </p>
     * 
     * @param clientToken
     *        Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or
     *        starting multiple instances of the same resource.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting
     * multiple instances of the same resource.
     * </p>
     * 
     * @return Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or
     *         starting multiple instances of the same resource.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting
     * multiple instances of the same resource.
     * </p>
     * 
     * @param clientToken
     *        Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or
     *        starting multiple instances of the same resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDataQualityRuleRecommendationRunRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getNumberOfWorkers() != null)
            sb.append("NumberOfWorkers: ").append(getNumberOfWorkers()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getCreatedRulesetName() != null)
            sb.append("CreatedRulesetName: ").append(getCreatedRulesetName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDataQualityRuleRecommendationRunRequest == false)
            return false;
        StartDataQualityRuleRecommendationRunRequest other = (StartDataQualityRuleRecommendationRunRequest) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getNumberOfWorkers() == null ^ this.getNumberOfWorkers() == null)
            return false;
        if (other.getNumberOfWorkers() != null && other.getNumberOfWorkers().equals(this.getNumberOfWorkers()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getCreatedRulesetName() == null ^ this.getCreatedRulesetName() == null)
            return false;
        if (other.getCreatedRulesetName() != null && other.getCreatedRulesetName().equals(this.getCreatedRulesetName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getNumberOfWorkers() == null) ? 0 : getNumberOfWorkers().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getCreatedRulesetName() == null) ? 0 : getCreatedRulesetName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartDataQualityRuleRecommendationRunRequest clone() {
        return (StartDataQualityRuleRecommendationRunRequest) super.clone();
    }

}
