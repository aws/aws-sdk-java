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
 * A reference to a unique stage identified in the format <code>{restApiId}/{stage}</code>.
 * </p>
 */
public class StageKey implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The stage name in the <a>RestApi</a> that the stage key references.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param restApiId
     *        A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     * 
     * @return A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * </p>
     * 
     * @param restApiId
     *        A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageKey withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The stage name in the <a>RestApi</a> that the stage key references.
     * </p>
     * 
     * @param stageName
     *        The stage name in the <a>RestApi</a> that the stage key references.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The stage name in the <a>RestApi</a> that the stage key references.
     * </p>
     * 
     * @return The stage name in the <a>RestApi</a> that the stage key references.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The stage name in the <a>RestApi</a> that the stage key references.
     * </p>
     * 
     * @param stageName
     *        The stage name in the <a>RestApi</a> that the stage key references.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageKey withStageName(String stageName) {
        setStageName(stageName);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StageKey == false)
            return false;
        StageKey other = (StageKey) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public StageKey clone() {
        try {
            return (StageKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
