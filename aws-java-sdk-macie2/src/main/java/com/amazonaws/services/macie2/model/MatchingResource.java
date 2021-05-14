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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides statistical data and other information about an AWS resource that Amazon Macie monitors and analyzes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/MatchingResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchingResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The details of an S3 bucket that Amazon Macie monitors and analyzes.
     * </p>
     */
    private MatchingBucket matchingBucket;

    /**
     * <p>
     * The details of an S3 bucket that Amazon Macie monitors and analyzes.
     * </p>
     * 
     * @param matchingBucket
     *        The details of an S3 bucket that Amazon Macie monitors and analyzes.
     */

    public void setMatchingBucket(MatchingBucket matchingBucket) {
        this.matchingBucket = matchingBucket;
    }

    /**
     * <p>
     * The details of an S3 bucket that Amazon Macie monitors and analyzes.
     * </p>
     * 
     * @return The details of an S3 bucket that Amazon Macie monitors and analyzes.
     */

    public MatchingBucket getMatchingBucket() {
        return this.matchingBucket;
    }

    /**
     * <p>
     * The details of an S3 bucket that Amazon Macie monitors and analyzes.
     * </p>
     * 
     * @param matchingBucket
     *        The details of an S3 bucket that Amazon Macie monitors and analyzes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MatchingResource withMatchingBucket(MatchingBucket matchingBucket) {
        setMatchingBucket(matchingBucket);
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
        if (getMatchingBucket() != null)
            sb.append("MatchingBucket: ").append(getMatchingBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MatchingResource == false)
            return false;
        MatchingResource other = (MatchingResource) obj;
        if (other.getMatchingBucket() == null ^ this.getMatchingBucket() == null)
            return false;
        if (other.getMatchingBucket() != null && other.getMatchingBucket().equals(this.getMatchingBucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchingBucket() == null) ? 0 : getMatchingBucket().hashCode());
        return hashCode;
    }

    @Override
    public MatchingResource clone() {
        try {
            return (MatchingResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.MatchingResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
