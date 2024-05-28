/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFaceLivenessSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique 128-bit UUID identifying a Face Liveness session. A new sessionID must be used for every Face Liveness
     * check. If a given sessionID is used for subsequent Face Liveness checks, the checks will fail. Additionally, a
     * SessionId expires 3 minutes after it's sent, making all Liveness data associated with the session (e.g.,
     * sessionID, reference image, audit images, etc.) unavailable.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * A unique 128-bit UUID identifying a Face Liveness session. A new sessionID must be used for every Face Liveness
     * check. If a given sessionID is used for subsequent Face Liveness checks, the checks will fail. Additionally, a
     * SessionId expires 3 minutes after it's sent, making all Liveness data associated with the session (e.g.,
     * sessionID, reference image, audit images, etc.) unavailable.
     * </p>
     * 
     * @param sessionId
     *        A unique 128-bit UUID identifying a Face Liveness session. A new sessionID must be used for every Face
     *        Liveness check. If a given sessionID is used for subsequent Face Liveness checks, the checks will fail.
     *        Additionally, a SessionId expires 3 minutes after it's sent, making all Liveness data associated with the
     *        session (e.g., sessionID, reference image, audit images, etc.) unavailable.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A unique 128-bit UUID identifying a Face Liveness session. A new sessionID must be used for every Face Liveness
     * check. If a given sessionID is used for subsequent Face Liveness checks, the checks will fail. Additionally, a
     * SessionId expires 3 minutes after it's sent, making all Liveness data associated with the session (e.g.,
     * sessionID, reference image, audit images, etc.) unavailable.
     * </p>
     * 
     * @return A unique 128-bit UUID identifying a Face Liveness session. A new sessionID must be used for every Face
     *         Liveness check. If a given sessionID is used for subsequent Face Liveness checks, the checks will fail.
     *         Additionally, a SessionId expires 3 minutes after it's sent, making all Liveness data associated with the
     *         session (e.g., sessionID, reference image, audit images, etc.) unavailable.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * A unique 128-bit UUID identifying a Face Liveness session. A new sessionID must be used for every Face Liveness
     * check. If a given sessionID is used for subsequent Face Liveness checks, the checks will fail. Additionally, a
     * SessionId expires 3 minutes after it's sent, making all Liveness data associated with the session (e.g.,
     * sessionID, reference image, audit images, etc.) unavailable.
     * </p>
     * 
     * @param sessionId
     *        A unique 128-bit UUID identifying a Face Liveness session. A new sessionID must be used for every Face
     *        Liveness check. If a given sessionID is used for subsequent Face Liveness checks, the checks will fail.
     *        Additionally, a SessionId expires 3 minutes after it's sent, making all Liveness data associated with the
     *        session (e.g., sessionID, reference image, audit images, etc.) unavailable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaceLivenessSessionResult withSessionId(String sessionId) {
        setSessionId(sessionId);
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
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFaceLivenessSessionResult == false)
            return false;
        CreateFaceLivenessSessionResult other = (CreateFaceLivenessSessionResult) obj;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateFaceLivenessSessionResult clone() {
        try {
            return (CreateFaceLivenessSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
