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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the base path that callers of the API must provide as part of the URL after the domain name.
 * </p>
 * <div class="remarks">A custom domain name plus a <code>BasePathMapping</code> specification identifies a deployed
 * <a>RestApi</a> in a given stage of the owner <a>Account</a>.</div> <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html">Use Custom Domain
 * Names</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBasePathMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name.
     * </p>
     */
    private String basePath;
    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the associated stage.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name.
     * </p>
     * 
     * @param basePath
     *        The base path name that callers of the API must provide as part of the URL after the domain name.
     */

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name.
     * </p>
     * 
     * @return The base path name that callers of the API must provide as part of the URL after the domain name.
     */

    public String getBasePath() {
        return this.basePath;
    }

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name.
     * </p>
     * 
     * @param basePath
     *        The base path name that callers of the API must provide as part of the URL after the domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBasePathMappingResult withBasePath(String basePath) {
        setBasePath(basePath);
        return this;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBasePathMappingResult withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the associated stage.
     * </p>
     * 
     * @param stage
     *        The name of the associated stage.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The name of the associated stage.
     * </p>
     * 
     * @return The name of the associated stage.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The name of the associated stage.
     * </p>
     * 
     * @param stage
     *        The name of the associated stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBasePathMappingResult withStage(String stage) {
        setStage(stage);
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
        if (getBasePath() != null)
            sb.append("BasePath: ").append(getBasePath()).append(",");
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBasePathMappingResult == false)
            return false;
        GetBasePathMappingResult other = (GetBasePathMappingResult) obj;
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

        hashCode = prime * hashCode + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public GetBasePathMappingResult clone() {
        try {
            return (GetBasePathMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
