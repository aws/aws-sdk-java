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
 * Describes the properties of an environment tier
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/EnvironmentTier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentTier implements Serializable, Cloneable {

    /**
     * <p>
     * The name of this environment tier.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <i>Web server tier</i> – <code>WebServer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>Worker tier</i> – <code>Worker</code>
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The type of this environment tier.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <i>Web server tier</i> – <code>Standard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>Worker tier</i> – <code>SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest
     * compatible worker tier version.
     * </p>
     * <note>
     * <p>
     * This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it
     * unspecified.
     * </p>
     * </note>
     */
    private String version;

    /**
     * <p>
     * The name of this environment tier.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <i>Web server tier</i> – <code>WebServer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>Worker tier</i> – <code>Worker</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of this environment tier.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <i>Web server tier</i> – <code>WebServer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <i>Worker tier</i> – <code>Worker</code>
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this environment tier.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <i>Web server tier</i> – <code>WebServer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>Worker tier</i> – <code>Worker</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of this environment tier.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <i>Web server tier</i> – <code>WebServer</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <i>Worker tier</i> – <code>Worker</code>
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this environment tier.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <i>Web server tier</i> – <code>WebServer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>Worker tier</i> – <code>Worker</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of this environment tier.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <i>Web server tier</i> – <code>WebServer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <i>Worker tier</i> – <code>Worker</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTier withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of this environment tier.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <i>Web server tier</i> – <code>Standard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>Worker tier</i> – <code>SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of this environment tier.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <i>Web server tier</i> – <code>Standard</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <i>Worker tier</i> – <code>SQS/HTTP</code>
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of this environment tier.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <i>Web server tier</i> – <code>Standard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>Worker tier</i> – <code>SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of this environment tier.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <i>Web server tier</i> – <code>Standard</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <i>Worker tier</i> – <code>SQS/HTTP</code>
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of this environment tier.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <i>Web server tier</i> – <code>Standard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>Worker tier</i> – <code>SQS/HTTP</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of this environment tier.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <i>Web server tier</i> – <code>Standard</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <i>Worker tier</i> – <code>SQS/HTTP</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTier withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest
     * compatible worker tier version.
     * </p>
     * <note>
     * <p>
     * This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it
     * unspecified.
     * </p>
     * </note>
     * 
     * @param version
     *        The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest
     *        compatible worker tier version.</p> <note>
     *        <p>
     *        This member is deprecated. Any specific version that you set may become out of date. We recommend leaving
     *        it unspecified.
     *        </p>
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest
     * compatible worker tier version.
     * </p>
     * <note>
     * <p>
     * This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it
     * unspecified.
     * </p>
     * </note>
     * 
     * @return The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest
     *         compatible worker tier version.</p> <note>
     *         <p>
     *         This member is deprecated. Any specific version that you set may become out of date. We recommend leaving
     *         it unspecified.
     *         </p>
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest
     * compatible worker tier version.
     * </p>
     * <note>
     * <p>
     * This member is deprecated. Any specific version that you set may become out of date. We recommend leaving it
     * unspecified.
     * </p>
     * </note>
     * 
     * @param version
     *        The version of this environment tier. When you don't set a value to it, Elastic Beanstalk uses the latest
     *        compatible worker tier version.</p> <note>
     *        <p>
     *        This member is deprecated. Any specific version that you set may become out of date. We recommend leaving
     *        it unspecified.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentTier withVersion(String version) {
        setVersion(version);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentTier == false)
            return false;
        EnvironmentTier other = (EnvironmentTier) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentTier clone() {
        try {
            return (EnvironmentTier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
