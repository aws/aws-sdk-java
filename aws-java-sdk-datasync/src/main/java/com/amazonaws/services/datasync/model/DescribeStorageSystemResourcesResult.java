/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageSystemResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The information collected about your storage system's resources. A response can also include Amazon Web Services
     * storage service recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-findings.html">storage resource
     * information</a> collected by and <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >recommendations</a> provided by DataSync Discovery.
     * </p>
     */
    private ResourceDetails resourceDetails;
    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The information collected about your storage system's resources. A response can also include Amazon Web Services
     * storage service recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-findings.html">storage resource
     * information</a> collected by and <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >recommendations</a> provided by DataSync Discovery.
     * </p>
     * 
     * @param resourceDetails
     *        The information collected about your storage system's resources. A response can also include Amazon Web
     *        Services storage service recommendations.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-findings.html">storage
     *        resource information</a> collected by and <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >recommendations</a> provided by DataSync Discovery.
     */

    public void setResourceDetails(ResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * The information collected about your storage system's resources. A response can also include Amazon Web Services
     * storage service recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-findings.html">storage resource
     * information</a> collected by and <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >recommendations</a> provided by DataSync Discovery.
     * </p>
     * 
     * @return The information collected about your storage system's resources. A response can also include Amazon Web
     *         Services storage service recommendations.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-findings.html">storage
     *         resource information</a> collected by and <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *         >recommendations</a> provided by DataSync Discovery.
     */

    public ResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * The information collected about your storage system's resources. A response can also include Amazon Web Services
     * storage service recommendations.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-findings.html">storage resource
     * information</a> collected by and <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     * >recommendations</a> provided by DataSync Discovery.
     * </p>
     * 
     * @param resourceDetails
     *        The information collected about your storage system's resources. A response can also include Amazon Web
     *        Services storage service recommendations.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-findings.html">storage
     *        resource information</a> collected by and <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/discovery-understand-recommendations.html"
     *        >recommendations</a> provided by DataSync Discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesResult withResourceDetails(ResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
        return this;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        The opaque string that indicates the position to begin the next list of results in the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @return The opaque string that indicates the position to begin the next list of results in the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        The opaque string that indicates the position to begin the next list of results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesResult withNextToken(String nextToken) {
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
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails()).append(",");
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

        if (obj instanceof DescribeStorageSystemResourcesResult == false)
            return false;
        DescribeStorageSystemResourcesResult other = (DescribeStorageSystemResourcesResult) obj;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
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

        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageSystemResourcesResult clone() {
        try {
            return (DescribeStorageSystemResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
