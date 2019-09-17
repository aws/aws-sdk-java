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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A link to another environment, defined in the environment's manifest. Links provide connection information in system
 * properties that can be used to connect to another environment in the same group. See <a
 * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
 * (env.yaml)</a> for details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/EnvironmentLink" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentLink implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the link.
     * </p>
     */
    private String linkName;
    /**
     * <p>
     * The name of the linked environment (the dependency).
     * </p>
     */
    private String environmentName;

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @param linkName
     *        The name of the link.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @return The name of the link.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The name of the link.
     * </p>
     * 
     * @param linkName
     *        The name of the link.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentLink withLinkName(String linkName) {
        setLinkName(linkName);
        return this;
    }

    /**
     * <p>
     * The name of the linked environment (the dependency).
     * </p>
     * 
     * @param environmentName
     *        The name of the linked environment (the dependency).
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the linked environment (the dependency).
     * </p>
     * 
     * @return The name of the linked environment (the dependency).
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the linked environment (the dependency).
     * </p>
     * 
     * @param environmentName
     *        The name of the linked environment (the dependency).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentLink withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
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
        if (getLinkName() != null)
            sb.append("LinkName: ").append(getLinkName()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentLink == false)
            return false;
        EnvironmentLink other = (EnvironmentLink) obj;
        if (other.getLinkName() == null ^ this.getLinkName() == null)
            return false;
        if (other.getLinkName() != null && other.getLinkName().equals(this.getLinkName()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentLink clone() {
        try {
            return (EnvironmentLink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
