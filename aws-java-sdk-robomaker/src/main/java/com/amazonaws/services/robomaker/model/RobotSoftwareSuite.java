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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a robot software suite.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RobotSoftwareSuite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RobotSoftwareSuite implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the robot software suite.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the robot software suite.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name of the robot software suite.
     * </p>
     * 
     * @param name
     *        The name of the robot software suite.
     * @see RobotSoftwareSuiteType
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the robot software suite.
     * </p>
     * 
     * @return The name of the robot software suite.
     * @see RobotSoftwareSuiteType
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the robot software suite.
     * </p>
     * 
     * @param name
     *        The name of the robot software suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotSoftwareSuiteType
     */

    public RobotSoftwareSuite withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the robot software suite.
     * </p>
     * 
     * @param name
     *        The name of the robot software suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotSoftwareSuiteType
     */

    public RobotSoftwareSuite withName(RobotSoftwareSuiteType name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The version of the robot software suite.
     * </p>
     * 
     * @param version
     *        The version of the robot software suite.
     * @see RobotSoftwareSuiteVersionType
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the robot software suite.
     * </p>
     * 
     * @return The version of the robot software suite.
     * @see RobotSoftwareSuiteVersionType
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the robot software suite.
     * </p>
     * 
     * @param version
     *        The version of the robot software suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotSoftwareSuiteVersionType
     */

    public RobotSoftwareSuite withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The version of the robot software suite.
     * </p>
     * 
     * @param version
     *        The version of the robot software suite.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotSoftwareSuiteVersionType
     */

    public RobotSoftwareSuite withVersion(RobotSoftwareSuiteVersionType version) {
        this.version = version.toString();
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

        if (obj instanceof RobotSoftwareSuite == false)
            return false;
        RobotSoftwareSuite other = (RobotSoftwareSuite) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public RobotSoftwareSuite clone() {
        try {
            return (RobotSoftwareSuite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.RobotSoftwareSuiteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
