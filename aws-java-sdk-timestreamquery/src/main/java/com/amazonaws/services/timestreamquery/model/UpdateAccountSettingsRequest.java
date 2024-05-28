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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/UpdateAccountSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of compute units the service will use at any point in time to serve your queries. To run
     * queries, you must set a minimum capacity of 4 TCU. You can set the maximum number of TCU in multiples of 4, for
     * example, 4, 8, 16, 32, and so on.
     * </p>
     * <p>
     * The maximum value supported for <code>MaxQueryTCU</code> is 1000. To request an increase to this soft limit,
     * contact Amazon Web Services Support. For information about the default quota for maxQueryTCU, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.default">Default
     * quotas</a>.
     * </p>
     */
    private Integer maxQueryTCU;
    /**
     * <p>
     * The pricing model for queries in an account.
     * </p>
     */
    private String queryPricingModel;

    /**
     * <p>
     * The maximum number of compute units the service will use at any point in time to serve your queries. To run
     * queries, you must set a minimum capacity of 4 TCU. You can set the maximum number of TCU in multiples of 4, for
     * example, 4, 8, 16, 32, and so on.
     * </p>
     * <p>
     * The maximum value supported for <code>MaxQueryTCU</code> is 1000. To request an increase to this soft limit,
     * contact Amazon Web Services Support. For information about the default quota for maxQueryTCU, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.default">Default
     * quotas</a>.
     * </p>
     * 
     * @param maxQueryTCU
     *        The maximum number of compute units the service will use at any point in time to serve your queries. To
     *        run queries, you must set a minimum capacity of 4 TCU. You can set the maximum number of TCU in multiples
     *        of 4, for example, 4, 8, 16, 32, and so on.</p>
     *        <p>
     *        The maximum value supported for <code>MaxQueryTCU</code> is 1000. To request an increase to this soft
     *        limit, contact Amazon Web Services Support. For information about the default quota for maxQueryTCU, see
     *        <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.default">
     *        Default quotas</a>.
     */

    public void setMaxQueryTCU(Integer maxQueryTCU) {
        this.maxQueryTCU = maxQueryTCU;
    }

    /**
     * <p>
     * The maximum number of compute units the service will use at any point in time to serve your queries. To run
     * queries, you must set a minimum capacity of 4 TCU. You can set the maximum number of TCU in multiples of 4, for
     * example, 4, 8, 16, 32, and so on.
     * </p>
     * <p>
     * The maximum value supported for <code>MaxQueryTCU</code> is 1000. To request an increase to this soft limit,
     * contact Amazon Web Services Support. For information about the default quota for maxQueryTCU, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.default">Default
     * quotas</a>.
     * </p>
     * 
     * @return The maximum number of compute units the service will use at any point in time to serve your queries. To
     *         run queries, you must set a minimum capacity of 4 TCU. You can set the maximum number of TCU in multiples
     *         of 4, for example, 4, 8, 16, 32, and so on.</p>
     *         <p>
     *         The maximum value supported for <code>MaxQueryTCU</code> is 1000. To request an increase to this soft
     *         limit, contact Amazon Web Services Support. For information about the default quota for maxQueryTCU, see
     *         <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.default">
     *         Default quotas</a>.
     */

    public Integer getMaxQueryTCU() {
        return this.maxQueryTCU;
    }

    /**
     * <p>
     * The maximum number of compute units the service will use at any point in time to serve your queries. To run
     * queries, you must set a minimum capacity of 4 TCU. You can set the maximum number of TCU in multiples of 4, for
     * example, 4, 8, 16, 32, and so on.
     * </p>
     * <p>
     * The maximum value supported for <code>MaxQueryTCU</code> is 1000. To request an increase to this soft limit,
     * contact Amazon Web Services Support. For information about the default quota for maxQueryTCU, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.default">Default
     * quotas</a>.
     * </p>
     * 
     * @param maxQueryTCU
     *        The maximum number of compute units the service will use at any point in time to serve your queries. To
     *        run queries, you must set a minimum capacity of 4 TCU. You can set the maximum number of TCU in multiples
     *        of 4, for example, 4, 8, 16, 32, and so on.</p>
     *        <p>
     *        The maximum value supported for <code>MaxQueryTCU</code> is 1000. To request an increase to this soft
     *        limit, contact Amazon Web Services Support. For information about the default quota for maxQueryTCU, see
     *        <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html#limits.default">
     *        Default quotas</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withMaxQueryTCU(Integer maxQueryTCU) {
        setMaxQueryTCU(maxQueryTCU);
        return this;
    }

    /**
     * <p>
     * The pricing model for queries in an account.
     * </p>
     * 
     * @param queryPricingModel
     *        The pricing model for queries in an account.
     * @see QueryPricingModel
     */

    public void setQueryPricingModel(String queryPricingModel) {
        this.queryPricingModel = queryPricingModel;
    }

    /**
     * <p>
     * The pricing model for queries in an account.
     * </p>
     * 
     * @return The pricing model for queries in an account.
     * @see QueryPricingModel
     */

    public String getQueryPricingModel() {
        return this.queryPricingModel;
    }

    /**
     * <p>
     * The pricing model for queries in an account.
     * </p>
     * 
     * @param queryPricingModel
     *        The pricing model for queries in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryPricingModel
     */

    public UpdateAccountSettingsRequest withQueryPricingModel(String queryPricingModel) {
        setQueryPricingModel(queryPricingModel);
        return this;
    }

    /**
     * <p>
     * The pricing model for queries in an account.
     * </p>
     * 
     * @param queryPricingModel
     *        The pricing model for queries in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryPricingModel
     */

    public UpdateAccountSettingsRequest withQueryPricingModel(QueryPricingModel queryPricingModel) {
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

        if (obj instanceof UpdateAccountSettingsRequest == false)
            return false;
        UpdateAccountSettingsRequest other = (UpdateAccountSettingsRequest) obj;
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
    public UpdateAccountSettingsRequest clone() {
        return (UpdateAccountSettingsRequest) super.clone();
    }

}
