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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoggerDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the logger definition. */
    private String loggerDefinitionId;

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

    public GetLoggerDefinitionRequest withLoggerDefinitionId(String loggerDefinitionId) {
        setLoggerDefinitionId(loggerDefinitionId);
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
        if (getLoggerDefinitionId() != null)
            sb.append("LoggerDefinitionId: ").append(getLoggerDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoggerDefinitionRequest == false)
            return false;
        GetLoggerDefinitionRequest other = (GetLoggerDefinitionRequest) obj;
        if (other.getLoggerDefinitionId() == null ^ this.getLoggerDefinitionId() == null)
            return false;
        if (other.getLoggerDefinitionId() != null && other.getLoggerDefinitionId().equals(this.getLoggerDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggerDefinitionId() == null) ? 0 : getLoggerDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public GetLoggerDefinitionRequest clone() {
        return (GetLoggerDefinitionRequest) super.clone();
    }

}
