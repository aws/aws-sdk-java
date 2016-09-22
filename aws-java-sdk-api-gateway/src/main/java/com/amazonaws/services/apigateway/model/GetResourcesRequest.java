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
 * Request to list information about a collection of resources.
 * </p>
 */
public class GetResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>RestApi</a> identifier for the Resource.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The position of the next set of results in the current <a>Resources</a> resource to get information about.
     * </p>
     */
    private String position;
    /**
     * <p>
     * The maximum number of <a>Resource</a> resources in the collection to get information about. The default limit is
     * 25. It should be an integer between 1 - 500.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The <a>RestApi</a> identifier for the Resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the Resource.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the Resource.
     * </p>
     * 
     * @return The <a>RestApi</a> identifier for the Resource.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The <a>RestApi</a> identifier for the Resource.
     * </p>
     * 
     * @param restApiId
     *        The <a>RestApi</a> identifier for the Resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The position of the next set of results in the current <a>Resources</a> resource to get information about.
     * </p>
     * 
     * @param position
     *        The position of the next set of results in the current <a>Resources</a> resource to get information about.
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The position of the next set of results in the current <a>Resources</a> resource to get information about.
     * </p>
     * 
     * @return The position of the next set of results in the current <a>Resources</a> resource to get information
     *         about.
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The position of the next set of results in the current <a>Resources</a> resource to get information about.
     * </p>
     * 
     * @param position
     *        The position of the next set of results in the current <a>Resources</a> resource to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The maximum number of <a>Resource</a> resources in the collection to get information about. The default limit is
     * 25. It should be an integer between 1 - 500.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>Resource</a> resources in the collection to get information about. The default
     *        limit is 25. It should be an integer between 1 - 500.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of <a>Resource</a> resources in the collection to get information about. The default limit is
     * 25. It should be an integer between 1 - 500.
     * </p>
     * 
     * @return The maximum number of <a>Resource</a> resources in the collection to get information about. The default
     *         limit is 25. It should be an integer between 1 - 500.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of <a>Resource</a> resources in the collection to get information about. The default limit is
     * 25. It should be an integer between 1 - 500.
     * </p>
     * 
     * @param limit
     *        The maximum number of <a>Resource</a> resources in the collection to get information about. The default
     *        limit is 25. It should be an integer between 1 - 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcesRequest == false)
            return false;
        GetResourcesRequest other = (GetResourcesRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcesRequest clone() {
        return (GetResourcesRequest) super.clone();
    }
}
