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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to list completed and failed managed actions.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEnvironmentManagedActionHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentManagedActionHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the target environment.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The pagination token returned by a previous request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for a single request.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     * 
     * @param environmentId
     *        The environment ID of the target environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     * 
     * @return The environment ID of the target environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The environment ID of the target environment.
     * </p>
     * 
     * @param environmentId
     *        The environment ID of the target environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionHistoryRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the target environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the target environment.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the target environment.
     * </p>
     * 
     * @return The name of the target environment.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the target environment.
     * </p>
     * 
     * @param environmentName
     *        The name of the target environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionHistoryRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The pagination token returned by a previous request.
     * </p>
     * 
     * @param nextToken
     *        The pagination token returned by a previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token returned by a previous request.
     * </p>
     * 
     * @return The pagination token returned by a previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token returned by a previous request.
     * </p>
     * 
     * @param nextToken
     *        The pagination token returned by a previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for a single request.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items to return for a single request.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of items to return for a single request.
     * </p>
     * 
     * @return The maximum number of items to return for a single request.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of items to return for a single request.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items to return for a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentManagedActionHistoryRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentManagedActionHistoryRequest == false)
            return false;
        DescribeEnvironmentManagedActionHistoryRequest other = (DescribeEnvironmentManagedActionHistoryRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentManagedActionHistoryRequest clone() {
        return (DescribeEnvironmentManagedActionHistoryRequest) super.clone();
    }

}
