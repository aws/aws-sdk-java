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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result structure for the generate access logs request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/GenerateAccessLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateAccessLogsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pre-signed URL for the requested access logs.
     * </p>
     */
    private String logUrl;

    /**
     * <p>
     * The pre-signed URL for the requested access logs.
     * </p>
     * 
     * @param logUrl
     *        The pre-signed URL for the requested access logs.
     */

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    /**
     * <p>
     * The pre-signed URL for the requested access logs.
     * </p>
     * 
     * @return The pre-signed URL for the requested access logs.
     */

    public String getLogUrl() {
        return this.logUrl;
    }

    /**
     * <p>
     * The pre-signed URL for the requested access logs.
     * </p>
     * 
     * @param logUrl
     *        The pre-signed URL for the requested access logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateAccessLogsResult withLogUrl(String logUrl) {
        setLogUrl(logUrl);
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
        if (getLogUrl() != null)
            sb.append("LogUrl: ").append(getLogUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateAccessLogsResult == false)
            return false;
        GenerateAccessLogsResult other = (GenerateAccessLogsResult) obj;
        if (other.getLogUrl() == null ^ this.getLogUrl() == null)
            return false;
        if (other.getLogUrl() != null && other.getLogUrl().equals(this.getLogUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        return hashCode;
    }

    @Override
    public GenerateAccessLogsResult clone() {
        try {
            return (GenerateAccessLogsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
