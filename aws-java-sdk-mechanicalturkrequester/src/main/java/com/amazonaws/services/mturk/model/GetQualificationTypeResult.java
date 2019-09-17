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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetQualificationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQualificationTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned Qualification Type
     * </p>
     */
    private QualificationType qualificationType;

    /**
     * <p>
     * The returned Qualification Type
     * </p>
     * 
     * @param qualificationType
     *        The returned Qualification Type
     */

    public void setQualificationType(QualificationType qualificationType) {
        this.qualificationType = qualificationType;
    }

    /**
     * <p>
     * The returned Qualification Type
     * </p>
     * 
     * @return The returned Qualification Type
     */

    public QualificationType getQualificationType() {
        return this.qualificationType;
    }

    /**
     * <p>
     * The returned Qualification Type
     * </p>
     * 
     * @param qualificationType
     *        The returned Qualification Type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQualificationTypeResult withQualificationType(QualificationType qualificationType) {
        setQualificationType(qualificationType);
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
        if (getQualificationType() != null)
            sb.append("QualificationType: ").append(getQualificationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQualificationTypeResult == false)
            return false;
        GetQualificationTypeResult other = (GetQualificationTypeResult) obj;
        if (other.getQualificationType() == null ^ this.getQualificationType() == null)
            return false;
        if (other.getQualificationType() != null && other.getQualificationType().equals(this.getQualificationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationType() == null) ? 0 : getQualificationType().hashCode());
        return hashCode;
    }

    @Override
    public GetQualificationTypeResult clone() {
        try {
            return (GetQualificationTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
