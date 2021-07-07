/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains logging options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/LoggingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IoT SiteWise logging verbosity level.
     * </p>
     */
    private String level;

    /**
     * <p>
     * The IoT SiteWise logging verbosity level.
     * </p>
     * 
     * @param level
     *        The IoT SiteWise logging verbosity level.
     * @see LoggingLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The IoT SiteWise logging verbosity level.
     * </p>
     * 
     * @return The IoT SiteWise logging verbosity level.
     * @see LoggingLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The IoT SiteWise logging verbosity level.
     * </p>
     * 
     * @param level
     *        The IoT SiteWise logging verbosity level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public LoggingOptions withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * The IoT SiteWise logging verbosity level.
     * </p>
     * 
     * @param level
     *        The IoT SiteWise logging verbosity level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public LoggingOptions withLevel(LoggingLevel level) {
        this.level = level.toString();
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
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingOptions == false)
            return false;
        LoggingOptions other = (LoggingOptions) obj;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return hashCode;
    }

    @Override
    public LoggingOptions clone() {
        try {
            return (LoggingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.LoggingOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
