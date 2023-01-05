/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RunStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunStatementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Session Id of the statement to be run.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The statement code to be run.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The origin of the request.
     * </p>
     */
    private String requestOrigin;

    /**
     * <p>
     * The Session Id of the statement to be run.
     * </p>
     * 
     * @param sessionId
     *        The Session Id of the statement to be run.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The Session Id of the statement to be run.
     * </p>
     * 
     * @return The Session Id of the statement to be run.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The Session Id of the statement to be run.
     * </p>
     * 
     * @param sessionId
     *        The Session Id of the statement to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunStatementRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The statement code to be run.
     * </p>
     * 
     * @param code
     *        The statement code to be run.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The statement code to be run.
     * </p>
     * 
     * @return The statement code to be run.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The statement code to be run.
     * </p>
     * 
     * @param code
     *        The statement code to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunStatementRequest withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request.
     */

    public void setRequestOrigin(String requestOrigin) {
        this.requestOrigin = requestOrigin;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @return The origin of the request.
     */

    public String getRequestOrigin() {
        return this.requestOrigin;
    }

    /**
     * <p>
     * The origin of the request.
     * </p>
     * 
     * @param requestOrigin
     *        The origin of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunStatementRequest withRequestOrigin(String requestOrigin) {
        setRequestOrigin(requestOrigin);
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
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getRequestOrigin() != null)
            sb.append("RequestOrigin: ").append(getRequestOrigin());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunStatementRequest == false)
            return false;
        RunStatementRequest other = (RunStatementRequest) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getRequestOrigin() == null ^ this.getRequestOrigin() == null)
            return false;
        if (other.getRequestOrigin() != null && other.getRequestOrigin().equals(this.getRequestOrigin()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getRequestOrigin() == null) ? 0 : getRequestOrigin().hashCode());
        return hashCode;
    }

    @Override
    public RunStatementRequest clone() {
        return (RunStatementRequest) super.clone();
    }

}
