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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the number of results that match the query. At this time, Amazon Web Services Resource Explorer
 * doesn't count more than 1,000 matches for any query. This structure provides information about whether the query
 * exceeded this limit.
 * </p>
 * <p>
 * This field is included in every page when you paginate the results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/ResourceCount" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query was
     * counted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean complete;
    /**
     * <p>
     * The number of resources that match the search query. This value can't exceed 1,000. If there are more than 1,000
     * resources that match the query, then only 1,000 are counted and the <code>Complete</code> field is set to false.
     * We recommend that you refine your query to return a smaller number of results.
     * </p>
     */
    private Long totalResources;

    /**
     * <p>
     * Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query was
     * counted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param complete
     *        Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search
     *        results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query
     *        was counted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     *        </p>
     *        </li>
     */

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * <p>
     * Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query was
     * counted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search
     *         results.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query
     *         was counted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     *         </p>
     *         </li>
     */

    public Boolean getComplete() {
        return this.complete;
    }

    /**
     * <p>
     * Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query was
     * counted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     * </p>
     * </li>
     * </ul>
     * 
     * @param complete
     *        Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search
     *        results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query
     *        was counted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCount withComplete(Boolean complete) {
        setComplete(complete);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query was
     * counted.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the <code>TotalResources</code> value represents an exhaustive count of search
     *         results.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>True</code>, it indicates that the search was exhaustive. Every resource that matches the query
     *         was counted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>False</code>, then the search reached the limit of 1,000 matching results, and stopped counting.
     *         </p>
     *         </li>
     */

    public Boolean isComplete() {
        return this.complete;
    }

    /**
     * <p>
     * The number of resources that match the search query. This value can't exceed 1,000. If there are more than 1,000
     * resources that match the query, then only 1,000 are counted and the <code>Complete</code> field is set to false.
     * We recommend that you refine your query to return a smaller number of results.
     * </p>
     * 
     * @param totalResources
     *        The number of resources that match the search query. This value can't exceed 1,000. If there are more than
     *        1,000 resources that match the query, then only 1,000 are counted and the <code>Complete</code> field is
     *        set to false. We recommend that you refine your query to return a smaller number of results.
     */

    public void setTotalResources(Long totalResources) {
        this.totalResources = totalResources;
    }

    /**
     * <p>
     * The number of resources that match the search query. This value can't exceed 1,000. If there are more than 1,000
     * resources that match the query, then only 1,000 are counted and the <code>Complete</code> field is set to false.
     * We recommend that you refine your query to return a smaller number of results.
     * </p>
     * 
     * @return The number of resources that match the search query. This value can't exceed 1,000. If there are more
     *         than 1,000 resources that match the query, then only 1,000 are counted and the <code>Complete</code>
     *         field is set to false. We recommend that you refine your query to return a smaller number of results.
     */

    public Long getTotalResources() {
        return this.totalResources;
    }

    /**
     * <p>
     * The number of resources that match the search query. This value can't exceed 1,000. If there are more than 1,000
     * resources that match the query, then only 1,000 are counted and the <code>Complete</code> field is set to false.
     * We recommend that you refine your query to return a smaller number of results.
     * </p>
     * 
     * @param totalResources
     *        The number of resources that match the search query. This value can't exceed 1,000. If there are more than
     *        1,000 resources that match the query, then only 1,000 are counted and the <code>Complete</code> field is
     *        set to false. We recommend that you refine your query to return a smaller number of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCount withTotalResources(Long totalResources) {
        setTotalResources(totalResources);
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
        if (getComplete() != null)
            sb.append("Complete: ").append(getComplete()).append(",");
        if (getTotalResources() != null)
            sb.append("TotalResources: ").append(getTotalResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceCount == false)
            return false;
        ResourceCount other = (ResourceCount) obj;
        if (other.getComplete() == null ^ this.getComplete() == null)
            return false;
        if (other.getComplete() != null && other.getComplete().equals(this.getComplete()) == false)
            return false;
        if (other.getTotalResources() == null ^ this.getTotalResources() == null)
            return false;
        if (other.getTotalResources() != null && other.getTotalResources().equals(this.getTotalResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplete() == null) ? 0 : getComplete().hashCode());
        hashCode = prime * hashCode + ((getTotalResources() == null) ? 0 : getTotalResources().hashCode());
        return hashCode;
    }

    @Override
    public ResourceCount clone() {
        try {
            return (ResourceCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourceexplorer2.model.transform.ResourceCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
