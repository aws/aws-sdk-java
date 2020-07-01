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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * CVSS scores from the advisory related to the vulnerability.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Cvss" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cvss implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of CVSS for the CVSS score.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The base CVSS score.
     * </p>
     */
    private Double baseScore;
    /**
     * <p>
     * The base scoring vector for the CVSS score.
     * </p>
     */
    private String baseVector;

    /**
     * <p>
     * The version of CVSS for the CVSS score.
     * </p>
     * 
     * @param version
     *        The version of CVSS for the CVSS score.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of CVSS for the CVSS score.
     * </p>
     * 
     * @return The version of CVSS for the CVSS score.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of CVSS for the CVSS score.
     * </p>
     * 
     * @param version
     *        The version of CVSS for the CVSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cvss withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The base CVSS score.
     * </p>
     * 
     * @param baseScore
     *        The base CVSS score.
     */

    public void setBaseScore(Double baseScore) {
        this.baseScore = baseScore;
    }

    /**
     * <p>
     * The base CVSS score.
     * </p>
     * 
     * @return The base CVSS score.
     */

    public Double getBaseScore() {
        return this.baseScore;
    }

    /**
     * <p>
     * The base CVSS score.
     * </p>
     * 
     * @param baseScore
     *        The base CVSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cvss withBaseScore(Double baseScore) {
        setBaseScore(baseScore);
        return this;
    }

    /**
     * <p>
     * The base scoring vector for the CVSS score.
     * </p>
     * 
     * @param baseVector
     *        The base scoring vector for the CVSS score.
     */

    public void setBaseVector(String baseVector) {
        this.baseVector = baseVector;
    }

    /**
     * <p>
     * The base scoring vector for the CVSS score.
     * </p>
     * 
     * @return The base scoring vector for the CVSS score.
     */

    public String getBaseVector() {
        return this.baseVector;
    }

    /**
     * <p>
     * The base scoring vector for the CVSS score.
     * </p>
     * 
     * @param baseVector
     *        The base scoring vector for the CVSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cvss withBaseVector(String baseVector) {
        setBaseVector(baseVector);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getBaseScore() != null)
            sb.append("BaseScore: ").append(getBaseScore()).append(",");
        if (getBaseVector() != null)
            sb.append("BaseVector: ").append(getBaseVector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cvss == false)
            return false;
        Cvss other = (Cvss) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getBaseScore() == null ^ this.getBaseScore() == null)
            return false;
        if (other.getBaseScore() != null && other.getBaseScore().equals(this.getBaseScore()) == false)
            return false;
        if (other.getBaseVector() == null ^ this.getBaseVector() == null)
            return false;
        if (other.getBaseVector() != null && other.getBaseVector().equals(this.getBaseVector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getBaseScore() == null) ? 0 : getBaseScore().hashCode());
        hashCode = prime * hashCode + ((getBaseVector() == null) ? 0 : getBaseVector().hashCode());
        return hashCode;
    }

    @Override
    public Cvss clone() {
        try {
            return (Cvss) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.CvssMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
