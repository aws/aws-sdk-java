/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListInstalledComponents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInstalledComponentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     */
    private String coreDeviceThingName;
    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the core device. This is also the name of the AWS IoT thing.
     */

    public void setCoreDeviceThingName(String coreDeviceThingName) {
        this.coreDeviceThingName = coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @return The name of the core device. This is also the name of the AWS IoT thing.
     */

    public String getCoreDeviceThingName() {
        return this.coreDeviceThingName;
    }

    /**
     * <p>
     * The name of the core device. This is also the name of the AWS IoT thing.
     * </p>
     * 
     * @param coreDeviceThingName
     *        The name of the core device. This is also the name of the AWS IoT thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstalledComponentsRequest withCoreDeviceThingName(String coreDeviceThingName) {
        setCoreDeviceThingName(coreDeviceThingName);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per paginated request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @return The maximum number of results to be returned per paginated request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstalledComponentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInstalledComponentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCoreDeviceThingName() != null)
            sb.append("CoreDeviceThingName: ").append(getCoreDeviceThingName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInstalledComponentsRequest == false)
            return false;
        ListInstalledComponentsRequest other = (ListInstalledComponentsRequest) obj;
        if (other.getCoreDeviceThingName() == null ^ this.getCoreDeviceThingName() == null)
            return false;
        if (other.getCoreDeviceThingName() != null && other.getCoreDeviceThingName().equals(this.getCoreDeviceThingName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreDeviceThingName() == null) ? 0 : getCoreDeviceThingName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInstalledComponentsRequest clone() {
        return (ListInstalledComponentsRequest) super.clone();
    }

}
