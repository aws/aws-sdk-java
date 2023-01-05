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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/GetSubject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSubjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the subject.
     * </p>
     */
    private String subjectId;

    /**
     * <p>
     * The unique identifier of the subject.
     * </p>
     * 
     * @param subjectId
     *        The unique identifier of the subject.
     */

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <p>
     * The unique identifier of the subject.
     * </p>
     * 
     * @return The unique identifier of the subject.
     */

    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * <p>
     * The unique identifier of the subject.
     * </p>
     * 
     * @param subjectId
     *        The unique identifier of the subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSubjectRequest withSubjectId(String subjectId) {
        setSubjectId(subjectId);
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
        if (getSubjectId() != null)
            sb.append("SubjectId: ").append(getSubjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSubjectRequest == false)
            return false;
        GetSubjectRequest other = (GetSubjectRequest) obj;
        if (other.getSubjectId() == null ^ this.getSubjectId() == null)
            return false;
        if (other.getSubjectId() != null && other.getSubjectId().equals(this.getSubjectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        return hashCode;
    }

    @Override
    public GetSubjectRequest clone() {
        return (GetSubjectRequest) super.clone();
    }

}
