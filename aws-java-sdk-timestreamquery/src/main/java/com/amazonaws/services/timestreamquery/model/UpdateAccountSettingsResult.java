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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateAccountSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configured maximum number of compute units the service will use at any point in time to serve your queries.
     * </p>
     */
    private Integer maxQueryTCU;
    /**
     * <p>
     * The pricing model for an account.
     * </p>
     */
    private String queryPricingModel;

    /**
     * <p>
     * The configured maximum number of compute units the service will use at any point in time to serve your queries.
     * </p>
     * 
     * @param maxQueryTCU
     *        The configured maximum number of compute units the service will use at any point in time to serve your
     *        queries.
     */

    public void setMaxQueryTCU(Integer maxQueryTCU) {
        this.maxQueryTCU = maxQueryTCU;
    }

    /**
     * <p>
     * The configured maximum number of compute units the service will use at any point in time to serve your queries.
     * </p>
     * 
     * @return The configured maximum number of compute units the service will use at any point in time to serve your
     *         queries.
     */

    public Integer getMaxQueryTCU() {
        return this.maxQueryTCU;
    }

    /**
     * <p>
     * The configured maximum number of compute units the service will use at any point in time to serve your queries.
     * </p>
     * 
     * @param maxQueryTCU
     *        The configured maximum number of compute units the service will use at any point in time to serve your
     *        queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsResult withMaxQueryTCU(Integer maxQueryTCU) {
        setMaxQueryTCU(maxQueryTCU);
        return this;
    }

    /**
     * <p>
     * The pricing model for an account.
     * </p>
     * 
     * @param queryPricingModel
     *        The pricing model for an account.
     * @see QueryPricingModel
     */

    public void setQueryPricingModel(String queryPricingModel) {
        this.queryPricingModel = queryPricingModel;
    }

    /**
     * <p>
     * The pricing model for an account.
     * </p>
     * 
     * @return The pricing model for an account.
     * @see QueryPricingModel
     */

    public String getQueryPricingModel() {
        return this.queryPricingModel;
    }

    /**
     * <p>
     * The pricing model for an account.
     * </p>
     * 
     * @param queryPricingModel
     *        The pricing model for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryPricingModel
     */

    public UpdateAccountSettingsResult withQueryPricingModel(String queryPricingModel) {
        setQueryPricingModel(queryPricingModel);
        return this;
    }

    /**
     * <p>
     * The pricing model for an account.
     * </p>
     * 
     * @param queryPricingModel
     *        The pricing model for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryPricingModel
     */

    public UpdateAccountSettingsResult withQueryPricingModel(QueryPricingModel queryPricingModel) {
        this.queryPricingModel = queryPricingModel.toString();
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
        if (getMaxQueryTCU() != null)
            sb.append("MaxQueryTCU: ").append(getMaxQueryTCU()).append(",");
        if (getQueryPricingModel() != null)
            sb.append("QueryPricingModel: ").append(getQueryPricingModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountSettingsResult == false)
            return false;
        UpdateAccountSettingsResult other = (UpdateAccountSettingsResult) obj;
        if (other.getMaxQueryTCU() == null ^ this.getMaxQueryTCU() == null)
            return false;
        if (other.getMaxQueryTCU() != null && other.getMaxQueryTCU().equals(this.getMaxQueryTCU()) == false)
            return false;
        if (other.getQueryPricingModel() == null ^ this.getQueryPricingModel() == null)
            return false;
        if (other.getQueryPricingModel() != null && other.getQueryPricingModel().equals(this.getQueryPricingModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxQueryTCU() == null) ? 0 : getMaxQueryTCU().hashCode());
        hashCode = prime * hashCode + ((getQueryPricingModel() == null) ? 0 : getQueryPricingModel().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountSettingsResult clone() {
        try {
            return (UpdateAccountSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
