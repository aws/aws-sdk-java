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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The GET request to get all the usage plan keys representing the API keys added to a specified usage plan.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsagePlanKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-retrieved
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     */
    private String usagePlanId;
    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * A query parameter specifying the name of the to-be-returned usage plan keys.
     * </p>
     */
    private String nameQuery;

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-retrieved
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @param usagePlanId
     *        [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the
     *        to-be-retrieved <a>UsagePlanKey</a> resource representing a plan customer.
     */

    public void setUsagePlanId(String usagePlanId) {
        this.usagePlanId = usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-retrieved
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @return [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the
     *         to-be-retrieved <a>UsagePlanKey</a> resource representing a plan customer.
     */

    public String getUsagePlanId() {
        return this.usagePlanId;
    }

    /**
     * <p>
     * [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the to-be-retrieved
     * <a>UsagePlanKey</a> resource representing a plan customer.
     * </p>
     * 
     * @param usagePlanId
     *        [Required] The Id of the <a>UsagePlan</a> resource representing the usage plan containing the
     *        to-be-retrieved <a>UsagePlanKey</a> resource representing a plan customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlanKeysRequest withUsagePlanId(String usagePlanId) {
        setUsagePlanId(usagePlanId);
        return this;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @return The current pagination position in the paged result set.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The current pagination position in the paged result set.
     * </p>
     * 
     * @param position
     *        The current pagination position in the paged result set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlanKeysRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @return The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * </p>
     * 
     * @param limit
     *        The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlanKeysRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * A query parameter specifying the name of the to-be-returned usage plan keys.
     * </p>
     * 
     * @param nameQuery
     *        A query parameter specifying the name of the to-be-returned usage plan keys.
     */

    public void setNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
    }

    /**
     * <p>
     * A query parameter specifying the name of the to-be-returned usage plan keys.
     * </p>
     * 
     * @return A query parameter specifying the name of the to-be-returned usage plan keys.
     */

    public String getNameQuery() {
        return this.nameQuery;
    }

    /**
     * <p>
     * A query parameter specifying the name of the to-be-returned usage plan keys.
     * </p>
     * 
     * @param nameQuery
     *        A query parameter specifying the name of the to-be-returned usage plan keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlanKeysRequest withNameQuery(String nameQuery) {
        setNameQuery(nameQuery);
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
        if (getUsagePlanId() != null)
            sb.append("UsagePlanId: ").append(getUsagePlanId()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNameQuery() != null)
            sb.append("NameQuery: ").append(getNameQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsagePlanKeysRequest == false)
            return false;
        GetUsagePlanKeysRequest other = (GetUsagePlanKeysRequest) obj;
        if (other.getUsagePlanId() == null ^ this.getUsagePlanId() == null)
            return false;
        if (other.getUsagePlanId() != null && other.getUsagePlanId().equals(this.getUsagePlanId()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNameQuery() == null ^ this.getNameQuery() == null)
            return false;
        if (other.getNameQuery() != null && other.getNameQuery().equals(this.getNameQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsagePlanId() == null) ? 0 : getUsagePlanId().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNameQuery() == null) ? 0 : getNameQuery().hashCode());
        return hashCode;
    }

    @Override
    public GetUsagePlanKeysRequest clone() {
        return (GetUsagePlanKeysRequest) super.clone();
    }

}
