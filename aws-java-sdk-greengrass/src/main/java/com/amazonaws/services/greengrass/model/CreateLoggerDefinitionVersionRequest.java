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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/CreateLoggerDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoggerDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A client token used to correlate requests and responses. */
    private String amznClientToken;
    /** The ID of the logger definition. */
    private String loggerDefinitionId;
    /** A list of loggers. */
    private java.util.List<Logger> loggers;

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @return A client token used to correlate requests and responses.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoggerDefinitionVersionRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * The ID of the logger definition.
     * 
     * @param loggerDefinitionId
     *        The ID of the logger definition.
     */

    public void setLoggerDefinitionId(String loggerDefinitionId) {
        this.loggerDefinitionId = loggerDefinitionId;
    }

    /**
     * The ID of the logger definition.
     * 
     * @return The ID of the logger definition.
     */

    public String getLoggerDefinitionId() {
        return this.loggerDefinitionId;
    }

    /**
     * The ID of the logger definition.
     * 
     * @param loggerDefinitionId
     *        The ID of the logger definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoggerDefinitionVersionRequest withLoggerDefinitionId(String loggerDefinitionId) {
        setLoggerDefinitionId(loggerDefinitionId);
        return this;
    }

    /**
     * A list of loggers.
     * 
     * @return A list of loggers.
     */

    public java.util.List<Logger> getLoggers() {
        return loggers;
    }

    /**
     * A list of loggers.
     * 
     * @param loggers
     *        A list of loggers.
     */

    public void setLoggers(java.util.Collection<Logger> loggers) {
        if (loggers == null) {
            this.loggers = null;
            return;
        }

        this.loggers = new java.util.ArrayList<Logger>(loggers);
    }

    /**
     * A list of loggers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoggers(java.util.Collection)} or {@link #withLoggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param loggers
     *        A list of loggers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoggerDefinitionVersionRequest withLoggers(Logger... loggers) {
        if (this.loggers == null) {
            setLoggers(new java.util.ArrayList<Logger>(loggers.length));
        }
        for (Logger ele : loggers) {
            this.loggers.add(ele);
        }
        return this;
    }

    /**
     * A list of loggers.
     * 
     * @param loggers
     *        A list of loggers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoggerDefinitionVersionRequest withLoggers(java.util.Collection<Logger> loggers) {
        setLoggers(loggers);
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getLoggerDefinitionId() != null)
            sb.append("LoggerDefinitionId: ").append(getLoggerDefinitionId()).append(",");
        if (getLoggers() != null)
            sb.append("Loggers: ").append(getLoggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLoggerDefinitionVersionRequest == false)
            return false;
        CreateLoggerDefinitionVersionRequest other = (CreateLoggerDefinitionVersionRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getLoggerDefinitionId() == null ^ this.getLoggerDefinitionId() == null)
            return false;
        if (other.getLoggerDefinitionId() != null && other.getLoggerDefinitionId().equals(this.getLoggerDefinitionId()) == false)
            return false;
        if (other.getLoggers() == null ^ this.getLoggers() == null)
            return false;
        if (other.getLoggers() != null && other.getLoggers().equals(this.getLoggers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getLoggerDefinitionId() == null) ? 0 : getLoggerDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getLoggers() == null) ? 0 : getLoggers().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoggerDefinitionVersionRequest clone() {
        return (CreateLoggerDefinitionVersionRequest) super.clone();
    }

}
