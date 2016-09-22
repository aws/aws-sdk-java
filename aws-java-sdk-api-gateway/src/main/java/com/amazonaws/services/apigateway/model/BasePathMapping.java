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

/**
 * <p>
 * Represents the base path that callers of the API must provide as part of the URL after the domain name.
 * </p>
 * <div class="remarks">A custom domain name plus a <code>BasePathMapping</code> specification identifies a deployed
 * <a>RestApi</a> in a given stage of the owner <a>Account</a>.</div> <div class="seeAlso"> <a
 * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html">Use Custom Domain
 * Names</a> </div>
 */
public class BasePathMapping implements Serializable, Cloneable {

    /**
     * <p>
     * The base path name that callers of the API must provide as part of the URL after the domain name.
     * </p>
     */
    private String basePath;
    /**
     * <p>
     * The name of the API.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the API's stage.
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

    public BasePathMapping withBasePath(String basePath) {
        setBasePath(basePath);
        return this;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @param restApiId
     *        The name of the API.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @return The name of the API.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @param restApiId
     *        The name of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasePathMapping withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the API's stage.
     * </p>
     * 
     * @param stage
     *        The name of the API's stage.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The name of the API's stage.
     * </p>
     * 
     * @return The name of the API's stage.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The name of the API's stage.
     * </p>
     * 
     * @param stage
     *        The name of the API's stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BasePathMapping withStage(String stage) {
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

        if (obj instanceof BasePathMapping == false)
            return false;
        BasePathMapping other = (BasePathMapping) obj;
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
    public BasePathMapping clone() {
        try {
            return (BasePathMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
