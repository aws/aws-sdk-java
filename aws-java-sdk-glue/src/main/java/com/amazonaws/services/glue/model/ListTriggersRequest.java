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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListTriggers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTriggersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A continuation token, if this is a continuation request.
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
     * The maximum size of a list to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     * 
     * @return A continuation token, if this is a continuation request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation request.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is a continuation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTriggersRequest withNextToken(String nextToken) {
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

    public ListTriggersRequest withDependentJobName(String dependentJobName) {
        setDependentJobName(dependentJobName);
        return this;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of a list to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @return The maximum size of a list to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum size of a list to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTriggersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     * 
     * @return Specifies to return only these tagged resources.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     * 
     * @param tags
     *        Specifies to return only these tagged resources.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Specifies to return only these tagged resources.
     * </p>
     * 
     * @param tags
     *        Specifies to return only these tagged resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTriggersRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public ListTriggersRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTriggersRequest clearTagsEntries() {
        this.tags = null;
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
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTriggersRequest == false)
            return false;
        ListTriggersRequest other = (ListTriggersRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ListTriggersRequest clone() {
        return (ListTriggersRequest) super.clone();
    }

}
