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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The configuration settings for a specific serverless cache.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ServerlessCacheConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerlessCacheConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of a serverless cache.
     * </p>
     */
    private String serverlessCacheName;
    /**
     * <p>
     * The engine that the serverless cache is configured with.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine version number that the serverless cache is configured with.
     * </p>
     */
    private String majorEngineVersion;

    /**
     * <p>
     * The identifier of a serverless cache.
     * </p>
     * 
     * @param serverlessCacheName
     *        The identifier of a serverless cache.
     */

    public void setServerlessCacheName(String serverlessCacheName) {
        this.serverlessCacheName = serverlessCacheName;
    }

    /**
     * <p>
     * The identifier of a serverless cache.
     * </p>
     * 
     * @return The identifier of a serverless cache.
     */

    public String getServerlessCacheName() {
        return this.serverlessCacheName;
    }

    /**
     * <p>
     * The identifier of a serverless cache.
     * </p>
     * 
     * @param serverlessCacheName
     *        The identifier of a serverless cache.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheConfiguration withServerlessCacheName(String serverlessCacheName) {
        setServerlessCacheName(serverlessCacheName);
        return this;
    }

    /**
     * <p>
     * The engine that the serverless cache is configured with.
     * </p>
     * 
     * @param engine
     *        The engine that the serverless cache is configured with.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine that the serverless cache is configured with.
     * </p>
     * 
     * @return The engine that the serverless cache is configured with.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The engine that the serverless cache is configured with.
     * </p>
     * 
     * @param engine
     *        The engine that the serverless cache is configured with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheConfiguration withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine version number that the serverless cache is configured with.
     * </p>
     * 
     * @param majorEngineVersion
     *        The engine version number that the serverless cache is configured with.
     */

    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }

    /**
     * <p>
     * The engine version number that the serverless cache is configured with.
     * </p>
     * 
     * @return The engine version number that the serverless cache is configured with.
     */

    public String getMajorEngineVersion() {
        return this.majorEngineVersion;
    }

    /**
     * <p>
     * The engine version number that the serverless cache is configured with.
     * </p>
     * 
     * @param majorEngineVersion
     *        The engine version number that the serverless cache is configured with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessCacheConfiguration withMajorEngineVersion(String majorEngineVersion) {
        setMajorEngineVersion(majorEngineVersion);
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
        if (getServerlessCacheName() != null)
            sb.append("ServerlessCacheName: ").append(getServerlessCacheName()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getMajorEngineVersion() != null)
            sb.append("MajorEngineVersion: ").append(getMajorEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerlessCacheConfiguration == false)
            return false;
        ServerlessCacheConfiguration other = (ServerlessCacheConfiguration) obj;
        if (other.getServerlessCacheName() == null ^ this.getServerlessCacheName() == null)
            return false;
        if (other.getServerlessCacheName() != null && other.getServerlessCacheName().equals(this.getServerlessCacheName()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null)
            return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerlessCacheName() == null) ? 0 : getServerlessCacheName().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public ServerlessCacheConfiguration clone() {
        try {
            return (ServerlessCacheConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
