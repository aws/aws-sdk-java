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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class ListApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Maximum number of applications to list.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Name of the application to start the list with. When using pagination to retrieve the list, you don't need to
     * specify this parameter in the first request. However, in subsequent requests, you add the last application name
     * from the previous response to get the next page of applications.
     * </p>
     */
    private String exclusiveStartApplicationName;

    /**
     * <p>
     * Maximum number of applications to list.
     * </p>
     * 
     * @param limit
     *        Maximum number of applications to list.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of applications to list.
     * </p>
     * 
     * @return Maximum number of applications to list.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of applications to list.
     * </p>
     * 
     * @param limit
     *        Maximum number of applications to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Name of the application to start the list with. When using pagination to retrieve the list, you don't need to
     * specify this parameter in the first request. However, in subsequent requests, you add the last application name
     * from the previous response to get the next page of applications.
     * </p>
     * 
     * @param exclusiveStartApplicationName
     *        Name of the application to start the list with. When using pagination to retrieve the list, you don't need
     *        to specify this parameter in the first request. However, in subsequent requests, you add the last
     *        application name from the previous response to get the next page of applications.
     */

    public void setExclusiveStartApplicationName(String exclusiveStartApplicationName) {
        this.exclusiveStartApplicationName = exclusiveStartApplicationName;
    }

    /**
     * <p>
     * Name of the application to start the list with. When using pagination to retrieve the list, you don't need to
     * specify this parameter in the first request. However, in subsequent requests, you add the last application name
     * from the previous response to get the next page of applications.
     * </p>
     * 
     * @return Name of the application to start the list with. When using pagination to retrieve the list, you don't
     *         need to specify this parameter in the first request. However, in subsequent requests, you add the last
     *         application name from the previous response to get the next page of applications.
     */

    public String getExclusiveStartApplicationName() {
        return this.exclusiveStartApplicationName;
    }

    /**
     * <p>
     * Name of the application to start the list with. When using pagination to retrieve the list, you don't need to
     * specify this parameter in the first request. However, in subsequent requests, you add the last application name
     * from the previous response to get the next page of applications.
     * </p>
     * 
     * @param exclusiveStartApplicationName
     *        Name of the application to start the list with. When using pagination to retrieve the list, you don't need
     *        to specify this parameter in the first request. However, in subsequent requests, you add the last
     *        application name from the previous response to get the next page of applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationsRequest withExclusiveStartApplicationName(String exclusiveStartApplicationName) {
        setExclusiveStartApplicationName(exclusiveStartApplicationName);
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
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getExclusiveStartApplicationName() != null)
            sb.append("ExclusiveStartApplicationName: " + getExclusiveStartApplicationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationsRequest == false)
            return false;
        ListApplicationsRequest other = (ListApplicationsRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getExclusiveStartApplicationName() == null ^ this.getExclusiveStartApplicationName() == null)
            return false;
        if (other.getExclusiveStartApplicationName() != null
                && other.getExclusiveStartApplicationName().equals(this.getExclusiveStartApplicationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartApplicationName() == null) ? 0 : getExclusiveStartApplicationName().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsRequest clone() {
        return (ListApplicationsRequest) super.clone();
    }
}
