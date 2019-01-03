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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetTriggers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTriggersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the job for which to retrieve triggers. The trigger that can start this job will be returned, and if
     * there is no such trigger, all triggers will be returned.
     * </p>
     */
    private String dependentJobName;
    /**
     * <p>
     * The maximum size of the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @return A continuation token, if this is a continuation call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTriggersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the job for which to retrieve triggers. The trigger that can start this job will be returned, and if
     * there is no such trigger, all triggers will be returned.
     * </p>
     * 
     * @param dependentJobName
     *        The name of the job for which to retrieve triggers. The trigger that can start this job will be returned,
     *        and if there is no such trigger, all triggers will be returned.
     */

    public void setDependentJobName(String dependentJobName) {
        this.dependentJobName = dependentJobName;
    }

    /**
     * <p>
     * The name of the job for which to retrieve triggers. The trigger that can start this job will be returned, and if
     * there is no such trigger, all triggers will be returned.
     * </p>
     * 
     * @return The name of the job for which to retrieve triggers. The trigger that can start this job will be returned,
     *         and if there is no such trigger, all triggers will be returned.
     */

    public String getDependentJobName() {
        return this.dependentJobName;
    }

    /**
     * <p>
     * The name of the job for which to retrieve triggers. The trigger that can start this job will be returned, and if
     * there is no such trigger, all triggers will be returned.
     * </p>
     * 
     * @param dependentJobName
     *        The name of the job for which to retrieve triggers. The trigger that can start this job will be returned,
     *        and if there is no such trigger, all triggers will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTriggersRequest withDependentJobName(String dependentJobName) {
        setDependentJobName(dependentJobName);
        return this;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @return The maximum size of the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTriggersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getDependentJobName() != null)
            sb.append("DependentJobName: ").append(getDependentJobName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTriggersRequest == false)
            return false;
        GetTriggersRequest other = (GetTriggersRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getDependentJobName() == null ^ this.getDependentJobName() == null)
            return false;
        if (other.getDependentJobName() != null && other.getDependentJobName().equals(this.getDependentJobName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getDependentJobName() == null) ? 0 : getDependentJobName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetTriggersRequest clone() {
        return (GetTriggersRequest) super.clone();
    }

}
