/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/GetTestGridSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTestGridSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the project that this session belongs to. See <a>CreateTestGridProject</a> and
     * <a>ListTestGridProjects</a>.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * An ID associated with this session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * An ARN that uniquely identifies a <a>TestGridSession</a>.
     * </p>
     */
    private String sessionArn;

    /**
     * <p>
     * The ARN for the project that this session belongs to. See <a>CreateTestGridProject</a> and
     * <a>ListTestGridProjects</a>.
     * </p>
     * 
     * @param projectArn
     *        The ARN for the project that this session belongs to. See <a>CreateTestGridProject</a> and
     *        <a>ListTestGridProjects</a>.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN for the project that this session belongs to. See <a>CreateTestGridProject</a> and
     * <a>ListTestGridProjects</a>.
     * </p>
     * 
     * @return The ARN for the project that this session belongs to. See <a>CreateTestGridProject</a> and
     *         <a>ListTestGridProjects</a>.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The ARN for the project that this session belongs to. See <a>CreateTestGridProject</a> and
     * <a>ListTestGridProjects</a>.
     * </p>
     * 
     * @param projectArn
     *        The ARN for the project that this session belongs to. See <a>CreateTestGridProject</a> and
     *        <a>ListTestGridProjects</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestGridSessionRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * An ID associated with this session.
     * </p>
     * 
     * @param sessionId
     *        An ID associated with this session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * An ID associated with this session.
     * </p>
     * 
     * @return An ID associated with this session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * An ID associated with this session.
     * </p>
     * 
     * @param sessionId
     *        An ID associated with this session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestGridSessionRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a <a>TestGridSession</a>.
     * </p>
     * 
     * @param sessionArn
     *        An ARN that uniquely identifies a <a>TestGridSession</a>.
     */

    public void setSessionArn(String sessionArn) {
        this.sessionArn = sessionArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a <a>TestGridSession</a>.
     * </p>
     * 
     * @return An ARN that uniquely identifies a <a>TestGridSession</a>.
     */

    public String getSessionArn() {
        return this.sessionArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a <a>TestGridSession</a>.
     * </p>
     * 
     * @param sessionArn
     *        An ARN that uniquely identifies a <a>TestGridSession</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTestGridSessionRequest withSessionArn(String sessionArn) {
        setSessionArn(sessionArn);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getSessionArn() != null)
            sb.append("SessionArn: ").append(getSessionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTestGridSessionRequest == false)
            return false;
        GetTestGridSessionRequest other = (GetTestGridSessionRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getSessionArn() == null ^ this.getSessionArn() == null)
            return false;
        if (other.getSessionArn() != null && other.getSessionArn().equals(this.getSessionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getSessionArn() == null) ? 0 : getSessionArn().hashCode());
        return hashCode;
    }

    @Override
    public GetTestGridSessionRequest clone() {
        return (GetTestGridSessionRequest) super.clone();
    }

}
