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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Toxic content analysis result for one string. For more information about toxicity detection, see <a
 * href="https://docs.aws.amazon.com/comprehend/latest/dg/toxicity-detection.html">Toxicity detection</a> in the
 * <i>Amazon Comprehend Developer Guide</i>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/ToxicContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ToxicContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the toxic content type.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Model confidence in the detected content type. Value range is zero to one, where one is highest confidence.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The name of the toxic content type.
     * </p>
     * 
     * @param name
     *        The name of the toxic content type.
     * @see ToxicContentType
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the toxic content type.
     * </p>
     * 
     * @return The name of the toxic content type.
     * @see ToxicContentType
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the toxic content type.
     * </p>
     * 
     * @param name
     *        The name of the toxic content type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ToxicContentType
     */

    public ToxicContent withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the toxic content type.
     * </p>
     * 
     * @param name
     *        The name of the toxic content type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ToxicContentType
     */

    public ToxicContent withName(ToxicContentType name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Model confidence in the detected content type. Value range is zero to one, where one is highest confidence.
     * </p>
     * 
     * @param score
     *        Model confidence in the detected content type. Value range is zero to one, where one is highest
     *        confidence.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * Model confidence in the detected content type. Value range is zero to one, where one is highest confidence.
     * </p>
     * 
     * @return Model confidence in the detected content type. Value range is zero to one, where one is highest
     *         confidence.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * Model confidence in the detected content type. Value range is zero to one, where one is highest confidence.
     * </p>
     * 
     * @param score
     *        Model confidence in the detected content type. Value range is zero to one, where one is highest
     *        confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ToxicContent withScore(Float score) {
        setScore(score);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToxicContent == false)
            return false;
        ToxicContent other = (ToxicContent) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public ToxicContent clone() {
        try {
            return (ToxicContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.ToxicContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
