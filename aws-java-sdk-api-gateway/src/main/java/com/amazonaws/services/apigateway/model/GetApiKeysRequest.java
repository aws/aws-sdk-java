/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to get information about the current <a>ApiKeys</a> resource.
 * </p>
 */
public class GetApiKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The position of the current <a>ApiKeys</a> resource to get information about.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of <a>ApiKeys</a> to get information about.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The name of queried API keys.
     * </p>
     */
    private String nameQuery;

    private String customerId;
    /**
     * <p>
     * A boolean flag to specify whether (<code>true</code>) or not (<code>false</code>) the result contains key values.
     * </p>
     */
    private Boolean includeValues;

    /**
     * <p>
     * The position of the current <a>ApiKeys</a> resource to get information about.
     * </p>
     * 
     * @param position
     *        The position of the current <a>ApiKeys</a> resource to get information about.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the current <a>ApiKeys</a> resource to get information about.
     * </p>
     * 
     * @return The position of the current <a>ApiKeys</a> resource to get information about.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The position of the current <a>ApiKeys</a> resource to get information about.
     * </p>
     * 
     * @param position
     *        The position of the current <a>ApiKeys</a> resource to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApiKeysRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of <a>ApiKeys</a> to get information about.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>ApiKeys</a> to get information about.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of <a>ApiKeys</a> to get information about.
     * </p>
     * 
     * @return The maximum number of <a>ApiKeys</a> to get information about.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of <a>ApiKeys</a> to get information about.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>ApiKeys</a> to get information about.
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
     * @param customerId
     */

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * @param customerId
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNameQuery() != null)
            sb.append("NameQuery: " + getNameQuery() + ",");
        if (getCustomerId() != null)
            sb.append("CustomerId: " + getCustomerId() + ",");
        if (getIncludeValues() != null)
            sb.append("IncludeValues: " + getIncludeValues());
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
