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
 * A request to get information about the current <a>ApiKeys</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApiKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name of queried API keys.
     * </p>
     */
    private String nameQuery;
    /**
     * <p>
     * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
     * </p>
     */
    private String customerId;
    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key values.
     * </p>
     */
    private Boolean includeValues;

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

    public GetApiKeysRequest withPosition(String position) {
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

    public GetApiKeysRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The name of queried API keys.
     * </p>
     * 
     * @param nameQuery
     *        The name of queried API keys.
     */

    public void setNameQuery(String nameQuery) {
        this.nameQuery = nameQuery;
    }

    /**
     * <p>
     * The name of queried API keys.
     * </p>
     * 
     * @return The name of queried API keys.
     */

    public String getNameQuery() {
        return this.nameQuery;
    }

    /**
     * <p>
     * The name of queried API keys.
     * </p>
     * 
     * @param nameQuery
     *        The name of queried API keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysRequest withNameQuery(String nameQuery) {
        setNameQuery(nameQuery);
        return this;
    }

    /**
     * <p>
     * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
     * </p>
     * 
     * @param customerId
     *        The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
     */

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * <p>
     * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
     * </p>
     * 
     * @return The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * <p>
     * The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
     * </p>
     * 
     * @param customerId
     *        The identifier of a customer in AWS Marketplace or an external system, such as a developer portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysRequest withCustomerId(String customerId) {
        setCustomerId(customerId);
        return this;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key values.
     * </p>
     * 
     * @param includeValues
     *        A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key
     *        values.
     */

    public void setIncludeValues(Boolean includeValues) {
        this.includeValues = includeValues;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key values.
     * </p>
     * 
     * @return A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key
     *         values.
     */

    public Boolean getIncludeValues() {
        return this.includeValues;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key values.
     * </p>
     * 
     * @param includeValues
     *        A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key
     *        values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysRequest withIncludeValues(Boolean includeValues) {
        setIncludeValues(includeValues);
        return this;
    }

    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key values.
     * </p>
     * 
     * @return A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key
     *         values.
     */

    public Boolean isIncludeValues() {
        return this.includeValues;
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
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getNameQuery() != null)
            sb.append("NameQuery: ").append(getNameQuery()).append(",");
        if (getCustomerId() != null)
            sb.append("CustomerId: ").append(getCustomerId()).append(",");
        if (getIncludeValues() != null)
            sb.append("IncludeValues: ").append(getIncludeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApiKeysRequest == false)
            return false;
        GetApiKeysRequest other = (GetApiKeysRequest) obj;
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
        if (other.getCustomerId() == null ^ this.getCustomerId() == null)
            return false;
        if (other.getCustomerId() != null && other.getCustomerId().equals(this.getCustomerId()) == false)
            return false;
        if (other.getIncludeValues() == null ^ this.getIncludeValues() == null)
            return false;
        if (other.getIncludeValues() != null && other.getIncludeValues().equals(this.getIncludeValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNameQuery() == null) ? 0 : getNameQuery().hashCode());
        hashCode = prime * hashCode + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        hashCode = prime * hashCode + ((getIncludeValues() == null) ? 0 : getIncludeValues().hashCode());
        return hashCode;
    }

    @Override
    public GetApiKeysRequest clone() {
        return (GetApiKeysRequest) super.clone();
    }

}
