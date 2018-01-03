/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetLoggerDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLoggerDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** logger definition Id */
    private String loggerDefinitionId;
    /** logger definition version Id */
    private String loggerDefinitionVersionId;

    /**
     * logger definition Id
     * 
     * @param loggerDefinitionId
     *        logger definition Id
     */

    public void setLoggerDefinitionId(String loggerDefinitionId) {
        this.loggerDefinitionId = loggerDefinitionId;
    }

    /**
     * logger definition Id
     * 
     * @return logger definition Id
     */

    public String getLoggerDefinitionId() {
        return this.loggerDefinitionId;
    }

    /**
     * logger definition Id
     * 
     * @param loggerDefinitionId
     *        logger definition Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionVersionRequest withLoggerDefinitionId(String loggerDefinitionId) {
        setLoggerDefinitionId(loggerDefinitionId);
        return this;
    }

    /**
     * logger definition version Id
     * 
     * @param loggerDefinitionVersionId
     *        logger definition version Id
     */

    public void setLoggerDefinitionVersionId(String loggerDefinitionVersionId) {
        this.loggerDefinitionVersionId = loggerDefinitionVersionId;
    }

    /**
     * logger definition version Id
     * 
     * @return logger definition version Id
     */

    public String getLoggerDefinitionVersionId() {
        return this.loggerDefinitionVersionId;
    }

    /**
     * logger definition version Id
     * 
     * @param loggerDefinitionVersionId
     *        logger definition version Id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLoggerDefinitionVersionRequest withLoggerDefinitionVersionId(String loggerDefinitionVersionId) {
        setLoggerDefinitionVersionId(loggerDefinitionVersionId);
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
        if (getLoggerDefinitionId() != null)
            sb.append("LoggerDefinitionId: ").append(getLoggerDefinitionId()).append(",");
        if (getLoggerDefinitionVersionId() != null)
            sb.append("LoggerDefinitionVersionId: ").append(getLoggerDefinitionVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoggerDefinitionVersionRequest == false)
            return false;
        GetLoggerDefinitionVersionRequest other = (GetLoggerDefinitionVersionRequest) obj;
        if (other.getLoggerDefinitionId() == null ^ this.getLoggerDefinitionId() == null)
            return false;
        if (other.getLoggerDefinitionId() != null && other.getLoggerDefinitionId().equals(this.getLoggerDefinitionId()) == false)
            return false;
        if (other.getLoggerDefinitionVersionId() == null ^ this.getLoggerDefinitionVersionId() == null)
            return false;
        if (other.getLoggerDefinitionVersionId() != null && other.getLoggerDefinitionVersionId().equals(this.getLoggerDefinitionVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoggerDefinitionId() == null) ? 0 : getLoggerDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getLoggerDefinitionVersionId() == null) ? 0 : getLoggerDefinitionVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetLoggerDefinitionVersionRequest clone() {
        return (GetLoggerDefinitionVersionRequest) super.clone();
    }

}
