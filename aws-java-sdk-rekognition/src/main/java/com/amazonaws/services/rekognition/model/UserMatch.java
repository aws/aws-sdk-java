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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides UserID metadata along with the confidence in the match of this UserID with the input face.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the UserID metadata.
     * </p>
     */
    private Float similarity;
    /**
     * <p>
     * Confidence in the match of this UserID with the input face.
     * </p>
     */
    private MatchedUser user;

    /**
     * <p>
     * Describes the UserID metadata.
     * </p>
     * 
     * @param similarity
     *        Describes the UserID metadata.
     */

    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

    /**
     * <p>
     * Describes the UserID metadata.
     * </p>
     * 
     * @return Describes the UserID metadata.
     */

    public Float getSimilarity() {
        return this.similarity;
    }

    /**
     * <p>
     * Describes the UserID metadata.
     * </p>
     * 
     * @param similarity
     *        Describes the UserID metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserMatch withSimilarity(Float similarity) {
        setSimilarity(similarity);
        return this;
    }

    /**
     * <p>
     * Confidence in the match of this UserID with the input face.
     * </p>
     * 
     * @param user
     *        Confidence in the match of this UserID with the input face.
     */

    public void setUser(MatchedUser user) {
        this.user = user;
    }

    /**
     * <p>
     * Confidence in the match of this UserID with the input face.
     * </p>
     * 
     * @return Confidence in the match of this UserID with the input face.
     */

    public MatchedUser getUser() {
        return this.user;
    }

    /**
     * <p>
     * Confidence in the match of this UserID with the input face.
     * </p>
     * 
     * @param user
     *        Confidence in the match of this UserID with the input face.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserMatch withUser(MatchedUser user) {
        setUser(user);
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
        if (getSimilarity() != null)
            sb.append("Similarity: ").append(getSimilarity()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserMatch == false)
            return false;
        UserMatch other = (UserMatch) obj;
        if (other.getSimilarity() == null ^ this.getSimilarity() == null)
            return false;
        if (other.getSimilarity() != null && other.getSimilarity().equals(this.getSimilarity()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimilarity() == null) ? 0 : getSimilarity().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public UserMatch clone() {
        try {
            return (UserMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.UserMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
