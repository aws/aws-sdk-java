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
 * Requests Amazon API Gateway to create a new <a>BasePathMapping</a> resource.
 * </p>
 */
public class CreateBasePathMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to create.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name. This value must
     * be unique for all of the mappings across a single API. Leave this blank if you do not want callers to specify a
     * base path name after the domain name.
     * </p>
     */
    private String basePath;
    /**
     * <p>
     * The name of the API that you want to apply this mapping to.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want callers to
     * explicitly specify the stage name after any base path name.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to create.
     * </p>
     * 
     * @param domainName
     *        The domain name of the <a>BasePathMapping</a> resource to create.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to create.
     * </p>
     * 
     * @return The domain name of the <a>BasePathMapping</a> resource to create.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to create.
     * </p>
     * 
     * @param domainName
     *        The domain name of the <a>BasePathMapping</a> resource to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBasePathMappingRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name. This value must
     * be unique for all of the mappings across a single API. Leave this blank if you do not want callers to specify a
     * base path name after the domain name.
     * </p>
     * 
     * @param basePath
     *        The base path name that callers of the API must provide as part of the URL after the domain name. This
     *        value must be unique for all of the mappings across a single API. Leave this blank if you do not want
     *        callers to specify a base path name after the domain name.
     */

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name. This value must
     * be unique for all of the mappings across a single API. Leave this blank if you do not want callers to specify a
     * base path name after the domain name.
     * </p>
     * 
     * @return The base path name that callers of the API must provide as part of the URL after the domain name. This
     *         value must be unique for all of the mappings across a single API. Leave this blank if you do not want
     *         callers to specify a base path name after the domain name.
     */

    public String getBasePath() {
        return this.basePath;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name. This value must
     * be unique for all of the mappings across a single API. Leave this blank if you do not want callers to specify a
     * base path name after the domain name.
     * </p>
     * 
     * @param basePath
     *        The base path name that callers of the API must provide as part of the URL after the domain name. This
     *        value must be unique for all of the mappings across a single API. Leave this blank if you do not want
     *        callers to specify a base path name after the domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBasePathMappingRequest withBasePath(String basePath) {
        setBasePath(basePath);
        return this;
    }

    /**
     * <p>
     * The name of the API that you want to apply this mapping to.
     * </p>
     * 
     * @param restApiId
     *        The name of the API that you want to apply this mapping to.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The name of the API that you want to apply this mapping to.
     * </p>
     * 
     * @return The name of the API that you want to apply this mapping to.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The name of the API that you want to apply this mapping to.
     * </p>
     * 
     * @param restApiId
     *        The name of the API that you want to apply this mapping to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBasePathMappingRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want callers to
     * explicitly specify the stage name after any base path name.
     * </p>
     * 
     * @param stage
     *        The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want
     *        callers to explicitly specify the stage name after any base path name.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want callers to
     * explicitly specify the stage name after any base path name.
     * </p>
     * 
     * @return The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want
     *         callers to explicitly specify the stage name after any base path name.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want callers to
     * explicitly specify the stage name after any base path name.
     * </p>
     * 
     * @param stage
     *        The name of the API's stage that you want to use for this mapping. Leave this blank if you do not want
     *        callers to explicitly specify the stage name after any base path name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBasePathMappingRequest withStage(String stage) {
        setStage(stage);
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
            sb.append("BasePath: " + getBasePath() + ",");
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getStage() != null)
            sb.append("Stage: " + getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBasePathMappingRequest == false)
            return false;
        CreateBasePathMappingRequest other = (CreateBasePathMappingRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getBasePath() == null ^ this.getBasePath() == null)
            return false;
        if (other.getBasePath() != null && other.getBasePath().equals(this.getBasePath()) == false)
            return false;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public CreateBasePathMappingRequest clone() {
        return (CreateBasePathMappingRequest) super.clone();
    }
}
