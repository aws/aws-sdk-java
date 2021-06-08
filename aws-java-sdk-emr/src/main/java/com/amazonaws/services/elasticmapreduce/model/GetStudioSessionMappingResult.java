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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/GetStudioSessionMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStudioSessionMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The session mapping details for the specified Amazon EMR Studio and identity, including session policy ARN and
     * creation time.
     * </p>
     */
    private SessionMappingDetail sessionMapping;

    /**
     * <p>
     * The session mapping details for the specified Amazon EMR Studio and identity, including session policy ARN and
     * creation time.
     * </p>
     * 
     * @param sessionMapping
     *        The session mapping details for the specified Amazon EMR Studio and identity, including session policy ARN
     *        and creation time.
     */

    public void setSessionMapping(SessionMappingDetail sessionMapping) {
        this.sessionMapping = sessionMapping;
    }

    /**
     * <p>
     * The session mapping details for the specified Amazon EMR Studio and identity, including session policy ARN and
     * creation time.
     * </p>
     * 
     * @return The session mapping details for the specified Amazon EMR Studio and identity, including session policy
     *         ARN and creation time.
     */

    public SessionMappingDetail getSessionMapping() {
        return this.sessionMapping;
    }

    /**
     * <p>
     * The session mapping details for the specified Amazon EMR Studio and identity, including session policy ARN and
     * creation time.
     * </p>
     * 
     * @param sessionMapping
     *        The session mapping details for the specified Amazon EMR Studio and identity, including session policy ARN
     *        and creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStudioSessionMappingResult withSessionMapping(SessionMappingDetail sessionMapping) {
        setSessionMapping(sessionMapping);
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
        if (getSessionMapping() != null)
            sb.append("SessionMapping: ").append(getSessionMapping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStudioSessionMappingResult == false)
            return false;
        GetStudioSessionMappingResult other = (GetStudioSessionMappingResult) obj;
        if (other.getSessionMapping() == null ^ this.getSessionMapping() == null)
            return false;
        if (other.getSessionMapping() != null && other.getSessionMapping().equals(this.getSessionMapping()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionMapping() == null) ? 0 : getSessionMapping().hashCode());
        return hashCode;
    }

    @Override
    public GetStudioSessionMappingResult clone() {
        try {
            return (GetStudioSessionMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
