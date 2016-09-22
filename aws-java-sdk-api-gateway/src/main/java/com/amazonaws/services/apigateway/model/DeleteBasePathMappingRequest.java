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
 * A request to delete the <a>BasePathMapping</a> resource.
 * </p>
 */
public class DeleteBasePathMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to delete.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The base path name of the <a>BasePathMapping</a> resource to delete.
     * </p>
     */
    private String basePath;

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to delete.
     * </p>
     * 
     * @param domainName
     *        The domain name of the <a>BasePathMapping</a> resource to delete.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to delete.
     * </p>
     * 
     * @return The domain name of the <a>BasePathMapping</a> resource to delete.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to delete.
     * </p>
     * 
     * @param domainName
     *        The domain name of the <a>BasePathMapping</a> resource to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBasePathMappingRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The base path name of the <a>BasePathMapping</a> resource to delete.
     * </p>
     * 
     * @param basePath
     *        The base path name of the <a>BasePathMapping</a> resource to delete.
     */

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * The base path name of the <a>BasePathMapping</a> resource to delete.
     * </p>
     * 
     * @return The base path name of the <a>BasePathMapping</a> resource to delete.
     */

    public String getBasePath() {
        return this.basePath;
    }

    /**
     * <p>
     * The base path name of the <a>BasePathMapping</a> resource to delete.
     * </p>
     * 
     * @param basePath
     *        The base path name of the <a>BasePathMapping</a> resource to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBasePathMappingRequest withBasePath(String basePath) {
        setBasePath(basePath);
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getBasePath() != null)
            sb.append("BasePath: " + getBasePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBasePathMappingRequest == false)
            return false;
        DeleteBasePathMappingRequest other = (DeleteBasePathMappingRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getBasePath() == null ^ this.getBasePath() == null)
            return false;
        if (other.getBasePath() != null && other.getBasePath().equals(this.getBasePath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBasePathMappingRequest clone() {
        return (DeleteBasePathMappingRequest) super.clone();
    }
}
